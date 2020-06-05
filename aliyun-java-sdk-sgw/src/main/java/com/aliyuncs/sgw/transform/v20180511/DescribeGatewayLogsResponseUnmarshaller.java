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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayLogsResponseUnmarshaller {

	public static DescribeGatewayLogsResponse unmarshall(DescribeGatewayLogsResponse describeGatewayLogsResponse, UnmarshallerContext _ctx) {
		
		describeGatewayLogsResponse.setRequestId(_ctx.stringValue("DescribeGatewayLogsResponse.RequestId"));
		describeGatewayLogsResponse.setSuccess(_ctx.booleanValue("DescribeGatewayLogsResponse.Success"));
		describeGatewayLogsResponse.setCode(_ctx.stringValue("DescribeGatewayLogsResponse.Code"));
		describeGatewayLogsResponse.setMessage(_ctx.stringValue("DescribeGatewayLogsResponse.Message"));
		describeGatewayLogsResponse.setLogFilePaths(_ctx.stringValue("DescribeGatewayLogsResponse.LogFilePaths"));
	 
	 	return describeGatewayLogsResponse;
	}
}