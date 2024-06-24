package milInterfaces;

import Clases.CitasMedicas;

public interface AtencionMedica {
    
    void agendarCita(CitasMedicas cita);
    void cancelarCita(int id);
    void detallesCita();
}
