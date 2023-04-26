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

package com.aliyuncs.ecs.transform.v20160314;

import com.aliyuncs.ecs.model.v20160314.ListServiceSettingsResponse;
import com.aliyuncs.ecs.model.v20160314.ListServiceSettingsResponse.CloudAssistantDeliverySettings;
import com.aliyuncs.ecs.model.v20160314.ListServiceSettingsResponse.SessionManagerDeliverySetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceSettingsResponseUnmarshaller {

	public static ListServiceSettingsResponse unmarshall(ListServiceSettingsResponse listServiceSettingsResponse, UnmarshallerContext _ctx) {
		
		listServiceSettingsResponse.setRequestId(_ctx.stringValue("ListServiceSettingsResponse.RequestId"));

		CloudAssistantDeliverySettings cloudAssistantDeliverySettings = new CloudAssistantDeliverySettings();
		cloudAssistantDeliverySettings.setSlsProjectName(_ctx.stringValue("ListServiceSettingsResponse.CloudAssistantDeliverySettings.SlsProjectName"));
		cloudAssistantDeliverySettings.setOssKeyPrefix(_ctx.stringValue("ListServiceSettingsResponse.CloudAssistantDeliverySettings.OssKeyPrefix"));
		cloudAssistantDeliverySettings.setSlsEnabled(_ctx.booleanValue("ListServiceSettingsResponse.CloudAssistantDeliverySettings.SlsEnabled"));
		cloudAssistantDeliverySettings.setOssEnabled(_ctx.booleanValue("ListServiceSettingsResponse.CloudAssistantDeliverySettings.OssEnabled"));
		cloudAssistantDeliverySettings.setSlsLogstoreName(_ctx.stringValue("ListServiceSettingsResponse.CloudAssistantDeliverySettings.SlsLogstoreName"));
		cloudAssistantDeliverySettings.setOssBucketName(_ctx.stringValue("ListServiceSettingsResponse.CloudAssistantDeliverySettings.OssBucketName"));
		listServiceSettingsResponse.setCloudAssistantDeliverySettings(cloudAssistantDeliverySettings);

		SessionManagerDeliverySetting sessionManagerDeliverySetting = new SessionManagerDeliverySetting();
		sessionManagerDeliverySetting.setOssEnabled(_ctx.booleanValue("ListServiceSettingsResponse.SessionManagerDeliverySetting.OssEnabled"));
		sessionManagerDeliverySetting.setOssBucketName(_ctx.stringValue("ListServiceSettingsResponse.SessionManagerDeliverySetting.OssBucketName"));
		sessionManagerDeliverySetting.setOssKeyPrefix(_ctx.stringValue("ListServiceSettingsResponse.SessionManagerDeliverySetting.OssKeyPrefix"));
		sessionManagerDeliverySetting.setOssEncryptionType(_ctx.stringValue("ListServiceSettingsResponse.SessionManagerDeliverySetting.OssEncryptionType"));
		sessionManagerDeliverySetting.setOssEncryptionAlgorithm(_ctx.stringValue("ListServiceSettingsResponse.SessionManagerDeliverySetting.OssEncryptionAlgorithm"));
		sessionManagerDeliverySetting.setOssEncryptionKeyId(_ctx.stringValue("ListServiceSettingsResponse.SessionManagerDeliverySetting.OssEncryptionKeyId"));
		sessionManagerDeliverySetting.setSlsEnabled(_ctx.booleanValue("ListServiceSettingsResponse.SessionManagerDeliverySetting.SlsEnabled"));
		sessionManagerDeliverySetting.setSlsProjectName(_ctx.stringValue("ListServiceSettingsResponse.SessionManagerDeliverySetting.SlsProjectName"));
		sessionManagerDeliverySetting.setSlsLogstoreName(_ctx.stringValue("ListServiceSettingsResponse.SessionManagerDeliverySetting.SlsLogstoreName"));
		listServiceSettingsResponse.setSessionManagerDeliverySetting(sessionManagerDeliverySetting);
	 
	 	return listServiceSettingsResponse;
	}
}