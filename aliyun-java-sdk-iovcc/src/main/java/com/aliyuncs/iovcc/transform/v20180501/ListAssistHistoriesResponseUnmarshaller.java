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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListAssistHistoriesResponse;
import com.aliyuncs.iovcc.model.v20180501.ListAssistHistoriesResponse.HistoriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAssistHistoriesResponseUnmarshaller {

	public static ListAssistHistoriesResponse unmarshall(ListAssistHistoriesResponse listAssistHistoriesResponse, UnmarshallerContext _ctx) {
		
		listAssistHistoriesResponse.setRequestId(_ctx.stringValue("ListAssistHistoriesResponse.RequestId"));
		listAssistHistoriesResponse.setPageIndex(_ctx.integerValue("ListAssistHistoriesResponse.PageIndex"));
		listAssistHistoriesResponse.setPerPage(_ctx.integerValue("ListAssistHistoriesResponse.PerPage"));
		listAssistHistoriesResponse.setTotalCount(_ctx.integerValue("ListAssistHistoriesResponse.TotalCount"));

		List<HistoriesItem> histories = new ArrayList<HistoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAssistHistoriesResponse.Histories.Length"); i++) {
			HistoriesItem historiesItem = new HistoriesItem();
			historiesItem.setID(_ctx.stringValue("ListAssistHistoriesResponse.Histories["+ i +"].ID"));
			historiesItem.setDeviceName(_ctx.stringValue("ListAssistHistoriesResponse.Histories["+ i +"].DeviceName"));
			historiesItem.setStartTime(_ctx.longValue("ListAssistHistoriesResponse.Histories["+ i +"].StartTime"));
			historiesItem.setEndTime(_ctx.longValue("ListAssistHistoriesResponse.Histories["+ i +"].EndTime"));
			historiesItem.setDeviceId(_ctx.stringValue("ListAssistHistoriesResponse.Histories["+ i +"].DeviceId"));
			historiesItem.setSerialNumber(_ctx.stringValue("ListAssistHistoriesResponse.Histories["+ i +"].SerialNumber"));
			historiesItem.setHardwareId(_ctx.stringValue("ListAssistHistoriesResponse.Histories["+ i +"].HardwareId"));
			historiesItem.setUUID(_ctx.stringValue("ListAssistHistoriesResponse.Histories["+ i +"].UUID"));
			historiesItem.setVIN(_ctx.stringValue("ListAssistHistoriesResponse.Histories["+ i +"].VIN"));
			historiesItem.setUID(_ctx.stringValue("ListAssistHistoriesResponse.Histories["+ i +"].UID"));
			historiesItem.setUNAME(_ctx.stringValue("ListAssistHistoriesResponse.Histories["+ i +"].UNAME"));

			histories.add(historiesItem);
		}
		listAssistHistoriesResponse.setHistories(histories);
	 
	 	return listAssistHistoriesResponse;
	}
}