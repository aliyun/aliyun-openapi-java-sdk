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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.ListRepoTagScanResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRepoTagScanResultResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private Integer pageNo;

	private Integer pageSize;

	private Integer totalCount;

	private List<VulnerabilitiesItem> vulnerabilities;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
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

	public List<VulnerabilitiesItem> getVulnerabilities() {
		return this.vulnerabilities;
	}

	public void setVulnerabilities(List<VulnerabilitiesItem> vulnerabilities) {
		this.vulnerabilities = vulnerabilities;
	}

	public static class VulnerabilitiesItem {

		private String feature;

		private String version;

		private String versionFormat;

		private String addedBy;

		private String cveName;

		private String cveLink;

		private String description;

		private String severity;

		private String versionFixed;

		public String getFeature() {
			return this.feature;
		}

		public void setFeature(String feature) {
			this.feature = feature;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getVersionFormat() {
			return this.versionFormat;
		}

		public void setVersionFormat(String versionFormat) {
			this.versionFormat = versionFormat;
		}

		public String getAddedBy() {
			return this.addedBy;
		}

		public void setAddedBy(String addedBy) {
			this.addedBy = addedBy;
		}

		public String getCveName() {
			return this.cveName;
		}

		public void setCveName(String cveName) {
			this.cveName = cveName;
		}

		public String getCveLink() {
			return this.cveLink;
		}

		public void setCveLink(String cveLink) {
			this.cveLink = cveLink;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}

		public String getVersionFixed() {
			return this.versionFixed;
		}

		public void setVersionFixed(String versionFixed) {
			this.versionFixed = versionFixed;
		}
	}

	@Override
	public ListRepoTagScanResultResponse getInstance(UnmarshallerContext context) {
		return	ListRepoTagScanResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
