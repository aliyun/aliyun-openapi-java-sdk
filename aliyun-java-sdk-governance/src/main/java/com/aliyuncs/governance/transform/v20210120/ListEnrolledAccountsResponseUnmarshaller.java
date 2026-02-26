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

package com.aliyuncs.governance.transform.v20210120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.governance.model.v20210120.ListEnrolledAccountsResponse;
import com.aliyuncs.governance.model.v20210120.ListEnrolledAccountsResponse.EnrolledAccountsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnrolledAccountsResponseUnmarshaller {

	public static ListEnrolledAccountsResponse unmarshall(ListEnrolledAccountsResponse listEnrolledAccountsResponse, UnmarshallerContext _ctx) {
		
		listEnrolledAccountsResponse.setRequestId(_ctx.stringValue("ListEnrolledAccountsResponse.RequestId"));
		listEnrolledAccountsResponse.setNextToken(_ctx.stringValue("ListEnrolledAccountsResponse.NextToken"));

		List<EnrolledAccountsItem> enrolledAccounts = new ArrayList<EnrolledAccountsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnrolledAccountsResponse.EnrolledAccounts.Length"); i++) {
			EnrolledAccountsItem enrolledAccountsItem = new EnrolledAccountsItem();
			enrolledAccountsItem.setAccountUid(_ctx.longValue("ListEnrolledAccountsResponse.EnrolledAccounts["+ i +"].AccountUid"));
			enrolledAccountsItem.setBaselineId(_ctx.stringValue("ListEnrolledAccountsResponse.EnrolledAccounts["+ i +"].BaselineId"));
			enrolledAccountsItem.setCreateTime(_ctx.stringValue("ListEnrolledAccountsResponse.EnrolledAccounts["+ i +"].CreateTime"));
			enrolledAccountsItem.setDisplayName(_ctx.stringValue("ListEnrolledAccountsResponse.EnrolledAccounts["+ i +"].DisplayName"));
			enrolledAccountsItem.setFolderId(_ctx.stringValue("ListEnrolledAccountsResponse.EnrolledAccounts["+ i +"].FolderId"));
			enrolledAccountsItem.setPayerAccountUid(_ctx.longValue("ListEnrolledAccountsResponse.EnrolledAccounts["+ i +"].PayerAccountUid"));
			enrolledAccountsItem.setStatus(_ctx.stringValue("ListEnrolledAccountsResponse.EnrolledAccounts["+ i +"].Status"));
			enrolledAccountsItem.setUpdateTime(_ctx.stringValue("ListEnrolledAccountsResponse.EnrolledAccounts["+ i +"].UpdateTime"));

			enrolledAccounts.add(enrolledAccountsItem);
		}
		listEnrolledAccountsResponse.setEnrolledAccounts(enrolledAccounts);
	 
	 	return listEnrolledAccountsResponse;
	}
}