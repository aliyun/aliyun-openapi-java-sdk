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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryRecordResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRecordResponseUnmarshaller {

	public static QueryRecordResponse unmarshall(QueryRecordResponse queryRecordResponse, UnmarshallerContext _ctx) {
		
		queryRecordResponse.setRequestId(_ctx.stringValue("QueryRecordResponse.RequestId"));
		queryRecordResponse.setSuccess(_ctx.booleanValue("QueryRecordResponse.Success"));
		queryRecordResponse.setErrorMessage(_ctx.stringValue("QueryRecordResponse.ErrorMessage"));
		queryRecordResponse.setCode(_ctx.stringValue("QueryRecordResponse.Code"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("QueryRecordResponse.Data.PageSize"));
		data.setPage(_ctx.integerValue("QueryRecordResponse.Data.Page"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRecordResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setBeginTime(_ctx.stringValue("QueryRecordResponse.Data.List["+ i +"].BeginTime"));
			listItem.setEndTime(_ctx.stringValue("QueryRecordResponse.Data.List["+ i +"].EndTime"));
			listItem.setRecordType(_ctx.integerValue("QueryRecordResponse.Data.List["+ i +"].RecordType"));
			listItem.setStreamType(_ctx.integerValue("QueryRecordResponse.Data.List["+ i +"].StreamType"));
			listItem.setFileName(_ctx.stringValue("QueryRecordResponse.Data.List["+ i +"].FileName"));
			listItem.setFileSize(_ctx.integerValue("QueryRecordResponse.Data.List["+ i +"].FileSize"));
			listItem.setVideoFrameNumber(_ctx.integerValue("QueryRecordResponse.Data.List["+ i +"].VideoFrameNumber"));

			list.add(listItem);
		}
		data.setList(list);
		queryRecordResponse.setData(data);
	 
	 	return queryRecordResponse;
	}
}