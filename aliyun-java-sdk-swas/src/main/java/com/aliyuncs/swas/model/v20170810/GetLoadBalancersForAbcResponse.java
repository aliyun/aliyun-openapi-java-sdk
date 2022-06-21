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

package com.aliyuncs.swas.model.v20170810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas.transform.v20170810.GetLoadBalancersForAbcResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLoadBalancersForAbcResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private Integer pageNo;

	private String message;

	private Integer pageSize;

	private Integer totalCount;

	private List<LoadBalancersItem> loadBalancers;

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

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<LoadBalancersItem> getLoadBalancers() {
		return this.loadBalancers;
	}

	public void setLoadBalancers(List<LoadBalancersItem> loadBalancers) {
		this.loadBalancers = loadBalancers;
	}

	public static class LoadBalancersItem {

		private Long creationTime;

		private String dnsName;

		private String loadBalancerId;

		private Long userId;

		private String chargeType;

		private String healthCheckPath;

		private String businessStatus;

		private String regionId;

		private String loadBalancerName;

		private String loadBalancerStatus;

		private Long expiredTime;

		private Long id;

		private String loadBalancerEdition;

		private ConfigurationOptions configurationOptions;

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getDnsName() {
			return this.dnsName;
		}

		public void setDnsName(String dnsName) {
			this.dnsName = dnsName;
		}

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getHealthCheckPath() {
			return this.healthCheckPath;
		}

		public void setHealthCheckPath(String healthCheckPath) {
			this.healthCheckPath = healthCheckPath;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getLoadBalancerName() {
			return this.loadBalancerName;
		}

		public void setLoadBalancerName(String loadBalancerName) {
			this.loadBalancerName = loadBalancerName;
		}

		public String getLoadBalancerStatus() {
			return this.loadBalancerStatus;
		}

		public void setLoadBalancerStatus(String loadBalancerStatus) {
			this.loadBalancerStatus = loadBalancerStatus;
		}

		public Long getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(Long expiredTime) {
			this.expiredTime = expiredTime;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLoadBalancerEdition() {
			return this.loadBalancerEdition;
		}

		public void setLoadBalancerEdition(String loadBalancerEdition) {
			this.loadBalancerEdition = loadBalancerEdition;
		}

		public ConfigurationOptions getConfigurationOptions() {
			return this.configurationOptions;
		}

		public void setConfigurationOptions(ConfigurationOptions configurationOptions) {
			this.configurationOptions = configurationOptions;
		}

		public static class ConfigurationOptions {

			private Boolean sessionStickinessEnabled;

			private Long sessionStickinessDurationSeconds;

			public Boolean getSessionStickinessEnabled() {
				return this.sessionStickinessEnabled;
			}

			public void setSessionStickinessEnabled(Boolean sessionStickinessEnabled) {
				this.sessionStickinessEnabled = sessionStickinessEnabled;
			}

			public Long getSessionStickinessDurationSeconds() {
				return this.sessionStickinessDurationSeconds;
			}

			public void setSessionStickinessDurationSeconds(Long sessionStickinessDurationSeconds) {
				this.sessionStickinessDurationSeconds = sessionStickinessDurationSeconds;
			}
		}
	}

	@Override
	public GetLoadBalancersForAbcResponse getInstance(UnmarshallerContext context) {
		return	GetLoadBalancersForAbcResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
