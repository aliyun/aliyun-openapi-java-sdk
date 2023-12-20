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

import com.aliyuncs.linkvisual.model.v20180120.BatchQueryVisionDeviceInfoResponse;
import com.aliyuncs.linkvisual.model.v20180120.BatchQueryVisionDeviceInfoResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.BatchQueryVisionDeviceInfoResponse.Data.DeviceInfo;
import com.aliyuncs.linkvisual.model.v20180120.BatchQueryVisionDeviceInfoResponse.Data.DeviceInfo.GbDeviceInfo;
import com.aliyuncs.linkvisual.model.v20180120.BatchQueryVisionDeviceInfoResponse.Data.DeviceInfo.RtmpDeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchQueryVisionDeviceInfoResponseUnmarshaller {

	public static BatchQueryVisionDeviceInfoResponse unmarshall(BatchQueryVisionDeviceInfoResponse batchQueryVisionDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		batchQueryVisionDeviceInfoResponse.setRequestId(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.RequestId"));
		batchQueryVisionDeviceInfoResponse.setCode(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.Code"));
		batchQueryVisionDeviceInfoResponse.setErrorMessage(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.ErrorMessage"));
		batchQueryVisionDeviceInfoResponse.setSuccess(_ctx.booleanValue("BatchQueryVisionDeviceInfoResponse.Success"));

		Data data = new Data();

		List<DeviceInfo> deviceInfoList = new ArrayList<DeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList.Length"); i++) {
			DeviceInfo deviceInfo = new DeviceInfo();
			deviceInfo.setDescription(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].Description"));
			deviceInfo.setDeviceType(_ctx.integerValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].DeviceType"));
			deviceInfo.setIotId(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].IotId"));

			GbDeviceInfo gbDeviceInfo = new GbDeviceInfo();
			gbDeviceInfo.setGbId(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].GbDeviceInfo.GbId"));
			gbDeviceInfo.setPassword(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].GbDeviceInfo.Password"));
			gbDeviceInfo.setNickName(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].GbDeviceInfo.NickName"));
			gbDeviceInfo.setSubProductKey(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].GbDeviceInfo.SubProductKey"));
			gbDeviceInfo.setDeviceProtocol(_ctx.integerValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].GbDeviceInfo.DeviceProtocol"));
			gbDeviceInfo.setNetProtocol(_ctx.integerValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].GbDeviceInfo.NetProtocol"));
			deviceInfo.setGbDeviceInfo(gbDeviceInfo);

			RtmpDeviceInfo rtmpDeviceInfo = new RtmpDeviceInfo();
			rtmpDeviceInfo.setStreamStatus(_ctx.integerValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].RtmpDeviceInfo.StreamStatus"));
			rtmpDeviceInfo.setPushKeyExpireTime(_ctx.integerValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].RtmpDeviceInfo.PushKeyExpireTime"));
			rtmpDeviceInfo.setStreamName(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].RtmpDeviceInfo.StreamName"));
			rtmpDeviceInfo.setPushAuthKey(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].RtmpDeviceInfo.PushAuthKey"));
			rtmpDeviceInfo.setPullAuthKey(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].RtmpDeviceInfo.PullAuthKey"));
			rtmpDeviceInfo.setPullKeyExpireTime(_ctx.integerValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].RtmpDeviceInfo.PullKeyExpireTime"));
			rtmpDeviceInfo.setPushUrlSample(_ctx.stringValue("BatchQueryVisionDeviceInfoResponse.Data.DeviceInfoList["+ i +"].RtmpDeviceInfo.PushUrlSample"));
			deviceInfo.setRtmpDeviceInfo(rtmpDeviceInfo);

			deviceInfoList.add(deviceInfo);
		}
		data.setDeviceInfoList(deviceInfoList);
		batchQueryVisionDeviceInfoResponse.setData(data);
	 
	 	return batchQueryVisionDeviceInfoResponse;
	}
}