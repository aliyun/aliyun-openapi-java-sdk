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

import com.aliyuncs.democenter.model.v20200121.DescribeDemoAccessTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDemoAccessTokenResponseUnmarshaller {

	public static DescribeDemoAccessTokenResponse unmarshall(DescribeDemoAccessTokenResponse describeDemoAccessTokenResponse, UnmarshallerContext _ctx) {
		
		describeDemoAccessTokenResponse.setRequestId(_ctx.stringValue("DescribeDemoAccessTokenResponse.RequestId"));
		describeDemoAccessTokenResponse.setDemoAccessToken(_ctx.stringValue("DescribeDemoAccessTokenResponse.DemoAccessToken"));
		describeDemoAccessTokenResponse.setExpiredDate(_ctx.stringValue("DescribeDemoAccessTokenResponse.ExpiredDate"));
		describeDemoAccessTokenResponse.setOpenUserId(_ctx.stringValue("DescribeDemoAccessTokenResponse.OpenUserId"));
		describeDemoAccessTokenResponse.setDemoTrialPage(_ctx.stringValue("DescribeDemoAccessTokenResponse.DemoTrialPage"));
		describeDemoAccessTokenResponse.setDemoDetailPage(_ctx.stringValue("DescribeDemoAccessTokenResponse.DemoDetailPage"));
	 
	 	return describeDemoAccessTokenResponse;
	}
}