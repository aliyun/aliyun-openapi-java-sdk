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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.DescribevSphereInventoriesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribevSphereInventoriesResponseUnmarshaller {

	public static DescribevSphereInventoriesResponse unmarshall(DescribevSphereInventoriesResponse describevSphereInventoriesResponse, UnmarshallerContext _ctx) {
		
		describevSphereInventoriesResponse.setRequestId(_ctx.stringValue("DescribevSphereInventoriesResponse.RequestId"));
		describevSphereInventoriesResponse.setSuccess(_ctx.booleanValue("DescribevSphereInventoriesResponse.Success"));
		describevSphereInventoriesResponse.setCode(_ctx.stringValue("DescribevSphereInventoriesResponse.Code"));
		describevSphereInventoriesResponse.setMessage(_ctx.stringValue("DescribevSphereInventoriesResponse.Message"));
		describevSphereInventoriesResponse.setTaskId(_ctx.stringValue("DescribevSphereInventoriesResponse.TaskId"));
	 
	 	return describevSphereInventoriesResponse;
	}
}