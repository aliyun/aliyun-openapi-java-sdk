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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryFlavorInventoryStatusResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryFlavorInventoryStatusResponse.AZoneInventoryStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryFlavorInventoryStatusResponseUnmarshaller {

	public static OpsQueryFlavorInventoryStatusResponse unmarshall(OpsQueryFlavorInventoryStatusResponse opsQueryFlavorInventoryStatusResponse, UnmarshallerContext _ctx) {
		
		opsQueryFlavorInventoryStatusResponse.setRequestId(_ctx.stringValue("OpsQueryFlavorInventoryStatusResponse.RequestId"));

		List<AZoneInventoryStatus> availableZones = new ArrayList<AZoneInventoryStatus>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryFlavorInventoryStatusResponse.AvailableZones.Length"); i++) {
			AZoneInventoryStatus aZoneInventoryStatus = new AZoneInventoryStatus();
			aZoneInventoryStatus.setHouyiAvailableZoneNo(_ctx.stringValue("OpsQueryFlavorInventoryStatusResponse.AvailableZones["+ i +"].HouyiAvailableZoneNo"));
			aZoneInventoryStatus.setStatus(_ctx.stringValue("OpsQueryFlavorInventoryStatusResponse.AvailableZones["+ i +"].Status"));
			aZoneInventoryStatus.setMeet(_ctx.booleanValue("OpsQueryFlavorInventoryStatusResponse.AvailableZones["+ i +"].Meet"));

			availableZones.add(aZoneInventoryStatus);
		}
		opsQueryFlavorInventoryStatusResponse.setAvailableZones(availableZones);
	 
	 	return opsQueryFlavorInventoryStatusResponse;
	}
}