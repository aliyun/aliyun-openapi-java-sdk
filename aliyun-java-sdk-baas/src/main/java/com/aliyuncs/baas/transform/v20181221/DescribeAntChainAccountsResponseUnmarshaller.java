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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainAccountsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainAccountsResponse.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainAccountsResponse.Result.AccountsItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainAccountsResponse.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainAccountsResponseUnmarshaller {

	public static DescribeAntChainAccountsResponse unmarshall(DescribeAntChainAccountsResponse describeAntChainAccountsResponse, UnmarshallerContext _ctx) {
		
		describeAntChainAccountsResponse.setRequestId(_ctx.stringValue("DescribeAntChainAccountsResponse.RequestId"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainAccountsResponse.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainAccountsResponse.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainAccountsResponse.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<AccountsItem> accounts = new ArrayList<AccountsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainAccountsResponse.Result.Accounts.Length"); i++) {
			AccountsItem accountsItem = new AccountsItem();
			accountsItem.setAntChainId(_ctx.stringValue("DescribeAntChainAccountsResponse.Result.Accounts["+ i +"].AntChainId"));
			accountsItem.setAccount(_ctx.stringValue("DescribeAntChainAccountsResponse.Result.Accounts["+ i +"].Account"));
			accountsItem.setAccountPublicKey(_ctx.stringValue("DescribeAntChainAccountsResponse.Result.Accounts["+ i +"].AccountPublicKey"));
			accountsItem.setAccountRecoveryKey(_ctx.stringValue("DescribeAntChainAccountsResponse.Result.Accounts["+ i +"].AccountRecoveryKey"));
			accountsItem.setAccountStatus(_ctx.stringValue("DescribeAntChainAccountsResponse.Result.Accounts["+ i +"].AccountStatus"));

			accounts.add(accountsItem);
		}
		result.setAccounts(accounts);
		describeAntChainAccountsResponse.setResult(result);
	 
	 	return describeAntChainAccountsResponse;
	}
}