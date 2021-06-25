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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DescribeJobGroupExportTaskProgressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobGroupExportTaskProgressResponseUnmarshaller {

	public static DescribeJobGroupExportTaskProgressResponse unmarshall(DescribeJobGroupExportTaskProgressResponse describeJobGroupExportTaskProgressResponse, UnmarshallerContext _ctx) {
		
		describeJobGroupExportTaskProgressResponse.setRequestId(_ctx.stringValue("DescribeJobGroupExportTaskProgressResponse.RequestId"));
		describeJobGroupExportTaskProgressResponse.setSuccess(_ctx.booleanValue("DescribeJobGroupExportTaskProgressResponse.Success"));
		describeJobGroupExportTaskProgressResponse.setCode(_ctx.stringValue("DescribeJobGroupExportTaskProgressResponse.Code"));
		describeJobGroupExportTaskProgressResponse.setMessage(_ctx.stringValue("DescribeJobGroupExportTaskProgressResponse.Message"));
		describeJobGroupExportTaskProgressResponse.setHttpStatusCode(_ctx.integerValue("DescribeJobGroupExportTaskProgressResponse.HttpStatusCode"));
		describeJobGroupExportTaskProgressResponse.setFileHttpUrl(_ctx.stringValue("DescribeJobGroupExportTaskProgressResponse.FileHttpUrl"));
		describeJobGroupExportTaskProgressResponse.setProgress(_ctx.floatValue("DescribeJobGroupExportTaskProgressResponse.Progress"));
	 
	 	return describeJobGroupExportTaskProgressResponse;
	}
}