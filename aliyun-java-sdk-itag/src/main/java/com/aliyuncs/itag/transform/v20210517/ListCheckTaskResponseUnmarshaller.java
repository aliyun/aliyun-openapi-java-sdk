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

import com.aliyuncs.itag.model.v20210517.ListCheckTaskResponse;
import com.aliyuncs.itag.model.v20210517.ListCheckTaskResponse.ResultItem;
import com.aliyuncs.itag.model.v20210517.ListCheckTaskResponse.ResultItem.Creator;
import com.aliyuncs.itag.model.v20210517.ListCheckTaskResponse.ResultItem.Modifier;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCheckTaskResponseUnmarshaller {

	public static ListCheckTaskResponse unmarshall(ListCheckTaskResponse listCheckTaskResponse, UnmarshallerContext _ctx) {
		
		listCheckTaskResponse.setRequestId(_ctx.stringValue("ListCheckTaskResponse.RequestId"));
		listCheckTaskResponse.setCode(_ctx.integerValue("ListCheckTaskResponse.Code"));
		listCheckTaskResponse.setMsg(_ctx.stringValue("ListCheckTaskResponse.Msg"));
		listCheckTaskResponse.setErrInfo(_ctx.stringValue("ListCheckTaskResponse.ErrInfo"));
		listCheckTaskResponse.setSucc(_ctx.booleanValue("ListCheckTaskResponse.Succ"));
		listCheckTaskResponse.setRt(_ctx.longValue("ListCheckTaskResponse.Rt"));
		listCheckTaskResponse.setHost(_ctx.stringValue("ListCheckTaskResponse.Host"));
		listCheckTaskResponse.setErrorCode(_ctx.stringValue("ListCheckTaskResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCheckTaskResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCanRelease(_ctx.booleanValue("ListCheckTaskResponse.Result["+ i +"].CanRelease"));
			resultItem.setCanReassign(_ctx.booleanValue("ListCheckTaskResponse.Result["+ i +"].CanReassign"));
			resultItem.setSubTaskId(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].SubTaskId"));
			resultItem.setUserSubTaskId(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].UserSubTaskId"));
			resultItem.setTaskName(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].TaskName"));
			resultItem.setTaskId(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].TaskId"));
			resultItem.setSource(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Source"));
			resultItem.setState(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].State"));
			resultItem.setGmtCreate(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].GmtModified"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListCheckTaskResponse.Result["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Tags["+ j +"]"));
			}
			resultItem.setTags(tags);

			Creator creator = new Creator();
			creator.setUserId(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Creator.UserId"));
			creator.setUserName(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Creator.UserName"));
			creator.setAccountType(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Creator.AccountType"));
			creator.setAccountNo(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Creator.AccountNo"));
			creator.setEmail(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Creator.Email"));
			creator.setPamNo(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Creator.PamNo"));
			creator.setSupplierId(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Creator.SupplierId"));
			creator.setSupplierName(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Creator.SupplierName"));
			resultItem.setCreator(creator);

			Modifier modifier = new Modifier();
			modifier.setUserId(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Modifier.UserId"));
			modifier.setUserName(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Modifier.UserName"));
			modifier.setAccountType(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Modifier.AccountType"));
			modifier.setAccountNo(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Modifier.AccountNo"));
			modifier.setEmail(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Modifier.Email"));
			modifier.setPamNo(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Modifier.PamNo"));
			modifier.setSupplierId(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Modifier.SupplierId"));
			modifier.setSupplierName(_ctx.stringValue("ListCheckTaskResponse.Result["+ i +"].Modifier.SupplierName"));
			resultItem.setModifier(modifier);

			result.add(resultItem);
		}
		listCheckTaskResponse.setResult(result);
	 
	 	return listCheckTaskResponse;
	}
}