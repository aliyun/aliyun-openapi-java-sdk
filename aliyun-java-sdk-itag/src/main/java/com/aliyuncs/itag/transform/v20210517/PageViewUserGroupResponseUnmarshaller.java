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

import com.aliyuncs.itag.model.v20210517.PageViewUserGroupResponse;
import com.aliyuncs.itag.model.v20210517.PageViewUserGroupResponse.Result;
import com.aliyuncs.itag.model.v20210517.PageViewUserGroupResponse.Result.List;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageViewUserGroupResponseUnmarshaller {

	public static PageViewUserGroupResponse unmarshall(PageViewUserGroupResponse pageViewUserGroupResponse, UnmarshallerContext _ctx) {
		
		pageViewUserGroupResponse.setRequestId(_ctx.stringValue("PageViewUserGroupResponse.RequestId"));
		pageViewUserGroupResponse.setCode(_ctx.stringValue("PageViewUserGroupResponse.Code"));
		pageViewUserGroupResponse.setErrInfo(_ctx.stringValue("PageViewUserGroupResponse.ErrInfo"));
		pageViewUserGroupResponse.setMsg(_ctx.stringValue("PageViewUserGroupResponse.Msg"));
		pageViewUserGroupResponse.setSucc(_ctx.booleanValue("PageViewUserGroupResponse.Succ"));
		pageViewUserGroupResponse.setErrorCode(_ctx.stringValue("PageViewUserGroupResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("PageViewUserGroupResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("PageViewUserGroupResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("PageViewUserGroupResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("PageViewUserGroupResponse.Result.TotalPage"));

		List list = new List();
		list.setTntInstId(_ctx.stringValue("PageViewUserGroupResponse.Result.List.TntInstId"));
		list.setGroupId(_ctx.stringValue("PageViewUserGroupResponse.Result.List.GroupId"));
		list.setGroupName(_ctx.stringValue("PageViewUserGroupResponse.Result.List.GroupName"));
		result.setList(list);
		pageViewUserGroupResponse.setResult(result);
	 
	 	return pageViewUserGroupResponse;
	}
}