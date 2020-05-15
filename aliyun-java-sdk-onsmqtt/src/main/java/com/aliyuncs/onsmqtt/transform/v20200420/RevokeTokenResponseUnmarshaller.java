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

import com.aliyuncs.onsmqtt.model.v20200420.RevokeTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RevokeTokenResponseUnmarshaller {

	public static RevokeTokenResponse unmarshall(RevokeTokenResponse revokeTokenResponse, UnmarshallerContext _ctx) {
		
		revokeTokenResponse.setRequestId(_ctx.stringValue("RevokeTokenResponse.RequestId"));
	 
	 	return revokeTokenResponse;
	}
}