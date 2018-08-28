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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.AddNodesResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddNodesResponseUnmarshaller {

	public static AddNodesResponse unmarshall(AddNodesResponse addNodesResponse, UnmarshallerContext context) {
		
		addNodesResponse.setRequestId(context.stringValue("AddNodesResponse.RequestId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("AddNodesResponse.InstanceIds.Length"); i++) {
			instanceIds.add(context.stringValue("AddNodesResponse.InstanceIds["+ i +"]"));
		}
		addNodesResponse.setInstanceIds(instanceIds);
	 
	 	return addNodesResponse;
	}
}