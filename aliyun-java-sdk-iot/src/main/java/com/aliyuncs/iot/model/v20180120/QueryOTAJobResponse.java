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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryOTAJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOTAJobResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String utcCreate;

		private Integer retryInterval;

		private String jobType;

		private String selectionType;

		private Integer overwriteMode;

		private String targetSelection;

		private Integer timeoutInMinutes;

		private String grayPercent;

		private Boolean needPush;

		private String jobStatus;

		private String jobDesc;

		private String utcModified;

		private String utcStartTime;

		private Boolean multiModuleMode;

		private String utcEndTime;

		private String name;

		private String destVersion;

		private String utcScheduleFinishTime;

		private Integer maximumPerMinute;

		private Integer dynamicMode;

		private Integer retryCount;

		private String productKey;

		private String groupName;

		private String groupId;

		private String utcScheduleTime;

		private String jobId;

		private String downloadProtocol;

		private Boolean needConfirm;

		private String firmwareId;

		private List<OtaTagDTO> tags;

		private List<String> srcVersions;

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public Integer getRetryInterval() {
			return this.retryInterval;
		}

		public void setRetryInterval(Integer retryInterval) {
			this.retryInterval = retryInterval;
		}

		public String getJobType() {
			return this.jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public String getSelectionType() {
			return this.selectionType;
		}

		public void setSelectionType(String selectionType) {
			this.selectionType = selectionType;
		}

		public Integer getOverwriteMode() {
			return this.overwriteMode;
		}

		public void setOverwriteMode(Integer overwriteMode) {
			this.overwriteMode = overwriteMode;
		}

		public String getTargetSelection() {
			return this.targetSelection;
		}

		public void setTargetSelection(String targetSelection) {
			this.targetSelection = targetSelection;
		}

		public Integer getTimeoutInMinutes() {
			return this.timeoutInMinutes;
		}

		public void setTimeoutInMinutes(Integer timeoutInMinutes) {
			this.timeoutInMinutes = timeoutInMinutes;
		}

		public String getGrayPercent() {
			return this.grayPercent;
		}

		public void setGrayPercent(String grayPercent) {
			this.grayPercent = grayPercent;
		}

		public Boolean getNeedPush() {
			return this.needPush;
		}

		public void setNeedPush(Boolean needPush) {
			this.needPush = needPush;
		}

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getJobDesc() {
			return this.jobDesc;
		}

		public void setJobDesc(String jobDesc) {
			this.jobDesc = jobDesc;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public String getUtcStartTime() {
			return this.utcStartTime;
		}

		public void setUtcStartTime(String utcStartTime) {
			this.utcStartTime = utcStartTime;
		}

		public Boolean getMultiModuleMode() {
			return this.multiModuleMode;
		}

		public void setMultiModuleMode(Boolean multiModuleMode) {
			this.multiModuleMode = multiModuleMode;
		}

		public String getUtcEndTime() {
			return this.utcEndTime;
		}

		public void setUtcEndTime(String utcEndTime) {
			this.utcEndTime = utcEndTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDestVersion() {
			return this.destVersion;
		}

		public void setDestVersion(String destVersion) {
			this.destVersion = destVersion;
		}

		public String getUtcScheduleFinishTime() {
			return this.utcScheduleFinishTime;
		}

		public void setUtcScheduleFinishTime(String utcScheduleFinishTime) {
			this.utcScheduleFinishTime = utcScheduleFinishTime;
		}

		public Integer getMaximumPerMinute() {
			return this.maximumPerMinute;
		}

		public void setMaximumPerMinute(Integer maximumPerMinute) {
			this.maximumPerMinute = maximumPerMinute;
		}

		public Integer getDynamicMode() {
			return this.dynamicMode;
		}

		public void setDynamicMode(Integer dynamicMode) {
			this.dynamicMode = dynamicMode;
		}

		public Integer getRetryCount() {
			return this.retryCount;
		}

		public void setRetryCount(Integer retryCount) {
			this.retryCount = retryCount;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getUtcScheduleTime() {
			return this.utcScheduleTime;
		}

		public void setUtcScheduleTime(String utcScheduleTime) {
			this.utcScheduleTime = utcScheduleTime;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getDownloadProtocol() {
			return this.downloadProtocol;
		}

		public void setDownloadProtocol(String downloadProtocol) {
			this.downloadProtocol = downloadProtocol;
		}

		public Boolean getNeedConfirm() {
			return this.needConfirm;
		}

		public void setNeedConfirm(Boolean needConfirm) {
			this.needConfirm = needConfirm;
		}

		public String getFirmwareId() {
			return this.firmwareId;
		}

		public void setFirmwareId(String firmwareId) {
			this.firmwareId = firmwareId;
		}

		public List<OtaTagDTO> getTags() {
			return this.tags;
		}

		public void setTags(List<OtaTagDTO> tags) {
			this.tags = tags;
		}

		public List<String> getSrcVersions() {
			return this.srcVersions;
		}

		public void setSrcVersions(List<String> srcVersions) {
			this.srcVersions = srcVersions;
		}

		public static class OtaTagDTO {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public QueryOTAJobResponse getInstance(UnmarshallerContext context) {
		return	QueryOTAJobResponseUnmarshaller.unmarshall(this, context);
	}
}
