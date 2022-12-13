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

package com.aliyuncs.cs.model.v20151215;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribePolicyGovernanceInClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolicyGovernanceInClusterResponse extends AcsResponse {

	private List<On_stateItem> on_state;

	private Admit_log admit_log;

	private TotalViolations totalViolations;

	private Violations violations;

	public List<On_stateItem> getOn_state() {
		return this.on_state;
	}

	public void setOn_state(List<On_stateItem> on_state) {
		this.on_state = on_state;
	}

	public Admit_log getAdmit_log() {
		return this.admit_log;
	}

	public void setAdmit_log(Admit_log admit_log) {
		this.admit_log = admit_log;
	}

	public TotalViolations getTotalViolations() {
		return this.totalViolations;
	}

	public void setTotalViolations(TotalViolations totalViolations) {
		this.totalViolations = totalViolations;
	}

	public Violations getViolations() {
		return this.violations;
	}

	public void setViolations(Violations violations) {
		this.violations = violations;
	}

	public static class On_stateItem {

		private Integer enabled_count;

		private Integer total;

		private String severity;

		public Integer getEnabled_count() {
			return this.enabled_count;
		}

		public void setEnabled_count(Integer enabled_count) {
			this.enabled_count = enabled_count;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}
	}

	public static class Admit_log {

		private String progress;

		private Long count;

		private Log log;

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Log getLog() {
			return this.log;
		}

		public void setLog(Log log) {
			this.log = log;
		}

		public static class Log {

			private String msg;

			private String cluster_id;

			private String constraint_kind;

			private String resource_name;

			private String resource_kind;

			private String resource_namespace;

			public String getMsg() {
				return this.msg;
			}

			public void setMsg(String msg) {
				this.msg = msg;
			}

			public String getCluster_id() {
				return this.cluster_id;
			}

			public void setCluster_id(String cluster_id) {
				this.cluster_id = cluster_id;
			}

			public String getConstraint_kind() {
				return this.constraint_kind;
			}

			public void setConstraint_kind(String constraint_kind) {
				this.constraint_kind = constraint_kind;
			}

			public String getResource_name() {
				return this.resource_name;
			}

			public void setResource_name(String resource_name) {
				this.resource_name = resource_name;
			}

			public String getResource_kind() {
				return this.resource_kind;
			}

			public void setResource_kind(String resource_kind) {
				this.resource_kind = resource_kind;
			}

			public String getResource_namespace() {
				return this.resource_namespace;
			}

			public void setResource_namespace(String resource_namespace) {
				this.resource_namespace = resource_namespace;
			}
		}
	}

	public static class TotalViolations {

		private Deny deny;

		private Warn warn;

		public Deny getDeny() {
			return this.deny;
		}

		public void setDeny(Deny deny) {
			this.deny = deny;
		}

		public Warn getWarn() {
			return this.warn;
		}

		public void setWarn(Warn warn) {
			this.warn = warn;
		}

		public static class Deny {

			private String severity;

			private Long violations;

			public String getSeverity() {
				return this.severity;
			}

			public void setSeverity(String severity) {
				this.severity = severity;
			}

			public Long getViolations() {
				return this.violations;
			}

			public void setViolations(Long violations) {
				this.violations = violations;
			}
		}

		public static class Warn {

			private String severity;

			private Long violations;

			public String getSeverity() {
				return this.severity;
			}

			public void setSeverity(String severity) {
				this.severity = severity;
			}

			public Long getViolations() {
				return this.violations;
			}

			public void setViolations(Long violations) {
				this.violations = violations;
			}
		}
	}

	public static class Violations {

		private Deny1 deny1;

		private Warn2 warn2;

		public Deny1 getDeny1() {
			return this.deny1;
		}

		public void setDeny1(Deny1 deny1) {
			this.deny1 = deny1;
		}

		public Warn2 getWarn2() {
			return this.warn2;
		}

		public void setWarn2(Warn2 warn2) {
			this.warn2 = warn2;
		}

		public static class Deny1 {

			private String policyName;

			private String policyDescription;

			private Long violations;

			private String severity;

			public String getPolicyName() {
				return this.policyName;
			}

			public void setPolicyName(String policyName) {
				this.policyName = policyName;
			}

			public String getPolicyDescription() {
				return this.policyDescription;
			}

			public void setPolicyDescription(String policyDescription) {
				this.policyDescription = policyDescription;
			}

			public Long getViolations() {
				return this.violations;
			}

			public void setViolations(Long violations) {
				this.violations = violations;
			}

			public String getSeverity() {
				return this.severity;
			}

			public void setSeverity(String severity) {
				this.severity = severity;
			}
		}

		public static class Warn2 {

			private String policyName;

			private String policyDescription;

			private Long violations;

			private String severity;

			public String getPolicyName() {
				return this.policyName;
			}

			public void setPolicyName(String policyName) {
				this.policyName = policyName;
			}

			public String getPolicyDescription() {
				return this.policyDescription;
			}

			public void setPolicyDescription(String policyDescription) {
				this.policyDescription = policyDescription;
			}

			public Long getViolations() {
				return this.violations;
			}

			public void setViolations(Long violations) {
				this.violations = violations;
			}

			public String getSeverity() {
				return this.severity;
			}

			public void setSeverity(String severity) {
				this.severity = severity;
			}
		}
	}

	@Override
	public DescribePolicyGovernanceInClusterResponse getInstance(UnmarshallerContext context) {
		return	DescribePolicyGovernanceInClusterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
