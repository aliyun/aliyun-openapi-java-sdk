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

import com.aliyuncs.ecs.model.v20140526.ModifyReservedInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyReservedInstancesResponseUnmarshaller {

	public static ModifyReservedInstancesResponse unmarshall(ModifyReservedInstancesResponse modifyReservedInstancesResponse, UnmarshallerContext _ctx) {
		
		modifyReservedInstancesResponse.setRequestId(_ctx.stringValue("ModifyReservedInstancesResponse.RequestId"));

		List<String> reservedInstanceIdSets = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyReservedInstancesResponse.ReservedInstanceIdSets.Length"); i++) {
			reservedInstanceIdSets.add(_ctx.stringValue("ModifyReservedInstancesResponse.ReservedInstanceIdSets["+ i +"]"));
		}
		modifyReservedInstancesResponse.setReservedInstanceIdSets(reservedInstanceIdSets);
	 
	 	return modifyReservedInstancesResponse;
	}
}