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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionResponse.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionResponse.Result.Transaction;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainTransactionResponseUnmarshaller {

	public static DescribeAntChainTransactionResponse unmarshall(DescribeAntChainTransactionResponse describeAntChainTransactionResponse, UnmarshallerContext _ctx) {
		
		describeAntChainTransactionResponse.setRequestId(_ctx.stringValue("DescribeAntChainTransactionResponse.RequestId"));

		Result result = new Result();
		result.setHash(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.Hash"));
		result.setCreateTime(_ctx.longValue("DescribeAntChainTransactionResponse.Result.CreateTime"));
		result.setBlockHeight(_ctx.longValue("DescribeAntChainTransactionResponse.Result.BlockHeight"));
		result.setBlockHash(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.BlockHash"));
		result.setBlockVersion(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.BlockVersion"));

		Transaction transaction = new Transaction();
		transaction.setTxType(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.Transaction.TxType"));
		transaction.setData(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.Transaction.Data"));
		transaction.setHash(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.Transaction.Hash"));
		transaction.setFrom(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.Transaction.From"));
		transaction.setTo(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.Transaction.To"));
		transaction.setTimestamp(_ctx.longValue("DescribeAntChainTransactionResponse.Result.Transaction.Timestamp"));
		transaction.setPeriod(_ctx.longValue("DescribeAntChainTransactionResponse.Result.Transaction.Period"));
		transaction.setNonce(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.Transaction.Nonce"));
		transaction.setGas(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.Transaction.Gas"));
		transaction.setValue(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.Transaction.Value"));

		List<String> signatures = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainTransactionResponse.Result.Transaction.Signatures.Length"); i++) {
			signatures.add(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.Transaction.Signatures["+ i +"]"));
		}
		transaction.setSignatures(signatures);

		List<String> extentions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainTransactionResponse.Result.Transaction.Extentions.Length"); i++) {
			extentions.add(_ctx.stringValue("DescribeAntChainTransactionResponse.Result.Transaction.Extentions["+ i +"]"));
		}
		transaction.setExtentions(extentions);
		result.setTransaction(transaction);
		describeAntChainTransactionResponse.setResult(result);
	 
	 	return describeAntChainTransactionResponse;
	}
}