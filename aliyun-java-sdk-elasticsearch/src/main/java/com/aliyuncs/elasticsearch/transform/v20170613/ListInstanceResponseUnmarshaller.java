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
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.KibanaConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.MasterConfiguration;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.NodeSpec;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceResponse.Instance.Tag;
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
			instance.setInstanceId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].instanceId"));
			instance.setDescription(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].description"));
			instance.setNodeAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].nodeAmount"));
			instance.setPaymentType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].paymentType"));
			instance.setStatus(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].status"));
			instance.setEsVersion(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].esVersion"));
			instance.setCreatedAt(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].createdAt"));
			instance.setUpdatedAt(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].updatedAt"));
			instance.setAdvancedDedicateMaster(_ctx.booleanValue("ListInstanceResponse.Result["+ i +"].advancedDedicateMaster"));
			instance.setDedicateMaster(_ctx.booleanValue("ListInstanceResponse.Result["+ i +"].dedicateMaster"));

			NodeSpec nodeSpec = new NodeSpec();
			nodeSpec.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].nodeSpec.spec"));
			nodeSpec.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].nodeSpec.disk"));
			nodeSpec.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].nodeSpec.diskType"));
			instance.setNodeSpec(nodeSpec);

			NetworkConfig networkConfig = new NetworkConfig();
			networkConfig.setType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.type"));
			networkConfig.setVpcId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.vpcId"));
			networkConfig.setVswitchId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.vswitchId"));
			networkConfig.setVsArea(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.vsArea"));
			instance.setNetworkConfig(networkConfig);

			MasterConfiguration masterConfiguration = new MasterConfiguration();
			masterConfiguration.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.spec"));
			masterConfiguration.setAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.amount"));
			masterConfiguration.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.diskType"));
			masterConfiguration.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.disk"));
			instance.setMasterConfiguration(masterConfiguration);

			KibanaConfiguration kibanaConfiguration = new KibanaConfiguration();
			kibanaConfiguration.setSpec(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.spec"));
			kibanaConfiguration.setDisk(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.disk"));
			kibanaConfiguration.setAmount(_ctx.integerValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.amount"));
			kibanaConfiguration.setDiskType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.diskType"));
			instance.setKibanaConfiguration(kibanaConfiguration);

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