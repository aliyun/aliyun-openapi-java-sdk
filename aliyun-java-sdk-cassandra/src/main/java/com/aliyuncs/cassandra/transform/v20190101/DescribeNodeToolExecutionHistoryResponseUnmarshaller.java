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

package com.aliyuncs.cassandra.transform.v20190101;

import com.aliyuncs.cassandra.model.v20190101.DescribeNodeToolExecutionHistoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNodeToolExecutionHistoryResponseUnmarshaller {

	public static DescribeNodeToolExecutionHistoryResponse unmarshall(DescribeNodeToolExecutionHistoryResponse describeNodeToolExecutionHistoryResponse, UnmarshallerContext _ctx) {
		
		describeNodeToolExecutionHistoryResponse.setRequestId(_ctx.stringValue("DescribeNodeToolExecutionHistoryResponse.RequestId"));
		describeNodeToolExecutionHistoryResponse.setJobId(_ctx.stringValue("DescribeNodeToolExecutionHistoryResponse.JobId"));
		describeNodeToolExecutionHistoryResponse.setCommand(_ctx.stringValue("DescribeNodeToolExecutionHistoryResponse.Command"));
		describeNodeToolExecutionHistoryResponse.setNodes(_ctx.stringValue("DescribeNodeToolExecutionHistoryResponse.Nodes"));
		describeNodeToolExecutionHistoryResponse.setModifyTime(_ctx.longValue("DescribeNodeToolExecutionHistoryResponse.ModifyTime"));
		describeNodeToolExecutionHistoryResponse.setCreateTime(_ctx.longValue("DescribeNodeToolExecutionHistoryResponse.CreateTime"));
		describeNodeToolExecutionHistoryResponse.setRegionId(_ctx.stringValue("DescribeNodeToolExecutionHistoryResponse.RegionId"));
		describeNodeToolExecutionHistoryResponse.setIsEnded(_ctx.booleanValue("DescribeNodeToolExecutionHistoryResponse.IsEnded"));
		describeNodeToolExecutionHistoryResponse.setArguments(_ctx.stringValue("DescribeNodeToolExecutionHistoryResponse.Arguments"));
		describeNodeToolExecutionHistoryResponse.setErrorMessage(_ctx.stringValue("DescribeNodeToolExecutionHistoryResponse.ErrorMessage"));
		describeNodeToolExecutionHistoryResponse.setDataCenterId(_ctx.stringValue("DescribeNodeToolExecutionHistoryResponse.DataCenterId"));
		describeNodeToolExecutionHistoryResponse.setResult(_ctx.stringValue("DescribeNodeToolExecutionHistoryResponse.Result"));
	 
	 	return describeNodeToolExecutionHistoryResponse;
	}
}