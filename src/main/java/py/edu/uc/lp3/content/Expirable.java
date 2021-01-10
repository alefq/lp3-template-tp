package py.edu.uc.lp3.content;

import java.util.Date;

public interface Expirable {
	boolean controlVencimiento(Date vencimiento, Date hoy); //al implementar se le llama a la utilidad notificar
}
