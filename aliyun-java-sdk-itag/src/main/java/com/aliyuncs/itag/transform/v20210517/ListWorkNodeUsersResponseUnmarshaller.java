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

import com.aliyuncs.itag.model.v20210517.ListWorkNodeUsersResponse;
import com.aliyuncs.itag.model.v20210517.ListWorkNodeUsersResponse.Result;
import com.aliyuncs.itag.model.v20210517.ListWorkNodeUsersResponse.Result.ITagSimpleUserVO;
import com.aliyuncs.itag.model.v20210517.ListWorkNodeUsersResponse.Result.ITagSimpleUserVO.ITagSimpleUserVO1;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkNodeUsersResponseUnmarshaller {

	public static ListWorkNodeUsersResponse unmarshall(ListWorkNodeUsersResponse listWorkNodeUsersResponse, UnmarshallerContext _ctx) {
		
		listWorkNodeUsersResponse.setRequestId(_ctx.stringValue("ListWorkNodeUsersResponse.RequestId"));
		listWorkNodeUsersResponse.setCode(_ctx.stringValue("ListWorkNodeUsersResponse.Code"));
		listWorkNodeUsersResponse.setErrInfo(_ctx.stringValue("ListWorkNodeUsersResponse.ErrInfo"));
		listWorkNodeUsersResponse.setMsg(_ctx.stringValue("ListWorkNodeUsersResponse.Msg"));
		listWorkNodeUsersResponse.setSucc(_ctx.booleanValue("ListWorkNodeUsersResponse.Succ"));
		listWorkNodeUsersResponse.setErrorCode(_ctx.stringValue("ListWorkNodeUsersResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("ListWorkNodeUsersResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("ListWorkNodeUsersResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("ListWorkNodeUsersResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("ListWorkNodeUsersResponse.Result.TotalPage"));

		List<ITagSimpleUserVO> list = new ArrayList<ITagSimpleUserVO>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkNodeUsersResponse.Result.List.Length"); i++) {
			ITagSimpleUserVO iTagSimpleUserVO = new ITagSimpleUserVO();

			ITagSimpleUserVO1 iTagSimpleUserVO1 = new ITagSimpleUserVO1();
			iTagSimpleUserVO1.setUserId(_ctx.stringValue("ListWorkNodeUsersResponse.Result.List["+ i +"].ITagSimpleUserVO.UserId"));
			iTagSimpleUserVO1.setUserName(_ctx.stringValue("ListWorkNodeUsersResponse.Result.List["+ i +"].ITagSimpleUserVO.UserName"));
			iTagSimpleUserVO1.setAccountType(_ctx.stringValue("ListWorkNodeUsersResponse.Result.List["+ i +"].ITagSimpleUserVO.AccountType"));
			iTagSimpleUserVO1.setAccountNo(_ctx.stringValue("ListWorkNodeUsersResponse.Result.List["+ i +"].ITagSimpleUserVO.AccountNo"));
			iTagSimpleUserVO.setITagSimpleUserVO1(iTagSimpleUserVO1);

			list.add(iTagSimpleUserVO);
		}
		result.setList(list);
		listWorkNodeUsersResponse.setResult(result);
	 
	 	return listWorkNodeUsersResponse;
	}
}