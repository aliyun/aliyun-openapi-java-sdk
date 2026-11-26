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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.GetSaasServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSaasServiceResponseUnmarshaller {

	public static GetSaasServiceResponse unmarshall(GetSaasServiceResponse getSaasServiceResponse, UnmarshallerContext _ctx) {
		
		getSaasServiceResponse.setRequestId(_ctx.stringValue("GetSaasServiceResponse.RequestId"));
		getSaasServiceResponse.setStatus(_ctx.stringValue("GetSaasServiceResponse.Status"));
		getSaasServiceResponse.setCu(_ctx.stringValue("GetSaasServiceResponse.Cu"));
		getSaasServiceResponse.setServiceName(_ctx.stringValue("GetSaasServiceResponse.ServiceName"));
		getSaasServiceResponse.setServiceType(_ctx.stringValue("GetSaasServiceResponse.ServiceType"));
		getSaasServiceResponse.setWorkspaceId(_ctx.stringValue("GetSaasServiceResponse.WorkspaceId"));
		getSaasServiceResponse.setRegionId(_ctx.stringValue("GetSaasServiceResponse.RegionId"));
		getSaasServiceResponse.setPayType(_ctx.stringValue("GetSaasServiceResponse.PayType"));
		getSaasServiceResponse.setServiceId(_ctx.stringValue("GetSaasServiceResponse.ServiceId"));
	 
	 	return getSaasServiceResponse;
	}
}