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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.ListDeviceGroupAuthorizedBizChainResponse;
import com.aliyuncs.lto.model.v20210707.ListDeviceGroupAuthorizedBizChainResponse.DeviceGroupAuthorizedInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceGroupAuthorizedBizChainResponseUnmarshaller {

	public static ListDeviceGroupAuthorizedBizChainResponse unmarshall(ListDeviceGroupAuthorizedBizChainResponse listDeviceGroupAuthorizedBizChainResponse, UnmarshallerContext _ctx) {
		
		listDeviceGroupAuthorizedBizChainResponse.setRequestId(_ctx.stringValue("ListDeviceGroupAuthorizedBizChainResponse.RequestId"));
		listDeviceGroupAuthorizedBizChainResponse.setCode(_ctx.stringValue("ListDeviceGroupAuthorizedBizChainResponse.Code"));
		listDeviceGroupAuthorizedBizChainResponse.setHttpStatusCode(_ctx.integerValue("ListDeviceGroupAuthorizedBizChainResponse.HttpStatusCode"));
		listDeviceGroupAuthorizedBizChainResponse.setMessage(_ctx.stringValue("ListDeviceGroupAuthorizedBizChainResponse.Message"));
		listDeviceGroupAuthorizedBizChainResponse.setSuccess(_ctx.booleanValue("ListDeviceGroupAuthorizedBizChainResponse.Success"));

		List<DeviceGroupAuthorizedInfo> data = new ArrayList<DeviceGroupAuthorizedInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceGroupAuthorizedBizChainResponse.Data.Length"); i++) {
			DeviceGroupAuthorizedInfo deviceGroupAuthorizedInfo = new DeviceGroupAuthorizedInfo();
			deviceGroupAuthorizedInfo.setBizChainName(_ctx.stringValue("ListDeviceGroupAuthorizedBizChainResponse.Data["+ i +"].BizChainName"));
			deviceGroupAuthorizedInfo.setBizChainId(_ctx.stringValue("ListDeviceGroupAuthorizedBizChainResponse.Data["+ i +"].BizChainId"));
			deviceGroupAuthorizedInfo.setAuthorized(_ctx.booleanValue("ListDeviceGroupAuthorizedBizChainResponse.Data["+ i +"].Authorized"));
			deviceGroupAuthorizedInfo.setBlockChainType(_ctx.stringValue("ListDeviceGroupAuthorizedBizChainResponse.Data["+ i +"].BlockChainType"));

			data.add(deviceGroupAuthorizedInfo);
		}
		listDeviceGroupAuthorizedBizChainResponse.setData(data);
	 
	 	return listDeviceGroupAuthorizedBizChainResponse;
	}
}