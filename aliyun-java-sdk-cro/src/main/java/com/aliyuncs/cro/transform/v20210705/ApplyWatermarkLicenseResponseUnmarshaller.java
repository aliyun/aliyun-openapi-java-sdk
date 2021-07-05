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

package com.aliyuncs.cro.transform.v20210705;

import com.aliyuncs.cro.model.v20210705.ApplyWatermarkLicenseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyWatermarkLicenseResponseUnmarshaller {

	public static ApplyWatermarkLicenseResponse unmarshall(ApplyWatermarkLicenseResponse applyWatermarkLicenseResponse, UnmarshallerContext _ctx) {
		
		applyWatermarkLicenseResponse.setRequestId(_ctx.stringValue("ApplyWatermarkLicenseResponse.RequestId"));
		applyWatermarkLicenseResponse.setSuccess(_ctx.booleanValue("ApplyWatermarkLicenseResponse.Success"));
		applyWatermarkLicenseResponse.setErrorCode(_ctx.stringValue("ApplyWatermarkLicenseResponse.ErrorCode"));
		applyWatermarkLicenseResponse.setErrorMsg(_ctx.stringValue("ApplyWatermarkLicenseResponse.ErrorMsg"));
		applyWatermarkLicenseResponse.setDomain(_ctx.stringValue("ApplyWatermarkLicenseResponse.Domain"));
	 
	 	return applyWatermarkLicenseResponse;
	}
}