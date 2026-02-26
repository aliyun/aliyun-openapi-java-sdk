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
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.NetworkConfig.WhiteIpGroupListItem;
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
			instance.setNodeAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].nodeAmount"));
			instance.setCreatedAt(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].createdAt"));
			instance.setStatus(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].status"));
			instance.setDedicateMaster(_ctx.booleanValue("ListInstanceResponse.Result["+ i +"].dedicateMaster"));
			instance.setServiceVpc(_ctx.booleanValue("ListInstanceResponse.Result["+ i +"].serviceVpc"));
			instance.setPaymentType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].paymentType"));
			instance.setResourceGroupId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].resourceGroupId"));
			instance.setPostpaidServiceStatus(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].postpaidServiceStatus"));
			instance.setDescription(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].description"));
			instance.setEsVersion(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].esVersion"));
			instance.setIsNewDeployment(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].isNewDeployment"));
			instance.setUpdatedAt(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].updatedAt"));
			instance.setInstanceId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].instanceId"));
			instance.setVpcInstanceId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].vpcInstanceId"));
			instance.setEndTime(_ctx.longValue("ListInstanceResponse.Result["+ i +"].endTime"));
			instance.setArchType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].archType"));

			List<Map<Object, Object>> extendConfigs = _ctx.listMapValue("ListInstanceResponse.Result["+ i +"].extendConfigs");
			instance.setExtendConfigs(extendConfigs);

			List<String> kibanaIPWhitelist = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceResponse.Result["+ i +"].kibanaIPWhitelist.Length"); j++) {
				kibanaIPWhitelist.add(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].kibanaIPWhitelist["+ j +"]"));
			}
			instance.setKibanaIPWhitelist(kibanaIPWhitelist);

			List<String> kibanaPrivateIPWhitelist = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceResponse.Result["+ i +"].kibanaPrivateIPWhitelist.Length"); j++) {
				kibanaPrivateIPWhitelist.add(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].kibanaPrivateIPWhitelist["+ j +"]"));
			}
			instance.setKibanaPrivateIPWhitelist(kibanaPrivateIPWhitelist);

			List<String> publicIpWhitelist = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceResponse.Result["+ i +"].publicIpWhitelist.Length"); j++) {
				publicIpWhitelist.add(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].publicIpWhitelist["+ j +"]"));
			}
			instance.setPublicIpWhitelist(publicIpWhitelist);

			List<String> privateNetworkIpWhiteList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceResponse.Result["+ i +"].privateNetworkIpWhiteList.Length"); j++) {
				privateNetworkIpWhiteList.add(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].privateNetworkIpWhiteList["+ j +"]"));
			}
			instance.setPrivateNetworkIpWhiteList(privateNetworkIpWhiteList);

			ClientNodeConfiguration clientNodeConfiguration = new ClientNodeConfiguration();
			clientNodeConfiguration.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].clientNodeConfiguration.spec"));
			clientNodeConfiguration.setAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].clientNodeConfiguration.amount"));
			clientNodeConfiguration.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].clientNodeConfiguration.disk"));
			clientNodeConfiguration.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].clientNodeConfiguration.diskType"));
			clientNodeConfiguration.setSpecInfo(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].clientNodeConfiguration.specInfo"));
			instance.setClientNodeConfiguration(clientNodeConfiguration);

			ElasticDataNodeConfiguration elasticDataNodeConfiguration = new ElasticDataNodeConfiguration();
			elasticDataNodeConfiguration.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].elasticDataNodeConfiguration.spec"));
			elasticDataNodeConfiguration.setAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].elasticDataNodeConfiguration.amount"));
			elasticDataNodeConfiguration.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].elasticDataNodeConfiguration.disk"));
			elasticDataNodeConfiguration.setDiskEncryption(_ctx.booleanValue("ListInstanceResponse.Result["+ i +"].elasticDataNodeConfiguration.diskEncryption"));
			elasticDataNodeConfiguration.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].elasticDataNodeConfiguration.diskType"));
			elasticDataNodeConfiguration.setSpecInfo(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].elasticDataNodeConfiguration.specInfo"));
			instance.setElasticDataNodeConfiguration(elasticDataNodeConfiguration);

			KibanaConfiguration kibanaConfiguration = new KibanaConfiguration();
			kibanaConfiguration.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.spec"));
			kibanaConfiguration.setAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.amount"));
			kibanaConfiguration.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.disk"));
			kibanaConfiguration.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.diskType"));
			kibanaConfiguration.setSpecInfo(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.specInfo"));
			instance.setKibanaConfiguration(kibanaConfiguration);

			MasterConfiguration masterConfiguration = new MasterConfiguration();
			masterConfiguration.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.spec"));
			masterConfiguration.setAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.amount"));
			masterConfiguration.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.disk"));
			masterConfiguration.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.diskType"));
			masterConfiguration.setSpecInfo(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.specInfo"));
			instance.setMasterConfiguration(masterConfiguration);

			NetworkConfig networkConfig = new NetworkConfig();
			networkConfig.setVpcId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.vpcId"));
			networkConfig.setVsArea(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.vsArea"));
			networkConfig.setType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.type"));
			networkConfig.setVswitchId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.vswitchId"));

			List<WhiteIpGroupListItem> whiteIpGroupList = new ArrayList<WhiteIpGroupListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListInstanceResponse.Result["+ i +"].networkConfig.whiteIpGroupList.Length"); j++) {
				WhiteIpGroupListItem whiteIpGroupListItem = new WhiteIpGroupListItem();
				whiteIpGroupListItem.setGroupName(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.whiteIpGroupList["+ j +"].groupName"));
				whiteIpGroupListItem.setWhiteIpType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.whiteIpGroupList["+ j +"].whiteIpType"));

				List<String> ips = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListInstanceResponse.Result["+ i +"].networkConfig.whiteIpGroupList["+ j +"].ips.Length"); k++) {
					ips.add(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.whiteIpGroupList["+ j +"].ips["+ k +"]"));
				}
				whiteIpGroupListItem.setIps(ips);

				whiteIpGroupList.add(whiteIpGroupListItem);
			}
			networkConfig.setWhiteIpGroupList(whiteIpGroupList);
			instance.setNetworkConfig(networkConfig);

			NodeSpec nodeSpec = new NodeSpec();
			nodeSpec.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].nodeSpec.spec"));
			nodeSpec.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].nodeSpec.disk"));
			nodeSpec.setDiskEncryption(_ctx.booleanValue("ListInstanceResponse.Result["+ i +"].nodeSpec.diskEncryption"));
			nodeSpec.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].nodeSpec.diskType"));
			nodeSpec.setPerformanceLevel(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].nodeSpec.performanceLevel"));
			nodeSpec.setSpecInfo(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].nodeSpec.specInfo"));
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