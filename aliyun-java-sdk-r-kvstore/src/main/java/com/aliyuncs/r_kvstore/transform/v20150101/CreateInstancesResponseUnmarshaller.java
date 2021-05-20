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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.CreateInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstancesResponseUnmarshaller {

	public static CreateInstancesResponse unmarshall(CreateInstancesResponse createInstancesResponse, UnmarshallerContext _ctx) {
		
		createInstancesResponse.setRequestId(_ctx.stringValue("CreateInstancesResponse.RequestId"));
		createInstancesResponse.setOrderId(_ctx.stringValue("CreateInstancesResponse.OrderId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateInstancesResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("CreateInstancesResponse.InstanceIds["+ i +"]"));
		}
		createInstancesResponse.setInstanceIds(instanceIds);
	 
	 	return createInstancesResponse;
	}
}