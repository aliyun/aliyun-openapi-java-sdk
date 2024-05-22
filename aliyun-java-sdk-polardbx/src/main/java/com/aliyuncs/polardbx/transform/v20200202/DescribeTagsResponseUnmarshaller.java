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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeTagsResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeTagsResponse.TagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagsResponseUnmarshaller {

	public static DescribeTagsResponse unmarshall(DescribeTagsResponse describeTagsResponse, UnmarshallerContext _ctx) {
		
		describeTagsResponse.setRequestId(_ctx.stringValue("DescribeTagsResponse.RequestId"));

		List<TagInfo> tagInfos = new ArrayList<TagInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagsResponse.TagInfos.Length"); i++) {
			TagInfo tagInfo = new TagInfo();
			tagInfo.setTagKey(_ctx.stringValue("DescribeTagsResponse.TagInfos["+ i +"].TagKey"));
			tagInfo.setTagValue(_ctx.stringValue("DescribeTagsResponse.TagInfos["+ i +"].TagValue"));

			List<String> dBInstanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTagsResponse.TagInfos["+ i +"].DBInstanceIds.Length"); j++) {
				dBInstanceIds.add(_ctx.stringValue("DescribeTagsResponse.TagInfos["+ i +"].DBInstanceIds["+ j +"]"));
			}
			tagInfo.setDBInstanceIds(dBInstanceIds);

			tagInfos.add(tagInfo);
		}
		describeTagsResponse.setTagInfos(tagInfos);
	 
	 	return describeTagsResponse;
	}
}