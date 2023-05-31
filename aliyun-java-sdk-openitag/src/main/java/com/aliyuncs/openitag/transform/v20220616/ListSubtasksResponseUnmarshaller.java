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

import com.aliyuncs.openitag.model.v20220616.ListSubtasksResponse;
import com.aliyuncs.openitag.model.v20220616.ListSubtasksResponse.SubtasksItem;
import com.aliyuncs.openitag.model.v20220616.ListSubtasksResponse.SubtasksItem.ItemsItem;
import com.aliyuncs.openitag.model.v20220616.ListSubtasksResponse.SubtasksItem.WorkforceItem;
import com.aliyuncs.openitag.model.v20220616.ListSubtasksResponse.SubtasksItem.WorkforceItem.UsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubtasksResponseUnmarshaller {

	public static ListSubtasksResponse unmarshall(ListSubtasksResponse listSubtasksResponse, UnmarshallerContext _ctx) {
		
		listSubtasksResponse.setRequestId(_ctx.stringValue("ListSubtasksResponse.RequestId"));
		listSubtasksResponse.setCode(_ctx.integerValue("ListSubtasksResponse.Code"));
		listSubtasksResponse.setMessage(_ctx.stringValue("ListSubtasksResponse.Message"));
		listSubtasksResponse.setDetails(_ctx.stringValue("ListSubtasksResponse.Details"));
		listSubtasksResponse.setSuccess(_ctx.booleanValue("ListSubtasksResponse.Success"));
		listSubtasksResponse.setPageNumber(_ctx.integerValue("ListSubtasksResponse.PageNumber"));
		listSubtasksResponse.setPageSize(_ctx.integerValue("ListSubtasksResponse.PageSize"));
		listSubtasksResponse.setTotalPage(_ctx.integerValue("ListSubtasksResponse.TotalPage"));
		listSubtasksResponse.setTotalCount(_ctx.integerValue("ListSubtasksResponse.TotalCount"));
		listSubtasksResponse.setErrorCode(_ctx.stringValue("ListSubtasksResponse.ErrorCode"));

		List<SubtasksItem> subtasks = new ArrayList<SubtasksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSubtasksResponse.Subtasks.Length"); i++) {
			SubtasksItem subtasksItem = new SubtasksItem();
			subtasksItem.setSubtaskId(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].SubtaskId"));
			subtasksItem.setStatus(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].Status"));
			subtasksItem.setTaskId(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].TaskId"));
			subtasksItem.setCurrentWorkNode(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].CurrentWorkNode"));
			subtasksItem.setWorkNodeState(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].WorkNodeState"));
			subtasksItem.setCanReassign(_ctx.booleanValue("ListSubtasksResponse.Subtasks["+ i +"].CanReassign"));
			subtasksItem.setCanRelease(_ctx.booleanValue("ListSubtasksResponse.Subtasks["+ i +"].CanRelease"));
			subtasksItem.setCanDiscard(_ctx.booleanValue("ListSubtasksResponse.Subtasks["+ i +"].CanDiscard"));
			subtasksItem.setWeight(_ctx.longValue("ListSubtasksResponse.Subtasks["+ i +"].Weight"));
			subtasksItem.setExtConfigs(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].ExtConfigs"));

			List<ItemsItem> items = new ArrayList<ItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSubtasksResponse.Subtasks["+ i +"].Items.Length"); j++) {
				ItemsItem itemsItem = new ItemsItem();
				itemsItem.setFeedbackRemark(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].Items["+ j +"].FeedbackRemark"));
				itemsItem.setFeedbackFlag(_ctx.booleanValue("ListSubtasksResponse.Subtasks["+ i +"].Items["+ j +"].FeedbackFlag"));
				itemsItem.setDataId(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].Items["+ j +"].DataId"));
				itemsItem.setState(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].Items["+ j +"].State"));
				itemsItem.setMine(_ctx.longValue("ListSubtasksResponse.Subtasks["+ i +"].Items["+ j +"].Mine"));
				itemsItem.setRejectFlag(_ctx.booleanValue("ListSubtasksResponse.Subtasks["+ i +"].Items["+ j +"].RejectFlag"));
				itemsItem.setFixedFlag(_ctx.booleanValue("ListSubtasksResponse.Subtasks["+ i +"].Items["+ j +"].FixedFlag"));
				itemsItem.setAbandonFlag(_ctx.booleanValue("ListSubtasksResponse.Subtasks["+ i +"].Items["+ j +"].AbandonFlag"));
				itemsItem.setAbandonRemark(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].Items["+ j +"].AbandonRemark"));
				itemsItem.setWeight(_ctx.longValue("ListSubtasksResponse.Subtasks["+ i +"].Items["+ j +"].Weight"));

				items.add(itemsItem);
			}
			subtasksItem.setItems(items);

			List<WorkforceItem> workforce = new ArrayList<WorkforceItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSubtasksResponse.Subtasks["+ i +"].Workforce.Length"); j++) {
				WorkforceItem workforceItem = new WorkforceItem();
				workforceItem.setNodeType(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].Workforce["+ j +"].NodeType"));
				workforceItem.setWorkNodeId(_ctx.integerValue("ListSubtasksResponse.Subtasks["+ i +"].Workforce["+ j +"].WorkNodeId"));

				List<UsersItem> users = new ArrayList<UsersItem>();
				for (int k = 0; k < _ctx.lengthValue("ListSubtasksResponse.Subtasks["+ i +"].Workforce["+ j +"].Users.Length"); k++) {
					UsersItem usersItem = new UsersItem();
					usersItem.setUserId(_ctx.longValue("ListSubtasksResponse.Subtasks["+ i +"].Workforce["+ j +"].Users["+ k +"].UserId"));
					usersItem.setAccountType(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].Workforce["+ j +"].Users["+ k +"].AccountType"));
					usersItem.setAccountNo(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].Workforce["+ j +"].Users["+ k +"].AccountNo"));
					usersItem.setUserName(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].Workforce["+ j +"].Users["+ k +"].UserName"));
					usersItem.setRole(_ctx.stringValue("ListSubtasksResponse.Subtasks["+ i +"].Workforce["+ j +"].Users["+ k +"].Role"));

					users.add(usersItem);
				}
				workforceItem.setUsers(users);

				workforce.add(workforceItem);
			}
			subtasksItem.setWorkforce(workforce);

			subtasks.add(subtasksItem);
		}
		listSubtasksResponse.setSubtasks(subtasks);
	 
	 	return listSubtasksResponse;
	}
}