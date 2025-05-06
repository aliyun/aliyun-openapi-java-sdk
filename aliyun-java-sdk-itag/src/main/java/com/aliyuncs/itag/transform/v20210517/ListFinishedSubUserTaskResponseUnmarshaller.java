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

import com.aliyuncs.itag.model.v20210517.ListFinishedSubUserTaskResponse;
import com.aliyuncs.itag.model.v20210517.ListFinishedSubUserTaskResponse.Result;
import com.aliyuncs.itag.model.v20210517.ListFinishedSubUserTaskResponse.Result.ListItem;
import com.aliyuncs.itag.model.v20210517.ListFinishedSubUserTaskResponse.Result.ListItem.Creator;
import com.aliyuncs.itag.model.v20210517.ListFinishedSubUserTaskResponse.Result.ListItem.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFinishedSubUserTaskResponseUnmarshaller {

	public static ListFinishedSubUserTaskResponse unmarshall(ListFinishedSubUserTaskResponse listFinishedSubUserTaskResponse, UnmarshallerContext _ctx) {
		
		listFinishedSubUserTaskResponse.setRequestId(_ctx.stringValue("ListFinishedSubUserTaskResponse.RequestId"));
		listFinishedSubUserTaskResponse.setCode(_ctx.integerValue("ListFinishedSubUserTaskResponse.Code"));
		listFinishedSubUserTaskResponse.setMsg(_ctx.stringValue("ListFinishedSubUserTaskResponse.Msg"));
		listFinishedSubUserTaskResponse.setErrInfo(_ctx.stringValue("ListFinishedSubUserTaskResponse.ErrInfo"));
		listFinishedSubUserTaskResponse.setSucc(_ctx.booleanValue("ListFinishedSubUserTaskResponse.Succ"));
		listFinishedSubUserTaskResponse.setRt(_ctx.longValue("ListFinishedSubUserTaskResponse.Rt"));
		listFinishedSubUserTaskResponse.setHost(_ctx.stringValue("ListFinishedSubUserTaskResponse.Host"));
		listFinishedSubUserTaskResponse.setErrorCode(_ctx.stringValue("ListFinishedSubUserTaskResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.integerValue("ListFinishedSubUserTaskResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("ListFinishedSubUserTaskResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("ListFinishedSubUserTaskResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("ListFinishedSubUserTaskResponse.Result.TotalPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFinishedSubUserTaskResponse.Result.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setSubTaskId(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].SubTaskId"));
			listItem.setTaskName(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].TaskName"));
			listItem.setTaskId(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].TaskId"));
			listItem.setState(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].State"));
			listItem.setWorkTime(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].WorkTime"));
			listItem.setWorkNode(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].WorkNode"));
			listItem.setUserSubTaskId(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].UserSubTaskId"));
			listItem.setGmtCreate(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].GmtModified"));

			Creator creator = new Creator();
			creator.setUserId(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Creator.UserId"));
			creator.setUserName(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Creator.UserName"));
			creator.setAccountType(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Creator.AccountType"));
			creator.setAccountNo(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Creator.AccountNo"));
			creator.setEmail(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Creator.Email"));
			creator.setPamNo(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Creator.PamNo"));
			creator.setSupplierId(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Creator.SupplierId"));
			creator.setSupplierName(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Creator.SupplierName"));
			listItem.setCreator(creator);

			Modifier modifier = new Modifier();
			modifier.setUserId(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Modifier.UserId"));
			modifier.setUserName(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Modifier.UserName"));
			modifier.setAccountType(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Modifier.AccountType"));
			modifier.setAccountNo(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Modifier.AccountNo"));
			modifier.setEmail(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Modifier.Email"));
			modifier.setPamNo(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Modifier.PamNo"));
			modifier.setSupplierId(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Modifier.SupplierId"));
			modifier.setSupplierName(_ctx.stringValue("ListFinishedSubUserTaskResponse.Result.List["+ i +"].Modifier.SupplierName"));
			listItem.setModifier(modifier);

			list.add(listItem);
		}
		result.setList(list);
		listFinishedSubUserTaskResponse.setResult(result);
	 
	 	return listFinishedSubUserTaskResponse;
	}
}