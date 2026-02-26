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

package com.aliyuncs.eiam.transform.v20211201;

import com.aliyuncs.eiam.model.v20211201.ObtainApplicationTokenResponse;
import com.aliyuncs.eiam.model.v20211201.ObtainApplicationTokenResponse.ApplicationToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class ObtainApplicationTokenResponseUnmarshaller {

	public static ObtainApplicationTokenResponse unmarshall(ObtainApplicationTokenResponse obtainApplicationTokenResponse, UnmarshallerContext _ctx) {
		
		obtainApplicationTokenResponse.setRequestId(_ctx.stringValue("ObtainApplicationTokenResponse.RequestId"));

		ApplicationToken applicationToken = new ApplicationToken();
		applicationToken.setInstanceId(_ctx.stringValue("ObtainApplicationTokenResponse.ApplicationToken.InstanceId"));
		applicationToken.setApplicationId(_ctx.stringValue("ObtainApplicationTokenResponse.ApplicationToken.ApplicationId"));
		applicationToken.setApplicationTokenId(_ctx.stringValue("ObtainApplicationTokenResponse.ApplicationToken.ApplicationTokenId"));
		applicationToken.setApplicationTokenType(_ctx.stringValue("ObtainApplicationTokenResponse.ApplicationToken.ApplicationTokenType"));
		applicationToken.setApplicationToken(_ctx.stringValue("ObtainApplicationTokenResponse.ApplicationToken.ApplicationToken"));
		applicationToken.setStatus(_ctx.stringValue("ObtainApplicationTokenResponse.ApplicationToken.Status"));
		applicationToken.setExpirationTime(_ctx.longValue("ObtainApplicationTokenResponse.ApplicationToken.ExpirationTime"));
		applicationToken.setLastUsedTime(_ctx.longValue("ObtainApplicationTokenResponse.ApplicationToken.LastUsedTime"));
		applicationToken.setCreateTime(_ctx.longValue("ObtainApplicationTokenResponse.ApplicationToken.CreateTime"));
		obtainApplicationTokenResponse.setApplicationToken(applicationToken);
	 
	 	return obtainApplicationTokenResponse;
	}
}