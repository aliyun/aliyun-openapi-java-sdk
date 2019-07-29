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

package com.aliyuncs.foas.transform.v20181111;

import com.aliyuncs.foas.model.v20181111.GetClusterResourceResponse;
import com.aliyuncs.foas.model.v20181111.GetClusterResourceResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterResourceResponseUnmarshaller {

	public static GetClusterResourceResponse unmarshall(GetClusterResourceResponse getClusterResourceResponse, UnmarshallerContext _ctx) {
		
		getClusterResourceResponse.setRequestId(_ctx.stringValue("GetClusterResourceResponse.RequestId"));

		Resource resource = new Resource();
		resource.setTotalMB(_ctx.longValue("GetClusterResourceResponse.Resource.TotalMB"));
		resource.setAllocatedMB(_ctx.longValue("GetClusterResourceResponse.Resource.AllocatedMB"));
		resource.setAvailableMB(_ctx.longValue("GetClusterResourceResponse.Resource.AvailableMB"));
		resource.setTotalVirtualCores(_ctx.longValue("GetClusterResourceResponse.Resource.TotalVirtualCores"));
		resource.setAllocatedVirtualCores(_ctx.longValue("GetClusterResourceResponse.Resource.AllocatedVirtualCores"));
		resource.setAvailableVirtualCores(_ctx.longValue("GetClusterResourceResponse.Resource.AvailableVirtualCores"));
		getClusterResourceResponse.setResource(resource);
	 
	 	return getClusterResourceResponse;
	}
}