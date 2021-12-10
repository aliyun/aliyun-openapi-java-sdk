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

import com.aliyuncs.eas.model.v20210701.CreateServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateServiceResponseUnmarshaller {

	public static CreateServiceResponse unmarshall(CreateServiceResponse createServiceResponse, UnmarshallerContext _ctx) {
		
		createServiceResponse.setRequestId(_ctx.stringValue("CreateServiceResponse.RequestId"));
		createServiceResponse.setServiceId(_ctx.stringValue("CreateServiceResponse.ServiceId"));
		createServiceResponse.setServiceName(_ctx.stringValue("CreateServiceResponse.ServiceName"));
		createServiceResponse.setStatus(_ctx.stringValue("CreateServiceResponse.Status"));
		createServiceResponse.setRegion(_ctx.stringValue("CreateServiceResponse.Region"));
		createServiceResponse.setInternetEndpoint(_ctx.stringValue("CreateServiceResponse.InternetEndpoint"));
		createServiceResponse.setIntranetEndpoint(_ctx.stringValue("CreateServiceResponse.IntranetEndpoint"));
	 
	 	return createServiceResponse;
	}
}