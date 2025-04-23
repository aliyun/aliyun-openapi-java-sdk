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

package com.aliyuncs.eds_user.model.v20210308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_user.transform.v20210308.UpdatePropertyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdatePropertyResponse extends AcsResponse {

	private String requestId;

	private UpdateResult updateResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UpdateResult getUpdateResult() {
		return this.updateResult;
	}

	public void setUpdateResult(UpdateResult updateResult) {
		this.updateResult = updateResult;
	}

	public static class UpdateResult {

		private Long propertyId;

		private String propertyKey;

		private SavePropertyValueModel savePropertyValueModel;

		public Long getPropertyId() {
			return this.propertyId;
		}

		public void setPropertyId(Long propertyId) {
			this.propertyId = propertyId;
		}

		public String getPropertyKey() {
			return this.propertyKey;
		}

		public void setPropertyKey(String propertyKey) {
			this.propertyKey = propertyKey;
		}

		public SavePropertyValueModel getSavePropertyValueModel() {
			return this.savePropertyValueModel;
		}

		public void setSavePropertyValueModel(SavePropertyValueModel savePropertyValueModel) {
			this.savePropertyValueModel = savePropertyValueModel;
		}

		public static class SavePropertyValueModel {

			private List<SavePropertyValuesItem> savePropertyValues;

			private List<FailedPropertyValuesItem> failedPropertyValues;

			public List<SavePropertyValuesItem> getSavePropertyValues() {
				return this.savePropertyValues;
			}

			public void setSavePropertyValues(List<SavePropertyValuesItem> savePropertyValues) {
				this.savePropertyValues = savePropertyValues;
			}

			public List<FailedPropertyValuesItem> getFailedPropertyValues() {
				return this.failedPropertyValues;
			}

			public void setFailedPropertyValues(List<FailedPropertyValuesItem> failedPropertyValues) {
				this.failedPropertyValues = failedPropertyValues;
			}

			public static class SavePropertyValuesItem {

				private Long propertyValueId;

				private String propertyValue;

				public Long getPropertyValueId() {
					return this.propertyValueId;
				}

				public void setPropertyValueId(Long propertyValueId) {
					this.propertyValueId = propertyValueId;
				}

				public String getPropertyValue() {
					return this.propertyValue;
				}

				public void setPropertyValue(String propertyValue) {
					this.propertyValue = propertyValue;
				}
			}

			public static class FailedPropertyValuesItem {

				private Long propertyId;

				private String propertyValue;

				private String errorCode;

				private String errorMessage;

				public Long getPropertyId() {
					return this.propertyId;
				}

				public void setPropertyId(Long propertyId) {
					this.propertyId = propertyId;
				}

				public String getPropertyValue() {
					return this.propertyValue;
				}

				public void setPropertyValue(String propertyValue) {
					this.propertyValue = propertyValue;
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
			}
		}
	}

	@Override
	public UpdatePropertyResponse getInstance(UnmarshallerContext context) {
		return	UpdatePropertyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
