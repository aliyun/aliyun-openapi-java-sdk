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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.DescribeRecordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordResponseUnmarshaller {

	public static DescribeRecordResponse unmarshall(DescribeRecordResponse describeRecordResponse, UnmarshallerContext context) {
		
		describeRecordResponse.setRequestId(context.stringValue("DescribeRecordResponse.RequestId"));
		describeRecordResponse.setRecordId(context.stringValue("DescribeRecordResponse.RecordId"));
		describeRecordResponse.setAppId(context.stringValue("DescribeRecordResponse.AppId"));
		describeRecordResponse.setBoardId(context.integerValue("DescribeRecordResponse.BoardId"));
		describeRecordResponse.setRecordStartTime(context.longValue("DescribeRecordResponse.RecordStartTime"));
		describeRecordResponse.setStartTime(context.longValue("DescribeRecordResponse.StartTime"));
		describeRecordResponse.setEndTime(context.longValue("DescribeRecordResponse.EndTime"));
		describeRecordResponse.setState(context.integerValue("DescribeRecordResponse.State"));
		describeRecordResponse.setOssPath(context.stringValue("DescribeRecordResponse.OssPath"));
		describeRecordResponse.setOssBucket(context.stringValue("DescribeRecordResponse.OssBucket"));
		describeRecordResponse.setOssEndpoint(context.stringValue("DescribeRecordResponse.OssEndpoint"));
	 
	 	return describeRecordResponse;
	}
}