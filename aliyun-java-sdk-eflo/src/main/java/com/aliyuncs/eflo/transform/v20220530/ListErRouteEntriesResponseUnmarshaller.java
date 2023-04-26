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

import com.aliyuncs.eflo.model.v20220530.ListErRouteEntriesResponse;
import com.aliyuncs.eflo.model.v20220530.ListErRouteEntriesResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListErRouteEntriesResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListErRouteEntriesResponseUnmarshaller {

	public static ListErRouteEntriesResponse unmarshall(ListErRouteEntriesResponse listErRouteEntriesResponse, UnmarshallerContext _ctx) {
		
		listErRouteEntriesResponse.setRequestId(_ctx.stringValue("ListErRouteEntriesResponse.RequestId"));
		listErRouteEntriesResponse.setCode(_ctx.integerValue("ListErRouteEntriesResponse.Code"));
		listErRouteEntriesResponse.setMessage(_ctx.stringValue("ListErRouteEntriesResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListErRouteEntriesResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListErRouteEntriesResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setErId(_ctx.stringValue("ListErRouteEntriesResponse.Content.Data["+ i +"].ErId"));
			dataItem.setTenantId(_ctx.stringValue("ListErRouteEntriesResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setResourceTenantId(_ctx.stringValue("ListErRouteEntriesResponse.Content.Data["+ i +"].ResourceTenantId"));
			dataItem.setRegionId(_ctx.stringValue("ListErRouteEntriesResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setErRouteEntryId(_ctx.stringValue("ListErRouteEntriesResponse.Content.Data["+ i +"].ErRouteEntryId"));
			dataItem.setDestinationCidrBlock(_ctx.stringValue("ListErRouteEntriesResponse.Content.Data["+ i +"].DestinationCidrBlock"));
			dataItem.setNextHopType(_ctx.stringValue("ListErRouteEntriesResponse.Content.Data["+ i +"].NextHopType"));
			dataItem.setNextHopId(_ctx.stringValue("ListErRouteEntriesResponse.Content.Data["+ i +"].NextHopId"));
			dataItem.setRouteType(_ctx.stringValue("ListErRouteEntriesResponse.Content.Data["+ i +"].RouteType"));
			dataItem.setStatus(_ctx.stringValue("ListErRouteEntriesResponse.Content.Data["+ i +"].Status"));
			dataItem.setGmtModified(_ctx.stringValue("ListErRouteEntriesResponse.Content.Data["+ i +"].GmtModified"));

			data.add(dataItem);
		}
		content.setData(data);
		listErRouteEntriesResponse.setContent(content);
	 
	 	return listErRouteEntriesResponse;
	}
}