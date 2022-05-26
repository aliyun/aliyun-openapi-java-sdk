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

package com.aliyuncs.account_crm.transform.v20160606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.account_crm.model.v20160606.BatchQueryAgAccountResponse;
import com.aliyuncs.account_crm.model.v20160606.BatchQueryAgAccountResponse.AgAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchQueryAgAccountResponseUnmarshaller {

	public static BatchQueryAgAccountResponse unmarshall(BatchQueryAgAccountResponse batchQueryAgAccountResponse, UnmarshallerContext _ctx) {
		
		batchQueryAgAccountResponse.setRequestId(_ctx.stringValue("BatchQueryAgAccountResponse.RequestId"));
		batchQueryAgAccountResponse.setCode(_ctx.stringValue("BatchQueryAgAccountResponse.Code"));
		batchQueryAgAccountResponse.setMessage(_ctx.stringValue("BatchQueryAgAccountResponse.Message"));
		batchQueryAgAccountResponse.setSuccess(_ctx.booleanValue("BatchQueryAgAccountResponse.Success"));

		List<AgAccount> agAccounts = new ArrayList<AgAccount>();
		for (int i = 0; i < _ctx.lengthValue("BatchQueryAgAccountResponse.AgAccounts.Length"); i++) {
			AgAccount agAccount = new AgAccount();
			agAccount.setLoginEmail(_ctx.stringValue("BatchQueryAgAccountResponse.AgAccounts["+ i +"].LoginEmail"));
			agAccount.setPk(_ctx.stringValue("BatchQueryAgAccountResponse.AgAccounts["+ i +"].Pk"));

			agAccounts.add(agAccount);
		}
		batchQueryAgAccountResponse.setAgAccounts(agAccounts);
	 
	 	return batchQueryAgAccountResponse;
	}
}