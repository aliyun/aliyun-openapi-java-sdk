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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.ApplyRecordTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyRecordTokenResponseUnmarshaller {

	public static ApplyRecordTokenResponse unmarshall(ApplyRecordTokenResponse applyRecordTokenResponse, UnmarshallerContext context) {
		
		applyRecordTokenResponse.setRequestId(context.stringValue("ApplyRecordTokenResponse.RequestId"));
		applyRecordTokenResponse.setSecurityToken(context.stringValue("ApplyRecordTokenResponse.SecurityToken"));
		applyRecordTokenResponse.setAccessKeySecret(context.stringValue("ApplyRecordTokenResponse.AccessKeySecret"));
		applyRecordTokenResponse.setAccessKeyId(context.stringValue("ApplyRecordTokenResponse.AccessKeyId"));
		applyRecordTokenResponse.setExpiration(context.stringValue("ApplyRecordTokenResponse.Expiration"));
	 
	 	return applyRecordTokenResponse;
	}
}