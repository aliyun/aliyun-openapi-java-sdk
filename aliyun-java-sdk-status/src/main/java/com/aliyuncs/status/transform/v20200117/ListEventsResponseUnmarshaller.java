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

package com.aliyuncs.status.transform.v20200117;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.status.model.v20200117.ListEventsResponse;
import com.aliyuncs.status.model.v20200117.ListEventsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventsResponseUnmarshaller {

	public static ListEventsResponse unmarshall(ListEventsResponse listEventsResponse, UnmarshallerContext _ctx) {
		
		listEventsResponse.setRequestId(_ctx.stringValue("ListEventsResponse.RequestId"));
		listEventsResponse.setTotal(_ctx.integerValue("ListEventsResponse.Total"));
		listEventsResponse.setInfo(_ctx.stringValue("ListEventsResponse.Info"));
		listEventsResponse.setCode(_ctx.integerValue("ListEventsResponse.Code"));
		listEventsResponse.setSuccess(_ctx.stringValue("ListEventsResponse.Success"));
		listEventsResponse.setHTTPCode(_ctx.integerValue("ListEventsResponse.HTTPCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEventsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTitle(_ctx.stringValue("ListEventsResponse.Data["+ i +"].Title"));
			dataItem.setCurrentStateSeverity(_ctx.stringValue("ListEventsResponse.Data["+ i +"].CurrentStateSeverity"));
			dataItem.setSartTime(_ctx.longValue("ListEventsResponse.Data["+ i +"].SartTime"));
			dataItem.setEndTime(_ctx.longValue("ListEventsResponse.Data["+ i +"].EndTime"));

			data.add(dataItem);
		}
		listEventsResponse.setData(data);
	 
	 	return listEventsResponse;
	}
}