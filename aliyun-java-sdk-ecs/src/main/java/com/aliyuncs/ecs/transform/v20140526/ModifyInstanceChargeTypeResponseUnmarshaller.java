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

import com.aliyuncs.ecs.model.v20140526.ModifyInstanceChargeTypeResponse;
import com.aliyuncs.ecs.model.v20140526.ModifyInstanceChargeTypeResponse.FeeOfInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyInstanceChargeTypeResponseUnmarshaller {

	public static ModifyInstanceChargeTypeResponse unmarshall(ModifyInstanceChargeTypeResponse modifyInstanceChargeTypeResponse, UnmarshallerContext _ctx) {
		
		modifyInstanceChargeTypeResponse.setRequestId(_ctx.stringValue("ModifyInstanceChargeTypeResponse.RequestId"));
		modifyInstanceChargeTypeResponse.setOrderId(_ctx.stringValue("ModifyInstanceChargeTypeResponse.OrderId"));

		List<FeeOfInstance> feeOfInstances = new ArrayList<FeeOfInstance>();
		for (int i = 0; i < _ctx.lengthValue("ModifyInstanceChargeTypeResponse.FeeOfInstances.Length"); i++) {
			FeeOfInstance feeOfInstance = new FeeOfInstance();
			feeOfInstance.setInstanceId(_ctx.stringValue("ModifyInstanceChargeTypeResponse.FeeOfInstances["+ i +"].InstanceId"));
			feeOfInstance.setFee(_ctx.stringValue("ModifyInstanceChargeTypeResponse.FeeOfInstances["+ i +"].Fee"));
			feeOfInstance.setCurrency(_ctx.stringValue("ModifyInstanceChargeTypeResponse.FeeOfInstances["+ i +"].Currency"));

			feeOfInstances.add(feeOfInstance);
		}
		modifyInstanceChargeTypeResponse.setFeeOfInstances(feeOfInstances);
	 
	 	return modifyInstanceChargeTypeResponse;
	}
}