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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.BindDeviceResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.BindDeviceResponse.Data;
import com.aliyuncs.mindlive_biz.model.v20210214.BindDeviceResponse.Data.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindDeviceResponseUnmarshaller {

	public static BindDeviceResponse unmarshall(BindDeviceResponse bindDeviceResponse, UnmarshallerContext _ctx) {
		
		bindDeviceResponse.setRequestId(_ctx.stringValue("BindDeviceResponse.RequestId"));
		bindDeviceResponse.setErrorMessage(_ctx.stringValue("BindDeviceResponse.ErrorMessage"));
		bindDeviceResponse.setSuccess(_ctx.booleanValue("BindDeviceResponse.Success"));
		bindDeviceResponse.setErrorCode(_ctx.stringValue("BindDeviceResponse.ErrorCode"));

		Data data = new Data();

		Service service = new Service();
		service.setServiceEffectAt(_ctx.longValue("BindDeviceResponse.Data.Service.ServiceEffectAt"));
		service.setServiceExpireAt(_ctx.longValue("BindDeviceResponse.Data.Service.ServiceExpireAt"));
		service.setServicePackName(_ctx.stringValue("BindDeviceResponse.Data.Service.ServicePackName"));
		data.setService(service);
		bindDeviceResponse.setData(data);
	 
	 	return bindDeviceResponse;
	}
}