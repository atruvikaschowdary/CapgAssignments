package streamapilevel1;

	import java.util.stream.Stream;

	public class FilterDemo {

		public static void main(String[] args) {

			Stream.of("vikas","manoj","vinod","sai")

			.filter((t)->{if( t.startsWith("v")) return true;

			else return false;

			}).forEach((t)->System.out.println(t));
		}

	}
