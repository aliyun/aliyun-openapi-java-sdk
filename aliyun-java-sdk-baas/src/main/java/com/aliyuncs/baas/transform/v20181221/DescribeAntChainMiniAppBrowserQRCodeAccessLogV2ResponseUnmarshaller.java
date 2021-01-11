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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainMiniAppBrowserQRCodeAccessLogV2ResponseUnmarshaller {

	public static DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response unmarshall(DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response describeAntChainMiniAppBrowserQRCodeAccessLogV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainMiniAppBrowserQRCodeAccessLogV2Response.setRequestId(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response.RequestId"));
		describeAntChainMiniAppBrowserQRCodeAccessLogV2Response.setResultCode(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response.ResultCode"));
		describeAntChainMiniAppBrowserQRCodeAccessLogV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response.ResultMessage"));
		describeAntChainMiniAppBrowserQRCodeAccessLogV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response.Success"));
		describeAntChainMiniAppBrowserQRCodeAccessLogV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response.HttpStatusCode"));
		describeAntChainMiniAppBrowserQRCodeAccessLogV2Response.setCode(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response.Code"));
		describeAntChainMiniAppBrowserQRCodeAccessLogV2Response.setMessage(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response.Message"));

		Result result = new Result();
		result.setAccessCount(_ctx.longValue("DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response.Result.AccessCount"));
		result.setAccessAlipayAccountCount(_ctx.longValue("DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response.Result.AccessAlipayAccountCount"));
		describeAntChainMiniAppBrowserQRCodeAccessLogV2Response.setResult(result);
	 
	 	return describeAntChainMiniAppBrowserQRCodeAccessLogV2Response;
	}
}