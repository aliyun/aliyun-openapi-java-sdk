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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo.BackendModel;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo.BackendModel.BackendConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo.BackendModel.BackendConfig.DiscoveryConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo.BackendModel.BackendConfig.DiscoveryConfig.NacosConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo.BackendModel.BackendConfig.DiscoveryConfig.ZookeeperConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo.BackendModel.BackendConfig.EdasConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo.BackendModel.BackendConfig.EventBridgeConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo.BackendModel.BackendConfig.FunctionComputeConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo.BackendModel.BackendConfig.MockConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo.BackendModel.BackendConfig.MockConfig.MockHeader;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo.BackendModel.BackendConfig.OssConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeBackendInfoResponse.BackendInfo.BackendModel.BackendConfig.VpcConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackendInfoResponseUnmarshaller {

	public static DescribeBackendInfoResponse unmarshall(DescribeBackendInfoResponse describeBackendInfoResponse, UnmarshallerContext _ctx) {
		
		describeBackendInfoResponse.setRequestId(_ctx.stringValue("DescribeBackendInfoResponse.RequestId"));

		BackendInfo backendInfo = new BackendInfo();
		backendInfo.setBackendName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendName"));
		backendInfo.setBackendType(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendType"));
		backendInfo.setModifiedTime(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.ModifiedTime"));
		backendInfo.setDescription(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.Description"));
		backendInfo.setCreatedTime(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.CreatedTime"));
		backendInfo.setBackendId(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendId"));

		List<BackendModel> backendModels = new ArrayList<BackendModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackendInfoResponse.BackendInfo.BackendModels.Length"); i++) {
			BackendModel backendModel = new BackendModel();
			backendModel.setBackendModelId(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendModelId"));
			backendModel.setStageModeId(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].StageModeId"));
			backendModel.setDescription(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].Description"));
			backendModel.setGmtCreate(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].GmtCreate"));
			backendModel.setGmtModified(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].GmtModified"));
			backendModel.setStageName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].StageName"));

			BackendConfig backendConfig = new BackendConfig();
			backendConfig.setServiceAddress(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.ServiceAddress"));
			backendConfig.setHttpTargetHostName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.HttpTargetHostName"));
			backendConfig.setType(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.Type"));
			backendConfig.setServiceTimeout(_ctx.integerValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.ServiceTimeout"));

			VpcConfig vpcConfig = new VpcConfig();
			vpcConfig.setVpcId(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.VpcConfig.VpcId"));
			vpcConfig.setInstanceId(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.VpcConfig.InstanceId"));
			vpcConfig.setPort(_ctx.longValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.VpcConfig.Port"));
			vpcConfig.setVpcAccessId(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.VpcConfig.VpcAccessId"));
			vpcConfig.setName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.VpcConfig.Name"));
			vpcConfig.setVpcScheme(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.VpcConfig.VpcScheme"));
			vpcConfig.setVpcTargetHostName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.VpcConfig.VpcTargetHostName"));
			backendConfig.setVpcConfig(vpcConfig);

			FunctionComputeConfig functionComputeConfig = new FunctionComputeConfig();
			functionComputeConfig.setFcType(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.FunctionComputeConfig.FcType"));
			functionComputeConfig.setFcRegionId(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.FunctionComputeConfig.FcRegionId"));
			functionComputeConfig.setServiceName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.FunctionComputeConfig.ServiceName"));
			functionComputeConfig.setFunctionName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.FunctionComputeConfig.FunctionName"));
			functionComputeConfig.setRoleArn(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.FunctionComputeConfig.RoleArn"));
			functionComputeConfig.setQualifier(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.FunctionComputeConfig.Qualifier"));
			functionComputeConfig.setFcBaseUrl(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.FunctionComputeConfig.FcBaseUrl"));
			functionComputeConfig.setOnlyBusinessPath(_ctx.booleanValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.FunctionComputeConfig.OnlyBusinessPath"));
			backendConfig.setFunctionComputeConfig(functionComputeConfig);

			OssConfig ossConfig = new OssConfig();
			ossConfig.setOssRegionId(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.OssConfig.OssRegionId"));
			ossConfig.setBucketName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.OssConfig.BucketName"));
			backendConfig.setOssConfig(ossConfig);

			EventBridgeConfig eventBridgeConfig = new EventBridgeConfig();
			eventBridgeConfig.setEventBridgeRegionId(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.EventBridgeConfig.EventBridgeRegionId"));
			eventBridgeConfig.setEventSource(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.EventBridgeConfig.EventSource"));
			eventBridgeConfig.setEventBus(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.EventBridgeConfig.EventBus"));
			eventBridgeConfig.setRoleArn(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.EventBridgeConfig.RoleArn"));
			backendConfig.setEventBridgeConfig(eventBridgeConfig);

			MockConfig mockConfig = new MockConfig();
			mockConfig.setMockResult(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.MockConfig.MockResult"));
			mockConfig.setMockStatusCode(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.MockConfig.MockStatusCode"));

			List<MockHeader> mockHeaders = new ArrayList<MockHeader>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.MockConfig.MockHeaders.Length"); j++) {
				MockHeader mockHeader = new MockHeader();
				mockHeader.setHeaderName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.MockConfig.MockHeaders["+ j +"].HeaderName"));
				mockHeader.setHeaderValue(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.MockConfig.MockHeaders["+ j +"].HeaderValue"));

				mockHeaders.add(mockHeader);
			}
			mockConfig.setMockHeaders(mockHeaders);
			backendConfig.setMockConfig(mockConfig);

			DiscoveryConfig discoveryConfig = new DiscoveryConfig();
			discoveryConfig.setRcType(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.RcType"));

			NacosConfig nacosConfig = new NacosConfig();
			nacosConfig.setServerAddress(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.NacosConfig.ServerAddress"));
			nacosConfig.setNamespace(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.NacosConfig.Namespace"));
			nacosConfig.setGroupName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.NacosConfig.GroupName"));
			nacosConfig.setServiceName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.NacosConfig.ServiceName"));
			nacosConfig.setClusters(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.NacosConfig.Clusters"));
			nacosConfig.setAuthType(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.NacosConfig.AuthType"));
			nacosConfig.setUserName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.NacosConfig.UserName"));
			nacosConfig.setPassword(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.NacosConfig.Password"));
			nacosConfig.setAccessKey(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.NacosConfig.AccessKey"));
			nacosConfig.setSecretKey(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.NacosConfig.SecretKey"));
			discoveryConfig.setNacosConfig(nacosConfig);

			ZookeeperConfig zookeeperConfig = new ZookeeperConfig();
			zookeeperConfig.setConnectString(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.ZookeeperConfig.ConnectString"));
			zookeeperConfig.setNamespace(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.ZookeeperConfig.Namespace"));
			zookeeperConfig.setServiceName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.DiscoveryConfig.ZookeeperConfig.ServiceName"));
			discoveryConfig.setZookeeperConfig(zookeeperConfig);
			backendConfig.setDiscoveryConfig(discoveryConfig);

			EdasConfig edasConfig = new EdasConfig();
			edasConfig.setMicroserviceNamespaceName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.EdasConfig.MicroserviceNamespaceName"));
			edasConfig.setMicroserviceNamespaceId(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.EdasConfig.MicroserviceNamespaceId"));
			edasConfig.setMicroserviceNamespace(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.EdasConfig.MicroserviceNamespace"));
			edasConfig.setServiceName(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.EdasConfig.ServiceName"));
			edasConfig.setEdasAppId(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.EdasConfig.EdasAppId"));
			edasConfig.setRegistryType(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.EdasConfig.RegistryType"));
			edasConfig.setMseInstanceId(_ctx.stringValue("DescribeBackendInfoResponse.BackendInfo.BackendModels["+ i +"].BackendConfig.EdasConfig.MseInstanceId"));
			backendConfig.setEdasConfig(edasConfig);
			backendModel.setBackendConfig(backendConfig);

			backendModels.add(backendModel);
		}
		backendInfo.setBackendModels(backendModels);
		describeBackendInfoResponse.setBackendInfo(backendInfo);
	 
	 	return describeBackendInfoResponse;
	}
}