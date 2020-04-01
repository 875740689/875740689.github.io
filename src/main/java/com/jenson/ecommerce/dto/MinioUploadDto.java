package com.jenson.ecommerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件上传返回结果
 *
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class MinioUploadDto {
    public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String url;
    private String name;
}
