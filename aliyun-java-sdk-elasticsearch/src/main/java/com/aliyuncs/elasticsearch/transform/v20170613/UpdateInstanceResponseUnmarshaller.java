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

import com.aliyuncs.elasticsearch.model.v20170613.UpdateInstanceResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateInstanceResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateInstanceResponse.Result.DictListItem;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateInstanceResponse.Result.KibanaConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateInstanceResponse.Result.MasterConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateInstanceResponse.Result.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateInstanceResponse.Result.NodeSpec;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateInstanceResponse.Result.SynonymsDictsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateInstanceResponseUnmarshaller {

	public static UpdateInstanceResponse unmarshall(UpdateInstanceResponse updateInstanceResponse, UnmarshallerContext _ctx) {
		
		updateInstanceResponse.setRequestId(_ctx.stringValue("UpdateInstanceResponse.RequestId"));
		updateInstanceResponse.setCode(_ctx.stringValue("UpdateInstanceResponse.Code"));
		updateInstanceResponse.setMessage(_ctx.stringValue("UpdateInstanceResponse.Message"));

		Result result = new Result();
		result.setNodeAmount(_ctx.integerValue("UpdateInstanceResponse.Result.nodeAmount"));
		result.setPublicDomain(_ctx.stringValue("UpdateInstanceResponse.Result.publicDomain"));
		result.setCreatedAt(_ctx.stringValue("UpdateInstanceResponse.Result.createdAt"));
		result.setStatus(_ctx.stringValue("UpdateInstanceResponse.Result.status"));
		result.setPublicPort(_ctx.integerValue("UpdateInstanceResponse.Result.publicPort"));
		result.setKibanaPort(_ctx.integerValue("UpdateInstanceResponse.Result.kibanaPort"));
		result.setPaymentType(_ctx.stringValue("UpdateInstanceResponse.Result.paymentType"));
		result.setDomain(_ctx.stringValue("UpdateInstanceResponse.Result.domain"));
		result.setDescription(_ctx.stringValue("UpdateInstanceResponse.Result.description"));
		result.setEsVersion(_ctx.stringValue("UpdateInstanceResponse.Result.esVersion"));
		result.setKibanaDomain(_ctx.stringValue("UpdateInstanceResponse.Result.kibanaDomain"));
		result.setUpdatedAt(_ctx.stringValue("UpdateInstanceResponse.Result.updatedAt"));
		result.setInstanceId(_ctx.stringValue("UpdateInstanceResponse.Result.instanceId"));

		NodeSpec nodeSpec = new NodeSpec();
		nodeSpec.setSpec(_ctx.stringValue("UpdateInstanceResponse.Result.nodeSpec.spec"));
		nodeSpec.setDisk(_ctx.integerValue("UpdateInstanceResponse.Result.nodeSpec.disk"));
		nodeSpec.setDiskType(_ctx.stringValue("UpdateInstanceResponse.Result.nodeSpec.diskType"));
		result.setNodeSpec(nodeSpec);

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setVpcId(_ctx.stringValue("UpdateInstanceResponse.Result.networkConfig.vpcId"));
		networkConfig.setVsArea(_ctx.stringValue("UpdateInstanceResponse.Result.networkConfig.vsArea"));
		networkConfig.setType(_ctx.stringValue("UpdateInstanceResponse.Result.networkConfig.type"));
		networkConfig.setVswitchId(_ctx.stringValue("UpdateInstanceResponse.Result.networkConfig.vswitchId"));
		result.setNetworkConfig(networkConfig);

		KibanaConfiguration kibanaConfiguration = new KibanaConfiguration();
		kibanaConfiguration.setSpec(_ctx.stringValue("UpdateInstanceResponse.Result.kibanaConfiguration.spec"));
		kibanaConfiguration.setAmount(_ctx.integerValue("UpdateInstanceResponse.Result.kibanaConfiguration.amount"));
		kibanaConfiguration.setDisk(_ctx.integerValue("UpdateInstanceResponse.Result.kibanaConfiguration.disk"));
		kibanaConfiguration.setDiskType(_ctx.stringValue("UpdateInstanceResponse.Result.kibanaConfiguration.diskType"));
		result.setKibanaConfiguration(kibanaConfiguration);

		MasterConfiguration masterConfiguration = new MasterConfiguration();
		masterConfiguration.setSpec(_ctx.stringValue("UpdateInstanceResponse.Result.masterConfiguration.spec"));
		masterConfiguration.setAmount(_ctx.integerValue("UpdateInstanceResponse.Result.masterConfiguration.amount"));
		masterConfiguration.setDisk(_ctx.integerValue("UpdateInstanceResponse.Result.masterConfiguration.disk"));
		masterConfiguration.setDiskType(_ctx.stringValue("UpdateInstanceResponse.Result.masterConfiguration.diskType"));
		result.setMasterConfiguration(masterConfiguration);

		List<DictListItem> dictList = new ArrayList<DictListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateInstanceResponse.Result.dictList.Length"); i++) {
			DictListItem dictListItem = new DictListItem();
			dictListItem.setFileSize(_ctx.longValue("UpdateInstanceResponse.Result.dictList["+ i +"].fileSize"));
			dictListItem.setSourceType(_ctx.stringValue("UpdateInstanceResponse.Result.dictList["+ i +"].sourceType"));
			dictListItem.setName(_ctx.stringValue("UpdateInstanceResponse.Result.dictList["+ i +"].name"));
			dictListItem.setType(_ctx.stringValue("UpdateInstanceResponse.Result.dictList["+ i +"].type"));

			dictList.add(dictListItem);
		}
		result.setDictList(dictList);

		List<SynonymsDictsItem> synonymsDicts = new ArrayList<SynonymsDictsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateInstanceResponse.Result.synonymsDicts.Length"); i++) {
			SynonymsDictsItem synonymsDictsItem = new SynonymsDictsItem();
			synonymsDictsItem.setFileSize(_ctx.longValue("UpdateInstanceResponse.Result.synonymsDicts["+ i +"].fileSize"));
			synonymsDictsItem.setSourceType(_ctx.stringValue("UpdateInstanceResponse.Result.synonymsDicts["+ i +"].sourceType"));
			synonymsDictsItem.setName(_ctx.stringValue("UpdateInstanceResponse.Result.synonymsDicts["+ i +"].name"));
			synonymsDictsItem.setType(_ctx.stringValue("UpdateInstanceResponse.Result.synonymsDicts["+ i +"].type"));

			synonymsDicts.add(synonymsDictsItem);
		}
		result.setSynonymsDicts(synonymsDicts);
		updateInstanceResponse.setResult(result);
	 
	 	return updateInstanceResponse;
	}
}