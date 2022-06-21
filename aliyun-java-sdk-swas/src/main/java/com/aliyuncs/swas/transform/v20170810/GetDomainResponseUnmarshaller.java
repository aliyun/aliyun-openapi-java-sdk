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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.GetDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDomainResponseUnmarshaller {

	public static GetDomainResponse unmarshall(GetDomainResponse getDomainResponse, UnmarshallerContext _ctx) {
		
		getDomainResponse.setRequestId(_ctx.stringValue("GetDomainResponse.RequestId"));
		getDomainResponse.setHttpsOn(_ctx.booleanValue("GetDomainResponse.HttpsOn"));
		getDomainResponse.setIsSuccess(_ctx.booleanValue("GetDomainResponse.IsSuccess"));
		getDomainResponse.setHttpsSettingOn(_ctx.booleanValue("GetDomainResponse.HttpsSettingOn"));
		getDomainResponse.setCertId(_ctx.stringValue("GetDomainResponse.CertId"));
		getDomainResponse.setDomain(_ctx.stringValue("GetDomainResponse.Domain"));
		getDomainResponse.setCode(_ctx.stringValue("GetDomainResponse.Code"));
	 
	 	return getDomainResponse;
	}
}