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
import com.aliyuncs.iot.transform.v20180120.QueryJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryJobResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String jobId;

		private String jobName;

		private String utcCreate;

		private String status;

		private String description;

		private String type;

		private String jobDocument;

		private String utcModified;

		private Long scheduledTime;

		private RolloutConfig rolloutConfig;

		private TimeoutConfig timeoutConfig;

		private JobFile jobFile;

		private TargetConfig targetConfig;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getJobDocument() {
			return this.jobDocument;
		}

		public void setJobDocument(String jobDocument) {
			this.jobDocument = jobDocument;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public Long getScheduledTime() {
			return this.scheduledTime;
		}

		public void setScheduledTime(Long scheduledTime) {
			this.scheduledTime = scheduledTime;
		}

		public RolloutConfig getRolloutConfig() {
			return this.rolloutConfig;
		}

		public void setRolloutConfig(RolloutConfig rolloutConfig) {
			this.rolloutConfig = rolloutConfig;
		}

		public TimeoutConfig getTimeoutConfig() {
			return this.timeoutConfig;
		}

		public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
			this.timeoutConfig = timeoutConfig;
		}

		public JobFile getJobFile() {
			return this.jobFile;
		}

		public void setJobFile(JobFile jobFile) {
			this.jobFile = jobFile;
		}

		public TargetConfig getTargetConfig() {
			return this.targetConfig;
		}

		public void setTargetConfig(TargetConfig targetConfig) {
			this.targetConfig = targetConfig;
		}

		public static class RolloutConfig {

			private Integer maximumPerMinute;

			public Integer getMaximumPerMinute() {
				return this.maximumPerMinute;
			}

			public void setMaximumPerMinute(Integer maximumPerMinute) {
				this.maximumPerMinute = maximumPerMinute;
			}
		}

		public static class TimeoutConfig {

			private Integer inProgressTimeoutInMinutes;

			public Integer getInProgressTimeoutInMinutes() {
				return this.inProgressTimeoutInMinutes;
			}

			public void setInProgressTimeoutInMinutes(Integer inProgressTimeoutInMinutes) {
				this.inProgressTimeoutInMinutes = inProgressTimeoutInMinutes;
			}
		}

		public static class JobFile {

			private String fileUrl;

			private String signMethod;

			private String sign;

			public String getFileUrl() {
				return this.fileUrl;
			}

			public void setFileUrl(String fileUrl) {
				this.fileUrl = fileUrl;
			}

			public String getSignMethod() {
				return this.signMethod;
			}

			public void setSignMethod(String signMethod) {
				this.signMethod = signMethod;
			}

			public String getSign() {
				return this.sign;
			}

			public void setSign(String sign) {
				this.sign = sign;
			}
		}

		public static class TargetConfig {

			private String targetGroup;

			private String targetProduct;

			private String targetType;

			private List<TargetDevicesItem> targetDevices;

			public String getTargetGroup() {
				return this.targetGroup;
			}

			public void setTargetGroup(String targetGroup) {
				this.targetGroup = targetGroup;
			}

			public String getTargetProduct() {
				return this.targetProduct;
			}

			public void setTargetProduct(String targetProduct) {
				this.targetProduct = targetProduct;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public List<TargetDevicesItem> getTargetDevices() {
				return this.targetDevices;
			}

			public void setTargetDevices(List<TargetDevicesItem> targetDevices) {
				this.targetDevices = targetDevices;
			}

			public static class TargetDevicesItem {

				private String productKey;

				private String deviceName;

				public String getProductKey() {
					return this.productKey;
				}

				public void setProductKey(String productKey) {
					this.productKey = productKey;
				}

				public String getDeviceName() {
					return this.deviceName;
				}

				public void setDeviceName(String deviceName) {
					this.deviceName = deviceName;
				}
			}
		}
	}

	@Override
	public QueryJobResponse getInstance(UnmarshallerContext context) {
		return	QueryJobResponseUnmarshaller.unmarshall(this, context);
	}
}
