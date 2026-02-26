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

import com.aliyuncs.eiam.model.v20211201.ListEiamRegionsResponse;
import com.aliyuncs.eiam.model.v20211201.ListEiamRegionsResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEiamRegionsResponseUnmarshaller {

	public static ListEiamRegionsResponse unmarshall(ListEiamRegionsResponse listEiamRegionsResponse, UnmarshallerContext _ctx) {
		
		listEiamRegionsResponse.setRequestId(_ctx.stringValue("ListEiamRegionsResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("ListEiamRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setRegionId(_ctx.stringValue("ListEiamRegionsResponse.Regions["+ i +"].RegionId"));
			region.setLocalName(_ctx.stringValue("ListEiamRegionsResponse.Regions["+ i +"].LocalName"));

			regions.add(region);
		}
		listEiamRegionsResponse.setRegions(regions);
	 
	 	return listEiamRegionsResponse;
	}
}