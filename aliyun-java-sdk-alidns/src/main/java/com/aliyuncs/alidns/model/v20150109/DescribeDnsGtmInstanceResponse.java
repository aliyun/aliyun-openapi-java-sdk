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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsGtmInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsGtmInstanceResponse extends AcsResponse {

	private Long expireTimestamp;

	private String requestId;

	private String resourceGroupId;

	private String instanceId;

	private Integer taskQuota;

	private String createTime;

	private Integer smsQuota;

	private String versionCode;

	private String paymentType;

	private String expireTime;

	private Long createTimestamp;

	private Config config;

	private UsedQuota usedQuota;

	public Long getExpireTimestamp() {
		return this.expireTimestamp;
	}

	public void setExpireTimestamp(Long expireTimestamp) {
		this.expireTimestamp = expireTimestamp;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Integer getTaskQuota() {
		return this.taskQuota;
	}

	public void setTaskQuota(Integer taskQuota) {
		this.taskQuota = taskQuota;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getSmsQuota() {
		return this.smsQuota;
	}

	public void setSmsQuota(Integer smsQuota) {
		this.smsQuota = smsQuota;
	}

	public String getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public Long getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Long createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Config getConfig() {
		return this.config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public UsedQuota getUsedQuota() {
		return this.usedQuota;
	}

	public void setUsedQuota(UsedQuota usedQuota) {
		this.usedQuota = usedQuota;
	}

	public static class Config {

		private Integer ttl;

		private String alertGroup;

		private String cnameType;

		private String strategyMode;

		private String instanceName;

		private String publicCnameMode;

		private String publicUserDomainName;

		private String pubicZoneName;

		private String publicRr;

		private List<AlertConfigItem> alertConfig;

		public Integer getTtl() {
			return this.ttl;
		}

		public void setTtl(Integer ttl) {
			this.ttl = ttl;
		}

		public String getAlertGroup() {
			return this.alertGroup;
		}

		public void setAlertGroup(String alertGroup) {
			this.alertGroup = alertGroup;
		}

		public String getCnameType() {
			return this.cnameType;
		}

		public void setCnameType(String cnameType) {
			this.cnameType = cnameType;
		}

		public String getStrategyMode() {
			return this.strategyMode;
		}

		public void setStrategyMode(String strategyMode) {
			this.strategyMode = strategyMode;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getPublicCnameMode() {
			return this.publicCnameMode;
		}

		public void setPublicCnameMode(String publicCnameMode) {
			this.publicCnameMode = publicCnameMode;
		}

		public String getPublicUserDomainName() {
			return this.publicUserDomainName;
		}

		public void setPublicUserDomainName(String publicUserDomainName) {
			this.publicUserDomainName = publicUserDomainName;
		}

		public String getPubicZoneName() {
			return this.pubicZoneName;
		}

		public void setPubicZoneName(String pubicZoneName) {
			this.pubicZoneName = pubicZoneName;
		}

		public String getPublicRr() {
			return this.publicRr;
		}

		public void setPublicRr(String publicRr) {
			this.publicRr = publicRr;
		}

		public List<AlertConfigItem> getAlertConfig() {
			return this.alertConfig;
		}

		public void setAlertConfig(List<AlertConfigItem> alertConfig) {
			this.alertConfig = alertConfig;
		}

		public static class AlertConfigItem {

			private Boolean smsNotice;

			private String noticeType;

			private Boolean emailNotice;

			private Boolean dingtalkNotice;

			public Boolean getSmsNotice() {
				return this.smsNotice;
			}

			public void setSmsNotice(Boolean smsNotice) {
				this.smsNotice = smsNotice;
			}

			public String getNoticeType() {
				return this.noticeType;
			}

			public void setNoticeType(String noticeType) {
				this.noticeType = noticeType;
			}

			public Boolean getEmailNotice() {
				return this.emailNotice;
			}

			public void setEmailNotice(Boolean emailNotice) {
				this.emailNotice = emailNotice;
			}

			public Boolean getDingtalkNotice() {
				return this.dingtalkNotice;
			}

			public void setDingtalkNotice(Boolean dingtalkNotice) {
				this.dingtalkNotice = dingtalkNotice;
			}
		}
	}

	public static class UsedQuota {

		private Integer emailUsedCount;

		private Integer taskUsedCount;

		private Integer smsUsedCount;

		private Integer dingtalkUsedCount;

		public Integer getEmailUsedCount() {
			return this.emailUsedCount;
		}

		public void setEmailUsedCount(Integer emailUsedCount) {
			this.emailUsedCount = emailUsedCount;
		}

		public Integer getTaskUsedCount() {
			return this.taskUsedCount;
		}

		public void setTaskUsedCount(Integer taskUsedCount) {
			this.taskUsedCount = taskUsedCount;
		}

		public Integer getSmsUsedCount() {
			return this.smsUsedCount;
		}

		public void setSmsUsedCount(Integer smsUsedCount) {
			this.smsUsedCount = smsUsedCount;
		}

		public Integer getDingtalkUsedCount() {
			return this.dingtalkUsedCount;
		}

		public void setDingtalkUsedCount(Integer dingtalkUsedCount) {
			this.dingtalkUsedCount = dingtalkUsedCount;
		}
	}

	@Override
	public DescribeDnsGtmInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsGtmInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
