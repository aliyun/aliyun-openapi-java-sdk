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

package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeCdnDomainDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnDomainDetailResponse extends AcsResponse {

	private String requestId;

	private GetDomainDetailModel getDomainDetailModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public GetDomainDetailModel getGetDomainDetailModel() {
		return this.getDomainDetailModel;
	}

	public void setGetDomainDetailModel(GetDomainDetailModel getDomainDetailModel) {
		this.getDomainDetailModel = getDomainDetailModel;
	}

	public static class GetDomainDetailModel {

		private String gmtCreated;

		private String gmtModified;

		private String sourceType;

		private String domainStatus;

		private Integer sourcePort;

		private String cdnType;

		private String cname;

		private String httpsCname;

		private String domainName;

		private String description;

		private String serverCertificateStatus;

		private String region;

		private String scope;

		private String resourceGroupId;

		private List<SourceModel> sourceModels;

		private List<String> sources;

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getDomainStatus() {
			return this.domainStatus;
		}

		public void setDomainStatus(String domainStatus) {
			this.domainStatus = domainStatus;
		}

		public Integer getSourcePort() {
			return this.sourcePort;
		}

		public void setSourcePort(Integer sourcePort) {
			this.sourcePort = sourcePort;
		}

		public String getCdnType() {
			return this.cdnType;
		}

		public void setCdnType(String cdnType) {
			this.cdnType = cdnType;
		}

		public String getCname() {
			return this.cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getHttpsCname() {
			return this.httpsCname;
		}

		public void setHttpsCname(String httpsCname) {
			this.httpsCname = httpsCname;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getServerCertificateStatus() {
			return this.serverCertificateStatus;
		}

		public void setServerCertificateStatus(String serverCertificateStatus) {
			this.serverCertificateStatus = serverCertificateStatus;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<SourceModel> getSourceModels() {
			return this.sourceModels;
		}

		public void setSourceModels(List<SourceModel> sourceModels) {
			this.sourceModels = sourceModels;
		}

		public List<String> getSources() {
			return this.sources;
		}

		public void setSources(List<String> sources) {
			this.sources = sources;
		}

		public static class SourceModel {

			private String content;

			private String type;

			private Integer port;

			private String enabled;

			private String priority;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getEnabled() {
				return this.enabled;
			}

			public void setEnabled(String enabled) {
				this.enabled = enabled;
			}

			public String getPriority() {
				return this.priority;
			}

			public void setPriority(String priority) {
				this.priority = priority;
			}
		}
	}

	@Override
	public DescribeCdnDomainDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnDomainDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
