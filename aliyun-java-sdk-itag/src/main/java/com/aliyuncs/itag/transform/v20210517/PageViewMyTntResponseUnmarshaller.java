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

import com.aliyuncs.itag.model.v20210517.PageViewMyTntResponse;
import com.aliyuncs.itag.model.v20210517.PageViewMyTntResponse.Result;
import com.aliyuncs.itag.model.v20210517.PageViewMyTntResponse.Result.List;
import com.aliyuncs.itag.model.v20210517.PageViewMyTntResponse.Result.List.Creator;
import com.aliyuncs.itag.model.v20210517.PageViewMyTntResponse.Result.List.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageViewMyTntResponseUnmarshaller {

	public static PageViewMyTntResponse unmarshall(PageViewMyTntResponse pageViewMyTntResponse, UnmarshallerContext _ctx) {
		
		pageViewMyTntResponse.setRequestId(_ctx.stringValue("PageViewMyTntResponse.RequestId"));
		pageViewMyTntResponse.setCode(_ctx.stringValue("PageViewMyTntResponse.Code"));
		pageViewMyTntResponse.setErrInfo(_ctx.stringValue("PageViewMyTntResponse.ErrInfo"));
		pageViewMyTntResponse.setMsg(_ctx.stringValue("PageViewMyTntResponse.Msg"));
		pageViewMyTntResponse.setSucc(_ctx.booleanValue("PageViewMyTntResponse.Succ"));
		pageViewMyTntResponse.setErrorCode(_ctx.stringValue("PageViewMyTntResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("PageViewMyTntResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("PageViewMyTntResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("PageViewMyTntResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("PageViewMyTntResponse.Result.TotalPage"));

		List list = new List();
		list.setGmtCreate(_ctx.stringValue("PageViewMyTntResponse.Result.List.GmtCreate"));
		list.setGmtModified(_ctx.stringValue("PageViewMyTntResponse.Result.List.GmtModified"));
		list.setTntInstId(_ctx.stringValue("PageViewMyTntResponse.Result.List.TntInstId"));
		list.setName(_ctx.stringValue("PageViewMyTntResponse.Result.List.Name"));
		list.setBizNO(_ctx.stringValue("PageViewMyTntResponse.Result.List.BizNO"));
		list.setRole(_ctx.stringValue("PageViewMyTntResponse.Result.List.Role"));

		Creator creator = new Creator();
		creator.setUserId(_ctx.stringValue("PageViewMyTntResponse.Result.List.Creator.UserId"));
		creator.setUserName(_ctx.stringValue("PageViewMyTntResponse.Result.List.Creator.UserName"));
		creator.setAccountType(_ctx.stringValue("PageViewMyTntResponse.Result.List.Creator.AccountType"));
		creator.setAccountNo(_ctx.stringValue("PageViewMyTntResponse.Result.List.Creator.AccountNo"));
		list.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setUserId(_ctx.stringValue("PageViewMyTntResponse.Result.List.Modifier.UserId"));
		modifier.setUserName(_ctx.stringValue("PageViewMyTntResponse.Result.List.Modifier.UserName"));
		modifier.setAccountType(_ctx.stringValue("PageViewMyTntResponse.Result.List.Modifier.AccountType"));
		modifier.setAccountNo(_ctx.stringValue("PageViewMyTntResponse.Result.List.Modifier.AccountNo"));
		list.setModifier(modifier);
		result.setList(list);
		pageViewMyTntResponse.setResult(result);
	 
	 	return pageViewMyTntResponse;
	}
}