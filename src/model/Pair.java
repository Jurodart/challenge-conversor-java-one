package model;

public class Pair {
    String base_code;
    String target_code;
    Double conversion_rate;
    Double conversion_result;

    public String getBase_code() {
        return base_code;
    }
    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }
    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public Double getConversion_rate() {
        return conversion_rate;
    }
    public void setConversion_rate(Double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public Double getConversion_result() {
        return conversion_result;
    }
    public void setConversion_result(Double conversion_result) {
        this.conversion_result = conversion_result;
    }

    @Override
    public String toString() {
        return
                "Converte de: " + base_code + '\n' +
                "Converte para: " + target_code + '\n' +
                "Taxa de conversão: " + conversion_rate + '\n' +
                "Conversão total: " + conversion_result;
    }
}
