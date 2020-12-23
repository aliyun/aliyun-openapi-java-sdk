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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.UnbindDeviceResponse;
import com.aliyuncs.cdrs.model.v20201101.UnbindDeviceResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindDeviceResponseUnmarshaller {

	public static UnbindDeviceResponse unmarshall(UnbindDeviceResponse unbindDeviceResponse, UnmarshallerContext _ctx) {
		
		unbindDeviceResponse.setRequestId(_ctx.stringValue("UnbindDeviceResponse.RequestId"));
		unbindDeviceResponse.setCode(_ctx.stringValue("UnbindDeviceResponse.Code"));
		unbindDeviceResponse.setMessage(_ctx.stringValue("UnbindDeviceResponse.Message"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("UnbindDeviceResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setSuccess(_ctx.booleanValue("UnbindDeviceResponse.Data["+ i +"].Success"));
			datas.setCode(_ctx.stringValue("UnbindDeviceResponse.Data["+ i +"].Code"));
			datas.setMessage(_ctx.stringValue("UnbindDeviceResponse.Data["+ i +"].Message"));
			datas.setDeviceId(_ctx.stringValue("UnbindDeviceResponse.Data["+ i +"].DeviceId"));

			data.add(datas);
		}
		unbindDeviceResponse.setData(data);
	 
	 	return unbindDeviceResponse;
	}
}