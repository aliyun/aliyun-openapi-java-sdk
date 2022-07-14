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

import com.aliyuncs.elasticsearch.model.v20170613.CreateLogstashResponse;
import com.aliyuncs.elasticsearch.model.v20170613.CreateLogstashResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.CreateLogstashResponse.Result.EndpointListItem;
import com.aliyuncs.elasticsearch.model.v20170613.CreateLogstashResponse.Result.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.CreateLogstashResponse.Result.NodeSpec;
import com.aliyuncs.elasticsearch.model.v20170613.CreateLogstashResponse.Result.TagsItem;
import com.aliyuncs.elasticsearch.model.v20170613.CreateLogstashResponse.Result.ZoneInfosItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLogstashResponseUnmarshaller {

	public static CreateLogstashResponse unmarshall(CreateLogstashResponse createLogstashResponse, UnmarshallerContext _ctx) {
		
		createLogstashResponse.setRequestId(_ctx.stringValue("CreateLogstashResponse.RequestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("CreateLogstashResponse.Result.status"));
		result.setDescription(_ctx.stringValue("CreateLogstashResponse.Result.description"));
		result.setResourceGroupId(_ctx.stringValue("CreateLogstashResponse.Result.resourceGroupId"));
		result.setEndTime(_ctx.longValue("CreateLogstashResponse.Result.endTime"));
		result.setInstanceId(_ctx.stringValue("CreateLogstashResponse.Result.instanceId"));
		result.setConfig(_ctx.mapValue("CreateLogstashResponse.Result.config"));
		result.setCreatedAt(_ctx.stringValue("CreateLogstashResponse.Result.createdAt"));
		result.setNodeAmount(_ctx.longValue("CreateLogstashResponse.Result.nodeAmount"));
		result.setUpdatedAt(_ctx.stringValue("CreateLogstashResponse.Result.updatedAt"));
		result.setVersion(_ctx.stringValue("CreateLogstashResponse.Result.version"));
		result.setDataNode(_ctx.booleanValue("CreateLogstashResponse.Result.dataNode"));
		result.setPaymentType(_ctx.stringValue("CreateLogstashResponse.Result.paymentType"));
		result.setBizProtocol(_ctx.stringValue("CreateLogstashResponse.Result.protocol"));
		result.setZoneCount(_ctx.longValue("CreateLogstashResponse.Result.zoneCount"));

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setType(_ctx.stringValue("CreateLogstashResponse.Result.networkConfig.type"));
		networkConfig.setVpcId(_ctx.stringValue("CreateLogstashResponse.Result.networkConfig.vpcId"));
		networkConfig.setVsArea(_ctx.stringValue("CreateLogstashResponse.Result.networkConfig.vsArea"));
		networkConfig.setVswitchId(_ctx.stringValue("CreateLogstashResponse.Result.networkConfig.vswitchId"));
		result.setNetworkConfig(networkConfig);

		NodeSpec nodeSpec = new NodeSpec();
		nodeSpec.setDisk(_ctx.longValue("CreateLogstashResponse.Result.nodeSpec.disk"));
		nodeSpec.setDiskType(_ctx.stringValue("CreateLogstashResponse.Result.nodeSpec.diskType"));
		nodeSpec.setSpec(_ctx.stringValue("CreateLogstashResponse.Result.nodeSpec.spec"));
		result.setNodeSpec(nodeSpec);

		List<EndpointListItem> endpointList = new ArrayList<EndpointListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLogstashResponse.Result.endpointList.Length"); i++) {
			EndpointListItem endpointListItem = new EndpointListItem();
			endpointListItem.setHost(_ctx.stringValue("CreateLogstashResponse.Result.endpointList["+ i +"].host"));
			endpointListItem.setPort(_ctx.longValue("CreateLogstashResponse.Result.endpointList["+ i +"].port"));
			endpointListItem.setZoneId(_ctx.stringValue("CreateLogstashResponse.Result.endpointList["+ i +"].zoneId"));

			endpointList.add(endpointListItem);
		}
		result.setEndpointList(endpointList);

		List<ZoneInfosItem> zoneInfos = new ArrayList<ZoneInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLogstashResponse.Result.zoneInfos.Length"); i++) {
			ZoneInfosItem zoneInfosItem = new ZoneInfosItem();
			zoneInfosItem.setStatus(_ctx.stringValue("CreateLogstashResponse.Result.zoneInfos["+ i +"].status"));
			zoneInfosItem.setZoneId(_ctx.stringValue("CreateLogstashResponse.Result.zoneInfos["+ i +"].zoneId"));

			zoneInfos.add(zoneInfosItem);
		}
		result.setZoneInfos(zoneInfos);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLogstashResponse.Result.tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagKey(_ctx.stringValue("CreateLogstashResponse.Result.tags["+ i +"].tagKey"));
			tagsItem.setTagValue(_ctx.stringValue("CreateLogstashResponse.Result.tags["+ i +"].tagValue"));

			tags.add(tagsItem);
		}
		result.setTags(tags);
		createLogstashResponse.setResult(result);
	 
	 	return createLogstashResponse;
	}
}