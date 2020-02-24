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
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.KibanaConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.MasterConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.NetworkConfig;
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
		result.setInstanceId(_ctx.stringValue("DescribeInstanceResponse.Result.instanceId"));
		result.setDomain(_ctx.stringValue("DescribeInstanceResponse.Result.domain"));
		result.setDescription(_ctx.stringValue("DescribeInstanceResponse.Result.description"));
		result.setNodeAmount(_ctx.integerValue("DescribeInstanceResponse.Result.nodeAmount"));
		result.setPaymentType(_ctx.stringValue("DescribeInstanceResponse.Result.paymentType"));
		result.setStatus(_ctx.stringValue("DescribeInstanceResponse.Result.status"));
		result.setEsVersion(_ctx.stringValue("DescribeInstanceResponse.Result.esVersion"));
		result.setCreatedAt(_ctx.stringValue("DescribeInstanceResponse.Result.createdAt"));
		result.setUpdatedAt(_ctx.stringValue("DescribeInstanceResponse.Result.updatedAt"));
		result.setKibanaDomain(_ctx.stringValue("DescribeInstanceResponse.Result.kibanaDomain"));
		result.setEnablePublic(_ctx.booleanValue("DescribeInstanceResponse.Result.enablePublic"));
		result.setDedicateMaster(_ctx.booleanValue("DescribeInstanceResponse.Result.dedicateMaster"));
		result.setAdvancedDedicateMaster(_ctx.booleanValue("DescribeInstanceResponse.Result.advancedDedicateMaster"));
		result.setPublicPort(_ctx.integerValue("DescribeInstanceResponse.Result.publicPort"));
		result.setKibanaPort(_ctx.integerValue("DescribeInstanceResponse.Result.kibanaPort"));
		result.setPublicDomain(_ctx.stringValue("DescribeInstanceResponse.Result.publicDomain"));
		result.setVpcInstanceId(_ctx.stringValue("DescribeInstanceResponse.Result.vpcInstanceId"));
		result.setPort(_ctx.integerValue("DescribeInstanceResponse.Result.port"));
		result.setEsConfig(_ctx.mapValue("DescribeInstanceResponse.Result.esConfig"));
		result.setZoneCount(_ctx.integerValue("DescribeInstanceResponse.Result.zoneCount"));
		result.setHaveClientNode(_ctx.booleanValue("DescribeInstanceResponse.Result.haveClientNode"));
		result.setWarmNode(_ctx.booleanValue("DescribeInstanceResponse.Result.warmNode"));
		result.setBizProtocol(_ctx.stringValue("DescribeInstanceResponse.Result.protocol"));
		result.setEnableKibanaPublicNetwork(_ctx.booleanValue("DescribeInstanceResponse.Result.enableKibanaPublicNetwork"));
		result.setHaveKibana(_ctx.booleanValue("DescribeInstanceResponse.Result.haveKibana"));

		List<String> esIPWhitelist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.esIPWhitelist.Length"); i++) {
			esIPWhitelist.add(_ctx.stringValue("DescribeInstanceResponse.Result.esIPWhitelist["+ i +"]"));
		}
		result.setEsIPWhitelist(esIPWhitelist);

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

		List<String> publicIpWhitelist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.publicIpWhitelist.Length"); i++) {
			publicIpWhitelist.add(_ctx.stringValue("DescribeInstanceResponse.Result.publicIpWhitelist["+ i +"]"));
		}
		result.setPublicIpWhitelist(publicIpWhitelist);

		List<String> privateNetworkIpWhiteList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.privateNetworkIpWhiteList.Length"); i++) {
			privateNetworkIpWhiteList.add(_ctx.stringValue("DescribeInstanceResponse.Result.privateNetworkIpWhiteList["+ i +"]"));
		}
		result.setPrivateNetworkIpWhiteList(privateNetworkIpWhiteList);

		NodeSpec nodeSpec = new NodeSpec();
		nodeSpec.setSpec(_ctx.stringValue("DescribeInstanceResponse.Result.nodeSpec.spec"));
		nodeSpec.setDisk(_ctx.integerValue("DescribeInstanceResponse.Result.nodeSpec.disk"));
		nodeSpec.setDiskType(_ctx.stringValue("DescribeInstanceResponse.Result.nodeSpec.diskType"));
		nodeSpec.setDiskEncryption(_ctx.booleanValue("DescribeInstanceResponse.Result.nodeSpec.diskEncryption"));
		result.setNodeSpec(nodeSpec);

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setType(_ctx.stringValue("DescribeInstanceResponse.Result.networkConfig.type"));
		networkConfig.setVpcId(_ctx.stringValue("DescribeInstanceResponse.Result.networkConfig.vpcId"));
		networkConfig.setVswitchId(_ctx.stringValue("DescribeInstanceResponse.Result.networkConfig.vswitchId"));
		networkConfig.setVsArea(_ctx.stringValue("DescribeInstanceResponse.Result.networkConfig.vsArea"));
		result.setNetworkConfig(networkConfig);

		KibanaConfiguration kibanaConfiguration = new KibanaConfiguration();
		kibanaConfiguration.setSpec(_ctx.stringValue("DescribeInstanceResponse.Result.kibanaConfiguration.spec"));
		kibanaConfiguration.setAmount(_ctx.integerValue("DescribeInstanceResponse.Result.kibanaConfiguration.amount"));
		result.setKibanaConfiguration(kibanaConfiguration);

		MasterConfiguration masterConfiguration = new MasterConfiguration();
		masterConfiguration.setSpec(_ctx.stringValue("DescribeInstanceResponse.Result.masterConfiguration.spec"));
		masterConfiguration.setAmount(_ctx.integerValue("DescribeInstanceResponse.Result.masterConfiguration.amount"));
		masterConfiguration.setDiskType(_ctx.stringValue("DescribeInstanceResponse.Result.masterConfiguration.diskType"));
		masterConfiguration.setDisk(_ctx.integerValue("DescribeInstanceResponse.Result.masterConfiguration.disk"));
		result.setMasterConfiguration(masterConfiguration);

		ClientNodeConfiguration clientNodeConfiguration = new ClientNodeConfiguration();
		clientNodeConfiguration.setSpec(_ctx.stringValue("DescribeInstanceResponse.Result.clientNodeConfiguration.spec"));
		clientNodeConfiguration.setAmount(_ctx.integerValue("DescribeInstanceResponse.Result.clientNodeConfiguration.amount"));
		clientNodeConfiguration.setDiskType(_ctx.stringValue("DescribeInstanceResponse.Result.clientNodeConfiguration.diskType"));
		clientNodeConfiguration.setDisk(_ctx.integerValue("DescribeInstanceResponse.Result.clientNodeConfiguration.disk"));
		result.setClientNodeConfiguration(clientNodeConfiguration);

		WarmNodeConfiguration warmNodeConfiguration = new WarmNodeConfiguration();
		warmNodeConfiguration.setSpec(_ctx.stringValue("DescribeInstanceResponse.Result.warmNodeConfiguration.spec"));
		warmNodeConfiguration.setAmount(_ctx.integerValue("DescribeInstanceResponse.Result.warmNodeConfiguration.amount"));
		warmNodeConfiguration.setDiskType(_ctx.stringValue("DescribeInstanceResponse.Result.warmNodeConfiguration.diskType"));
		warmNodeConfiguration.setDisk(_ctx.integerValue("DescribeInstanceResponse.Result.warmNodeConfiguration.disk"));
		warmNodeConfiguration.setDiskEncryption(_ctx.booleanValue("DescribeInstanceResponse.Result.warmNodeConfiguration.diskEncryption"));
		result.setWarmNodeConfiguration(warmNodeConfiguration);

		AdvancedSetting advancedSetting = new AdvancedSetting();
		advancedSetting.setGcName(_ctx.stringValue("DescribeInstanceResponse.Result.advancedSetting.gcName"));
		result.setAdvancedSetting(advancedSetting);

		List<DictListItem> dictList = new ArrayList<DictListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.dictList.Length"); i++) {
			DictListItem dictListItem = new DictListItem();
			dictListItem.setName(_ctx.stringValue("DescribeInstanceResponse.Result.dictList["+ i +"].name"));
			dictListItem.setFileSize(_ctx.longValue("DescribeInstanceResponse.Result.dictList["+ i +"].fileSize"));
			dictListItem.setType(_ctx.stringValue("DescribeInstanceResponse.Result.dictList["+ i +"].type"));
			dictListItem.setSourceType(_ctx.stringValue("DescribeInstanceResponse.Result.dictList["+ i +"].sourceType"));

			dictList.add(dictListItem);
		}
		result.setDictList(dictList);

		List<SynonymsDictsItem> synonymsDicts = new ArrayList<SynonymsDictsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.synonymsDicts.Length"); i++) {
			SynonymsDictsItem synonymsDictsItem = new SynonymsDictsItem();
			synonymsDictsItem.setName(_ctx.stringValue("DescribeInstanceResponse.Result.synonymsDicts["+ i +"].name"));
			synonymsDictsItem.setFileSize(_ctx.longValue("DescribeInstanceResponse.Result.synonymsDicts["+ i +"].fileSize"));
			synonymsDictsItem.setType(_ctx.stringValue("DescribeInstanceResponse.Result.synonymsDicts["+ i +"].type"));
			synonymsDictsItem.setSourceType(_ctx.stringValue("DescribeInstanceResponse.Result.synonymsDicts["+ i +"].sourceType"));

			synonymsDicts.add(synonymsDictsItem);
		}
		result.setSynonymsDicts(synonymsDicts);

		List<ZoneInfo> zoneInfos = new ArrayList<ZoneInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.zoneInfos.Length"); i++) {
			ZoneInfo zoneInfo = new ZoneInfo();
			zoneInfo.setZoneId(_ctx.stringValue("DescribeInstanceResponse.Result.zoneInfos["+ i +"].zoneId"));
			zoneInfo.setStatus(_ctx.stringValue("DescribeInstanceResponse.Result.zoneInfos["+ i +"].status"));

			zoneInfos.add(zoneInfo);
		}
		result.setZoneInfos(zoneInfos);

		List<Dict> aliwsDicts = new ArrayList<Dict>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Result.aliwsDicts.Length"); i++) {
			Dict dict = new Dict();
			dict.setName(_ctx.stringValue("DescribeInstanceResponse.Result.aliwsDicts["+ i +"].name"));
			dict.setFileSize(_ctx.longValue("DescribeInstanceResponse.Result.aliwsDicts["+ i +"].fileSize"));
			dict.setType(_ctx.stringValue("DescribeInstanceResponse.Result.aliwsDicts["+ i +"].type"));
			dict.setSourceType(_ctx.stringValue("DescribeInstanceResponse.Result.aliwsDicts["+ i +"].sourceType"));

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
		describeInstanceResponse.setResult(result);
	 
	 	return describeInstanceResponse;
	}
}