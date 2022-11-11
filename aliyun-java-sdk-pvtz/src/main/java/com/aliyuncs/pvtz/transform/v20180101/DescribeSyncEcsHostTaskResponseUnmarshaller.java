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

package com.aliyuncs.pvtz.transform.v20180101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pvtz.model.v20180101.DescribeSyncEcsHostTaskResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeSyncEcsHostTaskResponse.EcsRegion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSyncEcsHostTaskResponseUnmarshaller {

	public static DescribeSyncEcsHostTaskResponse unmarshall(DescribeSyncEcsHostTaskResponse describeSyncEcsHostTaskResponse, UnmarshallerContext _ctx) {
		
		describeSyncEcsHostTaskResponse.setRequestId(_ctx.stringValue("DescribeSyncEcsHostTaskResponse.RequestId"));
		describeSyncEcsHostTaskResponse.setStatus(_ctx.stringValue("DescribeSyncEcsHostTaskResponse.Status"));
		describeSyncEcsHostTaskResponse.setZoneId(_ctx.stringValue("DescribeSyncEcsHostTaskResponse.ZoneId"));
		describeSyncEcsHostTaskResponse.setSuccess(_ctx.booleanValue("DescribeSyncEcsHostTaskResponse.Success"));

		List<String> regions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSyncEcsHostTaskResponse.Regions.Length"); i++) {
			regions.add(_ctx.stringValue("DescribeSyncEcsHostTaskResponse.Regions["+ i +"]"));
		}
		describeSyncEcsHostTaskResponse.setRegions(regions);

		List<EcsRegion> ecsRegions = new ArrayList<EcsRegion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSyncEcsHostTaskResponse.EcsRegions.Length"); i++) {
			EcsRegion ecsRegion = new EcsRegion();
			ecsRegion.setUserId(_ctx.longValue("DescribeSyncEcsHostTaskResponse.EcsRegions["+ i +"].UserId"));

			List<String> regionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSyncEcsHostTaskResponse.EcsRegions["+ i +"].RegionIds.Length"); j++) {
				regionIds.add(_ctx.stringValue("DescribeSyncEcsHostTaskResponse.EcsRegions["+ i +"].RegionIds["+ j +"]"));
			}
			ecsRegion.setRegionIds(regionIds);

			ecsRegions.add(ecsRegion);
		}
		describeSyncEcsHostTaskResponse.setEcsRegions(ecsRegions);
	 
	 	return describeSyncEcsHostTaskResponse;
	}
}