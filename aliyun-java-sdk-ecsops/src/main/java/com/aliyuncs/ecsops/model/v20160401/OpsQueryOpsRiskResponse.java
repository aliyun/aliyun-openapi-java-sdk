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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryOpsRiskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryOpsRiskResponse extends AcsResponse {

	private String requestId;

	private List<OpsRiskConfig> opsRiskConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OpsRiskConfig> getOpsRiskConfigs() {
		return this.opsRiskConfigs;
	}

	public void setOpsRiskConfigs(List<OpsRiskConfig> opsRiskConfigs) {
		this.opsRiskConfigs = opsRiskConfigs;
	}

	public static class OpsRiskConfig {

		private String name;

		private Integer limitNum;

		private Boolean alwaysExec;

		private Integer maxFreezeTime;

		private Boolean enable;

		private String opsAction;

		private List<String> postActions;

		private List<String> groupByKeys;

		private List<String> exclusions;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getLimitNum() {
			return this.limitNum;
		}

		public void setLimitNum(Integer limitNum) {
			this.limitNum = limitNum;
		}

		public Boolean getAlwaysExec() {
			return this.alwaysExec;
		}

		public void setAlwaysExec(Boolean alwaysExec) {
			this.alwaysExec = alwaysExec;
		}

		public Integer getMaxFreezeTime() {
			return this.maxFreezeTime;
		}

		public void setMaxFreezeTime(Integer maxFreezeTime) {
			this.maxFreezeTime = maxFreezeTime;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getOpsAction() {
			return this.opsAction;
		}

		public void setOpsAction(String opsAction) {
			this.opsAction = opsAction;
		}

		public List<String> getPostActions() {
			return this.postActions;
		}

		public void setPostActions(List<String> postActions) {
			this.postActions = postActions;
		}

		public List<String> getGroupByKeys() {
			return this.groupByKeys;
		}

		public void setGroupByKeys(List<String> groupByKeys) {
			this.groupByKeys = groupByKeys;
		}

		public List<String> getExclusions() {
			return this.exclusions;
		}

		public void setExclusions(List<String> exclusions) {
			this.exclusions = exclusions;
		}
	}

	@Override
	public OpsQueryOpsRiskResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryOpsRiskResponseUnmarshaller.unmarshall(this, context);
	}
}
