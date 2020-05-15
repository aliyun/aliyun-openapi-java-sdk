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

package com.aliyuncs.lrg.transform.v20191010;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lrg.model.v20191010.GetRunningMachineListResponse;
import com.aliyuncs.lrg.model.v20191010.GetRunningMachineListResponse.DataItem;
import com.aliyuncs.lrg.model.v20191010.GetRunningMachineListResponse.DataItem.MessagesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRunningMachineListResponseUnmarshaller {

	public static GetRunningMachineListResponse unmarshall(GetRunningMachineListResponse getRunningMachineListResponse, UnmarshallerContext _ctx) {
		
		getRunningMachineListResponse.setRequestId(_ctx.stringValue("GetRunningMachineListResponse.RequestId"));
		getRunningMachineListResponse.setStatus(_ctx.stringValue("GetRunningMachineListResponse.Status"));
		getRunningMachineListResponse.setDetails(_ctx.stringValue("GetRunningMachineListResponse.Details"));
		getRunningMachineListResponse.setReason(_ctx.stringValue("GetRunningMachineListResponse.Reason"));
		getRunningMachineListResponse.setErrorCode(_ctx.stringValue("GetRunningMachineListResponse.ErrorCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRunningMachineListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setIp(_ctx.stringValue("GetRunningMachineListResponse.Data["+ i +"].Ip"));
			dataItem.setHostName(_ctx.stringValue("GetRunningMachineListResponse.Data["+ i +"].HostName"));
			dataItem.setStatus(_ctx.stringValue("GetRunningMachineListResponse.Data["+ i +"].Status"));
			dataItem.setStatusEnumeration(_ctx.stringValue("GetRunningMachineListResponse.Data["+ i +"].StatusEnumeration"));
			dataItem.setType(_ctx.stringValue("GetRunningMachineListResponse.Data["+ i +"].Type"));

			List<MessagesItem> messages = new ArrayList<MessagesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetRunningMachineListResponse.Data["+ i +"].Messages.Length"); j++) {
				MessagesItem messagesItem = new MessagesItem();
				messagesItem.setModule(_ctx.stringValue("GetRunningMachineListResponse.Data["+ i +"].Messages["+ j +"].Module"));
				messagesItem.setMessage(_ctx.stringValue("GetRunningMachineListResponse.Data["+ i +"].Messages["+ j +"].Message"));
				messagesItem.setOwner(_ctx.stringValue("GetRunningMachineListResponse.Data["+ i +"].Messages["+ j +"].Owner"));

				messages.add(messagesItem);
			}
			dataItem.setMessages(messages);

			data.add(dataItem);
		}
		getRunningMachineListResponse.setData(data);
	 
	 	return getRunningMachineListResponse;
	}
}