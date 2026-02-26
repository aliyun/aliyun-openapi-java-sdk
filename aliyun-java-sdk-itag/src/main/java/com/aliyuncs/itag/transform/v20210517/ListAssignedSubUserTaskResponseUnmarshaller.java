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

import com.aliyuncs.itag.model.v20210517.ListAssignedSubUserTaskResponse;
import com.aliyuncs.itag.model.v20210517.ListAssignedSubUserTaskResponse.Result;
import com.aliyuncs.itag.model.v20210517.ListAssignedSubUserTaskResponse.Result.ListItem;
import com.aliyuncs.itag.model.v20210517.ListAssignedSubUserTaskResponse.Result.ListItem.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAssignedSubUserTaskResponseUnmarshaller {

	public static ListAssignedSubUserTaskResponse unmarshall(ListAssignedSubUserTaskResponse listAssignedSubUserTaskResponse, UnmarshallerContext _ctx) {
		
		listAssignedSubUserTaskResponse.setRequestId(_ctx.stringValue("ListAssignedSubUserTaskResponse.RequestId"));
		listAssignedSubUserTaskResponse.setCode(_ctx.stringValue("ListAssignedSubUserTaskResponse.Code"));
		listAssignedSubUserTaskResponse.setErrInfo(_ctx.stringValue("ListAssignedSubUserTaskResponse.ErrInfo"));
		listAssignedSubUserTaskResponse.setMsg(_ctx.stringValue("ListAssignedSubUserTaskResponse.Msg"));
		listAssignedSubUserTaskResponse.setSucc(_ctx.booleanValue("ListAssignedSubUserTaskResponse.Succ"));
		listAssignedSubUserTaskResponse.setErrorCode(_ctx.stringValue("ListAssignedSubUserTaskResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("ListAssignedSubUserTaskResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("ListAssignedSubUserTaskResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("ListAssignedSubUserTaskResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("ListAssignedSubUserTaskResponse.Result.TotalPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAssignedSubUserTaskResponse.Result.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setTaskId(_ctx.stringValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].TaskId"));
			listItem.setTaskName(_ctx.stringValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].TaskName"));
			listItem.setCount(_ctx.longValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].Count"));
			listItem.setState(_ctx.stringValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].State"));
			listItem.setSubTaskId(_ctx.longValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].SubTaskId"));
			listItem.setCanRelease(_ctx.booleanValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].CanRelease"));
			listItem.setCanReassign(_ctx.booleanValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].CanReassign"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].Tags["+ j +"]"));
			}
			listItem.setTags(tags);

			Creator creator = new Creator();
			creator.setUserId(_ctx.stringValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].Creator.UserId"));
			creator.setUserName(_ctx.stringValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].Creator.UserName"));
			creator.setAccountType(_ctx.stringValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].Creator.AccountType"));
			creator.setAccountNo(_ctx.stringValue("ListAssignedSubUserTaskResponse.Result.List["+ i +"].Creator.AccountNo"));
			listItem.setCreator(creator);

			list.add(listItem);
		}
		result.setList(list);
		listAssignedSubUserTaskResponse.setResult(result);
	 
	 	return listAssignedSubUserTaskResponse;
	}
}