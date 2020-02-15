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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseUnmarshaller {

	public static DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse unmarshall(DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse describeAntChainMiniAppBrowserQRCodeAccessLogResponse, UnmarshallerContext _ctx) {
		
		describeAntChainMiniAppBrowserQRCodeAccessLogResponse.setRequestId(_ctx.stringValue("DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse.RequestId"));

		Result result = new Result();
		result.setAccessAlipayAccountCount(_ctx.longValue("DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse.Result.AccessAlipayAccountCount"));
		result.setAccessCount(_ctx.longValue("DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse.Result.AccessCount"));
		describeAntChainMiniAppBrowserQRCodeAccessLogResponse.setResult(result);
	 
	 	return describeAntChainMiniAppBrowserQRCodeAccessLogResponse;
	}
}