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

import com.aliyuncs.baas.model.v20180731.QueryBlockResponse;
import com.aliyuncs.baas.model.v20180731.QueryBlockResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBlockResponseUnmarshaller {

	public static QueryBlockResponse unmarshall(QueryBlockResponse queryBlockResponse, UnmarshallerContext context) {
		
		queryBlockResponse.setRequestId(context.stringValue("QueryBlockResponse.RequestId"));

		Result result = new Result();
		result.setAlias(context.stringValue("QueryBlockResponse.Result.Alias"));
		result.setBlockHash(context.stringValue("QueryBlockResponse.Result.BlockHash"));
		result.setRootTxHash(context.stringValue("QueryBlockResponse.Result.RootTxHash"));
		result.setHeight(context.integerValue("QueryBlockResponse.Result.Height"));
		result.setPreviousHash(context.stringValue("QueryBlockResponse.Result.PreviousHash"));
		result.setCreateTime(context.longValue("QueryBlockResponse.Result.CreateTime"));
		result.setTransactionSize(context.integerValue("QueryBlockResponse.Result.TransactionSize"));
		result.setTransSummaryList(context.stringValue("QueryBlockResponse.Result.TransSummaryList"));
		queryBlockResponse.setResult(result);
	 
	 	return queryBlockResponse;
	}
}