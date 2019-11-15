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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.AddAccountResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.AddAccountResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddAccountResponseUnmarshaller {

	public static AddAccountResponse unmarshall(AddAccountResponse addAccountResponse, UnmarshallerContext _ctx) {
		
		addAccountResponse.setRequestId(_ctx.stringValue("AddAccountResponse.RequestId"));
		addAccountResponse.setRegionId(_ctx.stringValue("AddAccountResponse.RegionId"));

		Account account = new Account();
		account.setUserName(_ctx.stringValue("AddAccountResponse.Account.UserName"));
		account.setPassword(_ctx.stringValue("AddAccountResponse.Account.Password"));
		addAccountResponse.setAccount(account);
	 
	 	return addAccountResponse;
	}
}