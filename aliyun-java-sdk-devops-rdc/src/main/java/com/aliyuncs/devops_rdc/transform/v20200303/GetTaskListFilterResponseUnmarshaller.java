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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse.Object;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse.Object.Task;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse.Object.Task.Badges;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse.Object.Task.Creator;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse.Object.Task.Customfield;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse.Object.Task.Customfield.ValueItem;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse.Object.Task.Executor;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse.Object.Task.Reminder;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse.Object.Task.Stage;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse.Object.Task.SubtaskCount;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse.Object.Task.TaskFlowStatus;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskListFilterResponse.Object.Task.WorkTime;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskListFilterResponseUnmarshaller {

	public static GetTaskListFilterResponse unmarshall(GetTaskListFilterResponse getTaskListFilterResponse, UnmarshallerContext _ctx) {
		
		getTaskListFilterResponse.setRequestId(_ctx.stringValue("GetTaskListFilterResponse.RequestId"));
		getTaskListFilterResponse.setErrorMsg(_ctx.stringValue("GetTaskListFilterResponse.ErrorMsg"));
		getTaskListFilterResponse.setErrorCode(_ctx.stringValue("GetTaskListFilterResponse.ErrorCode"));
		getTaskListFilterResponse.setSuccessful(_ctx.stringValue("GetTaskListFilterResponse.Successful"));

		Object object = new Object();
		object.setNextPageToken(_ctx.stringValue("GetTaskListFilterResponse.Object.NextPageToken"));
		object.setTotalSize(_ctx.integerValue("GetTaskListFilterResponse.Object.TotalSize"));

		List<Task> result = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskListFilterResponse.Object.Result.Length"); i++) {
			Task task = new Task();
			task.setId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Id"));
			task.setCreatorId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].CreatorId"));
			task.setExecutorId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].ExecutorId"));
			task.setProjectId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].ProjectId"));
			task.setTaskListId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].TaskListId"));
			task.setOrganizationId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].OrganizationId"));
			task.setStageId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].StageId"));
			task.setVisible(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Visible"));
			task.setUpdated(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Updated"));
			task.setCreated(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Created"));
			task.setIsArchived(_ctx.booleanValue("GetTaskListFilterResponse.Object.Result["+ i +"].IsArchived"));
			task.setIsDone(_ctx.booleanValue("GetTaskListFilterResponse.Object.Result["+ i +"].IsDone"));
			task.setIsTopInProject(_ctx.booleanValue("GetTaskListFilterResponse.Object.Result["+ i +"].IsTopInProject"));
			task.setPriority(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].Priority"));
			task.setPos(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].Pos"));
			task.setStartDate(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].StartDate"));
			task.setDueDate(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].DueDate"));
			task.setAccomplished(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Accomplished"));
			task.setNote(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Note"));
			task.setContent(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Content"));
			task.setRecurrence(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Recurrence"));
			task.setSourceId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].SourceId"));
			task.setSourceDate(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].SourceDate"));
			task.setCommentsCount(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].CommentsCount"));
			task.setAttachmentsCount(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].AttachmentsCount"));
			task.setLikesCount(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].LikesCount"));
			task.setObjectlinksCount(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].ObjectlinksCount"));
			task.setUniqueId(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].UniqueId"));
			task.setStoryPoint(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].StoryPoint"));
			task.setProgress(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].Progress"));
			task.setRating(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].Rating"));
			task.setIsFavorite(_ctx.booleanValue("GetTaskListFilterResponse.Object.Result["+ i +"].IsFavorite"));
			task.setScenariofFeldConfigId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].ScenariofFeldConfigId"));
			task.setShareStatus(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].ShareStatus"));
			task.setSprintId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].SprintId"));
			task.setTaskFlowStatusId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].TaskFlowStatusId"));
			task.setObjectType(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].ObjectType"));
			task.setSource(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Source"));
			task.setUntilDate(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].UntilDate"));
			task.setTaskId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].TaskId"));
			task.setSprint(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Sprint"));
			task.setParent(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Parent"));
			task.setTaskUniqueId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].TaskUniqueId"));

			List<String> ancestorIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskListFilterResponse.Object.Result["+ i +"].AncestorIds.Length"); j++) {
				ancestorIds.add(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].AncestorIds["+ j +"]"));
			}
			task.setAncestorIds(ancestorIds);

			List<String> labels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskListFilterResponse.Object.Result["+ i +"].Labels.Length"); j++) {
				labels.add(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Labels["+ j +"]"));
			}
			task.setLabels(labels);

			List<String> tagIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskListFilterResponse.Object.Result["+ i +"].TagIds.Length"); j++) {
				tagIds.add(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].TagIds["+ j +"]"));
			}
			task.setTagIds(tagIds);

			List<String> involveMembers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskListFilterResponse.Object.Result["+ i +"].InvolveMembers.Length"); j++) {
				involveMembers.add(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].InvolveMembers["+ j +"]"));
			}
			task.setInvolveMembers(involveMembers);

			List<String> divisions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskListFilterResponse.Object.Result["+ i +"].Divisions.Length"); j++) {
				divisions.add(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Divisions["+ j +"]"));
			}
			task.setDivisions(divisions);

			WorkTime workTime = new WorkTime();
			workTime.setTotalTime(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].WorkTime.TotalTime"));
			workTime.setUsedTime(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].WorkTime.UsedTime"));
			workTime.setUnit(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].WorkTime.Unit"));
			task.setWorkTime(workTime);

			Badges badges = new Badges();
			badges.setObjectlinksCount(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].Badges.ObjectlinksCount"));
			badges.setCommentsCount(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].Badges.CommentsCount"));
			badges.setAttachmentsCount(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].Badges.AttachmentsCount"));
			badges.setLikesCount(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].Badges.LikesCount"));
			task.setBadges(badges);

			SubtaskCount subtaskCount = new SubtaskCount();
			subtaskCount.setTotal(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].SubtaskCount.Total"));
			subtaskCount.setDone(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].SubtaskCount.Done"));
			task.setSubtaskCount(subtaskCount);

			Reminder reminder = new Reminder();
			reminder.setType(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Reminder.Type"));
			reminder.setDate(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Reminder.Date"));
			reminder.setCreatorId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Reminder.CreatorId"));

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskListFilterResponse.Object.Result["+ i +"].Reminder.Members.Length"); j++) {
				members.add(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Reminder.Members["+ j +"]"));
			}
			reminder.setMembers(members);

			List<String> rules = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskListFilterResponse.Object.Result["+ i +"].Reminder.Rules.Length"); j++) {
				rules.add(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Reminder.Rules["+ j +"]"));
			}
			reminder.setRules(rules);
			task.setReminder(reminder);

			Creator creator = new Creator();
			creator.setId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Creator.Id"));
			creator.setName(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Creator.Name"));
			creator.setAvatarUrl(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Creator.AvatarUrl"));
			task.setCreator(creator);

			Stage stage = new Stage();
			stage.setId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Stage.Id"));
			stage.setName(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Stage.Name"));
			task.setStage(stage);

			Executor executor = new Executor();
			executor.setId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Executor.Id"));
			executor.setName(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Executor.Name"));
			executor.setAvatarUrl(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Executor.AvatarUrl"));
			task.setExecutor(executor);

			TaskFlowStatus taskFlowStatus = new TaskFlowStatus();
			taskFlowStatus.setId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].TaskFlowStatus.Id"));
			taskFlowStatus.setName(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].TaskFlowStatus.Name"));
			taskFlowStatus.setKind(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].TaskFlowStatus.Kind"));
			taskFlowStatus.setPos(_ctx.integerValue("GetTaskListFilterResponse.Object.Result["+ i +"].TaskFlowStatus.Pos"));
			taskFlowStatus.setTaskFlowId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].TaskFlowStatus.TaskFlowId"));
			task.setTaskFlowStatus(taskFlowStatus);

			List<Customfield> customfields = new ArrayList<Customfield>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskListFilterResponse.Object.Result["+ i +"].Customfields.Length"); j++) {
				Customfield customfield = new Customfield();
				customfield.setCustomfieldId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Customfields["+ j +"].CustomfieldId"));
				customfield.setType(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Customfields["+ j +"].Type"));
				customfield.setValues(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Customfields["+ j +"].Values"));

				List<ValueItem> value = new ArrayList<ValueItem>();
				for (int k = 0; k < _ctx.lengthValue("GetTaskListFilterResponse.Object.Result["+ i +"].Customfields["+ j +"].Value.Length"); k++) {
					ValueItem valueItem = new ValueItem();
					valueItem.setId(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Customfields["+ j +"].Value["+ k +"].Id"));
					valueItem.setTitle(_ctx.stringValue("GetTaskListFilterResponse.Object.Result["+ i +"].Customfields["+ j +"].Value["+ k +"].Title"));

					value.add(valueItem);
				}
				customfield.setValue(value);

				customfields.add(customfield);
			}
			task.setCustomfields(customfields);

			result.add(task);
		}
		object.setResult(result);
		getTaskListFilterResponse.setObject(object);
	 
	 	return getTaskListFilterResponse;
	}
}