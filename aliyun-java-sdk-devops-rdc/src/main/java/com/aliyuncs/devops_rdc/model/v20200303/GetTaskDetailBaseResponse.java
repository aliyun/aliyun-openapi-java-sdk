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

package com.aliyuncs.devops_rdc.model.v20200303;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.GetTaskDetailBaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskDetailBaseResponse extends AcsResponse {

	private String errorMsg;

	private String requestId;

	private Boolean successful;

	private String errorCode;

	private Object object;

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccessful() {
		return this.successful;
	}

	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static class Object {

		private Boolean isFavorite;

		private String organization;

		private String executorId;

		private String scenariofieldconfigId;

		private String projectId;

		private Boolean isTopInProject;

		private Integer priority;

		private Integer shareStatus;

		private String accomplished;

		private String taskflowstatusId;

		private String note;

		private String updated;

		private Integer uniqueId;

		private Boolean isArchived;

		private String content;

		private Integer commentsCount;

		private Integer rating;

		private String recurrence;

		private String objectType;

		private Integer progress;

		private String untilDate;

		private String startDate;

		private String storyPoint;

		private Integer objectlinksCount;

		private String sprint;

		private String creatorId;

		private String source;

		private String sourceId;

		private String organizationId;

		private String sourceDate;

		private Integer likesCount;

		private String stageId;

		private String visible;

		private Boolean isDone;

		private String parent;

		private String sprintId;

		private Integer attachmentsCount;

		private String dueDate;

		private String created;

		private String taskId;

		private String id;

		private List<Customfield> customfields;

		private List<Subtask> subtasks;

		private List<Involver> involvers;

		private List<String> labels;

		private List<String> divisions;

		private List<String> ancestors;

		private List<String> involveMembers;

		private List<String> tagIds;

		private List<String> ancestorIds;

		private Scenariofieldconfig scenariofieldconfig;

		private Executor executor;

		private Tasklist tasklist;

		private Taskflowstatus taskflowstatus;

		private Creator creator;

		private Reminder reminder;

		private SubtaskCount subtaskCount;

		private WorkTime workTime;

		private Badges badges;

		private Stage stage;

		public Boolean getIsFavorite() {
			return this.isFavorite;
		}

		public void setIsFavorite(Boolean isFavorite) {
			this.isFavorite = isFavorite;
		}

		public String getOrganization() {
			return this.organization;
		}

		public void setOrganization(String organization) {
			this.organization = organization;
		}

		public String getExecutorId() {
			return this.executorId;
		}

		public void setExecutorId(String executorId) {
			this.executorId = executorId;
		}

		public String getScenariofieldconfigId() {
			return this.scenariofieldconfigId;
		}

		public void setScenariofieldconfigId(String scenariofieldconfigId) {
			this.scenariofieldconfigId = scenariofieldconfigId;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public Boolean getIsTopInProject() {
			return this.isTopInProject;
		}

		public void setIsTopInProject(Boolean isTopInProject) {
			this.isTopInProject = isTopInProject;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Integer getShareStatus() {
			return this.shareStatus;
		}

		public void setShareStatus(Integer shareStatus) {
			this.shareStatus = shareStatus;
		}

		public String getAccomplished() {
			return this.accomplished;
		}

		public void setAccomplished(String accomplished) {
			this.accomplished = accomplished;
		}

		public String getTaskflowstatusId() {
			return this.taskflowstatusId;
		}

		public void setTaskflowstatusId(String taskflowstatusId) {
			this.taskflowstatusId = taskflowstatusId;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public Integer getUniqueId() {
			return this.uniqueId;
		}

		public void setUniqueId(Integer uniqueId) {
			this.uniqueId = uniqueId;
		}

		public Boolean getIsArchived() {
			return this.isArchived;
		}

		public void setIsArchived(Boolean isArchived) {
			this.isArchived = isArchived;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Integer getCommentsCount() {
			return this.commentsCount;
		}

		public void setCommentsCount(Integer commentsCount) {
			this.commentsCount = commentsCount;
		}

		public Integer getRating() {
			return this.rating;
		}

		public void setRating(Integer rating) {
			this.rating = rating;
		}

		public String getRecurrence() {
			return this.recurrence;
		}

		public void setRecurrence(String recurrence) {
			this.recurrence = recurrence;
		}

		public String getObjectType() {
			return this.objectType;
		}

		public void setObjectType(String objectType) {
			this.objectType = objectType;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public String getUntilDate() {
			return this.untilDate;
		}

		public void setUntilDate(String untilDate) {
			this.untilDate = untilDate;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getStoryPoint() {
			return this.storyPoint;
		}

		public void setStoryPoint(String storyPoint) {
			this.storyPoint = storyPoint;
		}

		public Integer getObjectlinksCount() {
			return this.objectlinksCount;
		}

		public void setObjectlinksCount(Integer objectlinksCount) {
			this.objectlinksCount = objectlinksCount;
		}

		public String getSprint() {
			return this.sprint;
		}

		public void setSprint(String sprint) {
			this.sprint = sprint;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public String getSourceDate() {
			return this.sourceDate;
		}

		public void setSourceDate(String sourceDate) {
			this.sourceDate = sourceDate;
		}

		public Integer getLikesCount() {
			return this.likesCount;
		}

		public void setLikesCount(Integer likesCount) {
			this.likesCount = likesCount;
		}

		public String getStageId() {
			return this.stageId;
		}

		public void setStageId(String stageId) {
			this.stageId = stageId;
		}

		public String getVisible() {
			return this.visible;
		}

		public void setVisible(String visible) {
			this.visible = visible;
		}

		public Boolean getIsDone() {
			return this.isDone;
		}

		public void setIsDone(Boolean isDone) {
			this.isDone = isDone;
		}

		public String getParent() {
			return this.parent;
		}

		public void setParent(String parent) {
			this.parent = parent;
		}

		public String getSprintId() {
			return this.sprintId;
		}

		public void setSprintId(String sprintId) {
			this.sprintId = sprintId;
		}

		public Integer getAttachmentsCount() {
			return this.attachmentsCount;
		}

		public void setAttachmentsCount(Integer attachmentsCount) {
			this.attachmentsCount = attachmentsCount;
		}

		public String getDueDate() {
			return this.dueDate;
		}

		public void setDueDate(String dueDate) {
			this.dueDate = dueDate;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<Customfield> getCustomfields() {
			return this.customfields;
		}

		public void setCustomfields(List<Customfield> customfields) {
			this.customfields = customfields;
		}

		public List<Subtask> getSubtasks() {
			return this.subtasks;
		}

		public void setSubtasks(List<Subtask> subtasks) {
			this.subtasks = subtasks;
		}

		public List<Involver> getInvolvers() {
			return this.involvers;
		}

		public void setInvolvers(List<Involver> involvers) {
			this.involvers = involvers;
		}

		public List<String> getLabels() {
			return this.labels;
		}

		public void setLabels(List<String> labels) {
			this.labels = labels;
		}

		public List<String> getDivisions() {
			return this.divisions;
		}

		public void setDivisions(List<String> divisions) {
			this.divisions = divisions;
		}

		public List<String> getAncestors() {
			return this.ancestors;
		}

		public void setAncestors(List<String> ancestors) {
			this.ancestors = ancestors;
		}

		public List<String> getInvolveMembers() {
			return this.involveMembers;
		}

		public void setInvolveMembers(List<String> involveMembers) {
			this.involveMembers = involveMembers;
		}

		public List<String> getTagIds() {
			return this.tagIds;
		}

		public void setTagIds(List<String> tagIds) {
			this.tagIds = tagIds;
		}

		public List<String> getAncestorIds() {
			return this.ancestorIds;
		}

		public void setAncestorIds(List<String> ancestorIds) {
			this.ancestorIds = ancestorIds;
		}

		public Scenariofieldconfig getScenariofieldconfig() {
			return this.scenariofieldconfig;
		}

		public void setScenariofieldconfig(Scenariofieldconfig scenariofieldconfig) {
			this.scenariofieldconfig = scenariofieldconfig;
		}

		public Executor getExecutor() {
			return this.executor;
		}

		public void setExecutor(Executor executor) {
			this.executor = executor;
		}

		public Tasklist getTasklist() {
			return this.tasklist;
		}

		public void setTasklist(Tasklist tasklist) {
			this.tasklist = tasklist;
		}

		public Taskflowstatus getTaskflowstatus() {
			return this.taskflowstatus;
		}

		public void setTaskflowstatus(Taskflowstatus taskflowstatus) {
			this.taskflowstatus = taskflowstatus;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public Reminder getReminder() {
			return this.reminder;
		}

		public void setReminder(Reminder reminder) {
			this.reminder = reminder;
		}

		public SubtaskCount getSubtaskCount() {
			return this.subtaskCount;
		}

		public void setSubtaskCount(SubtaskCount subtaskCount) {
			this.subtaskCount = subtaskCount;
		}

		public WorkTime getWorkTime() {
			return this.workTime;
		}

		public void setWorkTime(WorkTime workTime) {
			this.workTime = workTime;
		}

		public Badges getBadges() {
			return this.badges;
		}

		public void setBadges(Badges badges) {
			this.badges = badges;
		}

		public Stage getStage() {
			return this.stage;
		}

		public void setStage(Stage stage) {
			this.stage = stage;
		}

		public static class Customfield {

			private String type;

			private String customfieldId;

			private List<ValueInfo> value;

			private List<String> values;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCustomfieldId() {
				return this.customfieldId;
			}

			public void setCustomfieldId(String customfieldId) {
				this.customfieldId = customfieldId;
			}

			public List<ValueInfo> getValue() {
				return this.value;
			}

			public void setValue(List<ValueInfo> value) {
				this.value = value;
			}

			public List<String> getValues() {
				return this.values;
			}

			public void setValues(List<String> values) {
				this.values = values;
			}

			public static class ValueInfo {

				private String id;

				private String title;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}
			}
		}

		public static class Subtask {

			private String content;

			private String id;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class Involver {

			private String name;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class Scenariofieldconfig {

			private String icon;

			private String proTemplateConfigType;

			private String name;

			private String id;

			public String getIcon() {
				return this.icon;
			}

			public void setIcon(String icon) {
				this.icon = icon;
			}

			public String getProTemplateConfigType() {
				return this.proTemplateConfigType;
			}

			public void setProTemplateConfigType(String proTemplateConfigType) {
				this.proTemplateConfigType = proTemplateConfigType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class Executor {

			private String avatarUrl;

			private String name;

			private String id;

			public String getAvatarUrl() {
				return this.avatarUrl;
			}

			public void setAvatarUrl(String avatarUrl) {
				this.avatarUrl = avatarUrl;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class Tasklist {

			private String id;

			private String title;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}
		}

		public static class Taskflowstatus {

			private String taskflowId;

			private String name;

			private String id;

			private String kind;

			public String getTaskflowId() {
				return this.taskflowId;
			}

			public void setTaskflowId(String taskflowId) {
				this.taskflowId = taskflowId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getKind() {
				return this.kind;
			}

			public void setKind(String kind) {
				this.kind = kind;
			}
		}

		public static class Creator {

			private String name;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class Reminder {

			private String type;

			private String date;

			private String method;

			private String creatorId;

			private List<String> memberRoles;

			private List<String> members;

			private List<String> rules;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDate() {
				return this.date;
			}

			public void setDate(String date) {
				this.date = date;
			}

			public String getBizMethod() {
				return this.method;
			}

			public void setBizMethod(String method) {
				this.method = method;
			}

			public String getCreatorId() {
				return this.creatorId;
			}

			public void setCreatorId(String creatorId) {
				this.creatorId = creatorId;
			}

			public List<String> getMemberRoles() {
				return this.memberRoles;
			}

			public void setMemberRoles(List<String> memberRoles) {
				this.memberRoles = memberRoles;
			}

			public List<String> getMembers() {
				return this.members;
			}

			public void setMembers(List<String> members) {
				this.members = members;
			}

			public List<String> getRules() {
				return this.rules;
			}

			public void setRules(List<String> rules) {
				this.rules = rules;
			}
		}

		public static class SubtaskCount {

			private Integer done;

			private Integer total;

			public Integer getDone() {
				return this.done;
			}

			public void setDone(Integer done) {
				this.done = done;
			}

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}
		}

		public static class WorkTime {

			private Integer usedTime;

			private Integer totalTime;

			private String unit;

			public Integer getUsedTime() {
				return this.usedTime;
			}

			public void setUsedTime(Integer usedTime) {
				this.usedTime = usedTime;
			}

			public Integer getTotalTime() {
				return this.totalTime;
			}

			public void setTotalTime(Integer totalTime) {
				this.totalTime = totalTime;
			}

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}
		}

		public static class Badges {

			private Integer likesCount;

			private Integer objectlinksCount;

			private Integer attachmentsCount;

			private Integer commentsCount;

			public Integer getLikesCount() {
				return this.likesCount;
			}

			public void setLikesCount(Integer likesCount) {
				this.likesCount = likesCount;
			}

			public Integer getObjectlinksCount() {
				return this.objectlinksCount;
			}

			public void setObjectlinksCount(Integer objectlinksCount) {
				this.objectlinksCount = objectlinksCount;
			}

			public Integer getAttachmentsCount() {
				return this.attachmentsCount;
			}

			public void setAttachmentsCount(Integer attachmentsCount) {
				this.attachmentsCount = attachmentsCount;
			}

			public Integer getCommentsCount() {
				return this.commentsCount;
			}

			public void setCommentsCount(Integer commentsCount) {
				this.commentsCount = commentsCount;
			}
		}

		public static class Stage {

			private String name;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public GetTaskDetailBaseResponse getInstance(UnmarshallerContext context) {
		return	GetTaskDetailBaseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
