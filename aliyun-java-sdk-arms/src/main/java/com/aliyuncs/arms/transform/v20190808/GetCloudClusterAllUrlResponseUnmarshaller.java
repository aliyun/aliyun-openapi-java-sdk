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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetCloudClusterAllUrlResponse;
import com.aliyuncs.arms.model.v20190808.GetCloudClusterAllUrlResponse.DataItem;
import com.aliyuncs.arms.model.v20190808.GetCloudClusterAllUrlResponse.DataItem.RemoteUrl;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCloudClusterAllUrlResponseUnmarshaller {

	public static GetCloudClusterAllUrlResponse unmarshall(GetCloudClusterAllUrlResponse getCloudClusterAllUrlResponse, UnmarshallerContext _ctx) {
		
		getCloudClusterAllUrlResponse.setRequestId(_ctx.stringValue("GetCloudClusterAllUrlResponse.RequestId"));
		getCloudClusterAllUrlResponse.setCode(_ctx.integerValue("GetCloudClusterAllUrlResponse.Code"));
		getCloudClusterAllUrlResponse.setMessage(_ctx.stringValue("GetCloudClusterAllUrlResponse.Message"));
		getCloudClusterAllUrlResponse.setSuccess(_ctx.booleanValue("GetCloudClusterAllUrlResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCloudClusterAllUrlResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setProductCode(_ctx.stringValue("GetCloudClusterAllUrlResponse.Data["+ i +"].ProductCode"));
			dataItem.setRegion(_ctx.stringValue("GetCloudClusterAllUrlResponse.Data["+ i +"].Region"));

			RemoteUrl remoteUrl = new RemoteUrl();
			remoteUrl.setRemoteWriteUrl(_ctx.stringValue("GetCloudClusterAllUrlResponse.Data["+ i +"].RemoteUrl.RemoteWriteUrl"));
			remoteUrl.setInternetRemoteWriteUrl(_ctx.stringValue("GetCloudClusterAllUrlResponse.Data["+ i +"].RemoteUrl.InternetRemoteWriteUrl"));
			remoteUrl.setRemoteReadUrl(_ctx.stringValue("GetCloudClusterAllUrlResponse.Data["+ i +"].RemoteUrl.RemoteReadUrl"));
			remoteUrl.setInternetRemoteReadUrl(_ctx.stringValue("GetCloudClusterAllUrlResponse.Data["+ i +"].RemoteUrl.InternetRemoteReadUrl"));
			remoteUrl.setGrafanaUrl(_ctx.stringValue("GetCloudClusterAllUrlResponse.Data["+ i +"].RemoteUrl.GrafanaUrl"));
			remoteUrl.setInternetGrafanaUrl(_ctx.stringValue("GetCloudClusterAllUrlResponse.Data["+ i +"].RemoteUrl.InternetGrafanaUrl"));
			remoteUrl.setInternetPushGatewayUrl(_ctx.stringValue("GetCloudClusterAllUrlResponse.Data["+ i +"].RemoteUrl.InternetPushGatewayUrl"));
			remoteUrl.setPushGatewayUrl(_ctx.stringValue("GetCloudClusterAllUrlResponse.Data["+ i +"].RemoteUrl.PushGatewayUrl"));
			remoteUrl.setAuthToken(_ctx.booleanValue("GetCloudClusterAllUrlResponse.Data["+ i +"].RemoteUrl.AuthToken"));
			remoteUrl.setToken(_ctx.stringValue("GetCloudClusterAllUrlResponse.Data["+ i +"].RemoteUrl.Token"));
			dataItem.setRemoteUrl(remoteUrl);

			data.add(dataItem);
		}
		getCloudClusterAllUrlResponse.setData(data);
	 
	 	return getCloudClusterAllUrlResponse;
	}
}