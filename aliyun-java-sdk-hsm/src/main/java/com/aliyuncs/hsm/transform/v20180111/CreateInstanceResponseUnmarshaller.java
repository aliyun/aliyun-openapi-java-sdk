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

package com.aliyuncs.hsm.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hsm.model.v20180111.CreateInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstanceResponseUnmarshaller {

	public static CreateInstanceResponse unmarshall(CreateInstanceResponse createInstanceResponse, UnmarshallerContext context) {
		
		createInstanceResponse.setRequestId(context.stringValue("CreateInstanceResponse.RequestId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateInstanceResponse.InstanceIds.Length"); i++) {
			instanceIds.add(context.stringValue("CreateInstanceResponse.InstanceIds["+ i +"]"));
		}
		createInstanceResponse.setInstanceIds(instanceIds);
	 
	 	return createInstanceResponse;
	}
}