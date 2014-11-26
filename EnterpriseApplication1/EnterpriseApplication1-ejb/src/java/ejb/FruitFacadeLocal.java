/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Fruit;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Samuel
 */
@Local
public interface FruitFacadeLocal {

    void create(Fruit fruit);

    void edit(Fruit fruit);

    void remove(Fruit fruit);

    Fruit find(Object id);

    List<Fruit> findAll();

    List<Fruit> findRange(int[] range);

    int count();
    
}
