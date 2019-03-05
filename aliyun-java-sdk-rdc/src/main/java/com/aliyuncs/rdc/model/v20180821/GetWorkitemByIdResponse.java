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
import com.aliyuncs.rdc.transform.v20180821.GetWorkitemByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorkitemByIdResponse extends AcsResponse {

	private Integer code;

	private String success;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer akProjectId;

		private String assignedTo;

		private Integer assignedToId;

		private String assignedToIdList;

		private String assignedToIds;

		private String assignedToMaps;

		private String assignedToStaffId;

		private String attachmentIds;

		private String attachmentList;

		private Boolean attachmented;

		private String blackListNotice;

		private String changeLogList;

		private String commentList;

		private Long commitDate;

		private Long createdAt;

		private String description;

		private String guid;

		private Integer id;

		private String idPath;

		private Boolean ignoreCheck;

		private Boolean ignoreIntegrate;

		private Integer issueTypeId;

		private String logicalStatus;

		private String moduleIds;

		private String moduleList;

		private Boolean moduleUpdated;

		private Integer parentId;

		private String priority;

		private Integer priorityId;

		private String projectIds;

		private Boolean recordChangeLog;

		private Integer regionId;

		private String relatedAKProjectGuids;

		private String relatedAKProjectIds;

		private String relatedUserIds;

		private Boolean sendWangwang;

		private String seriousLevel;

		private Integer seriousLevelId;

		private Boolean skipCollab;

		private String stamp;

		private String status;

		private Integer statusId;

		private Integer statusStage;

		private String subject;

		private String tagIdList;

		private Integer templateId;

		private String trackerIds;

		private String trackers;

		private Long updateStatusAt;

		private Long updatedAt;

		private String user;

		private Integer userId;

		private String userStaffId;

		private String verifier;

		private Integer verifierId;

		private String verifierStaffId;

		private String versionIds;

		private String versionList;

		private Boolean watched;

		private List<CfsListItem> cfsList;

		public Integer getAkProjectId() {
			return this.akProjectId;
		}

		public void setAkProjectId(Integer akProjectId) {
			this.akProjectId = akProjectId;
		}

		public String getAssignedTo() {
			return this.assignedTo;
		}

		public void setAssignedTo(String assignedTo) {
			this.assignedTo = assignedTo;
		}

		public Integer getAssignedToId() {
			return this.assignedToId;
		}

		public void setAssignedToId(Integer assignedToId) {
			this.assignedToId = assignedToId;
		}

		public String getAssignedToIdList() {
			return this.assignedToIdList;
		}

		public void setAssignedToIdList(String assignedToIdList) {
			this.assignedToIdList = assignedToIdList;
		}

		public String getAssignedToIds() {
			return this.assignedToIds;
		}

		public void setAssignedToIds(String assignedToIds) {
			this.assignedToIds = assignedToIds;
		}

		public String getAssignedToMaps() {
			return this.assignedToMaps;
		}

		public void setAssignedToMaps(String assignedToMaps) {
			this.assignedToMaps = assignedToMaps;
		}

		public String getAssignedToStaffId() {
			return this.assignedToStaffId;
		}

		public void setAssignedToStaffId(String assignedToStaffId) {
			this.assignedToStaffId = assignedToStaffId;
		}

		public String getAttachmentIds() {
			return this.attachmentIds;
		}

		public void setAttachmentIds(String attachmentIds) {
			this.attachmentIds = attachmentIds;
		}

		public String getAttachmentList() {
			return this.attachmentList;
		}

		public void setAttachmentList(String attachmentList) {
			this.attachmentList = attachmentList;
		}

		public Boolean getAttachmented() {
			return this.attachmented;
		}

		public void setAttachmented(Boolean attachmented) {
			this.attachmented = attachmented;
		}

		public String getBlackListNotice() {
			return this.blackListNotice;
		}

		public void setBlackListNotice(String blackListNotice) {
			this.blackListNotice = blackListNotice;
		}

		public String getChangeLogList() {
			return this.changeLogList;
		}

		public void setChangeLogList(String changeLogList) {
			this.changeLogList = changeLogList;
		}

		public String getCommentList() {
			return this.commentList;
		}

		public void setCommentList(String commentList) {
			this.commentList = commentList;
		}

		public Long getCommitDate() {
			return this.commitDate;
		}

		public void setCommitDate(Long commitDate) {
			this.commitDate = commitDate;
		}

		public Long getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(Long createdAt) {
			this.createdAt = createdAt;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGuid() {
			return this.guid;
		}

		public void setGuid(String guid) {
			this.guid = guid;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getIdPath() {
			return this.idPath;
		}

		public void setIdPath(String idPath) {
			this.idPath = idPath;
		}

		public Boolean getIgnoreCheck() {
			return this.ignoreCheck;
		}

		public void setIgnoreCheck(Boolean ignoreCheck) {
			this.ignoreCheck = ignoreCheck;
		}

		public Boolean getIgnoreIntegrate() {
			return this.ignoreIntegrate;
		}

		public void setIgnoreIntegrate(Boolean ignoreIntegrate) {
			this.ignoreIntegrate = ignoreIntegrate;
		}

		public Integer getIssueTypeId() {
			return this.issueTypeId;
		}

		public void setIssueTypeId(Integer issueTypeId) {
			this.issueTypeId = issueTypeId;
		}

		public String getLogicalStatus() {
			return this.logicalStatus;
		}

		public void setLogicalStatus(String logicalStatus) {
			this.logicalStatus = logicalStatus;
		}

		public String getModuleIds() {
			return this.moduleIds;
		}

		public void setModuleIds(String moduleIds) {
			this.moduleIds = moduleIds;
		}

		public String getModuleList() {
			return this.moduleList;
		}

		public void setModuleList(String moduleList) {
			this.moduleList = moduleList;
		}

		public Boolean getModuleUpdated() {
			return this.moduleUpdated;
		}

		public void setModuleUpdated(Boolean moduleUpdated) {
			this.moduleUpdated = moduleUpdated;
		}

		public Integer getParentId() {
			return this.parentId;
		}

		public void setParentId(Integer parentId) {
			this.parentId = parentId;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public Integer getPriorityId() {
			return this.priorityId;
		}

		public void setPriorityId(Integer priorityId) {
			this.priorityId = priorityId;
		}

		public String getProjectIds() {
			return this.projectIds;
		}

		public void setProjectIds(String projectIds) {
			this.projectIds = projectIds;
		}

		public Boolean getRecordChangeLog() {
			return this.recordChangeLog;
		}

		public void setRecordChangeLog(Boolean recordChangeLog) {
			this.recordChangeLog = recordChangeLog;
		}

		public Integer getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(Integer regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public Integer getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(Integer regionId) {
			this.regionId = regionId;
		}

		public String getRelatedAKProjectGuids() {
			return this.relatedAKProjectGuids;
		}

		public void setRelatedAKProjectGuids(String relatedAKProjectGuids) {
			this.relatedAKProjectGuids = relatedAKProjectGuids;
		}

		public String getRelatedAKProjectIds() {
			return this.relatedAKProjectIds;
		}

		public void setRelatedAKProjectIds(String relatedAKProjectIds) {
			this.relatedAKProjectIds = relatedAKProjectIds;
		}

		public String getRelatedUserIds() {
			return this.relatedUserIds;
		}

		public void setRelatedUserIds(String relatedUserIds) {
			this.relatedUserIds = relatedUserIds;
		}

		public Boolean getSendWangwang() {
			return this.sendWangwang;
		}

		public void setSendWangwang(Boolean sendWangwang) {
			this.sendWangwang = sendWangwang;
		}

		public String getSeriousLevel() {
			return this.seriousLevel;
		}

		public void setSeriousLevel(String seriousLevel) {
			this.seriousLevel = seriousLevel;
		}

		public Integer getSeriousLevelId() {
			return this.seriousLevelId;
		}

		public void setSeriousLevelId(Integer seriousLevelId) {
			this.seriousLevelId = seriousLevelId;
		}

		public Boolean getSkipCollab() {
			return this.skipCollab;
		}

		public void setSkipCollab(Boolean skipCollab) {
			this.skipCollab = skipCollab;
		}

		public String getStamp() {
			return this.stamp;
		}

		public void setStamp(String stamp) {
			this.stamp = stamp;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getStatusId() {
			return this.statusId;
		}

		public void setStatusId(Integer statusId) {
			this.statusId = statusId;
		}

		public Integer getStatusStage() {
			return this.statusStage;
		}

		public void setStatusStage(Integer statusStage) {
			this.statusStage = statusStage;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getTagIdList() {
			return this.tagIdList;
		}

		public void setTagIdList(String tagIdList) {
			this.tagIdList = tagIdList;
		}

		public Integer getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Integer templateId) {
			this.templateId = templateId;
		}

		public String getTrackerIds() {
			return this.trackerIds;
		}

		public void setTrackerIds(String trackerIds) {
			this.trackerIds = trackerIds;
		}

		public String getTrackers() {
			return this.trackers;
		}

		public void setTrackers(String trackers) {
			this.trackers = trackers;
		}

		public Long getUpdateStatusAt() {
			return this.updateStatusAt;
		}

		public void setUpdateStatusAt(Long updateStatusAt) {
			this.updateStatusAt = updateStatusAt;
		}

		public Long getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(Long updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public Integer getUserId() {
			return this.userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public String getUserStaffId() {
			return this.userStaffId;
		}

		public void setUserStaffId(String userStaffId) {
			this.userStaffId = userStaffId;
		}

		public String getVerifier() {
			return this.verifier;
		}

		public void setVerifier(String verifier) {
			this.verifier = verifier;
		}

		public Integer getVerifierId() {
			return this.verifierId;
		}

		public void setVerifierId(Integer verifierId) {
			this.verifierId = verifierId;
		}

		public String getVerifierStaffId() {
			return this.verifierStaffId;
		}

		public void setVerifierStaffId(String verifierStaffId) {
			this.verifierStaffId = verifierStaffId;
		}

		public String getVersionIds() {
			return this.versionIds;
		}

		public void setVersionIds(String versionIds) {
			this.versionIds = versionIds;
		}

		public String getVersionList() {
			return this.versionList;
		}

		public void setVersionList(String versionList) {
			this.versionList = versionList;
		}

		public Boolean getWatched() {
			return this.watched;
		}

		public void setWatched(Boolean watched) {
			this.watched = watched;
		}

		public List<CfsListItem> getCfsList() {
			return this.cfsList;
		}

		public void setCfsList(List<CfsListItem> cfsList) {
			this.cfsList = cfsList;
		}

		public static class CfsListItem {

			private String id;

			private String name;

			private String type;

			private String value;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public GetWorkitemByIdResponse getInstance(UnmarshallerContext context) {
		return	GetWorkitemByIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
