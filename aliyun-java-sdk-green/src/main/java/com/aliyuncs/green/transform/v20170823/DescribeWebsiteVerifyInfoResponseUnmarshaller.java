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

package com.aliyuncs.green.transform.v20170823;

import com.aliyuncs.green.model.v20170823.DescribeWebsiteVerifyInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebsiteVerifyInfoResponseUnmarshaller {

	public static DescribeWebsiteVerifyInfoResponse unmarshall(DescribeWebsiteVerifyInfoResponse describeWebsiteVerifyInfoResponse, UnmarshallerContext _ctx) {
		
		describeWebsiteVerifyInfoResponse.setRequestId(_ctx.stringValue("DescribeWebsiteVerifyInfoResponse.RequestId"));
		describeWebsiteVerifyInfoResponse.setCname(_ctx.stringValue("DescribeWebsiteVerifyInfoResponse.Cname"));
		describeWebsiteVerifyInfoResponse.setHostFile(_ctx.stringValue("DescribeWebsiteVerifyInfoResponse.HostFile"));
		describeWebsiteVerifyInfoResponse.setIndexPage(_ctx.stringValue("DescribeWebsiteVerifyInfoResponse.IndexPage"));
		describeWebsiteVerifyInfoResponse.setDomain(_ctx.stringValue("DescribeWebsiteVerifyInfoResponse.Domain"));
		describeWebsiteVerifyInfoResponse.setVerifyMethod(_ctx.stringValue("DescribeWebsiteVerifyInfoResponse.VerifyMethod"));
		describeWebsiteVerifyInfoResponse.setBizProtocol(_ctx.stringValue("DescribeWebsiteVerifyInfoResponse.Protocol"));
	 
	 	return describeWebsiteVerifyInfoResponse;
	}
}