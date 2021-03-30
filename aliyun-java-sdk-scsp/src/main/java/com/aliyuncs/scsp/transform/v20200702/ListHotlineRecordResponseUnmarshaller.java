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

package com.aliyuncs.scsp.transform.v20200702;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.ListHotlineRecordResponse;
import com.aliyuncs.scsp.model.v20200702.ListHotlineRecordResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHotlineRecordResponseUnmarshaller {

	public static ListHotlineRecordResponse unmarshall(ListHotlineRecordResponse listHotlineRecordResponse, UnmarshallerContext _ctx) {
		
		listHotlineRecordResponse.setRequestId(_ctx.stringValue("ListHotlineRecordResponse.RequestId"));
		listHotlineRecordResponse.setMessage(_ctx.stringValue("ListHotlineRecordResponse.Message"));
		listHotlineRecordResponse.setCode(_ctx.stringValue("ListHotlineRecordResponse.Code"));
		listHotlineRecordResponse.setSuccess(_ctx.booleanValue("ListHotlineRecordResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListHotlineRecordResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setConnectionId(_ctx.stringValue("ListHotlineRecordResponse.Data["+ i +"].ConnectionId"));
			dataItem.setEndTime(_ctx.booleanValue("ListHotlineRecordResponse.Data["+ i +"].EndTime"));
			dataItem.setCallId(_ctx.stringValue("ListHotlineRecordResponse.Data["+ i +"].CallId"));
			dataItem.setStartTime(_ctx.booleanValue("ListHotlineRecordResponse.Data["+ i +"].StartTime"));
			dataItem.setUrl(_ctx.stringValue("ListHotlineRecordResponse.Data["+ i +"].Url"));

			data.add(dataItem);
		}
		listHotlineRecordResponse.setData(data);
	 
	 	return listHotlineRecordResponse;
	}
}