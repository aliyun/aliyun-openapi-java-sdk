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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCiprojectbyappnameResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCiprojectbyappnameResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricCiprojectbyappnameResponseUnmarshaller {

	public static QueryLinkefabricFabricCiprojectbyappnameResponse unmarshall(QueryLinkefabricFabricCiprojectbyappnameResponse queryLinkefabricFabricCiprojectbyappnameResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricCiprojectbyappnameResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricCiprojectbyappnameResponse.RequestId"));
		queryLinkefabricFabricCiprojectbyappnameResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricCiprojectbyappnameResponse.ResultCode"));
		queryLinkefabricFabricCiprojectbyappnameResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricCiprojectbyappnameResponse.ResultMessage"));
		queryLinkefabricFabricCiprojectbyappnameResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Message"));
		queryLinkefabricFabricCiprojectbyappnameResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricCiprojectbyappnameResponse.ResponseStatusCode"));
		queryLinkefabricFabricCiprojectbyappnameResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAntxVersion(_ctx.stringValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].AntxVersion"));
			dataItem.setAppName(_ctx.stringValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].AppName"));
			dataItem.setBaseJar(_ctx.booleanValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].BaseJar"));
			dataItem.setConfigBak(_ctx.booleanValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].ConfigBak"));
			dataItem.setDevStage(_ctx.stringValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].DevStage"));
			dataItem.setExtraInfo(_ctx.stringValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].ExtraInfo"));
			dataItem.setGrayRelease(_ctx.booleanValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].GrayRelease"));
			dataItem.setId(_ctx.longValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].Id"));
			dataItem.setIsNewApp(_ctx.booleanValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].IsNewApp"));
			dataItem.setIsRollback(_ctx.booleanValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].IsRollback"));
			dataItem.setOriginReleaseIds(_ctx.stringValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].OriginReleaseIds"));
			dataItem.setProjectId(_ctx.stringValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].ProjectId"));
			dataItem.setReleaseId(_ctx.stringValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].ReleaseId"));
			dataItem.setSandboxRelease(_ctx.booleanValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].SandboxRelease"));
			dataItem.setStation(_ctx.stringValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].Station"));
			dataItem.setTenantId(_ctx.longValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].TenantId"));
			dataItem.setUtcCreate(_ctx.longValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.longValue("QueryLinkefabricFabricCiprojectbyappnameResponse.Data["+ i +"].UtcModified"));

			data.add(dataItem);
		}
		queryLinkefabricFabricCiprojectbyappnameResponse.setData(data);
	 
	 	return queryLinkefabricFabricCiprojectbyappnameResponse;
	}
}