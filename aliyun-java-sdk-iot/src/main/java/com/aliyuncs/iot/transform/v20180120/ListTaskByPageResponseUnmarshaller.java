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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListTaskByPageResponse;
import com.aliyuncs.iot.model.v20180120.ListTaskByPageResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskByPageResponseUnmarshaller {

	public static ListTaskByPageResponse unmarshall(ListTaskByPageResponse listTaskByPageResponse, UnmarshallerContext _ctx) {
		
		listTaskByPageResponse.setRequestId(_ctx.stringValue("ListTaskByPageResponse.RequestId"));
		listTaskByPageResponse.setSuccess(_ctx.booleanValue("ListTaskByPageResponse.Success"));
		listTaskByPageResponse.setCode(_ctx.stringValue("ListTaskByPageResponse.Code"));
		listTaskByPageResponse.setErrorMessage(_ctx.stringValue("ListTaskByPageResponse.ErrorMessage"));
		listTaskByPageResponse.setTotal(_ctx.integerValue("ListTaskByPageResponse.Total"));
		listTaskByPageResponse.setPageSize(_ctx.integerValue("ListTaskByPageResponse.PageSize"));
		listTaskByPageResponse.setPageCount(_ctx.integerValue("ListTaskByPageResponse.PageCount"));
		listTaskByPageResponse.setPage(_ctx.integerValue("ListTaskByPageResponse.Page"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskByPageResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setJobId(_ctx.stringValue("ListTaskByPageResponse.Data["+ i +"].JobId"));
			dataItem.setJobName(_ctx.stringValue("ListTaskByPageResponse.Data["+ i +"].JobName"));
			dataItem.setTaskId(_ctx.stringValue("ListTaskByPageResponse.Data["+ i +"].TaskId"));
			dataItem.setProductKey(_ctx.stringValue("ListTaskByPageResponse.Data["+ i +"].ProductKey"));
			dataItem.setDeviceName(_ctx.stringValue("ListTaskByPageResponse.Data["+ i +"].DeviceName"));
			dataItem.setIotId(_ctx.stringValue("ListTaskByPageResponse.Data["+ i +"].IotId"));
			dataItem.setProgress(_ctx.integerValue("ListTaskByPageResponse.Data["+ i +"].Progress"));
			dataItem.setUtcQueueTime(_ctx.stringValue("ListTaskByPageResponse.Data["+ i +"].UtcQueueTime"));
			dataItem.setUtcModified(_ctx.stringValue("ListTaskByPageResponse.Data["+ i +"].UtcModified"));
			dataItem.setStatusDetail(_ctx.stringValue("ListTaskByPageResponse.Data["+ i +"].StatusDetail"));
			dataItem.setStatus(_ctx.stringValue("ListTaskByPageResponse.Data["+ i +"].Status"));
			dataItem.setProductName(_ctx.stringValue("ListTaskByPageResponse.Data["+ i +"].ProductName"));

			data.add(dataItem);
		}
		listTaskByPageResponse.setData(data);
	 
	 	return listTaskByPageResponse;
	}
}