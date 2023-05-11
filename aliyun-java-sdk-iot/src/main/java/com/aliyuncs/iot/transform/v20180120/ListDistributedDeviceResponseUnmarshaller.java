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

import com.aliyuncs.iot.model.v20180120.ListDistributedDeviceResponse;
import com.aliyuncs.iot.model.v20180120.ListDistributedDeviceResponse.Data;
import com.aliyuncs.iot.model.v20180120.ListDistributedDeviceResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDistributedDeviceResponseUnmarshaller {

	public static ListDistributedDeviceResponse unmarshall(ListDistributedDeviceResponse listDistributedDeviceResponse, UnmarshallerContext _ctx) {
		
		listDistributedDeviceResponse.setRequestId(_ctx.stringValue("ListDistributedDeviceResponse.RequestId"));
		listDistributedDeviceResponse.setSuccess(_ctx.booleanValue("ListDistributedDeviceResponse.Success"));
		listDistributedDeviceResponse.setCode(_ctx.stringValue("ListDistributedDeviceResponse.Code"));
		listDistributedDeviceResponse.setErrorMessage(_ctx.stringValue("ListDistributedDeviceResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListDistributedDeviceResponse.Data.Total"));

		List<Items> info = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("ListDistributedDeviceResponse.Data.Info.Length"); i++) {
			Items items = new Items();
			items.setSourceUid(_ctx.stringValue("ListDistributedDeviceResponse.Data.Info["+ i +"].SourceUid"));
			items.setTargetUid(_ctx.stringValue("ListDistributedDeviceResponse.Data.Info["+ i +"].TargetUid"));
			items.setProductKey(_ctx.stringValue("ListDistributedDeviceResponse.Data.Info["+ i +"].ProductKey"));
			items.setDeviceName(_ctx.stringValue("ListDistributedDeviceResponse.Data.Info["+ i +"].DeviceName"));
			items.setSourceInstanceId(_ctx.stringValue("ListDistributedDeviceResponse.Data.Info["+ i +"].SourceInstanceId"));
			items.setTargetInstanceId(_ctx.stringValue("ListDistributedDeviceResponse.Data.Info["+ i +"].TargetInstanceId"));
			items.setGmtCreate(_ctx.longValue("ListDistributedDeviceResponse.Data.Info["+ i +"].GmtCreate"));
			items.setTargetAliyunId(_ctx.stringValue("ListDistributedDeviceResponse.Data.Info["+ i +"].TargetAliyunId"));
			items.setSourceRegion(_ctx.stringValue("ListDistributedDeviceResponse.Data.Info["+ i +"].SourceRegion"));
			items.setTargetRegion(_ctx.stringValue("ListDistributedDeviceResponse.Data.Info["+ i +"].TargetRegion"));
			items.setSourceInstanceName(_ctx.stringValue("ListDistributedDeviceResponse.Data.Info["+ i +"].SourceInstanceName"));
			items.setTargetInstanceName(_ctx.stringValue("ListDistributedDeviceResponse.Data.Info["+ i +"].TargetInstanceName"));
			items.setGmtModified(_ctx.longValue("ListDistributedDeviceResponse.Data.Info["+ i +"].GmtModified"));

			info.add(items);
		}
		data.setInfo(info);
		listDistributedDeviceResponse.setData(data);
	 
	 	return listDistributedDeviceResponse;
	}
}