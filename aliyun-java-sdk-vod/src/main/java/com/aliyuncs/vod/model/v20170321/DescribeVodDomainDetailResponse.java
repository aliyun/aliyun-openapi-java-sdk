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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribeVodDomainDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodDomainDetailResponse extends AcsResponse {

	private String requestId;

	private DomainDetail domainDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DomainDetail getDomainDetail() {
		return this.domainDetail;
	}

	public void setDomainDetail(DomainDetail domainDetail) {
		this.domainDetail = domainDetail;
	}

	public static class DomainDetail {

		private String gmtCreated;

		private String weight;

		private String sSLPub;

		private String description;

		private String sSLProtocol;

		private String certName;

		private String scope;

		private String cname;

		private String domainStatus;

		private String gmtModified;

		private String domainName;

		private List<Source> sources;

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getWeight() {
			return this.weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		public String getSSLPub() {
			return this.sSLPub;
		}

		public void setSSLPub(String sSLPub) {
			this.sSLPub = sSLPub;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSSLProtocol() {
			return this.sSLProtocol;
		}

		public void setSSLProtocol(String sSLProtocol) {
			this.sSLProtocol = sSLProtocol;
		}

		public String getCertName() {
			return this.certName;
		}

		public void setCertName(String certName) {
			this.certName = certName;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
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

		public List<Source> getSources() {
			return this.sources;
		}

		public void setSources(List<Source> sources) {
			this.sources = sources;
		}

		public static class Source {

			private String type;

			private String priority;

			private Integer port;

			private String content;

			private String enabled;

			private String weight;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
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

			public String getEnabled() {
				return this.enabled;
			}

			public void setEnabled(String enabled) {
				this.enabled = enabled;
			}

			public String getWeight() {
				return this.weight;
			}

			public void setWeight(String weight) {
				this.weight = weight;
			}
		}
	}

	@Override
	public DescribeVodDomainDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodDomainDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
