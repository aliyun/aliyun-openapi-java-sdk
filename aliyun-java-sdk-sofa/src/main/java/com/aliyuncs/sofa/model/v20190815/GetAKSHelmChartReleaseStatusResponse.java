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
import com.aliyuncs.sofa.transform.v20190815.GetAKSHelmChartReleaseStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAKSHelmChartReleaseStatusResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<SubChartReleasesItem> subChartReleases;

	private MainChartRelease mainChartRelease;

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

	public List<SubChartReleasesItem> getSubChartReleases() {
		return this.subChartReleases;
	}

	public void setSubChartReleases(List<SubChartReleasesItem> subChartReleases) {
		this.subChartReleases = subChartReleases;
	}

	public MainChartRelease getMainChartRelease() {
		return this.mainChartRelease;
	}

	public void setMainChartRelease(MainChartRelease mainChartRelease) {
		this.mainChartRelease = mainChartRelease;
	}

	public static class SubChartReleasesItem {

		private String id;

		private String mainChartReleaseId;

		private String releaseLog;

		private Long revision;

		private Long status;

		private String subChartName;

		private String subChartReleaseName;

		private String subChartVersion;

		private Long superseded;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getMainChartReleaseId() {
			return this.mainChartReleaseId;
		}

		public void setMainChartReleaseId(String mainChartReleaseId) {
			this.mainChartReleaseId = mainChartReleaseId;
		}

		public String getReleaseLog() {
			return this.releaseLog;
		}

		public void setReleaseLog(String releaseLog) {
			this.releaseLog = releaseLog;
		}

		public Long getRevision() {
			return this.revision;
		}

		public void setRevision(Long revision) {
			this.revision = revision;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getSubChartName() {
			return this.subChartName;
		}

		public void setSubChartName(String subChartName) {
			this.subChartName = subChartName;
		}

		public String getSubChartReleaseName() {
			return this.subChartReleaseName;
		}

		public void setSubChartReleaseName(String subChartReleaseName) {
			this.subChartReleaseName = subChartReleaseName;
		}

		public String getSubChartVersion() {
			return this.subChartVersion;
		}

		public void setSubChartVersion(String subChartVersion) {
			this.subChartVersion = subChartVersion;
		}

		public Long getSuperseded() {
			return this.superseded;
		}

		public void setSuperseded(Long superseded) {
			this.superseded = superseded;
		}
	}

	public static class MainChartRelease {

		private String chartId;

		private String chartName;

		private String chartVersion;

		private String clusterId;

		private String gmtCreated;

		private String gmtModified;

		private String id;

		private String namespace;

		private String operator;

		private String releaseLog;

		private String releaseName;

		private Long revision;

		private Long status;

		private Long superseded;

		public String getChartId() {
			return this.chartId;
		}

		public void setChartId(String chartId) {
			this.chartId = chartId;
		}

		public String getChartName() {
			return this.chartName;
		}

		public void setChartName(String chartName) {
			this.chartName = chartName;
		}

		public String getChartVersion() {
			return this.chartVersion;
		}

		public void setChartVersion(String chartVersion) {
			this.chartVersion = chartVersion;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

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

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getReleaseLog() {
			return this.releaseLog;
		}

		public void setReleaseLog(String releaseLog) {
			this.releaseLog = releaseLog;
		}

		public String getReleaseName() {
			return this.releaseName;
		}

		public void setReleaseName(String releaseName) {
			this.releaseName = releaseName;
		}

		public Long getRevision() {
			return this.revision;
		}

		public void setRevision(Long revision) {
			this.revision = revision;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public Long getSuperseded() {
			return this.superseded;
		}

		public void setSuperseded(Long superseded) {
			this.superseded = superseded;
		}
	}

	@Override
	public GetAKSHelmChartReleaseStatusResponse getInstance(UnmarshallerContext context) {
		return	GetAKSHelmChartReleaseStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
