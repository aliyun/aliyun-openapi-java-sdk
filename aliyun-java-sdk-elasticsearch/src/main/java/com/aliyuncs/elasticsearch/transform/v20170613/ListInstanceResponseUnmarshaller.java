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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceResponseUnmarshaller {

	public static ListInstanceResponse unmarshall(ListInstanceResponse listInstanceResponse, UnmarshallerContext context) {
		
		listInstanceResponse.setRequestId(context.stringValue("ListInstanceResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(context.integerValue("ListInstanceResponse.Headers.X-Total-Count"));
		listInstanceResponse.setHeaders(headers);

		List<Instance> result = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("ListInstanceResponse.Result.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(context.stringValue("ListInstanceResponse.Result["+ i +"].instanceId"));
			instance.setDescription(context.stringValue("ListInstanceResponse.Result["+ i +"].description"));
			instance.setNodeAmount(context.integerValue("ListInstanceResponse.Result["+ i +"].nodeAmount"));
			instance.setPaymentType(context.stringValue("ListInstanceResponse.Result["+ i +"].paymentType"));
			instance.setStatus(context.stringValue("ListInstanceResponse.Result["+ i +"].status"));
			instance.setEsVersion(context.stringValue("ListInstanceResponse.Result["+ i +"].esVersion"));
			instance.setCreatedAt(context.stringValue("ListInstanceResponse.Result["+ i +"].createdAt"));
			instance.setUpdatedAt(context.stringValue("ListInstanceResponse.Result["+ i +"].updatedAt"));
			instance.setAdvancedDedicateMaster(context.booleanValue("ListInstanceResponse.Result["+ i +"].advancedDedicateMaster"));
			instance.setDedicateMaster(context.booleanValue("ListInstanceResponse.Result["+ i +"].dedicateMaster"));

			NodeSpec nodeSpec = new NodeSpec();
			nodeSpec.setSpec(context.stringValue("ListInstanceResponse.Result["+ i +"].nodeSpec.spec"));
			nodeSpec.setDisk(context.integerValue("ListInstanceResponse.Result["+ i +"].nodeSpec.disk"));
			nodeSpec.setDiskType(context.stringValue("ListInstanceResponse.Result["+ i +"].nodeSpec.diskType"));
			instance.setNodeSpec(nodeSpec);

			NetworkConfig networkConfig = new NetworkConfig();
			networkConfig.setType(context.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.type"));
			networkConfig.setVpcId(context.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.vpcId"));
			networkConfig.setVswitchId(context.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.vswitchId"));
			networkConfig.setVsArea(context.stringValue("ListInstanceResponse.Result["+ i +"].networkConfig.vsArea"));
			instance.setNetworkConfig(networkConfig);

			MasterConfiguration masterConfiguration = new MasterConfiguration();
			masterConfiguration.setSpec(context.stringValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.spec"));
			masterConfiguration.setAmount(context.integerValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.amount"));
			masterConfiguration.setDiskType(context.stringValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.diskType"));
			masterConfiguration.setDisk(context.integerValue("ListInstanceResponse.Result["+ i +"].masterConfiguration.disk"));
			instance.setMasterConfiguration(masterConfiguration);

			KibanaConfiguration kibanaConfiguration = new KibanaConfiguration();
			kibanaConfiguration.setSpec(context.stringValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.spec"));
			kibanaConfiguration.setDisk(context.integerValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.disk"));
			kibanaConfiguration.setAmount(context.integerValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.amount"));
			kibanaConfiguration.setDiskType(context.stringValue("ListInstanceResponse.Result["+ i +"].kibanaConfiguration.diskType"));
			instance.setKibanaConfiguration(kibanaConfiguration);

			result.add(instance);
		}
		listInstanceResponse.setResult(result);
	 
	 	return listInstanceResponse;
	}
}