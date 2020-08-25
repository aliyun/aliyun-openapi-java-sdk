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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryMsSgDowngradeGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMsSgDowngradeGroupsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long currentPage;

	private Long pageSize;

	private Long totalSize;

	private List<DowngradeRuleGroupsItem> downgradeRuleGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public List<DowngradeRuleGroupsItem> getDowngradeRuleGroups() {
		return this.downgradeRuleGroups;
	}

	public void setDowngradeRuleGroups(List<DowngradeRuleGroupsItem> downgradeRuleGroups) {
		this.downgradeRuleGroups = downgradeRuleGroups;
	}

	public static class DowngradeRuleGroupsItem {

		private String appName;

		private Long enabled;

		private Long id;

		private String instanceId;

		private String type;

		private List<DowngradeRulesItem> downgradeRules;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Long getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Long enabled) {
			this.enabled = enabled;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<DowngradeRulesItem> getDowngradeRules() {
			return this.downgradeRules;
		}

		public void setDowngradeRules(List<DowngradeRulesItem> downgradeRules) {
			this.downgradeRules = downgradeRules;
		}

		public static class DowngradeRulesItem {

			private String downgradeAction;

			private String downgradeMethod;

			private String downgradeService;

			private Long enabled;

			private String gmtModified;

			private Long groupId;

			private Long id;

			private String instanceId;

			private String mode;

			private String ruleName;

			public String getDowngradeAction() {
				return this.downgradeAction;
			}

			public void setDowngradeAction(String downgradeAction) {
				this.downgradeAction = downgradeAction;
			}

			public String getDowngradeMethod() {
				return this.downgradeMethod;
			}

			public void setDowngradeMethod(String downgradeMethod) {
				this.downgradeMethod = downgradeMethod;
			}

			public String getDowngradeService() {
				return this.downgradeService;
			}

			public void setDowngradeService(String downgradeService) {
				this.downgradeService = downgradeService;
			}

			public Long getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Long enabled) {
				this.enabled = enabled;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Long groupId) {
				this.groupId = groupId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getMode() {
				return this.mode;
			}

			public void setMode(String mode) {
				this.mode = mode;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}
		}
	}

	@Override
	public QueryMsSgDowngradeGroupsResponse getInstance(UnmarshallerContext context) {
		return	QueryMsSgDowngradeGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
