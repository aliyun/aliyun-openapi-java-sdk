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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainQRCodeAuthorizationResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainQRCodeAuthorizationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainQRCodeAuthorizationResponseUnmarshaller {

	public static DescribeAntChainQRCodeAuthorizationResponse unmarshall(DescribeAntChainQRCodeAuthorizationResponse describeAntChainQRCodeAuthorizationResponse, UnmarshallerContext _ctx) {
		
		describeAntChainQRCodeAuthorizationResponse.setRequestId(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationResponse.RequestId"));

		Result result = new Result();
		result.setAntChainId(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationResponse.Result.AntChainId"));
		result.setAuthorizationType(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationResponse.Result.AuthorizationType"));
		result.setQRCodeType(_ctx.stringValue("DescribeAntChainQRCodeAuthorizationResponse.Result.QRCodeType"));
		describeAntChainQRCodeAuthorizationResponse.setResult(result);
	 
	 	return describeAntChainQRCodeAuthorizationResponse;
	}
}