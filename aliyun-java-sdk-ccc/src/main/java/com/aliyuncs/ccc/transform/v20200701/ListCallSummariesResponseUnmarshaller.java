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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListCallSummariesResponse;
import com.aliyuncs.ccc.model.v20200701.ListCallSummariesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCallSummariesResponseUnmarshaller {

	public static ListCallSummariesResponse unmarshall(ListCallSummariesResponse listCallSummariesResponse, UnmarshallerContext _ctx) {
		
		listCallSummariesResponse.setRequestId(_ctx.stringValue("ListCallSummariesResponse.RequestId"));
		listCallSummariesResponse.setHttpStatusCode(_ctx.integerValue("ListCallSummariesResponse.HttpStatusCode"));
		listCallSummariesResponse.setCode(_ctx.stringValue("ListCallSummariesResponse.Code"));
		listCallSummariesResponse.setMessage(_ctx.stringValue("ListCallSummariesResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListCallSummariesResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ListCallSummariesResponse.Params["+ i +"]"));
		}
		listCallSummariesResponse.setParams(params);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCallSummariesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTicketId(_ctx.stringValue("ListCallSummariesResponse.Data["+ i +"].TicketId"));
			dataItem.setContactId(_ctx.stringValue("ListCallSummariesResponse.Data["+ i +"].ContactId"));
			dataItem.setContext(_ctx.stringValue("ListCallSummariesResponse.Data["+ i +"].Context"));
			dataItem.setCreatedTime(_ctx.longValue("ListCallSummariesResponse.Data["+ i +"].CreatedTime"));
			dataItem.setCreator(_ctx.stringValue("ListCallSummariesResponse.Data["+ i +"].Creator"));
			dataItem.setEditor(_ctx.stringValue("ListCallSummariesResponse.Data["+ i +"].Editor"));

			data.add(dataItem);
		}
		listCallSummariesResponse.setData(data);
	 
	 	return listCallSummariesResponse;
	}
}