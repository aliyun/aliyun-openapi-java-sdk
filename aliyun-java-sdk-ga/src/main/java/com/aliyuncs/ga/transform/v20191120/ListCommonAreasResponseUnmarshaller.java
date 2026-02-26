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

import com.aliyuncs.ga.model.v20191120.ListCommonAreasResponse;
import com.aliyuncs.ga.model.v20191120.ListCommonAreasResponse.AreasItem;
import com.aliyuncs.ga.model.v20191120.ListCommonAreasResponse.AreasItem.RegionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCommonAreasResponseUnmarshaller {

	public static ListCommonAreasResponse unmarshall(ListCommonAreasResponse listCommonAreasResponse, UnmarshallerContext _ctx) {
		
		listCommonAreasResponse.setRequestId(_ctx.stringValue("ListCommonAreasResponse.RequestId"));

		List<AreasItem> areas = new ArrayList<AreasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCommonAreasResponse.Areas.Length"); i++) {
			AreasItem areasItem = new AreasItem();
			areasItem.setLocalName(_ctx.stringValue("ListCommonAreasResponse.Areas["+ i +"].LocalName"));
			areasItem.setAreaId(_ctx.stringValue("ListCommonAreasResponse.Areas["+ i +"].AreaId"));

			List<RegionListItem> regionList = new ArrayList<RegionListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCommonAreasResponse.Areas["+ i +"].RegionList.Length"); j++) {
				RegionListItem regionListItem = new RegionListItem();
				regionListItem.setLocalName(_ctx.stringValue("ListCommonAreasResponse.Areas["+ i +"].RegionList["+ j +"].LocalName"));
				regionListItem.setRegionId(_ctx.stringValue("ListCommonAreasResponse.Areas["+ i +"].RegionList["+ j +"].RegionId"));

				regionList.add(regionListItem);
			}
			areasItem.setRegionList(regionList);

			areas.add(areasItem);
		}
		listCommonAreasResponse.setAreas(areas);
	 
	 	return listCommonAreasResponse;
	}
}