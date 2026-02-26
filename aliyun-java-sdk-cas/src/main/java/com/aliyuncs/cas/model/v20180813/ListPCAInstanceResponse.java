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

package com.aliyuncs.cas.model.v20180813;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20180813.ListPCAInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPCAInstanceResponse extends AcsResponse {

	private String requestId;

	private Long showSize;

	private Long currentPage;

	private Long totalCount;

	private List<PCAInstance> pCAInstanceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getShowSize() {
		return this.showSize;
	}

	public void setShowSize(Long showSize) {
		this.showSize = showSize;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<PCAInstance> getPCAInstanceList() {
		return this.pCAInstanceList;
	}

	public void setPCAInstanceList(List<PCAInstance> pCAInstanceList) {
		this.pCAInstanceList = pCAInstanceList;
	}

	public static class PCAInstance {

		private Boolean relateStatus;

		private String algorithm;

		private String aliasName;

		private Long issuedCertCount;

		private Long certCount;

		private String instanceUuid;

		private Long endTime;

		private String caIdentifier;

		private Integer shareFlag;

		private String trial;

		public Boolean getRelateStatus() {
			return this.relateStatus;
		}

		public void setRelateStatus(Boolean relateStatus) {
			this.relateStatus = relateStatus;
		}

		public String getAlgorithm() {
			return this.algorithm;
		}

		public void setAlgorithm(String algorithm) {
			this.algorithm = algorithm;
		}

		public String getAliasName() {
			return this.aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}

		public Long getIssuedCertCount() {
			return this.issuedCertCount;
		}

		public void setIssuedCertCount(Long issuedCertCount) {
			this.issuedCertCount = issuedCertCount;
		}

		public Long getCertCount() {
			return this.certCount;
		}

		public void setCertCount(Long certCount) {
			this.certCount = certCount;
		}

		public String getInstanceUuid() {
			return this.instanceUuid;
		}

		public void setInstanceUuid(String instanceUuid) {
			this.instanceUuid = instanceUuid;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getCaIdentifier() {
			return this.caIdentifier;
		}

		public void setCaIdentifier(String caIdentifier) {
			this.caIdentifier = caIdentifier;
		}

		public Integer getShareFlag() {
			return this.shareFlag;
		}

		public void setShareFlag(Integer shareFlag) {
			this.shareFlag = shareFlag;
		}

		public String getTrial() {
			return this.trial;
		}

		public void setTrial(String trial) {
			this.trial = trial;
		}
	}

	@Override
	public ListPCAInstanceResponse getInstance(UnmarshallerContext context) {
		return	ListPCAInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
