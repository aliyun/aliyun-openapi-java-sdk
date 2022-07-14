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

package com.aliyuncs.imarketing.transform.v20220704;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imarketing.model.v20220704.GetMainPartPageResponse;
import com.aliyuncs.imarketing.model.v20220704.GetMainPartPageResponse.Data;
import com.aliyuncs.imarketing.model.v20220704.GetMainPartPageResponse.Data.ListItem;
import com.aliyuncs.imarketing.model.v20220704.GetMainPartPageResponse.Data.ListItem.AccountTypeListItem;
import com.aliyuncs.imarketing.model.v20220704.GetMainPartPageResponse.Data.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMainPartPageResponseUnmarshaller {

	public static GetMainPartPageResponse unmarshall(GetMainPartPageResponse getMainPartPageResponse, UnmarshallerContext _ctx) {
		
		getMainPartPageResponse.setRequestId(_ctx.stringValue("GetMainPartPageResponse.RequestId"));
		getMainPartPageResponse.setCode(_ctx.longValue("GetMainPartPageResponse.Code"));
		getMainPartPageResponse.setSuccess(_ctx.booleanValue("GetMainPartPageResponse.Success"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPage(_ctx.integerValue("GetMainPartPageResponse.Data.PageInfo.page"));
		pageInfo.setPageSize(_ctx.integerValue("GetMainPartPageResponse.Data.PageInfo.pageSize"));
		pageInfo.setTotalNumber(_ctx.integerValue("GetMainPartPageResponse.Data.PageInfo.totalNumber"));
		data.setPageInfo(pageInfo);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMainPartPageResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setCompany(_ctx.stringValue("GetMainPartPageResponse.Data.List["+ i +"].Company"));
			listItem.setMainId(_ctx.longValue("GetMainPartPageResponse.Data.List["+ i +"].MainId"));
			listItem.setMainName(_ctx.stringValue("GetMainPartPageResponse.Data.List["+ i +"].MainName"));

			List<AccountTypeListItem> accountTypeList = new ArrayList<AccountTypeListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMainPartPageResponse.Data.List["+ i +"].AccountTypeList.Length"); j++) {
				AccountTypeListItem accountTypeListItem = new AccountTypeListItem();
				accountTypeListItem.setAccountType(_ctx.stringValue("GetMainPartPageResponse.Data.List["+ i +"].AccountTypeList["+ j +"].AccountType"));
				accountTypeListItem.setAccountTypeDesc(_ctx.stringValue("GetMainPartPageResponse.Data.List["+ i +"].AccountTypeList["+ j +"].AccountTypeDesc"));

				accountTypeList.add(accountTypeListItem);
			}
			listItem.setAccountTypeList(accountTypeList);

			list.add(listItem);
		}
		data.setList(list);
		getMainPartPageResponse.setData(data);
	 
	 	return getMainPartPageResponse;
	}
}