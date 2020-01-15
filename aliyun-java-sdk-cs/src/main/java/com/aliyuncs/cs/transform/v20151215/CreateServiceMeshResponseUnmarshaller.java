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

package com.aliyuncs.cs.transform.v20151215;

import com.aliyuncs.cs.model.v20151215.CreateServiceMeshResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateServiceMeshResponseUnmarshaller {

	public static CreateServiceMeshResponse unmarshall(CreateServiceMeshResponse createServiceMeshResponse, UnmarshallerContext _ctx) {
		
		createServiceMeshResponse.setRequestId(_ctx.stringValue("CreateServiceMeshResponse.RequestId"));
	 
	 	return createServiceMeshResponse;
	}
}