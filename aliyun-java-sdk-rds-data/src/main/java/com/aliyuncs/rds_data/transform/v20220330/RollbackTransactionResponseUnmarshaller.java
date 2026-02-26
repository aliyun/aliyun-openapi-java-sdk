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

import com.aliyuncs.rds_data.model.v20220330.RollbackTransactionResponse;
import com.aliyuncs.rds_data.model.v20220330.RollbackTransactionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RollbackTransactionResponseUnmarshaller {

	public static RollbackTransactionResponse unmarshall(RollbackTransactionResponse rollbackTransactionResponse, UnmarshallerContext _ctx) {
		
		rollbackTransactionResponse.setRequestId(_ctx.stringValue("RollbackTransactionResponse.RequestId"));
		rollbackTransactionResponse.setSuccess(_ctx.booleanValue("RollbackTransactionResponse.Success"));
		rollbackTransactionResponse.setCode(_ctx.stringValue("RollbackTransactionResponse.Code"));
		rollbackTransactionResponse.setMessage(_ctx.stringValue("RollbackTransactionResponse.Message"));

		Data data = new Data();
		data.setTransactionStatus(_ctx.stringValue("RollbackTransactionResponse.Data.TransactionStatus"));
		rollbackTransactionResponse.setData(data);
	 
	 	return rollbackTransactionResponse;
	}
}