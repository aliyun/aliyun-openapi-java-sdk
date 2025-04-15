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

import com.aliyuncs.ecs.model.v20140526.DescribePortRangeListsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribePortRangeListsResponse.PortRangeList;
import com.aliyuncs.ecs.model.v20140526.DescribePortRangeListsResponse.PortRangeList.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePortRangeListsResponseUnmarshaller {

	public static DescribePortRangeListsResponse unmarshall(DescribePortRangeListsResponse describePortRangeListsResponse, UnmarshallerContext _ctx) {
		
		describePortRangeListsResponse.setRequestId(_ctx.stringValue("DescribePortRangeListsResponse.RequestId"));
		describePortRangeListsResponse.setNextToken(_ctx.stringValue("DescribePortRangeListsResponse.NextToken"));

		List<PortRangeList> portRangeLists = new ArrayList<PortRangeList>();
		for (int i = 0; i < _ctx.lengthValue("DescribePortRangeListsResponse.PortRangeLists.Length"); i++) {
			PortRangeList portRangeList = new PortRangeList();
			portRangeList.setPortRangeListId(_ctx.stringValue("DescribePortRangeListsResponse.PortRangeLists["+ i +"].PortRangeListId"));
			portRangeList.setPortRangeListName(_ctx.stringValue("DescribePortRangeListsResponse.PortRangeLists["+ i +"].PortRangeListName"));
			portRangeList.setMaxEntries(_ctx.integerValue("DescribePortRangeListsResponse.PortRangeLists["+ i +"].MaxEntries"));
			portRangeList.setAssociationCount(_ctx.integerValue("DescribePortRangeListsResponse.PortRangeLists["+ i +"].AssociationCount"));
			portRangeList.setDescription(_ctx.stringValue("DescribePortRangeListsResponse.PortRangeLists["+ i +"].Description"));
			portRangeList.setCreationTime(_ctx.stringValue("DescribePortRangeListsResponse.PortRangeLists["+ i +"].CreationTime"));
			portRangeList.setResourceGroupId(_ctx.stringValue("DescribePortRangeListsResponse.PortRangeLists["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribePortRangeListsResponse.PortRangeLists["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribePortRangeListsResponse.PortRangeLists["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribePortRangeListsResponse.PortRangeLists["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			portRangeList.setTags(tags);

			portRangeLists.add(portRangeList);
		}
		describePortRangeListsResponse.setPortRangeLists(portRangeLists);
	 
	 	return describePortRangeListsResponse;
	}
}