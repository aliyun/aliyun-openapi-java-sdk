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

package com.aliyuncs.ehpc.transform.v20180412;

import com.aliyuncs.ehpc.model.v20180412.DescribeNFSClientStatusResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribeNFSClientStatusResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNFSClientStatusResponseUnmarshaller {

	public static DescribeNFSClientStatusResponse unmarshall(DescribeNFSClientStatusResponse describeNFSClientStatusResponse, UnmarshallerContext _ctx) {
		
		describeNFSClientStatusResponse.setRequestId(_ctx.stringValue("DescribeNFSClientStatusResponse.RequestId"));
		describeNFSClientStatusResponse.setStatus(_ctx.stringValue("DescribeNFSClientStatusResponse.Status"));

		Result result = new Result();
		result.setInvokeRecordStatus(_ctx.stringValue("DescribeNFSClientStatusResponse.Result.InvokeRecordStatus"));
		result.setExitCode(_ctx.integerValue("DescribeNFSClientStatusResponse.Result.ExitCode"));
		result.setOutput(_ctx.stringValue("DescribeNFSClientStatusResponse.Result.Output"));
		describeNFSClientStatusResponse.setResult(result);
	 
	 	return describeNFSClientStatusResponse;
	}
}