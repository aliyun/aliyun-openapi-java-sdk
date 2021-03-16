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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsRemoveZoneGroupWaterLevelResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsRemoveZoneGroupWaterLevelResponseUnmarshaller {

	public static OpsRemoveZoneGroupWaterLevelResponse unmarshall(OpsRemoveZoneGroupWaterLevelResponse opsRemoveZoneGroupWaterLevelResponse, UnmarshallerContext _ctx) {
		
		opsRemoveZoneGroupWaterLevelResponse.setRequestId(_ctx.stringValue("OpsRemoveZoneGroupWaterLevelResponse.RequestId"));

		List<ZoneGroupWaterLevel> zoneGroupWaterLevels = new ArrayList<ZoneGroupWaterLevel>();
		for (int i = 0; i < _ctx.lengthValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels.Length"); i++) {
			ZoneGroupWaterLevel zoneGroupWaterLevel = new ZoneGroupWaterLevel();
			zoneGroupWaterLevel.setRegionId(_ctx.stringValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].RegionId"));
			zoneGroupWaterLevel.setIzNo(_ctx.stringValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].IzNo"));
			zoneGroupWaterLevel.setClusterGroup(_ctx.stringValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].ClusterGroup"));
			zoneGroupWaterLevel.setGrayBizType(_ctx.stringValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].GrayBizType"));
			zoneGroupWaterLevel.setFlavor(_ctx.stringValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].Flavor"));
			zoneGroupWaterLevel.setBizType(_ctx.stringValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].BizType"));
			zoneGroupWaterLevel.setNetworkType(_ctx.integerValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].NetworkType"));
			zoneGroupWaterLevel.setIoOptimized(_ctx.integerValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].IoOptimized"));
			zoneGroupWaterLevel.setResourceType(_ctx.integerValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].ResourceType"));
			zoneGroupWaterLevel.setLowLevel(_ctx.longValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].LowLevel"));
			zoneGroupWaterLevel.setHighLevel(_ctx.longValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].HighLevel"));
			zoneGroupWaterLevel.setRiLevel(_ctx.longValue("OpsRemoveZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].RiLevel"));

			zoneGroupWaterLevels.add(zoneGroupWaterLevel);
		}
		opsRemoveZoneGroupWaterLevelResponse.setZoneGroupWaterLevels(zoneGroupWaterLevels);
	 
	 	return opsRemoveZoneGroupWaterLevelResponse;
	}
}