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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseUnmarshaller {

	public static QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse unmarshall(QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse queryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.RequestId"));
		queryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.ResultCode"));
		queryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.ResultMessage"));
		queryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.Message"));
		queryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.ResponseStatusCode"));
		queryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppName(_ctx.stringValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.Data["+ i +"].AppName"));
			dataItem.setConfigKey(_ctx.stringValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.Data["+ i +"].ConfigKey"));
			dataItem.setDescription(_ctx.stringValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.Data["+ i +"].Description"));
			dataItem.setEnv(_ctx.stringValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.Data["+ i +"].Env"));
			dataItem.setExtraInfo(_ctx.stringValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.Data["+ i +"].ExtraInfo"));
			dataItem.setId(_ctx.longValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.Data["+ i +"].Id"));
			dataItem.setTenantId(_ctx.longValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.Data["+ i +"].TenantId"));
			dataItem.setType(_ctx.stringValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.Data["+ i +"].Type"));
			dataItem.setValue(_ctx.stringValue("QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		queryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse.setData(data);
	 
	 	return queryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse;
	}
}