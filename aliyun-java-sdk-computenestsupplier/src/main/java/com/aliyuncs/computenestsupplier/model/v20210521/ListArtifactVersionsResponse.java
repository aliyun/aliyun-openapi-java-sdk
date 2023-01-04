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

package com.aliyuncs.computenestsupplier.model.v20210521;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenestsupplier.transform.v20210521.ListArtifactVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListArtifactVersionsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private String maxResults;

	private String totalCount;

	private List<Artifact> artifacts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<Artifact> getArtifacts() {
		return this.artifacts;
	}

	public void setArtifacts(List<Artifact> artifacts) {
		this.artifacts = artifacts;
	}

	public static class Artifact {

		private String artifactId;

		private String artifactType;

		private String versionName;

		private String artifactVersion;

		private String status;

		private String artifactProperty;

		private String supportRegionIds;

		private String gmtModified;

		private String progress;

		private String gmtCreate;

		private Map<Object,Object> imageDelivery;

		private String securityAuditResult;

		private String resultFile;

		public String getArtifactId() {
			return this.artifactId;
		}

		public void setArtifactId(String artifactId) {
			this.artifactId = artifactId;
		}

		public String getArtifactType() {
			return this.artifactType;
		}

		public void setArtifactType(String artifactType) {
			this.artifactType = artifactType;
		}

		public String getVersionName() {
			return this.versionName;
		}

		public void setVersionName(String versionName) {
			this.versionName = versionName;
		}

		public String getArtifactVersion() {
			return this.artifactVersion;
		}

		public void setArtifactVersion(String artifactVersion) {
			this.artifactVersion = artifactVersion;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getArtifactProperty() {
			return this.artifactProperty;
		}

		public void setArtifactProperty(String artifactProperty) {
			this.artifactProperty = artifactProperty;
		}

		public String getSupportRegionIds() {
			return this.supportRegionIds;
		}

		public void setSupportRegionIds(String supportRegionIds) {
			this.supportRegionIds = supportRegionIds;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Map<Object,Object> getImageDelivery() {
			return this.imageDelivery;
		}

		public void setImageDelivery(Map<Object,Object> imageDelivery) {
			this.imageDelivery = imageDelivery;
		}

		public String getSecurityAuditResult() {
			return this.securityAuditResult;
		}

		public void setSecurityAuditResult(String securityAuditResult) {
			this.securityAuditResult = securityAuditResult;
		}

		public String getResultFile() {
			return this.resultFile;
		}

		public void setResultFile(String resultFile) {
			this.resultFile = resultFile;
		}
	}

	@Override
	public ListArtifactVersionsResponse getInstance(UnmarshallerContext context) {
		return	ListArtifactVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
