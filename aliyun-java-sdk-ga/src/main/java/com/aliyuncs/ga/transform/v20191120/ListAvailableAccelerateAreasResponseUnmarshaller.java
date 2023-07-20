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

import com.aliyuncs.ga.model.v20191120.ListAvailableAccelerateAreasResponse;
import com.aliyuncs.ga.model.v20191120.ListAvailableAccelerateAreasResponse.AreasItem;
import com.aliyuncs.ga.model.v20191120.ListAvailableAccelerateAreasResponse.AreasItem.RegionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAvailableAccelerateAreasResponseUnmarshaller {

	public static ListAvailableAccelerateAreasResponse unmarshall(ListAvailableAccelerateAreasResponse listAvailableAccelerateAreasResponse, UnmarshallerContext _ctx) {
		
		listAvailableAccelerateAreasResponse.setRequestId(_ctx.stringValue("ListAvailableAccelerateAreasResponse.RequestId"));

		List<AreasItem> areas = new ArrayList<AreasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAvailableAccelerateAreasResponse.Areas.Length"); i++) {
			AreasItem areasItem = new AreasItem();
			areasItem.setLocalName(_ctx.stringValue("ListAvailableAccelerateAreasResponse.Areas["+ i +"].LocalName"));
			areasItem.setAreaId(_ctx.stringValue("ListAvailableAccelerateAreasResponse.Areas["+ i +"].AreaId"));

			List<RegionListItem> regionList = new ArrayList<RegionListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAvailableAccelerateAreasResponse.Areas["+ i +"].RegionList.Length"); j++) {
				RegionListItem regionListItem = new RegionListItem();
				regionListItem.setLocalName(_ctx.stringValue("ListAvailableAccelerateAreasResponse.Areas["+ i +"].RegionList["+ j +"].LocalName"));
				regionListItem.setRegionId(_ctx.stringValue("ListAvailableAccelerateAreasResponse.Areas["+ i +"].RegionList["+ j +"].RegionId"));
				regionListItem.setChinaMainland(_ctx.booleanValue("ListAvailableAccelerateAreasResponse.Areas["+ i +"].RegionList["+ j +"].ChinaMainland"));
				regionListItem.setSupportIpv6(_ctx.booleanValue("ListAvailableAccelerateAreasResponse.Areas["+ i +"].RegionList["+ j +"].SupportIpv6"));

				List<String> ispTypeList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListAvailableAccelerateAreasResponse.Areas["+ i +"].RegionList["+ j +"].IspTypeList.Length"); k++) {
					ispTypeList.add(_ctx.stringValue("ListAvailableAccelerateAreasResponse.Areas["+ i +"].RegionList["+ j +"].IspTypeList["+ k +"]"));
				}
				regionListItem.setIspTypeList(ispTypeList);

				regionList.add(regionListItem);
			}
			areasItem.setRegionList(regionList);

			areas.add(areasItem);
		}
		listAvailableAccelerateAreasResponse.setAreas(areas);
	 
	 	return listAvailableAccelerateAreasResponse;
	}
}