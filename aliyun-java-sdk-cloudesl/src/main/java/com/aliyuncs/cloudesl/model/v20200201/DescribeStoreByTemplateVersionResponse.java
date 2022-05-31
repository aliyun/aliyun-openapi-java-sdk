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
import com.aliyuncs.cloudesl.transform.v20200201.DescribeStoreByTemplateVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStoreByTemplateVersionResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private String code;

	private String message;

	private String dynamicMessage;

	private String dynamicCode;

	private List<SelectItemInfo> stores;

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

	public List<SelectItemInfo> getStores() {
		return this.stores;
	}

	public void setStores(List<SelectItemInfo> stores) {
		this.stores = stores;
	}

	public static class SelectItemInfo {

		private String storeName;

		private String storeId;

		private String parentId;

		private String userStoreCode;

		private String gmtModified;

		private String phone;

		private String level;

		private String templateVersion;

		private String timeZone;

		public String getStoreName() {
			return this.storeName;
		}

		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getUserStoreCode() {
			return this.userStoreCode;
		}

		public void setUserStoreCode(String userStoreCode) {
			this.userStoreCode = userStoreCode;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getTemplateVersion() {
			return this.templateVersion;
		}

		public void setTemplateVersion(String templateVersion) {
			this.templateVersion = templateVersion;
		}

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}
	}

	@Override
	public DescribeStoreByTemplateVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeStoreByTemplateVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
