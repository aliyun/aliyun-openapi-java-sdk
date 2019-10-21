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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainDownloadPathsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainDownloadPathsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainDownloadPathsResponseUnmarshaller {

	public static DescribeAntChainDownloadPathsResponse unmarshall(DescribeAntChainDownloadPathsResponse describeAntChainDownloadPathsResponse, UnmarshallerContext _ctx) {
		
		describeAntChainDownloadPathsResponse.setRequestId(_ctx.stringValue("DescribeAntChainDownloadPathsResponse.RequestId"));

		Result result = new Result();
		result.setCaCrtUrl(_ctx.stringValue("DescribeAntChainDownloadPathsResponse.Result.CaCrtUrl"));
		result.setTrustCaUrl(_ctx.stringValue("DescribeAntChainDownloadPathsResponse.Result.TrustCaUrl"));
		result.setClientCrtUrl(_ctx.stringValue("DescribeAntChainDownloadPathsResponse.Result.ClientCrtUrl"));
		result.setSdkUrl(_ctx.stringValue("DescribeAntChainDownloadPathsResponse.Result.SdkUrl"));
		describeAntChainDownloadPathsResponse.setResult(result);
	 
	 	return describeAntChainDownloadPathsResponse;
	}
}