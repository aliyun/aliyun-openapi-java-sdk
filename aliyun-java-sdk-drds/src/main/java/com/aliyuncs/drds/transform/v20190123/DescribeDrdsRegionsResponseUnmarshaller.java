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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeDrdsRegionsResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsRegionsResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsRegionsResponseUnmarshaller {

	public static DescribeDrdsRegionsResponse unmarshall(DescribeDrdsRegionsResponse describeDrdsRegionsResponse, UnmarshallerContext _ctx) {
		
		describeDrdsRegionsResponse.setRequestId(_ctx.stringValue("DescribeDrdsRegionsResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsRegionsResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setRegionId(_ctx.stringValue("DescribeDrdsRegionsResponse.Regions["+ i +"].RegionId"));
			region.setRegionName(_ctx.stringValue("DescribeDrdsRegionsResponse.Regions["+ i +"].RegionName"));
			region.setRegionEndpoint(_ctx.stringValue("DescribeDrdsRegionsResponse.Regions["+ i +"].RegionEndpoint"));

			regions.add(region);
		}
		describeDrdsRegionsResponse.setRegions(regions);
	 
	 	return describeDrdsRegionsResponse;
	}
}