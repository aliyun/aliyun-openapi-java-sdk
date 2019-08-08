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

package com.aliyuncs.rdc.model.v20180821;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rdc.transform.v20180821.SearchWorkitemWithTotalCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchWorkitemWithTotalCountResponse extends AcsResponse {

	private Integer code;

	private Boolean success;

	private String requestId;

	private Integer totalCount;

	private Integer totalPages;

	private Integer toPage;

	private Integer pageSize;

	private List<DataItem> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getToPage() {
		return this.toPage;
	}

	public void setToPage(Integer toPage) {
		this.toPage = toPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Integer sourceId;

		private String trackers;

		private Integer closedDuration;

		private Boolean sendWangwang;

		private Integer verifierId;

		private String issueRelations;

		private Boolean moduleUpdated;

		private String seriousLevel;

		private String subject;

		private Boolean attachmented;

		private String source;

		private String akPaths;

		private Integer templateId;

		private Integer priorityId;

		private Long createdAt;

		private Integer testsuiteId;

		private Integer solution;

		private Integer statusStage;

		private Integer respondDuration;

		private String watcherIdList;

		private String trackerIds;

		private Integer seriousLevelId;

		private String versionList;

		private Integer id;

		private String verifierStaffId;

		private Long updatedAt;

		private String relatedAKProjectGuids;

		private String scopeUserIds;

		private String priority;

		private String relatedAKProjectIds;

		private Long commitDate;

		private Integer devDuration;

		private Integer fixedDuration;

		private String blackListNotice;

		private Integer sprintId;

		private Integer versionId;

		private Boolean watched;

		private String idPath;

		private String moduleList;

		private Integer statusId;

		private String assignedToIdList;

		private String userStaffId;

		private String attachmentIds;

		private Boolean recordChangeLog;

		private String region;

		private Integer projectId;

		private Boolean skipCollab;

		private String tagIdList;

		private String status;

		private Integer assignedToId;

		private String commentList;

		private String versionIds;

		private String stamp;

		private String akVersionIds;

		private String projectIds;

		private String changeLogList;

		private String assignedTo;

		private Boolean ignoreIntegrate;

		private String moduleIds;

		private Integer issueTypeId;

		private String attachmentList;

		private String logicalStatus;

		private Integer scope;

		private String assignedToIds;

		private String assignedToStaffId;

		private Integer userId;

		private String linePath;

		private Integer parentId;

		private Integer fixedUserId;

		private Boolean ignoreCheck;

		private String verifier;

		private Integer akProjectId;

		private String relatedUserIds;

		private String user;

		public Integer getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(Integer sourceId) {
			this.sourceId = sourceId;
		}

		public String getTrackers() {
			return this.trackers;
		}

		public void setTrackers(String trackers) {
			this.trackers = trackers;
		}

		public Integer getClosedDuration() {
			return this.closedDuration;
		}

		public void setClosedDuration(Integer closedDuration) {
			this.closedDuration = closedDuration;
		}

		public Boolean getSendWangwang() {
			return this.sendWangwang;
		}

		public void setSendWangwang(Boolean sendWangwang) {
			this.sendWangwang = sendWangwang;
		}

		public Integer getVerifierId() {
			return this.verifierId;
		}

		public void setVerifierId(Integer verifierId) {
			this.verifierId = verifierId;
		}

		public String getIssueRelations() {
			return this.issueRelations;
		}

		public void setIssueRelations(String issueRelations) {
			this.issueRelations = issueRelations;
		}

		public Boolean getModuleUpdated() {
			return this.moduleUpdated;
		}

		public void setModuleUpdated(Boolean moduleUpdated) {
			this.moduleUpdated = moduleUpdated;
		}

		public String getSeriousLevel() {
			return this.seriousLevel;
		}

		public void setSeriousLevel(String seriousLevel) {
			this.seriousLevel = seriousLevel;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public Boolean getAttachmented() {
			return this.attachmented;
		}

		public void setAttachmented(Boolean attachmented) {
			this.attachmented = attachmented;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getAkPaths() {
			return this.akPaths;
		}

		public void setAkPaths(String akPaths) {
			this.akPaths = akPaths;
		}

		public Integer getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Integer templateId) {
			this.templateId = templateId;
		}

		public Integer getPriorityId() {
			return this.priorityId;
		}

		public void setPriorityId(Integer priorityId) {
			this.priorityId = priorityId;
		}

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
		}

		public Integer getTestsuiteId() {
			return this.testsuiteId;
		}

		public void setTestsuiteId(Integer testsuiteId) {
			this.testsuiteId = testsuiteId;
		}

		public Integer getSolution() {
			return this.solution;
		}

		public void setSolution(Integer solution) {
			this.solution = solution;
		}

		public Integer getStatusStage() {
			return this.statusStage;
		}

		public void setStatusStage(Integer statusStage) {
			this.statusStage = statusStage;
		}

		public Integer getRespondDuration() {
			return this.respondDuration;
		}

		public void setRespondDuration(Integer respondDuration) {
			this.respondDuration = respondDuration;
		}

		public String getWatcherIdList() {
			return this.watcherIdList;
		}

		public void setWatcherIdList(String watcherIdList) {
			this.watcherIdList = watcherIdList;
		}

		public String getTrackerIds() {
			return this.trackerIds;
		}

		public void setTrackerIds(String trackerIds) {
			this.trackerIds = trackerIds;
		}

		public Integer getSeriousLevelId() {
			return this.seriousLevelId;
		}

		public void setSeriousLevelId(Integer seriousLevelId) {
			this.seriousLevelId = seriousLevelId;
		}

		public String getVersionList() {
			return this.versionList;
		}

		public void setVersionList(String versionList) {
			this.versionList = versionList;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getVerifierStaffId() {
			return this.verifierStaffId;
		}

		public void setVerifierStaffId(String verifierStaffId) {
			this.verifierStaffId = verifierStaffId;
		}

		public Long getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(Long updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getRelatedAKProjectGuids() {
			return this.relatedAKProjectGuids;
		}

		public void setRelatedAKProjectGuids(String relatedAKProjectGuids) {
			this.relatedAKProjectGuids = relatedAKProjectGuids;
		}

		public String getScopeUserIds() {
			return this.scopeUserIds;
		}

		public void setScopeUserIds(String scopeUserIds) {
			this.scopeUserIds = scopeUserIds;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getRelatedAKProjectIds() {
			return this.relatedAKProjectIds;
		}

		public void setRelatedAKProjectIds(String relatedAKProjectIds) {
			this.relatedAKProjectIds = relatedAKProjectIds;
		}

		public Long getCommitDate() {
			return this.commitDate;
		}

		public void setCommitDate(Long commitDate) {
			this.commitDate = commitDate;
		}

		public Integer getDevDuration() {
			return this.devDuration;
		}

		public void setDevDuration(Integer devDuration) {
			this.devDuration = devDuration;
		}

		public Integer getFixedDuration() {
			return this.fixedDuration;
		}

		public void setFixedDuration(Integer fixedDuration) {
			this.fixedDuration = fixedDuration;
		}

		public String getBlackListNotice() {
			return this.blackListNotice;
		}

		public void setBlackListNotice(String blackListNotice) {
			this.blackListNotice = blackListNotice;
		}

		public Integer getSprintId() {
			return this.sprintId;
		}

		public void setSprintId(Integer sprintId) {
			this.sprintId = sprintId;
		}

		public Integer getVersionId() {
			return this.versionId;
		}

		public void setVersionId(Integer versionId) {
			this.versionId = versionId;
		}

		public Boolean getWatched() {
			return this.watched;
		}

		public void setWatched(Boolean watched) {
			this.watched = watched;
		}

		public String getIdPath() {
			return this.idPath;
		}

		public void setIdPath(String idPath) {
			this.idPath = idPath;
		}

		public String getModuleList() {
			return this.moduleList;
		}

		public void setModuleList(String moduleList) {
			this.moduleList = moduleList;
		}

		public Integer getStatusId() {
			return this.statusId;
		}

		public void setStatusId(Integer statusId) {
			this.statusId = statusId;
		}

		public String getAssignedToIdList() {
			return this.assignedToIdList;
		}

		public void setAssignedToIdList(String assignedToIdList) {
			this.assignedToIdList = assignedToIdList;
		}

		public String getUserStaffId() {
			return this.userStaffId;
		}

		public void setUserStaffId(String userStaffId) {
			this.userStaffId = userStaffId;
		}

		public String getAttachmentIds() {
			return this.attachmentIds;
		}

		public void setAttachmentIds(String attachmentIds) {
			this.attachmentIds = attachmentIds;
		}

		public Boolean getRecordChangeLog() {
			return this.recordChangeLog;
		}

		public void setRecordChangeLog(Boolean recordChangeLog) {
			this.recordChangeLog = recordChangeLog;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Integer getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Integer projectId) {
			this.projectId = projectId;
		}

		public Boolean getSkipCollab() {
			return this.skipCollab;
		}

		public void setSkipCollab(Boolean skipCollab) {
			this.skipCollab = skipCollab;
		}

		public String getTagIdList() {
			return this.tagIdList;
		}

		public void setTagIdList(String tagIdList) {
			this.tagIdList = tagIdList;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getAssignedToId() {
			return this.assignedToId;
		}

		public void setAssignedToId(Integer assignedToId) {
			this.assignedToId = assignedToId;
		}

		public String getCommentList() {
			return this.commentList;
		}

		public void setCommentList(String commentList) {
			this.commentList = commentList;
		}

		public String getVersionIds() {
			return this.versionIds;
		}

		public void setVersionIds(String versionIds) {
			this.versionIds = versionIds;
		}

		public String getStamp() {
			return this.stamp;
		}

		public void setStamp(String stamp) {
			this.stamp = stamp;
		}

		public String getAkVersionIds() {
			return this.akVersionIds;
		}

		public void setAkVersionIds(String akVersionIds) {
			this.akVersionIds = akVersionIds;
		}

		public String getProjectIds() {
			return this.projectIds;
		}

		public void setProjectIds(String projectIds) {
			this.projectIds = projectIds;
		}

		public String getChangeLogList() {
			return this.changeLogList;
		}

		public void setChangeLogList(String changeLogList) {
			this.changeLogList = changeLogList;
		}

		public String getAssignedTo() {
			return this.assignedTo;
		}

		public void setAssignedTo(String assignedTo) {
			this.assignedTo = assignedTo;
		}

		public Boolean getIgnoreIntegrate() {
			return this.ignoreIntegrate;
		}

		public void setIgnoreIntegrate(Boolean ignoreIntegrate) {
			this.ignoreIntegrate = ignoreIntegrate;
		}

		public String getModuleIds() {
			return this.moduleIds;
		}

		public void setModuleIds(String moduleIds) {
			this.moduleIds = moduleIds;
		}

		public Integer getIssueTypeId() {
			return this.issueTypeId;
		}

		public void setIssueTypeId(Integer issueTypeId) {
			this.issueTypeId = issueTypeId;
		}

		public String getAttachmentList() {
			return this.attachmentList;
		}

		public void setAttachmentList(String attachmentList) {
			this.attachmentList = attachmentList;
		}

		public String getLogicalStatus() {
			return this.logicalStatus;
		}

		public void setLogicalStatus(String logicalStatus) {
			this.logicalStatus = logicalStatus;
		}

		public Integer getScope() {
			return this.scope;
		}

		public void setScope(Integer scope) {
			this.scope = scope;
		}

		public String getAssignedToIds() {
			return this.assignedToIds;
		}

		public void setAssignedToIds(String assignedToIds) {
			this.assignedToIds = assignedToIds;
		}

		public String getAssignedToStaffId() {
			return this.assignedToStaffId;
		}

		public void setAssignedToStaffId(String assignedToStaffId) {
			this.assignedToStaffId = assignedToStaffId;
		}

		public Integer getUserId() {
			return this.userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public String getLinePath() {
			return this.linePath;
		}

		public void setLinePath(String linePath) {
			this.linePath = linePath;
		}

		public Integer getParentId() {
			return this.parentId;
		}

		public void setParentId(Integer parentId) {
			this.parentId = parentId;
		}

		public Integer getFixedUserId() {
			return this.fixedUserId;
		}

		public void setFixedUserId(Integer fixedUserId) {
			this.fixedUserId = fixedUserId;
		}

		public Boolean getIgnoreCheck() {
			return this.ignoreCheck;
		}

		public void setIgnoreCheck(Boolean ignoreCheck) {
			this.ignoreCheck = ignoreCheck;
		}

		public String getVerifier() {
			return this.verifier;
		}

		public void setVerifier(String verifier) {
			this.verifier = verifier;
		}

		public Integer getAkProjectId() {
			return this.akProjectId;
		}

		public void setAkProjectId(Integer akProjectId) {
			this.akProjectId = akProjectId;
		}

		public String getRelatedUserIds() {
			return this.relatedUserIds;
		}

		public void setRelatedUserIds(String relatedUserIds) {
			this.relatedUserIds = relatedUserIds;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}
	}

	@Override
	public SearchWorkitemWithTotalCountResponse getInstance(UnmarshallerContext context) {
		return	SearchWorkitemWithTotalCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
