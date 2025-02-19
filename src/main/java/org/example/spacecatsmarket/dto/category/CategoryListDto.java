package org.example.spacecatsmarket.dto.category;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Value
@Builder
@Jacksonized
public class CategoryListDto {
    List<CategoryEntry> categoryEntries;
}
