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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListSensitivityLevelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSensitivityLevelResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private List<SensitivityLevelListItem> sensitivityLevelList;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<SensitivityLevelListItem> getSensitivityLevelList() {
		return this.sensitivityLevelList;
	}

	public void setSensitivityLevelList(List<SensitivityLevelListItem> sensitivityLevelList) {
		this.sensitivityLevelList = sensitivityLevelList;
	}

	public static class SensitivityLevelListItem {

		private String name;

		private String templateId;

		private String templateType;

		private Boolean isPlain;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(String templateType) {
			this.templateType = templateType;
		}

		public Boolean getIsPlain() {
			return this.isPlain;
		}

		public void setIsPlain(Boolean isPlain) {
			this.isPlain = isPlain;
		}
	}

	@Override
	public ListSensitivityLevelResponse getInstance(UnmarshallerContext context) {
		return	ListSensitivityLevelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
