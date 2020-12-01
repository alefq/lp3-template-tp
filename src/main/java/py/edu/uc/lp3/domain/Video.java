package py.edu.uc.lp3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	int resolution;
	double framesPerSecond;

	double compatibilityPercentage;

	public double getCompatibilityPercentage() {
		return compatibilityPercentage;
	}

	public void setCompatibilityPercentage(double compatibilityPercentage) {
		this.compatibilityPercentage = compatibilityPercentage;
	}

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public double getFramesPerSecond() {
		return framesPerSecond;
	}

	public void setFramesPerSecond(double framesPerSecond) {
		this.framesPerSecond = framesPerSecond;
	}

}

// Comentario taller git
