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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeVServerGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVServerGroupsResponse extends AcsResponse {

	private String requestId;

	private List<VServerGroup> vServerGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VServerGroup> getVServerGroups() {
		return this.vServerGroups;
	}

	public void setVServerGroups(List<VServerGroup> vServerGroups) {
		this.vServerGroups = vServerGroups;
	}

	public static class VServerGroup {

		private String vServerGroupId;

		private String vServerGroupName;

		private AssociatedObjects associatedObjects;

		public String getVServerGroupId() {
			return this.vServerGroupId;
		}

		public void setVServerGroupId(String vServerGroupId) {
			this.vServerGroupId = vServerGroupId;
		}

		public String getVServerGroupName() {
			return this.vServerGroupName;
		}

		public void setVServerGroupName(String vServerGroupName) {
			this.vServerGroupName = vServerGroupName;
		}

		public AssociatedObjects getAssociatedObjects() {
			return this.associatedObjects;
		}

		public void setAssociatedObjects(AssociatedObjects associatedObjects) {
			this.associatedObjects = associatedObjects;
		}

		public static class AssociatedObjects {

			private List<Listener> listeners;

			private List<Rule> rules;

			public List<Listener> getListeners() {
				return this.listeners;
			}

			public void setListeners(List<Listener> listeners) {
				this.listeners = listeners;
			}

			public List<Rule> getRules() {
				return this.rules;
			}

			public void setRules(List<Rule> rules) {
				this.rules = rules;
			}

			public static class Listener {

				private String protocol;

				private Integer port;

				public String getBizProtocol() {
					return this.protocol;
				}

				public void setBizProtocol(String protocol) {
					this.protocol = protocol;
				}

				/**
				 * @deprecated use getBizProtocol instead of this.
				 */
				@Deprecated
				public String getProtocol() {
					return this.protocol;
				}

				/**
				 * @deprecated use setBizProtocol instead of this.
				 */
				@Deprecated
				public void setProtocol(String protocol) {
					this.protocol = protocol;
				}

				public Integer getPort() {
					return this.port;
				}

				public void setPort(Integer port) {
					this.port = port;
				}
			}

			public static class Rule {

				private String ruleId;

				private String domain;

				private String url;

				private String ruleName;

				public String getRuleId() {
					return this.ruleId;
				}

				public void setRuleId(String ruleId) {
					this.ruleId = ruleId;
				}

				public String getBizDomain() {
					return this.domain;
				}

				public void setBizDomain(String domain) {
					this.domain = domain;
				}

				/**
				 * @deprecated use getBizDomain instead of this.
				 */
				@Deprecated
				public String getDomain() {
					return this.domain;
				}

				/**
				 * @deprecated use setBizDomain instead of this.
				 */
				@Deprecated
				public void setDomain(String domain) {
					this.domain = domain;
				}

				public String getBizUrl() {
					return this.url;
				}

				public void setBizUrl(String url) {
					this.url = url;
				}

				/**
				 * @deprecated use getBizUrl instead of this.
				 */
				@Deprecated
				public String getUrl() {
					return this.url;
				}

				/**
				 * @deprecated use setBizUrl instead of this.
				 */
				@Deprecated
				public void setUrl(String url) {
					this.url = url;
				}

				public String getRuleName() {
					return this.ruleName;
				}

				public void setRuleName(String ruleName) {
					this.ruleName = ruleName;
				}
			}
		}
	}

	@Override
	public DescribeVServerGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVServerGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
