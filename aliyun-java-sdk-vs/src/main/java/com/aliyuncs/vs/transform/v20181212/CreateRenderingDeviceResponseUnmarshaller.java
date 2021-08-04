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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.CreateRenderingDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRenderingDeviceResponseUnmarshaller {

	public static CreateRenderingDeviceResponse unmarshall(CreateRenderingDeviceResponse createRenderingDeviceResponse, UnmarshallerContext _ctx) {
		
		createRenderingDeviceResponse.setRequestId(_ctx.stringValue("CreateRenderingDeviceResponse.RequestId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateRenderingDeviceResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("CreateRenderingDeviceResponse.InstanceIds["+ i +"]"));
		}
		createRenderingDeviceResponse.setInstanceIds(instanceIds);
	 
	 	return createRenderingDeviceResponse;
	}
}