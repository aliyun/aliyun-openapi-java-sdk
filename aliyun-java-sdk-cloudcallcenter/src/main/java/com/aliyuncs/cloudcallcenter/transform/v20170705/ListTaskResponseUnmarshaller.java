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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListTaskResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListTaskResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListTaskResponse.Data.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskResponseUnmarshaller {

	public static ListTaskResponse unmarshall(ListTaskResponse listTaskResponse, UnmarshallerContext context) {
		
		listTaskResponse.setRequestId(context.stringValue("ListTaskResponse.RequestId"));
		listTaskResponse.setSuccess(context.booleanValue("ListTaskResponse.Success"));
		listTaskResponse.setCode(context.stringValue("ListTaskResponse.Code"));
		listTaskResponse.setMessage(context.stringValue("ListTaskResponse.Message"));
		listTaskResponse.setHttpStatusCode(context.integerValue("ListTaskResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("ListTaskResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("ListTaskResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("ListTaskResponse.Data.PageSize"));

		List<Task> list = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("ListTaskResponse.Data.List.Length"); i++) {
			Task task = new Task();
			task.setTaskId(context.longValue("ListTaskResponse.Data.List["+ i +"].TaskId"));
			task.setType(context.stringValue("ListTaskResponse.Data.List["+ i +"].Type"));
			task.setDescription(context.stringValue("ListTaskResponse.Data.List["+ i +"].Description"));
			task.setStatus(context.stringValue("ListTaskResponse.Data.List["+ i +"].Status"));
			task.setDownloadCount(context.integerValue("ListTaskResponse.Data.List["+ i +"].DownloadCount"));
			task.setHandleDuration(context.longValue("ListTaskResponse.Data.List["+ i +"].HandleDuration"));
			task.setExpireTime(context.stringValue("ListTaskResponse.Data.List["+ i +"].ExpireTime"));

			list.add(task);
		}
		data.setList(list);
		listTaskResponse.setData(data);
	 
	 	return listTaskResponse;
	}
}