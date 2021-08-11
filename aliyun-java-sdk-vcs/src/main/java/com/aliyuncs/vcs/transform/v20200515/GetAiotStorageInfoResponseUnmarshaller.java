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

import com.aliyuncs.vcs.model.v20200515.GetAiotStorageInfoResponse;
import com.aliyuncs.vcs.model.v20200515.GetAiotStorageInfoResponse.AiotStorageInfo;
import com.aliyuncs.vcs.model.v20200515.GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmMq;
import com.aliyuncs.vcs.model.v20200515.GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmPictureStorage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAiotStorageInfoResponseUnmarshaller {

	public static GetAiotStorageInfoResponse unmarshall(GetAiotStorageInfoResponse getAiotStorageInfoResponse, UnmarshallerContext _ctx) {
		
		getAiotStorageInfoResponse.setRequestId(_ctx.stringValue("GetAiotStorageInfoResponse.RequestId"));
		getAiotStorageInfoResponse.setCode(_ctx.stringValue("GetAiotStorageInfoResponse.Code"));
		getAiotStorageInfoResponse.setMessage(_ctx.stringValue("GetAiotStorageInfoResponse.Message"));

		AiotStorageInfo aiotStorageInfo = new AiotStorageInfo();

		EventAlarmMq eventAlarmMq = new EventAlarmMq();
		eventAlarmMq.setMqType(_ctx.stringValue("GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmMq.MqType"));
		eventAlarmMq.setAlarmTopic(_ctx.stringValue("GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmMq.AlarmTopic"));
		eventAlarmMq.setEventTopic(_ctx.stringValue("GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmMq.EventTopic"));
		eventAlarmMq.setInstanceId(_ctx.stringValue("GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmMq.InstanceId"));
		eventAlarmMq.setRegionId(_ctx.stringValue("GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmMq.RegionId"));
		eventAlarmMq.setRamArnRole(_ctx.stringValue("GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmMq.RamArnRole"));
		aiotStorageInfo.setEventAlarmMq(eventAlarmMq);

		EventAlarmPictureStorage eventAlarmPictureStorage = new EventAlarmPictureStorage();
		eventAlarmPictureStorage.setStorageType(_ctx.stringValue("GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmPictureStorage.StorageType"));
		eventAlarmPictureStorage.setEndpoint(_ctx.stringValue("GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmPictureStorage.Endpoint"));
		eventAlarmPictureStorage.setBucket(_ctx.stringValue("GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmPictureStorage.Bucket"));
		eventAlarmPictureStorage.setPath(_ctx.stringValue("GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmPictureStorage.Path"));
		eventAlarmPictureStorage.setRamArnRole(_ctx.stringValue("GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmPictureStorage.RamArnRole"));
		eventAlarmPictureStorage.setProxy(_ctx.stringValue("GetAiotStorageInfoResponse.AiotStorageInfo.EventAlarmPictureStorage.Proxy"));
		aiotStorageInfo.setEventAlarmPictureStorage(eventAlarmPictureStorage);
		getAiotStorageInfoResponse.setAiotStorageInfo(aiotStorageInfo);
	 
	 	return getAiotStorageInfoResponse;
	}
}