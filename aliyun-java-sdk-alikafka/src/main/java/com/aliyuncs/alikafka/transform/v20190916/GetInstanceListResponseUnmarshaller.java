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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.GetInstanceListResponse;
import com.aliyuncs.alikafka.model.v20190916.GetInstanceListResponse.InstanceVO;
import com.aliyuncs.alikafka.model.v20190916.GetInstanceListResponse.InstanceVO.ConfluentConfig;
import com.aliyuncs.alikafka.model.v20190916.GetInstanceListResponse.InstanceVO.TagVO;
import com.aliyuncs.alikafka.model.v20190916.GetInstanceListResponse.InstanceVO.UpgradeServiceDetailInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceListResponseUnmarshaller {

	public static GetInstanceListResponse unmarshall(GetInstanceListResponse getInstanceListResponse, UnmarshallerContext _ctx) {
		
		getInstanceListResponse.setRequestId(_ctx.stringValue("GetInstanceListResponse.RequestId"));
		getInstanceListResponse.setCode(_ctx.integerValue("GetInstanceListResponse.Code"));
		getInstanceListResponse.setMessage(_ctx.stringValue("GetInstanceListResponse.Message"));
		getInstanceListResponse.setSuccess(_ctx.booleanValue("GetInstanceListResponse.Success"));

		List<InstanceVO> instanceList = new ArrayList<InstanceVO>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceListResponse.InstanceList.Length"); i++) {
			InstanceVO instanceVO = new InstanceVO();
			instanceVO.setVpcId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VpcId"));
			instanceVO.setSpecType(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SpecType"));
			instanceVO.setDeployType(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].DeployType"));
			instanceVO.setCreateTime(_ctx.longValue("GetInstanceListResponse.InstanceList["+ i +"].CreateTime"));
			instanceVO.setDiskSize(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].DiskSize"));
			instanceVO.setDiskType(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].DiskType"));
			instanceVO.setSecurityGroup(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SecurityGroup"));
			instanceVO.setSslEndPoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SslEndPoint"));
			instanceVO.setInstanceId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].InstanceId"));
			instanceVO.setAllConfig(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].AllConfig"));
			instanceVO.setServiceStatus(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ServiceStatus"));
			instanceVO.setEipMax(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].EipMax"));
			instanceVO.setRegionId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].RegionId"));
			instanceVO.setMsgRetain(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].MsgRetain"));
			instanceVO.setVSwitchId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VSwitchId"));
			instanceVO.setExpiredTime(_ctx.longValue("GetInstanceListResponse.InstanceList["+ i +"].ExpiredTime"));
			instanceVO.setTopicNumLimit(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].TopicNumLimit"));
			instanceVO.setZoneId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].ZoneId"));
			instanceVO.setIoMaxRead(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].IoMaxRead"));
			instanceVO.setIoMaxWrite(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].IoMaxWrite"));
			instanceVO.setIoMax(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].IoMax"));
			instanceVO.setPaidType(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].PaidType"));
			instanceVO.setName(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].Name"));
			instanceVO.setEndPoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].EndPoint"));
			instanceVO.setDomainEndpoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].DomainEndpoint"));
			instanceVO.setVpcSaslEndPoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VpcSaslEndPoint"));
			instanceVO.setSaslEndPoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SaslEndPoint"));
			instanceVO.setSslDomainEndpoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SslDomainEndpoint"));
			instanceVO.setSaslDomainEndpoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SaslDomainEndpoint"));
			instanceVO.setVpcSaslDomainEndpoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VpcSaslDomainEndpoint"));
			instanceVO.setResourceGroupId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].ResourceGroupId"));
			instanceVO.setUsedTopicCount(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].UsedTopicCount"));
			instanceVO.setUsedGroupCount(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].UsedGroupCount"));
			instanceVO.setUsedPartitionCount(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].UsedPartitionCount"));
			instanceVO.setKmsKeyId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].KmsKeyId"));
			instanceVO.setStandardZoneId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].StandardZoneId"));
			instanceVO.setIoMaxSpec(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].IoMaxSpec"));
			instanceVO.setReservedPublishCapacity(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ReservedPublishCapacity"));
			instanceVO.setReservedSubscribeCapacity(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ReservedSubscribeCapacity"));
			instanceVO.setViewInstanceStatusCode(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ViewInstanceStatusCode"));
			instanceVO.setSeries(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].Series"));
			instanceVO.setAutoCreateGroupEnable(_ctx.booleanValue("GetInstanceListResponse.InstanceList["+ i +"].AutoCreateGroupEnable"));
			instanceVO.setAutoCreateTopicEnable(_ctx.booleanValue("GetInstanceListResponse.InstanceList["+ i +"].AutoCreateTopicEnable"));
			instanceVO.setDefaultPartitionNum(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].DefaultPartitionNum"));
			instanceVO.setBrokerCount(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].BrokerCount"));
			instanceVO.setRecommendedPartitionCount(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].RecommendedPartitionCount"));
			instanceVO.setBackupZoneId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].BackupZoneId"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetInstanceListResponse.InstanceList["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VSwitchIds["+ j +"]"));
			}
			instanceVO.setVSwitchIds(vSwitchIds);

			UpgradeServiceDetailInfo upgradeServiceDetailInfo = new UpgradeServiceDetailInfo();
			upgradeServiceDetailInfo.setCurrent2OpenSourceVersion(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].UpgradeServiceDetailInfo.Current2OpenSourceVersion"));
			instanceVO.setUpgradeServiceDetailInfo(upgradeServiceDetailInfo);

			ConfluentConfig confluentConfig = new ConfluentConfig();
			confluentConfig.setKafkaCU(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.KafkaCU"));
			confluentConfig.setKafkaStorage(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.KafkaStorage"));
			confluentConfig.setKafkaReplica(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.KafkaReplica"));
			confluentConfig.setZooKeeperCU(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.ZooKeeperCU"));
			confluentConfig.setZooKeeperStorage(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.ZooKeeperStorage"));
			confluentConfig.setZooKeeperReplica(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.ZooKeeperReplica"));
			confluentConfig.setControlCenterCU(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.ControlCenterCU"));
			confluentConfig.setControlCenterStorage(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.ControlCenterStorage"));
			confluentConfig.setControlCenterReplica(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.ControlCenterReplica"));
			confluentConfig.setSchemaRegistryCU(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.SchemaRegistryCU"));
			confluentConfig.setSchemaRegistryReplica(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.SchemaRegistryReplica"));
			confluentConfig.setConnectCU(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.ConnectCU"));
			confluentConfig.setConnectReplica(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.ConnectReplica"));
			confluentConfig.setKsqlCU(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.KsqlCU"));
			confluentConfig.setKsqlStorage(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.KsqlStorage"));
			confluentConfig.setKsqlReplica(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.KsqlReplica"));
			confluentConfig.setKafkaRestProxyCU(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.KafkaRestProxyCU"));
			confluentConfig.setKafkaRestProxyReplica(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ConfluentConfig.KafkaRestProxyReplica"));
			instanceVO.setConfluentConfig(confluentConfig);

			List<TagVO> tags = new ArrayList<TagVO>();
			for (int j = 0; j < _ctx.lengthValue("GetInstanceListResponse.InstanceList["+ i +"].Tags.Length"); j++) {
				TagVO tagVO = new TagVO();
				tagVO.setKey(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].Tags["+ j +"].Key"));
				tagVO.setValue(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagVO);
			}
			instanceVO.setTags(tags);

			instanceList.add(instanceVO);
		}
		getInstanceListResponse.setInstanceList(instanceList);
	 
	 	return getInstanceListResponse;
	}
}