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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.CreateAINodesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAINodesResponseUnmarshaller {

	public static CreateAINodesResponse unmarshall(CreateAINodesResponse createAINodesResponse, UnmarshallerContext _ctx) {
		
		createAINodesResponse.setRequestId(_ctx.stringValue("CreateAINodesResponse.RequestId"));
		createAINodesResponse.setDBClusterId(_ctx.stringValue("CreateAINodesResponse.DBClusterId"));
		createAINodesResponse.setOrderId(_ctx.stringValue("CreateAINodesResponse.OrderId"));

		List<String> dBNodeIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAINodesResponse.DBNodeIds.Length"); i++) {
			dBNodeIds.add(_ctx.stringValue("CreateAINodesResponse.DBNodeIds["+ i +"]"));
		}
		createAINodesResponse.setDBNodeIds(dBNodeIds);
	 
	 	return createAINodesResponse;
	}
}