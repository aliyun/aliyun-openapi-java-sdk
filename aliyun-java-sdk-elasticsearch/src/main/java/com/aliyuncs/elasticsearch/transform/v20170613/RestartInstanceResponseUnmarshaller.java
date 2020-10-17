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

import com.aliyuncs.elasticsearch.model.v20170613.RestartInstanceResponse;
import com.aliyuncs.elasticsearch.model.v20170613.RestartInstanceResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.RestartInstanceResponse.Result.DictListItem;
import com.aliyuncs.elasticsearch.model.v20170613.RestartInstanceResponse.Result.KibanaConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.RestartInstanceResponse.Result.MasterConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.RestartInstanceResponse.Result.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.RestartInstanceResponse.Result.NodeSpec;
import com.aliyuncs.elasticsearch.model.v20170613.RestartInstanceResponse.Result.SynonymsDictsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestartInstanceResponseUnmarshaller {

	public static RestartInstanceResponse unmarshall(RestartInstanceResponse restartInstanceResponse, UnmarshallerContext _ctx) {
		
		restartInstanceResponse.setRequestId(_ctx.stringValue("RestartInstanceResponse.RequestId"));

		Result result = new Result();
		result.setCreatedAt(_ctx.stringValue("RestartInstanceResponse.Result.createdAt"));
		result.setDescription(_ctx.stringValue("RestartInstanceResponse.Result.description"));
		result.setDomain(_ctx.stringValue("RestartInstanceResponse.Result.domain"));
		result.setEsVersion(_ctx.stringValue("RestartInstanceResponse.Result.esVersion"));
		result.setInstanceId(_ctx.stringValue("RestartInstanceResponse.Result.instanceId"));
		result.setKibanaDomain(_ctx.stringValue("RestartInstanceResponse.Result.kibanaDomain"));
		result.setKibanaPort(_ctx.integerValue("RestartInstanceResponse.Result.kibanaPort"));
		result.setNodeAmount(_ctx.integerValue("RestartInstanceResponse.Result.nodeAmount"));
		result.setPaymentType(_ctx.stringValue("RestartInstanceResponse.Result.paymentType"));
		result.setPublicDomain(_ctx.stringValue("RestartInstanceResponse.Result.publicDomain"));
		result.setPublicPort(_ctx.integerValue("RestartInstanceResponse.Result.publicPort"));
		result.setStatus(_ctx.stringValue("RestartInstanceResponse.Result.status"));
		result.setUpdatedAt(_ctx.stringValue("RestartInstanceResponse.Result.updatedAt"));

		KibanaConfiguration kibanaConfiguration = new KibanaConfiguration();
		kibanaConfiguration.setAmount(_ctx.integerValue("RestartInstanceResponse.Result.kibanaConfiguration.amount"));
		kibanaConfiguration.setDisk(_ctx.integerValue("RestartInstanceResponse.Result.kibanaConfiguration.disk"));
		kibanaConfiguration.setDiskType(_ctx.stringValue("RestartInstanceResponse.Result.kibanaConfiguration.diskType"));
		kibanaConfiguration.setSpec(_ctx.stringValue("RestartInstanceResponse.Result.kibanaConfiguration.spec"));
		result.setKibanaConfiguration(kibanaConfiguration);

		MasterConfiguration masterConfiguration = new MasterConfiguration();
		masterConfiguration.setAmount(_ctx.integerValue("RestartInstanceResponse.Result.masterConfiguration.amount"));
		masterConfiguration.setDisk(_ctx.integerValue("RestartInstanceResponse.Result.masterConfiguration.disk"));
		masterConfiguration.setDiskType(_ctx.stringValue("RestartInstanceResponse.Result.masterConfiguration.diskType"));
		masterConfiguration.setSpec(_ctx.stringValue("RestartInstanceResponse.Result.masterConfiguration.spec"));
		result.setMasterConfiguration(masterConfiguration);

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setType(_ctx.stringValue("RestartInstanceResponse.Result.networkConfig.type"));
		networkConfig.setVpcId(_ctx.stringValue("RestartInstanceResponse.Result.networkConfig.vpcId"));
		networkConfig.setVsArea(_ctx.stringValue("RestartInstanceResponse.Result.networkConfig.vsArea"));
		networkConfig.setVswitchId(_ctx.stringValue("RestartInstanceResponse.Result.networkConfig.vswitchId"));
		result.setNetworkConfig(networkConfig);

		NodeSpec nodeSpec = new NodeSpec();
		nodeSpec.setDisk(_ctx.integerValue("RestartInstanceResponse.Result.nodeSpec.disk"));
		nodeSpec.setDiskType(_ctx.stringValue("RestartInstanceResponse.Result.nodeSpec.diskType"));
		nodeSpec.setSpec(_ctx.stringValue("RestartInstanceResponse.Result.nodeSpec.spec"));
		result.setNodeSpec(nodeSpec);

		List<DictListItem> dictList = new ArrayList<DictListItem>();
		for (int i = 0; i < _ctx.lengthValue("RestartInstanceResponse.Result.dictList.Length"); i++) {
			DictListItem dictListItem = new DictListItem();
			dictListItem.setFileSize(_ctx.longValue("RestartInstanceResponse.Result.dictList["+ i +"].fileSize"));
			dictListItem.setName(_ctx.stringValue("RestartInstanceResponse.Result.dictList["+ i +"].name"));
			dictListItem.setSourceType(_ctx.stringValue("RestartInstanceResponse.Result.dictList["+ i +"].sourceType"));
			dictListItem.setType(_ctx.stringValue("RestartInstanceResponse.Result.dictList["+ i +"].type"));

			dictList.add(dictListItem);
		}
		result.setDictList(dictList);

		List<SynonymsDictsItem> synonymsDicts = new ArrayList<SynonymsDictsItem>();
		for (int i = 0; i < _ctx.lengthValue("RestartInstanceResponse.Result.synonymsDicts.Length"); i++) {
			SynonymsDictsItem synonymsDictsItem = new SynonymsDictsItem();
			synonymsDictsItem.setFileSize(_ctx.longValue("RestartInstanceResponse.Result.synonymsDicts["+ i +"].fileSize"));
			synonymsDictsItem.setName(_ctx.stringValue("RestartInstanceResponse.Result.synonymsDicts["+ i +"].name"));
			synonymsDictsItem.setSourceType(_ctx.stringValue("RestartInstanceResponse.Result.synonymsDicts["+ i +"].sourceType"));
			synonymsDictsItem.setType(_ctx.stringValue("RestartInstanceResponse.Result.synonymsDicts["+ i +"].type"));

			synonymsDicts.add(synonymsDictsItem);
		}
		result.setSynonymsDicts(synonymsDicts);
		restartInstanceResponse.setResult(result);
	 
	 	return restartInstanceResponse;
	}
}