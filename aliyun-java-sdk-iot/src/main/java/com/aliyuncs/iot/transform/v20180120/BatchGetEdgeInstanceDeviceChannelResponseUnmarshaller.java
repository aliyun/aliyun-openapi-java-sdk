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

import com.aliyuncs.iot.model.v20180120.BatchGetEdgeInstanceDeviceChannelResponse;
import com.aliyuncs.iot.model.v20180120.BatchGetEdgeInstanceDeviceChannelResponse.DeviceChannel;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetEdgeInstanceDeviceChannelResponseUnmarshaller {

	public static BatchGetEdgeInstanceDeviceChannelResponse unmarshall(BatchGetEdgeInstanceDeviceChannelResponse batchGetEdgeInstanceDeviceChannelResponse, UnmarshallerContext _ctx) {
		
		batchGetEdgeInstanceDeviceChannelResponse.setRequestId(_ctx.stringValue("BatchGetEdgeInstanceDeviceChannelResponse.RequestId"));
		batchGetEdgeInstanceDeviceChannelResponse.setSuccess(_ctx.booleanValue("BatchGetEdgeInstanceDeviceChannelResponse.Success"));
		batchGetEdgeInstanceDeviceChannelResponse.setCode(_ctx.stringValue("BatchGetEdgeInstanceDeviceChannelResponse.Code"));
		batchGetEdgeInstanceDeviceChannelResponse.setErrorMessage(_ctx.stringValue("BatchGetEdgeInstanceDeviceChannelResponse.ErrorMessage"));

		List<DeviceChannel> deviceChannelList = new ArrayList<DeviceChannel>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetEdgeInstanceDeviceChannelResponse.DeviceChannelList.Length"); i++) {
			DeviceChannel deviceChannel = new DeviceChannel();
			deviceChannel.setChannelId(_ctx.stringValue("BatchGetEdgeInstanceDeviceChannelResponse.DeviceChannelList["+ i +"].ChannelId"));
			deviceChannel.setChannelName(_ctx.stringValue("BatchGetEdgeInstanceDeviceChannelResponse.DeviceChannelList["+ i +"].ChannelName"));
			deviceChannel.setIotId(_ctx.stringValue("BatchGetEdgeInstanceDeviceChannelResponse.DeviceChannelList["+ i +"].IotId"));

			deviceChannelList.add(deviceChannel);
		}
		batchGetEdgeInstanceDeviceChannelResponse.setDeviceChannelList(deviceChannelList);
	 
	 	return batchGetEdgeInstanceDeviceChannelResponse;
	}
}