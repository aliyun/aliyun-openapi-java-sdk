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

import com.aliyuncs.sgw.model.v20180511.DescribeAccountConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountConfigResponseUnmarshaller {

	public static DescribeAccountConfigResponse unmarshall(DescribeAccountConfigResponse describeAccountConfigResponse, UnmarshallerContext _ctx) {
		
		describeAccountConfigResponse.setRequestId(_ctx.stringValue("DescribeAccountConfigResponse.RequestId"));
		describeAccountConfigResponse.setSuccess(_ctx.booleanValue("DescribeAccountConfigResponse.Success"));
		describeAccountConfigResponse.setCode(_ctx.stringValue("DescribeAccountConfigResponse.Code"));
		describeAccountConfigResponse.setMessage(_ctx.stringValue("DescribeAccountConfigResponse.Message"));
		describeAccountConfigResponse.setIsSupportServerSideEncryption(_ctx.booleanValue("DescribeAccountConfigResponse.IsSupportServerSideEncryption"));
		describeAccountConfigResponse.setIsSupportClientSideEncryption(_ctx.booleanValue("DescribeAccountConfigResponse.IsSupportClientSideEncryption"));
		describeAccountConfigResponse.setIsSupportGatewayLogging(_ctx.booleanValue("DescribeAccountConfigResponse.IsSupportGatewayLogging"));
		describeAccountConfigResponse.setIsSupportElasticGatewayBeta(_ctx.booleanValue("DescribeAccountConfigResponse.IsSupportElasticGatewayBeta"));
	 
	 	return describeAccountConfigResponse;
	}
}