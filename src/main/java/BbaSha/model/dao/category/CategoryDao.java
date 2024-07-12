package BbaSha.model.dao.category;

import BbaSha.model.entity.category.Category;

import java.util.HashMap;
import java.util.Map;

public interface CategoryDao {
    Map<Integer, Category> categoryMap = new HashMap<>();

    Category findCatergorybyId(int id);

}
