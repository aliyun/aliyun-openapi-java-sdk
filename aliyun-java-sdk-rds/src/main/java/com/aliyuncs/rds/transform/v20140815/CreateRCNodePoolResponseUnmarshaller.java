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

import com.aliyuncs.rds.model.v20140815.CreateRCNodePoolResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRCNodePoolResponseUnmarshaller {

	public static CreateRCNodePoolResponse unmarshall(CreateRCNodePoolResponse createRCNodePoolResponse, UnmarshallerContext _ctx) {
		
		createRCNodePoolResponse.setRequestId(_ctx.stringValue("CreateRCNodePoolResponse.RequestId"));
		createRCNodePoolResponse.setOrderId(_ctx.stringValue("CreateRCNodePoolResponse.OrderId"));
		createRCNodePoolResponse.setNodePoolId(_ctx.stringValue("CreateRCNodePoolResponse.NodePoolId"));

		List<String> instanceIdSets = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateRCNodePoolResponse.InstanceIdSets.Length"); i++) {
			instanceIdSets.add(_ctx.stringValue("CreateRCNodePoolResponse.InstanceIdSets["+ i +"]"));
		}
		createRCNodePoolResponse.setInstanceIdSets(instanceIdSets);
	 
	 	return createRCNodePoolResponse;
	}
}