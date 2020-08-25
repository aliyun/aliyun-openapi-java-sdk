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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCloudmsgbinginginfoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCloudmsgbinginginfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricCloudmsgbinginginfoResponseUnmarshaller {

	public static QueryLinkefabricFabricCloudmsgbinginginfoResponse unmarshall(QueryLinkefabricFabricCloudmsgbinginginfoResponse queryLinkefabricFabricCloudmsgbinginginfoResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricCloudmsgbinginginfoResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.RequestId"));
		queryLinkefabricFabricCloudmsgbinginginfoResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.ResultCode"));
		queryLinkefabricFabricCloudmsgbinginginfoResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.ResultMessage"));
		queryLinkefabricFabricCloudmsgbinginginfoResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Message"));
		queryLinkefabricFabricCloudmsgbinginginfoResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.ResponseStatusCode"));
		queryLinkefabricFabricCloudmsgbinginginfoResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAction(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].Action"));
			dataItem.setApp(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].App"));
			dataItem.setAppName(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].AppName"));
			dataItem.setCreationTime(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].CreationTime"));
			dataItem.setEventcode(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].Eventcode"));
			dataItem.setExchangeType(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].ExchangeType"));
			dataItem.setExpression(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].Expression"));
			dataItem.setGmtCreate(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].GmtModified"));
			dataItem.setGroup(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].Group"));
			dataItem.setId(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].Id"));
			dataItem.setInstanceId(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].InstanceId"));
			dataItem.setPersistence(_ctx.booleanValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].Persistence"));
			dataItem.setTopic(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].Topic"));
			dataItem.setUpdateTime(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].UpdateTime"));
			dataItem.setWorkspace(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].Workspace"));
			dataItem.setWorkspaceGroup(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].WorkspaceGroup"));
			dataItem.setZone(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].Zone"));
			dataItem.setZoneMode(_ctx.stringValue("QueryLinkefabricFabricCloudmsgbinginginfoResponse.Data["+ i +"].ZoneMode"));

			data.add(dataItem);
		}
		queryLinkefabricFabricCloudmsgbinginginfoResponse.setData(data);
	 
	 	return queryLinkefabricFabricCloudmsgbinginginfoResponse;
	}
}