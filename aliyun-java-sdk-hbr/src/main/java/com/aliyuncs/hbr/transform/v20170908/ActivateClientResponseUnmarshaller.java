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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.ActivateClientResponse;
import com.aliyuncs.hbr.model.v20170908.ActivateClientResponse.MqttInfo;
import com.aliyuncs.hbr.model.v20170908.ActivateClientResponse.MqttInfo.Brokers;
import com.aliyuncs.hbr.model.v20170908.ActivateClientResponse.OtsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActivateClientResponseUnmarshaller {

	public static ActivateClientResponse unmarshall(ActivateClientResponse activateClientResponse, UnmarshallerContext _ctx) {
		
		activateClientResponse.setRequestId(_ctx.stringValue("ActivateClientResponse.RequestId"));
		activateClientResponse.setSuccess(_ctx.booleanValue("ActivateClientResponse.Success"));
		activateClientResponse.setCode(_ctx.stringValue("ActivateClientResponse.Code"));
		activateClientResponse.setMessage(_ctx.stringValue("ActivateClientResponse.Message"));
		activateClientResponse.setToken(_ctx.stringValue("ActivateClientResponse.Token"));
		activateClientResponse.setVaultUrl(_ctx.stringValue("ActivateClientResponse.VaultUrl"));
		activateClientResponse.setClientId(_ctx.stringValue("ActivateClientResponse.ClientId"));
		activateClientResponse.setAccessCode(_ctx.stringValue("ActivateClientResponse.AccessCode"));
		activateClientResponse.setVaultId(_ctx.stringValue("ActivateClientResponse.VaultId"));
		activateClientResponse.setAccountId(_ctx.longValue("ActivateClientResponse.AccountId"));
		activateClientResponse.setEnvironment(_ctx.stringValue("ActivateClientResponse.Environment"));
		activateClientResponse.setClusterId(_ctx.stringValue("ActivateClientResponse.ClusterId"));
		activateClientResponse.setVaultType(_ctx.stringValue("ActivateClientResponse.VaultType"));
		activateClientResponse.setUseHttps(_ctx.booleanValue("ActivateClientResponse.UseHttps"));

		List<String> sourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ActivateClientResponse.SourceTypes.Length"); i++) {
			sourceTypes.add(_ctx.stringValue("ActivateClientResponse.SourceTypes["+ i +"]"));
		}
		activateClientResponse.setSourceTypes(sourceTypes);

		MqttInfo mqttInfo = new MqttInfo();
		mqttInfo.setBroker(_ctx.stringValue("ActivateClientResponse.MqttInfo.Broker"));
		mqttInfo.setPubTopic(_ctx.stringValue("ActivateClientResponse.MqttInfo.PubTopic"));
		mqttInfo.setClientId(_ctx.stringValue("ActivateClientResponse.MqttInfo.ClientId"));
		mqttInfo.setClusterPubTopic(_ctx.stringValue("ActivateClientResponse.MqttInfo.ClusterPubTopic"));
		mqttInfo.setSubTopic(_ctx.stringValue("ActivateClientResponse.MqttInfo.SubTopic"));
		mqttInfo.setAuthServer(_ctx.stringValue("ActivateClientResponse.MqttInfo.AuthServer"));
		mqttInfo.setUsername(_ctx.stringValue("ActivateClientResponse.MqttInfo.Username"));
		mqttInfo.setPassword(_ctx.stringValue("ActivateClientResponse.MqttInfo.Password"));

		Brokers brokers = new Brokers();
		brokers.setVpc(_ctx.stringValue("ActivateClientResponse.MqttInfo.Brokers.Vpc"));
		brokers.setPub(_ctx.stringValue("ActivateClientResponse.MqttInfo.Brokers.Pub"));
		brokers.setClassic(_ctx.stringValue("ActivateClientResponse.MqttInfo.Brokers.Classic"));
		mqttInfo.setBrokers(brokers);
		activateClientResponse.setMqttInfo(mqttInfo);

		OtsInfo otsInfo = new OtsInfo();
		otsInfo.setEndpoint(_ctx.stringValue("ActivateClientResponse.OtsInfo.Endpoint"));
		otsInfo.setInstanceName(_ctx.stringValue("ActivateClientResponse.OtsInfo.InstanceName"));
		otsInfo.setHanaMetaTableName(_ctx.stringValue("ActivateClientResponse.OtsInfo.HanaMetaTableName"));
		activateClientResponse.setOtsInfo(otsInfo);
	 
	 	return activateClientResponse;
	}
}