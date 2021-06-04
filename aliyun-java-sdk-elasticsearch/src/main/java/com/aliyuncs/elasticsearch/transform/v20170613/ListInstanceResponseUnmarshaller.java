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

import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.ClientNodeConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.ElasticDataNodeConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.KibanaConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.MasterConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.NodeSpec;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.Tag;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceResponseUnmarshaller {

	public static ListInstanceResponse unmarshall(ListInstanceResponse listInstanceResponse, UnmarshallerContext _ctx) {
		
		listInstanceResponse.setRequestId(_ctx.stringValue("ListInstanceResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListInstanceResponse.Headers.X-Total-Count"));
		listInstanceResponse.setHeaders(headers);

		List<Instance> result = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceResponse.Result.Length"); i++) {
			Instance instance = new Instance();
			instance.setAdvancedDedicateMaster(_ctx.booleanValue("ListInstanceResponse.Result["+ i +"].advancedDedicateMaster"));
			instance.setCreatedAt(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].createdAt"));
			instance.setDedicateMaster(_ctx.booleanValue("ListInstanceResponse.Result["+ i +"].dedicateMaster"));
			instance.setDescription(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].description"));
			instance.setEsVersion(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].esVersion"));
			instance.setInstanceId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].instanceId"));
			instance.setNodeAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].nodeAmount"));
			instance.setPaymentType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].paymentType"));
			instance.setResourceGroupId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].resourceGroupId"));
			instance.setStatus(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].status"));
			instance.setUpdatedAt(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].updatedAt"));
			instance.setPostpaidServiceStatus(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].postpaidServiceStatus"));

			List<Map<Object, Object>> extendConfigs = _ctx.listMapValue("ListInstanceResponse.Result["+ i +"].extendConfigs");
			instance.setExtendConfigs(extendConfigs);

			ClientNodeConfiguration clientNodeConfiguration = new ClientNodeConfiguration();
			clientNodeConfiguration.setAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].clientNodeConfiguration.amount"));
			clientNodeConfiguration.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].clientNodeConfiguration.disk"));
			clientNodeConfiguration.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].clientNodeConfiguration.diskType"));
			clientNodeConfiguration.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].clientNodeConfiguration.spec"));
			instance.setClientNodeConfiguration(clientNodeConfiguration);

			ElasticDataNodeConfiguration elasticDataNodeConfiguration = new ElasticDataNodeConfiguration();
			elasticDataNodeConfiguration.setAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].elasticDataNodeConfiguration.amount"));
			elasticDataNodeConfiguration.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].elasticDataNodeConfiguration.disk"));
			elasticDataNodeConfiguration.setDiskEncryption(_ctx.booleanValue("ListInstanceResponse.Result["+ i +"].elasticDataNodeConfiguration.diskEncryption"));
			elasticDataNodeConfiguration.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].elasticDataNodeConfiguration.diskType"));
			elasticDataNodeConfiguration.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].elasticDataNodeConfiguration.spec"));
			instance.setElasticDataNodeConfiguration(elasticDataNodeConfiguration);

			KibanaConfiguration kibanaConfiguration = new KibanaConfiguration();
			kibanaConfiguration.setAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.amount"));
			kibanaConfiguration.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.disk"));
			kibanaConfiguration.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.diskType"));
			kibanaConfiguration.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.spec"));
			instance.setKibanaConfiguration(kibanaConfiguration);

			MasterConfiguration masterConfiguration = new MasterConfiguration();
			masterConfiguration.setAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.amount"));
			masterConfiguration.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.disk"));
			masterConfiguration.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.diskType"));
			masterConfiguration.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.spec"));
			instance.setMasterConfiguration(masterConfiguration);

			NetworkConfig networkConfig = new NetworkConfig();
			networkConfig.setType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.type"));
			networkConfig.setVpcId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.vpcId"));
			networkConfig.setVsArea(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.vsArea"));
			networkConfig.setVswitchId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.vswitchId"));
			instance.setNetworkConfig(networkConfig);

			NodeSpec nodeSpec = new NodeSpec();
			nodeSpec.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].nodeSpec.disk"));
			nodeSpec.setDiskEncryption(_ctx.booleanValue("ListInstanceResponse.Result["+ i +"].nodeSpec.diskEncryption"));
			nodeSpec.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].nodeSpec.diskType"));
			nodeSpec.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].nodeSpec.spec"));
			instance.setNodeSpec(nodeSpec);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceResponse.Result["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].tags["+ j +"].tagKey"));
				tag.setTagValue(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].tags["+ j +"].tagValue"));

				tags.add(tag);
			}
			instance.setTags(tags);

			result.add(instance);
		}
		listInstanceResponse.setResult(result);
	 
	 	return listInstanceResponse;
	}
}