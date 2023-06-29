package classwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "красный", "деревянный");
        Cube cube2 = new Cube(4, "желтый", "металлический");
        Cube cube3 = new Cube(4, "желтый", "металлический");
        Cube cube4 = new Cube(4, "желтый", "металлический");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        System.out.println("cubeList = " + cubeList);
        Integer k = 0;
        Integer sumVolume = 0;
        Integer kWood = 0;

        for (Cube cube : cubeList) {
            if (cube.getColor().equals("желтый")) {
                k++;
                sumVolume += cube.volumeCube();
            }
            if (cube.getMaterial().equals("деревянный") && cube.getSize() == 3) {
                kWood++;
            }
        }
        System.out.println("k = " + k);
        System.out.println("sumVolume = " + sumVolume);
        System.out.println("kWood = " + kWood);
        System.out.println("unicCollection(cubeList) = " + unicCollection(cubeList));
    }

    private static Collection unicCollection(List<Cube> cubeList) {
        return new HashSet(cubeList);
    }
}
