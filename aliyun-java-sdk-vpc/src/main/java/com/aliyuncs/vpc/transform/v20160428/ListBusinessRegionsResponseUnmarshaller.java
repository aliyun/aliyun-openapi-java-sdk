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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListBusinessRegionsResponse;
import com.aliyuncs.vpc.model.v20160428.ListBusinessRegionsResponse.GeographicSubRegion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBusinessRegionsResponseUnmarshaller {

	public static ListBusinessRegionsResponse unmarshall(ListBusinessRegionsResponse listBusinessRegionsResponse, UnmarshallerContext _ctx) {
		
		listBusinessRegionsResponse.setRequestId(_ctx.stringValue("ListBusinessRegionsResponse.RequestId"));
		listBusinessRegionsResponse.setCount(_ctx.longValue("ListBusinessRegionsResponse.Count"));

		List<GeographicSubRegion> geographicSubRegions = new ArrayList<GeographicSubRegion>();
		for (int i = 0; i < _ctx.lengthValue("ListBusinessRegionsResponse.GeographicSubRegions.Length"); i++) {
			GeographicSubRegion geographicSubRegion = new GeographicSubRegion();
			geographicSubRegion.setRegionId(_ctx.stringValue("ListBusinessRegionsResponse.GeographicSubRegions["+ i +"].RegionId"));
			geographicSubRegion.setName(_ctx.stringValue("ListBusinessRegionsResponse.GeographicSubRegions["+ i +"].Name"));

			geographicSubRegions.add(geographicSubRegion);
		}
		listBusinessRegionsResponse.setGeographicSubRegions(geographicSubRegions);
	 
	 	return listBusinessRegionsResponse;
	}
}