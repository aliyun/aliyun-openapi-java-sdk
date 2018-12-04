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

package com.aliyuncs.baas.transform.v20180731;

import com.aliyuncs.baas.model.v20180731.QueryTransactionResponse;
import com.aliyuncs.baas.model.v20180731.QueryTransactionResponse.Result;
import com.aliyuncs.baas.model.v20180731.QueryTransactionResponse.Result.ReferenceList;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTransactionResponseUnmarshaller {

	public static QueryTransactionResponse unmarshall(QueryTransactionResponse queryTransactionResponse, UnmarshallerContext context) {
		
		queryTransactionResponse.setRequestId(context.stringValue("QueryTransactionResponse.RequestId"));

		Result result = new Result();
		result.setHash(context.stringValue("QueryTransactionResponse.Result.Hash"));
		result.setBlockHeight(context.longValue("QueryTransactionResponse.Result.BlockHeight"));
		result.setBlockVersion(context.integerValue("QueryTransactionResponse.Result.BlockVersion"));
		result.setCreateTime(context.longValue("QueryTransactionResponse.Result.CreateTime"));
		result.setCategory(context.integerValue("QueryTransactionResponse.Result.Category"));
		result.setType(context.integerValue("QueryTransactionResponse.Result.Type"));
		result.setReferenceCount(context.integerValue("QueryTransactionResponse.Result.ReferenceCount"));
		result.setContent(context.stringValue("QueryTransactionResponse.Result.Content"));
		result.setContentHash(context.stringValue("QueryTransactionResponse.Result.ContentHash"));
		result.setKeyWrap(context.stringValue("QueryTransactionResponse.Result.KeyWrap"));
		result.setNonce(context.stringValue("QueryTransactionResponse.Result.Nonce"));
		result.setKeyName(context.stringValue("QueryTransactionResponse.Result.KeyName"));

		ReferenceList referenceList = new ReferenceList();
		referenceList.setType(context.integerValue("QueryTransactionResponse.Result.ReferenceList.Type"));
		referenceList.setLength(context.integerValue("QueryTransactionResponse.Result.ReferenceList.Length"));
		referenceList.setData(context.stringValue("QueryTransactionResponse.Result.ReferenceList.Data"));
		result.setReferenceList(referenceList);
		queryTransactionResponse.setResult(result);
	 
	 	return queryTransactionResponse;
	}
}