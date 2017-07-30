import java.util.LinkedList;
import java.util.List;

public class MyShapeFactory  implements ShapeFactory{
	public java.util.List<Shape> getShapes(){
	              List<Shape> list = new LinkedList<>();
	              list.add(new Shape());
	              list.add(new Shape());
	              list.add(new Shape());
	              list.add(new Shape());
	              list.add(new Shape());
	              return list;
	}

	@Override
	public List<String> getshapes() {
		// TODO Auto-generated method stub
		return null;
	}
	              

}
