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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListImageRegistryRegionResponse;
import com.aliyuncs.sas.model.v20181203.ListImageRegistryRegionResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImageRegistryRegionResponseUnmarshaller {

	public static ListImageRegistryRegionResponse unmarshall(ListImageRegistryRegionResponse listImageRegistryRegionResponse, UnmarshallerContext _ctx) {
		
		listImageRegistryRegionResponse.setRequestId(_ctx.stringValue("ListImageRegistryRegionResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("ListImageRegistryRegionResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setRegionName(_ctx.stringValue("ListImageRegistryRegionResponse.Regions["+ i +"].RegionName"));
			region.setRegionId(_ctx.stringValue("ListImageRegistryRegionResponse.Regions["+ i +"].RegionId"));

			regions.add(region);
		}
		listImageRegistryRegionResponse.setRegions(regions);
	 
	 	return listImageRegistryRegionResponse;
	}
}