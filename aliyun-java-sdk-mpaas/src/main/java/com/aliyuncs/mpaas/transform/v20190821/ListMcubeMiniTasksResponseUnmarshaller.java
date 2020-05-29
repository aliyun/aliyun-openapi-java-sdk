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

package com.aliyuncs.mpaas.transform.v20190821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20190821.ListMcubeMiniTasksResponse;
import com.aliyuncs.mpaas.model.v20190821.ListMcubeMiniTasksResponse.ListMiniTaskResult;
import com.aliyuncs.mpaas.model.v20190821.ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeMiniTasksResponseUnmarshaller {

	public static ListMcubeMiniTasksResponse unmarshall(ListMcubeMiniTasksResponse listMcubeMiniTasksResponse, UnmarshallerContext _ctx) {
		
		listMcubeMiniTasksResponse.setRequestId(_ctx.stringValue("ListMcubeMiniTasksResponse.RequestId"));
		listMcubeMiniTasksResponse.setResultCode(_ctx.stringValue("ListMcubeMiniTasksResponse.ResultCode"));
		listMcubeMiniTasksResponse.setResultMessage(_ctx.stringValue("ListMcubeMiniTasksResponse.ResultMessage"));

		ListMiniTaskResult listMiniTaskResult = new ListMiniTaskResult();
		listMiniTaskResult.setResultMsg(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.ResultMsg"));
		listMiniTaskResult.setSuccess(_ctx.booleanValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.Success"));

		List<MiniTaskListItem> miniTaskList = new ArrayList<MiniTaskListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList.Length"); i++) {
			MiniTaskListItem miniTaskListItem = new MiniTaskListItem();
			miniTaskListItem.setAppCode(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].AppCode"));
			miniTaskListItem.setGmtCreate(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].GmtCreate"));
			miniTaskListItem.setGmtModified(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].GmtModified"));
			miniTaskListItem.setGreyConfigInfo(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].GreyConfigInfo"));
			miniTaskListItem.setGreyEndtime(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].GreyEndtime"));
			miniTaskListItem.setGreyEndtimeData(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].GreyEndtimeData"));
			miniTaskListItem.setGreyNum(_ctx.longValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].GreyNum"));
			miniTaskListItem.setId(_ctx.longValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].Id"));
			miniTaskListItem.setMemo(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].Memo"));
			miniTaskListItem.setPackageId(_ctx.longValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].PackageId"));
			miniTaskListItem.setPlatform(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].Platform"));
			miniTaskListItem.setProductVersion(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].ProductVersion"));
			miniTaskListItem.setPublishMode(_ctx.longValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].PublishMode"));
			miniTaskListItem.setPublishType(_ctx.longValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].PublishType"));
			miniTaskListItem.setStatus(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].Status"));
			miniTaskListItem.setTaskStatus(_ctx.longValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].TaskStatus"));
			miniTaskListItem.setWhitelistIds(_ctx.stringValue("ListMcubeMiniTasksResponse.ListMiniTaskResult.MiniTaskList["+ i +"].WhitelistIds"));

			miniTaskList.add(miniTaskListItem);
		}
		listMiniTaskResult.setMiniTaskList(miniTaskList);
		listMcubeMiniTasksResponse.setListMiniTaskResult(listMiniTaskResult);
	 
	 	return listMcubeMiniTasksResponse;
	}
}