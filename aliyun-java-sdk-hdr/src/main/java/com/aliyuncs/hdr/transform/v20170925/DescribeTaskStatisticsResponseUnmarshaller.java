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

import com.aliyuncs.hdr.model.v20170925.DescribeTaskStatisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTaskStatisticsResponseUnmarshaller {

	public static DescribeTaskStatisticsResponse unmarshall(DescribeTaskStatisticsResponse describeTaskStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeTaskStatisticsResponse.setRequestId(_ctx.stringValue("DescribeTaskStatisticsResponse.RequestId"));
		describeTaskStatisticsResponse.setSuccess(_ctx.booleanValue("DescribeTaskStatisticsResponse.Success"));
		describeTaskStatisticsResponse.setCode(_ctx.stringValue("DescribeTaskStatisticsResponse.Code"));
		describeTaskStatisticsResponse.setMessage(_ctx.stringValue("DescribeTaskStatisticsResponse.Message"));
		describeTaskStatisticsResponse.setSuccessful(_ctx.integerValue("DescribeTaskStatisticsResponse.Successful"));
		describeTaskStatisticsResponse.setInProgress(_ctx.integerValue("DescribeTaskStatisticsResponse.InProgress"));
		describeTaskStatisticsResponse.setFailed(_ctx.integerValue("DescribeTaskStatisticsResponse.Failed"));
	 
	 	return describeTaskStatisticsResponse;
	}
}