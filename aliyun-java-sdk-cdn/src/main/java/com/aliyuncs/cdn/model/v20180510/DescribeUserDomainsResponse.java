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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeUserDomainsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserDomainsResponse extends AcsResponse {

	private String requestId;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private List<PageData> domains;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<PageData> getDomains() {
		return this.domains;
	}

	public void setDomains(List<PageData> domains) {
		this.domains = domains;
	}

	public static class PageData {

		private String sslProtocol;

		private String sandbox;

		private String gmtModified;

		private String domainName;

		private Long domainId;

		private String gmtCreated;

		private String description;

		private String coverage;

		private String resourceGroupId;

		private String cname;

		private String domainStatus;

		private String cdnType;

		private List<Source> sources;

		public String getSslProtocol() {
			return this.sslProtocol;
		}

		public void setSslProtocol(String sslProtocol) {
			this.sslProtocol = sslProtocol;
		}

		public String getSandbox() {
			return this.sandbox;
		}

		public void setSandbox(String sandbox) {
			this.sandbox = sandbox;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Long getDomainId() {
			return this.domainId;
		}

		public void setDomainId(Long domainId) {
			this.domainId = domainId;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCoverage() {
			return this.coverage;
		}

		public void setCoverage(String coverage) {
			this.coverage = coverage;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getCname() {
			return this.cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getDomainStatus() {
			return this.domainStatus;
		}

		public void setDomainStatus(String domainStatus) {
			this.domainStatus = domainStatus;
		}

		public String getCdnType() {
			return this.cdnType;
		}

		public void setCdnType(String cdnType) {
			this.cdnType = cdnType;
		}

		public List<Source> getSources() {
			return this.sources;
		}

		public void setSources(List<Source> sources) {
			this.sources = sources;
		}

		public static class Source {

			private String type;

			private String weight;

			private String priority;

			private Integer port;

			private String content;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getWeight() {
				return this.weight;
			}

			public void setWeight(String weight) {
				this.weight = weight;
			}

			public String getPriority() {
				return this.priority;
			}

			public void setPriority(String priority) {
				this.priority = priority;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	@Override
	public DescribeUserDomainsResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserDomainsResponseUnmarshaller.unmarshall(this, context);
	}
}
