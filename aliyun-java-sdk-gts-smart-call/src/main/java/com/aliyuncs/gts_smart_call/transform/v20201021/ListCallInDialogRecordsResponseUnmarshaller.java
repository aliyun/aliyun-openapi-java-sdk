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

package com.aliyuncs.gts_smart_call.transform.v20201021;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gts_smart_call.model.v20201021.ListCallInDialogRecordsResponse;
import com.aliyuncs.gts_smart_call.model.v20201021.ListCallInDialogRecordsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCallInDialogRecordsResponseUnmarshaller {

	public static ListCallInDialogRecordsResponse unmarshall(ListCallInDialogRecordsResponse listCallInDialogRecordsResponse, UnmarshallerContext _ctx) {
		
		listCallInDialogRecordsResponse.setRequestId(_ctx.stringValue("ListCallInDialogRecordsResponse.RequestId"));
		listCallInDialogRecordsResponse.setTotalCount(_ctx.longValue("ListCallInDialogRecordsResponse.TotalCount"));
		listCallInDialogRecordsResponse.setPageNumber(_ctx.integerValue("ListCallInDialogRecordsResponse.PageNumber"));
		listCallInDialogRecordsResponse.setPageSize(_ctx.integerValue("ListCallInDialogRecordsResponse.PageSize"));
		listCallInDialogRecordsResponse.setCode(_ctx.integerValue("ListCallInDialogRecordsResponse.Code"));
		listCallInDialogRecordsResponse.setMessage(_ctx.stringValue("ListCallInDialogRecordsResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCallInDialogRecordsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("ListCallInDialogRecordsResponse.Data["+ i +"].Name"));
			dataItem.setContent(_ctx.stringValue("ListCallInDialogRecordsResponse.Data["+ i +"].Content"));
			dataItem.setBeginTimestamp(_ctx.longValue("ListCallInDialogRecordsResponse.Data["+ i +"].BeginTimestamp"));
			dataItem.setEndTimestamp(_ctx.longValue("ListCallInDialogRecordsResponse.Data["+ i +"].EndTimestamp"));

			data.add(dataItem);
		}
		listCallInDialogRecordsResponse.setData(data);
	 
	 	return listCallInDialogRecordsResponse;
	}
}