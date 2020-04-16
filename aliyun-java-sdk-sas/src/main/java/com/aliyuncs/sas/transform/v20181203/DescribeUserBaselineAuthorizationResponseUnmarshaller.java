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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeUserBaselineAuthorizationResponse;
import com.aliyuncs.sas.model.v20181203.DescribeUserBaselineAuthorizationResponse.UserBaselineAuthorization;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserBaselineAuthorizationResponseUnmarshaller {

	public static DescribeUserBaselineAuthorizationResponse unmarshall(DescribeUserBaselineAuthorizationResponse describeUserBaselineAuthorizationResponse, UnmarshallerContext _ctx) {
		
		describeUserBaselineAuthorizationResponse.setRequestId(_ctx.stringValue("DescribeUserBaselineAuthorizationResponse.RequestId"));

		UserBaselineAuthorization userBaselineAuthorization = new UserBaselineAuthorization();
		userBaselineAuthorization.setStatus(_ctx.integerValue("DescribeUserBaselineAuthorizationResponse.UserBaselineAuthorization.Status"));
		describeUserBaselineAuthorizationResponse.setUserBaselineAuthorization(userBaselineAuthorization);
	 
	 	return describeUserBaselineAuthorizationResponse;
	}
}