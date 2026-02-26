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

package com.aliyuncs.rds_data.transform.v20220330;

import com.aliyuncs.rds_data.model.v20220330.CommitTransactionResponse;
import com.aliyuncs.rds_data.model.v20220330.CommitTransactionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CommitTransactionResponseUnmarshaller {

	public static CommitTransactionResponse unmarshall(CommitTransactionResponse commitTransactionResponse, UnmarshallerContext _ctx) {
		
		commitTransactionResponse.setRequestId(_ctx.stringValue("CommitTransactionResponse.RequestId"));
		commitTransactionResponse.setSuccess(_ctx.booleanValue("CommitTransactionResponse.Success"));
		commitTransactionResponse.setCode(_ctx.stringValue("CommitTransactionResponse.Code"));
		commitTransactionResponse.setMessage(_ctx.stringValue("CommitTransactionResponse.Message"));

		Data data = new Data();
		data.setTransactionStatus(_ctx.stringValue("CommitTransactionResponse.Data.TransactionStatus"));
		commitTransactionResponse.setData(data);
	 
	 	return commitTransactionResponse;
	}
}