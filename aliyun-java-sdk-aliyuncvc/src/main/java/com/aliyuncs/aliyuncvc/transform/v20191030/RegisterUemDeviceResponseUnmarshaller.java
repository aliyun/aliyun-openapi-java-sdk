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

import com.aliyuncs.aliyuncvc.model.v20191030.RegisterUemDeviceResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.RegisterUemDeviceResponse.DeviceInfo;
import com.aliyuncs.aliyuncvc.model.v20191030.RegisterUemDeviceResponse.DeviceInfo.AuthWsChannelConfig;
import com.aliyuncs.aliyuncvc.model.v20191030.RegisterUemDeviceResponse.DeviceInfo.MqttParam;
import com.aliyuncs.aliyuncvc.model.v20191030.RegisterUemDeviceResponse.DeviceInfo.SlsConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterUemDeviceResponseUnmarshaller {

	public static RegisterUemDeviceResponse unmarshall(RegisterUemDeviceResponse registerUemDeviceResponse, UnmarshallerContext _ctx) {
		
		registerUemDeviceResponse.setRequestId(_ctx.stringValue("RegisterUemDeviceResponse.RequestId"));
		registerUemDeviceResponse.setErrorCode(_ctx.integerValue("RegisterUemDeviceResponse.ErrorCode"));
		registerUemDeviceResponse.setSuccess(_ctx.booleanValue("RegisterUemDeviceResponse.Success"));
		registerUemDeviceResponse.setMessage(_ctx.stringValue("RegisterUemDeviceResponse.Message"));

		DeviceInfo deviceInfo = new DeviceInfo();
		deviceInfo.setChannelType(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.ChannelType"));
		deviceInfo.setRegisterTime(_ctx.longValue("RegisterUemDeviceResponse.DeviceInfo.RegisterTime"));
		deviceInfo.setDeviceName(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.DeviceName"));
		deviceInfo.setDeviceSessionId(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.DeviceSessionId"));
		deviceInfo.setMessageKey(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MessageKey"));
		deviceInfo.setScreenCode(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.ScreenCode"));
		deviceInfo.setToken(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.Token"));

		MqttParam mqttParam = new MqttParam();
		mqttParam.setClientId(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MqttParam.ClientId"));
		mqttParam.setGroupId(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MqttParam.GroupId"));
		mqttParam.setCleanSession(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MqttParam.CleanSession"));
		mqttParam.setPassword(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MqttParam.Password"));
		mqttParam.setPort(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MqttParam.Port"));
		mqttParam.setHost(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MqttParam.Host"));
		mqttParam.setTopic(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MqttParam.Topic"));
		mqttParam.setSDKClientPort(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MqttParam.SDKClientPort"));
		mqttParam.setTLSPort(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MqttParam.TLSPort"));
		mqttParam.setUseTLS(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MqttParam.UseTLS"));
		mqttParam.setUserName(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MqttParam.UserName"));
		mqttParam.setReconnectTimeout(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.MqttParam.ReconnectTimeout"));
		deviceInfo.setMqttParam(mqttParam);

		AuthWsChannelConfig authWsChannelConfig = new AuthWsChannelConfig();
		authWsChannelConfig.setAuthWsUrl(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.AuthWsChannelConfig.AuthWsUrl"));
		authWsChannelConfig.setWsOuterReconnTime(_ctx.integerValue("RegisterUemDeviceResponse.DeviceInfo.AuthWsChannelConfig.WsOuterReconnTime"));
		authWsChannelConfig.setToken(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.AuthWsChannelConfig.Token"));
		deviceInfo.setAuthWsChannelConfig(authWsChannelConfig);

		SlsConfig slsConfig = new SlsConfig();
		slsConfig.setProject(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.SlsConfig.Project"));
		slsConfig.setLogStore(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.SlsConfig.LogStore"));
		slsConfig.setLogServiceEndpoint(_ctx.stringValue("RegisterUemDeviceResponse.DeviceInfo.SlsConfig.LogServiceEndpoint"));
		deviceInfo.setSlsConfig(slsConfig);
		registerUemDeviceResponse.setDeviceInfo(deviceInfo);
	 
	 	return registerUemDeviceResponse;
	}
}