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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClusterForInternalResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterForInternalResponse.DescribeClusterResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterForInternalResponse.DescribeClusterResponse.FailReason;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterForInternalResponseUnmarshaller {

	public static ListClusterForInternalResponse unmarshall(ListClusterForInternalResponse listClusterForInternalResponse, UnmarshallerContext context) {
		
		listClusterForInternalResponse.setRequestId(context.stringValue("ListClusterForInternalResponse.RequestId"));

		List<DescribeClusterResponse> describeClusterResponseList = new ArrayList<DescribeClusterResponse>();
		for (int i = 0; i < context.lengthValue("ListClusterForInternalResponse.DescribeClusterResponseList.Length"); i++) {
			DescribeClusterResponse describeClusterResponse = new DescribeClusterResponse();
			describeClusterResponse.setRequestId(context.stringValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].RequestId"));
			describeClusterResponse.setId(context.stringValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].Id"));
			describeClusterResponse.setBizId(context.stringValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].BizId"));
			describeClusterResponse.setName(context.stringValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].Name"));
			describeClusterResponse.setStartTime(context.longValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].StartTime"));
			describeClusterResponse.setStopTime(context.longValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].StopTime"));
			describeClusterResponse.setLogEnable(context.booleanValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].LogEnable"));
			describeClusterResponse.setLogPath(context.stringValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].LogPath"));
			describeClusterResponse.setUserId(context.stringValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].UserId"));
			describeClusterResponse.setRunningTime(context.integerValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].RunningTime"));
			describeClusterResponse.setStatus(context.stringValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].Status"));
			describeClusterResponse.setExpiredTime(context.longValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].ExpiredTime"));

			FailReason failReason = new FailReason();
			failReason.setErrorCode(context.stringValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].FailReason.ErrorCode"));
			failReason.setErrorMsg(context.stringValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].FailReason.ErrorMsg"));
			failReason.setRequestId(context.stringValue("ListClusterForInternalResponse.DescribeClusterResponseList["+ i +"].FailReason.RequestId"));
			describeClusterResponse.setFailReason(failReason);

			describeClusterResponseList.add(describeClusterResponse);
		}
		listClusterForInternalResponse.setDescribeClusterResponseList(describeClusterResponseList);
	 
	 	return listClusterForInternalResponse;
	}
}