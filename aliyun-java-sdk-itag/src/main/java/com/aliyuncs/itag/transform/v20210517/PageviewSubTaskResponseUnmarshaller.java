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

import com.aliyuncs.itag.model.v20210517.PageviewSubTaskResponse;
import com.aliyuncs.itag.model.v20210517.PageviewSubTaskResponse.Result;
import com.aliyuncs.itag.model.v20210517.PageviewSubTaskResponse.Result.ITagSubTaskDTO;
import com.aliyuncs.itag.model.v20210517.PageviewSubTaskResponse.Result.ITagSubTaskDTO.CurrentHandler;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageviewSubTaskResponseUnmarshaller {

	public static PageviewSubTaskResponse unmarshall(PageviewSubTaskResponse pageviewSubTaskResponse, UnmarshallerContext _ctx) {
		
		pageviewSubTaskResponse.setRequestId(_ctx.stringValue("PageviewSubTaskResponse.RequestId"));
		pageviewSubTaskResponse.setCode(_ctx.stringValue("PageviewSubTaskResponse.Code"));
		pageviewSubTaskResponse.setErrInfo(_ctx.stringValue("PageviewSubTaskResponse.ErrInfo"));
		pageviewSubTaskResponse.setMsg(_ctx.stringValue("PageviewSubTaskResponse.Msg"));
		pageviewSubTaskResponse.setSucc(_ctx.booleanValue("PageviewSubTaskResponse.Succ"));
		pageviewSubTaskResponse.setErrorCode(_ctx.stringValue("PageviewSubTaskResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("PageviewSubTaskResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("PageviewSubTaskResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("PageviewSubTaskResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("PageviewSubTaskResponse.Result.TotalPage"));

		List<ITagSubTaskDTO> list = new ArrayList<ITagSubTaskDTO>();
		for (int i = 0; i < _ctx.lengthValue("PageviewSubTaskResponse.Result.List.Length"); i++) {
			ITagSubTaskDTO iTagSubTaskDTO = new ITagSubTaskDTO();
			iTagSubTaskDTO.setId(_ctx.stringValue("PageviewSubTaskResponse.Result.List["+ i +"].Id"));
			iTagSubTaskDTO.setTaskId(_ctx.stringValue("PageviewSubTaskResponse.Result.List["+ i +"].TaskId"));
			iTagSubTaskDTO.setCurrentWorkNode(_ctx.stringValue("PageviewSubTaskResponse.Result.List["+ i +"].CurrentWorkNode"));
			iTagSubTaskDTO.setCurrentUserSubTaskId(_ctx.stringValue("PageviewSubTaskResponse.Result.List["+ i +"].CurrentUserSubTaskId"));
			iTagSubTaskDTO.setWorkNodeState(_ctx.stringValue("PageviewSubTaskResponse.Result.List["+ i +"].WorkNodeState"));
			iTagSubTaskDTO.setWorkNodeUsers(_ctx.mapValue("PageviewSubTaskResponse.Result.List["+ i +"].WorkNodeUsers"));
			iTagSubTaskDTO.setCanReassign(_ctx.booleanValue("PageviewSubTaskResponse.Result.List["+ i +"].CanReassign"));
			iTagSubTaskDTO.setCanRelease(_ctx.booleanValue("PageviewSubTaskResponse.Result.List["+ i +"].CanRelease"));
			iTagSubTaskDTO.setCanDiscard(_ctx.booleanValue("PageviewSubTaskResponse.Result.List["+ i +"].CanDiscard"));

			CurrentHandler currentHandler = new CurrentHandler();
			currentHandler.setUserId(_ctx.stringValue("PageviewSubTaskResponse.Result.List["+ i +"].CurrentHandler.UserId"));
			currentHandler.setUserName(_ctx.stringValue("PageviewSubTaskResponse.Result.List["+ i +"].CurrentHandler.UserName"));
			currentHandler.setAccountType(_ctx.stringValue("PageviewSubTaskResponse.Result.List["+ i +"].CurrentHandler.AccountType"));
			currentHandler.setAccountNo(_ctx.stringValue("PageviewSubTaskResponse.Result.List["+ i +"].CurrentHandler.AccountNo"));
			iTagSubTaskDTO.setCurrentHandler(currentHandler);

			list.add(iTagSubTaskDTO);
		}
		result.setList(list);
		pageviewSubTaskResponse.setResult(result);
	 
	 	return pageviewSubTaskResponse;
	}
}