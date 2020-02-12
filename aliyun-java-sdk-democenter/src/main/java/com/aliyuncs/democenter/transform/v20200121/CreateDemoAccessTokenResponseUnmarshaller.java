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

package com.aliyuncs.democenter.transform.v20200121;

import com.aliyuncs.democenter.model.v20200121.CreateDemoAccessTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDemoAccessTokenResponseUnmarshaller {

	public static CreateDemoAccessTokenResponse unmarshall(CreateDemoAccessTokenResponse createDemoAccessTokenResponse, UnmarshallerContext _ctx) {
		
		createDemoAccessTokenResponse.setRequestId(_ctx.stringValue("CreateDemoAccessTokenResponse.RequestId"));
		createDemoAccessTokenResponse.setDemoAccessToken(_ctx.stringValue("CreateDemoAccessTokenResponse.DemoAccessToken"));
		createDemoAccessTokenResponse.setExpiredDate(_ctx.stringValue("CreateDemoAccessTokenResponse.ExpiredDate"));
		createDemoAccessTokenResponse.setOpenUserId(_ctx.stringValue("CreateDemoAccessTokenResponse.OpenUserId"));
		createDemoAccessTokenResponse.setDemoTrialPage(_ctx.stringValue("CreateDemoAccessTokenResponse.DemoTrialPage"));
		createDemoAccessTokenResponse.setDemoDetailPage(_ctx.stringValue("CreateDemoAccessTokenResponse.DemoDetailPage"));
	 
	 	return createDemoAccessTokenResponse;
	}
}