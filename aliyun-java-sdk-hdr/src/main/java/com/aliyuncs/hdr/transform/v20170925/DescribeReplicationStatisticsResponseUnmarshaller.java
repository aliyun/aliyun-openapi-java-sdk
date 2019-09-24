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

import com.aliyuncs.hdr.model.v20170925.DescribeReplicationStatisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicationStatisticsResponseUnmarshaller {

	public static DescribeReplicationStatisticsResponse unmarshall(DescribeReplicationStatisticsResponse describeReplicationStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeReplicationStatisticsResponse.setRequestId(_ctx.stringValue("DescribeReplicationStatisticsResponse.RequestId"));
		describeReplicationStatisticsResponse.setSuccess(_ctx.booleanValue("DescribeReplicationStatisticsResponse.Success"));
		describeReplicationStatisticsResponse.setCode(_ctx.stringValue("DescribeReplicationStatisticsResponse.Code"));
		describeReplicationStatisticsResponse.setMessage(_ctx.stringValue("DescribeReplicationStatisticsResponse.Message"));
		describeReplicationStatisticsResponse.setHealthy(_ctx.integerValue("DescribeReplicationStatisticsResponse.Healthy"));
		describeReplicationStatisticsResponse.setWarning(_ctx.integerValue("DescribeReplicationStatisticsResponse.Warning"));
		describeReplicationStatisticsResponse.setCritical(_ctx.integerValue("DescribeReplicationStatisticsResponse.Critical"));
		describeReplicationStatisticsResponse.setNotApplicable(_ctx.integerValue("DescribeReplicationStatisticsResponse.NotApplicable"));
	 
	 	return describeReplicationStatisticsResponse;
	}
}