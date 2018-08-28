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

import com.aliyuncs.ehpc.model.v20180412.AddContainerAppResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddContainerAppResponseUnmarshaller {

	public static AddContainerAppResponse unmarshall(AddContainerAppResponse addContainerAppResponse, UnmarshallerContext context) {
		
		addContainerAppResponse.setRequestId(context.stringValue("AddContainerAppResponse.RequestId"));

		List<String> containerId = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("AddContainerAppResponse.ContainerId.Length"); i++) {
			containerId.add(context.stringValue("AddContainerAppResponse.ContainerId["+ i +"]"));
		}
		addContainerAppResponse.setContainerId(containerId);
	 
	 	return addContainerAppResponse;
	}
}