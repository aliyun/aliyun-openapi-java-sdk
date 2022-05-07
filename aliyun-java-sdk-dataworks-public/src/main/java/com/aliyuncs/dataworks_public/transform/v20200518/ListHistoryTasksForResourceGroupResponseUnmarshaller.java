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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListHistoryTasksForResourceGroupResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListHistoryTasksForResourceGroupResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListHistoryTasksForResourceGroupResponse.Data.PopTasksForResourceGroupDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHistoryTasksForResourceGroupResponseUnmarshaller {

	public static ListHistoryTasksForResourceGroupResponse unmarshall(ListHistoryTasksForResourceGroupResponse listHistoryTasksForResourceGroupResponse, UnmarshallerContext _ctx) {
		
		listHistoryTasksForResourceGroupResponse.setRequestId(_ctx.stringValue("ListHistoryTasksForResourceGroupResponse.RequestId"));
		listHistoryTasksForResourceGroupResponse.setHttpStatusCode(_ctx.integerValue("ListHistoryTasksForResourceGroupResponse.HttpStatusCode"));
		listHistoryTasksForResourceGroupResponse.setErrorMessage(_ctx.stringValue("ListHistoryTasksForResourceGroupResponse.ErrorMessage"));
		listHistoryTasksForResourceGroupResponse.setErrorCode(_ctx.stringValue("ListHistoryTasksForResourceGroupResponse.ErrorCode"));
		listHistoryTasksForResourceGroupResponse.setSuccess(_ctx.booleanValue("ListHistoryTasksForResourceGroupResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("ListHistoryTasksForResourceGroupResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("ListHistoryTasksForResourceGroupResponse.Data.PageSize"));
		data.setTotalNum(_ctx.integerValue("ListHistoryTasksForResourceGroupResponse.Data.TotalNum"));

		List<PopTasksForResourceGroupDto> tasks = new ArrayList<PopTasksForResourceGroupDto>();
		for (int i = 0; i < _ctx.lengthValue("ListHistoryTasksForResourceGroupResponse.Data.Tasks.Length"); i++) {
			PopTasksForResourceGroupDto popTasksForResourceGroupDto = new PopTasksForResourceGroupDto();
			popTasksForResourceGroupDto.setProjectName(_ctx.stringValue("ListHistoryTasksForResourceGroupResponse.Data.Tasks["+ i +"].ProjectName"));
			popTasksForResourceGroupDto.setStatus(_ctx.integerValue("ListHistoryTasksForResourceGroupResponse.Data.Tasks["+ i +"].Status"));
			popTasksForResourceGroupDto.setConcurrency(_ctx.integerValue("ListHistoryTasksForResourceGroupResponse.Data.Tasks["+ i +"].Concurrency"));
			popTasksForResourceGroupDto.setTaskName(_ctx.stringValue("ListHistoryTasksForResourceGroupResponse.Data.Tasks["+ i +"].TaskName"));
			popTasksForResourceGroupDto.setTaskType(_ctx.integerValue("ListHistoryTasksForResourceGroupResponse.Data.Tasks["+ i +"].TaskType"));
			popTasksForResourceGroupDto.setTaskId(_ctx.stringValue("ListHistoryTasksForResourceGroupResponse.Data.Tasks["+ i +"].TaskId"));

			tasks.add(popTasksForResourceGroupDto);
		}
		data.setTasks(tasks);
		listHistoryTasksForResourceGroupResponse.setData(data);
	 
	 	return listHistoryTasksForResourceGroupResponse;
	}
}