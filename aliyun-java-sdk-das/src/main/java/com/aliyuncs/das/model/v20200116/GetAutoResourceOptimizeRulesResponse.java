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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetAutoResourceOptimizeRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAutoResourceOptimizeRulesResponse extends AcsResponse {

	private Long code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
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

		private Long totalAutoResourceOptimizeRulesCount;

		private Long enableAutoResourceOptimizeCount;

		private Long turnOffAutoResourceOptimizeCount;

		private Long hasEnableRuleButNotDasProCount;

		private Long neverEnableAutoResourceOptimizeOrReleasedInstanceCount;

		private List<EnableAutoResourceOptimizeListItem> enableAutoResourceOptimizeList;

		private List<TurnOffAutoResourceOptimizeListItem> turnOffAutoResourceOptimizeList;

		private List<HasEnableRuleButNotDasProListItem> hasEnableRuleButNotDasProList;

		private List<String> neverEnableAutoResourceOptimizeOrReleasedInstanceIdList;

		public Long getTotalAutoResourceOptimizeRulesCount() {
			return this.totalAutoResourceOptimizeRulesCount;
		}

		public void setTotalAutoResourceOptimizeRulesCount(Long totalAutoResourceOptimizeRulesCount) {
			this.totalAutoResourceOptimizeRulesCount = totalAutoResourceOptimizeRulesCount;
		}

		public Long getEnableAutoResourceOptimizeCount() {
			return this.enableAutoResourceOptimizeCount;
		}

		public void setEnableAutoResourceOptimizeCount(Long enableAutoResourceOptimizeCount) {
			this.enableAutoResourceOptimizeCount = enableAutoResourceOptimizeCount;
		}

		public Long getTurnOffAutoResourceOptimizeCount() {
			return this.turnOffAutoResourceOptimizeCount;
		}

		public void setTurnOffAutoResourceOptimizeCount(Long turnOffAutoResourceOptimizeCount) {
			this.turnOffAutoResourceOptimizeCount = turnOffAutoResourceOptimizeCount;
		}

		public Long getHasEnableRuleButNotDasProCount() {
			return this.hasEnableRuleButNotDasProCount;
		}

		public void setHasEnableRuleButNotDasProCount(Long hasEnableRuleButNotDasProCount) {
			this.hasEnableRuleButNotDasProCount = hasEnableRuleButNotDasProCount;
		}

		public Long getNeverEnableAutoResourceOptimizeOrReleasedInstanceCount() {
			return this.neverEnableAutoResourceOptimizeOrReleasedInstanceCount;
		}

		public void setNeverEnableAutoResourceOptimizeOrReleasedInstanceCount(Long neverEnableAutoResourceOptimizeOrReleasedInstanceCount) {
			this.neverEnableAutoResourceOptimizeOrReleasedInstanceCount = neverEnableAutoResourceOptimizeOrReleasedInstanceCount;
		}

		public List<EnableAutoResourceOptimizeListItem> getEnableAutoResourceOptimizeList() {
			return this.enableAutoResourceOptimizeList;
		}

		public void setEnableAutoResourceOptimizeList(List<EnableAutoResourceOptimizeListItem> enableAutoResourceOptimizeList) {
			this.enableAutoResourceOptimizeList = enableAutoResourceOptimizeList;
		}

		public List<TurnOffAutoResourceOptimizeListItem> getTurnOffAutoResourceOptimizeList() {
			return this.turnOffAutoResourceOptimizeList;
		}

		public void setTurnOffAutoResourceOptimizeList(List<TurnOffAutoResourceOptimizeListItem> turnOffAutoResourceOptimizeList) {
			this.turnOffAutoResourceOptimizeList = turnOffAutoResourceOptimizeList;
		}

		public List<HasEnableRuleButNotDasProListItem> getHasEnableRuleButNotDasProList() {
			return this.hasEnableRuleButNotDasProList;
		}

		public void setHasEnableRuleButNotDasProList(List<HasEnableRuleButNotDasProListItem> hasEnableRuleButNotDasProList) {
			this.hasEnableRuleButNotDasProList = hasEnableRuleButNotDasProList;
		}

		public List<String> getNeverEnableAutoResourceOptimizeOrReleasedInstanceIdList() {
			return this.neverEnableAutoResourceOptimizeOrReleasedInstanceIdList;
		}

		public void setNeverEnableAutoResourceOptimizeOrReleasedInstanceIdList(List<String> neverEnableAutoResourceOptimizeOrReleasedInstanceIdList) {
			this.neverEnableAutoResourceOptimizeOrReleasedInstanceIdList = neverEnableAutoResourceOptimizeOrReleasedInstanceIdList;
		}

		public static class EnableAutoResourceOptimizeListItem {

			private String instanceId;

			private Boolean autoDefragment;

			private Double tableSpaceSize;

			private Boolean dasProOn;

			private Double tableFragmentationRatio;

			private String userId;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Boolean getAutoDefragment() {
				return this.autoDefragment;
			}

			public void setAutoDefragment(Boolean autoDefragment) {
				this.autoDefragment = autoDefragment;
			}

			public Double getTableSpaceSize() {
				return this.tableSpaceSize;
			}

			public void setTableSpaceSize(Double tableSpaceSize) {
				this.tableSpaceSize = tableSpaceSize;
			}

			public Boolean getDasProOn() {
				return this.dasProOn;
			}

			public void setDasProOn(Boolean dasProOn) {
				this.dasProOn = dasProOn;
			}

			public Double getTableFragmentationRatio() {
				return this.tableFragmentationRatio;
			}

			public void setTableFragmentationRatio(Double tableFragmentationRatio) {
				this.tableFragmentationRatio = tableFragmentationRatio;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}

		public static class TurnOffAutoResourceOptimizeListItem {

			private String instanceId;

			private Boolean autoDefragment;

			private Double tableSpaceSize;

			private Boolean dasProOn;

			private Double tableFragmentationRatio;

			private String userId;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Boolean getAutoDefragment() {
				return this.autoDefragment;
			}

			public void setAutoDefragment(Boolean autoDefragment) {
				this.autoDefragment = autoDefragment;
			}

			public Double getTableSpaceSize() {
				return this.tableSpaceSize;
			}

			public void setTableSpaceSize(Double tableSpaceSize) {
				this.tableSpaceSize = tableSpaceSize;
			}

			public Boolean getDasProOn() {
				return this.dasProOn;
			}

			public void setDasProOn(Boolean dasProOn) {
				this.dasProOn = dasProOn;
			}

			public Double getTableFragmentationRatio() {
				return this.tableFragmentationRatio;
			}

			public void setTableFragmentationRatio(Double tableFragmentationRatio) {
				this.tableFragmentationRatio = tableFragmentationRatio;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}

		public static class HasEnableRuleButNotDasProListItem {

			private String instanceId;

			private Boolean autoDefragment;

			private Double tableSpaceSize;

			private Boolean dasProOn;

			private Double tableFragmentationRatio;

			private String userId;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Boolean getAutoDefragment() {
				return this.autoDefragment;
			}

			public void setAutoDefragment(Boolean autoDefragment) {
				this.autoDefragment = autoDefragment;
			}

			public Double getTableSpaceSize() {
				return this.tableSpaceSize;
			}

			public void setTableSpaceSize(Double tableSpaceSize) {
				this.tableSpaceSize = tableSpaceSize;
			}

			public Boolean getDasProOn() {
				return this.dasProOn;
			}

			public void setDasProOn(Boolean dasProOn) {
				this.dasProOn = dasProOn;
			}

			public Double getTableFragmentationRatio() {
				return this.tableFragmentationRatio;
			}

			public void setTableFragmentationRatio(Double tableFragmentationRatio) {
				this.tableFragmentationRatio = tableFragmentationRatio;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public GetAutoResourceOptimizeRulesResponse getInstance(UnmarshallerContext context) {
		return	GetAutoResourceOptimizeRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
