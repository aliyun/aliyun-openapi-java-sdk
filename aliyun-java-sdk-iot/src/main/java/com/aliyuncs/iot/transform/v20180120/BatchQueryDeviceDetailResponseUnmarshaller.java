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

import com.aliyuncs.iot.model.v20180120.BatchQueryDeviceDetailResponse;
import com.aliyuncs.iot.model.v20180120.BatchQueryDeviceDetailResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchQueryDeviceDetailResponseUnmarshaller {

	public static BatchQueryDeviceDetailResponse unmarshall(BatchQueryDeviceDetailResponse batchQueryDeviceDetailResponse, UnmarshallerContext _ctx) {
		
		batchQueryDeviceDetailResponse.setRequestId(_ctx.stringValue("BatchQueryDeviceDetailResponse.RequestId"));
		batchQueryDeviceDetailResponse.setCode(_ctx.stringValue("BatchQueryDeviceDetailResponse.Code"));
		batchQueryDeviceDetailResponse.setErrorMessage(_ctx.stringValue("BatchQueryDeviceDetailResponse.ErrorMessage"));
		batchQueryDeviceDetailResponse.setSuccess(_ctx.booleanValue("BatchQueryDeviceDetailResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchQueryDeviceDetailResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatus(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].Status"));
			dataItem.setUtcActive(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].UtcActive"));
			dataItem.setProductName(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].ProductName"));
			dataItem.setDeviceName(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].DeviceName"));
			dataItem.setUtcCreate(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].UtcCreate"));
			dataItem.setFirmwareVersion(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].FirmwareVersion"));
			dataItem.setProductKey(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].ProductKey"));
			dataItem.setNodeType(_ctx.integerValue("BatchQueryDeviceDetailResponse.Data["+ i +"].NodeType"));
			dataItem.setRegion(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].Region"));
			dataItem.setDeviceSecret(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].DeviceSecret"));
			dataItem.setGmtCreate(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtActive(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].GmtActive"));
			dataItem.setNickname(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].Nickname"));
			dataItem.setIotId(_ctx.stringValue("BatchQueryDeviceDetailResponse.Data["+ i +"].IotId"));

			data.add(dataItem);
		}
		batchQueryDeviceDetailResponse.setData(data);
	 
	 	return batchQueryDeviceDetailResponse;
	}
}