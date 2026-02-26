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

package com.aliyuncs.brain_industrial.model.v20200920;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.brain_industrial.transform.v20200920.ActivateLicenseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ActivateLicenseResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String accessDeniedDetail;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String id;

		private String licenseSpecName;

		private String buyTime;

		private String activateTime;

		private String fingerprint;

		private String licenseCode;

		private String effectTime;

		private String expireTime;

		private String duration;

		private String status;

		private Integer cpuLimit;

		private Integer memoryLimit;

		private String instanceId;

		private String allDuration;

		private String applicableSpecs;

		private String description;

		private String unActivateAllDuration;

		private List<ActivateRecordItem> activateRecord;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getLicenseSpecName() {
			return this.licenseSpecName;
		}

		public void setLicenseSpecName(String licenseSpecName) {
			this.licenseSpecName = licenseSpecName;
		}

		public String getBuyTime() {
			return this.buyTime;
		}

		public void setBuyTime(String buyTime) {
			this.buyTime = buyTime;
		}

		public String getActivateTime() {
			return this.activateTime;
		}

		public void setActivateTime(String activateTime) {
			this.activateTime = activateTime;
		}

		public String getFingerprint() {
			return this.fingerprint;
		}

		public void setFingerprint(String fingerprint) {
			this.fingerprint = fingerprint;
		}

		public String getLicenseCode() {
			return this.licenseCode;
		}

		public void setLicenseCode(String licenseCode) {
			this.licenseCode = licenseCode;
		}

		public String getEffectTime() {
			return this.effectTime;
		}

		public void setEffectTime(String effectTime) {
			this.effectTime = effectTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getCpuLimit() {
			return this.cpuLimit;
		}

		public void setCpuLimit(Integer cpuLimit) {
			this.cpuLimit = cpuLimit;
		}

		public Integer getMemoryLimit() {
			return this.memoryLimit;
		}

		public void setMemoryLimit(Integer memoryLimit) {
			this.memoryLimit = memoryLimit;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getAllDuration() {
			return this.allDuration;
		}

		public void setAllDuration(String allDuration) {
			this.allDuration = allDuration;
		}

		public String getApplicableSpecs() {
			return this.applicableSpecs;
		}

		public void setApplicableSpecs(String applicableSpecs) {
			this.applicableSpecs = applicableSpecs;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getUnActivateAllDuration() {
			return this.unActivateAllDuration;
		}

		public void setUnActivateAllDuration(String unActivateAllDuration) {
			this.unActivateAllDuration = unActivateAllDuration;
		}

		public List<ActivateRecordItem> getActivateRecord() {
			return this.activateRecord;
		}

		public void setActivateRecord(List<ActivateRecordItem> activateRecord) {
			this.activateRecord = activateRecord;
		}

		public static class ActivateRecordItem {

			private String orderId;

			private String buyTime;

			private String activateTime;

			private String expireTime;

			private String duration;

			private String status;

			private String licenseCode;

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public String getBuyTime() {
				return this.buyTime;
			}

			public void setBuyTime(String buyTime) {
				this.buyTime = buyTime;
			}

			public String getActivateTime() {
				return this.activateTime;
			}

			public void setActivateTime(String activateTime) {
				this.activateTime = activateTime;
			}

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getLicenseCode() {
				return this.licenseCode;
			}

			public void setLicenseCode(String licenseCode) {
				this.licenseCode = licenseCode;
			}
		}
	}

	@Override
	public ActivateLicenseResponse getInstance(UnmarshallerContext context) {
		return	ActivateLicenseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
