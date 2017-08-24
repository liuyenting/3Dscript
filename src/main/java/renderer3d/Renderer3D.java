package renderer3d;

import java.awt.Color;

import ij.process.ColorProcessor;
import ij.process.ImageProcessor;

public interface Renderer3D {

	public ImageProcessor render(Keyframe kf);

	public void setTargetSize(int w, int h);

	public void setTimelapseIndex(int t);

	public void setBackground(Color bg);

	public void setBackground(ColorProcessor bg);

	public void setZStep(double zStep);
}
