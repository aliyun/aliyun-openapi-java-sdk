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
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.ClientNodeConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.DictListItem;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.KibanaConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.MasterConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.NodeSpec;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.SynonymsDictsItem;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeInstanceResponse.Result.WarmNodeConfiguration;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext context) {
		
		describeInstanceResponse.setRequestId(context.stringValue("DescribeInstanceResponse.RequestId"));

		Result result = new Result();
		result.setInstanceId(context.stringValue("DescribeInstanceResponse.Result.instanceId"));
		result.setDomain(context.stringValue("DescribeInstanceResponse.Result.domain"));
		result.setDescription(context.stringValue("DescribeInstanceResponse.Result.description"));
		result.setNodeAmount(context.integerValue("DescribeInstanceResponse.Result.nodeAmount"));
		result.setPaymentType(context.stringValue("DescribeInstanceResponse.Result.paymentType"));
		result.setStatus(context.stringValue("DescribeInstanceResponse.Result.status"));
		result.setEsVersion(context.stringValue("DescribeInstanceResponse.Result.esVersion"));
		result.setCreatedAt(context.stringValue("DescribeInstanceResponse.Result.createdAt"));
		result.setUpdatedAt(context.stringValue("DescribeInstanceResponse.Result.updatedAt"));
		result.setKibanaDomain(context.stringValue("DescribeInstanceResponse.Result.kibanaDomain"));
		result.setEnablePublic(context.booleanValue("DescribeInstanceResponse.Result.enablePublic"));
		result.setDedicateMaster(context.booleanValue("DescribeInstanceResponse.Result.dedicateMaster"));
		result.setAdvancedDedicateMaster(context.booleanValue("DescribeInstanceResponse.Result.advancedDedicateMaster"));
		result.setPublicPort(context.integerValue("DescribeInstanceResponse.Result.publicPort"));
		result.setKibanaPort(context.integerValue("DescribeInstanceResponse.Result.kibanaPort"));
		result.setPublicDomain(context.stringValue("DescribeInstanceResponse.Result.publicDomain"));
		result.setVpcInstanceId(context.stringValue("DescribeInstanceResponse.Result.vpcInstanceId"));
		result.setPort(context.integerValue("DescribeInstanceResponse.Result.port"));
		result.setEsConfig(context.mapValue("DescribeInstanceResponse.Result.esConfig"));
		result.setZoneCount(context.integerValue("DescribeInstanceResponse.Result.zoneCount"));
		result.setHaveClientNode(context.booleanValue("DescribeInstanceResponse.Result.haveClientNode"));
		result.setWarmNode(context.booleanValue("DescribeInstanceResponse.Result.warmNode"));

		List<String> esIPWhitelist = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceResponse.Result.esIPWhitelist.Length"); i++) {
			esIPWhitelist.add(context.stringValue("DescribeInstanceResponse.Result.esIPWhitelist["+ i +"]"));
		}
		result.setEsIPWhitelist(esIPWhitelist);

		List<String> esIPBlacklist = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceResponse.Result.esIPBlacklist.Length"); i++) {
			esIPBlacklist.add(context.stringValue("DescribeInstanceResponse.Result.esIPBlacklist["+ i +"]"));
		}
		result.setEsIPBlacklist(esIPBlacklist);

		List<String> kibanaIPWhitelist = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceResponse.Result.kibanaIPWhitelist.Length"); i++) {
			kibanaIPWhitelist.add(context.stringValue("DescribeInstanceResponse.Result.kibanaIPWhitelist["+ i +"]"));
		}
		result.setKibanaIPWhitelist(kibanaIPWhitelist);

		List<String> publicIpWhitelist = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceResponse.Result.publicIpWhitelist.Length"); i++) {
			publicIpWhitelist.add(context.stringValue("DescribeInstanceResponse.Result.publicIpWhitelist["+ i +"]"));
		}
		result.setPublicIpWhitelist(publicIpWhitelist);

		List<String> privateNetworkIpWhiteList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceResponse.Result.privateNetworkIpWhiteList.Length"); i++) {
			privateNetworkIpWhiteList.add(context.stringValue("DescribeInstanceResponse.Result.privateNetworkIpWhiteList["+ i +"]"));
		}
		result.setPrivateNetworkIpWhiteList(privateNetworkIpWhiteList);

		NodeSpec nodeSpec = new NodeSpec();
		nodeSpec.setSpec(context.stringValue("DescribeInstanceResponse.Result.nodeSpec.spec"));
		nodeSpec.setDisk(context.integerValue("DescribeInstanceResponse.Result.nodeSpec.disk"));
		nodeSpec.setDiskType(context.stringValue("DescribeInstanceResponse.Result.nodeSpec.diskType"));
		result.setNodeSpec(nodeSpec);

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setType(context.stringValue("DescribeInstanceResponse.Result.networkConfig.type"));
		networkConfig.setVpcId(context.stringValue("DescribeInstanceResponse.Result.networkConfig.vpcId"));
		networkConfig.setVswitchId(context.stringValue("DescribeInstanceResponse.Result.networkConfig.vswitchId"));
		networkConfig.setVsArea(context.stringValue("DescribeInstanceResponse.Result.networkConfig.vsArea"));
		result.setNetworkConfig(networkConfig);

		KibanaConfiguration kibanaConfiguration = new KibanaConfiguration();
		kibanaConfiguration.setSpec(context.stringValue("DescribeInstanceResponse.Result.kibanaConfiguration.spec"));
		kibanaConfiguration.setAmount(context.integerValue("DescribeInstanceResponse.Result.kibanaConfiguration.amount"));
		kibanaConfiguration.setDiskType(context.stringValue("DescribeInstanceResponse.Result.kibanaConfiguration.diskType"));
		kibanaConfiguration.setDisk(context.integerValue("DescribeInstanceResponse.Result.kibanaConfiguration.disk"));
		result.setKibanaConfiguration(kibanaConfiguration);

		MasterConfiguration masterConfiguration = new MasterConfiguration();
		masterConfiguration.setSpec(context.stringValue("DescribeInstanceResponse.Result.masterConfiguration.spec"));
		masterConfiguration.setAmount(context.integerValue("DescribeInstanceResponse.Result.masterConfiguration.amount"));
		masterConfiguration.setDiskType(context.stringValue("DescribeInstanceResponse.Result.masterConfiguration.diskType"));
		masterConfiguration.setDisk(context.integerValue("DescribeInstanceResponse.Result.masterConfiguration.disk"));
		result.setMasterConfiguration(masterConfiguration);

		ClientNodeConfiguration clientNodeConfiguration = new ClientNodeConfiguration();
		clientNodeConfiguration.setSpec(context.stringValue("DescribeInstanceResponse.Result.clientNodeConfiguration.spec"));
		clientNodeConfiguration.setAmount(context.integerValue("DescribeInstanceResponse.Result.clientNodeConfiguration.amount"));
		clientNodeConfiguration.setDiskType(context.stringValue("DescribeInstanceResponse.Result.clientNodeConfiguration.diskType"));
		clientNodeConfiguration.setDisk(context.integerValue("DescribeInstanceResponse.Result.clientNodeConfiguration.disk"));
		result.setClientNodeConfiguration(clientNodeConfiguration);

		WarmNodeConfiguration warmNodeConfiguration = new WarmNodeConfiguration();
		warmNodeConfiguration.setSpec(context.stringValue("DescribeInstanceResponse.Result.warmNodeConfiguration.spec"));
		warmNodeConfiguration.setAmount(context.integerValue("DescribeInstanceResponse.Result.warmNodeConfiguration.amount"));
		warmNodeConfiguration.setDiskType(context.stringValue("DescribeInstanceResponse.Result.warmNodeConfiguration.diskType"));
		warmNodeConfiguration.setDisk(context.integerValue("DescribeInstanceResponse.Result.warmNodeConfiguration.disk"));
		result.setWarmNodeConfiguration(warmNodeConfiguration);

		List<DictListItem> dictList = new ArrayList<DictListItem>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceResponse.Result.dictList.Length"); i++) {
			DictListItem dictListItem = new DictListItem();
			dictListItem.setName(context.stringValue("DescribeInstanceResponse.Result.dictList["+ i +"].name"));
			dictListItem.setFileSize(context.longValue("DescribeInstanceResponse.Result.dictList["+ i +"].fileSize"));
			dictListItem.setType(context.stringValue("DescribeInstanceResponse.Result.dictList["+ i +"].type"));
			dictListItem.setSourceType(context.stringValue("DescribeInstanceResponse.Result.dictList["+ i +"].sourceType"));

			dictList.add(dictListItem);
		}
		result.setDictList(dictList);

		List<SynonymsDictsItem> synonymsDicts = new ArrayList<SynonymsDictsItem>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceResponse.Result.synonymsDicts.Length"); i++) {
			SynonymsDictsItem synonymsDictsItem = new SynonymsDictsItem();
			synonymsDictsItem.setName(context.stringValue("DescribeInstanceResponse.Result.synonymsDicts["+ i +"].name"));
			synonymsDictsItem.setFileSize(context.longValue("DescribeInstanceResponse.Result.synonymsDicts["+ i +"].fileSize"));
			synonymsDictsItem.setType(context.stringValue("DescribeInstanceResponse.Result.synonymsDicts["+ i +"].type"));
			synonymsDictsItem.setSourceType(context.stringValue("DescribeInstanceResponse.Result.synonymsDicts["+ i +"].sourceType"));

			synonymsDicts.add(synonymsDictsItem);
		}
		result.setSynonymsDicts(synonymsDicts);
		describeInstanceResponse.setResult(result);
	 
	 	return describeInstanceResponse;
	}
}