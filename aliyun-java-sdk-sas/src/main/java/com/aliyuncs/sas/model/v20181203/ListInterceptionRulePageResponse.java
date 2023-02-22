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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ListInterceptionRulePageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInterceptionRulePageResponse extends AcsResponse {

	private String requestId;

	private List<Rule> interceptionRuleList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Rule> getInterceptionRuleList() {
		return this.interceptionRuleList;
	}

	public void setInterceptionRuleList(List<Rule> interceptionRuleList) {
		this.interceptionRuleList = interceptionRuleList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Rule {

		private String ruleType;

		private Integer ruleSwitch;

		private Long ruleId;

		private String ruleName;

		private Long orderIndex;

		private Long interceptType;

		private SrcTarget srcTarget;

		private DstTarget dstTarget;

		public String getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(String ruleType) {
			this.ruleType = ruleType;
		}

		public Integer getRuleSwitch() {
			return this.ruleSwitch;
		}

		public void setRuleSwitch(Integer ruleSwitch) {
			this.ruleSwitch = ruleSwitch;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public Long getOrderIndex() {
			return this.orderIndex;
		}

		public void setOrderIndex(Long orderIndex) {
			this.orderIndex = orderIndex;
		}

		public Long getInterceptType() {
			return this.interceptType;
		}

		public void setInterceptType(Long interceptType) {
			this.interceptType = interceptType;
		}

		public SrcTarget getSrcTarget() {
			return this.srcTarget;
		}

		public void setSrcTarget(SrcTarget srcTarget) {
			this.srcTarget = srcTarget;
		}

		public DstTarget getDstTarget() {
			return this.dstTarget;
		}

		public void setDstTarget(DstTarget dstTarget) {
			this.dstTarget = dstTarget;
		}

		public static class SrcTarget {

			private String appName;

			private String ruleType;

			private Integer targetId;

			private String targetName;

			private String namespace;

			private String targetType;

			private List<String> imageList;

			private List<String> tagList;

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getRuleType() {
				return this.ruleType;
			}

			public void setRuleType(String ruleType) {
				this.ruleType = ruleType;
			}

			public Integer getTargetId() {
				return this.targetId;
			}

			public void setTargetId(Integer targetId) {
				this.targetId = targetId;
			}

			public String getTargetName() {
				return this.targetName;
			}

			public void setTargetName(String targetName) {
				this.targetName = targetName;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public List<String> getImageList() {
				return this.imageList;
			}

			public void setImageList(List<String> imageList) {
				this.imageList = imageList;
			}

			public List<String> getTagList() {
				return this.tagList;
			}

			public void setTagList(List<String> tagList) {
				this.tagList = tagList;
			}
		}

		public static class DstTarget {

			private String appName;

			private String ruleType;

			private Integer targetId;

			private String targetName;

			private String namespace;

			private String targetType;

			private List<String> ports;

			private List<String> imageList1;

			private List<String> tagList2;

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getRuleType() {
				return this.ruleType;
			}

			public void setRuleType(String ruleType) {
				this.ruleType = ruleType;
			}

			public Integer getTargetId() {
				return this.targetId;
			}

			public void setTargetId(Integer targetId) {
				this.targetId = targetId;
			}

			public String getTargetName() {
				return this.targetName;
			}

			public void setTargetName(String targetName) {
				this.targetName = targetName;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public List<String> getPorts() {
				return this.ports;
			}

			public void setPorts(List<String> ports) {
				this.ports = ports;
			}

			public List<String> getImageList1() {
				return this.imageList1;
			}

			public void setImageList1(List<String> imageList1) {
				this.imageList1 = imageList1;
			}

			public List<String> getTagList2() {
				return this.tagList2;
			}

			public void setTagList2(List<String> tagList2) {
				this.tagList2 = tagList2;
			}
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public ListInterceptionRulePageResponse getInstance(UnmarshallerContext context) {
		return	ListInterceptionRulePageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
