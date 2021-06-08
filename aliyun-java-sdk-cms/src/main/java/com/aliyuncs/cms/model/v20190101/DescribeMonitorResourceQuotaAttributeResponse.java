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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeMonitorResourceQuotaAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorResourceQuotaAttributeResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private ResourceQuota resourceQuota;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourceQuota getResourceQuota() {
		return this.resourceQuota;
	}

	public void setResourceQuota(ResourceQuota resourceQuota) {
		this.resourceQuota = resourceQuota;
	}

	public static class ResourceQuota {

		private String expireTime;

		private String suitInfo;

		private String cRMType;

		private String instanceId;

		private SiteMonitorEcsProbe siteMonitorEcsProbe;

		private SiteMonitorOperatorProbe siteMonitorOperatorProbe;

		private SiteMonitorTask siteMonitorTask;

		private CustomMonitor customMonitor;

		private EventMonitor eventMonitor;

		private LogMonitor logMonitor;

		private Api api;

		private SMS sMS;

		private Phone phone;

		private EnterpriseQuota enterpriseQuota;

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getSuitInfo() {
			return this.suitInfo;
		}

		public void setSuitInfo(String suitInfo) {
			this.suitInfo = suitInfo;
		}

		public String getCRMType() {
			return this.cRMType;
		}

		public void setCRMType(String cRMType) {
			this.cRMType = cRMType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public SiteMonitorEcsProbe getSiteMonitorEcsProbe() {
			return this.siteMonitorEcsProbe;
		}

		public void setSiteMonitorEcsProbe(SiteMonitorEcsProbe siteMonitorEcsProbe) {
			this.siteMonitorEcsProbe = siteMonitorEcsProbe;
		}

		public SiteMonitorOperatorProbe getSiteMonitorOperatorProbe() {
			return this.siteMonitorOperatorProbe;
		}

		public void setSiteMonitorOperatorProbe(SiteMonitorOperatorProbe siteMonitorOperatorProbe) {
			this.siteMonitorOperatorProbe = siteMonitorOperatorProbe;
		}

		public SiteMonitorTask getSiteMonitorTask() {
			return this.siteMonitorTask;
		}

		public void setSiteMonitorTask(SiteMonitorTask siteMonitorTask) {
			this.siteMonitorTask = siteMonitorTask;
		}

		public CustomMonitor getCustomMonitor() {
			return this.customMonitor;
		}

		public void setCustomMonitor(CustomMonitor customMonitor) {
			this.customMonitor = customMonitor;
		}

		public EventMonitor getEventMonitor() {
			return this.eventMonitor;
		}

		public void setEventMonitor(EventMonitor eventMonitor) {
			this.eventMonitor = eventMonitor;
		}

		public LogMonitor getLogMonitor() {
			return this.logMonitor;
		}

		public void setLogMonitor(LogMonitor logMonitor) {
			this.logMonitor = logMonitor;
		}

		public Api getApi() {
			return this.api;
		}

		public void setApi(Api api) {
			this.api = api;
		}

		public SMS getSMS() {
			return this.sMS;
		}

		public void setSMS(SMS sMS) {
			this.sMS = sMS;
		}

		public Phone getPhone() {
			return this.phone;
		}

		public void setPhone(Phone phone) {
			this.phone = phone;
		}

		public EnterpriseQuota getEnterpriseQuota() {
			return this.enterpriseQuota;
		}

		public void setEnterpriseQuota(EnterpriseQuota enterpriseQuota) {
			this.enterpriseQuota = enterpriseQuota;
		}

		public static class SiteMonitorEcsProbe {

			private Integer quotaLimit;

			private Integer quotaPackage;

			private Integer quotaUsed;

			public Integer getQuotaLimit() {
				return this.quotaLimit;
			}

			public void setQuotaLimit(Integer quotaLimit) {
				this.quotaLimit = quotaLimit;
			}

			public Integer getQuotaPackage() {
				return this.quotaPackage;
			}

			public void setQuotaPackage(Integer quotaPackage) {
				this.quotaPackage = quotaPackage;
			}

			public Integer getQuotaUsed() {
				return this.quotaUsed;
			}

			public void setQuotaUsed(Integer quotaUsed) {
				this.quotaUsed = quotaUsed;
			}
		}

		public static class SiteMonitorOperatorProbe {

			private Integer quotaLimit;

			private Integer quotaPackage;

			private Integer quotaUsed;

			public Integer getQuotaLimit() {
				return this.quotaLimit;
			}

			public void setQuotaLimit(Integer quotaLimit) {
				this.quotaLimit = quotaLimit;
			}

			public Integer getQuotaPackage() {
				return this.quotaPackage;
			}

			public void setQuotaPackage(Integer quotaPackage) {
				this.quotaPackage = quotaPackage;
			}

			public Integer getQuotaUsed() {
				return this.quotaUsed;
			}

			public void setQuotaUsed(Integer quotaUsed) {
				this.quotaUsed = quotaUsed;
			}
		}

		public static class SiteMonitorTask {

			private Integer quotaLimit;

			private Integer quotaPackage;

			private Integer quotaUsed;

			public Integer getQuotaLimit() {
				return this.quotaLimit;
			}

			public void setQuotaLimit(Integer quotaLimit) {
				this.quotaLimit = quotaLimit;
			}

			public Integer getQuotaPackage() {
				return this.quotaPackage;
			}

			public void setQuotaPackage(Integer quotaPackage) {
				this.quotaPackage = quotaPackage;
			}

			public Integer getQuotaUsed() {
				return this.quotaUsed;
			}

			public void setQuotaUsed(Integer quotaUsed) {
				this.quotaUsed = quotaUsed;
			}
		}

		public static class CustomMonitor {

			private Integer quotaLimit;

			private Integer quotaPackage;

			private Integer quotaUsed;

			public Integer getQuotaLimit() {
				return this.quotaLimit;
			}

			public void setQuotaLimit(Integer quotaLimit) {
				this.quotaLimit = quotaLimit;
			}

			public Integer getQuotaPackage() {
				return this.quotaPackage;
			}

			public void setQuotaPackage(Integer quotaPackage) {
				this.quotaPackage = quotaPackage;
			}

			public Integer getQuotaUsed() {
				return this.quotaUsed;
			}

			public void setQuotaUsed(Integer quotaUsed) {
				this.quotaUsed = quotaUsed;
			}
		}

		public static class EventMonitor {

			private Integer quotaLimit;

			private Integer quotaPackage;

			private Integer quotaUsed;

			public Integer getQuotaLimit() {
				return this.quotaLimit;
			}

			public void setQuotaLimit(Integer quotaLimit) {
				this.quotaLimit = quotaLimit;
			}

			public Integer getQuotaPackage() {
				return this.quotaPackage;
			}

			public void setQuotaPackage(Integer quotaPackage) {
				this.quotaPackage = quotaPackage;
			}

			public Integer getQuotaUsed() {
				return this.quotaUsed;
			}

			public void setQuotaUsed(Integer quotaUsed) {
				this.quotaUsed = quotaUsed;
			}
		}

		public static class LogMonitor {

			private Integer quotaLimit;

			private Integer quotaPackage;

			private Integer quotaUsed;

			public Integer getQuotaLimit() {
				return this.quotaLimit;
			}

			public void setQuotaLimit(Integer quotaLimit) {
				this.quotaLimit = quotaLimit;
			}

			public Integer getQuotaPackage() {
				return this.quotaPackage;
			}

			public void setQuotaPackage(Integer quotaPackage) {
				this.quotaPackage = quotaPackage;
			}

			public Integer getQuotaUsed() {
				return this.quotaUsed;
			}

			public void setQuotaUsed(Integer quotaUsed) {
				this.quotaUsed = quotaUsed;
			}
		}

		public static class Api {

			private Integer quotaLimit;

			private Integer quotaPackage;

			private Integer quotaUsed;

			public Integer getQuotaLimit() {
				return this.quotaLimit;
			}

			public void setQuotaLimit(Integer quotaLimit) {
				this.quotaLimit = quotaLimit;
			}

			public Integer getQuotaPackage() {
				return this.quotaPackage;
			}

			public void setQuotaPackage(Integer quotaPackage) {
				this.quotaPackage = quotaPackage;
			}

			public Integer getQuotaUsed() {
				return this.quotaUsed;
			}

			public void setQuotaUsed(Integer quotaUsed) {
				this.quotaUsed = quotaUsed;
			}
		}

		public static class SMS {

			private Integer quotaLimit;

			private Integer quotaPackage;

			private Integer quotaUsed;

			public Integer getQuotaLimit() {
				return this.quotaLimit;
			}

			public void setQuotaLimit(Integer quotaLimit) {
				this.quotaLimit = quotaLimit;
			}

			public Integer getQuotaPackage() {
				return this.quotaPackage;
			}

			public void setQuotaPackage(Integer quotaPackage) {
				this.quotaPackage = quotaPackage;
			}

			public Integer getQuotaUsed() {
				return this.quotaUsed;
			}

			public void setQuotaUsed(Integer quotaUsed) {
				this.quotaUsed = quotaUsed;
			}
		}

		public static class Phone {

			private Integer quotaLimit;

			private Integer quotaPackage;

			private Integer quotaUsed;

			public Integer getQuotaLimit() {
				return this.quotaLimit;
			}

			public void setQuotaLimit(Integer quotaLimit) {
				this.quotaLimit = quotaLimit;
			}

			public Integer getQuotaPackage() {
				return this.quotaPackage;
			}

			public void setQuotaPackage(Integer quotaPackage) {
				this.quotaPackage = quotaPackage;
			}

			public Integer getQuotaUsed() {
				return this.quotaUsed;
			}

			public void setQuotaUsed(Integer quotaUsed) {
				this.quotaUsed = quotaUsed;
			}
		}

		public static class EnterpriseQuota {

			private String suitInfo;

			private String instanceId;

			public String getSuitInfo() {
				return this.suitInfo;
			}

			public void setSuitInfo(String suitInfo) {
				this.suitInfo = suitInfo;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}
		}
	}

	@Override
	public DescribeMonitorResourceQuotaAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitorResourceQuotaAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
