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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListNetworkAccessEndpointAvailableRegionsResponse;
import com.aliyuncs.eiam.model.v20211201.ListNetworkAccessEndpointAvailableRegionsResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNetworkAccessEndpointAvailableRegionsResponseUnmarshaller {

	public static ListNetworkAccessEndpointAvailableRegionsResponse unmarshall(ListNetworkAccessEndpointAvailableRegionsResponse listNetworkAccessEndpointAvailableRegionsResponse, UnmarshallerContext _ctx) {
		
		listNetworkAccessEndpointAvailableRegionsResponse.setRequestId(_ctx.stringValue("ListNetworkAccessEndpointAvailableRegionsResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("ListNetworkAccessEndpointAvailableRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setRegionId(_ctx.stringValue("ListNetworkAccessEndpointAvailableRegionsResponse.Regions["+ i +"].RegionId"));
			region.setLocalName(_ctx.stringValue("ListNetworkAccessEndpointAvailableRegionsResponse.Regions["+ i +"].LocalName"));

			regions.add(region);
		}
		listNetworkAccessEndpointAvailableRegionsResponse.setRegions(regions);
	 
	 	return listNetworkAccessEndpointAvailableRegionsResponse;
	}
}