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

import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxesResponse.CloudBoxSet;
import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxesResponse.CloudBoxSet.CloudBoxCapacity;
import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxesResponse.CloudBoxSet.CloudBoxCapacity.EcsCapacitySet;
import com.aliyuncs.ecsops.model.v20160401.OpsListCloudBoxesResponse.CloudBoxSet.LifecycleAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListCloudBoxesResponseUnmarshaller {

	public static OpsListCloudBoxesResponse unmarshall(OpsListCloudBoxesResponse opsListCloudBoxesResponse, UnmarshallerContext _ctx) {
		
		opsListCloudBoxesResponse.setRequestId(_ctx.stringValue("OpsListCloudBoxesResponse.RequestId"));
		opsListCloudBoxesResponse.setTotalCount(_ctx.integerValue("OpsListCloudBoxesResponse.TotalCount"));
		opsListCloudBoxesResponse.setNextToken(_ctx.stringValue("OpsListCloudBoxesResponse.NextToken"));

		List<CloudBoxSet> cloudBoxSets = new ArrayList<CloudBoxSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsListCloudBoxesResponse.CloudBoxSets.Length"); i++) {
			CloudBoxSet cloudBoxSet = new CloudBoxSet();
			cloudBoxSet.setStatus(_ctx.stringValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].Status"));
			cloudBoxSet.setCloudBoxId(_ctx.stringValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].CloudBoxId"));
			cloudBoxSet.setDescription(_ctx.stringValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].Description"));
			cloudBoxSet.setZoneId(_ctx.stringValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].ZoneId"));
			cloudBoxSet.setCloudBoxSiteId(_ctx.stringValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].CloudBoxSiteId"));
			cloudBoxSet.setCloudBoxName(_ctx.stringValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].CloudBoxName"));

			List<String> businessStatus = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].BusinessStatus.Length"); j++) {
				businessStatus.add(_ctx.stringValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].BusinessStatus["+ j +"]"));
			}
			cloudBoxSet.setBusinessStatus(businessStatus);

			CloudBoxCapacity cloudBoxCapacity = new CloudBoxCapacity();
			cloudBoxCapacity.setBlockStorageCapacity(_ctx.floatValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].CloudBoxCapacity.BlockStorageCapacity"));

			List<EcsCapacitySet> ecsCapacitySets = new ArrayList<EcsCapacitySet>();
			for (int j = 0; j < _ctx.lengthValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].CloudBoxCapacity.EcsCapacitySets.Length"); j++) {
				EcsCapacitySet ecsCapacitySet = new EcsCapacitySet();
				ecsCapacitySet.setInstanceTypeCount(_ctx.integerValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].CloudBoxCapacity.EcsCapacitySets["+ j +"].InstanceTypeCount"));
				ecsCapacitySet.setInstanceTypeName(_ctx.stringValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].CloudBoxCapacity.EcsCapacitySets["+ j +"].InstanceTypeName"));
				ecsCapacitySet.setInstanceTypeFamily(_ctx.stringValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].CloudBoxCapacity.EcsCapacitySets["+ j +"].InstanceTypeFamily"));

				ecsCapacitySets.add(ecsCapacitySet);
			}
			cloudBoxCapacity.setEcsCapacitySets(ecsCapacitySets);
			cloudBoxSet.setCloudBoxCapacity(cloudBoxCapacity);

			LifecycleAttribute lifecycleAttribute = new LifecycleAttribute();
			lifecycleAttribute.setExpiredTime(_ctx.stringValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].LifecycleAttribute.ExpiredTime"));
			lifecycleAttribute.setStartServiceTime(_ctx.stringValue("OpsListCloudBoxesResponse.CloudBoxSets["+ i +"].LifecycleAttribute.StartServiceTime"));
			cloudBoxSet.setLifecycleAttribute(lifecycleAttribute);

			cloudBoxSets.add(cloudBoxSet);
		}
		opsListCloudBoxesResponse.setCloudBoxSets(cloudBoxSets);
	 
	 	return opsListCloudBoxesResponse;
	}
}