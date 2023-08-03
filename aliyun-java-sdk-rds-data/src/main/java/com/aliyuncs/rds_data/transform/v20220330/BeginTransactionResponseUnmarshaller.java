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

import com.aliyuncs.rds_data.model.v20220330.BeginTransactionResponse;
import com.aliyuncs.rds_data.model.v20220330.BeginTransactionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BeginTransactionResponseUnmarshaller {

	public static BeginTransactionResponse unmarshall(BeginTransactionResponse beginTransactionResponse, UnmarshallerContext _ctx) {
		
		beginTransactionResponse.setRequestId(_ctx.stringValue("BeginTransactionResponse.RequestId"));
		beginTransactionResponse.setSuccess(_ctx.booleanValue("BeginTransactionResponse.Success"));
		beginTransactionResponse.setCode(_ctx.stringValue("BeginTransactionResponse.Code"));
		beginTransactionResponse.setMessage(_ctx.stringValue("BeginTransactionResponse.Message"));

		Data data = new Data();
		data.setTransactionId(_ctx.stringValue("BeginTransactionResponse.Data.TransactionId"));
		beginTransactionResponse.setData(data);
	 
	 	return beginTransactionResponse;
	}
}