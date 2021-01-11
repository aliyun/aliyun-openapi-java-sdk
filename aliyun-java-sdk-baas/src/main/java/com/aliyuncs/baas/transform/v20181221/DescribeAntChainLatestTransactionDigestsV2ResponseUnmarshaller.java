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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeAntChainLatestTransactionDigestsV2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainLatestTransactionDigestsV2ResponseUnmarshaller {

	public static DescribeAntChainLatestTransactionDigestsV2Response unmarshall(DescribeAntChainLatestTransactionDigestsV2Response describeAntChainLatestTransactionDigestsV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainLatestTransactionDigestsV2Response.setRequestId(_ctx.stringValue("DescribeAntChainLatestTransactionDigestsV2Response.RequestId"));
		describeAntChainLatestTransactionDigestsV2Response.setResultCode(_ctx.stringValue("DescribeAntChainLatestTransactionDigestsV2Response.ResultCode"));
		describeAntChainLatestTransactionDigestsV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainLatestTransactionDigestsV2Response.ResultMessage"));
		describeAntChainLatestTransactionDigestsV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainLatestTransactionDigestsV2Response.Success"));
		describeAntChainLatestTransactionDigestsV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainLatestTransactionDigestsV2Response.HttpStatusCode"));
		describeAntChainLatestTransactionDigestsV2Response.setCode(_ctx.stringValue("DescribeAntChainLatestTransactionDigestsV2Response.Code"));
		describeAntChainLatestTransactionDigestsV2Response.setMessage(_ctx.stringValue("DescribeAntChainLatestTransactionDigestsV2Response.Message"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainLatestTransactionDigestsV2Response.Result.Length"); i++) {
			result.add(_ctx.stringValue("DescribeAntChainLatestTransactionDigestsV2Response.Result["+ i +"]"));
		}
		describeAntChainLatestTransactionDigestsV2Response.setResult(result);
	 
	 	return describeAntChainLatestTransactionDigestsV2Response;
	}
}