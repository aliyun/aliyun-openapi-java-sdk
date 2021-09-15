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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeImageComponentsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeImageComponentsResponse.ImageComponentSet;
import com.aliyuncs.ecs.model.v20140526.DescribeImageComponentsResponse.ImageComponentSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageComponentsResponseUnmarshaller {

	public static DescribeImageComponentsResponse unmarshall(DescribeImageComponentsResponse describeImageComponentsResponse, UnmarshallerContext _ctx) {
		
		describeImageComponentsResponse.setRequestId(_ctx.stringValue("DescribeImageComponentsResponse.RequestId"));
		describeImageComponentsResponse.setNextToken(_ctx.stringValue("DescribeImageComponentsResponse.NextToken"));
		describeImageComponentsResponse.setTotalCount(_ctx.integerValue("DescribeImageComponentsResponse.TotalCount"));
		describeImageComponentsResponse.setMaxResults(_ctx.integerValue("DescribeImageComponentsResponse.MaxResults"));

		List<ImageComponentSet> imageComponent = new ArrayList<ImageComponentSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageComponentsResponse.ImageComponent.Length"); i++) {
			ImageComponentSet imageComponentSet = new ImageComponentSet();
			imageComponentSet.setCreationTime(_ctx.stringValue("DescribeImageComponentsResponse.ImageComponent["+ i +"].CreationTime"));
			imageComponentSet.setDescription(_ctx.stringValue("DescribeImageComponentsResponse.ImageComponent["+ i +"].Description"));
			imageComponentSet.setSystemType(_ctx.stringValue("DescribeImageComponentsResponse.ImageComponent["+ i +"].SystemType"));
			imageComponentSet.setImageComponentId(_ctx.stringValue("DescribeImageComponentsResponse.ImageComponent["+ i +"].ImageComponentId"));
			imageComponentSet.setComponentType(_ctx.stringValue("DescribeImageComponentsResponse.ImageComponent["+ i +"].ComponentType"));
			imageComponentSet.setResourceGroupId(_ctx.stringValue("DescribeImageComponentsResponse.ImageComponent["+ i +"].ResourceGroupId"));
			imageComponentSet.setName(_ctx.stringValue("DescribeImageComponentsResponse.ImageComponent["+ i +"].Name"));
			imageComponentSet.setContent(_ctx.stringValue("DescribeImageComponentsResponse.ImageComponent["+ i +"].Content"));
			imageComponentSet.setOwner(_ctx.stringValue("DescribeImageComponentsResponse.ImageComponent["+ i +"].Owner"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImageComponentsResponse.ImageComponent["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeImageComponentsResponse.ImageComponent["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeImageComponentsResponse.ImageComponent["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			imageComponentSet.setTags(tags);

			imageComponent.add(imageComponentSet);
		}
		describeImageComponentsResponse.setImageComponent(imageComponent);
	 
	 	return describeImageComponentsResponse;
	}
}