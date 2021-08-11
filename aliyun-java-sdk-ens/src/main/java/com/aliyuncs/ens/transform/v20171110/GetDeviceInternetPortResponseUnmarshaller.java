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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.GetDeviceInternetPortResponse;
import com.aliyuncs.ens.model.v20171110.GetDeviceInternetPortResponse.NetworkInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceInternetPortResponseUnmarshaller {

	public static GetDeviceInternetPortResponse unmarshall(GetDeviceInternetPortResponse getDeviceInternetPortResponse, UnmarshallerContext _ctx) {
		
		getDeviceInternetPortResponse.setRequestId(_ctx.stringValue("GetDeviceInternetPortResponse.RequestId"));
		getDeviceInternetPortResponse.setInstanceId(_ctx.stringValue("GetDeviceInternetPortResponse.InstanceId"));

		List<NetworkInfoItem> networkInfo = new ArrayList<NetworkInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceInternetPortResponse.NetworkInfo.Length"); i++) {
			NetworkInfoItem networkInfoItem = new NetworkInfoItem();
			networkInfoItem.setInternalIp(_ctx.stringValue("GetDeviceInternetPortResponse.NetworkInfo["+ i +"].InternalIp"));
			networkInfoItem.setInternalPort(_ctx.stringValue("GetDeviceInternetPortResponse.NetworkInfo["+ i +"].InternalPort"));
			networkInfoItem.setExternalIp(_ctx.stringValue("GetDeviceInternetPortResponse.NetworkInfo["+ i +"].ExternalIp"));
			networkInfoItem.setExternalPort(_ctx.stringValue("GetDeviceInternetPortResponse.NetworkInfo["+ i +"].ExternalPort"));
			networkInfoItem.setISP(_ctx.stringValue("GetDeviceInternetPortResponse.NetworkInfo["+ i +"].ISP"));
			networkInfoItem.setStatus(_ctx.stringValue("GetDeviceInternetPortResponse.NetworkInfo["+ i +"].Status"));

			networkInfo.add(networkInfoItem);
		}
		getDeviceInternetPortResponse.setNetworkInfo(networkInfo);
	 
	 	return getDeviceInternetPortResponse;
	}
}