package com.eliasnogueira.paymentservice.unit;

import com.eliasnogueira.paymentservice.exceptions.PaymentLimitException;
import com.eliasnogueira.paymentservice.validator.PaymentLimitValidator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

public class PaymentLimitValidatorTest {

  @Test
  void shouldBeWithinLimit(){

    BigDecimal amount = new BigDecimal("500.00");

    boolean isWithinLimit = PaymentLimitValidator.isWithinLimit(amount);

    assertThat(isWithinLimit).isTrue();

  }

  @Test
  void shouldNotAcceptNullAmount(){
    boolean isWithinLimit = PaymentLimitValidator.isWithinLimit(null);
    assertThat(isWithinLimit).isFalse();
  }

  @Test
  void shouldNotAcceptAmountGreaterThanLimit(){
    boolean isWithinLimit = PaymentLimitValidator.isWithinLimit(new BigDecimal("3000"));

    assertThat(isWithinLimit).isFalse();
  }

  @Test
  void shouldNotAcceptZeroAmount(){

    assertThatThrownBy(() -> PaymentLimitValidator.isWithinLimit(BigDecimal.ZERO))
            .isInstanceOf(PaymentLimitException.class)
            .hasMessage("Amount must be greater than zero");

  }

  @Test
  void shouldNotAcceptNegativeAmount(){

    assertThatThrownBy(() -> PaymentLimitValidator.isWithinLimit(new BigDecimal("-5.00")))
            .isInstanceOf(PaymentLimitException.class)
            .hasMessage("Amount must be greater than zero");

  }



}
