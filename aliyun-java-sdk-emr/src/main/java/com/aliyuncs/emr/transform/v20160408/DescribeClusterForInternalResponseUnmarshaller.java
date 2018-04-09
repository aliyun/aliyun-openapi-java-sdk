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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeClusterForInternalResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterForInternalResponse.FailReason;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterForInternalResponseUnmarshaller {

	public static DescribeClusterForInternalResponse unmarshall(DescribeClusterForInternalResponse describeClusterForInternalResponse, UnmarshallerContext context) {
		
		describeClusterForInternalResponse.setRequestId(context.stringValue("DescribeClusterForInternalResponse.RequestId"));
		describeClusterForInternalResponse.setId(context.stringValue("DescribeClusterForInternalResponse.Id"));
		describeClusterForInternalResponse.setBizId(context.stringValue("DescribeClusterForInternalResponse.BizId"));
		describeClusterForInternalResponse.setName(context.stringValue("DescribeClusterForInternalResponse.Name"));
		describeClusterForInternalResponse.setStartTime(context.longValue("DescribeClusterForInternalResponse.StartTime"));
		describeClusterForInternalResponse.setStopTime(context.longValue("DescribeClusterForInternalResponse.StopTime"));
		describeClusterForInternalResponse.setLogEnable(context.booleanValue("DescribeClusterForInternalResponse.LogEnable"));
		describeClusterForInternalResponse.setLogPath(context.stringValue("DescribeClusterForInternalResponse.LogPath"));
		describeClusterForInternalResponse.setUserId(context.stringValue("DescribeClusterForInternalResponse.UserId"));
		describeClusterForInternalResponse.setRunningTime(context.integerValue("DescribeClusterForInternalResponse.RunningTime"));
		describeClusterForInternalResponse.setStatus(context.stringValue("DescribeClusterForInternalResponse.Status"));
		describeClusterForInternalResponse.setExpiredTime(context.longValue("DescribeClusterForInternalResponse.ExpiredTime"));

		FailReason failReason = new FailReason();
		failReason.setErrorCode(context.stringValue("DescribeClusterForInternalResponse.FailReason.ErrorCode"));
		failReason.setErrorMsg(context.stringValue("DescribeClusterForInternalResponse.FailReason.ErrorMsg"));
		failReason.setRequestId(context.stringValue("DescribeClusterForInternalResponse.FailReason.RequestId"));
		describeClusterForInternalResponse.setFailReason(failReason);
	 
	 	return describeClusterForInternalResponse;
	}
}