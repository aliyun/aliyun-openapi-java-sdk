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

package com.aliyuncs.baas.transform.v20181221;

import com.aliyuncs.baas.model.v20181221.DescribeAntChainQRCodeAuthorizationV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainQRCodeAuthorizationV2Response.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainQRCodeAuthorizationV2ResponseUnmarshaller {

	public static DescribeAntChainQRCodeAuthorizationV2Response unmarshall(DescribeAntChainQRCodeAuthorizationV2Response describeAntChainQRCodeAuthorizationV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainQRCodeAuthorizationV2Response.setRequestId(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationV2Response.RequestId"));
		describeAntChainQRCodeAuthorizationV2Response.setResultCode(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationV2Response.ResultCode"));
		describeAntChainQRCodeAuthorizationV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationV2Response.ResultMessage"));
		describeAntChainQRCodeAuthorizationV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainQRCodeAuthorizationV2Response.Success"));
		describeAntChainQRCodeAuthorizationV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationV2Response.HttpStatusCode"));
		describeAntChainQRCodeAuthorizationV2Response.setCode(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationV2Response.Code"));
		describeAntChainQRCodeAuthorizationV2Response.setMessage(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationV2Response.Message"));

		Result result = new Result();
		result.setAntChainId(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationV2Response.Result.AntChainId"));
		result.setQRCodeType(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationV2Response.Result.QRCodeType"));
		result.setAuthorizationType(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationV2Response.Result.AuthorizationType"));
		describeAntChainQRCodeAuthorizationV2Response.setResult(result);
	 
	 	return describeAntChainQRCodeAuthorizationV2Response;
	}
}