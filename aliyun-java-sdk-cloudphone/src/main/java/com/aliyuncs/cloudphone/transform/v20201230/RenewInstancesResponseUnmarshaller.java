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

package com.aliyuncs.cloudphone.transform.v20201230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphone.model.v20201230.RenewInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewInstancesResponseUnmarshaller {

	public static RenewInstancesResponse unmarshall(RenewInstancesResponse renewInstancesResponse, UnmarshallerContext _ctx) {
		
		renewInstancesResponse.setRequestId(_ctx.stringValue("RenewInstancesResponse.RequestId"));
		renewInstancesResponse.setOrderId(_ctx.stringValue("RenewInstancesResponse.OrderId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RenewInstancesResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("RenewInstancesResponse.InstanceIds["+ i +"]"));
		}
		renewInstancesResponse.setInstanceIds(instanceIds);
	 
	 	return renewInstancesResponse;
	}
}