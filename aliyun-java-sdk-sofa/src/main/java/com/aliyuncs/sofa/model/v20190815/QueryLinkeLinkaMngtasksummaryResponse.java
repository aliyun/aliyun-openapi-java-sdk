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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeLinkaMngtasksummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeLinkaMngtasksummaryResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String classesFileId;

	private String coverageFileId;

	private Long createdAt;

	private Boolean deleted;

	private String group;

	private String id;

	private Boolean onlySummary;

	private Long responseStatusCode;

	private String taskId;

	private Long updatedAt;

	private List<SubCoveragesItem> subCoverages;

	private Summary summary;

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

	public String getClassesFileId() {
		return this.classesFileId;
	}

	public void setClassesFileId(String classesFileId) {
		this.classesFileId = classesFileId;
	}

	public String getCoverageFileId() {
		return this.coverageFileId;
	}

	public void setCoverageFileId(String coverageFileId) {
		this.coverageFileId = coverageFileId;
	}

	public Long getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getOnlySummary() {
		return this.onlySummary;
	}

	public void setOnlySummary(Boolean onlySummary) {
		this.onlySummary = onlySummary;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Long getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Long updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<SubCoveragesItem> getSubCoverages() {
		return this.subCoverages;
	}

	public void setSubCoverages(List<SubCoveragesItem> subCoverages) {
		this.subCoverages = subCoverages;
	}

	public Summary getSummary() {
		return this.summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	public static class SubCoveragesItem {

		private String classesFileId;

		private String coverageFileId;

		private Long createdAt;

		private Boolean deleted;

		private String group;

		private String id;

		private Boolean onlySummary;

		private Boolean reset;

		private String source;

		private String sourceKind;

		private String summary;

		private String taskId;

		private Long updatedAt;

		public String getClassesFileId() {
			return this.classesFileId;
		}

		public void setClassesFileId(String classesFileId) {
			this.classesFileId = classesFileId;
		}

		public String getCoverageFileId() {
			return this.coverageFileId;
		}

		public void setCoverageFileId(String coverageFileId) {
			this.coverageFileId = coverageFileId;
		}

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getOnlySummary() {
			return this.onlySummary;
		}

		public void setOnlySummary(Boolean onlySummary) {
			this.onlySummary = onlySummary;
		}

		public Boolean getReset() {
			return this.reset;
		}

		public void setReset(Boolean reset) {
			this.reset = reset;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getSourceKind() {
			return this.sourceKind;
		}

		public void setSourceKind(String sourceKind) {
			this.sourceKind = sourceKind;
		}

		public String getSummary() {
			return this.summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Long getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(Long updatedAt) {
			this.updatedAt = updatedAt;
		}
	}

	public static class Summary {

		private Long branchCovered;

		private Long branchTotal;

		private Long classCovered;

		private Long classTotal;

		private String coverageId;

		private Long cxtyCovered;

		private Long cxtyTotal;

		private String fullname;

		private String id;

		private Long instrCovered;

		private Long instrTotal;

		private Long lineCovered;

		private Long lineTotal;

		private Long methodCovered;

		private Long methodTotal;

		private String name;

		private String orgId;

		private String parentId;

		private String type;

		public Long getBranchCovered() {
			return this.branchCovered;
		}

		public void setBranchCovered(Long branchCovered) {
			this.branchCovered = branchCovered;
		}

		public Long getBranchTotal() {
			return this.branchTotal;
		}

		public void setBranchTotal(Long branchTotal) {
			this.branchTotal = branchTotal;
		}

		public Long getClassCovered() {
			return this.classCovered;
		}

		public void setClassCovered(Long classCovered) {
			this.classCovered = classCovered;
		}

		public Long getClassTotal() {
			return this.classTotal;
		}

		public void setClassTotal(Long classTotal) {
			this.classTotal = classTotal;
		}

		public String getCoverageId() {
			return this.coverageId;
		}

		public void setCoverageId(String coverageId) {
			this.coverageId = coverageId;
		}

		public Long getCxtyCovered() {
			return this.cxtyCovered;
		}

		public void setCxtyCovered(Long cxtyCovered) {
			this.cxtyCovered = cxtyCovered;
		}

		public Long getCxtyTotal() {
			return this.cxtyTotal;
		}

		public void setCxtyTotal(Long cxtyTotal) {
			this.cxtyTotal = cxtyTotal;
		}

		public String getFullname() {
			return this.fullname;
		}

		public void setFullname(String fullname) {
			this.fullname = fullname;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getInstrCovered() {
			return this.instrCovered;
		}

		public void setInstrCovered(Long instrCovered) {
			this.instrCovered = instrCovered;
		}

		public Long getInstrTotal() {
			return this.instrTotal;
		}

		public void setInstrTotal(Long instrTotal) {
			this.instrTotal = instrTotal;
		}

		public Long getLineCovered() {
			return this.lineCovered;
		}

		public void setLineCovered(Long lineCovered) {
			this.lineCovered = lineCovered;
		}

		public Long getLineTotal() {
			return this.lineTotal;
		}

		public void setLineTotal(Long lineTotal) {
			this.lineTotal = lineTotal;
		}

		public Long getMethodCovered() {
			return this.methodCovered;
		}

		public void setMethodCovered(Long methodCovered) {
			this.methodCovered = methodCovered;
		}

		public Long getMethodTotal() {
			return this.methodTotal;
		}

		public void setMethodTotal(Long methodTotal) {
			this.methodTotal = methodTotal;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOrgId() {
			return this.orgId;
		}

		public void setOrgId(String orgId) {
			this.orgId = orgId;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public QueryLinkeLinkaMngtasksummaryResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeLinkaMngtasksummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
