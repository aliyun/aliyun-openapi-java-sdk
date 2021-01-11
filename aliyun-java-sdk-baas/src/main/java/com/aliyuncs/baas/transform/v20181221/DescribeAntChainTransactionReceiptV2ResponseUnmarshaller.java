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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionReceiptV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionReceiptV2Response.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainTransactionReceiptV2ResponseUnmarshaller {

	public static DescribeAntChainTransactionReceiptV2Response unmarshall(DescribeAntChainTransactionReceiptV2Response describeAntChainTransactionReceiptV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainTransactionReceiptV2Response.setRequestId(_ctx.stringValue("DescribeAntChainTransactionReceiptV2Response.RequestId"));
		describeAntChainTransactionReceiptV2Response.setResultCode(_ctx.stringValue("DescribeAntChainTransactionReceiptV2Response.ResultCode"));
		describeAntChainTransactionReceiptV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainTransactionReceiptV2Response.ResultMessage"));
		describeAntChainTransactionReceiptV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainTransactionReceiptV2Response.Success"));
		describeAntChainTransactionReceiptV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainTransactionReceiptV2Response.HttpStatusCode"));
		describeAntChainTransactionReceiptV2Response.setCode(_ctx.stringValue("DescribeAntChainTransactionReceiptV2Response.Code"));
		describeAntChainTransactionReceiptV2Response.setMessage(_ctx.stringValue("DescribeAntChainTransactionReceiptV2Response.Message"));

		Result result = new Result();
		result.setData(_ctx.stringValue("DescribeAntChainTransactionReceiptV2Response.Result.Data"));
		result.setGasUsed(_ctx.stringValue("DescribeAntChainTransactionReceiptV2Response.Result.GasUsed"));
		result.setResult(_ctx.longValue("DescribeAntChainTransactionReceiptV2Response.Result.Result"));

		List<String> logs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainTransactionReceiptV2Response.Result.Logs.Length"); i++) {
			logs.add(_ctx.stringValue("DescribeAntChainTransactionReceiptV2Response.Result.Logs["+ i +"]"));
		}
		result.setLogs(logs);
		describeAntChainTransactionReceiptV2Response.setResult(result);
	 
	 	return describeAntChainTransactionReceiptV2Response;
	}
}