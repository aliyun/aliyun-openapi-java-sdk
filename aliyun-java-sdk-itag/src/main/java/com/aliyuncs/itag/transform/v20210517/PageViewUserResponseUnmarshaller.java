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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.PageViewUserResponse;
import com.aliyuncs.itag.model.v20210517.PageViewUserResponse.Result;
import com.aliyuncs.itag.model.v20210517.PageViewUserResponse.Result.List;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageViewUserResponseUnmarshaller {

	public static PageViewUserResponse unmarshall(PageViewUserResponse pageViewUserResponse, UnmarshallerContext _ctx) {
		
		pageViewUserResponse.setRequestId(_ctx.stringValue("PageViewUserResponse.RequestId"));
		pageViewUserResponse.setCode(_ctx.stringValue("PageViewUserResponse.Code"));
		pageViewUserResponse.setErrInfo(_ctx.stringValue("PageViewUserResponse.ErrInfo"));
		pageViewUserResponse.setMsg(_ctx.stringValue("PageViewUserResponse.Msg"));
		pageViewUserResponse.setSucc(_ctx.booleanValue("PageViewUserResponse.Succ"));
		pageViewUserResponse.setErrorCode(_ctx.stringValue("PageViewUserResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("PageViewUserResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("PageViewUserResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("PageViewUserResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("PageViewUserResponse.Result.TotalPage"));

		List list = new List();
		list.setUserId(_ctx.stringValue("PageViewUserResponse.Result.List.UserId"));
		list.setUserName(_ctx.stringValue("PageViewUserResponse.Result.List.UserName"));
		list.setAccountType(_ctx.stringValue("PageViewUserResponse.Result.List.AccountType"));
		list.setAccountNo(_ctx.stringValue("PageViewUserResponse.Result.List.AccountNo"));
		list.setEmail(_ctx.stringValue("PageViewUserResponse.Result.List.Email"));
		list.setPhone(_ctx.stringValue("PageViewUserResponse.Result.List.Phone"));
		list.setSupplierId(_ctx.stringValue("PageViewUserResponse.Result.List.SupplierId"));
		list.setOrg(_ctx.stringValue("PageViewUserResponse.Result.List.Org"));
		list.setRefUserId(_ctx.stringValue("PageViewUserResponse.Result.List.RefUserId"));
		result.setList(list);
		pageViewUserResponse.setResult(result);
	 
	 	return pageViewUserResponse;
	}
}