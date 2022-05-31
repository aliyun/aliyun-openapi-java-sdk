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
import com.aliyuncs.cloudesl.transform.v20200201.DescribeEslModelByTemplateVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEslModelByTemplateVersionResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private String code;

	private String message;

	private String dynamicMessage;

	private String dynamicCode;

	private Integer pageNumber;

	private Integer pageSize;

	private List<SelectItemInfo> eslModels;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<SelectItemInfo> getEslModels() {
		return this.eslModels;
	}

	public void setEslModels(List<SelectItemInfo> eslModels) {
		this.eslModels = eslModels;
	}

	public static class SelectItemInfo {

		private String modelId;

		private String name;

		private String image;

		private String deviceType;

		private String vendor;

		private Integer screenWidth;

		private Integer screenHeight;

		private String eslSize;

		private String eslPhysicalSize;

		public String getModelId() {
			return this.modelId;
		}

		public void setModelId(String modelId) {
			this.modelId = modelId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getVendor() {
			return this.vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}

		public Integer getScreenWidth() {
			return this.screenWidth;
		}

		public void setScreenWidth(Integer screenWidth) {
			this.screenWidth = screenWidth;
		}

		public Integer getScreenHeight() {
			return this.screenHeight;
		}

		public void setScreenHeight(Integer screenHeight) {
			this.screenHeight = screenHeight;
		}

		public String getEslSize() {
			return this.eslSize;
		}

		public void setEslSize(String eslSize) {
			this.eslSize = eslSize;
		}

		public String getEslPhysicalSize() {
			return this.eslPhysicalSize;
		}

		public void setEslPhysicalSize(String eslPhysicalSize) {
			this.eslPhysicalSize = eslPhysicalSize;
		}
	}

	@Override
	public DescribeEslModelByTemplateVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeEslModelByTemplateVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
