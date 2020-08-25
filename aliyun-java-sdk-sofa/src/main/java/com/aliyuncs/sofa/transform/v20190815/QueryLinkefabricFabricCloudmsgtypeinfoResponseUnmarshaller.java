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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCloudmsgtypeinfoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCloudmsgtypeinfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricCloudmsgtypeinfoResponseUnmarshaller {

	public static QueryLinkefabricFabricCloudmsgtypeinfoResponse unmarshall(QueryLinkefabricFabricCloudmsgtypeinfoResponse queryLinkefabricFabricCloudmsgtypeinfoResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricCloudmsgtypeinfoResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.RequestId"));
		queryLinkefabricFabricCloudmsgtypeinfoResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.ResultCode"));
		queryLinkefabricFabricCloudmsgtypeinfoResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.ResultMessage"));
		queryLinkefabricFabricCloudmsgtypeinfoResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Message"));
		queryLinkefabricFabricCloudmsgtypeinfoResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.ResponseStatusCode"));
		queryLinkefabricFabricCloudmsgtypeinfoResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAction(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].Action"));
			dataItem.setApp(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].App"));
			dataItem.setAppName(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].AppName"));
			dataItem.setCreationTime(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].CreationTime"));
			dataItem.setDesc(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].Desc"));
			dataItem.setEventcode(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].Eventcode"));
			dataItem.setGmtCreate(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].GmtModified"));
			dataItem.setId(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].Id"));
			dataItem.setInstanceId(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].InstanceId"));
			dataItem.setTopic(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].Topic"));
			dataItem.setUpdateTime(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].UpdateTime"));
			dataItem.setWorkspace(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].Workspace"));
			dataItem.setWorkspaceGroup(_ctx.stringValue("QueryLinkefabricFabricCloudmsgtypeinfoResponse.Data["+ i +"].WorkspaceGroup"));

			data.add(dataItem);
		}
		queryLinkefabricFabricCloudmsgtypeinfoResponse.setData(data);
	 
	 	return queryLinkefabricFabricCloudmsgtypeinfoResponse;
	}
}