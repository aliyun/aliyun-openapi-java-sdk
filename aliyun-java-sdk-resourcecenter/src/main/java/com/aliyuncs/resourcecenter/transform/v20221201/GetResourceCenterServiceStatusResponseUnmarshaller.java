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

package com.aliyuncs.resourcecenter.transform.v20221201;

import com.aliyuncs.resourcecenter.model.v20221201.GetResourceCenterServiceStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceCenterServiceStatusResponseUnmarshaller {

	public static GetResourceCenterServiceStatusResponse unmarshall(GetResourceCenterServiceStatusResponse getResourceCenterServiceStatusResponse, UnmarshallerContext _ctx) {
		
		getResourceCenterServiceStatusResponse.setRequestId(_ctx.stringValue("GetResourceCenterServiceStatusResponse.RequestId"));
		getResourceCenterServiceStatusResponse.setServiceStatus(_ctx.stringValue("GetResourceCenterServiceStatusResponse.ServiceStatus"));
		getResourceCenterServiceStatusResponse.setInitialStatus(_ctx.stringValue("GetResourceCenterServiceStatusResponse.InitialStatus"));
	 
	 	return getResourceCenterServiceStatusResponse;
	}
}