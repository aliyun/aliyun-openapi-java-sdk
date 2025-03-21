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

package com.aliyuncs.onsmqtt.transform.v20200420;

import com.aliyuncs.onsmqtt.model.v20200420.DisasterDowngradeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisasterDowngradeResponseUnmarshaller {

	public static DisasterDowngradeResponse unmarshall(DisasterDowngradeResponse disasterDowngradeResponse, UnmarshallerContext _ctx) {
		
		disasterDowngradeResponse.setRequestId(_ctx.stringValue("DisasterDowngradeResponse.RequestId"));
		disasterDowngradeResponse.setCode(_ctx.integerValue("DisasterDowngradeResponse.Code"));
		disasterDowngradeResponse.setSuccess(_ctx.booleanValue("DisasterDowngradeResponse.Success"));
		disasterDowngradeResponse.setMessage(_ctx.stringValue("DisasterDowngradeResponse.Message"));
		disasterDowngradeResponse.setAccessDeniedDetail(_ctx.stringValue("DisasterDowngradeResponse.AccessDeniedDetail"));
	 
	 	return disasterDowngradeResponse;
	}
}