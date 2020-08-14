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

import com.aliyuncs.idrsservice.model.v20200630.GetTaskGroupResponse;
import com.aliyuncs.idrsservice.model.v20200630.GetTaskGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskGroupResponseUnmarshaller {

	public static GetTaskGroupResponse unmarshall(GetTaskGroupResponse getTaskGroupResponse, UnmarshallerContext _ctx) {
		
		getTaskGroupResponse.setRequestId(_ctx.stringValue("GetTaskGroupResponse.RequestId"));
		getTaskGroupResponse.setCode(_ctx.stringValue("GetTaskGroupResponse.Code"));
		getTaskGroupResponse.setMessage(_ctx.stringValue("GetTaskGroupResponse.Message"));

		Data data = new Data();
		data.setCompletedTasks(_ctx.integerValue("GetTaskGroupResponse.Data.CompletedTasks"));
		data.setCreatedAt(_ctx.stringValue("GetTaskGroupResponse.Data.CreatedAt"));
		data.setId(_ctx.stringValue("GetTaskGroupResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetTaskGroupResponse.Data.Name"));
		data.setRuleId(_ctx.stringValue("GetTaskGroupResponse.Data.RuleId"));
		data.setRuleName(_ctx.stringValue("GetTaskGroupResponse.Data.RuleName"));
		data.setStatus(_ctx.stringValue("GetTaskGroupResponse.Data.Status"));
		data.setTotalTasks(_ctx.integerValue("GetTaskGroupResponse.Data.TotalTasks"));

		List<String> taskIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskGroupResponse.Data.TaskIds.Length"); i++) {
			taskIds.add(_ctx.stringValue("GetTaskGroupResponse.Data.TaskIds["+ i +"]"));
		}
		data.setTaskIds(taskIds);
		getTaskGroupResponse.setData(data);
	 
	 	return getTaskGroupResponse;
	}
}