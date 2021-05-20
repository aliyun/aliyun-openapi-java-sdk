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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.TransferDeviceInstanceResponse;
import com.aliyuncs.linkvisual.model.v20180120.TransferDeviceInstanceResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.TransferDeviceInstanceResponse.Data.FailedListItem;
import com.aliyuncs.linkvisual.model.v20180120.TransferDeviceInstanceResponse.Data.SuccessListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransferDeviceInstanceResponseUnmarshaller {

	public static TransferDeviceInstanceResponse unmarshall(TransferDeviceInstanceResponse transferDeviceInstanceResponse, UnmarshallerContext _ctx) {
		
		transferDeviceInstanceResponse.setRequestId(_ctx.stringValue("TransferDeviceInstanceResponse.RequestId"));
		transferDeviceInstanceResponse.setSuccess(_ctx.booleanValue("TransferDeviceInstanceResponse.Success"));
		transferDeviceInstanceResponse.setErrorMessage(_ctx.stringValue("TransferDeviceInstanceResponse.ErrorMessage"));
		transferDeviceInstanceResponse.setCode(_ctx.stringValue("TransferDeviceInstanceResponse.Code"));

		Data data = new Data();

		List<SuccessListItem> successList = new ArrayList<SuccessListItem>();
		for (int i = 0; i < _ctx.lengthValue("TransferDeviceInstanceResponse.Data.SuccessList.Length"); i++) {
			SuccessListItem successListItem = new SuccessListItem();
			successListItem.setDeviceName(_ctx.stringValue("TransferDeviceInstanceResponse.Data.SuccessList["+ i +"].DeviceName"));
			successListItem.setMessage(_ctx.stringValue("TransferDeviceInstanceResponse.Data.SuccessList["+ i +"].Message"));

			successList.add(successListItem);
		}
		data.setSuccessList(successList);

		List<FailedListItem> failedList = new ArrayList<FailedListItem>();
		for (int i = 0; i < _ctx.lengthValue("TransferDeviceInstanceResponse.Data.FailedList.Length"); i++) {
			FailedListItem failedListItem = new FailedListItem();
			failedListItem.setDeviceName(_ctx.stringValue("TransferDeviceInstanceResponse.Data.FailedList["+ i +"].DeviceName"));
			failedListItem.setMessage(_ctx.stringValue("TransferDeviceInstanceResponse.Data.FailedList["+ i +"].Message"));

			failedList.add(failedListItem);
		}
		data.setFailedList(failedList);
		transferDeviceInstanceResponse.setData(data);
	 
	 	return transferDeviceInstanceResponse;
	}
}