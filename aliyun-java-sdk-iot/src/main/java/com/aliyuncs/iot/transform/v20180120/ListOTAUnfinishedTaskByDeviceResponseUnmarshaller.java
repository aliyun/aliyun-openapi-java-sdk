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

import com.aliyuncs.iot.model.v20180120.ListOTAUnfinishedTaskByDeviceResponse;
import com.aliyuncs.iot.model.v20180120.ListOTAUnfinishedTaskByDeviceResponse.SimpleOTATaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOTAUnfinishedTaskByDeviceResponseUnmarshaller {

	public static ListOTAUnfinishedTaskByDeviceResponse unmarshall(ListOTAUnfinishedTaskByDeviceResponse listOTAUnfinishedTaskByDeviceResponse, UnmarshallerContext _ctx) {
		
		listOTAUnfinishedTaskByDeviceResponse.setRequestId(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.RequestId"));
		listOTAUnfinishedTaskByDeviceResponse.setCode(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Code"));
		listOTAUnfinishedTaskByDeviceResponse.setErrorMessage(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.ErrorMessage"));
		listOTAUnfinishedTaskByDeviceResponse.setSuccess(_ctx.booleanValue("ListOTAUnfinishedTaskByDeviceResponse.Success"));

		List<SimpleOTATaskInfo> data = new ArrayList<SimpleOTATaskInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListOTAUnfinishedTaskByDeviceResponse.Data.Length"); i++) {
			SimpleOTATaskInfo simpleOTATaskInfo = new SimpleOTATaskInfo();
			simpleOTATaskInfo.setModuleName(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].ModuleName"));
			simpleOTATaskInfo.setProductName(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].ProductName"));
			simpleOTATaskInfo.setDeviceName(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].DeviceName"));
			simpleOTATaskInfo.setUtcCreate(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].UtcCreate"));
			simpleOTATaskInfo.setProductKey(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].ProductKey"));
			simpleOTATaskInfo.setTaskStatus(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].TaskStatus"));
			simpleOTATaskInfo.setUtcModified(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].UtcModified"));
			simpleOTATaskInfo.setJobId(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].JobId"));
			simpleOTATaskInfo.setSrcVersion(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].SrcVersion"));
			simpleOTATaskInfo.setTaskId(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].TaskId"));
			simpleOTATaskInfo.setDestVersion(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].DestVersion"));
			simpleOTATaskInfo.setFirmwareId(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].FirmwareId"));
			simpleOTATaskInfo.setIotId(_ctx.stringValue("ListOTAUnfinishedTaskByDeviceResponse.Data["+ i +"].IotId"));

			data.add(simpleOTATaskInfo);
		}
		listOTAUnfinishedTaskByDeviceResponse.setData(data);
	 
	 	return listOTAUnfinishedTaskByDeviceResponse;
	}
}