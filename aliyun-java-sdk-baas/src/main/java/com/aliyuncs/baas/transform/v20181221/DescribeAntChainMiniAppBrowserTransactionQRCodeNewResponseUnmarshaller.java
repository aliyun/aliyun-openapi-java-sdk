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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponseUnmarshaller {

	public static DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse unmarshall(DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse describeAntChainMiniAppBrowserTransactionQRCodeNewResponse, UnmarshallerContext _ctx) {
		
		describeAntChainMiniAppBrowserTransactionQRCodeNewResponse.setRequestId(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.RequestId"));
		describeAntChainMiniAppBrowserTransactionQRCodeNewResponse.setResultCode(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.ResultCode"));
		describeAntChainMiniAppBrowserTransactionQRCodeNewResponse.setResultMessage(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.ResultMessage"));
		describeAntChainMiniAppBrowserTransactionQRCodeNewResponse.setSuccess(_ctx.booleanValue("DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.Success"));
		describeAntChainMiniAppBrowserTransactionQRCodeNewResponse.setHttpStatusCode(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.HttpStatusCode"));
		describeAntChainMiniAppBrowserTransactionQRCodeNewResponse.setCode(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.Code"));
		describeAntChainMiniAppBrowserTransactionQRCodeNewResponse.setMessage(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.Message"));

		Result result = new Result();
		result.setAntChainId(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.Result.AntChainId"));
		result.setTransactionHash(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.Result.TransactionHash"));
		result.setBase64QRCodePNG(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.Result.Base64QRCodePNG"));
		result.setQRCodeContent(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse.Result.QRCodeContent"));
		describeAntChainMiniAppBrowserTransactionQRCodeNewResponse.setResult(result);
	 
	 	return describeAntChainMiniAppBrowserTransactionQRCodeNewResponse;
	}
}