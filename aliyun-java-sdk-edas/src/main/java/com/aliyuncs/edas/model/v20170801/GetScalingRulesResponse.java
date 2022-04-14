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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetScalingRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetScalingRulesResponse extends AcsResponse {

	private Integer code;

	private String message;

	private Long updateTime;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer oversoldFactor;

		private String vpcId;

		private Long updateTime;

		private Integer clusterType;

		private List<Rule> ruleList;

		public Integer getOversoldFactor() {
			return this.oversoldFactor;
		}

		public void setOversoldFactor(Integer oversoldFactor) {
			this.oversoldFactor = oversoldFactor;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(Integer clusterType) {
			this.clusterType = clusterType;
		}

		public List<Rule> getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(List<Rule> ruleList) {
			this.ruleList = ruleList;
		}

		public static class Rule {

			private String vpcId;

			private Long updateTime;

			private Long createTime;

			private Integer rt;

			private String specId;

			private String multiAzPolicy;

			private String resourceFrom;

			private String mode;

			private Integer loadNum;

			private Integer templateVersion;

			private Integer step;

			private String cond;

			private Integer cpu;

			private String groupId;

			private Integer instNum;

			private String appId;

			private Integer duration;

			private String vSwitchIds;

			private String metricType;

			private String templateId;

			private Boolean enable;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Integer getRt() {
				return this.rt;
			}

			public void setRt(Integer rt) {
				this.rt = rt;
			}

			public String getSpecId() {
				return this.specId;
			}

			public void setSpecId(String specId) {
				this.specId = specId;
			}

			public String getMultiAzPolicy() {
				return this.multiAzPolicy;
			}

			public void setMultiAzPolicy(String multiAzPolicy) {
				this.multiAzPolicy = multiAzPolicy;
			}

			public String getResourceFrom() {
				return this.resourceFrom;
			}

			public void setResourceFrom(String resourceFrom) {
				this.resourceFrom = resourceFrom;
			}

			public String getMode() {
				return this.mode;
			}

			public void setMode(String mode) {
				this.mode = mode;
			}

			public Integer getLoadNum() {
				return this.loadNum;
			}

			public void setLoadNum(Integer loadNum) {
				this.loadNum = loadNum;
			}

			public Integer getTemplateVersion() {
				return this.templateVersion;
			}

			public void setTemplateVersion(Integer templateVersion) {
				this.templateVersion = templateVersion;
			}

			public Integer getStep() {
				return this.step;
			}

			public void setStep(Integer step) {
				this.step = step;
			}

			public String getCond() {
				return this.cond;
			}

			public void setCond(String cond) {
				this.cond = cond;
			}

			public Integer getCpu() {
				return this.cpu;
			}

			public void setCpu(Integer cpu) {
				this.cpu = cpu;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public Integer getInstNum() {
				return this.instNum;
			}

			public void setInstNum(Integer instNum) {
				this.instNum = instNum;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public String getVSwitchIds() {
				return this.vSwitchIds;
			}

			public void setVSwitchIds(String vSwitchIds) {
				this.vSwitchIds = vSwitchIds;
			}

			public String getMetricType() {
				return this.metricType;
			}

			public void setMetricType(String metricType) {
				this.metricType = metricType;
			}

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}
		}
	}

	@Override
	public GetScalingRulesResponse getInstance(UnmarshallerContext context) {
		return	GetScalingRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
