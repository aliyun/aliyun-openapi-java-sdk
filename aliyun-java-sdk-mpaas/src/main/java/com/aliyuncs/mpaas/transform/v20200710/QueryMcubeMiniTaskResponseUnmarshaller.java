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

import com.aliyuncs.mpaas.model.v20200710.QueryMcubeMiniTaskResponse;
import com.aliyuncs.mpaas.model.v20200710.QueryMcubeMiniTaskResponse.QueryMiniTaskResult;
import com.aliyuncs.mpaas.model.v20200710.QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMcubeMiniTaskResponseUnmarshaller {

	public static QueryMcubeMiniTaskResponse unmarshall(QueryMcubeMiniTaskResponse queryMcubeMiniTaskResponse, UnmarshallerContext _ctx) {
		
		queryMcubeMiniTaskResponse.setRequestId(_ctx.stringValue("QueryMcubeMiniTaskResponse.RequestId"));
		queryMcubeMiniTaskResponse.setResultCode(_ctx.stringValue("QueryMcubeMiniTaskResponse.ResultCode"));
		queryMcubeMiniTaskResponse.setResultMessage(_ctx.stringValue("QueryMcubeMiniTaskResponse.ResultMessage"));

		QueryMiniTaskResult queryMiniTaskResult = new QueryMiniTaskResult();
		queryMiniTaskResult.setResultMsg(_ctx.stringValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.ResultMsg"));
		queryMiniTaskResult.setSuccess(_ctx.booleanValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.Success"));

		MiniTaskInfo miniTaskInfo = new MiniTaskInfo();
		miniTaskInfo.setAppCode(_ctx.stringValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.AppCode"));
		miniTaskInfo.setGmtCreate(_ctx.stringValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.GmtCreate"));
		miniTaskInfo.setGmtModified(_ctx.stringValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.GmtModified"));
		miniTaskInfo.setGreyConfigInfo(_ctx.stringValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.GreyConfigInfo"));
		miniTaskInfo.setGreyEndtime(_ctx.stringValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.GreyEndtime"));
		miniTaskInfo.setGreyEndtimeData(_ctx.stringValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.GreyEndtimeData"));
		miniTaskInfo.setGreyNum(_ctx.longValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.GreyNum"));
		miniTaskInfo.setId(_ctx.longValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.Id"));
		miniTaskInfo.setMemo(_ctx.stringValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.Memo"));
		miniTaskInfo.setPackageId(_ctx.longValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.PackageId"));
		miniTaskInfo.setPlatform(_ctx.stringValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.Platform"));
		miniTaskInfo.setProductVersion(_ctx.stringValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.ProductVersion"));
		miniTaskInfo.setPublishMode(_ctx.longValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.PublishMode"));
		miniTaskInfo.setPublishType(_ctx.longValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.PublishType"));
		miniTaskInfo.setStatus(_ctx.stringValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.Status"));
		miniTaskInfo.setTaskStatus(_ctx.longValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.TaskStatus"));
		miniTaskInfo.setWhitelistIds(_ctx.stringValue("QueryMcubeMiniTaskResponse.QueryMiniTaskResult.MiniTaskInfo.WhitelistIds"));
		queryMiniTaskResult.setMiniTaskInfo(miniTaskInfo);
		queryMcubeMiniTaskResponse.setQueryMiniTaskResult(queryMiniTaskResult);
	 
	 	return queryMcubeMiniTaskResponse;
	}
}