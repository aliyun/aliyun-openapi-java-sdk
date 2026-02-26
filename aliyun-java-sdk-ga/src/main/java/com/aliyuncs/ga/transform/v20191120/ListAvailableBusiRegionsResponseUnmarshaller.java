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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListAvailableBusiRegionsResponse;
import com.aliyuncs.ga.model.v20191120.ListAvailableBusiRegionsResponse.RegionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAvailableBusiRegionsResponseUnmarshaller {

	public static ListAvailableBusiRegionsResponse unmarshall(ListAvailableBusiRegionsResponse listAvailableBusiRegionsResponse, UnmarshallerContext _ctx) {
		
		listAvailableBusiRegionsResponse.setRequestId(_ctx.stringValue("ListAvailableBusiRegionsResponse.RequestId"));

		List<RegionsItem> regions = new ArrayList<RegionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAvailableBusiRegionsResponse.Regions.Length"); i++) {
			RegionsItem regionsItem = new RegionsItem();
			regionsItem.setLocalName(_ctx.stringValue("ListAvailableBusiRegionsResponse.Regions["+ i +"].LocalName"));
			regionsItem.setRegionId(_ctx.stringValue("ListAvailableBusiRegionsResponse.Regions["+ i +"].RegionId"));
			regionsItem.setPop(_ctx.booleanValue("ListAvailableBusiRegionsResponse.Regions["+ i +"].Pop"));
			regionsItem.setChinaMainland(_ctx.booleanValue("ListAvailableBusiRegionsResponse.Regions["+ i +"].ChinaMainland"));

			regions.add(regionsItem);
		}
		listAvailableBusiRegionsResponse.setRegions(regions);
	 
	 	return listAvailableBusiRegionsResponse;
	}
}