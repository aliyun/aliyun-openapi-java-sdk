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

import com.aliyuncs.iot.model.v20180120.ListTaskResponse;
import com.aliyuncs.iot.model.v20180120.ListTaskResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskResponseUnmarshaller {

	public static ListTaskResponse unmarshall(ListTaskResponse listTaskResponse, UnmarshallerContext _ctx) {
		
		listTaskResponse.setRequestId(_ctx.stringValue("ListTaskResponse.RequestId"));
		listTaskResponse.setCode(_ctx.stringValue("ListTaskResponse.Code"));
		listTaskResponse.setNextToken(_ctx.stringValue("ListTaskResponse.NextToken"));
		listTaskResponse.setErrorMessage(_ctx.stringValue("ListTaskResponse.ErrorMessage"));
		listTaskResponse.setSuccess(_ctx.booleanValue("ListTaskResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatus(_ctx.stringValue("ListTaskResponse.Data["+ i +"].Status"));
			dataItem.setUtcQueueTime(_ctx.stringValue("ListTaskResponse.Data["+ i +"].UtcQueueTime"));
			dataItem.setProductKey(_ctx.stringValue("ListTaskResponse.Data["+ i +"].ProductKey"));
			dataItem.setProgress(_ctx.stringValue("ListTaskResponse.Data["+ i +"].Progress"));
			dataItem.setDeviceName(_ctx.stringValue("ListTaskResponse.Data["+ i +"].DeviceName"));
			dataItem.setJobName(_ctx.stringValue("ListTaskResponse.Data["+ i +"].JobName"));
			dataItem.setUtcModified(_ctx.stringValue("ListTaskResponse.Data["+ i +"].UtcModified"));
			dataItem.setJobId(_ctx.stringValue("ListTaskResponse.Data["+ i +"].JobId"));
			dataItem.setTaskId(_ctx.stringValue("ListTaskResponse.Data["+ i +"].TaskId"));
			dataItem.setIotId(_ctx.stringValue("ListTaskResponse.Data["+ i +"].IotId"));

			data.add(dataItem);
		}
		listTaskResponse.setData(data);
	 
	 	return listTaskResponse;
	}
}