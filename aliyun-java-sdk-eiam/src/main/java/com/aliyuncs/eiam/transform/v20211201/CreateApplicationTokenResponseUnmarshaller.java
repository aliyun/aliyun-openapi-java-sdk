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

import com.aliyuncs.eiam.model.v20211201.CreateApplicationTokenResponse;
import com.aliyuncs.eiam.model.v20211201.CreateApplicationTokenResponse.ApplicationTokens;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApplicationTokenResponseUnmarshaller {

	public static CreateApplicationTokenResponse unmarshall(CreateApplicationTokenResponse createApplicationTokenResponse, UnmarshallerContext _ctx) {
		
		createApplicationTokenResponse.setRequestId(_ctx.stringValue("CreateApplicationTokenResponse.RequestId"));

		ApplicationTokens applicationTokens = new ApplicationTokens();
		applicationTokens.setApplicationTokenId(_ctx.stringValue("CreateApplicationTokenResponse.ApplicationTokens.ApplicationTokenId"));
		applicationTokens.setApplicationToken(_ctx.stringValue("CreateApplicationTokenResponse.ApplicationTokens.ApplicationToken"));
		applicationTokens.setApplicationTokenType(_ctx.stringValue("CreateApplicationTokenResponse.ApplicationTokens.ApplicationTokenType"));
		createApplicationTokenResponse.setApplicationTokens(applicationTokens);
	 
	 	return createApplicationTokenResponse;
	}
}