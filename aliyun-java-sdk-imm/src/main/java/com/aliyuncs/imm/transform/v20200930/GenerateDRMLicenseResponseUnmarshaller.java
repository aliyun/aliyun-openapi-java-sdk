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

package com.aliyuncs.imm.transform.v20200930;

import com.aliyuncs.imm.model.v20200930.GenerateDRMLicenseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateDRMLicenseResponseUnmarshaller {

	public static GenerateDRMLicenseResponse unmarshall(GenerateDRMLicenseResponse generateDRMLicenseResponse, UnmarshallerContext _ctx) {
		
		generateDRMLicenseResponse.setRequestId(_ctx.stringValue("GenerateDRMLicenseResponse.RequestId"));
		generateDRMLicenseResponse.setLicense(_ctx.stringValue("GenerateDRMLicenseResponse.License"));
		generateDRMLicenseResponse.setStates(_ctx.longValue("GenerateDRMLicenseResponse.States"));
		generateDRMLicenseResponse.setDeviceInfo(_ctx.stringValue("GenerateDRMLicenseResponse.DeviceInfo"));
	 
	 	return generateDRMLicenseResponse;
	}
}