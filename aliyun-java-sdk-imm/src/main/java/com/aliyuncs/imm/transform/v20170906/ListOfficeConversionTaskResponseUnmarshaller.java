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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListOfficeConversionTaskResponse;
import com.aliyuncs.imm.model.v20170906.ListOfficeConversionTaskResponse.TasksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOfficeConversionTaskResponseUnmarshaller {

	public static ListOfficeConversionTaskResponse unmarshall(ListOfficeConversionTaskResponse listOfficeConversionTaskResponse, UnmarshallerContext _ctx) {
		
		listOfficeConversionTaskResponse.setRequestId(_ctx.stringValue("ListOfficeConversionTaskResponse.RequestId"));
		listOfficeConversionTaskResponse.setNextMarker(_ctx.stringValue("ListOfficeConversionTaskResponse.NextMarker"));

		List<TasksItem> tasks = new ArrayList<TasksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListOfficeConversionTaskResponse.Tasks.Length"); i++) {
			TasksItem tasksItem = new TasksItem();
			tasksItem.setTaskId(_ctx.stringValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].TaskId"));
			tasksItem.setStatus(_ctx.stringValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].Status"));
			tasksItem.setPercent(_ctx.integerValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].Percent"));
			tasksItem.setPageCount(_ctx.integerValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].PageCount"));
			tasksItem.setSrcUri(_ctx.stringValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].SrcUri"));
			tasksItem.setTgtType(_ctx.stringValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].TgtType"));
			tasksItem.setTgtUri(_ctx.stringValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].TgtUri"));
			tasksItem.setImageSpec(_ctx.stringValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].ImageSpec"));
			tasksItem.setNotifyTopicName(_ctx.stringValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].NotifyTopicName"));
			tasksItem.setNotifyEndpoint(_ctx.stringValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].NotifyEndpoint"));
			tasksItem.setExternalID(_ctx.stringValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].ExternalID"));
			tasksItem.setCreateTime(_ctx.stringValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].CreateTime"));
			tasksItem.setFinishTime(_ctx.stringValue("ListOfficeConversionTaskResponse.Tasks["+ i +"].FinishTime"));

			tasks.add(tasksItem);
		}
		listOfficeConversionTaskResponse.setTasks(tasks);
	 
	 	return listOfficeConversionTaskResponse;
	}
}