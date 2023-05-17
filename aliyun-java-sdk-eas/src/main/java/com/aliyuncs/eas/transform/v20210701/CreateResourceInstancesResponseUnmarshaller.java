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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.CreateResourceInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateResourceInstancesResponseUnmarshaller {

	public static CreateResourceInstancesResponse unmarshall(CreateResourceInstancesResponse createResourceInstancesResponse, UnmarshallerContext _ctx) {
		
		createResourceInstancesResponse.setRequestId(_ctx.stringValue("CreateResourceInstancesResponse.RequestId"));
		createResourceInstancesResponse.setMessage(_ctx.stringValue("CreateResourceInstancesResponse.Message"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateResourceInstancesResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("CreateResourceInstancesResponse.InstanceIds["+ i +"]"));
		}
		createResourceInstancesResponse.setInstanceIds(instanceIds);
	 
	 	return createResourceInstancesResponse;
	}
}