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

package com.aliyuncs.appstream_center.transform.v20210901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appstream_center.model.v20210901.ListOtaTaskResponse;
import com.aliyuncs.appstream_center.model.v20210901.ListOtaTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOtaTaskResponseUnmarshaller {

	public static ListOtaTaskResponse unmarshall(ListOtaTaskResponse listOtaTaskResponse, UnmarshallerContext _ctx) {
		
		listOtaTaskResponse.setRequestId(_ctx.stringValue("ListOtaTaskResponse.RequestId"));
		listOtaTaskResponse.setTotalCount(_ctx.integerValue("ListOtaTaskResponse.TotalCount"));
		listOtaTaskResponse.setPageSize(_ctx.integerValue("ListOtaTaskResponse.PageSize"));
		listOtaTaskResponse.setPageNumber(_ctx.integerValue("ListOtaTaskResponse.PageNumber"));

		List<Data> taskList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListOtaTaskResponse.TaskList.Length"); i++) {
			Data data = new Data();
			data.setOtaVersion(_ctx.stringValue("ListOtaTaskResponse.TaskList["+ i +"].OtaVersion"));
			data.setTaskDisplayStatus(_ctx.stringValue("ListOtaTaskResponse.TaskList["+ i +"].TaskDisplayStatus"));
			data.setTaskStartTime(_ctx.stringValue("ListOtaTaskResponse.TaskList["+ i +"].TaskStartTime"));
			data.setTaskId(_ctx.stringValue("ListOtaTaskResponse.TaskList["+ i +"].TaskId"));

			taskList.add(data);
		}
		listOtaTaskResponse.setTaskList(taskList);
	 
	 	return listOtaTaskResponse;
	}
}