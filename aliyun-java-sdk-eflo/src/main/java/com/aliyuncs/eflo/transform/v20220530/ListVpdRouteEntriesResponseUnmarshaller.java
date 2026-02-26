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

import com.aliyuncs.eflo.model.v20220530.ListVpdRouteEntriesResponse;
import com.aliyuncs.eflo.model.v20220530.ListVpdRouteEntriesResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListVpdRouteEntriesResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpdRouteEntriesResponseUnmarshaller {

	public static ListVpdRouteEntriesResponse unmarshall(ListVpdRouteEntriesResponse listVpdRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		listVpdRouteEntriesResponse.setRequestId(_ctx.stringValue("ListVpdRouteEntriesResponse.RequestId"));
		listVpdRouteEntriesResponse.setCode(_ctx.integerValue("ListVpdRouteEntriesResponse.Code"));
		listVpdRouteEntriesResponse.setMessage(_ctx.stringValue("ListVpdRouteEntriesResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListVpdRouteEntriesResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVpdRouteEntriesResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setVpdId(_ctx.stringValue("ListVpdRouteEntriesResponse.Content.Data["+ i +"].VpdId"));
			dataItem.setTenantId(_ctx.stringValue("ListVpdRouteEntriesResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setResourceTenantId(_ctx.stringValue("ListVpdRouteEntriesResponse.Content.Data["+ i +"].ResourceTenantId"));
			dataItem.setRegionId(_ctx.stringValue("ListVpdRouteEntriesResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setVpdRouteEntryId(_ctx.stringValue("ListVpdRouteEntriesResponse.Content.Data["+ i +"].VpdRouteEntryId"));
			dataItem.setDestinationCidrBlock(_ctx.stringValue("ListVpdRouteEntriesResponse.Content.Data["+ i +"].DestinationCidrBlock"));
			dataItem.setNextHopType(_ctx.stringValue("ListVpdRouteEntriesResponse.Content.Data["+ i +"].NextHopType"));
			dataItem.setNextHopId(_ctx.stringValue("ListVpdRouteEntriesResponse.Content.Data["+ i +"].NextHopId"));
			dataItem.setRouteType(_ctx.stringValue("ListVpdRouteEntriesResponse.Content.Data["+ i +"].RouteType"));
			dataItem.setStatus(_ctx.stringValue("ListVpdRouteEntriesResponse.Content.Data["+ i +"].Status"));
			dataItem.setGmtModified(_ctx.stringValue("ListVpdRouteEntriesResponse.Content.Data["+ i +"].GmtModified"));
			dataItem.setResourceGroupId(_ctx.stringValue("ListVpdRouteEntriesResponse.Content.Data["+ i +"].ResourceGroupId"));

			data.add(dataItem);
		}
		content.setData(data);
		listVpdRouteEntriesResponse.setContent(content);
	 
	 	return listVpdRouteEntriesResponse;
	}
}