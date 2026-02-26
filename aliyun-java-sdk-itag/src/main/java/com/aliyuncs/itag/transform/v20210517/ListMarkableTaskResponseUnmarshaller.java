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

import com.aliyuncs.itag.model.v20210517.ListMarkableTaskResponse;
import com.aliyuncs.itag.model.v20210517.ListMarkableTaskResponse.Result;
import com.aliyuncs.itag.model.v20210517.ListMarkableTaskResponse.Result.ListItem;
import com.aliyuncs.itag.model.v20210517.ListMarkableTaskResponse.Result.ListItem.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMarkableTaskResponseUnmarshaller {

	public static ListMarkableTaskResponse unmarshall(ListMarkableTaskResponse listMarkableTaskResponse, UnmarshallerContext _ctx) {
		
		listMarkableTaskResponse.setRequestId(_ctx.stringValue("ListMarkableTaskResponse.RequestId"));
		listMarkableTaskResponse.setCode(_ctx.stringValue("ListMarkableTaskResponse.Code"));
		listMarkableTaskResponse.setErrInfo(_ctx.stringValue("ListMarkableTaskResponse.ErrInfo"));
		listMarkableTaskResponse.setMsg(_ctx.stringValue("ListMarkableTaskResponse.Msg"));
		listMarkableTaskResponse.setSucc(_ctx.booleanValue("ListMarkableTaskResponse.Succ"));
		listMarkableTaskResponse.setErrorCode(_ctx.stringValue("ListMarkableTaskResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("ListMarkableTaskResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("ListMarkableTaskResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("ListMarkableTaskResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("ListMarkableTaskResponse.Result.TotalPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMarkableTaskResponse.Result.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setTaskId(_ctx.stringValue("ListMarkableTaskResponse.Result.List["+ i +"].TaskId"));
			listItem.setTaskName(_ctx.stringValue("ListMarkableTaskResponse.Result.List["+ i +"].TaskName"));
			listItem.setCount(_ctx.longValue("ListMarkableTaskResponse.Result.List["+ i +"].Count"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListMarkableTaskResponse.Result.List["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListMarkableTaskResponse.Result.List["+ i +"].Tags["+ j +"]"));
			}
			listItem.setTags(tags);

			Creator creator = new Creator();
			creator.setUserId(_ctx.stringValue("ListMarkableTaskResponse.Result.List["+ i +"].Creator.UserId"));
			creator.setUserName(_ctx.stringValue("ListMarkableTaskResponse.Result.List["+ i +"].Creator.UserName"));
			creator.setAccountType(_ctx.stringValue("ListMarkableTaskResponse.Result.List["+ i +"].Creator.AccountType"));
			creator.setAccountNo(_ctx.stringValue("ListMarkableTaskResponse.Result.List["+ i +"].Creator.AccountNo"));
			listItem.setCreator(creator);

			list.add(listItem);
		}
		result.setList(list);
		listMarkableTaskResponse.setResult(result);
	 
	 	return listMarkableTaskResponse;
	}
}