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

import com.aliyuncs.itag.model.v20210517.PageViewFlowJobResponse;
import com.aliyuncs.itag.model.v20210517.PageViewFlowJobResponse.Result;
import com.aliyuncs.itag.model.v20210517.PageViewFlowJobResponse.Result.ITagFlowJobStatResponse;
import com.aliyuncs.itag.model.v20210517.PageViewFlowJobResponse.Result.ITagFlowJobStatResponse.Creator;
import com.aliyuncs.itag.model.v20210517.PageViewFlowJobResponse.Result.ITagFlowJobStatResponse.Modifier;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageViewFlowJobResponseUnmarshaller {

	public static PageViewFlowJobResponse unmarshall(PageViewFlowJobResponse pageViewFlowJobResponse, UnmarshallerContext _ctx) {
		
		pageViewFlowJobResponse.setRequestId(_ctx.stringValue("PageViewFlowJobResponse.RequestId"));
		pageViewFlowJobResponse.setCode(_ctx.stringValue("PageViewFlowJobResponse.Code"));
		pageViewFlowJobResponse.setErrInfo(_ctx.stringValue("PageViewFlowJobResponse.ErrInfo"));
		pageViewFlowJobResponse.setMsg(_ctx.stringValue("PageViewFlowJobResponse.Msg"));
		pageViewFlowJobResponse.setSucc(_ctx.booleanValue("PageViewFlowJobResponse.Succ"));
		pageViewFlowJobResponse.setErrorCode(_ctx.stringValue("PageViewFlowJobResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("PageViewFlowJobResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("PageViewFlowJobResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("PageViewFlowJobResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("PageViewFlowJobResponse.Result.TotalPage"));

		List<ITagFlowJobStatResponse> list = new ArrayList<ITagFlowJobStatResponse>();
		for (int i = 0; i < _ctx.lengthValue("PageViewFlowJobResponse.Result.List.Length"); i++) {
			ITagFlowJobStatResponse iTagFlowJobStatResponse = new ITagFlowJobStatResponse();
			iTagFlowJobStatResponse.setRunInstId(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].RunInstId"));
			iTagFlowJobStatResponse.setFlowId(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].FlowId"));
			iTagFlowJobStatResponse.setState(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].State"));
			iTagFlowJobStatResponse.setRunMsg(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].RunMsg"));
			iTagFlowJobStatResponse.setLogView(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].LogView"));
			iTagFlowJobStatResponse.setRunRet(_ctx.mapValue("PageViewFlowJobResponse.Result.List["+ i +"].RunRet"));
			iTagFlowJobStatResponse.setGmtCreate(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].GmtCreate"));
			iTagFlowJobStatResponse.setGmtModified(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].GmtModified"));

			Creator creator = new Creator();
			creator.setUserId(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].Creator.UserId"));
			creator.setUserName(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].Creator.UserName"));
			creator.setAccountType(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].Creator.AccountType"));
			creator.setAccountNo(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].Creator.AccountNo"));
			iTagFlowJobStatResponse.setCreator(creator);

			Modifier modifier = new Modifier();
			modifier.setUserId(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].Modifier.UserId"));
			modifier.setUserName(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].Modifier.UserName"));
			modifier.setAccountType(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].Modifier.AccountType"));
			modifier.setAccountNo(_ctx.stringValue("PageViewFlowJobResponse.Result.List["+ i +"].Modifier.AccountNo"));
			iTagFlowJobStatResponse.setModifier(modifier);

			list.add(iTagFlowJobStatResponse);
		}
		result.setList(list);
		pageViewFlowJobResponse.setResult(result);
	 
	 	return pageViewFlowJobResponse;
	}
}