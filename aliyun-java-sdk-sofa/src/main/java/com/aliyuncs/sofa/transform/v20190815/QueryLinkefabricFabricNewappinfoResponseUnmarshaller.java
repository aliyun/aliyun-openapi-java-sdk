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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricNewappinfoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricNewappinfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricNewappinfoResponseUnmarshaller {

	public static QueryLinkefabricFabricNewappinfoResponse unmarshall(QueryLinkefabricFabricNewappinfoResponse queryLinkefabricFabricNewappinfoResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricNewappinfoResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricNewappinfoResponse.RequestId"));
		queryLinkefabricFabricNewappinfoResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricNewappinfoResponse.ResultCode"));
		queryLinkefabricFabricNewappinfoResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricNewappinfoResponse.ResultMessage"));
		queryLinkefabricFabricNewappinfoResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricNewappinfoResponse.Message"));
		queryLinkefabricFabricNewappinfoResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricNewappinfoResponse.ResponseStatusCode"));
		queryLinkefabricFabricNewappinfoResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricNewappinfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricNewappinfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAntxVersion(_ctx.stringValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].AntxVersion"));
			dataItem.setAppName(_ctx.stringValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].AppName"));
			dataItem.setBaseJar(_ctx.booleanValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].BaseJar"));
			dataItem.setConfigBak(_ctx.booleanValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].ConfigBak"));
			dataItem.setDevStage(_ctx.stringValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].DevStage"));
			dataItem.setExtraInfo(_ctx.stringValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].ExtraInfo"));
			dataItem.setGrayRelease(_ctx.booleanValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].GrayRelease"));
			dataItem.setId(_ctx.longValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].Id"));
			dataItem.setIsNewApp(_ctx.booleanValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].IsNewApp"));
			dataItem.setIsRollback(_ctx.booleanValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].IsRollback"));
			dataItem.setOriginReleaseIds(_ctx.stringValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].OriginReleaseIds"));
			dataItem.setProjectId(_ctx.stringValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].ProjectId"));
			dataItem.setReleaseId(_ctx.stringValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].ReleaseId"));
			dataItem.setSandboxRelease(_ctx.booleanValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].SandboxRelease"));
			dataItem.setStation(_ctx.stringValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].Station"));
			dataItem.setTenantId(_ctx.longValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].TenantId"));
			dataItem.setUtcCreate(_ctx.longValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.longValue("QueryLinkefabricFabricNewappinfoResponse.Data["+ i +"].UtcModified"));

			data.add(dataItem);
		}
		queryLinkefabricFabricNewappinfoResponse.setData(data);
	 
	 	return queryLinkefabricFabricNewappinfoResponse;
	}
}