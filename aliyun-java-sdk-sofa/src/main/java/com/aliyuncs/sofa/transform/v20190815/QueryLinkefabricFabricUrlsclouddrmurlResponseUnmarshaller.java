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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricUrlsclouddrmurlResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricUrlsclouddrmurlResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricUrlsclouddrmurlResponseUnmarshaller {

	public static QueryLinkefabricFabricUrlsclouddrmurlResponse unmarshall(QueryLinkefabricFabricUrlsclouddrmurlResponse queryLinkefabricFabricUrlsclouddrmurlResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricUrlsclouddrmurlResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.RequestId"));
		queryLinkefabricFabricUrlsclouddrmurlResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.ResultCode"));
		queryLinkefabricFabricUrlsclouddrmurlResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.ResultMessage"));
		queryLinkefabricFabricUrlsclouddrmurlResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.Message"));
		queryLinkefabricFabricUrlsclouddrmurlResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.ResponseStatusCode"));
		queryLinkefabricFabricUrlsclouddrmurlResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCommonConfig(_ctx.stringValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.Data["+ i +"].CommonConfig"));
			dataItem.setDevStage(_ctx.stringValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.Data["+ i +"].DevStage"));
			dataItem.setEnv(_ctx.stringValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.Data["+ i +"].Env"));
			dataItem.setEnvDisplayName(_ctx.stringValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.Data["+ i +"].EnvDisplayName"));
			dataItem.setEnvId(_ctx.longValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.Data["+ i +"].EnvId"));
			dataItem.setOrders(_ctx.longValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.Data["+ i +"].Orders"));
			dataItem.setSysConfigType(_ctx.stringValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.Data["+ i +"].SysConfigType"));
			dataItem.setTenangId(_ctx.longValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.Data["+ i +"].TenangId"));
			dataItem.setUniqueConfig(_ctx.stringValue("QueryLinkefabricFabricUrlsclouddrmurlResponse.Data["+ i +"].UniqueConfig"));

			data.add(dataItem);
		}
		queryLinkefabricFabricUrlsclouddrmurlResponse.setData(data);
	 
	 	return queryLinkefabricFabricUrlsclouddrmurlResponse;
	}
}