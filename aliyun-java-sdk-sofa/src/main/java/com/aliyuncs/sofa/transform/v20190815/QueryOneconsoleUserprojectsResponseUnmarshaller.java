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

import com.aliyuncs.sofa.model.v20190815.QueryOneconsoleUserprojectsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryOneconsoleUserprojectsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOneconsoleUserprojectsResponseUnmarshaller {

	public static QueryOneconsoleUserprojectsResponse unmarshall(QueryOneconsoleUserprojectsResponse queryOneconsoleUserprojectsResponse, UnmarshallerContext _ctx) {
		
		queryOneconsoleUserprojectsResponse.setRequestId(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.RequestId"));
		queryOneconsoleUserprojectsResponse.setResultCode(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.ResultCode"));
		queryOneconsoleUserprojectsResponse.setResultMessage(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOneconsoleUserprojectsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBusinessOwnerId(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.Data["+ i +"].BusinessOwnerId"));
			dataItem.setDescription(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.Data["+ i +"].Description"));
			dataItem.setDisplayName(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.Data["+ i +"].DisplayName"));
			dataItem.setId(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.Data["+ i +"].Id"));
			dataItem.setMasterId(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.Data["+ i +"].MasterId"));
			dataItem.setName(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.Data["+ i +"].Name"));
			dataItem.setTenantId(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.Data["+ i +"].TenantId"));
			dataItem.setUniqueId(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.Data["+ i +"].UniqueId"));
			dataItem.setUtcCreate(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("QueryOneconsoleUserprojectsResponse.Data["+ i +"].UtcModified"));

			data.add(dataItem);
		}
		queryOneconsoleUserprojectsResponse.setData(data);
	 
	 	return queryOneconsoleUserprojectsResponse;
	}
}