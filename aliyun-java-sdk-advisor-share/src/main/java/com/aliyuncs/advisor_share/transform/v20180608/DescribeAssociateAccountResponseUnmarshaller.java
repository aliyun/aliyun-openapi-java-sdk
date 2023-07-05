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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.DescribeAssociateAccountResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeAssociateAccountResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.DescribeAssociateAccountResponse.Data.AssociateAccountListItem;
import com.aliyuncs.advisor_share.model.v20180608.DescribeAssociateAccountResponse.Data.MasterAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAssociateAccountResponseUnmarshaller {

	public static DescribeAssociateAccountResponse unmarshall(DescribeAssociateAccountResponse describeAssociateAccountResponse, UnmarshallerContext _ctx) {
		
		describeAssociateAccountResponse.setRequestId(_ctx.stringValue("DescribeAssociateAccountResponse.RequestId"));

		Data data = new Data();

		MasterAccount masterAccount = new MasterAccount();
		masterAccount.setUserName(_ctx.stringValue("DescribeAssociateAccountResponse.Data.MasterAccount.UserName"));
		masterAccount.setAliyunId(_ctx.longValue("DescribeAssociateAccountResponse.Data.MasterAccount.AliyunId"));
		data.setMasterAccount(masterAccount);

		List<AssociateAccountListItem> associateAccountList = new ArrayList<AssociateAccountListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAssociateAccountResponse.Data.AssociateAccountList.Length"); i++) {
			AssociateAccountListItem associateAccountListItem = new AssociateAccountListItem();
			associateAccountListItem.setSubAliyunId(_ctx.longValue("DescribeAssociateAccountResponse.Data.AssociateAccountList["+ i +"].SubAliyunId"));
			associateAccountListItem.setSubUserName(_ctx.stringValue("DescribeAssociateAccountResponse.Data.AssociateAccountList["+ i +"].SubUserName"));

			associateAccountList.add(associateAccountListItem);
		}
		data.setAssociateAccountList(associateAccountList);
		describeAssociateAccountResponse.setData(data);
	 
	 	return describeAssociateAccountResponse;
	}
}