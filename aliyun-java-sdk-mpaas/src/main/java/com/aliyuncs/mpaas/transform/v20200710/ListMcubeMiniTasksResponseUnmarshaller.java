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

package com.aliyuncs.mpaas.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20200710.ListMcubeMiniTasksResponse;
import com.aliyuncs.mpaas.model.v20200710.ListMcubeMiniTasksResponse.ListMiniTaskResult;
import com.aliyuncs.mpaas.model.v20200710.ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeMiniTasksResponseUnmarshaller {

	public static ListMcubeMiniTasksResponse unmarshall(ListMcubeMiniTasksResponse listMcubeMiniTasksResponse, UnmarshallerContext _ctx) {
		
		listMcubeMiniTasksResponse.setRequestId(_ctx.stringValue("ListMcubeMiniTasksResponse.RequestId"));
		listMcubeMiniTasksResponse.setResultMessage(_ctx.stringValue("ListMcubeMiniTasksResponse.ResultMessage"));
		listMcubeMiniTasksResponse.setResultCode(_ctx.stringValue("ListMcubeMiniTasksResponse.ResultCode"));

		ListMiniTaskResult listMiniTaskResult = new ListMiniTaskResult();
		listMiniTaskResult.setSuccess(_ctx.booleanValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.Success"));
		listMiniTaskResult.setResultMsg(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.ResultMsg"));

		List<MiniTaskListItem> miniTaskList = new ArrayList<MiniTaskListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList.Length"); i++) {
			MiniTaskListItem miniTaskListItem = new MiniTaskListItem();
			miniTaskListItem.setStatus(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].Status"));
			miniTaskListItem.setPublishMode(_ctx.longValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].PublishMode"));
			miniTaskListItem.setAppCode(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].AppCode"));
			miniTaskListItem.setMemo(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].Memo"));
			miniTaskListItem.setGreyEndtime(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].GreyEndtime"));
			miniTaskListItem.setGreyNum(_ctx.longValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].GreyNum"));
			miniTaskListItem.setGreyConfigInfo(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].GreyConfigInfo"));
			miniTaskListItem.setGmtModified(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].GmtModified"));
			miniTaskListItem.setProductVersion(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].ProductVersion"));
			miniTaskListItem.setGreyEndtimeData(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].GreyEndtimeData"));
			miniTaskListItem.setPublishType(_ctx.longValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].PublishType"));
			miniTaskListItem.setTaskStatus(_ctx.longValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].TaskStatus"));
			miniTaskListItem.setWhitelistIds(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].WhitelistIds"));
			miniTaskListItem.setPlatform(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].Platform"));
			miniTaskListItem.setGmtCreate(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].GmtCreate"));
			miniTaskListItem.setPackageId(_ctx.longValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].PackageId"));
			miniTaskListItem.setId(_ctx.longValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].Id"));

			miniTaskList.add(miniTaskListItem);
		}
		listMiniTaskResult.setMiniTaskList(miniTaskList);
		listMcubeMiniTasksResponse.setListMiniTaskResult(listMiniTaskResult);
	 
	 	return listMcubeMiniTasksResponse;
	}
}