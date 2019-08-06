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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.DescribeInstDbLogInfoResponse;
import com.aliyuncs.drds.model.v20190123.DescribeInstDbLogInfoResponse.LogTimeRange;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstDbLogInfoResponseUnmarshaller {

	public static DescribeInstDbLogInfoResponse unmarshall(DescribeInstDbLogInfoResponse describeInstDbLogInfoResponse, UnmarshallerContext _ctx) {
		
		describeInstDbLogInfoResponse.setRequestId(_ctx.stringValue("DescribeInstDbLogInfoResponse.RequestId"));
		describeInstDbLogInfoResponse.setSuccess(_ctx.booleanValue("DescribeInstDbLogInfoResponse.Success"));

		LogTimeRange logTimeRange = new LogTimeRange();
		logTimeRange.setSupportOldestTime(_ctx.longValue("DescribeInstDbLogInfoResponse.LogTimeRange.SupportOldestTime"));
		logTimeRange.setSupportLatestTime(_ctx.longValue("DescribeInstDbLogInfoResponse.LogTimeRange.SupportLatestTime"));
		describeInstDbLogInfoResponse.setLogTimeRange(logTimeRange);
	 
	 	return describeInstDbLogInfoResponse;
	}
}