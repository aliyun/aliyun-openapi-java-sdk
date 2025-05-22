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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeTagsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeTagsResponse.TagInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagsResponseUnmarshaller {

	public static DescribeTagsResponse unmarshall(DescribeTagsResponse describeTagsResponse, UnmarshallerContext _ctx) {
		
		describeTagsResponse.setRequestId(_ctx.stringValue("DescribeTagsResponse.RequestId"));

		List<TagInfos> items = new ArrayList<TagInfos>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagsResponse.Items.Length"); i++) {
			TagInfos tagInfos = new TagInfos();
			tagInfos.setTagKey(_ctx.stringValue("DescribeTagsResponse.Items["+ i +"].TagKey"));
			tagInfos.setTagValue(_ctx.stringValue("DescribeTagsResponse.Items["+ i +"].TagValue"));

			List<String> dBInstanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTagsResponse.Items["+ i +"].DBInstanceIds.Length"); j++) {
				dBInstanceIds.add(_ctx.stringValue("DescribeTagsResponse.Items["+ i +"].DBInstanceIds["+ j +"]"));
			}
			tagInfos.setDBInstanceIds(dBInstanceIds);

			items.add(tagInfos);
		}
		describeTagsResponse.setItems(items);
	 
	 	return describeTagsResponse;
	}
}