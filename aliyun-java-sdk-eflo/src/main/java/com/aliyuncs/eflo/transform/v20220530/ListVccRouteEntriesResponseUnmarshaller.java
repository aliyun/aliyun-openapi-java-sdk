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

import com.aliyuncs.eflo.model.v20220530.ListVccRouteEntriesResponse;
import com.aliyuncs.eflo.model.v20220530.ListVccRouteEntriesResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListVccRouteEntriesResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVccRouteEntriesResponseUnmarshaller {

	public static ListVccRouteEntriesResponse unmarshall(ListVccRouteEntriesResponse listVccRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		listVccRouteEntriesResponse.setRequestId(_ctx.stringValue("ListVccRouteEntriesResponse.RequestId"));
		listVccRouteEntriesResponse.setCode(_ctx.integerValue("ListVccRouteEntriesResponse.Code"));
		listVccRouteEntriesResponse.setMessage(_ctx.stringValue("ListVccRouteEntriesResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListVccRouteEntriesResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVccRouteEntriesResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setVccId(_ctx.stringValue("ListVccRouteEntriesResponse.Content.Data["+ i +"].VccId"));
			dataItem.setTenantId(_ctx.stringValue("ListVccRouteEntriesResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setResourceTenantId(_ctx.stringValue("ListVccRouteEntriesResponse.Content.Data["+ i +"].ResourceTenantId"));
			dataItem.setRegionId(_ctx.stringValue("ListVccRouteEntriesResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setVccRouteEntryId(_ctx.stringValue("ListVccRouteEntriesResponse.Content.Data["+ i +"].VccRouteEntryId"));
			dataItem.setDestinationCidrBlock(_ctx.stringValue("ListVccRouteEntriesResponse.Content.Data["+ i +"].DestinationCidrBlock"));
			dataItem.setNextHopType(_ctx.stringValue("ListVccRouteEntriesResponse.Content.Data["+ i +"].NextHopType"));
			dataItem.setNextHopId(_ctx.stringValue("ListVccRouteEntriesResponse.Content.Data["+ i +"].NextHopId"));
			dataItem.setRouteType(_ctx.stringValue("ListVccRouteEntriesResponse.Content.Data["+ i +"].RouteType"));
			dataItem.setStatus(_ctx.stringValue("ListVccRouteEntriesResponse.Content.Data["+ i +"].Status"));
			dataItem.setGmtModified(_ctx.stringValue("ListVccRouteEntriesResponse.Content.Data["+ i +"].GmtModified"));
			dataItem.setMessage(_ctx.stringValue("ListVccRouteEntriesResponse.Content.Data["+ i +"].Message"));

			data.add(dataItem);
		}
		content.setData(data);
		listVccRouteEntriesResponse.setContent(content);
	 
	 	return listVccRouteEntriesResponse;
	}
}