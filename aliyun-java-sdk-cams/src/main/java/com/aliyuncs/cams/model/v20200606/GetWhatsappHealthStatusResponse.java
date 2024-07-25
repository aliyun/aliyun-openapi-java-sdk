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

package com.aliyuncs.cams.model.v20200606;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.GetWhatsappHealthStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWhatsappHealthStatusResponse extends AcsResponse {

	private String accessDeniedDetail;

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String canSendMessage;

		private List<EntitiesItem> entities;

		public String getCanSendMessage() {
			return this.canSendMessage;
		}

		public void setCanSendMessage(String canSendMessage) {
			this.canSendMessage = canSendMessage;
		}

		public List<EntitiesItem> getEntities() {
			return this.entities;
		}

		public void setEntities(List<EntitiesItem> entities) {
			this.entities = entities;
		}

		public static class EntitiesItem {

			private String entityType;

			private String templateCode;

			private String language;

			private String canSendMessage;

			private String phoneNumber;

			private String wabaId;

			private String businessId;

			private List<ErrorsItem> errors;

			public String getEntityType() {
				return this.entityType;
			}

			public void setEntityType(String entityType) {
				this.entityType = entityType;
			}

			public String getTemplateCode() {
				return this.templateCode;
			}

			public void setTemplateCode(String templateCode) {
				this.templateCode = templateCode;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getCanSendMessage() {
				return this.canSendMessage;
			}

			public void setCanSendMessage(String canSendMessage) {
				this.canSendMessage = canSendMessage;
			}

			public String getPhoneNumber() {
				return this.phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getWabaId() {
				return this.wabaId;
			}

			public void setWabaId(String wabaId) {
				this.wabaId = wabaId;
			}

			public String getBusinessId() {
				return this.businessId;
			}

			public void setBusinessId(String businessId) {
				this.businessId = businessId;
			}

			public List<ErrorsItem> getErrors() {
				return this.errors;
			}

			public void setErrors(List<ErrorsItem> errors) {
				this.errors = errors;
			}

			public static class ErrorsItem {

				private String errorDescription;

				private String possibleSolution;

				private String errorCode;

				public String getErrorDescription() {
					return this.errorDescription;
				}

				public void setErrorDescription(String errorDescription) {
					this.errorDescription = errorDescription;
				}

				public String getPossibleSolution() {
					return this.possibleSolution;
				}

				public void setPossibleSolution(String possibleSolution) {
					this.possibleSolution = possibleSolution;
				}

				public String getErrorCode() {
					return this.errorCode;
				}

				public void setErrorCode(String errorCode) {
					this.errorCode = errorCode;
				}
			}
		}
	}

	@Override
	public GetWhatsappHealthStatusResponse getInstance(UnmarshallerContext context) {
		return	GetWhatsappHealthStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
