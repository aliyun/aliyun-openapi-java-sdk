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

package com.aliyuncs.smartag_inner.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag_inner.model.v20180313.InnerListAccessGatewayLocationsResponse;
import com.aliyuncs.smartag_inner.model.v20180313.InnerListAccessGatewayLocationsResponse.Location;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListAccessGatewayLocationsResponseUnmarshaller {

	public static InnerListAccessGatewayLocationsResponse unmarshall(InnerListAccessGatewayLocationsResponse innerListAccessGatewayLocationsResponse, UnmarshallerContext context) {
		
		innerListAccessGatewayLocationsResponse.setRequestId(context.stringValue("InnerListAccessGatewayLocationsResponse.RequestId"));
		innerListAccessGatewayLocationsResponse.setTotal(context.integerValue("InnerListAccessGatewayLocationsResponse.Total"));
		innerListAccessGatewayLocationsResponse.setPageNumber(context.integerValue("InnerListAccessGatewayLocationsResponse.PageNumber"));
		innerListAccessGatewayLocationsResponse.setPageSize(context.integerValue("InnerListAccessGatewayLocationsResponse.PageSize"));

		List<Location> locations = new ArrayList<Location>();
		for (int i = 0; i < context.lengthValue("InnerListAccessGatewayLocationsResponse.Locations.Length"); i++) {
			Location location = new Location();
			location.setLocationId(context.stringValue("InnerListAccessGatewayLocationsResponse.Locations["+ i +"].LocationId"));
			location.setLocationName(context.stringValue("InnerListAccessGatewayLocationsResponse.Locations["+ i +"].LocationName"));
			location.setLongitude(context.stringValue("InnerListAccessGatewayLocationsResponse.Locations["+ i +"].Longitude"));
			location.setLatitude(context.stringValue("InnerListAccessGatewayLocationsResponse.Locations["+ i +"].Latitude"));

			locations.add(location);
		}
		innerListAccessGatewayLocationsResponse.setLocations(locations);
	 
	 	return innerListAccessGatewayLocationsResponse;
	}
}