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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.DescribeAppServiceEnvParamWithDiffResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppServiceEnvParamWithDiffResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<AppServiceEnvParamDiffItem> appServiceEnvParamDiff;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<AppServiceEnvParamDiffItem> getAppServiceEnvParamDiff() {
		return this.appServiceEnvParamDiff;
	}

	public void setAppServiceEnvParamDiff(List<AppServiceEnvParamDiffItem> appServiceEnvParamDiff) {
		this.appServiceEnvParamDiff = appServiceEnvParamDiff;
	}

	public static class AppServiceEnvParamDiffItem {

		private String appId;

		private String appServiceId;

		private String baselineBuildpackId;

		private String creationTime;

		private String defaultValue;

		private String description;

		private String id;

		private String key;

		private String modificationTime;

		private String originalDefaultValue;

		private String originalDescription;

		private String originalReadonly;

		private Boolean originalRequired;

		private Boolean readonly;

		private Boolean required;

		private String status;

		private String value;

		private String workspaceId;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppServiceId() {
			return this.appServiceId;
		}

		public void setAppServiceId(String appServiceId) {
			this.appServiceId = appServiceId;
		}

		public String getBaselineBuildpackId() {
			return this.baselineBuildpackId;
		}

		public void setBaselineBuildpackId(String baselineBuildpackId) {
			this.baselineBuildpackId = baselineBuildpackId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
		}

		public String getOriginalDefaultValue() {
			return this.originalDefaultValue;
		}

		public void setOriginalDefaultValue(String originalDefaultValue) {
			this.originalDefaultValue = originalDefaultValue;
		}

		public String getOriginalDescription() {
			return this.originalDescription;
		}

		public void setOriginalDescription(String originalDescription) {
			this.originalDescription = originalDescription;
		}

		public String getOriginalReadonly() {
			return this.originalReadonly;
		}

		public void setOriginalReadonly(String originalReadonly) {
			this.originalReadonly = originalReadonly;
		}

		public Boolean getOriginalRequired() {
			return this.originalRequired;
		}

		public void setOriginalRequired(Boolean originalRequired) {
			this.originalRequired = originalRequired;
		}

		public Boolean getReadonly() {
			return this.readonly;
		}

		public void setReadonly(Boolean readonly) {
			this.readonly = readonly;
		}

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}
	}

	@Override
	public DescribeAppServiceEnvParamWithDiffResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppServiceEnvParamWithDiffResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
