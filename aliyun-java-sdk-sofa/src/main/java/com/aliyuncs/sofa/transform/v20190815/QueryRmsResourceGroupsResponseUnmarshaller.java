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

import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupsResponse.Response.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceGroupsResponse.Response.DataItem.LablesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsResourceGroupsResponseUnmarshaller {

	public static QueryRmsResourceGroupsResponse unmarshall(QueryRmsResourceGroupsResponse queryRmsResourceGroupsResponse, UnmarshallerContext _ctx) {
		
		queryRmsResourceGroupsResponse.setRequestId(_ctx.stringValue("QueryRmsResourceGroupsResponse.RequestId"));
		queryRmsResourceGroupsResponse.setResultCode(_ctx.stringValue("QueryRmsResourceGroupsResponse.ResultCode"));
		queryRmsResourceGroupsResponse.setResultMessage(_ctx.stringValue("QueryRmsResourceGroupsResponse.ResultMessage"));

		Response response = new Response();
		response.setCurrentPage(_ctx.longValue("QueryRmsResourceGroupsResponse.Response.CurrentPage"));
		response.setPageSize(_ctx.longValue("QueryRmsResourceGroupsResponse.Response.PageSize"));
		response.setTotalSize(_ctx.longValue("QueryRmsResourceGroupsResponse.Response.TotalSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsResourceGroupsResponse.Response.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setGroupName(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].GroupName"));
			dataItem.setGroupType(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].GroupType"));
			dataItem.setId(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].Id"));
			dataItem.setOriginType(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].OriginType"));
			dataItem.setResType(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].ResType"));
			dataItem.setTenantId(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].TenantId"));
			dataItem.setUtcCreated(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].UtcCreated"));
			dataItem.setUtcModified(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].UtcModified"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].WorkspaceId"));

			List<String> itemTypeAlerting = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].ItemTypeAlerting.Length"); j++) {
				itemTypeAlerting.add(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].ItemTypeAlerting["+ j +"]"));
			}
			dataItem.setItemTypeAlerting(itemTypeAlerting);

			List<String> itemTypeConfigured = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].ItemTypeConfigured.Length"); j++) {
				itemTypeConfigured.add(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].ItemTypeConfigured["+ j +"]"));
			}
			dataItem.setItemTypeConfigured(itemTypeConfigured);

			List<LablesItem> lables = new ArrayList<LablesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].Lables.Length"); j++) {
				LablesItem lablesItem = new LablesItem();
				lablesItem.setResId(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].Lables["+ j +"].ResId"));
				lablesItem.setResName(_ctx.stringValue("QueryRmsResourceGroupsResponse.Response.Data["+ i +"].Lables["+ j +"].ResName"));

				lables.add(lablesItem);
			}
			dataItem.setLables(lables);

			data.add(dataItem);
		}
		response.setData(data);
		queryRmsResourceGroupsResponse.setResponse(response);
	 
	 	return queryRmsResourceGroupsResponse;
	}
}