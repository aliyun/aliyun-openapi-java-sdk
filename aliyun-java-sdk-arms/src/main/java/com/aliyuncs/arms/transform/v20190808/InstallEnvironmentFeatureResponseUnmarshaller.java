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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.InstallEnvironmentFeatureResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InstallEnvironmentFeatureResponseUnmarshaller {

	public static InstallEnvironmentFeatureResponse unmarshall(InstallEnvironmentFeatureResponse installEnvironmentFeatureResponse, UnmarshallerContext _ctx) {
		
		installEnvironmentFeatureResponse.setRequestId(_ctx.stringValue("InstallEnvironmentFeatureResponse.RequestId"));
		installEnvironmentFeatureResponse.setCode(_ctx.integerValue("InstallEnvironmentFeatureResponse.Code"));
		installEnvironmentFeatureResponse.setMessage(_ctx.stringValue("InstallEnvironmentFeatureResponse.Message"));
		installEnvironmentFeatureResponse.setSuccess(_ctx.booleanValue("InstallEnvironmentFeatureResponse.Success"));
		installEnvironmentFeatureResponse.setData(_ctx.stringValue("InstallEnvironmentFeatureResponse.Data"));
	 
	 	return installEnvironmentFeatureResponse;
	}
}