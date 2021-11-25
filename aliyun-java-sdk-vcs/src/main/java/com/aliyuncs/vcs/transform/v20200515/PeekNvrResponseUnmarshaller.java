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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.PeekNvrResponse;
import com.aliyuncs.vcs.model.v20200515.PeekNvrResponse.Data;
import com.aliyuncs.vcs.model.v20200515.PeekNvrResponse.Data.SubDevice;
import com.aliyuncs.transform.UnmarshallerContext;


public class PeekNvrResponseUnmarshaller {

	public static PeekNvrResponse unmarshall(PeekNvrResponse peekNvrResponse, UnmarshallerContext _ctx) {
		
		peekNvrResponse.setRequestId(_ctx.stringValue("PeekNvrResponse.RequestId"));
		peekNvrResponse.setCode(_ctx.stringValue("PeekNvrResponse.Code"));
		peekNvrResponse.setMessage(_ctx.stringValue("PeekNvrResponse.Message"));

		Data data = new Data();
		data.setIdleCount(_ctx.longValue("PeekNvrResponse.Data.IdleCount"));

		List<SubDevice> subDeviceList = new ArrayList<SubDevice>();
		for (int i = 0; i < _ctx.lengthValue("PeekNvrResponse.Data.SubDeviceList.Length"); i++) {
			SubDevice subDevice = new SubDevice();
			subDevice.setSubDeviceId(_ctx.stringValue("PeekNvrResponse.Data.SubDeviceList["+ i +"].SubDeviceId"));
			subDevice.setSubDeviceNum(_ctx.stringValue("PeekNvrResponse.Data.SubDeviceList["+ i +"].SubDeviceNum"));
			subDevice.setSubDeviceName(_ctx.stringValue("PeekNvrResponse.Data.SubDeviceList["+ i +"].SubDeviceName"));
			subDevice.setSubDeviceStatus(_ctx.stringValue("PeekNvrResponse.Data.SubDeviceList["+ i +"].SubDeviceStatus"));
			subDevice.setAssociatedPlatform(_ctx.stringValue("PeekNvrResponse.Data.SubDeviceList["+ i +"].AssociatedPlatform"));

			subDeviceList.add(subDevice);
		}
		data.setSubDeviceList(subDeviceList);
		peekNvrResponse.setData(data);
	 
	 	return peekNvrResponse;
	}
}