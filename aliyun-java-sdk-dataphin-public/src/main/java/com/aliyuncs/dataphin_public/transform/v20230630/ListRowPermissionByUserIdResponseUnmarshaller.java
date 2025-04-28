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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListRowPermissionByUserIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListRowPermissionByUserIdResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListRowPermissionByUserIdResponse.PageResult.DataItem;
import com.aliyuncs.dataphin_public.model.v20230630.ListRowPermissionByUserIdResponse.PageResult.DataItem.RulesItem;
import com.aliyuncs.dataphin_public.model.v20230630.ListRowPermissionByUserIdResponse.PageResult.DataItem.RulesItem.ExpressionsItem;
import com.aliyuncs.dataphin_public.model.v20230630.ListRowPermissionByUserIdResponse.PageResult.DataItem.RulesItem.UserMappingListItem;
import com.aliyuncs.dataphin_public.model.v20230630.ListRowPermissionByUserIdResponse.PageResult.DataItem.RulesItem.UserMappingListItem.AccountsItem;
import com.aliyuncs.dataphin_public.model.v20230630.ListRowPermissionByUserIdResponse.PageResult.DataItem.TablesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRowPermissionByUserIdResponseUnmarshaller {

	public static ListRowPermissionByUserIdResponse unmarshall(ListRowPermissionByUserIdResponse listRowPermissionByUserIdResponse, UnmarshallerContext _ctx) {
		
		listRowPermissionByUserIdResponse.setRequestId(_ctx.stringValue("ListRowPermissionByUserIdResponse.RequestId"));
		listRowPermissionByUserIdResponse.setSuccess(_ctx.booleanValue("ListRowPermissionByUserIdResponse.Success"));
		listRowPermissionByUserIdResponse.setHttpStatusCode(_ctx.integerValue("ListRowPermissionByUserIdResponse.HttpStatusCode"));
		listRowPermissionByUserIdResponse.setCode(_ctx.stringValue("ListRowPermissionByUserIdResponse.Code"));
		listRowPermissionByUserIdResponse.setMessage(_ctx.stringValue("ListRowPermissionByUserIdResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListRowPermissionByUserIdResponse.PageResult.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRowPermissionByUserIdResponse.PageResult.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setGmtCreate(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].GmtModified"));
			dataItem.setCreator(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Creator"));
			dataItem.setModifier(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Modifier"));
			dataItem.setTenantId(_ctx.longValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].TenantId"));

			List<RulesItem> rules = new ArrayList<RulesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules.Length"); j++) {
				RulesItem rulesItem = new RulesItem();
				rulesItem.setRuleName(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].RuleName"));
				rulesItem.setScopeType(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].ScopeType"));
				rulesItem.setIsDelete(_ctx.booleanValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].IsDelete"));
				rulesItem.setStatus(_ctx.integerValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].Status"));

				List<ExpressionsItem> expressions = new ArrayList<ExpressionsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].Expressions.Length"); k++) {
					ExpressionsItem expressionsItem = new ExpressionsItem();
					expressionsItem.setMappingColumnName(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].Expressions["+ k +"].MappingColumnName"));
					expressionsItem.setType(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].Expressions["+ k +"].Type"));
					expressionsItem.setOperator(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].Expressions["+ k +"].Operator"));

					List<String> values = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].Expressions["+ k +"].Values.Length"); l++) {
						values.add(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].Expressions["+ k +"].Values["+ l +"]"));
					}
					expressionsItem.setValues(values);

					List<String> subConditions = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].Expressions["+ k +"].SubConditions.Length"); l++) {
						subConditions.add(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].Expressions["+ k +"].SubConditions["+ l +"]"));
					}
					expressionsItem.setSubConditions(subConditions);

					expressions.add(expressionsItem);
				}
				rulesItem.setExpressions(expressions);

				List<UserMappingListItem> userMappingList = new ArrayList<UserMappingListItem>();
				for (int k = 0; k < _ctx.lengthValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].UserMappingList.Length"); k++) {
					UserMappingListItem userMappingListItem = new UserMappingListItem();
					userMappingListItem.setAccountType(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].UserMappingList["+ k +"].AccountType"));

					List<AccountsItem> accounts = new ArrayList<AccountsItem>();
					for (int l = 0; l < _ctx.lengthValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].UserMappingList["+ k +"].Accounts.Length"); l++) {
						AccountsItem accountsItem = new AccountsItem();
						accountsItem.setAccountId(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Rules["+ j +"].UserMappingList["+ k +"].Accounts["+ l +"].AccountId"));

						accounts.add(accountsItem);
					}
					userMappingListItem.setAccounts(accounts);

					userMappingList.add(userMappingListItem);
				}
				rulesItem.setUserMappingList(userMappingList);

				rules.add(rulesItem);
			}
			dataItem.setRules(rules);

			List<TablesItem> tables = new ArrayList<TablesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Tables.Length"); j++) {
				TablesItem tablesItem = new TablesItem();
				tablesItem.setMappingColumnName(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Tables["+ j +"].MappingColumnName"));
				tablesItem.setResourceId(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Tables["+ j +"].ResourceId"));
				tablesItem.setColumnName(_ctx.stringValue("ListRowPermissionByUserIdResponse.PageResult.Data["+ i +"].Tables["+ j +"].ColumnName"));

				tables.add(tablesItem);
			}
			dataItem.setTables(tables);

			data.add(dataItem);
		}
		pageResult.setData(data);
		listRowPermissionByUserIdResponse.setPageResult(pageResult);
	 
	 	return listRowPermissionByUserIdResponse;
	}
}