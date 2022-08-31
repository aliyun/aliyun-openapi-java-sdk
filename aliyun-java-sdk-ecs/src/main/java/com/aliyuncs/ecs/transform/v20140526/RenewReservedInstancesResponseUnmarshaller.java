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

import com.aliyuncs.ecs.model.v20140526.RenewReservedInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewReservedInstancesResponseUnmarshaller {

	public static RenewReservedInstancesResponse unmarshall(RenewReservedInstancesResponse renewReservedInstancesResponse, UnmarshallerContext _ctx) {
		
		renewReservedInstancesResponse.setRequestId(_ctx.stringValue("RenewReservedInstancesResponse.RequestId"));
		renewReservedInstancesResponse.setOrderId(_ctx.stringValue("RenewReservedInstancesResponse.OrderId"));

		List<String> reservedInstanceIdSets = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RenewReservedInstancesResponse.ReservedInstanceIdSets.Length"); i++) {
			reservedInstanceIdSets.add(_ctx.stringValue("RenewReservedInstancesResponse.ReservedInstanceIdSets["+ i +"]"));
		}
		renewReservedInstancesResponse.setReservedInstanceIdSets(reservedInstanceIdSets);
	 
	 	return renewReservedInstancesResponse;
	}
}