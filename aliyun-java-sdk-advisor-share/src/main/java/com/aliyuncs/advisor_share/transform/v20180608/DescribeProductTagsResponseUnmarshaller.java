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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.DescribeProductTagsResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeProductTagsResponse.ResourceTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProductTagsResponseUnmarshaller {

	public static DescribeProductTagsResponse unmarshall(DescribeProductTagsResponse describeProductTagsResponse, UnmarshallerContext _ctx) {
		
		describeProductTagsResponse.setRequestId(_ctx.stringValue("DescribeProductTagsResponse.RequestId"));
		describeProductTagsResponse.setCode(_ctx.stringValue("DescribeProductTagsResponse.Code"));

		List<ResourceTag> data = new ArrayList<ResourceTag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProductTagsResponse.Data.Length"); i++) {
			ResourceTag resourceTag = new ResourceTag();
			resourceTag.setTagValue(_ctx.stringValue("DescribeProductTagsResponse.Data["+ i +"].TagValue"));
			resourceTag.setProduct(_ctx.stringValue("DescribeProductTagsResponse.Data["+ i +"].Product"));
			resourceTag.setRegion(_ctx.stringValue("DescribeProductTagsResponse.Data["+ i +"].Region"));
			resourceTag.setTagKey(_ctx.longValue("DescribeProductTagsResponse.Data["+ i +"].TagKey"));

			data.add(resourceTag);
		}
		describeProductTagsResponse.setData(data);
	 
	 	return describeProductTagsResponse;
	}
}