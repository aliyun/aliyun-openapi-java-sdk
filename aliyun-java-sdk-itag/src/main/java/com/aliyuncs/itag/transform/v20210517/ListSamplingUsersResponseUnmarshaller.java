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

import com.aliyuncs.itag.model.v20210517.ListSamplingUsersResponse;
import com.aliyuncs.itag.model.v20210517.ListSamplingUsersResponse.Result;
import com.aliyuncs.itag.model.v20210517.ListSamplingUsersResponse.Result.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSamplingUsersResponseUnmarshaller {

	public static ListSamplingUsersResponse unmarshall(ListSamplingUsersResponse listSamplingUsersResponse, UnmarshallerContext _ctx) {
		
		listSamplingUsersResponse.setRequestId(_ctx.stringValue("ListSamplingUsersResponse.RequestId"));
		listSamplingUsersResponse.setCode(_ctx.integerValue("ListSamplingUsersResponse.Code"));
		listSamplingUsersResponse.setMsg(_ctx.stringValue("ListSamplingUsersResponse.Msg"));
		listSamplingUsersResponse.setErrInfo(_ctx.stringValue("ListSamplingUsersResponse.ErrInfo"));
		listSamplingUsersResponse.setSucc(_ctx.booleanValue("ListSamplingUsersResponse.Succ"));
		listSamplingUsersResponse.setRt(_ctx.longValue("ListSamplingUsersResponse.Rt"));
		listSamplingUsersResponse.setHost(_ctx.stringValue("ListSamplingUsersResponse.Host"));
		listSamplingUsersResponse.setErrorCode(_ctx.stringValue("ListSamplingUsersResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.integerValue("ListSamplingUsersResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("ListSamplingUsersResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("ListSamplingUsersResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("ListSamplingUsersResponse.Result.TotalPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSamplingUsersResponse.Result.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setUserId(_ctx.stringValue("ListSamplingUsersResponse.Result.List["+ i +"].UserId"));
			listItem.setUserName(_ctx.stringValue("ListSamplingUsersResponse.Result.List["+ i +"].UserName"));
			listItem.setAccountType(_ctx.stringValue("ListSamplingUsersResponse.Result.List["+ i +"].AccountType"));
			listItem.setAccountNo(_ctx.stringValue("ListSamplingUsersResponse.Result.List["+ i +"].AccountNo"));
			listItem.setEmail(_ctx.stringValue("ListSamplingUsersResponse.Result.List["+ i +"].Email"));
			listItem.setPamNo(_ctx.stringValue("ListSamplingUsersResponse.Result.List["+ i +"].PamNo"));
			listItem.setSupplierId(_ctx.stringValue("ListSamplingUsersResponse.Result.List["+ i +"].SupplierId"));
			listItem.setSupplierName(_ctx.stringValue("ListSamplingUsersResponse.Result.List["+ i +"].SupplierName"));

			list.add(listItem);
		}
		result.setList(list);
		listSamplingUsersResponse.setResult(result);
	 
	 	return listSamplingUsersResponse;
	}
}