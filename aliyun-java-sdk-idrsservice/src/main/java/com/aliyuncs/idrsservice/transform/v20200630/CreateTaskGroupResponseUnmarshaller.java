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

package com.aliyuncs.idrsservice.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idrsservice.model.v20200630.CreateTaskGroupResponse;
import com.aliyuncs.idrsservice.model.v20200630.CreateTaskGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTaskGroupResponseUnmarshaller {

	public static CreateTaskGroupResponse unmarshall(CreateTaskGroupResponse createTaskGroupResponse, UnmarshallerContext _ctx) {
		
		createTaskGroupResponse.setRequestId(_ctx.stringValue("CreateTaskGroupResponse.RequestId"));
		createTaskGroupResponse.setCode(_ctx.stringValue("CreateTaskGroupResponse.Code"));
		createTaskGroupResponse.setMessage(_ctx.stringValue("CreateTaskGroupResponse.Message"));

		Data data = new Data();
		data.setCompletedTasks(_ctx.integerValue("CreateTaskGroupResponse.Data.CompletedTasks"));
		data.setCreatedAt(_ctx.stringValue("CreateTaskGroupResponse.Data.CreatedAt"));
		data.setId(_ctx.stringValue("CreateTaskGroupResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateTaskGroupResponse.Data.Name"));
		data.setRuleId(_ctx.stringValue("CreateTaskGroupResponse.Data.RuleId"));
		data.setRuleName(_ctx.stringValue("CreateTaskGroupResponse.Data.RuleName"));
		data.setStatus(_ctx.stringValue("CreateTaskGroupResponse.Data.Status"));
		data.setTotalTasks(_ctx.integerValue("CreateTaskGroupResponse.Data.TotalTasks"));

		List<String> taskIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateTaskGroupResponse.Data.TaskIds.Length"); i++) {
			taskIds.add(_ctx.stringValue("CreateTaskGroupResponse.Data.TaskIds["+ i +"]"));
		}
		data.setTaskIds(taskIds);
		createTaskGroupResponse.setData(data);
	 
	 	return createTaskGroupResponse;
	}
}