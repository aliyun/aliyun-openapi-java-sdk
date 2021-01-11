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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionV2Response.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionV2Response.Result.Transaction;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainTransactionV2ResponseUnmarshaller {

	public static DescribeAntChainTransactionV2Response unmarshall(DescribeAntChainTransactionV2Response describeAntChainTransactionV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainTransactionV2Response.setRequestId(_ctx.stringValue("DescribeAntChainTransactionV2Response.RequestId"));
		describeAntChainTransactionV2Response.setResultCode(_ctx.stringValue("DescribeAntChainTransactionV2Response.ResultCode"));
		describeAntChainTransactionV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainTransactionV2Response.ResultMessage"));
		describeAntChainTransactionV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainTransactionV2Response.Success"));
		describeAntChainTransactionV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainTransactionV2Response.HttpStatusCode"));
		describeAntChainTransactionV2Response.setCode(_ctx.stringValue("DescribeAntChainTransactionV2Response.Code"));
		describeAntChainTransactionV2Response.setMessage(_ctx.stringValue("DescribeAntChainTransactionV2Response.Message"));

		Result result = new Result();
		result.setHash(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.Hash"));
		result.setCreateTime(_ctx.longValue("DescribeAntChainTransactionV2Response.Result.CreateTime"));
		result.setBlockHeight(_ctx.longValue("DescribeAntChainTransactionV2Response.Result.BlockHeight"));
		result.setBlockHash(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.BlockHash"));
		result.setBlockVersion(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.BlockVersion"));

		Transaction transaction = new Transaction();
		transaction.setTxType(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.Transaction.TxType"));
		transaction.setData(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.Transaction.Data"));
		transaction.setHash(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.Transaction.Hash"));
		transaction.setFrom(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.Transaction.From"));
		transaction.setTo(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.Transaction.To"));
		transaction.setTimestamp(_ctx.longValue("DescribeAntChainTransactionV2Response.Result.Transaction.Timestamp"));
		transaction.setPeriod(_ctx.longValue("DescribeAntChainTransactionV2Response.Result.Transaction.Period"));
		transaction.setNonce(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.Transaction.Nonce"));
		transaction.setGas(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.Transaction.Gas"));
		transaction.setValue(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.Transaction.Value"));

		List<String> signatures = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainTransactionV2Response.Result.Transaction.Signatures.Length"); i++) {
			signatures.add(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.Transaction.Signatures["+ i +"]"));
		}
		transaction.setSignatures(signatures);

		List<String> extentions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainTransactionV2Response.Result.Transaction.Extentions.Length"); i++) {
			extentions.add(_ctx.stringValue("DescribeAntChainTransactionV2Response.Result.Transaction.Extentions["+ i +"]"));
		}
		transaction.setExtentions(extentions);
		result.setTransaction(transaction);
		describeAntChainTransactionV2Response.setResult(result);
	 
	 	return describeAntChainTransactionV2Response;
	}
}