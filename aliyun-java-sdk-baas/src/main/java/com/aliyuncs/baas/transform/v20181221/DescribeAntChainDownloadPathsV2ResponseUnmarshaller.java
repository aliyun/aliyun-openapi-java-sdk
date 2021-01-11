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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainDownloadPathsV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainDownloadPathsV2Response.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainDownloadPathsV2ResponseUnmarshaller {

	public static DescribeAntChainDownloadPathsV2Response unmarshall(DescribeAntChainDownloadPathsV2Response describeAntChainDownloadPathsV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainDownloadPathsV2Response.setRequestId(_ctx.stringValue("DescribeAntChainDownloadPathsV2Response.RequestId"));
		describeAntChainDownloadPathsV2Response.setResultCode(_ctx.stringValue("DescribeAntChainDownloadPathsV2Response.ResultCode"));
		describeAntChainDownloadPathsV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainDownloadPathsV2Response.ResultMessage"));
		describeAntChainDownloadPathsV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainDownloadPathsV2Response.Success"));
		describeAntChainDownloadPathsV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainDownloadPathsV2Response.HttpStatusCode"));
		describeAntChainDownloadPathsV2Response.setCode(_ctx.stringValue("DescribeAntChainDownloadPathsV2Response.Code"));
		describeAntChainDownloadPathsV2Response.setMessage(_ctx.stringValue("DescribeAntChainDownloadPathsV2Response.Message"));

		Result result = new Result();
		result.setCaCrtUrl(_ctx.stringValue("DescribeAntChainDownloadPathsV2Response.Result.CaCrtUrl"));
		result.setTrustCaUrl(_ctx.stringValue("DescribeAntChainDownloadPathsV2Response.Result.TrustCaUrl"));
		result.setClientCrtUrl(_ctx.stringValue("DescribeAntChainDownloadPathsV2Response.Result.ClientCrtUrl"));
		result.setSdkUrl(_ctx.stringValue("DescribeAntChainDownloadPathsV2Response.Result.SdkUrl"));
		describeAntChainDownloadPathsV2Response.setResult(result);
	 
	 	return describeAntChainDownloadPathsV2Response;
	}
}