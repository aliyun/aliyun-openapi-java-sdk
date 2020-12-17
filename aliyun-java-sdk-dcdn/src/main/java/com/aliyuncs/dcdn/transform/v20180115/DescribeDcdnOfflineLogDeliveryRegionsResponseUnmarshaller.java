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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnOfflineLogDeliveryRegionsResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnOfflineLogDeliveryRegionsResponse.Area;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnOfflineLogDeliveryRegionsResponse.Area.RegionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnOfflineLogDeliveryRegionsResponseUnmarshaller {

	public static DescribeDcdnOfflineLogDeliveryRegionsResponse unmarshall(DescribeDcdnOfflineLogDeliveryRegionsResponse describeDcdnOfflineLogDeliveryRegionsResponse, UnmarshallerContext _ctx) {
		
		describeDcdnOfflineLogDeliveryRegionsResponse.setRequestId(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryRegionsResponse.RequestId"));

		List<Area> areas = new ArrayList<Area>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnOfflineLogDeliveryRegionsResponse.Areas.Length"); i++) {
			Area area = new Area();
			area.setAreaId(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryRegionsResponse.Areas["+ i +"].AreaId"));
			area.setAreaName(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryRegionsResponse.Areas["+ i +"].AreaName"));

			List<RegionInfo> regionInfos = new ArrayList<RegionInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnOfflineLogDeliveryRegionsResponse.Areas["+ i +"].RegionInfos.Length"); j++) {
				RegionInfo regionInfo = new RegionInfo();
				regionInfo.setRegionId(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryRegionsResponse.Areas["+ i +"].RegionInfos["+ j +"].RegionId"));
				regionInfo.setRegionName(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryRegionsResponse.Areas["+ i +"].RegionInfos["+ j +"].RegionName"));
				regionInfo.setIsOverseas(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryRegionsResponse.Areas["+ i +"].RegionInfos["+ j +"].IsOverseas"));
				regionInfo.setOssEndpoint(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryRegionsResponse.Areas["+ i +"].RegionInfos["+ j +"].OssEndpoint"));

				regionInfos.add(regionInfo);
			}
			area.setRegionInfos(regionInfos);

			areas.add(area);
		}
		describeDcdnOfflineLogDeliveryRegionsResponse.setAreas(areas);
	 
	 	return describeDcdnOfflineLogDeliveryRegionsResponse;
	}
}