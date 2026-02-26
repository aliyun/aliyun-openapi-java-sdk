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

import com.aliyuncs.elasticsearch.model.v20170613.ListLogstashResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListLogstashResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListLogstashResponse.Instance;
import com.aliyuncs.elasticsearch.model.v20170613.ListLogstashResponse.Instance.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.ListLogstashResponse.Instance.NodeSpec;
import com.aliyuncs.elasticsearch.model.v20170613.ListLogstashResponse.Instance.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLogstashResponseUnmarshaller {

	public static ListLogstashResponse unmarshall(ListLogstashResponse listLogstashResponse, UnmarshallerContext _ctx) {
		
		listLogstashResponse.setRequestId(_ctx.stringValue("ListLogstashResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListLogstashResponse.Headers.X-Total-Count"));
		listLogstashResponse.setHeaders(headers);

		List<Instance> result = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListLogstashResponse.Result.Length"); i++) {
			Instance instance = new Instance();
			instance.setPaymentType(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].paymentType"));
			instance.setNodeAmount(_ctx.integerValue("ListLogstashResponse.Result["+ i +"].nodeAmount"));
			instance.setDescription(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].description"));
			instance.setCreatedAt(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].createdAt"));
			instance.setStatus(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].status"));
			instance.setUpdatedAt(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].updatedAt"));
			instance.setInstanceId(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].instanceId"));
			instance.setVersion(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].version"));
			instance.setResourceGroupId(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].resourceGroupId"));

			NodeSpec nodeSpec = new NodeSpec();
			nodeSpec.setSpec(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].nodeSpec.spec"));
			nodeSpec.setDisk(_ctx.integerValue("ListLogstashResponse.Result["+ i +"].nodeSpec.disk"));
			nodeSpec.setDiskEncryption(_ctx.booleanValue("ListLogstashResponse.Result["+ i +"].nodeSpec.diskEncryption"));
			nodeSpec.setDiskType(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].nodeSpec.diskType"));
			instance.setNodeSpec(nodeSpec);

			NetworkConfig networkConfig = new NetworkConfig();
			networkConfig.setVpcId(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].networkConfig.vpcId"));
			networkConfig.setVsArea(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].networkConfig.vsArea"));
			networkConfig.setType(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].networkConfig.type"));
			networkConfig.setVswitchId(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].networkConfig.vswitchId"));
			instance.setNetworkConfig(networkConfig);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListLogstashResponse.Result["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagValue(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].Tags["+ j +"].TagValue"));
				tagsItem.setTagKey(_ctx.stringValue("ListLogstashResponse.Result["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tagsItem);
			}
			instance.setTags(tags);

			result.add(instance);
		}
		listLogstashResponse.setResult(result);
	 
	 	return listLogstashResponse;
	}
}