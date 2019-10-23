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
import com.aliyuncs.edas.transform.v20170801.ListDegradeControlsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDegradeControlsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private FlowControlsMap flowControlsMap;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public FlowControlsMap getFlowControlsMap() {
		return this.flowControlsMap;
	}

	public void setFlowControlsMap(FlowControlsMap flowControlsMap) {
		this.flowControlsMap = flowControlsMap;
	}

	public static class FlowControlsMap {

		private String appId;

		private String appName;

		private List<InterfaceMethod> interfaceMethods;

		private RuleList ruleList;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public List<InterfaceMethod> getInterfaceMethods() {
			return this.interfaceMethods;
		}

		public void setInterfaceMethods(List<InterfaceMethod> interfaceMethods) {
			this.interfaceMethods = interfaceMethods;
		}

		public RuleList getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(RuleList ruleList) {
			this.ruleList = ruleList;
		}

		public static class InterfaceMethod {

			private String name;

			private String version;

			private List<String> methods;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public List<String> getMethods() {
				return this.methods;
			}

			public void setMethods(List<String> methods) {
				this.methods = methods;
			}
		}

		public static class RuleList {

			private Integer currentPage;

			private Integer pageSize;

			private Integer totalSize;

			private List<Rule> ruleResultList;

			public Integer getCurrentPage() {
				return this.currentPage;
			}

			public void setCurrentPage(Integer currentPage) {
				this.currentPage = currentPage;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Integer getTotalSize() {
				return this.totalSize;
			}

			public void setTotalSize(Integer totalSize) {
				this.totalSize = totalSize;
			}

			public List<Rule> getRuleResultList() {
				return this.ruleResultList;
			}

			public void setRuleResultList(List<Rule> ruleResultList) {
				this.ruleResultList = ruleResultList;
			}

			public static class Rule {

				private String appId;

				private String ruleId;

				private Long createTime;

				private Long updateTime;

				private String resource;

				private Integer rtThreshold;

				private Integer duration;

				private Integer state;

				private String ruleType;

				public String getAppId() {
					return this.appId;
				}

				public void setAppId(String appId) {
					this.appId = appId;
				}

				public String getRuleId() {
					return this.ruleId;
				}

				public void setRuleId(String ruleId) {
					this.ruleId = ruleId;
				}

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public Long getUpdateTime() {
					return this.updateTime;
				}

				public void setUpdateTime(Long updateTime) {
					this.updateTime = updateTime;
				}

				public String getResource() {
					return this.resource;
				}

				public void setResource(String resource) {
					this.resource = resource;
				}

				public Integer getRtThreshold() {
					return this.rtThreshold;
				}

				public void setRtThreshold(Integer rtThreshold) {
					this.rtThreshold = rtThreshold;
				}

				public Integer getDuration() {
					return this.duration;
				}

				public void setDuration(Integer duration) {
					this.duration = duration;
				}

				public Integer getState() {
					return this.state;
				}

				public void setState(Integer state) {
					this.state = state;
				}

				public String getRuleType() {
					return this.ruleType;
				}

				public void setRuleType(String ruleType) {
					this.ruleType = ruleType;
				}
			}
		}
	}

	@Override
	public ListDegradeControlsResponse getInstance(UnmarshallerContext context) {
		return	ListDegradeControlsResponseUnmarshaller.unmarshall(this, context);
	}
}
