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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostsChargeTypeResponse;
import com.aliyuncs.ecs.model.v20140526.ModifyDedicatedHostsChargeTypeResponse.FeeOfInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDedicatedHostsChargeTypeResponseUnmarshaller {

	public static ModifyDedicatedHostsChargeTypeResponse unmarshall(ModifyDedicatedHostsChargeTypeResponse modifyDedicatedHostsChargeTypeResponse, UnmarshallerContext _ctx) {
		
		modifyDedicatedHostsChargeTypeResponse.setRequestId(_ctx.stringValue("ModifyDedicatedHostsChargeTypeResponse.RequestId"));
		modifyDedicatedHostsChargeTypeResponse.setOrderId(_ctx.stringValue("ModifyDedicatedHostsChargeTypeResponse.OrderId"));

		List<FeeOfInstance> feeOfInstances = new ArrayList<FeeOfInstance>();
		for (int i = 0; i < _ctx.lengthValue("ModifyDedicatedHostsChargeTypeResponse.FeeOfInstances.Length"); i++) {
			FeeOfInstance feeOfInstance = new FeeOfInstance();
			feeOfInstance.setInstanceId(_ctx.stringValue("ModifyDedicatedHostsChargeTypeResponse.FeeOfInstances["+ i +"].InstanceId"));
			feeOfInstance.setCurrency(_ctx.stringValue("ModifyDedicatedHostsChargeTypeResponse.FeeOfInstances["+ i +"].Currency"));
			feeOfInstance.setFee(_ctx.stringValue("ModifyDedicatedHostsChargeTypeResponse.FeeOfInstances["+ i +"].Fee"));

			feeOfInstances.add(feeOfInstance);
		}
		modifyDedicatedHostsChargeTypeResponse.setFeeOfInstances(feeOfInstances);
	 
	 	return modifyDedicatedHostsChargeTypeResponse;
	}
}