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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricClouddetailbytypeResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricClouddetailbytypeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricClouddetailbytypeResponseUnmarshaller {

	public static QueryLinkefabricFabricClouddetailbytypeResponse unmarshall(QueryLinkefabricFabricClouddetailbytypeResponse queryLinkefabricFabricClouddetailbytypeResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricClouddetailbytypeResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.RequestId"));
		queryLinkefabricFabricClouddetailbytypeResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.ResultCode"));
		queryLinkefabricFabricClouddetailbytypeResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.ResultMessage"));
		queryLinkefabricFabricClouddetailbytypeResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.Message"));
		queryLinkefabricFabricClouddetailbytypeResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricClouddetailbytypeResponse.ResponseStatusCode"));
		queryLinkefabricFabricClouddetailbytypeResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricClouddetailbytypeResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppName(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].AppName"));
			dataItem.setCommonState(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].CommonState"));
			dataItem.setDevStage(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].DevStage"));
			dataItem.setEnv(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].Env"));
			dataItem.setEnvDisplayName(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].EnvDisplayName"));
			dataItem.setExecuteDesc(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].ExecuteDesc"));
			dataItem.setId(_ctx.longValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].Id"));
			dataItem.setProjectId(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].ProjectId"));
			dataItem.setTaskInfo(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].TaskInfo"));
			dataItem.setTaskState(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].TaskState"));
			dataItem.setTaskType(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].TaskType"));
			dataItem.setTaskUrl(_ctx.stringValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].TaskUrl"));
			dataItem.setTenantId(_ctx.longValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].TenantId"));
			dataItem.setUtcModified(_ctx.longValue("QueryLinkefabricFabricClouddetailbytypeResponse.Data["+ i +"].UtcModified"));

			data.add(dataItem);
		}
		queryLinkefabricFabricClouddetailbytypeResponse.setData(data);
	 
	 	return queryLinkefabricFabricClouddetailbytypeResponse;
	}
}