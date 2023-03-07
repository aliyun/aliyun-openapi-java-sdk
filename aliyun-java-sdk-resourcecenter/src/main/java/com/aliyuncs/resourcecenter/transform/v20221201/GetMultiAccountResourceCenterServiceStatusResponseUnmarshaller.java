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

import com.aliyuncs.resourcecenter.model.v20221201.GetMultiAccountResourceCenterServiceStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMultiAccountResourceCenterServiceStatusResponseUnmarshaller {

	public static GetMultiAccountResourceCenterServiceStatusResponse unmarshall(GetMultiAccountResourceCenterServiceStatusResponse getMultiAccountResourceCenterServiceStatusResponse, UnmarshallerContext _ctx) {
		
		getMultiAccountResourceCenterServiceStatusResponse.setRequestId(_ctx.stringValue("GetMultiAccountResourceCenterServiceStatusResponse.RequestId"));
		getMultiAccountResourceCenterServiceStatusResponse.setServiceStatus(_ctx.stringValue("GetMultiAccountResourceCenterServiceStatusResponse.ServiceStatus"));
		getMultiAccountResourceCenterServiceStatusResponse.setInitialStatus(_ctx.stringValue("GetMultiAccountResourceCenterServiceStatusResponse.InitialStatus"));
	 
	 	return getMultiAccountResourceCenterServiceStatusResponse;
	}
}