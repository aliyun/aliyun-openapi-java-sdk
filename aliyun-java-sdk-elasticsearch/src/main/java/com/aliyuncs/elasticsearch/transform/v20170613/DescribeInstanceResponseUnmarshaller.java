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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.AdvancedSetting;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.ClientNodeConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.Dict;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.DictListItem;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.ElasticDataNodeConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.IkHotDictsItem;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.KibanaConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.MasterConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.NetworkConfig.WhiteIpGroupListItem;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.NodeSpec;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.SynonymsDictsItem;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.Tag;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.WarmNodeConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.ZoneInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceResponse.setRequestId(_ctx.stringValue("DescribeInstanceResponse.RequestId"));

		Result result = new Result();
		result.setAdvancedDedicateMaster(_ctx.booleanValue("DescribeInstanceResponse.Result.advancedDedicateMaster"));
		result.setBizProtocol(_ctx.stringValue("DescribeInstanceResponse.Result.protocol"));
		result.setEnableKibanaPublicNetwork(_ctx.booleanValue("DescribeInstanceResponse.Result.enableKibanaPublicNetwork"));
		result.setNodeAmount(_ctx.integerValue("DescribeInstanceResponse.Result.nodeAmount"));
		result.setCreatedAt(_ctx.stringValue("DescribeInstanceResponse.Result.createdAt"));
		result.setEnableKibanaPrivateNetwork(_ctx.booleanValue("DescribeInstanceResponse.Result.enableKibanaPrivateNetwork"));
		result.setVpcInstanceId(_ctx.stringValue("DescribeInstanceResponse.Result.vpcInstanceId"));
		result.setPort(_ctx.integerValue("DescribeInstanceResponse.Result.port"));
		result.setEnablePublic(_ctx.booleanValue("DescribeInstanceResponse.Result.enablePublic"));
		result.setDedicateMaster(_ctx.booleanValue("DescribeInstanceResponse.Result.dedicateMaster"));
		result.setKibanaPort(_ctx.integerValue("DescribeInstanceResponse.Result.kibanaPort"));
		result.setEsConfig(_ctx.mapValue("DescribeInstanceResponse.Result.esConfig"));
		result.setResourceGroupId(_ctx.stringValue("DescribeInstanceResponse.Result.resourceGroupId"));
		result.setPaymentType(_ctx.stringValue("DescribeInstanceResponse.Result.paymentType"));
		result.setPostpaidServiceStatus(_ctx.stringValue("DescribeInstanceResponse.Result.postpaidServiceStatus"));
		result.setEsVersion(_ctx.stringValue("DescribeInstanceResponse.Result.esVersion"));
		result.setHaveKibana(_ctx.booleanValue("DescribeInstanceResponse.Result.haveKibana"));
		result.setIsNewDeployment(_ctx.booleanValue("DescribeInstanceResponse.Result.isNewDeployment"));
		result.setWarmNode(_ctx.booleanValue("DescribeInstanceResponse.Result.warmNode"));
		result.setUpdatedAt(_ctx.stringValue("DescribeInstanceResponse.Result.updatedAt"));
		result.setInstanceId(_ctx.stringValue("DescribeInstanceResponse.Result.instanceId"));
		result.setZoneCount(_ctx.integerValue("DescribeInstanceResponse.Result.zoneCount"));
		result.setPublicDomain(_ctx.stringValue("DescribeInstanceResponse.Result.publicDomain"));
		result.setStatus(_ctx.stringValue("DescribeInstanceResponse.Result.status"));
		result.setServiceVpc(_ctx.booleanValue("DescribeInstanceResponse.Result.serviceVpc"));
		result.setPublicPort(_ctx.integerValue("DescribeInstanceResponse.Result.publicPort"));
		result.setHaveClientNode(_ctx.booleanValue("DescribeInstanceResponse.Result.haveClientNode"));
		result.setDomain(_ctx.stringValue("DescribeInstanceResponse.Result.domain"));
		result.setDescription(_ctx.stringValue("DescribeInstanceResponse.Result.description"));
		result.setKibanaDomain(_ctx.stringValue("DescribeInstanceResponse.Result.kibanaDomain"));
		result.setInstanceCategory(_ctx.stringValue("DescribeInstanceResponse.Result.instanceCategory"));
		result.setEndtime(_ctx.longValue("DescribeInstanceResponse.Result.endtime"));
		result.setArchType(_ctx.stringValue("DescribeInstanceResponse.Result.archType"));

		List<String> esIPWhitelist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.esIPWhitelist.Length"); i++) {
			esIPWhitelist.add(_ctx.stringValue("DescribeInstanceResponse.Result.esIPWhitelist["+ i +"]"));
		}
		result.setEsIPWhitelist(esIPWhitelist);

		List<Map<Object, Object>> extendConfigs = _ctx.listMapValue("DescribeInstanceResponse.Result.extendConfigs");
		result.setExtendConfigs(extendConfigs);

		List<String> privateNetworkIpWhiteList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.privateNetworkIpWhiteList.Length"); i++) {
			privateNetworkIpWhiteList.add(_ctx.stringValue("DescribeInstanceResponse.Result.privateNetworkIpWhiteList["+ i +"]"));
		}
		result.setPrivateNetworkIpWhiteList(privateNetworkIpWhiteList);

		List<String> publicIpWhitelist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.publicIpWhitelist.Length"); i++) {
			publicIpWhitelist.add(_ctx.stringValue("DescribeInstanceResponse.Result.publicIpWhitelist["+ i +"]"));
		}
		result.setPublicIpWhitelist(publicIpWhitelist);

		List<String> kibanaPrivateIPWhitelist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.kibanaPrivateIPWhitelist.Length"); i++) {
			kibanaPrivateIPWhitelist.add(_ctx.stringValue("DescribeInstanceResponse.Result.kibanaPrivateIPWhitelist["+ i +"]"));
		}
		result.setKibanaPrivateIPWhitelist(kibanaPrivateIPWhitelist);

		List<String> esIPBlacklist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.esIPBlacklist.Length"); i++) {
			esIPBlacklist.add(_ctx.stringValue("DescribeInstanceResponse.Result.esIPBlacklist["+ i +"]"));
		}
		result.setEsIPBlacklist(esIPBlacklist);

		List<String> kibanaIPWhitelist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.kibanaIPWhitelist.Length"); i++) {
			kibanaIPWhitelist.add(_ctx.stringValue("DescribeInstanceResponse.Result.kibanaIPWhitelist["+ i +"]"));
		}
		result.setKibanaIPWhitelist(kibanaIPWhitelist);

		NodeSpec nodeSpec = new NodeSpec();
		nodeSpec.setSpec(_ctx.stringValue("DescribeInstanceResponse.Result.nodeSpec.spec"));
		nodeSpec.setDisk(_ctx.integerValue("DescribeInstanceResponse.Result.nodeSpec.disk"));
		nodeSpec.setDiskEncryption(_ctx.booleanValue("DescribeInstanceResponse.Result.nodeSpec.diskEncryption"));
		nodeSpec.setDiskType(_ctx.stringValue("DescribeInstanceResponse.Result.nodeSpec.diskType"));
		nodeSpec.setPerformanceLevel(_ctx.stringValue("DescribeInstanceResponse.Result.nodeSpec.performanceLevel"));
		nodeSpec.setSpecInfo(_ctx.stringValue("DescribeInstanceResponse.Result.nodeSpec.specInfo"));
		result.setNodeSpec(nodeSpec);

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setVpcId(_ctx.stringValue("DescribeInstanceResponse.Result.networkConfig.vpcId"));
		networkConfig.setVsArea(_ctx.stringValue("DescribeInstanceResponse.Result.networkConfig.vsArea"));
		networkConfig.setType(_ctx.stringValue("DescribeInstanceResponse.Result.networkConfig.type"));
		networkConfig.setVswitchId(_ctx.stringValue("DescribeInstanceResponse.Result.networkConfig.vswitchId"));

		List<WhiteIpGroupListItem> whiteIpGroupList = new ArrayList<WhiteIpGroupListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.networkConfig.whiteIpGroupList.Length"); i++) {
			WhiteIpGroupListItem whiteIpGroupListItem = new WhiteIpGroupListItem();
			whiteIpGroupListItem.setWhiteIpType(_ctx.stringValue("DescribeInstanceResponse.Result.networkConfig.whiteIpGroupList["+ i +"].whiteIpType"));
			whiteIpGroupListItem.setGroupName(_ctx.stringValue("DescribeInstanceResponse.Result.networkConfig.whiteIpGroupList["+ i +"].groupName"));

			List<String> ips = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceResponse.Result.networkConfig.whiteIpGroupList["+ i +"].ips.Length"); j++) {
				ips.add(_ctx.stringValue("DescribeInstanceResponse.Result.networkConfig.whiteIpGroupList["+ i +"].ips["+ j +"]"));
			}
			whiteIpGroupListItem.setIps(ips);

			whiteIpGroupList.add(whiteIpGroupListItem);
		}
		networkConfig.setWhiteIpGroupList(whiteIpGroupList);
		result.setNetworkConfig(networkConfig);

		KibanaConfiguration kibanaConfiguration = new KibanaConfiguration();
		kibanaConfiguration.setAmount(_ctx.integerValue("DescribeInstanceResponse.Result.kibanaConfiguration.amount"));
		kibanaConfiguration.setSpec(_ctx.stringValue("DescribeInstanceResponse.Result.kibanaConfiguration.spec"));
		kibanaConfiguration.setDisk(_ctx.integerValue("DescribeInstanceResponse.Result.kibanaConfiguration.disk"));
		kibanaConfiguration.setSpecInfo(_ctx.stringValue("DescribeInstanceResponse.Result.kibanaConfiguration.specInfo"));
		result.setKibanaConfiguration(kibanaConfiguration);

		MasterConfiguration masterConfiguration = new MasterConfiguration();
		masterConfiguration.setSpec(_ctx.stringValue("DescribeInstanceResponse.Result.masterConfiguration.spec"));
		masterConfiguration.setAmount(_ctx.integerValue("DescribeInstanceResponse.Result.masterConfiguration.amount"));
		masterConfiguration.setDisk(_ctx.integerValue("DescribeInstanceResponse.Result.masterConfiguration.disk"));
		masterConfiguration.setDiskType(_ctx.stringValue("DescribeInstanceResponse.Result.masterConfiguration.diskType"));
		masterConfiguration.setSpecInfo(_ctx.stringValue("DescribeInstanceResponse.Result.masterConfiguration.specInfo"));
		result.setMasterConfiguration(masterConfiguration);

		ClientNodeConfiguration clientNodeConfiguration = new ClientNodeConfiguration();
		clientNodeConfiguration.setSpec(_ctx.stringValue("DescribeInstanceResponse.Result.clientNodeConfiguration.spec"));
		clientNodeConfiguration.setAmount(_ctx.integerValue("DescribeInstanceResponse.Result.clientNodeConfiguration.amount"));
		clientNodeConfiguration.setDisk(_ctx.integerValue("DescribeInstanceResponse.Result.clientNodeConfiguration.disk"));
		clientNodeConfiguration.setDiskType(_ctx.stringValue("DescribeInstanceResponse.Result.clientNodeConfiguration.diskType"));
		clientNodeConfiguration.setSpecInfo(_ctx.stringValue("DescribeInstanceResponse.Result.clientNodeConfiguration.specInfo"));
		result.setClientNodeConfiguration(clientNodeConfiguration);

		WarmNodeConfiguration warmNodeConfiguration = new WarmNodeConfiguration();
		warmNodeConfiguration.setAmount(_ctx.integerValue("DescribeInstanceResponse.Result.warmNodeConfiguration.amount"));
		warmNodeConfiguration.setSpec(_ctx.stringValue("DescribeInstanceResponse.Result.warmNodeConfiguration.spec"));
		warmNodeConfiguration.setDisk(_ctx.integerValue("DescribeInstanceResponse.Result.warmNodeConfiguration.disk"));
		warmNodeConfiguration.setDiskEncryption(_ctx.booleanValue("DescribeInstanceResponse.Result.warmNodeConfiguration.diskEncryption"));
		warmNodeConfiguration.setDiskType(_ctx.stringValue("DescribeInstanceResponse.Result.warmNodeConfiguration.diskType"));
		warmNodeConfiguration.setSpecInfo(_ctx.stringValue("DescribeInstanceResponse.Result.warmNodeConfiguration.specInfo"));
		result.setWarmNodeConfiguration(warmNodeConfiguration);

		AdvancedSetting advancedSetting = new AdvancedSetting();
		advancedSetting.setGcName(_ctx.stringValue("DescribeInstanceResponse.Result.advancedSetting.gcName"));
		result.setAdvancedSetting(advancedSetting);

		ElasticDataNodeConfiguration elasticDataNodeConfiguration = new ElasticDataNodeConfiguration();
		elasticDataNodeConfiguration.setAmount(_ctx.integerValue("DescribeInstanceResponse.Result.elasticDataNodeConfiguration.amount"));
		elasticDataNodeConfiguration.setSpec(_ctx.stringValue("DescribeInstanceResponse.Result.elasticDataNodeConfiguration.spec"));
		elasticDataNodeConfiguration.setDisk(_ctx.integerValue("DescribeInstanceResponse.Result.elasticDataNodeConfiguration.disk"));
		elasticDataNodeConfiguration.setDiskEncryption(_ctx.booleanValue("DescribeInstanceResponse.Result.elasticDataNodeConfiguration.diskEncryption"));
		elasticDataNodeConfiguration.setDiskType(_ctx.stringValue("DescribeInstanceResponse.Result.elasticDataNodeConfiguration.diskType"));
		elasticDataNodeConfiguration.setSpecInfo(_ctx.stringValue("DescribeInstanceResponse.Result.elasticDataNodeConfiguration.specInfo"));
		result.setElasticDataNodeConfiguration(elasticDataNodeConfiguration);

		List<DictListItem> dictList = new ArrayList<DictListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.dictList.Length"); i++) {
			DictListItem dictListItem = new DictListItem();
			dictListItem.setFileSize(_ctx.longValue("DescribeInstanceResponse.Result.dictList["+ i +"].fileSize"));
			dictListItem.setSourceType(_ctx.stringValue("DescribeInstanceResponse.Result.dictList["+ i +"].sourceType"));
			dictListItem.setName(_ctx.stringValue("DescribeInstanceResponse.Result.dictList["+ i +"].name"));
			dictListItem.setType(_ctx.stringValue("DescribeInstanceResponse.Result.dictList["+ i +"].type"));

			dictList.add(dictListItem);
		}
		result.setDictList(dictList);

		List<SynonymsDictsItem> synonymsDicts = new ArrayList<SynonymsDictsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.synonymsDicts.Length"); i++) {
			SynonymsDictsItem synonymsDictsItem = new SynonymsDictsItem();
			synonymsDictsItem.setFileSize(_ctx.longValue("DescribeInstanceResponse.Result.synonymsDicts["+ i +"].fileSize"));
			synonymsDictsItem.setSourceType(_ctx.stringValue("DescribeInstanceResponse.Result.synonymsDicts["+ i +"].sourceType"));
			synonymsDictsItem.setName(_ctx.stringValue("DescribeInstanceResponse.Result.synonymsDicts["+ i +"].name"));
			synonymsDictsItem.setType(_ctx.stringValue("DescribeInstanceResponse.Result.synonymsDicts["+ i +"].type"));

			synonymsDicts.add(synonymsDictsItem);
		}
		result.setSynonymsDicts(synonymsDicts);

		List<ZoneInfo> zoneInfos = new ArrayList<ZoneInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.zoneInfos.Length"); i++) {
			ZoneInfo zoneInfo = new ZoneInfo();
			zoneInfo.setStatus(_ctx.stringValue("DescribeInstanceResponse.Result.zoneInfos["+ i +"].status"));
			zoneInfo.setZoneId(_ctx.stringValue("DescribeInstanceResponse.Result.zoneInfos["+ i +"].zoneId"));

			zoneInfos.add(zoneInfo);
		}
		result.setZoneInfos(zoneInfos);

		List<Dict> aliwsDicts = new ArrayList<Dict>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.aliwsDicts.Length"); i++) {
			Dict dict = new Dict();
			dict.setFileSize(_ctx.longValue("DescribeInstanceResponse.Result.aliwsDicts["+ i +"].fileSize"));
			dict.setSourceType(_ctx.stringValue("DescribeInstanceResponse.Result.aliwsDicts["+ i +"].sourceType"));
			dict.setName(_ctx.stringValue("DescribeInstanceResponse.Result.aliwsDicts["+ i +"].name"));
			dict.setType(_ctx.stringValue("DescribeInstanceResponse.Result.aliwsDicts["+ i +"].type"));

			aliwsDicts.add(dict);
		}
		result.setAliwsDicts(aliwsDicts);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("DescribeInstanceResponse.Result.tags["+ i +"].tagKey"));
			tag.setTagValue(_ctx.stringValue("DescribeInstanceResponse.Result.tags["+ i +"].tagValue"));

			tags.add(tag);
		}
		result.setTags(tags);

		List<IkHotDictsItem> ikHotDicts = new ArrayList<IkHotDictsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.ikHotDicts.Length"); i++) {
			IkHotDictsItem ikHotDictsItem = new IkHotDictsItem();
			ikHotDictsItem.setType(_ctx.stringValue("DescribeInstanceResponse.Result.ikHotDicts["+ i +"].type"));
			ikHotDictsItem.setSourceType(_ctx.stringValue("DescribeInstanceResponse.Result.ikHotDicts["+ i +"].sourceType"));
			ikHotDictsItem.setFileSize(_ctx.integerValue("DescribeInstanceResponse.Result.ikHotDicts["+ i +"].fileSize"));
			ikHotDictsItem.setName(_ctx.stringValue("DescribeInstanceResponse.Result.ikHotDicts["+ i +"].name"));

			ikHotDicts.add(ikHotDictsItem);
		}
		result.setIkHotDicts(ikHotDicts);
		describeInstanceResponse.setResult(result);
	 
	 	return describeInstanceResponse;
	}
}