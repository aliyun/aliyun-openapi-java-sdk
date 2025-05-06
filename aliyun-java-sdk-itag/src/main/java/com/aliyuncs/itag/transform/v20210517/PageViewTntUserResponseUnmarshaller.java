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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.PageViewTntUserResponse;
import com.aliyuncs.itag.model.v20210517.PageViewTntUserResponse.Result;
import com.aliyuncs.itag.model.v20210517.PageViewTntUserResponse.Result.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageViewTntUserResponseUnmarshaller {

	public static PageViewTntUserResponse unmarshall(PageViewTntUserResponse pageViewTntUserResponse, UnmarshallerContext _ctx) {
		
		pageViewTntUserResponse.setRequestId(_ctx.stringValue("PageViewTntUserResponse.RequestId"));
		pageViewTntUserResponse.setCode(_ctx.stringValue("PageViewTntUserResponse.Code"));
		pageViewTntUserResponse.setErrInfo(_ctx.stringValue("PageViewTntUserResponse.ErrInfo"));
		pageViewTntUserResponse.setMsg(_ctx.stringValue("PageViewTntUserResponse.Msg"));
		pageViewTntUserResponse.setSucc(_ctx.booleanValue("PageViewTntUserResponse.Succ"));
		pageViewTntUserResponse.setErrorCode(_ctx.stringValue("PageViewTntUserResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("PageViewTntUserResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("PageViewTntUserResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("PageViewTntUserResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("PageViewTntUserResponse.Result.TotalPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("PageViewTntUserResponse.Result.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setRole(_ctx.stringValue("PageViewTntUserResponse.Result.List["+ i +"].Role"));
			listItem.setSelf(_ctx.booleanValue("PageViewTntUserResponse.Result.List["+ i +"].Self"));
			listItem.setTntInstId(_ctx.stringValue("PageViewTntUserResponse.Result.List["+ i +"].TntInstId"));
			listItem.setEmail(_ctx.stringValue("PageViewTntUserResponse.Result.List["+ i +"].Email"));
			listItem.setPhone(_ctx.stringValue("PageViewTntUserResponse.Result.List["+ i +"].Phone"));
			listItem.setSupplierId(_ctx.stringValue("PageViewTntUserResponse.Result.List["+ i +"].SupplierId"));
			listItem.setOrg(_ctx.stringValue("PageViewTntUserResponse.Result.List["+ i +"].Org"));
			listItem.setRefUserId(_ctx.stringValue("PageViewTntUserResponse.Result.List["+ i +"].RefUserId"));
			listItem.setUserId(_ctx.stringValue("PageViewTntUserResponse.Result.List["+ i +"].UserId"));
			listItem.setUserName(_ctx.stringValue("PageViewTntUserResponse.Result.List["+ i +"].UserName"));
			listItem.setAccountType(_ctx.stringValue("PageViewTntUserResponse.Result.List["+ i +"].AccountType"));
			listItem.setAccountNo(_ctx.stringValue("PageViewTntUserResponse.Result.List["+ i +"].AccountNo"));
			listItem.setBizNo(_ctx.stringValue("PageViewTntUserResponse.Result.List["+ i +"].BizNo"));

			list.add(listItem);
		}
		result.setList(list);
		pageViewTntUserResponse.setResult(result);
	 
	 	return pageViewTntUserResponse;
	}
}