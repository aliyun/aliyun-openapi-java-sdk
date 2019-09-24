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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.DescribeTestFailoverStatisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTestFailoverStatisticsResponseUnmarshaller {

	public static DescribeTestFailoverStatisticsResponse unmarshall(DescribeTestFailoverStatisticsResponse describeTestFailoverStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeTestFailoverStatisticsResponse.setRequestId(_ctx.stringValue("DescribeTestFailoverStatisticsResponse.RequestId"));
		describeTestFailoverStatisticsResponse.setSuccess(_ctx.booleanValue("DescribeTestFailoverStatisticsResponse.Success"));
		describeTestFailoverStatisticsResponse.setCode(_ctx.stringValue("DescribeTestFailoverStatisticsResponse.Code"));
		describeTestFailoverStatisticsResponse.setMessage(_ctx.stringValue("DescribeTestFailoverStatisticsResponse.Message"));
		describeTestFailoverStatisticsResponse.setTestRecommended(_ctx.integerValue("DescribeTestFailoverStatisticsResponse.TestRecommended"));
		describeTestFailoverStatisticsResponse.setLatestSuccessfulCount(_ctx.integerValue("DescribeTestFailoverStatisticsResponse.LatestSuccessfulCount"));
		describeTestFailoverStatisticsResponse.setLatestTotalCount(_ctx.integerValue("DescribeTestFailoverStatisticsResponse.LatestTotalCount"));
	 
	 	return describeTestFailoverStatisticsResponse;
	}
}