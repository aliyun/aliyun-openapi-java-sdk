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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.ModifyRCInstanceChargeTypeResponse;
import com.aliyuncs.rds.model.v20140815.ModifyRCInstanceChargeTypeResponse.FeeOfInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyRCInstanceChargeTypeResponseUnmarshaller {

	public static ModifyRCInstanceChargeTypeResponse unmarshall(ModifyRCInstanceChargeTypeResponse modifyRCInstanceChargeTypeResponse, UnmarshallerContext _ctx) {
		
		modifyRCInstanceChargeTypeResponse.setRequestId(_ctx.stringValue("ModifyRCInstanceChargeTypeResponse.RequestId"));
		modifyRCInstanceChargeTypeResponse.setChargeType(_ctx.stringValue("ModifyRCInstanceChargeTypeResponse.ChargeType"));
		modifyRCInstanceChargeTypeResponse.setOrderId(_ctx.stringValue("ModifyRCInstanceChargeTypeResponse.OrderId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyRCInstanceChargeTypeResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("ModifyRCInstanceChargeTypeResponse.InstanceIds["+ i +"]"));
		}
		modifyRCInstanceChargeTypeResponse.setInstanceIds(instanceIds);

		List<String> expiredTime = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyRCInstanceChargeTypeResponse.ExpiredTime.Length"); i++) {
			expiredTime.add(_ctx.stringValue("ModifyRCInstanceChargeTypeResponse.ExpiredTime["+ i +"]"));
		}
		modifyRCInstanceChargeTypeResponse.setExpiredTime(expiredTime);

		List<FeeOfInstance> feeOfInstances = new ArrayList<FeeOfInstance>();
		for (int i = 0; i < _ctx.lengthValue("ModifyRCInstanceChargeTypeResponse.FeeOfInstances.Length"); i++) {
			FeeOfInstance feeOfInstance = new FeeOfInstance();
			feeOfInstance.setCurrency(_ctx.stringValue("ModifyRCInstanceChargeTypeResponse.FeeOfInstances["+ i +"].Currency"));
			feeOfInstance.setFee(_ctx.stringValue("ModifyRCInstanceChargeTypeResponse.FeeOfInstances["+ i +"].Fee"));
			feeOfInstance.setInstanceId(_ctx.stringValue("ModifyRCInstanceChargeTypeResponse.FeeOfInstances["+ i +"].InstanceId"));

			feeOfInstances.add(feeOfInstance);
		}
		modifyRCInstanceChargeTypeResponse.setFeeOfInstances(feeOfInstances);
	 
	 	return modifyRCInstanceChargeTypeResponse;
	}
}