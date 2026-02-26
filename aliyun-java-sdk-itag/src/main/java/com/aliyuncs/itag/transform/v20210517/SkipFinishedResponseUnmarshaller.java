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

import com.aliyuncs.itag.model.v20210517.SkipFinishedResponse;
import com.aliyuncs.itag.model.v20210517.SkipFinishedResponse.Result;
import com.aliyuncs.itag.model.v20210517.SkipFinishedResponse.Result.ITagSubTaskDTO;
import com.aliyuncs.itag.model.v20210517.SkipFinishedResponse.Result.ITagSubTaskDTO.CurrentHandler;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SkipFinishedResponseUnmarshaller {

	public static SkipFinishedResponse unmarshall(SkipFinishedResponse skipFinishedResponse, UnmarshallerContext _ctx) {
		
		skipFinishedResponse.setRequestId(_ctx.stringValue("SkipFinishedResponse.RequestId"));
		skipFinishedResponse.setCode(_ctx.stringValue("SkipFinishedResponse.Code"));
		skipFinishedResponse.setErrInfo(_ctx.stringValue("SkipFinishedResponse.ErrInfo"));
		skipFinishedResponse.setMsg(_ctx.stringValue("SkipFinishedResponse.Msg"));
		skipFinishedResponse.setSucc(_ctx.booleanValue("SkipFinishedResponse.Succ"));
		skipFinishedResponse.setErrorCode(_ctx.stringValue("SkipFinishedResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("SkipFinishedResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("SkipFinishedResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("SkipFinishedResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("SkipFinishedResponse.Result.TotalPage"));

		List<ITagSubTaskDTO> list = new ArrayList<ITagSubTaskDTO>();
		for (int i = 0; i < _ctx.lengthValue("SkipFinishedResponse.Result.List.Length"); i++) {
			ITagSubTaskDTO iTagSubTaskDTO = new ITagSubTaskDTO();
			iTagSubTaskDTO.setId(_ctx.stringValue("SkipFinishedResponse.Result.List["+ i +"].Id"));
			iTagSubTaskDTO.setTaskId(_ctx.stringValue("SkipFinishedResponse.Result.List["+ i +"].TaskId"));
			iTagSubTaskDTO.setCurrentWorkNode(_ctx.stringValue("SkipFinishedResponse.Result.List["+ i +"].CurrentWorkNode"));
			iTagSubTaskDTO.setCurrentUserSubTaskId(_ctx.stringValue("SkipFinishedResponse.Result.List["+ i +"].CurrentUserSubTaskId"));
			iTagSubTaskDTO.setWorkNodeState(_ctx.stringValue("SkipFinishedResponse.Result.List["+ i +"].WorkNodeState"));
			iTagSubTaskDTO.setWorkNodeUsers(_ctx.mapValue("SkipFinishedResponse.Result.List["+ i +"].WorkNodeUsers"));
			iTagSubTaskDTO.setCanReassign(_ctx.booleanValue("SkipFinishedResponse.Result.List["+ i +"].CanReassign"));
			iTagSubTaskDTO.setCanRelease(_ctx.booleanValue("SkipFinishedResponse.Result.List["+ i +"].CanRelease"));
			iTagSubTaskDTO.setCanDiscard(_ctx.booleanValue("SkipFinishedResponse.Result.List["+ i +"].CanDiscard"));

			CurrentHandler currentHandler = new CurrentHandler();
			currentHandler.setUserId(_ctx.stringValue("SkipFinishedResponse.Result.List["+ i +"].CurrentHandler.UserId"));
			currentHandler.setUserName(_ctx.stringValue("SkipFinishedResponse.Result.List["+ i +"].CurrentHandler.UserName"));
			currentHandler.setAccountType(_ctx.stringValue("SkipFinishedResponse.Result.List["+ i +"].CurrentHandler.AccountType"));
			currentHandler.setAccountNo(_ctx.stringValue("SkipFinishedResponse.Result.List["+ i +"].CurrentHandler.AccountNo"));
			iTagSubTaskDTO.setCurrentHandler(currentHandler);

			list.add(iTagSubTaskDTO);
		}
		result.setList(list);
		skipFinishedResponse.setResult(result);
	 
	 	return skipFinishedResponse;
	}
}