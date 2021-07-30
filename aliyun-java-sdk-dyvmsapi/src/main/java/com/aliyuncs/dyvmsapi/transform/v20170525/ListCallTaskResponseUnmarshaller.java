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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyvmsapi.model.v20170525.ListCallTaskResponse;
import com.aliyuncs.dyvmsapi.model.v20170525.ListCallTaskResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCallTaskResponseUnmarshaller {

	public static ListCallTaskResponse unmarshall(ListCallTaskResponse listCallTaskResponse, UnmarshallerContext _ctx) {
		
		listCallTaskResponse.setRequestId(_ctx.stringValue("ListCallTaskResponse.RequestId"));
		listCallTaskResponse.setCode(_ctx.stringValue("ListCallTaskResponse.Code"));
		listCallTaskResponse.setPageNumber(_ctx.longValue("ListCallTaskResponse.PageNumber"));
		listCallTaskResponse.setPageSize(_ctx.longValue("ListCallTaskResponse.PageSize"));
		listCallTaskResponse.setTotal(_ctx.longValue("ListCallTaskResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCallTaskResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("ListCallTaskResponse.Data["+ i +"].Id"));
			dataItem.setTaskName(_ctx.stringValue("ListCallTaskResponse.Data["+ i +"].TaskName"));
			dataItem.setTemplateName(_ctx.stringValue("ListCallTaskResponse.Data["+ i +"].TemplateName"));
			dataItem.setBizType(_ctx.stringValue("ListCallTaskResponse.Data["+ i +"].BizType"));
			dataItem.setResource(_ctx.stringValue("ListCallTaskResponse.Data["+ i +"].Resource"));
			dataItem.setFireTime(_ctx.stringValue("ListCallTaskResponse.Data["+ i +"].FireTime"));
			dataItem.setCompleteTime(_ctx.stringValue("ListCallTaskResponse.Data["+ i +"].CompleteTime"));
			dataItem.setStatus(_ctx.stringValue("ListCallTaskResponse.Data["+ i +"].Status"));
			dataItem.setStopTime(_ctx.stringValue("ListCallTaskResponse.Data["+ i +"].StopTime"));
			dataItem.setTemplateCode(_ctx.stringValue("ListCallTaskResponse.Data["+ i +"].TemplateCode"));
			dataItem.setData(_ctx.stringValue("ListCallTaskResponse.Data["+ i +"].Data"));
			dataItem.setDataType(_ctx.stringValue("ListCallTaskResponse.Data["+ i +"].DataType"));
			dataItem.setTotalCount(_ctx.longValue("ListCallTaskResponse.Data["+ i +"].TotalCount"));
			dataItem.setCompletedCount(_ctx.longValue("ListCallTaskResponse.Data["+ i +"].CompletedCount"));
			dataItem.setCompletedRate(_ctx.integerValue("ListCallTaskResponse.Data["+ i +"].CompletedRate"));

			data.add(dataItem);
		}
		listCallTaskResponse.setData(data);
	 
	 	return listCallTaskResponse;
	}
}