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

import com.aliyuncs.idrsservice.model.v20200630.GetDetectionResponse;
import com.aliyuncs.idrsservice.model.v20200630.GetDetectionResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.GetDetectionResponse.Data.TasksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDetectionResponseUnmarshaller {

	public static GetDetectionResponse unmarshall(GetDetectionResponse getDetectionResponse, UnmarshallerContext _ctx) {
		
		getDetectionResponse.setRequestId(_ctx.stringValue("GetDetectionResponse.RequestId"));
		getDetectionResponse.setCode(_ctx.stringValue("GetDetectionResponse.Code"));
		getDetectionResponse.setMessage(_ctx.stringValue("GetDetectionResponse.Message"));

		Data data = new Data();
		data.setCreatedAt(_ctx.stringValue("GetDetectionResponse.Data.CreatedAt"));
		data.setDepartmentId(_ctx.stringValue("GetDetectionResponse.Data.DepartmentId"));
		data.setDepartmentName(_ctx.stringValue("GetDetectionResponse.Data.DepartmentName"));
		data.setId(_ctx.stringValue("GetDetectionResponse.Data.Id"));
		data.setRecordingType(_ctx.stringValue("GetDetectionResponse.Data.RecordingType"));
		data.setRuleId(_ctx.stringValue("GetDetectionResponse.Data.RuleId"));
		data.setRuleName(_ctx.stringValue("GetDetectionResponse.Data.RuleName"));
		data.setStatus(_ctx.stringValue("GetDetectionResponse.Data.Status"));

		List<TasksItem> tasks = new ArrayList<TasksItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDetectionResponse.Data.Tasks.Length"); i++) {
			TasksItem tasksItem = new TasksItem();
			tasksItem.setCreatedAt(_ctx.stringValue("GetDetectionResponse.Data.Tasks["+ i +"].CreatedAt"));
			tasksItem.setId(_ctx.stringValue("GetDetectionResponse.Data.Tasks["+ i +"].Id"));
			tasksItem.setStatus(_ctx.stringValue("GetDetectionResponse.Data.Tasks["+ i +"].Status"));
			tasksItem.setVideoMetaUrl(_ctx.stringValue("GetDetectionResponse.Data.Tasks["+ i +"].VideoMetaUrl"));
			tasksItem.setVideoUrl(_ctx.stringValue("GetDetectionResponse.Data.Tasks["+ i +"].VideoUrl"));

			tasks.add(tasksItem);
		}
		data.setTasks(tasks);
		getDetectionResponse.setData(data);
	 
	 	return getDetectionResponse;
	}
}