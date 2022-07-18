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
import com.aliyuncs.cloudesl.transform.v20200201.QueryLayoutByDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLayoutByDeviceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private String errorCode;

	private String errorMessage;

	private String code;

	private String dynamicCode;

	private String dynamicMessage;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Layout> layoutList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Layout> getLayoutList() {
		return this.layoutList;
	}

	public void setLayoutList(List<Layout> layoutList) {
		this.layoutList = layoutList;
	}

	public static class Layout {

		private String layoutId;

		private String layoutName;

		private String description;

		private String layoutTemplateId;

		private Boolean isBind;

		private String brand;

		private String basePic;

		public String getLayoutId() {
			return this.layoutId;
		}

		public void setLayoutId(String layoutId) {
			this.layoutId = layoutId;
		}

		public String getLayoutName() {
			return this.layoutName;
		}

		public void setLayoutName(String layoutName) {
			this.layoutName = layoutName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLayoutTemplateId() {
			return this.layoutTemplateId;
		}

		public void setLayoutTemplateId(String layoutTemplateId) {
			this.layoutTemplateId = layoutTemplateId;
		}

		public Boolean getIsBind() {
			return this.isBind;
		}

		public void setIsBind(Boolean isBind) {
			this.isBind = isBind;
		}

		public String getBrand() {
			return this.brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getBasePic() {
			return this.basePic;
		}

		public void setBasePic(String basePic) {
			this.basePic = basePic;
		}
	}

	@Override
	public QueryLayoutByDeviceResponse getInstance(UnmarshallerContext context) {
		return	QueryLayoutByDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
