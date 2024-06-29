package modeloDTO;

import java.math.BigDecimal;
import java.util.Date;

public class PagosDTO {

    private int idPago;
    private int idFactura;
    private BigDecimal montoPagado;
    private Date fechaPago;
    private String metodoPago;

    public PagosDTO(int idPago, int idFactura, BigDecimal montoPagado, Date fechaPago, String metodoPago) {
        this.idPago = idPago;
        this.idFactura = idFactura;
        this.montoPagado = montoPagado;
        this.fechaPago = fechaPago;
        this.metodoPago = metodoPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(BigDecimal montoPagado) {
        this.montoPagado = montoPagado;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}
