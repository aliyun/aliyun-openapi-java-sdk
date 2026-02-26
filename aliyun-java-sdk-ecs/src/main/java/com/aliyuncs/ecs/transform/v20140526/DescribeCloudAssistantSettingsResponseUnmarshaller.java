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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantSettingsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantSettingsResponse.AgentUpgradeConfig;
import com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantSettingsResponse.OssDeliveryConfig;
import com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantSettingsResponse.SessionManagerConfig;
import com.aliyuncs.ecs.model.v20140526.DescribeCloudAssistantSettingsResponse.SlsDeliveryConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudAssistantSettingsResponseUnmarshaller {

	public static DescribeCloudAssistantSettingsResponse unmarshall(DescribeCloudAssistantSettingsResponse describeCloudAssistantSettingsResponse, UnmarshallerContext _ctx) {
		
		describeCloudAssistantSettingsResponse.setRequestId(_ctx.stringValue("DescribeCloudAssistantSettingsResponse.RequestId"));

		AgentUpgradeConfig agentUpgradeConfig = new AgentUpgradeConfig();
		agentUpgradeConfig.setEnabled(_ctx.booleanValue("DescribeCloudAssistantSettingsResponse.AgentUpgradeConfig.Enabled"));
		agentUpgradeConfig.setTimeZone(_ctx.stringValue("DescribeCloudAssistantSettingsResponse.AgentUpgradeConfig.TimeZone"));

		List<String> allowedUpgradeWindows = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudAssistantSettingsResponse.AgentUpgradeConfig.AllowedUpgradeWindows.Length"); i++) {
			allowedUpgradeWindows.add(_ctx.stringValue("DescribeCloudAssistantSettingsResponse.AgentUpgradeConfig.AllowedUpgradeWindows["+ i +"]"));
		}
		agentUpgradeConfig.setAllowedUpgradeWindows(allowedUpgradeWindows);
		describeCloudAssistantSettingsResponse.setAgentUpgradeConfig(agentUpgradeConfig);

		SessionManagerConfig sessionManagerConfig = new SessionManagerConfig();
		sessionManagerConfig.setSessionManagerEnabled(_ctx.booleanValue("DescribeCloudAssistantSettingsResponse.SessionManagerConfig.SessionManagerEnabled"));
		describeCloudAssistantSettingsResponse.setSessionManagerConfig(sessionManagerConfig);

		List<OssDeliveryConfig> ossDeliveryConfigs = new ArrayList<OssDeliveryConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudAssistantSettingsResponse.OssDeliveryConfigs.Length"); i++) {
			OssDeliveryConfig ossDeliveryConfig = new OssDeliveryConfig();
			ossDeliveryConfig.setEncryptionType(_ctx.stringValue("DescribeCloudAssistantSettingsResponse.OssDeliveryConfigs["+ i +"].EncryptionType"));
			ossDeliveryConfig.setEncryptionAlgorithm(_ctx.stringValue("DescribeCloudAssistantSettingsResponse.OssDeliveryConfigs["+ i +"].EncryptionAlgorithm"));
			ossDeliveryConfig.setDeliveryType(_ctx.stringValue("DescribeCloudAssistantSettingsResponse.OssDeliveryConfigs["+ i +"].DeliveryType"));
			ossDeliveryConfig.setEnabled(_ctx.booleanValue("DescribeCloudAssistantSettingsResponse.OssDeliveryConfigs["+ i +"].Enabled"));
			ossDeliveryConfig.setBucketName(_ctx.stringValue("DescribeCloudAssistantSettingsResponse.OssDeliveryConfigs["+ i +"].BucketName"));
			ossDeliveryConfig.setPrefix(_ctx.stringValue("DescribeCloudAssistantSettingsResponse.OssDeliveryConfigs["+ i +"].Prefix"));
			ossDeliveryConfig.setEncryptionKeyId(_ctx.stringValue("DescribeCloudAssistantSettingsResponse.OssDeliveryConfigs["+ i +"].EncryptionKeyId"));

			ossDeliveryConfigs.add(ossDeliveryConfig);
		}
		describeCloudAssistantSettingsResponse.setOssDeliveryConfigs(ossDeliveryConfigs);

		List<SlsDeliveryConfig> slsDeliveryConfigs = new ArrayList<SlsDeliveryConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudAssistantSettingsResponse.SlsDeliveryConfigs.Length"); i++) {
			SlsDeliveryConfig slsDeliveryConfig = new SlsDeliveryConfig();
			slsDeliveryConfig.setDeliveryType(_ctx.stringValue("DescribeCloudAssistantSettingsResponse.SlsDeliveryConfigs["+ i +"].DeliveryType"));
			slsDeliveryConfig.setLogstoreName(_ctx.stringValue("DescribeCloudAssistantSettingsResponse.SlsDeliveryConfigs["+ i +"].LogstoreName"));
			slsDeliveryConfig.setEnabled(_ctx.booleanValue("DescribeCloudAssistantSettingsResponse.SlsDeliveryConfigs["+ i +"].Enabled"));
			slsDeliveryConfig.setProjectName(_ctx.stringValue("DescribeCloudAssistantSettingsResponse.SlsDeliveryConfigs["+ i +"].ProjectName"));

			slsDeliveryConfigs.add(slsDeliveryConfig);
		}
		describeCloudAssistantSettingsResponse.setSlsDeliveryConfigs(slsDeliveryConfigs);
	 
	 	return describeCloudAssistantSettingsResponse;
	}
}