package com.eliasnogueira.paymentservice.unit;

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

}
