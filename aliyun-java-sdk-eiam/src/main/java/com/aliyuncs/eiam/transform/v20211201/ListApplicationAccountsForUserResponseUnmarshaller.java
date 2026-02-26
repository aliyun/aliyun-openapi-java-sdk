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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListApplicationAccountsForUserResponse;
import com.aliyuncs.eiam.model.v20211201.ListApplicationAccountsForUserResponse.ApplicationAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationAccountsForUserResponseUnmarshaller {

	public static ListApplicationAccountsForUserResponse unmarshall(ListApplicationAccountsForUserResponse listApplicationAccountsForUserResponse, UnmarshallerContext _ctx) {
		
		listApplicationAccountsForUserResponse.setRequestId(_ctx.stringValue("ListApplicationAccountsForUserResponse.RequestId"));
		listApplicationAccountsForUserResponse.setTotalCount(_ctx.longValue("ListApplicationAccountsForUserResponse.TotalCount"));

		List<ApplicationAccount> applicationAccounts = new ArrayList<ApplicationAccount>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationAccountsForUserResponse.ApplicationAccounts.Length"); i++) {
			ApplicationAccount applicationAccount = new ApplicationAccount();
			applicationAccount.setInstanceId(_ctx.stringValue("ListApplicationAccountsForUserResponse.ApplicationAccounts["+ i +"].InstanceId"));
			applicationAccount.setApplicationId(_ctx.stringValue("ListApplicationAccountsForUserResponse.ApplicationAccounts["+ i +"].ApplicationId"));
			applicationAccount.setApplicationAccountId(_ctx.stringValue("ListApplicationAccountsForUserResponse.ApplicationAccounts["+ i +"].ApplicationAccountId"));
			applicationAccount.setUserId(_ctx.stringValue("ListApplicationAccountsForUserResponse.ApplicationAccounts["+ i +"].UserId"));
			applicationAccount.setApplicationUsername(_ctx.stringValue("ListApplicationAccountsForUserResponse.ApplicationAccounts["+ i +"].ApplicationUsername"));
			applicationAccount.setCreateTime(_ctx.longValue("ListApplicationAccountsForUserResponse.ApplicationAccounts["+ i +"].CreateTime"));

			applicationAccounts.add(applicationAccount);
		}
		listApplicationAccountsForUserResponse.setApplicationAccounts(applicationAccounts);
	 
	 	return listApplicationAccountsForUserResponse;
	}
}