package miInterfaces;

import modeloDTO.CitasMedicasDTO;

public interface AtencionMedica {
    
    void agendarCita(CitasMedicasDTO cita);
    void cancelarCita(int id);
    void detallesCita();
}
