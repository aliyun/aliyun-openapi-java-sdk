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

import com.aliyuncs.dataworks_public.model.v20200518.ListCurrentTasksForResourceGroupResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListCurrentTasksForResourceGroupResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListCurrentTasksForResourceGroupResponse.Data.PopTasksForResourceGroupDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCurrentTasksForResourceGroupResponseUnmarshaller {

	public static ListCurrentTasksForResourceGroupResponse unmarshall(ListCurrentTasksForResourceGroupResponse listCurrentTasksForResourceGroupResponse, UnmarshallerContext _ctx) {
		
		listCurrentTasksForResourceGroupResponse.setRequestId(_ctx.stringValue("ListCurrentTasksForResourceGroupResponse.RequestId"));
		listCurrentTasksForResourceGroupResponse.setHttpStatusCode(_ctx.integerValue("ListCurrentTasksForResourceGroupResponse.HttpStatusCode"));
		listCurrentTasksForResourceGroupResponse.setErrorMessage(_ctx.stringValue("ListCurrentTasksForResourceGroupResponse.ErrorMessage"));
		listCurrentTasksForResourceGroupResponse.setErrorCode(_ctx.stringValue("ListCurrentTasksForResourceGroupResponse.ErrorCode"));
		listCurrentTasksForResourceGroupResponse.setSuccess(_ctx.booleanValue("ListCurrentTasksForResourceGroupResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("ListCurrentTasksForResourceGroupResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("ListCurrentTasksForResourceGroupResponse.Data.PageSize"));
		data.setTotalNum(_ctx.integerValue("ListCurrentTasksForResourceGroupResponse.Data.TotalNum"));

		List<PopTasksForResourceGroupDto> tasks = new ArrayList<PopTasksForResourceGroupDto>();
		for (int i = 0; i < _ctx.lengthValue("ListCurrentTasksForResourceGroupResponse.Data.Tasks.Length"); i++) {
			PopTasksForResourceGroupDto popTasksForResourceGroupDto = new PopTasksForResourceGroupDto();
			popTasksForResourceGroupDto.setProjectName(_ctx.stringValue("ListCurrentTasksForResourceGroupResponse.Data.Tasks["+ i +"].ProjectName"));
			popTasksForResourceGroupDto.setStatus(_ctx.integerValue("ListCurrentTasksForResourceGroupResponse.Data.Tasks["+ i +"].Status"));
			popTasksForResourceGroupDto.setConcurrency(_ctx.stringValue("ListCurrentTasksForResourceGroupResponse.Data.Tasks["+ i +"].Concurrency"));
			popTasksForResourceGroupDto.setTaskName(_ctx.stringValue("ListCurrentTasksForResourceGroupResponse.Data.Tasks["+ i +"].TaskName"));
			popTasksForResourceGroupDto.setTaskType(_ctx.integerValue("ListCurrentTasksForResourceGroupResponse.Data.Tasks["+ i +"].TaskType"));
			popTasksForResourceGroupDto.setTaskId(_ctx.stringValue("ListCurrentTasksForResourceGroupResponse.Data.Tasks["+ i +"].TaskId"));
			popTasksForResourceGroupDto.setTaskSource(_ctx.stringValue("ListCurrentTasksForResourceGroupResponse.Data.Tasks["+ i +"].TaskSource"));

			tasks.add(popTasksForResourceGroupDto);
		}
		data.setTasks(tasks);
		listCurrentTasksForResourceGroupResponse.setData(data);
	 
	 	return listCurrentTasksForResourceGroupResponse;
	}
}