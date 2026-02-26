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

package com.aliyuncs.avatar.transform.v20220130;

import com.aliyuncs.avatar.model.v20220130.LicenseAuthResponse;
import com.aliyuncs.avatar.model.v20220130.LicenseAuthResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class LicenseAuthResponseUnmarshaller {

	public static LicenseAuthResponse unmarshall(LicenseAuthResponse licenseAuthResponse, UnmarshallerContext _ctx) {
		
		licenseAuthResponse.setRequestId(_ctx.stringValue("LicenseAuthResponse.RequestId"));
		licenseAuthResponse.setCode(_ctx.stringValue("LicenseAuthResponse.Code"));
		licenseAuthResponse.setMessage(_ctx.stringValue("LicenseAuthResponse.Message"));
		licenseAuthResponse.setSuccess(_ctx.booleanValue("LicenseAuthResponse.Success"));

		Data data = new Data();
		data.setToken(_ctx.stringValue("LicenseAuthResponse.Data.Token"));
		licenseAuthResponse.setData(data);
	 
	 	return licenseAuthResponse;
	}
}