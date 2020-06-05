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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayLoggingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayLoggingResponseUnmarshaller {

	public static DescribeGatewayLoggingResponse unmarshall(DescribeGatewayLoggingResponse describeGatewayLoggingResponse, UnmarshallerContext _ctx) {
		
		describeGatewayLoggingResponse.setRequestId(_ctx.stringValue("DescribeGatewayLoggingResponse.RequestId"));
		describeGatewayLoggingResponse.setSuccess(_ctx.booleanValue("DescribeGatewayLoggingResponse.Success"));
		describeGatewayLoggingResponse.setCode(_ctx.stringValue("DescribeGatewayLoggingResponse.Code"));
		describeGatewayLoggingResponse.setMessage(_ctx.stringValue("DescribeGatewayLoggingResponse.Message"));
		describeGatewayLoggingResponse.setGatewayLoggingStatus(_ctx.stringValue("DescribeGatewayLoggingResponse.GatewayLoggingStatus"));
		describeGatewayLoggingResponse.setSlsProject(_ctx.stringValue("DescribeGatewayLoggingResponse.SlsProject"));
		describeGatewayLoggingResponse.setSlsLogstore(_ctx.stringValue("DescribeGatewayLoggingResponse.SlsLogstore"));
	 
	 	return describeGatewayLoggingResponse;
	}
}