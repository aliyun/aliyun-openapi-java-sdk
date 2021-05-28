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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayCapacityLimitResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayCapacityLimitResponseUnmarshaller {

	public static DescribeGatewayCapacityLimitResponse unmarshall(DescribeGatewayCapacityLimitResponse describeGatewayCapacityLimitResponse, UnmarshallerContext _ctx) {
		
		describeGatewayCapacityLimitResponse.setRequestId(_ctx.stringValue("DescribeGatewayCapacityLimitResponse.RequestId"));
		describeGatewayCapacityLimitResponse.setFileSystemSizeInTB(_ctx.longValue("DescribeGatewayCapacityLimitResponse.FileSystemSizeInTB"));
		describeGatewayCapacityLimitResponse.setMessage(_ctx.stringValue("DescribeGatewayCapacityLimitResponse.Message"));
		describeGatewayCapacityLimitResponse.setIsMetadataSeparate(_ctx.booleanValue("DescribeGatewayCapacityLimitResponse.IsMetadataSeparate"));
		describeGatewayCapacityLimitResponse.setFileNumber(_ctx.longValue("DescribeGatewayCapacityLimitResponse.FileNumber"));
		describeGatewayCapacityLimitResponse.setCode(_ctx.stringValue("DescribeGatewayCapacityLimitResponse.Code"));
		describeGatewayCapacityLimitResponse.setSuccess(_ctx.booleanValue("DescribeGatewayCapacityLimitResponse.Success"));
	 
	 	return describeGatewayCapacityLimitResponse;
	}
}