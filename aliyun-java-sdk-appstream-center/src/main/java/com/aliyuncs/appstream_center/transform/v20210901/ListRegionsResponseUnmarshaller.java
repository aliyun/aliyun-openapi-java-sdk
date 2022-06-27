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

package com.aliyuncs.appstream_center.transform.v20210901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appstream_center.model.v20210901.ListRegionsResponse;
import com.aliyuncs.appstream_center.model.v20210901.ListRegionsResponse.RegionModelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRegionsResponseUnmarshaller {

	public static ListRegionsResponse unmarshall(ListRegionsResponse listRegionsResponse, UnmarshallerContext _ctx) {
		
		listRegionsResponse.setRequestId(_ctx.stringValue("ListRegionsResponse.RequestId"));

		List<RegionModelsItem> regionModels = new ArrayList<RegionModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRegionsResponse.RegionModels.Length"); i++) {
			RegionModelsItem regionModelsItem = new RegionModelsItem();
			regionModelsItem.setRegionId(_ctx.stringValue("ListRegionsResponse.RegionModels["+ i +"].regionId"));

			regionModels.add(regionModelsItem);
		}
		listRegionsResponse.setRegionModels(regionModels);
	 
	 	return listRegionsResponse;
	}
}