package com.github.supercoding.web.dto.items;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Spec {
    @ApiModelProperty(name = "cpu", value = "Item CPU", example = "Google Tensor") private String cpu;
    @ApiModelProperty(name = "capacity", value = "Item 용량 Spec", example = "25G") private String capacity;
}
