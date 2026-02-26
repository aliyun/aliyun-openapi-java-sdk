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

package com.aliyuncs.brain_industrial.transform.v20200920;

import com.aliyuncs.brain_industrial.model.v20200920.UpdateLicenseDescriptionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLicenseDescriptionResponseUnmarshaller {

	public static UpdateLicenseDescriptionResponse unmarshall(UpdateLicenseDescriptionResponse updateLicenseDescriptionResponse, UnmarshallerContext _ctx) {
		
		updateLicenseDescriptionResponse.setRequestId(_ctx.stringValue("UpdateLicenseDescriptionResponse.RequestId"));
		updateLicenseDescriptionResponse.setCode(_ctx.stringValue("UpdateLicenseDescriptionResponse.Code"));
		updateLicenseDescriptionResponse.setSuccess(_ctx.stringValue("UpdateLicenseDescriptionResponse.Success"));
		updateLicenseDescriptionResponse.setMessage(_ctx.stringValue("UpdateLicenseDescriptionResponse.Message"));
		updateLicenseDescriptionResponse.setHttpStatusCode(_ctx.integerValue("UpdateLicenseDescriptionResponse.HttpStatusCode"));
		updateLicenseDescriptionResponse.setAccessDeniedDetail(_ctx.stringValue("UpdateLicenseDescriptionResponse.AccessDeniedDetail"));
	 
	 	return updateLicenseDescriptionResponse;
	}
}