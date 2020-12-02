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

import com.aliyuncs.oos.model.v20190601.SetServiceSettingsResponse;
import com.aliyuncs.oos.model.v20190601.SetServiceSettingsResponse.ServiceSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetServiceSettingsResponseUnmarshaller {

	public static SetServiceSettingsResponse unmarshall(SetServiceSettingsResponse setServiceSettingsResponse, UnmarshallerContext _ctx) {
		
		setServiceSettingsResponse.setRequestId(_ctx.stringValue("SetServiceSettingsResponse.RequestId"));

		List<ServiceSetting> serviceSettings = new ArrayList<ServiceSetting>();
		for (int i = 0; i < _ctx.lengthValue("SetServiceSettingsResponse.ServiceSettings.Length"); i++) {
			ServiceSetting serviceSetting = new ServiceSetting();
			serviceSetting.setDeliveryOssEnabled(_ctx.booleanValue("SetServiceSettingsResponse.ServiceSettings["+ i +"].DeliveryOssEnabled"));
			serviceSetting.setDeliveryOssBucketName(_ctx.stringValue("SetServiceSettingsResponse.ServiceSettings["+ i +"].DeliveryOssBucketName"));
			serviceSetting.setDeliveryOssKeyPrefix(_ctx.stringValue("SetServiceSettingsResponse.ServiceSettings["+ i +"].DeliveryOssKeyPrefix"));
			serviceSetting.setDeliverySlsEnabled(_ctx.booleanValue("SetServiceSettingsResponse.ServiceSettings["+ i +"].DeliverySlsEnabled"));
			serviceSetting.setDeliverySlsProjectName(_ctx.stringValue("SetServiceSettingsResponse.ServiceSettings["+ i +"].DeliverySlsProjectName"));

			serviceSettings.add(serviceSetting);
		}
		setServiceSettingsResponse.setServiceSettings(serviceSettings);
	 
	 	return setServiceSettingsResponse;
	}
}