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

	public static DescribeWebsiteVerifyInfoResponse unmarshall(DescribeWebsiteVerifyInfoResponse describeWebsiteVerifyInfoResponse, UnmarshallerContext context) {
		
		describeWebsiteVerifyInfoResponse.setRequestId(context.stringValue("DescribeWebsiteVerifyInfoResponse.RequestId"));
		describeWebsiteVerifyInfoResponse.setCname(context.stringValue("DescribeWebsiteVerifyInfoResponse.Cname"));
		describeWebsiteVerifyInfoResponse.setHostFile(context.stringValue("DescribeWebsiteVerifyInfoResponse.HostFile"));
		describeWebsiteVerifyInfoResponse.setIndexPage(context.stringValue("DescribeWebsiteVerifyInfoResponse.IndexPage"));
		describeWebsiteVerifyInfoResponse.setDomain(context.stringValue("DescribeWebsiteVerifyInfoResponse.Domain"));
		describeWebsiteVerifyInfoResponse.setVerifyMethod(context.stringValue("DescribeWebsiteVerifyInfoResponse.VerifyMethod"));
		describeWebsiteVerifyInfoResponse.setProtocol(context.stringValue("DescribeWebsiteVerifyInfoResponse.Protocol"));
	 
	 	return describeWebsiteVerifyInfoResponse;
	}
}