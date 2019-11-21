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

package com.aliyuncs.reid.model.v20190928;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid.transform.v20190928.ListStoreResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStoreResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String message;

	private String code;

	private String dynamicCode;

	private String requestId;

	private Boolean success;

	private String dynamicMessage;

	private List<OpenStore> stores;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<OpenStore> getStores() {
		return this.stores;
	}

	public void setStores(List<OpenStore> stores) {
		this.stores = stores;
	}

	public static class OpenStore {

		private Long storeId;

		private Long gmtCreate;

		private Float sqm;

		private Integer status;

		private String name;

		private String openingEndTime;

		private String openingStartTime;

		private String storeType;

		private Long gmtModified;

		private String address;

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Float getSqm() {
			return this.sqm;
		}

		public void setSqm(Float sqm) {
			this.sqm = sqm;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOpeningEndTime() {
			return this.openingEndTime;
		}

		public void setOpeningEndTime(String openingEndTime) {
			this.openingEndTime = openingEndTime;
		}

		public String getOpeningStartTime() {
			return this.openingStartTime;
		}

		public void setOpeningStartTime(String openingStartTime) {
			this.openingStartTime = openingStartTime;
		}

		public String getStoreType() {
			return this.storeType;
		}

		public void setStoreType(String storeType) {
			this.storeType = storeType;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	}

	@Override
	public ListStoreResponse getInstance(UnmarshallerContext context) {
		return	ListStoreResponseUnmarshaller.unmarshall(this, context);
	}
}
