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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.DescribeJobStatusResponse;
import com.aliyuncs.sae.model.v20190506.DescribeJobStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobStatusResponseUnmarshaller {

	public static DescribeJobStatusResponse unmarshall(DescribeJobStatusResponse describeJobStatusResponse, UnmarshallerContext _ctx) {
		
		describeJobStatusResponse.setRequestId(_ctx.stringValue("DescribeJobStatusResponse.RequestId"));
		describeJobStatusResponse.setMessage(_ctx.stringValue("DescribeJobStatusResponse.Message"));
		describeJobStatusResponse.setTraceId(_ctx.stringValue("DescribeJobStatusResponse.TraceId"));
		describeJobStatusResponse.setErrorCode(_ctx.stringValue("DescribeJobStatusResponse.ErrorCode"));
		describeJobStatusResponse.setCode(_ctx.stringValue("DescribeJobStatusResponse.Code"));
		describeJobStatusResponse.setSuccess(_ctx.booleanValue("DescribeJobStatusResponse.Success"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("DescribeJobStatusResponse.Data.JobId"));
		data.setActive(_ctx.longValue("DescribeJobStatusResponse.Data.Active"));
		data.setSucceeded(_ctx.longValue("DescribeJobStatusResponse.Data.Succeeded"));
		data.setFailed(_ctx.longValue("DescribeJobStatusResponse.Data.Failed"));
		data.setStartTime(_ctx.longValue("DescribeJobStatusResponse.Data.StartTime"));
		data.setCompletionTime(_ctx.longValue("DescribeJobStatusResponse.Data.CompletionTime"));
		data.setMessage(_ctx.stringValue("DescribeJobStatusResponse.Data.Message"));
		data.setState(_ctx.stringValue("DescribeJobStatusResponse.Data.State"));
		describeJobStatusResponse.setData(data);
	 
	 	return describeJobStatusResponse;
	}
}