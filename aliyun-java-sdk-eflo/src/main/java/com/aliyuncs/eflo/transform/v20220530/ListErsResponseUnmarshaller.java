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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.ListErsResponse;
import com.aliyuncs.eflo.model.v20220530.ListErsResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListErsResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListErsResponseUnmarshaller {

	public static ListErsResponse unmarshall(ListErsResponse listErsResponse, UnmarshallerContext _ctx) {
		
		listErsResponse.setRequestId(_ctx.stringValue("ListErsResponse.RequestId"));
		listErsResponse.setCode(_ctx.integerValue("ListErsResponse.Code"));
		listErsResponse.setMessage(_ctx.stringValue("ListErsResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListErsResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListErsResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreateTime(_ctx.stringValue("ListErsResponse.Content.Data["+ i +"].CreateTime"));
			dataItem.setGmtModified(_ctx.stringValue("ListErsResponse.Content.Data["+ i +"].GmtModified"));
			dataItem.setMessage(_ctx.stringValue("ListErsResponse.Content.Data["+ i +"].Message"));
			dataItem.setErId(_ctx.stringValue("ListErsResponse.Content.Data["+ i +"].ErId"));
			dataItem.setRegionId(_ctx.stringValue("ListErsResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setTenantId(_ctx.stringValue("ListErsResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setStatus(_ctx.stringValue("ListErsResponse.Content.Data["+ i +"].Status"));
			dataItem.setErName(_ctx.stringValue("ListErsResponse.Content.Data["+ i +"].ErName"));
			dataItem.setMasterZoneId(_ctx.stringValue("ListErsResponse.Content.Data["+ i +"].MasterZoneId"));
			dataItem.setDescription(_ctx.stringValue("ListErsResponse.Content.Data["+ i +"].Description"));
			dataItem.setConnections(_ctx.longValue("ListErsResponse.Content.Data["+ i +"].Connections"));
			dataItem.setRouteMaps(_ctx.longValue("ListErsResponse.Content.Data["+ i +"].RouteMaps"));
			dataItem.setResourceGroupId(_ctx.stringValue("ListErsResponse.Content.Data["+ i +"].ResourceGroupId"));

			data.add(dataItem);
		}
		content.setData(data);
		listErsResponse.setContent(content);
	 
	 	return listErsResponse;
	}
}