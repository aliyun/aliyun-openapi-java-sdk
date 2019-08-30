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

import com.aliyuncs.elasticsearch.model.v20170613.MoveResourceGroupResponse;
import com.aliyuncs.elasticsearch.model.v20170613.MoveResourceGroupResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.MoveResourceGroupResponse.Result.DictListItem;
import com.aliyuncs.elasticsearch.model.v20170613.MoveResourceGroupResponse.Result.KibanaConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.MoveResourceGroupResponse.Result.MasterConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.MoveResourceGroupResponse.Result.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.MoveResourceGroupResponse.Result.NodeSpec;
import com.aliyuncs.elasticsearch.model.v20170613.MoveResourceGroupResponse.Result.SynonymsDictsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class MoveResourceGroupResponseUnmarshaller {

	public static MoveResourceGroupResponse unmarshall(MoveResourceGroupResponse moveResourceGroupResponse, UnmarshallerContext _ctx) {
		
		moveResourceGroupResponse.setRequestId(_ctx.stringValue("MoveResourceGroupResponse.RequestId"));

		Result result = new Result();
		result.setInstanceId(_ctx.stringValue("MoveResourceGroupResponse.Result.instanceId"));
		result.setDomain(_ctx.stringValue("MoveResourceGroupResponse.Result.domain"));
		result.setDescription(_ctx.stringValue("MoveResourceGroupResponse.Result.description"));
		result.setNodeAmount(_ctx.integerValue("MoveResourceGroupResponse.Result.nodeAmount"));
		result.setPaymentType(_ctx.stringValue("MoveResourceGroupResponse.Result.paymentType"));
		result.setStatus(_ctx.stringValue("MoveResourceGroupResponse.Result.status"));
		result.setEsVersion(_ctx.stringValue("MoveResourceGroupResponse.Result.esVersion"));
		result.setCreatedAt(_ctx.stringValue("MoveResourceGroupResponse.Result.createdAt"));
		result.setUpdatedAt(_ctx.stringValue("MoveResourceGroupResponse.Result.updatedAt"));
		result.setKibanaDomain(_ctx.stringValue("MoveResourceGroupResponse.Result.kibanaDomain"));
		result.setKibanaPort(_ctx.integerValue("MoveResourceGroupResponse.Result.kibanaPort"));
		result.setPublicDomain(_ctx.stringValue("MoveResourceGroupResponse.Result.publicDomain"));
		result.setPublicPort(_ctx.integerValue("MoveResourceGroupResponse.Result.publicPort"));

		NodeSpec nodeSpec = new NodeSpec();
		nodeSpec.setSpec(_ctx.stringValue("MoveResourceGroupResponse.Result.nodeSpec.spec"));
		nodeSpec.setDisk(_ctx.integerValue("MoveResourceGroupResponse.Result.nodeSpec.disk"));
		nodeSpec.setDiskType(_ctx.stringValue("MoveResourceGroupResponse.Result.nodeSpec.diskType"));
		result.setNodeSpec(nodeSpec);

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setType(_ctx.stringValue("MoveResourceGroupResponse.Result.networkConfig.type"));
		networkConfig.setVpcId(_ctx.stringValue("MoveResourceGroupResponse.Result.networkConfig.vpcId"));
		networkConfig.setVswitchId(_ctx.stringValue("MoveResourceGroupResponse.Result.networkConfig.vswitchId"));
		networkConfig.setVsArea(_ctx.stringValue("MoveResourceGroupResponse.Result.networkConfig.vsArea"));
		result.setNetworkConfig(networkConfig);

		KibanaConfiguration kibanaConfiguration = new KibanaConfiguration();
		kibanaConfiguration.setSpec(_ctx.stringValue("MoveResourceGroupResponse.Result.kibanaConfiguration.spec"));
		kibanaConfiguration.setAmount(_ctx.integerValue("MoveResourceGroupResponse.Result.kibanaConfiguration.amount"));
		kibanaConfiguration.setDiskType(_ctx.stringValue("MoveResourceGroupResponse.Result.kibanaConfiguration.diskType"));
		kibanaConfiguration.setDisk(_ctx.integerValue("MoveResourceGroupResponse.Result.kibanaConfiguration.disk"));
		result.setKibanaConfiguration(kibanaConfiguration);

		MasterConfiguration masterConfiguration = new MasterConfiguration();
		masterConfiguration.setSpec(_ctx.stringValue("MoveResourceGroupResponse.Result.masterConfiguration.spec"));
		masterConfiguration.setAmount(_ctx.integerValue("MoveResourceGroupResponse.Result.masterConfiguration.amount"));
		masterConfiguration.setDiskType(_ctx.stringValue("MoveResourceGroupResponse.Result.masterConfiguration.diskType"));
		masterConfiguration.setDisk(_ctx.integerValue("MoveResourceGroupResponse.Result.masterConfiguration.disk"));
		result.setMasterConfiguration(masterConfiguration);

		List<DictListItem> dictList = new ArrayList<DictListItem>();
		for (int i = 0; i < _ctx.lengthValue("MoveResourceGroupResponse.Result.dictList.Length"); i++) {
			DictListItem dictListItem = new DictListItem();
			dictListItem.setName(_ctx.stringValue("MoveResourceGroupResponse.Result.dictList["+ i +"].name"));
			dictListItem.setFileSize(_ctx.longValue("MoveResourceGroupResponse.Result.dictList["+ i +"].fileSize"));
			dictListItem.setType(_ctx.stringValue("MoveResourceGroupResponse.Result.dictList["+ i +"].type"));
			dictListItem.setSourceType(_ctx.stringValue("MoveResourceGroupResponse.Result.dictList["+ i +"].sourceType"));

			dictList.add(dictListItem);
		}
		result.setDictList(dictList);

		List<SynonymsDictsItem> synonymsDicts = new ArrayList<SynonymsDictsItem>();
		for (int i = 0; i < _ctx.lengthValue("MoveResourceGroupResponse.Result.synonymsDicts.Length"); i++) {
			SynonymsDictsItem synonymsDictsItem = new SynonymsDictsItem();
			synonymsDictsItem.setName(_ctx.stringValue("MoveResourceGroupResponse.Result.synonymsDicts["+ i +"].name"));
			synonymsDictsItem.setFileSize(_ctx.longValue("MoveResourceGroupResponse.Result.synonymsDicts["+ i +"].fileSize"));
			synonymsDictsItem.setType(_ctx.stringValue("MoveResourceGroupResponse.Result.synonymsDicts["+ i +"].type"));
			synonymsDictsItem.setSourceType(_ctx.stringValue("MoveResourceGroupResponse.Result.synonymsDicts["+ i +"].sourceType"));

			synonymsDicts.add(synonymsDictsItem);
		}
		result.setSynonymsDicts(synonymsDicts);
		moveResourceGroupResponse.setResult(result);
	 
	 	return moveResourceGroupResponse;
	}
}