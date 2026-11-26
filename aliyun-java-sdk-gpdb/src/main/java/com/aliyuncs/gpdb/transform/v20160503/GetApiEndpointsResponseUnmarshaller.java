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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.GetApiEndpointsResponse;
import com.aliyuncs.gpdb.model.v20160503.GetApiEndpointsResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApiEndpointsResponseUnmarshaller {

	public static GetApiEndpointsResponse unmarshall(GetApiEndpointsResponse getApiEndpointsResponse, UnmarshallerContext _ctx) {
		
		getApiEndpointsResponse.setRequestId(_ctx.stringValue("GetApiEndpointsResponse.RequestId"));
		getApiEndpointsResponse.setTotalRecordCount(_ctx.integerValue("GetApiEndpointsResponse.TotalRecordCount"));
		getApiEndpointsResponse.setNextToken(_ctx.stringValue("GetApiEndpointsResponse.NextToken"));
		getApiEndpointsResponse.setMaxResults(_ctx.integerValue("GetApiEndpointsResponse.MaxResults"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetApiEndpointsResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setEndpoint(_ctx.stringValue("GetApiEndpointsResponse.Items["+ i +"].Endpoint"));
			itemsItem.setServiceType(_ctx.stringValue("GetApiEndpointsResponse.Items["+ i +"].ServiceType"));
			itemsItem.setRegionId(_ctx.stringValue("GetApiEndpointsResponse.Items["+ i +"].RegionId"));

			items.add(itemsItem);
		}
		getApiEndpointsResponse.setItems(items);
	 
	 	return getApiEndpointsResponse;
	}
}