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

import com.aliyuncs.sofa.model.v20190815.QueryCASAppserviceResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCASAppserviceResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCASAppserviceResponseUnmarshaller {

	public static QueryCASAppserviceResponse unmarshall(QueryCASAppserviceResponse queryCASAppserviceResponse, UnmarshallerContext _ctx) {
		
		queryCASAppserviceResponse.setRequestId(_ctx.stringValue("QueryCASAppserviceResponse.RequestId"));
		queryCASAppserviceResponse.setResultCode(_ctx.stringValue("QueryCASAppserviceResponse.ResultCode"));
		queryCASAppserviceResponse.setResultMessage(_ctx.stringValue("QueryCASAppserviceResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCASAppserviceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppId(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].AppId"));
			dataItem.setAppName(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].AppName"));
			dataItem.setBuildpackFullVersion(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].BuildpackFullVersion"));
			dataItem.setBuildpackId(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].BuildpackId"));
			dataItem.setDescription(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].Description"));
			dataItem.setExtendProperties(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].ExtendProperties"));
			dataItem.setId(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].Id"));
			dataItem.setIsDefault(_ctx.booleanValue("QueryCASAppserviceResponse.Data["+ i +"].IsDefault"));
			dataItem.setIsService(_ctx.booleanValue("QueryCASAppserviceResponse.Data["+ i +"].IsService"));
			dataItem.setLastDeployStatus(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].LastDeployStatus"));
			dataItem.setLastDeployVersion(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].LastDeployVersion"));
			dataItem.setLastOpsOrderId(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].LastOpsOrderId"));
			dataItem.setName(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].Name"));
			dataItem.setOwnerId(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].OwnerId"));
			dataItem.setTechstackId(_ctx.longValue("QueryCASAppserviceResponse.Data["+ i +"].TechstackId"));
			dataItem.setTechstackIdentity(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].TechstackIdentity"));
			dataItem.setTechstackName(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].TechstackName"));
			dataItem.setUtcCreate(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].UtcModified"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].WorkspaceId"));

			List<String> cellIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCASAppserviceResponse.Data["+ i +"].CellIds.Length"); j++) {
				cellIds.add(_ctx.stringValue("QueryCASAppserviceResponse.Data["+ i +"].CellIds["+ j +"]"));
			}
			dataItem.setCellIds(cellIds);

			data.add(dataItem);
		}
		queryCASAppserviceResponse.setData(data);
	 
	 	return queryCASAppserviceResponse;
	}
}