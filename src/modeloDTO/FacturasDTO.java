package modeloDTO;

import java.math.BigDecimal;
import java.util.Date;

public class FacturasDTO {

    private int idFactura;
    private int idCita;
    private BigDecimal monto;
    private Date fechaFactura;

    public FacturasDTO(int idFactura, int idCita, BigDecimal monto, Date fechaFactura) {
        this.idFactura = idFactura;
        this.idCita = idCita;
        this.monto = monto;
        this.fechaFactura = fechaFactura;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }
}
