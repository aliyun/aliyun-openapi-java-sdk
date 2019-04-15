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

package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.DescribeScreenSummaryInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScreenSummaryInfoResponseUnmarshaller {

	public static DescribeScreenSummaryInfoResponse unmarshall(DescribeScreenSummaryInfoResponse describeScreenSummaryInfoResponse, UnmarshallerContext context) {
		
		describeScreenSummaryInfoResponse.setRequestId(context.stringValue("DescribeScreenSummaryInfoResponse.RequestId"));
		describeScreenSummaryInfoResponse.setAegisClientOfflineCount(context.integerValue("DescribeScreenSummaryInfoResponse.AegisClientOfflineCount"));
		describeScreenSummaryInfoResponse.setSecurityScore(context.integerValue("DescribeScreenSummaryInfoResponse.SecurityScore"));
		describeScreenSummaryInfoResponse.setAegisClientOnlineCount(context.integerValue("DescribeScreenSummaryInfoResponse.AegisClientOnlineCount"));
		describeScreenSummaryInfoResponse.setSuccess(context.booleanValue("DescribeScreenSummaryInfoResponse.Success"));
	 
	 	return describeScreenSummaryInfoResponse;
	}
}