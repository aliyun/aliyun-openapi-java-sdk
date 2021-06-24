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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFleetsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFleetsResponse.Fleet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeFleetsResponseUnmarshaller {

	public static OpsDescribeFleetsResponse unmarshall(OpsDescribeFleetsResponse opsDescribeFleetsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeFleetsResponse.setRequestId(_ctx.stringValue("OpsDescribeFleetsResponse.RequestId"));
		opsDescribeFleetsResponse.setTotalCount(_ctx.integerValue("OpsDescribeFleetsResponse.TotalCount"));
		opsDescribeFleetsResponse.setPageSize(_ctx.integerValue("OpsDescribeFleetsResponse.PageSize"));
		opsDescribeFleetsResponse.setPageNumber(_ctx.integerValue("OpsDescribeFleetsResponse.PageNumber"));

		List<Fleet> fleets = new ArrayList<Fleet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeFleetsResponse.Fleets.Length"); i++) {
			Fleet fleet = new Fleet();
			fleet.setStatus(_ctx.stringValue("OpsDescribeFleetsResponse.Fleets["+ i +"].Status"));
			fleet.setFleetId(_ctx.stringValue("OpsDescribeFleetsResponse.Fleets["+ i +"].FleetId"));
			fleet.setScalingId(_ctx.stringValue("OpsDescribeFleetsResponse.Fleets["+ i +"].ScalingId"));
			fleet.setResult(_ctx.stringValue("OpsDescribeFleetsResponse.Fleets["+ i +"].Result"));
			fleet.setAliUid(_ctx.longValue("OpsDescribeFleetsResponse.Fleets["+ i +"].AliUid"));
			fleet.setFleetName(_ctx.stringValue("OpsDescribeFleetsResponse.Fleets["+ i +"].FleetName"));
			fleet.setId(_ctx.longValue("OpsDescribeFleetsResponse.Fleets["+ i +"].Id"));

			fleets.add(fleet);
		}
		opsDescribeFleetsResponse.setFleets(fleets);
	 
	 	return opsDescribeFleetsResponse;
	}
}