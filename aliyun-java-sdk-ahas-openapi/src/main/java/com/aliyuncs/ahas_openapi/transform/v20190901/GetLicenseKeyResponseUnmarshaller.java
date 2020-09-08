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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import com.aliyuncs.ahas_openapi.model.v20190901.GetLicenseKeyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLicenseKeyResponseUnmarshaller {

	public static GetLicenseKeyResponse unmarshall(GetLicenseKeyResponse getLicenseKeyResponse, UnmarshallerContext _ctx) {
		
		getLicenseKeyResponse.setRequestId(_ctx.stringValue("GetLicenseKeyResponse.RequestId"));
		getLicenseKeyResponse.setCode(_ctx.stringValue("GetLicenseKeyResponse.Code"));
		getLicenseKeyResponse.setData(_ctx.stringValue("GetLicenseKeyResponse.Data"));
		getLicenseKeyResponse.setMessage(_ctx.stringValue("GetLicenseKeyResponse.Message"));
		getLicenseKeyResponse.setSuccess(_ctx.booleanValue("GetLicenseKeyResponse.Success"));
	 
	 	return getLicenseKeyResponse;
	}
}