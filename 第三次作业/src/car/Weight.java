package car;

//�ӿ�
interface ComputeWeight{
	double computeWeight();
}

//����
class Television implements ComputeWeight{
	public double computeWeight() {
	
		return 300;
	}
}
//����
class Computer implements ComputeWeight{
	public double computeWeight() {
		
		return 250;
	}
}
//ϴ�»�
class WashMachine implements ComputeWeight{
	public double computeWeight() {
		
		return 500;
	}
}

class Car{
	ComputeWeight[] computeWeights=new ComputeWeight[3];
	Television television=new Television();
	Computer computer=new Computer();
	WashMachine washMachine=new WashMachine();
	public Car() {
		computeWeights[0]=television;
		computeWeights[1]=computer;
		computeWeights[2]=washMachine;
	}
	public void print() {
		System.out.println(computeWeights[0].computeWeight()+computeWeights[1].computeWeight()+computeWeights[2].computeWeight());
	}
}

public class Weight {

	public static void main(String[] args) {
				Car car=new Car();
				car.print();;
			}
	}

