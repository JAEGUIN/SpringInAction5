package tacos.data;
import tacos.Taco;

@Repository //선언해줘서 bean을 가져온다?!?!
public interface TacoRepository {
	Taco save(Taco design);
}
