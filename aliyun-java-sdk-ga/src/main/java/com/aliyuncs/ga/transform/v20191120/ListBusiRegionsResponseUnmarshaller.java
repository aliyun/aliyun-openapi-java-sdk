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

import com.aliyuncs.ga.model.v20191120.ListBusiRegionsResponse;
import com.aliyuncs.ga.model.v20191120.ListBusiRegionsResponse.RegionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBusiRegionsResponseUnmarshaller {

	public static ListBusiRegionsResponse unmarshall(ListBusiRegionsResponse listBusiRegionsResponse, UnmarshallerContext _ctx) {
		
		listBusiRegionsResponse.setRequestId(_ctx.stringValue("ListBusiRegionsResponse.RequestId"));

		List<RegionsItem> regions = new ArrayList<RegionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBusiRegionsResponse.Regions.Length"); i++) {
			RegionsItem regionsItem = new RegionsItem();
			regionsItem.setRegionId(_ctx.stringValue("ListBusiRegionsResponse.Regions["+ i +"].RegionId"));
			regionsItem.setLocalName(_ctx.stringValue("ListBusiRegionsResponse.Regions["+ i +"].LocalName"));

			regions.add(regionsItem);
		}
		listBusiRegionsResponse.setRegions(regions);
	 
	 	return listBusiRegionsResponse;
	}
}