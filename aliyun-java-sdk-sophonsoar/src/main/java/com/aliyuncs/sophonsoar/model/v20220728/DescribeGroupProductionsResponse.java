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

package com.aliyuncs.sophonsoar.model.v20220728;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribeGroupProductionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupProductionsResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	private Page page;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public Page getPage() {
		return this.page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class DataItem {

		private String groupName;

		private List<Production> productions;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public List<Production> getProductions() {
			return this.productions;
		}

		public void setProductions(List<Production> productions) {
			this.productions = productions;
		}

		public static class Production {

			private String code;

			private String name;

			private String shortName;

			private String description;

			private String group;

			private String defaultVersion;

			private String defaultDomain;

			private String ramCode;

			private String source;

			private List<PolicyListItem> policyList;

			private List<String> versions;

			private List<String> fullDomains;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getShortName() {
				return this.shortName;
			}

			public void setShortName(String shortName) {
				this.shortName = shortName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getGroup() {
				return this.group;
			}

			public void setGroup(String group) {
				this.group = group;
			}

			public String getDefaultVersion() {
				return this.defaultVersion;
			}

			public void setDefaultVersion(String defaultVersion) {
				this.defaultVersion = defaultVersion;
			}

			public String getDefaultDomain() {
				return this.defaultDomain;
			}

			public void setDefaultDomain(String defaultDomain) {
				this.defaultDomain = defaultDomain;
			}

			public String getRamCode() {
				return this.ramCode;
			}

			public void setRamCode(String ramCode) {
				this.ramCode = ramCode;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public List<PolicyListItem> getPolicyList() {
				return this.policyList;
			}

			public void setPolicyList(List<PolicyListItem> policyList) {
				this.policyList = policyList;
			}

			public List<String> getVersions() {
				return this.versions;
			}

			public void setVersions(List<String> versions) {
				this.versions = versions;
			}

			public List<String> getFullDomains() {
				return this.fullDomains;
			}

			public void setFullDomains(List<String> fullDomains) {
				this.fullDomains = fullDomains;
			}

			public static class PolicyListItem {

				private String policyName;

				private String type;

				public String getPolicyName() {
					return this.policyName;
				}

				public void setPolicyName(String policyName) {
					this.policyName = policyName;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}
	}

	public static class Page {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}
	}

	@Override
	public DescribeGroupProductionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupProductionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
