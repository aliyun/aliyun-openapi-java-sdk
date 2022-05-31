/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudesl.model.v20200201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.DescribeTemplateByModelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTemplateByModelResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private String code;

	private String message;

	private String dynamicMessage;

	private String dynamicCode;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<SelectItemInfo> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<SelectItemInfo> getItems() {
		return this.items;
	}

	public void setItems(List<SelectItemInfo> items) {
		this.items = items;
	}

	public static class SelectItemInfo {

		private String basePicture;

		private String templateId;

		private String templateName;

		private String eslSize;

		private String eslType;

		private Long width;

		private Long height;

		private String templateVersion;

		private String layout;

		private String scene;

		private String brand;

		public String getBasePicture() {
			return this.basePicture;
		}

		public void setBasePicture(String basePicture) {
			this.basePicture = basePicture;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getEslSize() {
			return this.eslSize;
		}

		public void setEslSize(String eslSize) {
			this.eslSize = eslSize;
		}

		public String getEslType() {
			return this.eslType;
		}

		public void setEslType(String eslType) {
			this.eslType = eslType;
		}

		public Long getWidth() {
			return this.width;
		}

		public void setWidth(Long width) {
			this.width = width;
		}

		public Long getHeight() {
			return this.height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public String getTemplateVersion() {
			return this.templateVersion;
		}

		public void setTemplateVersion(String templateVersion) {
			this.templateVersion = templateVersion;
		}

		public String getLayout() {
			return this.layout;
		}

		public void setLayout(String layout) {
			this.layout = layout;
		}

		public String getScene() {
			return this.scene;
		}

		public void setScene(String scene) {
			this.scene = scene;
		}

		public String getBrand() {
			return this.brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}
	}

	@Override
	public DescribeTemplateByModelResponse getInstance(UnmarshallerContext context) {
		return	DescribeTemplateByModelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
