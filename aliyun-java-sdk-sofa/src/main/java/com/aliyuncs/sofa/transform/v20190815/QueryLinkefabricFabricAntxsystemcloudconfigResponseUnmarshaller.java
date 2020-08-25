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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricAntxsystemcloudconfigResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricAntxsystemcloudconfigResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricAntxsystemcloudconfigResponseUnmarshaller {

	public static QueryLinkefabricFabricAntxsystemcloudconfigResponse unmarshall(QueryLinkefabricFabricAntxsystemcloudconfigResponse queryLinkefabricFabricAntxsystemcloudconfigResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricAntxsystemcloudconfigResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.RequestId"));
		queryLinkefabricFabricAntxsystemcloudconfigResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.ResultCode"));
		queryLinkefabricFabricAntxsystemcloudconfigResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.ResultMessage"));
		queryLinkefabricFabricAntxsystemcloudconfigResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.Message"));
		queryLinkefabricFabricAntxsystemcloudconfigResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.ResponseStatusCode"));
		queryLinkefabricFabricAntxsystemcloudconfigResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCommonConfig(_ctx.stringValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.Data["+ i +"].CommonConfig"));
			dataItem.setDevStage(_ctx.stringValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.Data["+ i +"].DevStage"));
			dataItem.setEnv(_ctx.stringValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.Data["+ i +"].Env"));
			dataItem.setEnvDisplayName(_ctx.stringValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.Data["+ i +"].EnvDisplayName"));
			dataItem.setEnvId(_ctx.longValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.Data["+ i +"].EnvId"));
			dataItem.setOrders(_ctx.longValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.Data["+ i +"].Orders"));
			dataItem.setSysConfigType(_ctx.stringValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.Data["+ i +"].SysConfigType"));
			dataItem.setTenangId(_ctx.longValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.Data["+ i +"].TenangId"));
			dataItem.setUniqueConfig(_ctx.stringValue("QueryLinkefabricFabricAntxsystemcloudconfigResponse.Data["+ i +"].UniqueConfig"));

			data.add(dataItem);
		}
		queryLinkefabricFabricAntxsystemcloudconfigResponse.setData(data);
	 
	 	return queryLinkefabricFabricAntxsystemcloudconfigResponse;
	}
}