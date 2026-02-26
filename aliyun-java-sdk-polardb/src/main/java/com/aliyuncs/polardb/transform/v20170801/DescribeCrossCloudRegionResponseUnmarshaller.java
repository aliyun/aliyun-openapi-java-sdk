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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeCrossCloudRegionResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeCrossCloudRegionResponse.CrossCloudRegionListItem;
import com.aliyuncs.polardb.model.v20170801.DescribeCrossCloudRegionResponse.CrossCloudRegionListItem.CrossCloudZoneListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCrossCloudRegionResponseUnmarshaller {

	public static DescribeCrossCloudRegionResponse unmarshall(DescribeCrossCloudRegionResponse describeCrossCloudRegionResponse, UnmarshallerContext _ctx) {
		
		describeCrossCloudRegionResponse.setRequestId(_ctx.stringValue("DescribeCrossCloudRegionResponse.RequestId"));

		List<CrossCloudRegionListItem> crossCloudRegionList = new ArrayList<CrossCloudRegionListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCrossCloudRegionResponse.CrossCloudRegionList.Length"); i++) {
			CrossCloudRegionListItem crossCloudRegionListItem = new CrossCloudRegionListItem();
			crossCloudRegionListItem.setProjectId(_ctx.stringValue("DescribeCrossCloudRegionResponse.CrossCloudRegionList["+ i +"].ProjectId"));
			crossCloudRegionListItem.setCrossCloudRegionId(_ctx.stringValue("DescribeCrossCloudRegionResponse.CrossCloudRegionList["+ i +"].CrossCloudRegionId"));
			crossCloudRegionListItem.setCrossCloudRegionName(_ctx.stringValue("DescribeCrossCloudRegionResponse.CrossCloudRegionList["+ i +"].CrossCloudRegionName"));

			List<CrossCloudZoneListItem> crossCloudZoneList = new ArrayList<CrossCloudZoneListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCrossCloudRegionResponse.CrossCloudRegionList["+ i +"].CrossCloudZoneList.Length"); j++) {
				CrossCloudZoneListItem crossCloudZoneListItem = new CrossCloudZoneListItem();
				crossCloudZoneListItem.setCrossCloudZoneId(_ctx.stringValue("DescribeCrossCloudRegionResponse.CrossCloudRegionList["+ i +"].CrossCloudZoneList["+ j +"].CrossCloudZoneId"));
				crossCloudZoneListItem.setCrossCloudZoneName(_ctx.stringValue("DescribeCrossCloudRegionResponse.CrossCloudRegionList["+ i +"].CrossCloudZoneList["+ j +"].CrossCloudZoneName"));

				crossCloudZoneList.add(crossCloudZoneListItem);
			}
			crossCloudRegionListItem.setCrossCloudZoneList(crossCloudZoneList);

			crossCloudRegionList.add(crossCloudRegionListItem);
		}
		describeCrossCloudRegionResponse.setCrossCloudRegionList(crossCloudRegionList);
	 
	 	return describeCrossCloudRegionResponse;
	}
}