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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionReceiptResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionReceiptResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainTransactionReceiptResponseUnmarshaller {

	public static DescribeAntChainTransactionReceiptResponse unmarshall(DescribeAntChainTransactionReceiptResponse describeAntChainTransactionReceiptResponse, UnmarshallerContext _ctx) {
		
		describeAntChainTransactionReceiptResponse.setRequestId(_ctx.stringValue("DescribeAntChainTransactionReceiptResponse.RequestId"));

		Result result = new Result();
		result.setData(_ctx.stringValue("DescribeAntChainTransactionReceiptResponse.Result.Data"));
		result.setGasUsed(_ctx.stringValue("DescribeAntChainTransactionReceiptResponse.Result.GasUsed"));
		result.setResult(_ctx.longValue("DescribeAntChainTransactionReceiptResponse.Result.Result"));

		List<String> logs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainTransactionReceiptResponse.Result.Logs.Length"); i++) {
			logs.add(_ctx.stringValue("DescribeAntChainTransactionReceiptResponse.Result.Logs["+ i +"]"));
		}
		result.setLogs(logs);
		describeAntChainTransactionReceiptResponse.setResult(result);
	 
	 	return describeAntChainTransactionReceiptResponse;
	}
}