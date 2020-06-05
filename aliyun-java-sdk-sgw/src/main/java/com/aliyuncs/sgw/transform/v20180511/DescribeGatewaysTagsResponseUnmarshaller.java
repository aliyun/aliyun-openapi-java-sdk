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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewaysTagsResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewaysTagsResponse.GatewayTag;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewaysTagsResponse.GatewayTag.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewaysTagsResponseUnmarshaller {

	public static DescribeGatewaysTagsResponse unmarshall(DescribeGatewaysTagsResponse describeGatewaysTagsResponse, UnmarshallerContext _ctx) {
		
		describeGatewaysTagsResponse.setRequestId(_ctx.stringValue("DescribeGatewaysTagsResponse.RequestId"));
		describeGatewaysTagsResponse.setSuccess(_ctx.booleanValue("DescribeGatewaysTagsResponse.Success"));
		describeGatewaysTagsResponse.setCode(_ctx.stringValue("DescribeGatewaysTagsResponse.Code"));
		describeGatewaysTagsResponse.setMessage(_ctx.stringValue("DescribeGatewaysTagsResponse.Message"));

		List<GatewayTag> gatewayTags = new ArrayList<GatewayTag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewaysTagsResponse.GatewayTags.Length"); i++) {
			GatewayTag gatewayTag = new GatewayTag();
			gatewayTag.setGatewayId(_ctx.stringValue("DescribeGatewaysTagsResponse.GatewayTags["+ i +"].GatewayId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGatewaysTagsResponse.GatewayTags["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeGatewaysTagsResponse.GatewayTags["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeGatewaysTagsResponse.GatewayTags["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			gatewayTag.setTags(tags);

			gatewayTags.add(gatewayTag);
		}
		describeGatewaysTagsResponse.setGatewayTags(gatewayTags);
	 
	 	return describeGatewaysTagsResponse;
	}
}