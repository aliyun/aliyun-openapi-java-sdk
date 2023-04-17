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

package com.aliyuncs.energyexpertexternal.transform.v20220923;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.energyexpertexternal.model.v20220923.GetDeviceInfoResponse;
import com.aliyuncs.energyexpertexternal.model.v20220923.GetDeviceInfoResponse.Data;
import com.aliyuncs.energyexpertexternal.model.v20220923.GetDeviceInfoResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceInfoResponseUnmarshaller {

	public static GetDeviceInfoResponse unmarshall(GetDeviceInfoResponse getDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		getDeviceInfoResponse.setRequestId(_ctx.stringValue("GetDeviceInfoResponse.requestId"));
		getDeviceInfoResponse.setHttpCode(_ctx.integerValue("GetDeviceInfoResponse.httpCode"));
		getDeviceInfoResponse.setCode(_ctx.stringValue("GetDeviceInfoResponse.code"));
		getDeviceInfoResponse.setSuccess(_ctx.booleanValue("GetDeviceInfoResponse.success"));

		Data data = new Data();
		data.setDeviceId(_ctx.stringValue("GetDeviceInfoResponse.data.deviceId"));
		data.setDeviceName(_ctx.stringValue("GetDeviceInfoResponse.data.deviceName"));
		data.setFirstTypeName(_ctx.stringValue("GetDeviceInfoResponse.data.firstTypeName"));
		data.setSecondTypeName(_ctx.stringValue("GetDeviceInfoResponse.data.secondTypeName"));

		List<Record> recordList = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceInfoResponse.data.recordList.Length"); i++) {
			Record record = new Record();
			record.setStatisticsDate(_ctx.stringValue("GetDeviceInfoResponse.data.recordList["+ i +"].statisticsDate"));
			record.setParamName(_ctx.stringValue("GetDeviceInfoResponse.data.recordList["+ i +"].paramName"));
			record.setUnit(_ctx.stringValue("GetDeviceInfoResponse.data.recordList["+ i +"].unit"));
			record.setIdentifier(_ctx.stringValue("GetDeviceInfoResponse.data.recordList["+ i +"].identifier"));
			record.setType(_ctx.stringValue("GetDeviceInfoResponse.data.recordList["+ i +"].type"));
			record.setValue(_ctx.doubleValue("GetDeviceInfoResponse.data.recordList["+ i +"].value"));

			recordList.add(record);
		}
		data.setRecordList(recordList);
		getDeviceInfoResponse.setData(data);
	 
	 	return getDeviceInfoResponse;
	}
}