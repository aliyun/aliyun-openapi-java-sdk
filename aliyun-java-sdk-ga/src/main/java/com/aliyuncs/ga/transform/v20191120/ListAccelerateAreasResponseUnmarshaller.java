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

import com.aliyuncs.ga.model.v20191120.ListAccelerateAreasResponse;
import com.aliyuncs.ga.model.v20191120.ListAccelerateAreasResponse.AreasItem;
import com.aliyuncs.ga.model.v20191120.ListAccelerateAreasResponse.AreasItem.RegionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccelerateAreasResponseUnmarshaller {

	public static ListAccelerateAreasResponse unmarshall(ListAccelerateAreasResponse listAccelerateAreasResponse, UnmarshallerContext _ctx) {
		
		listAccelerateAreasResponse.setRequestId(_ctx.stringValue("ListAccelerateAreasResponse.RequestId"));

		List<AreasItem> areas = new ArrayList<AreasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAccelerateAreasResponse.Areas.Length"); i++) {
			AreasItem areasItem = new AreasItem();
			areasItem.setAreaId(_ctx.stringValue("ListAccelerateAreasResponse.Areas["+ i +"].AreaId"));
			areasItem.setLocalName(_ctx.stringValue("ListAccelerateAreasResponse.Areas["+ i +"].LocalName"));

			List<RegionListItem> regionList = new ArrayList<RegionListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAccelerateAreasResponse.Areas["+ i +"].RegionList.Length"); j++) {
				RegionListItem regionListItem = new RegionListItem();
				regionListItem.setRegionId(_ctx.stringValue("ListAccelerateAreasResponse.Areas["+ i +"].RegionList["+ j +"].RegionId"));
				regionListItem.setLocalName(_ctx.stringValue("ListAccelerateAreasResponse.Areas["+ i +"].RegionList["+ j +"].LocalName"));

				regionList.add(regionListItem);
			}
			areasItem.setRegionList(regionList);

			areas.add(areasItem);
		}
		listAccelerateAreasResponse.setAreas(areas);
	 
	 	return listAccelerateAreasResponse;
	}
}