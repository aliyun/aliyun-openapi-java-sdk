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

import com.aliyuncs.cdrs.model.v20201101.BindDeviceResponse;
import com.aliyuncs.cdrs.model.v20201101.BindDeviceResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindDeviceResponseUnmarshaller {

	public static BindDeviceResponse unmarshall(BindDeviceResponse bindDeviceResponse, UnmarshallerContext _ctx) {
		
		bindDeviceResponse.setRequestId(_ctx.stringValue("BindDeviceResponse.RequestId"));
		bindDeviceResponse.setCode(_ctx.stringValue("BindDeviceResponse.Code"));
		bindDeviceResponse.setMessage(_ctx.stringValue("BindDeviceResponse.Message"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("BindDeviceResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setSuccess(_ctx.booleanValue("BindDeviceResponse.Data["+ i +"].Success"));
			datas.setCode(_ctx.stringValue("BindDeviceResponse.Data["+ i +"].Code"));
			datas.setMessage(_ctx.stringValue("BindDeviceResponse.Data["+ i +"].Message"));
			datas.setDeviceId(_ctx.stringValue("BindDeviceResponse.Data["+ i +"].DeviceId"));

			data.add(datas);
		}
		bindDeviceResponse.setData(data);
	 
	 	return bindDeviceResponse;
	}
}