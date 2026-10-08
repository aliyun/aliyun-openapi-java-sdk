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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListBatchTasksResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListBatchTasksResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListBatchTasksResponse.PageResult.BatchTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBatchTasksResponseUnmarshaller {

	public static ListBatchTasksResponse unmarshall(ListBatchTasksResponse listBatchTasksResponse, UnmarshallerContext _ctx) {
		
		listBatchTasksResponse.setRequestId(_ctx.stringValue("ListBatchTasksResponse.RequestId"));
		listBatchTasksResponse.setMessage(_ctx.stringValue("ListBatchTasksResponse.Message"));
		listBatchTasksResponse.setHttpStatusCode(_ctx.integerValue("ListBatchTasksResponse.HttpStatusCode"));
		listBatchTasksResponse.setCode(_ctx.stringValue("ListBatchTasksResponse.Code"));
		listBatchTasksResponse.setSuccess(_ctx.booleanValue("ListBatchTasksResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setPageSize(_ctx.integerValue("ListBatchTasksResponse.PageResult.PageSize"));
		pageResult.setPage(_ctx.integerValue("ListBatchTasksResponse.PageResult.Page"));
		pageResult.setCount(_ctx.integerValue("ListBatchTasksResponse.PageResult.Count"));

		List<BatchTask> resultData = new ArrayList<BatchTask>();
		for (int i = 0; i < _ctx.lengthValue("ListBatchTasksResponse.PageResult.ResultData.Length"); i++) {
			BatchTask batchTask = new BatchTask();
			batchTask.setStatus(_ctx.stringValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].Status"));
			batchTask.setOwnerName(_ctx.stringValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].OwnerName"));
			batchTask.setReleased(_ctx.booleanValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].Released"));
			batchTask.setDescription(_ctx.stringValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].Description"));
			batchTask.setNodeName(_ctx.stringValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].NodeName"));
			batchTask.setLastVersion(_ctx.integerValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].LastVersion"));
			batchTask.setOperatorType(_ctx.integerValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].OperatorType"));
			batchTask.setName(_ctx.stringValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].Name"));
			batchTask.setLastSubmitStatus(_ctx.stringValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].LastSubmitStatus"));
			batchTask.setOwnerUserId(_ctx.stringValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].OwnerUserId"));
			batchTask.setNodeType(_ctx.integerValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].NodeType"));
			batchTask.setNodeId(_ctx.stringValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].NodeId"));
			batchTask.setPublished(_ctx.booleanValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].Published"));
			batchTask.setFileId(_ctx.longValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].FileId"));
			batchTask.setDirectory(_ctx.stringValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].Directory"));

			List<String> nodeOutputNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].NodeOutputNameList.Length"); j++) {
				nodeOutputNameList.add(_ctx.stringValue("ListBatchTasksResponse.PageResult.ResultData["+ i +"].NodeOutputNameList["+ j +"]"));
			}
			batchTask.setNodeOutputNameList(nodeOutputNameList);

			resultData.add(batchTask);
		}
		pageResult.setResultData(resultData);
		listBatchTasksResponse.setPageResult(pageResult);
	 
	 	return listBatchTasksResponse;
	}
}