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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import com.aliyuncs.aliyuncvc.model.v20191030.RegisterDeviceResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.RegisterDeviceResponse.DeviceInfo;
import com.aliyuncs.aliyuncvc.model.v20191030.RegisterDeviceResponse.DeviceInfo.AuthWsChannelConfig;
import com.aliyuncs.aliyuncvc.model.v20191030.RegisterDeviceResponse.DeviceInfo.MqttParam;
import com.aliyuncs.aliyuncvc.model.v20191030.RegisterDeviceResponse.DeviceInfo.SlsConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterDeviceResponseUnmarshaller {

	public static RegisterDeviceResponse unmarshall(RegisterDeviceResponse registerDeviceResponse, UnmarshallerContext _ctx) {
		
		registerDeviceResponse.setRequestId(_ctx.stringValue("RegisterDeviceResponse.RequestId"));
		registerDeviceResponse.setErrorCode(_ctx.integerValue("RegisterDeviceResponse.ErrorCode"));
		registerDeviceResponse.setSuccess(_ctx.booleanValue("RegisterDeviceResponse.Success"));
		registerDeviceResponse.setMessage(_ctx.stringValue("RegisterDeviceResponse.Message"));

		DeviceInfo deviceInfo = new DeviceInfo();
		deviceInfo.setChannelType(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.ChannelType"));
		deviceInfo.setRegisterTime(_ctx.longValue("RegisterDeviceResponse.DeviceInfo.RegisterTime"));
		deviceInfo.setDeviceName(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.DeviceName"));
		deviceInfo.setDeviceSessionId(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.DeviceSessionId"));
		deviceInfo.setMessageKey(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MessageKey"));
		deviceInfo.setScreenCode(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.ScreenCode"));

		MqttParam mqttParam = new MqttParam();
		mqttParam.setClientId(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MqttParam.ClientId"));
		mqttParam.setGroupId(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MqttParam.GroupId"));
		mqttParam.setCleanSession(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MqttParam.CleanSession"));
		mqttParam.setPassword(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MqttParam.Password"));
		mqttParam.setPort(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MqttParam.Port"));
		mqttParam.setHost(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MqttParam.Host"));
		mqttParam.setTopic(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MqttParam.Topic"));
		mqttParam.setSDKClientPort(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MqttParam.SDKClientPort"));
		mqttParam.setTLSPort(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MqttParam.TLSPort"));
		mqttParam.setUseTLS(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MqttParam.UseTLS"));
		mqttParam.setUserName(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MqttParam.UserName"));
		mqttParam.setReconnectTimeout(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.MqttParam.ReconnectTimeout"));
		deviceInfo.setMqttParam(mqttParam);

		AuthWsChannelConfig authWsChannelConfig = new AuthWsChannelConfig();
		authWsChannelConfig.setAuthWsUrl(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.AuthWsChannelConfig.AuthWsUrl"));
		authWsChannelConfig.setWsOuterReconnTime(_ctx.integerValue("RegisterDeviceResponse.DeviceInfo.AuthWsChannelConfig.WsOuterReconnTime"));
		authWsChannelConfig.setToken(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.AuthWsChannelConfig.Token"));
		deviceInfo.setAuthWsChannelConfig(authWsChannelConfig);

		SlsConfig slsConfig = new SlsConfig();
		slsConfig.setProject(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.SlsConfig.Project"));
		slsConfig.setLogStore(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.SlsConfig.LogStore"));
		slsConfig.setLogServiceEndpoint(_ctx.stringValue("RegisterDeviceResponse.DeviceInfo.SlsConfig.LogServiceEndpoint"));
		deviceInfo.setSlsConfig(slsConfig);
		registerDeviceResponse.setDeviceInfo(deviceInfo);
	 
	 	return registerDeviceResponse;
	}
}