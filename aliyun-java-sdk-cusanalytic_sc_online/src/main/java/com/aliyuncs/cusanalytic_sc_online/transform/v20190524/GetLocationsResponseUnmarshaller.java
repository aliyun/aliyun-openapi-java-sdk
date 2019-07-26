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

package com.aliyuncs.cusanalytic_sc_online.transform.v20190524;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetLocationsResponse;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetLocationsResponse.LocationItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLocationsResponseUnmarshaller {

	public static GetLocationsResponse unmarshall(GetLocationsResponse getLocationsResponse, UnmarshallerContext _ctx) {
		
		getLocationsResponse.setStoreId(_ctx.longValue("GetLocationsResponse.StoreId"));

		List<LocationItem> locationItems = new ArrayList<LocationItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLocationsResponse.LocationItems.Length"); i++) {
			LocationItem locationItem = new LocationItem();
			locationItem.setStatus(_ctx.integerValue("GetLocationsResponse.LocationItems["+ i +"].Status"));
			locationItem.setStoreId(_ctx.longValue("GetLocationsResponse.LocationItems["+ i +"].StoreId"));
			locationItem.setName(_ctx.stringValue("GetLocationsResponse.LocationItems["+ i +"].Name"));
			locationItem.setLink(_ctx.booleanValue("GetLocationsResponse.LocationItems["+ i +"].Link"));
			locationItem.setLocationType(_ctx.stringValue("GetLocationsResponse.LocationItems["+ i +"].LocationType"));
			locationItem.setLocationId(_ctx.longValue("GetLocationsResponse.LocationItems["+ i +"].LocationId"));
			locationItem.setParentLocationId(_ctx.longValue("GetLocationsResponse.LocationItems["+ i +"].ParentLocationId"));
			locationItem.setLayerType(_ctx.stringValue("GetLocationsResponse.LocationItems["+ i +"].LayerType"));

			locationItems.add(locationItem);
		}
		getLocationsResponse.setLocationItems(locationItems);
	 
	 	return getLocationsResponse;
	}
}