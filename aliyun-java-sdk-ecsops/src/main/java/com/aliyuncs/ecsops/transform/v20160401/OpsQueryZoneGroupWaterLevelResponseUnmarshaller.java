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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryZoneGroupWaterLevelResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryZoneGroupWaterLevelResponseUnmarshaller {

	public static OpsQueryZoneGroupWaterLevelResponse unmarshall(OpsQueryZoneGroupWaterLevelResponse opsQueryZoneGroupWaterLevelResponse, UnmarshallerContext _ctx) {
		
		opsQueryZoneGroupWaterLevelResponse.setRequestId(_ctx.stringValue("OpsQueryZoneGroupWaterLevelResponse.RequestId"));

		List<ZoneGroupWaterLevel> zoneGroupWaterLevels = new ArrayList<ZoneGroupWaterLevel>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels.Length"); i++) {
			ZoneGroupWaterLevel zoneGroupWaterLevel = new ZoneGroupWaterLevel();
			zoneGroupWaterLevel.setHighLevel(_ctx.longValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].HighLevel"));
			zoneGroupWaterLevel.setFlavor(_ctx.stringValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].Flavor"));
			zoneGroupWaterLevel.setGrayBizType(_ctx.stringValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].GrayBizType"));
			zoneGroupWaterLevel.setNetworkType(_ctx.integerValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].NetworkType"));
			zoneGroupWaterLevel.setClusterGroup(_ctx.stringValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].ClusterGroup"));
			zoneGroupWaterLevel.setBizType(_ctx.stringValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].BizType"));
			zoneGroupWaterLevel.setRegionId(_ctx.stringValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].RegionId"));
			zoneGroupWaterLevel.setIoOptimized(_ctx.integerValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].IoOptimized"));
			zoneGroupWaterLevel.setRiLevel(_ctx.longValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].RiLevel"));
			zoneGroupWaterLevel.setResourceType(_ctx.integerValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].ResourceType"));
			zoneGroupWaterLevel.setLowLevel(_ctx.longValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].LowLevel"));
			zoneGroupWaterLevel.setIzNo(_ctx.stringValue("OpsQueryZoneGroupWaterLevelResponse.ZoneGroupWaterLevels["+ i +"].IzNo"));

			zoneGroupWaterLevels.add(zoneGroupWaterLevel);
		}
		opsQueryZoneGroupWaterLevelResponse.setZoneGroupWaterLevels(zoneGroupWaterLevels);
	 
	 	return opsQueryZoneGroupWaterLevelResponse;
	}
}