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
import com.aliyuncs.swas.transform.v20170810.GetLoadBalancerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLoadBalancerResponse extends AcsResponse {

	private Long creationTime;

	private String dNSName;

	private Boolean success;

	private String loadBalancerId;

	private String chargeType;

	private Long userId;

	private String message;

	private String healthCheckPath;

	private String bussinessStatus;

	private String regionId;

	private String requestId;

	private String loadBalancerStatus;

	private String loadBalancerName;

	private Long expiredTime;

	private String allocationId;

	private String code;

	private Integer instancePort;

	private Long id;

	private String loadBalancerEdition;

	private List<InstanceHealthSummaryItem> instanceHealthSummary;

	private ConfigurationOptions configurationOptions;

	public Long getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Long creationTime) {
		this.creationTime = creationTime;
	}

	public String getDNSName() {
		return this.dNSName;
	}

	public void setDNSName(String dNSName) {
		this.dNSName = dNSName;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHealthCheckPath() {
		return this.healthCheckPath;
	}

	public void setHealthCheckPath(String healthCheckPath) {
		this.healthCheckPath = healthCheckPath;
	}

	public String getBussinessStatus() {
		return this.bussinessStatus;
	}

	public void setBussinessStatus(String bussinessStatus) {
		this.bussinessStatus = bussinessStatus;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLoadBalancerStatus() {
		return this.loadBalancerStatus;
	}

	public void setLoadBalancerStatus(String loadBalancerStatus) {
		this.loadBalancerStatus = loadBalancerStatus;
	}

	public String getLoadBalancerName() {
		return this.loadBalancerName;
	}

	public void setLoadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
	}

	public Long getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(Long expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getAllocationId() {
		return this.allocationId;
	}

	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getInstancePort() {
		return this.instancePort;
	}

	public void setInstancePort(Integer instancePort) {
		this.instancePort = instancePort;
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

	public List<InstanceHealthSummaryItem> getInstanceHealthSummary() {
		return this.instanceHealthSummary;
	}

	public void setInstanceHealthSummary(List<InstanceHealthSummaryItem> instanceHealthSummary) {
		this.instanceHealthSummary = instanceHealthSummary;
	}

	public ConfigurationOptions getConfigurationOptions() {
		return this.configurationOptions;
	}

	public void setConfigurationOptions(ConfigurationOptions configurationOptions) {
		this.configurationOptions = configurationOptions;
	}

	public static class InstanceHealthSummaryItem {

		private String instanceHealth;

		private String instanceId;

		private String instanceHealthReason;

		public String getInstanceHealth() {
			return this.instanceHealth;
		}

		public void setInstanceHealth(String instanceHealth) {
			this.instanceHealth = instanceHealth;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceHealthReason() {
			return this.instanceHealthReason;
		}

		public void setInstanceHealthReason(String instanceHealthReason) {
			this.instanceHealthReason = instanceHealthReason;
		}
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

	@Override
	public GetLoadBalancerResponse getInstance(UnmarshallerContext context) {
		return	GetLoadBalancerResponseUnmarshaller.unmarshall(this, context);
	}
}
