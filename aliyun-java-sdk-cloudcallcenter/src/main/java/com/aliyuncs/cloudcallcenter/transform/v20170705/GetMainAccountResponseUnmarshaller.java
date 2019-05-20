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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetMainAccountResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetMainAccountResponse.TaobaoAliyunAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMainAccountResponseUnmarshaller {

	public static GetMainAccountResponse unmarshall(GetMainAccountResponse getMainAccountResponse, UnmarshallerContext context) {
		
		getMainAccountResponse.setRequestId(context.stringValue("GetMainAccountResponse.RequestId"));
		getMainAccountResponse.setSuccess(context.booleanValue("GetMainAccountResponse.Success"));
		getMainAccountResponse.setCode(context.stringValue("GetMainAccountResponse.Code"));
		getMainAccountResponse.setMessage(context.stringValue("GetMainAccountResponse.Message"));
		getMainAccountResponse.setHttpStatusCode(context.integerValue("GetMainAccountResponse.HttpStatusCode"));

		List<TaobaoAliyunAccount> accounts = new ArrayList<TaobaoAliyunAccount>();
		for (int i = 0; i < context.lengthValue("GetMainAccountResponse.Accounts.Length"); i++) {
			TaobaoAliyunAccount taobaoAliyunAccount = new TaobaoAliyunAccount();
			taobaoAliyunAccount.setAliyunPk(context.longValue("GetMainAccountResponse.Accounts["+ i +"].aliyunPk"));
			taobaoAliyunAccount.setTaobaoUid(context.longValue("GetMainAccountResponse.Accounts["+ i +"].taobaoUid"));
			taobaoAliyunAccount.setTaobaoNick(context.stringValue("GetMainAccountResponse.Accounts["+ i +"].taobaoNick"));
			taobaoAliyunAccount.setStatus(context.integerValue("GetMainAccountResponse.Accounts["+ i +"].status"));
			taobaoAliyunAccount.setType(context.integerValue("GetMainAccountResponse.Accounts["+ i +"].type"));
			taobaoAliyunAccount.setStatusModified(context.longValue("GetMainAccountResponse.Accounts["+ i +"].statusModified"));

			accounts.add(taobaoAliyunAccount);
		}
		getMainAccountResponse.setAccounts(accounts);
	 
	 	return getMainAccountResponse;
	}
}