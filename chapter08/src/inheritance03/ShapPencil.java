package inheritance03;

public class ShapPencil {
   protected int residual;
   protected int thickness;
   
   public ShapPencil() {};
   public ShapPencil(int residual, int thickness) {
	   
   };
   
   
   public int getResidual() {
	return residual;
   }
   public void setResidual(int residual) {
	this.residual = residual;
   }
   public int getThickness() {
	return thickness;
   }
   public void setThickness(int thickness) {
	this.thickness = thickness;
   }
   
   
}
