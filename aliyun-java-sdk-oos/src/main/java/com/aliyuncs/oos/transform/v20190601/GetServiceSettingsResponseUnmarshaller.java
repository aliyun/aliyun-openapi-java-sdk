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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.GetServiceSettingsResponse;
import com.aliyuncs.oos.model.v20190601.GetServiceSettingsResponse.ServiceSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceSettingsResponseUnmarshaller {

	public static GetServiceSettingsResponse unmarshall(GetServiceSettingsResponse getServiceSettingsResponse, UnmarshallerContext _ctx) {
		
		getServiceSettingsResponse.setRequestId(_ctx.stringValue("GetServiceSettingsResponse.RequestId"));

		List<ServiceSetting> serviceSettings = new ArrayList<ServiceSetting>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceSettingsResponse.ServiceSettings.Length"); i++) {
			ServiceSetting serviceSetting = new ServiceSetting();
			serviceSetting.setDeliveryOssEnabled(_ctx.booleanValue("GetServiceSettingsResponse.ServiceSettings["+ i +"].DeliveryOssEnabled"));
			serviceSetting.setDeliveryOssBucketName(_ctx.stringValue("GetServiceSettingsResponse.ServiceSettings["+ i +"].DeliveryOssBucketName"));
			serviceSetting.setDeliveryOssKeyPrefix(_ctx.stringValue("GetServiceSettingsResponse.ServiceSettings["+ i +"].DeliveryOssKeyPrefix"));
			serviceSetting.setDeliverySlsEnabled(_ctx.booleanValue("GetServiceSettingsResponse.ServiceSettings["+ i +"].DeliverySlsEnabled"));
			serviceSetting.setDeliverySlsProjectName(_ctx.stringValue("GetServiceSettingsResponse.ServiceSettings["+ i +"].DeliverySlsProjectName"));

			serviceSettings.add(serviceSetting);
		}
		getServiceSettingsResponse.setServiceSettings(serviceSettings);
	 
	 	return getServiceSettingsResponse;
	}
}