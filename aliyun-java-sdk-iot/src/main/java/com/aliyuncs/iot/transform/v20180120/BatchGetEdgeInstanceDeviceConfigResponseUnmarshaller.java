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

import com.aliyuncs.iot.model.v20180120.BatchGetEdgeInstanceDeviceConfigResponse;
import com.aliyuncs.iot.model.v20180120.BatchGetEdgeInstanceDeviceConfigResponse.DeviceConfig;
import com.aliyuncs.iot.model.v20180120.BatchGetEdgeInstanceDeviceConfigResponse.DeviceConfig.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetEdgeInstanceDeviceConfigResponseUnmarshaller {

	public static BatchGetEdgeInstanceDeviceConfigResponse unmarshall(BatchGetEdgeInstanceDeviceConfigResponse batchGetEdgeInstanceDeviceConfigResponse, UnmarshallerContext _ctx) {
		
		batchGetEdgeInstanceDeviceConfigResponse.setRequestId(_ctx.stringValue("BatchGetEdgeInstanceDeviceConfigResponse.RequestId"));
		batchGetEdgeInstanceDeviceConfigResponse.setSuccess(_ctx.booleanValue("BatchGetEdgeInstanceDeviceConfigResponse.Success"));
		batchGetEdgeInstanceDeviceConfigResponse.setCode(_ctx.stringValue("BatchGetEdgeInstanceDeviceConfigResponse.Code"));
		batchGetEdgeInstanceDeviceConfigResponse.setErrorMessage(_ctx.stringValue("BatchGetEdgeInstanceDeviceConfigResponse.ErrorMessage"));

		List<DeviceConfig> deviceConfigList = new ArrayList<DeviceConfig>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetEdgeInstanceDeviceConfigResponse.DeviceConfigList.Length"); i++) {
			DeviceConfig deviceConfig = new DeviceConfig();
			deviceConfig.setIotId(_ctx.stringValue("BatchGetEdgeInstanceDeviceConfigResponse.DeviceConfigList["+ i +"].IotId"));

			Config config = new Config();
			config.setFormat(_ctx.stringValue("BatchGetEdgeInstanceDeviceConfigResponse.DeviceConfigList["+ i +"].Config.Format"));
			config.setContent(_ctx.stringValue("BatchGetEdgeInstanceDeviceConfigResponse.DeviceConfigList["+ i +"].Config.Content"));
			deviceConfig.setConfig(config);

			deviceConfigList.add(deviceConfig);
		}
		batchGetEdgeInstanceDeviceConfigResponse.setDeviceConfigList(deviceConfigList);
	 
	 	return batchGetEdgeInstanceDeviceConfigResponse;
	}
}