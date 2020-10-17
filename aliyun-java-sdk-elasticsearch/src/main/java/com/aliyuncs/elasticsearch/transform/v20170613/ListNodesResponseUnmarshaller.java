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

import com.aliyuncs.elasticsearch.model.v20170613.ListNodesResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListNodesResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListNodesResponse.ResultItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListNodesResponse.ResultItem.IpAddressItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListNodesResponse.ResultItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesResponseUnmarshaller {

	public static ListNodesResponse unmarshall(ListNodesResponse listNodesResponse, UnmarshallerContext _ctx) {
		
		listNodesResponse.setRequestId(_ctx.stringValue("ListNodesResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListNodesResponse.Headers.X-Total-Count"));
		listNodesResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListNodesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setEcsInstanceId(_ctx.stringValue("ListNodesResponse.Result["+ i +"].ecsInstanceId"));
			resultItem.setEcsInstanceName(_ctx.stringValue("ListNodesResponse.Result["+ i +"].ecsInstanceName"));
			resultItem.setStatus(_ctx.stringValue("ListNodesResponse.Result["+ i +"].status"));
			resultItem.setOsType(_ctx.stringValue("ListNodesResponse.Result["+ i +"].osType"));
			resultItem.setCloudAssistantStatus(_ctx.stringValue("ListNodesResponse.Result["+ i +"].cloudAssistantStatus"));
			resultItem.setAgentStatus(_ctx.stringValue("ListNodesResponse.Result["+ i +"].agentStatus"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListNodesResponse.Result["+ i +"].tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagKey(_ctx.stringValue("ListNodesResponse.Result["+ i +"].tags["+ j +"].tagKey"));
				tagsItem.setTagValue(_ctx.stringValue("ListNodesResponse.Result["+ i +"].tags["+ j +"].tagValue"));

				tags.add(tagsItem);
			}
			resultItem.setTags(tags);

			List<IpAddressItem> ipAddress = new ArrayList<IpAddressItem>();
			for (int j = 0; j < _ctx.lengthValue("ListNodesResponse.Result["+ i +"].ipAddress.Length"); j++) {
				IpAddressItem ipAddressItem = new IpAddressItem();
				ipAddressItem.setHost(_ctx.stringValue("ListNodesResponse.Result["+ i +"].ipAddress["+ j +"].host"));
				ipAddressItem.setIpType(_ctx.stringValue("ListNodesResponse.Result["+ i +"].ipAddress["+ j +"].ipType"));

				ipAddress.add(ipAddressItem);
			}
			resultItem.setIpAddress(ipAddress);

			result.add(resultItem);
		}
		listNodesResponse.setResult(result);
	 
	 	return listNodesResponse;
	}
}