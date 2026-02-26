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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeCrossAccountsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeCrossAccountsResponse.CrossAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCrossAccountsResponseUnmarshaller {

	public static DescribeCrossAccountsResponse unmarshall(DescribeCrossAccountsResponse describeCrossAccountsResponse, UnmarshallerContext _ctx) {
		
		describeCrossAccountsResponse.setRequestId(_ctx.stringValue("DescribeCrossAccountsResponse.RequestId"));
		describeCrossAccountsResponse.setSuccess(_ctx.booleanValue("DescribeCrossAccountsResponse.Success"));
		describeCrossAccountsResponse.setCode(_ctx.stringValue("DescribeCrossAccountsResponse.Code"));
		describeCrossAccountsResponse.setMessage(_ctx.stringValue("DescribeCrossAccountsResponse.Message"));
		describeCrossAccountsResponse.setPageNumber(_ctx.integerValue("DescribeCrossAccountsResponse.PageNumber"));
		describeCrossAccountsResponse.setPageSize(_ctx.integerValue("DescribeCrossAccountsResponse.PageSize"));
		describeCrossAccountsResponse.setTotalCount(_ctx.longValue("DescribeCrossAccountsResponse.TotalCount"));

		List<CrossAccount> crossAccounts = new ArrayList<CrossAccount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCrossAccountsResponse.CrossAccounts.Length"); i++) {
			CrossAccount crossAccount = new CrossAccount();
			crossAccount.setOwnerId(_ctx.longValue("DescribeCrossAccountsResponse.CrossAccounts["+ i +"].OwnerId"));
			crossAccount.setCrossAccountUserId(_ctx.longValue("DescribeCrossAccountsResponse.CrossAccounts["+ i +"].CrossAccountUserId"));
			crossAccount.setCrossAccountRoleName(_ctx.stringValue("DescribeCrossAccountsResponse.CrossAccounts["+ i +"].CrossAccountRoleName"));
			crossAccount.setAlias(_ctx.stringValue("DescribeCrossAccountsResponse.CrossAccounts["+ i +"].Alias"));
			crossAccount.setId(_ctx.longValue("DescribeCrossAccountsResponse.CrossAccounts["+ i +"].Id"));
			crossAccount.setCreatedTime(_ctx.longValue("DescribeCrossAccountsResponse.CrossAccounts["+ i +"].CreatedTime"));
			crossAccount.setUpdatedTime(_ctx.longValue("DescribeCrossAccountsResponse.CrossAccounts["+ i +"].UpdatedTime"));

			crossAccounts.add(crossAccount);
		}
		describeCrossAccountsResponse.setCrossAccounts(crossAccounts);
	 
	 	return describeCrossAccountsResponse;
	}
}