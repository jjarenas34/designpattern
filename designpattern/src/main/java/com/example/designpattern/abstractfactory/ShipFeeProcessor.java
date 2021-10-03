package com.example.designpattern.abstractfactory;

public abstract class ShipFeeProcessor {
    abstract void calculateShipFee(Order order);
}
abstract class TaxProcessor {
    abstract void calculateTaxes(Order order);
}
class EuropeShipFeeProcessor extends ShipFeeProcessor {
    public void calculateShipFee(Order order) {
        // insert here Europe specific ship fee calculation
    }
}
class CanadaShipFeeProcessor extends ShipFeeProcessor {
    public void calculateShipFee(Order order) {
        // insert here Canada specific ship fee calculation
    }
}
class EuropeTaxProcessor extends TaxProcessor {
    public void calculateTaxes(Order order) {
        // insert here Europe specific taxt calculation
    }
}
class CanadaTaxProcessor extends TaxProcessor {
    public void calculateTaxes(Order order) {
        // insert here Canada specific taxt calculation
    }
}
