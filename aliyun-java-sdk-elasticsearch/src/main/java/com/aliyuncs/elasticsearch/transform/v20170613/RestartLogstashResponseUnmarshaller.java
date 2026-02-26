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

import com.aliyuncs.elasticsearch.model.v20170613.RestartLogstashResponse;
import com.aliyuncs.elasticsearch.model.v20170613.RestartLogstashResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.RestartLogstashResponse.Result.EndpointListItem;
import com.aliyuncs.elasticsearch.model.v20170613.RestartLogstashResponse.Result.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.RestartLogstashResponse.Result.NodeSpec;
import com.aliyuncs.elasticsearch.model.v20170613.RestartLogstashResponse.Result.TagsItem;
import com.aliyuncs.elasticsearch.model.v20170613.RestartLogstashResponse.Result.ZoneInfosItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestartLogstashResponseUnmarshaller {

	public static RestartLogstashResponse unmarshall(RestartLogstashResponse restartLogstashResponse, UnmarshallerContext _ctx) {
		
		restartLogstashResponse.setRequestId(_ctx.stringValue("RestartLogstashResponse.RequestId"));

		Result result = new Result();
		result.setStatus(_ctx.stringValue("RestartLogstashResponse.Result.status"));
		result.setDescription(_ctx.stringValue("RestartLogstashResponse.Result.description"));
		result.setResourceGroupId(_ctx.stringValue("RestartLogstashResponse.Result.resourceGroupId"));
		result.setEndTime(_ctx.longValue("RestartLogstashResponse.Result.endTime"));
		result.setInstanceId(_ctx.stringValue("RestartLogstashResponse.Result.instanceId"));
		result.setConfig(_ctx.mapValue("RestartLogstashResponse.Result.config"));
		result.setCreatedAt(_ctx.stringValue("RestartLogstashResponse.Result.createdAt"));
		result.setNodeAmount(_ctx.longValue("RestartLogstashResponse.Result.nodeAmount"));
		result.setUpdatedAt(_ctx.stringValue("RestartLogstashResponse.Result.updatedAt"));
		result.setVersion(_ctx.stringValue("RestartLogstashResponse.Result.version"));
		result.setDataNode(_ctx.booleanValue("RestartLogstashResponse.Result.dataNode"));
		result.setPaymentType(_ctx.stringValue("RestartLogstashResponse.Result.paymentType"));
		result.setBizProtocol(_ctx.stringValue("RestartLogstashResponse.Result.protocol"));
		result.setZoneCount(_ctx.longValue("RestartLogstashResponse.Result.zoneCount"));

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setType(_ctx.stringValue("RestartLogstashResponse.Result.networkConfig.type"));
		networkConfig.setVpcId(_ctx.stringValue("RestartLogstashResponse.Result.networkConfig.vpcId"));
		networkConfig.setVsArea(_ctx.stringValue("RestartLogstashResponse.Result.networkConfig.vsArea"));
		networkConfig.setVswitchId(_ctx.stringValue("RestartLogstashResponse.Result.networkConfig.vswitchId"));
		result.setNetworkConfig(networkConfig);

		NodeSpec nodeSpec = new NodeSpec();
		nodeSpec.setDisk(_ctx.longValue("RestartLogstashResponse.Result.nodeSpec.disk"));
		nodeSpec.setDiskType(_ctx.stringValue("RestartLogstashResponse.Result.nodeSpec.diskType"));
		nodeSpec.setSpec(_ctx.stringValue("RestartLogstashResponse.Result.nodeSpec.spec"));
		result.setNodeSpec(nodeSpec);

		List<EndpointListItem> endpointList = new ArrayList<EndpointListItem>();
		for (int i = 0; i < _ctx.lengthValue("RestartLogstashResponse.Result.endpointList.Length"); i++) {
			EndpointListItem endpointListItem = new EndpointListItem();
			endpointListItem.setHost(_ctx.stringValue("RestartLogstashResponse.Result.endpointList["+ i +"].host"));
			endpointListItem.setPort(_ctx.longValue("RestartLogstashResponse.Result.endpointList["+ i +"].port"));
			endpointListItem.setZoneId(_ctx.stringValue("RestartLogstashResponse.Result.endpointList["+ i +"].zoneId"));

			endpointList.add(endpointListItem);
		}
		result.setEndpointList(endpointList);

		List<ZoneInfosItem> zoneInfos = new ArrayList<ZoneInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("RestartLogstashResponse.Result.zoneInfos.Length"); i++) {
			ZoneInfosItem zoneInfosItem = new ZoneInfosItem();
			zoneInfosItem.setStatus(_ctx.stringValue("RestartLogstashResponse.Result.zoneInfos["+ i +"].status"));
			zoneInfosItem.setZoneId(_ctx.stringValue("RestartLogstashResponse.Result.zoneInfos["+ i +"].zoneId"));

			zoneInfos.add(zoneInfosItem);
		}
		result.setZoneInfos(zoneInfos);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("RestartLogstashResponse.Result.tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagKey(_ctx.stringValue("RestartLogstashResponse.Result.tags["+ i +"].tagKey"));
			tagsItem.setTagValue(_ctx.stringValue("RestartLogstashResponse.Result.tags["+ i +"].tagValue"));

			tags.add(tagsItem);
		}
		result.setTags(tags);
		restartLogstashResponse.setResult(result);
	 
	 	return restartLogstashResponse;
	}
}