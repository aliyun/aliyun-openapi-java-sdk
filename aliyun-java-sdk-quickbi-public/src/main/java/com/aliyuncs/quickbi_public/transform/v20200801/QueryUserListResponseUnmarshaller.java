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

package com.aliyuncs.quickbi_public.transform.v20200801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200801.QueryUserListResponse;
import com.aliyuncs.quickbi_public.model.v20200801.QueryUserListResponse.Result;
import com.aliyuncs.quickbi_public.model.v20200801.QueryUserListResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserListResponseUnmarshaller {

	public static QueryUserListResponse unmarshall(QueryUserListResponse queryUserListResponse, UnmarshallerContext _ctx) {
		
		queryUserListResponse.setRequestId(_ctx.stringValue("QueryUserListResponse.RequestId"));
		queryUserListResponse.setSuccess(_ctx.booleanValue("QueryUserListResponse.Success"));

		Result result = new Result();
		result.setPageNum(_ctx.integerValue("QueryUserListResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("QueryUserListResponse.Result.PageSize"));
		result.setTotalNum(_ctx.integerValue("QueryUserListResponse.Result.TotalNum"));
		result.setTotalPages(_ctx.integerValue("QueryUserListResponse.Result.TotalPages"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryUserListResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAccountId(_ctx.stringValue("QueryUserListResponse.Result.Data["+ i +"].AccountId"));
			dataItem.setAccountName(_ctx.stringValue("QueryUserListResponse.Result.Data["+ i +"].AccountName"));
			dataItem.setAdminUser(_ctx.booleanValue("QueryUserListResponse.Result.Data["+ i +"].AdminUser"));
			dataItem.setAuthAdminUser(_ctx.booleanValue("QueryUserListResponse.Result.Data["+ i +"].AuthAdminUser"));
			dataItem.setEmail(_ctx.stringValue("QueryUserListResponse.Result.Data["+ i +"].Email"));
			dataItem.setNickName(_ctx.stringValue("QueryUserListResponse.Result.Data["+ i +"].NickName"));
			dataItem.setPhone(_ctx.stringValue("QueryUserListResponse.Result.Data["+ i +"].Phone"));
			dataItem.setUserId(_ctx.stringValue("QueryUserListResponse.Result.Data["+ i +"].UserId"));
			dataItem.setUserType(_ctx.integerValue("QueryUserListResponse.Result.Data["+ i +"].UserType"));

			data.add(dataItem);
		}
		result.setData(data);
		queryUserListResponse.setResult(result);
	 
	 	return queryUserListResponse;
	}
}