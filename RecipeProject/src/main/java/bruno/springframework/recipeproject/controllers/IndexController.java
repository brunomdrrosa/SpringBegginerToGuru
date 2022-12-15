package bruno.springframework.recipeproject.controllers;

import bruno.springframework.recipeproject.domain.Category;
import bruno.springframework.recipeproject.domain.UnitOfMeasure;
import bruno.springframework.recipeproject.repositories.CategoryRepository;
import bruno.springframework.recipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category ID is: " + category.get().getId());
        System.out.println("UOM ID is: " + unitOfMeasure.get().getId());

        return "index";
    }
}
