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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricDetailbytypeResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricDetailbytypeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricDetailbytypeResponseUnmarshaller {

	public static QueryLinkefabricFabricDetailbytypeResponse unmarshall(QueryLinkefabricFabricDetailbytypeResponse queryLinkefabricFabricDetailbytypeResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricDetailbytypeResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.RequestId"));
		queryLinkefabricFabricDetailbytypeResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.ResultCode"));
		queryLinkefabricFabricDetailbytypeResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.ResultMessage"));
		queryLinkefabricFabricDetailbytypeResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.Message"));
		queryLinkefabricFabricDetailbytypeResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricDetailbytypeResponse.ResponseStatusCode"));
		queryLinkefabricFabricDetailbytypeResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricDetailbytypeResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricDetailbytypeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppName(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].AppName"));
			dataItem.setCommonState(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].CommonState"));
			dataItem.setDevStage(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].DevStage"));
			dataItem.setEnv(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].Env"));
			dataItem.setEnvDisplayName(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].EnvDisplayName"));
			dataItem.setExecuteDesc(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].ExecuteDesc"));
			dataItem.setId(_ctx.longValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].Id"));
			dataItem.setProjectId(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].ProjectId"));
			dataItem.setTaskInfo(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].TaskInfo"));
			dataItem.setTaskState(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].TaskState"));
			dataItem.setTaskType(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].TaskType"));
			dataItem.setTaskUrl(_ctx.stringValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].TaskUrl"));
			dataItem.setTenantId(_ctx.longValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].TenantId"));
			dataItem.setUtcModified(_ctx.longValue("QueryLinkefabricFabricDetailbytypeResponse.Data["+ i +"].UtcModified"));

			data.add(dataItem);
		}
		queryLinkefabricFabricDetailbytypeResponse.setData(data);
	 
	 	return queryLinkefabricFabricDetailbytypeResponse;
	}
}