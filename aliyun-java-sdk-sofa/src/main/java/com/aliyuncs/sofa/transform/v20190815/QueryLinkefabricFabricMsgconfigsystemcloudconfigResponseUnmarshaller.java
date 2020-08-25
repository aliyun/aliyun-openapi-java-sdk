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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseUnmarshaller {

	public static QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse unmarshall(QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse queryLinkefabricFabricMsgconfigsystemcloudconfigResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricMsgconfigsystemcloudconfigResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.RequestId"));
		queryLinkefabricFabricMsgconfigsystemcloudconfigResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.ResultCode"));
		queryLinkefabricFabricMsgconfigsystemcloudconfigResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.ResultMessage"));
		queryLinkefabricFabricMsgconfigsystemcloudconfigResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.Message"));
		queryLinkefabricFabricMsgconfigsystemcloudconfigResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.ResponseStatusCode"));
		queryLinkefabricFabricMsgconfigsystemcloudconfigResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCommonConfig(_ctx.stringValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.Data["+ i +"].CommonConfig"));
			dataItem.setDevStage(_ctx.stringValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.Data["+ i +"].DevStage"));
			dataItem.setEnv(_ctx.stringValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.Data["+ i +"].Env"));
			dataItem.setEnvDisplayName(_ctx.stringValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.Data["+ i +"].EnvDisplayName"));
			dataItem.setEnvId(_ctx.longValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.Data["+ i +"].EnvId"));
			dataItem.setOrders(_ctx.longValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.Data["+ i +"].Orders"));
			dataItem.setSysConfigType(_ctx.stringValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.Data["+ i +"].SysConfigType"));
			dataItem.setTenangId(_ctx.longValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.Data["+ i +"].TenangId"));
			dataItem.setUniqueConfig(_ctx.stringValue("QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse.Data["+ i +"].UniqueConfig"));

			data.add(dataItem);
		}
		queryLinkefabricFabricMsgconfigsystemcloudconfigResponse.setData(data);
	 
	 	return queryLinkefabricFabricMsgconfigsystemcloudconfigResponse;
	}
}