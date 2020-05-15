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

package com.aliyuncs.iovcc.transform.v20180501;

import com.aliyuncs.iovcc.model.v20180501.DescribeAssistReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAssistReportResponseUnmarshaller {

	public static DescribeAssistReportResponse unmarshall(DescribeAssistReportResponse describeAssistReportResponse, UnmarshallerContext _ctx) {
		
		describeAssistReportResponse.setRequestId(_ctx.stringValue("DescribeAssistReportResponse.RequestId"));
		describeAssistReportResponse.setAssistId(_ctx.stringValue("DescribeAssistReportResponse.AssistId"));
		describeAssistReportResponse.setAssistDescription(_ctx.stringValue("DescribeAssistReportResponse.AssistDescription"));
		describeAssistReportResponse.setAssistResult(_ctx.stringValue("DescribeAssistReportResponse.AssistResult"));
		describeAssistReportResponse.setAssistReason(_ctx.stringValue("DescribeAssistReportResponse.AssistReason"));
		describeAssistReportResponse.setAssistTag(_ctx.stringValue("DescribeAssistReportResponse.AssistTag"));
	 
	 	return describeAssistReportResponse;
	}
}