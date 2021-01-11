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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainAccountsV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainAccountsV2Response.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainAccountsV2Response.Result.AccountsItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainAccountsV2Response.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainAccountsV2ResponseUnmarshaller {

	public static DescribeAntChainAccountsV2Response unmarshall(DescribeAntChainAccountsV2Response describeAntChainAccountsV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainAccountsV2Response.setRequestId(_ctx.stringValue("DescribeAntChainAccountsV2Response.RequestId"));
		describeAntChainAccountsV2Response.setResultCode(_ctx.stringValue("DescribeAntChainAccountsV2Response.ResultCode"));
		describeAntChainAccountsV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainAccountsV2Response.ResultMessage"));
		describeAntChainAccountsV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainAccountsV2Response.Success"));
		describeAntChainAccountsV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainAccountsV2Response.HttpStatusCode"));
		describeAntChainAccountsV2Response.setCode(_ctx.stringValue("DescribeAntChainAccountsV2Response.Code"));
		describeAntChainAccountsV2Response.setMessage(_ctx.stringValue("DescribeAntChainAccountsV2Response.Message"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainAccountsV2Response.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainAccountsV2Response.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainAccountsV2Response.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<AccountsItem> accounts = new ArrayList<AccountsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainAccountsV2Response.Result.Accounts.Length"); i++) {
			AccountsItem accountsItem = new AccountsItem();
			accountsItem.setAntChainId(_ctx.stringValue("DescribeAntChainAccountsV2Response.Result.Accounts["+ i +"].AntChainId"));
			accountsItem.setAccount(_ctx.stringValue("DescribeAntChainAccountsV2Response.Result.Accounts["+ i +"].Account"));
			accountsItem.setAccountPublicKey(_ctx.stringValue("DescribeAntChainAccountsV2Response.Result.Accounts["+ i +"].AccountPublicKey"));
			accountsItem.setAccountRecoveryKey(_ctx.stringValue("DescribeAntChainAccountsV2Response.Result.Accounts["+ i +"].AccountRecoveryKey"));
			accountsItem.setAccountStatus(_ctx.stringValue("DescribeAntChainAccountsV2Response.Result.Accounts["+ i +"].AccountStatus"));

			accounts.add(accountsItem);
		}
		result.setAccounts(accounts);
		describeAntChainAccountsV2Response.setResult(result);
	 
	 	return describeAntChainAccountsV2Response;
	}
}