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

import com.aliyuncs.iot.model.v20180120.ListJobResponse;
import com.aliyuncs.iot.model.v20180120.ListJobResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobResponseUnmarshaller {

	public static ListJobResponse unmarshall(ListJobResponse listJobResponse, UnmarshallerContext _ctx) {
		
		listJobResponse.setRequestId(_ctx.stringValue("ListJobResponse.RequestId"));
		listJobResponse.setSuccess(_ctx.booleanValue("ListJobResponse.Success"));
		listJobResponse.setCode(_ctx.stringValue("ListJobResponse.Code"));
		listJobResponse.setErrorMessage(_ctx.stringValue("ListJobResponse.ErrorMessage"));
		listJobResponse.setTotal(_ctx.integerValue("ListJobResponse.Total"));
		listJobResponse.setPageSize(_ctx.integerValue("ListJobResponse.PageSize"));
		listJobResponse.setPage(_ctx.integerValue("ListJobResponse.Page"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListJobResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setJobId(_ctx.stringValue("ListJobResponse.Data["+ i +"].JobId"));
			dataItem.setJobName(_ctx.stringValue("ListJobResponse.Data["+ i +"].JobName"));
			dataItem.setUtcCreate(_ctx.stringValue("ListJobResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("ListJobResponse.Data["+ i +"].UtcModified"));
			dataItem.setStatus(_ctx.stringValue("ListJobResponse.Data["+ i +"].Status"));
			dataItem.setDescription(_ctx.stringValue("ListJobResponse.Data["+ i +"].Description"));
			dataItem.setType(_ctx.stringValue("ListJobResponse.Data["+ i +"].Type"));
			dataItem.setScheduledTime(_ctx.longValue("ListJobResponse.Data["+ i +"].ScheduledTime"));

			data.add(dataItem);
		}
		listJobResponse.setData(data);
	 
	 	return listJobResponse;
	}
}