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

import com.aliyuncs.dataworks_public.model.v20200518.ListCheckProcessesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListCheckProcessesResponse.PagingInfo;
import com.aliyuncs.dataworks_public.model.v20200518.ListCheckProcessesResponse.PagingInfo.CheckProcessesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCheckProcessesResponseUnmarshaller {

	public static ListCheckProcessesResponse unmarshall(ListCheckProcessesResponse listCheckProcessesResponse, UnmarshallerContext _ctx) {
		
		listCheckProcessesResponse.setRequestId(_ctx.stringValue("ListCheckProcessesResponse.RequestId"));

		PagingInfo pagingInfo = new PagingInfo();
		pagingInfo.setPageNumber(_ctx.integerValue("ListCheckProcessesResponse.PagingInfo.PageNumber"));
		pagingInfo.setPageSize(_ctx.integerValue("ListCheckProcessesResponse.PagingInfo.PageSize"));
		pagingInfo.setTotalCount(_ctx.integerValue("ListCheckProcessesResponse.PagingInfo.TotalCount"));

		List<CheckProcessesItem> checkProcesses = new ArrayList<CheckProcessesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCheckProcessesResponse.PagingInfo.CheckProcesses.Length"); i++) {
			CheckProcessesItem checkProcessesItem = new CheckProcessesItem();
			checkProcessesItem.setProjectId(_ctx.longValue("ListCheckProcessesResponse.PagingInfo.CheckProcesses["+ i +"].ProjectId"));
			checkProcessesItem.setStatus(_ctx.stringValue("ListCheckProcessesResponse.PagingInfo.CheckProcesses["+ i +"].Status"));
			checkProcessesItem.setEventCode(_ctx.stringValue("ListCheckProcessesResponse.PagingInfo.CheckProcesses["+ i +"].EventCode"));
			checkProcessesItem.setEventName(_ctx.stringValue("ListCheckProcessesResponse.PagingInfo.CheckProcesses["+ i +"].EventName"));
			checkProcessesItem.setEventNameEn(_ctx.stringValue("ListCheckProcessesResponse.PagingInfo.CheckProcesses["+ i +"].EventNameEn"));
			checkProcessesItem.setProcessName(_ctx.stringValue("ListCheckProcessesResponse.PagingInfo.CheckProcesses["+ i +"].ProcessName"));
			checkProcessesItem.setMessageId(_ctx.stringValue("ListCheckProcessesResponse.PagingInfo.CheckProcesses["+ i +"].MessageId"));
			checkProcessesItem.setProcessId(_ctx.stringValue("ListCheckProcessesResponse.PagingInfo.CheckProcesses["+ i +"].ProcessId"));
			checkProcessesItem.setOperator(_ctx.stringValue("ListCheckProcessesResponse.PagingInfo.CheckProcesses["+ i +"].Operator"));

			checkProcesses.add(checkProcessesItem);
		}
		pagingInfo.setCheckProcesses(checkProcesses);
		listCheckProcessesResponse.setPagingInfo(pagingInfo);
	 
	 	return listCheckProcessesResponse;
	}
}