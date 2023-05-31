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

package com.aliyuncs.openitag.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openitag.model.v20220616.GetTaskResponse;
import com.aliyuncs.openitag.model.v20220616.GetTaskResponse.Task;
import com.aliyuncs.openitag.model.v20220616.GetTaskResponse.Task.AdminsItem;
import com.aliyuncs.openitag.model.v20220616.GetTaskResponse.Task.Creator;
import com.aliyuncs.openitag.model.v20220616.GetTaskResponse.Task.DatasetProxyRelationsItem;
import com.aliyuncs.openitag.model.v20220616.GetTaskResponse.Task.Modifier;
import com.aliyuncs.openitag.model.v20220616.GetTaskResponse.Task.TaskTemplateConfig;
import com.aliyuncs.openitag.model.v20220616.GetTaskResponse.Task.TaskWorkflowItem;
import com.aliyuncs.openitag.model.v20220616.GetTaskResponse.Task.TaskWorkflowItem.UsersItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskResponseUnmarshaller {

	public static GetTaskResponse unmarshall(GetTaskResponse getTaskResponse, UnmarshallerContext _ctx) {
		
		getTaskResponse.setRequestId(_ctx.stringValue("GetTaskResponse.RequestId"));
		getTaskResponse.setCode(_ctx.integerValue("GetTaskResponse.Code"));
		getTaskResponse.setMessage(_ctx.stringValue("GetTaskResponse.Message"));
		getTaskResponse.setDetails(_ctx.stringValue("GetTaskResponse.Details"));
		getTaskResponse.setSuccess(_ctx.booleanValue("GetTaskResponse.Success"));
		getTaskResponse.setErrorCode(_ctx.stringValue("GetTaskResponse.ErrorCode"));

		Task task = new Task();
		task.setGmtCreateTime(_ctx.stringValue("GetTaskResponse.Task.GmtCreateTime"));
		task.setGmtModifiedTime(_ctx.stringValue("GetTaskResponse.Task.GmtModifiedTime"));
		task.setTaskName(_ctx.stringValue("GetTaskResponse.Task.TaskName"));
		task.setTaskId(_ctx.stringValue("GetTaskResponse.Task.TaskId"));
		task.setTemplateId(_ctx.stringValue("GetTaskResponse.Task.TemplateId"));
		task.setTaskType(_ctx.stringValue("GetTaskResponse.Task.TaskType"));
		task.setTenantId(_ctx.stringValue("GetTaskResponse.Task.TenantId"));
		task.setRemark(_ctx.stringValue("GetTaskResponse.Task.Remark"));
		task.setLabelStyle(_ctx.stringValue("GetTaskResponse.Task.LabelStyle"));
		task.setArchived(_ctx.booleanValue("GetTaskResponse.Task.Archived"));
		task.setStage(_ctx.stringValue("GetTaskResponse.Task.Stage"));
		task.setArchivedInfos(_ctx.stringValue("GetTaskResponse.Task.ArchivedInfos"));
		task.setStatus(_ctx.stringValue("GetTaskResponse.Task.Status"));
		task.setRefTaskId(_ctx.stringValue("GetTaskResponse.Task.RefTaskId"));
		task.setUUID(_ctx.stringValue("GetTaskResponse.Task.UUID"));
		task.setExif(_ctx.mapValue("GetTaskResponse.Task.Exif"));
		task.setAssignConfig(_ctx.mapValue("GetTaskResponse.Task.AssignConfig"));
		task.setTenantName(_ctx.stringValue("GetTaskResponse.Task.TenantName"));
		task.setAllowAppendData(_ctx.booleanValue("GetTaskResponse.Task.AllowAppendData"));
		task.setRelateTaskConfig(_ctx.mapValue("GetTaskResponse.Task.RelateTaskConfig"));
		task.setPeriodConfig(_ctx.mapValue("GetTaskResponse.Task.PeriodConfig"));
		task.setMineConfigs(_ctx.mapValue("GetTaskResponse.Task.MineConfigs"));
		task.setVoteConfigs(_ctx.mapValue("GetTaskResponse.Task.VoteConfigs"));
		task.setNoticeConfig(_ctx.mapValue("GetTaskResponse.Task.NoticeConfig"));
		task.setResultCallbackConfig(_ctx.mapValue("GetTaskResponse.Task.ResultCallbackConfig"));
		task.setRunMsg(_ctx.stringValue("GetTaskResponse.Task.runMsg"));
		task.setAlertTime(_ctx.longValue("GetTaskResponse.Task.AlertTime"));

		List<String> workflowNodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Task.WorkflowNodes.Length"); i++) {
			workflowNodes.add(_ctx.stringValue("GetTaskResponse.Task.WorkflowNodes["+ i +"]"));
		}
		task.setWorkflowNodes(workflowNodes);

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Task.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("GetTaskResponse.Task.Tags["+ i +"]"));
		}
		task.setTags(tags);

		Creator creator = new Creator();
		creator.setUserId(_ctx.longValue("GetTaskResponse.Task.Creator.UserId"));
		creator.setAccountType(_ctx.stringValue("GetTaskResponse.Task.Creator.AccountType"));
		creator.setAccountNo(_ctx.stringValue("GetTaskResponse.Task.Creator.AccountNo"));
		creator.setUserName(_ctx.stringValue("GetTaskResponse.Task.Creator.UserName"));
		creator.setRole(_ctx.stringValue("GetTaskResponse.Task.Creator.Role"));
		task.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setUserId(_ctx.longValue("GetTaskResponse.Task.Modifier.UserId"));
		modifier.setAccountType(_ctx.stringValue("GetTaskResponse.Task.Modifier.AccountType"));
		modifier.setAccountNo(_ctx.stringValue("GetTaskResponse.Task.Modifier.AccountNo"));
		modifier.setUserName(_ctx.stringValue("GetTaskResponse.Task.Modifier.UserName"));
		modifier.setRole(_ctx.stringValue("GetTaskResponse.Task.Modifier.Role"));
		task.setModifier(modifier);

		TaskTemplateConfig taskTemplateConfig = new TaskTemplateConfig();
		taskTemplateConfig.setExif(_ctx.mapValue("GetTaskResponse.Task.TaskTemplateConfig.Exif"));
		taskTemplateConfig.setTemplateOptionMap(_ctx.mapValue("GetTaskResponse.Task.TaskTemplateConfig.TemplateOptionMap"));
		taskTemplateConfig.setRobotConfig(_ctx.mapValue("GetTaskResponse.Task.TaskTemplateConfig.RobotConfig"));
		taskTemplateConfig.setTemplateRelationId(_ctx.stringValue("GetTaskResponse.Task.TaskTemplateConfig.TemplateRelationId"));
		taskTemplateConfig.setResourceKey(_ctx.stringValue("GetTaskResponse.Task.TaskTemplateConfig.ResourceKey"));

		List<String> selectQuestions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Task.TaskTemplateConfig.SelectQuestions.Length"); i++) {
			selectQuestions.add(_ctx.stringValue("GetTaskResponse.Task.TaskTemplateConfig.SelectQuestions["+ i +"]"));
		}
		taskTemplateConfig.setSelectQuestions(selectQuestions);
		task.setTaskTemplateConfig(taskTemplateConfig);

		List<TaskWorkflowItem> taskWorkflow = new ArrayList<TaskWorkflowItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Task.TaskWorkflow.Length"); i++) {
			TaskWorkflowItem taskWorkflowItem = new TaskWorkflowItem();
			taskWorkflowItem.setNodeName(_ctx.stringValue("GetTaskResponse.Task.TaskWorkflow["+ i +"].NodeName"));
			taskWorkflowItem.setExif(_ctx.mapValue("GetTaskResponse.Task.TaskWorkflow["+ i +"].Exif"));

			List<String> groups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Task.TaskWorkflow["+ i +"].Groups.Length"); j++) {
				groups.add(_ctx.stringValue("GetTaskResponse.Task.TaskWorkflow["+ i +"].Groups["+ j +"]"));
			}
			taskWorkflowItem.setGroups(groups);

			List<UsersItem> users = new ArrayList<UsersItem>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Task.TaskWorkflow["+ i +"].Users.Length"); j++) {
				UsersItem usersItem = new UsersItem();
				usersItem.setUserId(_ctx.longValue("GetTaskResponse.Task.TaskWorkflow["+ i +"].Users["+ j +"].UserId"));
				usersItem.setAccountType(_ctx.stringValue("GetTaskResponse.Task.TaskWorkflow["+ i +"].Users["+ j +"].AccountType"));
				usersItem.setAccountNo(_ctx.stringValue("GetTaskResponse.Task.TaskWorkflow["+ i +"].Users["+ j +"].AccountNo"));
				usersItem.setUserName(_ctx.stringValue("GetTaskResponse.Task.TaskWorkflow["+ i +"].Users["+ j +"].UserName"));
				usersItem.setRole(_ctx.stringValue("GetTaskResponse.Task.TaskWorkflow["+ i +"].Users["+ j +"].Role"));

				users.add(usersItem);
			}
			taskWorkflowItem.setUsers(users);

			taskWorkflow.add(taskWorkflowItem);
		}
		task.setTaskWorkflow(taskWorkflow);

		List<AdminsItem> admins = new ArrayList<AdminsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Task.Admins.Length"); i++) {
			AdminsItem adminsItem = new AdminsItem();
			adminsItem.setUserId(_ctx.longValue("GetTaskResponse.Task.Admins["+ i +"].UserId"));
			adminsItem.setAccountType(_ctx.stringValue("GetTaskResponse.Task.Admins["+ i +"].AccountType"));
			adminsItem.setAccountNo(_ctx.stringValue("GetTaskResponse.Task.Admins["+ i +"].AccountNo"));
			adminsItem.setUserName(_ctx.stringValue("GetTaskResponse.Task.Admins["+ i +"].UserName"));
			adminsItem.setRole(_ctx.stringValue("GetTaskResponse.Task.Admins["+ i +"].Role"));

			admins.add(adminsItem);
		}
		task.setAdmins(admins);

		List<DatasetProxyRelationsItem> datasetProxyRelations = new ArrayList<DatasetProxyRelationsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Task.DatasetProxyRelations.Length"); i++) {
			DatasetProxyRelationsItem datasetProxyRelationsItem = new DatasetProxyRelationsItem();
			datasetProxyRelationsItem.setDatasetId(_ctx.stringValue("GetTaskResponse.Task.DatasetProxyRelations["+ i +"].DatasetId"));
			datasetProxyRelationsItem.setSource(_ctx.stringValue("GetTaskResponse.Task.DatasetProxyRelations["+ i +"].Source"));
			datasetProxyRelationsItem.setSourceBizId(_ctx.stringValue("GetTaskResponse.Task.DatasetProxyRelations["+ i +"].SourceBizId"));
			datasetProxyRelationsItem.setDatasetType(_ctx.stringValue("GetTaskResponse.Task.DatasetProxyRelations["+ i +"].DatasetType"));
			datasetProxyRelationsItem.setExif(_ctx.mapValue("GetTaskResponse.Task.DatasetProxyRelations["+ i +"].Exif"));
			datasetProxyRelationsItem.setSourceDatasetId(_ctx.stringValue("GetTaskResponse.Task.DatasetProxyRelations["+ i +"].SourceDatasetId"));

			datasetProxyRelations.add(datasetProxyRelationsItem);
		}
		task.setDatasetProxyRelations(datasetProxyRelations);
		getTaskResponse.setTask(task);
	 
	 	return getTaskResponse;
	}
}