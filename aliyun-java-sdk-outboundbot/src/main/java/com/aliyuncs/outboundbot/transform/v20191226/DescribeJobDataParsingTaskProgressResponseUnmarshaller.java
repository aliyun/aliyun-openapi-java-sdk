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

import com.aliyuncs.outboundbot.model.v20191226.DescribeJobDataParsingTaskProgressResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobDataParsingTaskProgressResponse.Progress;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobDataParsingTaskProgressResponseUnmarshaller {

	public static DescribeJobDataParsingTaskProgressResponse unmarshall(DescribeJobDataParsingTaskProgressResponse describeJobDataParsingTaskProgressResponse, UnmarshallerContext _ctx) {
		
		describeJobDataParsingTaskProgressResponse.setRequestId(_ctx.stringValue("DescribeJobDataParsingTaskProgressResponse.RequestId"));
		describeJobDataParsingTaskProgressResponse.setSuccess(_ctx.booleanValue("DescribeJobDataParsingTaskProgressResponse.Success"));
		describeJobDataParsingTaskProgressResponse.setCode(_ctx.stringValue("DescribeJobDataParsingTaskProgressResponse.Code"));
		describeJobDataParsingTaskProgressResponse.setMessage(_ctx.stringValue("DescribeJobDataParsingTaskProgressResponse.Message"));
		describeJobDataParsingTaskProgressResponse.setHttpStatusCode(_ctx.integerValue("DescribeJobDataParsingTaskProgressResponse.HttpStatusCode"));

		Progress progress = new Progress();
		progress.setStatus(_ctx.stringValue("DescribeJobDataParsingTaskProgressResponse.Progress.Status"));
		progress.setFailErrorCode(_ctx.stringValue("DescribeJobDataParsingTaskProgressResponse.Progress.FailErrorCode"));
		progress.setFailReason(_ctx.stringValue("DescribeJobDataParsingTaskProgressResponse.Progress.FailReason"));
		progress.setTotalJobCount(_ctx.integerValue("DescribeJobDataParsingTaskProgressResponse.Progress.TotalJobCount"));
		progress.setHandledJobCount(_ctx.integerValue("DescribeJobDataParsingTaskProgressResponse.Progress.HandledJobCount"));
		describeJobDataParsingTaskProgressResponse.setProgress(progress);
	 
	 	return describeJobDataParsingTaskProgressResponse;
	}
}