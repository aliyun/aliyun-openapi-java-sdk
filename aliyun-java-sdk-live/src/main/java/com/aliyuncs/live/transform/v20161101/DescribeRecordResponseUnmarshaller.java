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

	public static DescribeRecordResponse unmarshall(DescribeRecordResponse describeRecordResponse, UnmarshallerContext _ctx) {
		
		describeRecordResponse.setRequestId(_ctx.stringValue("DescribeRecordResponse.RequestId"));
		describeRecordResponse.setRecordId(_ctx.stringValue("DescribeRecordResponse.RecordId"));
		describeRecordResponse.setAppId(_ctx.stringValue("DescribeRecordResponse.AppId"));
		describeRecordResponse.setBoardId(_ctx.integerValue("DescribeRecordResponse.BoardId"));
		describeRecordResponse.setRecordStartTime(_ctx.longValue("DescribeRecordResponse.RecordStartTime"));
		describeRecordResponse.setStartTime(_ctx.longValue("DescribeRecordResponse.StartTime"));
		describeRecordResponse.setEndTime(_ctx.longValue("DescribeRecordResponse.EndTime"));
		describeRecordResponse.setState(_ctx.integerValue("DescribeRecordResponse.State"));
		describeRecordResponse.setOssPath(_ctx.stringValue("DescribeRecordResponse.OssPath"));
		describeRecordResponse.setOssBucket(_ctx.stringValue("DescribeRecordResponse.OssBucket"));
		describeRecordResponse.setOssEndpoint(_ctx.stringValue("DescribeRecordResponse.OssEndpoint"));
	 
	 	return describeRecordResponse;
	}
}