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

import com.aliyuncs.ecs.model.v20140526.DescribeVscsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeVscsResponse.Vsc;
import com.aliyuncs.ecs.model.v20140526.DescribeVscsResponse.Vsc.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVscsResponseUnmarshaller {

	public static DescribeVscsResponse unmarshall(DescribeVscsResponse describeVscsResponse, UnmarshallerContext _ctx) {
		
		describeVscsResponse.setRequestId(_ctx.stringValue("DescribeVscsResponse.RequestId"));
		describeVscsResponse.setNextToken(_ctx.stringValue("DescribeVscsResponse.NextToken"));

		List<Vsc> vscs = new ArrayList<Vsc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVscsResponse.Vscs.Length"); i++) {
			Vsc vsc = new Vsc();
			vsc.setVscId(_ctx.stringValue("DescribeVscsResponse.Vscs["+ i +"].VscId"));
			vsc.setVscName(_ctx.stringValue("DescribeVscsResponse.Vscs["+ i +"].VscName"));
			vsc.setVscType(_ctx.stringValue("DescribeVscsResponse.Vscs["+ i +"].VscType"));
			vsc.setDescription(_ctx.stringValue("DescribeVscsResponse.Vscs["+ i +"].Description"));
			vsc.setStatus(_ctx.stringValue("DescribeVscsResponse.Vscs["+ i +"].Status"));
			vsc.setInstanceId(_ctx.stringValue("DescribeVscsResponse.Vscs["+ i +"].InstanceId"));
			vsc.setResourceGroupId(_ctx.stringValue("DescribeVscsResponse.Vscs["+ i +"].ResourceGroupId"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVscsResponse.Vscs["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagKey(_ctx.stringValue("DescribeVscsResponse.Vscs["+ i +"].Tags["+ j +"].TagKey"));
				tagsItem.setTagValue(_ctx.stringValue("DescribeVscsResponse.Vscs["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tagsItem);
			}
			vsc.setTags(tags);

			vscs.add(vsc);
		}
		describeVscsResponse.setVscs(vscs);
	 
	 	return describeVscsResponse;
	}
}