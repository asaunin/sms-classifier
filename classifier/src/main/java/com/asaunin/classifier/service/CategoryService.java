package com.asaunin.classifier.service;

import com.asaunin.cache.DeletableSimpleCache;
import com.asaunin.classifier.domain.SubCategory;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends DeletableSimpleCache<Integer, SubCategory> {

    public CategoryService() {
        super(SubCategory::getId);
    }

    public SubCategory findById(Integer subCategoryId) {
        return new SubCategory();
    }

}
