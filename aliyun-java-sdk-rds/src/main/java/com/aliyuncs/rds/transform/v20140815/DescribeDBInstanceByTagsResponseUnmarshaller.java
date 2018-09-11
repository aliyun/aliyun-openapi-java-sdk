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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceByTagsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceByTagsResponse.DBInstanceTag;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceByTagsResponse.DBInstanceTag.Tag;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceByTagsResponseUnmarshaller {

	public static DescribeDBInstanceByTagsResponse unmarshall(DescribeDBInstanceByTagsResponse describeDBInstanceByTagsResponse, UnmarshallerContext context) {
		
		describeDBInstanceByTagsResponse.setRequestId(context.stringValue("DescribeDBInstanceByTagsResponse.RequestId"));
		describeDBInstanceByTagsResponse.setPageNumber(context.integerValue("DescribeDBInstanceByTagsResponse.PageNumber"));
		describeDBInstanceByTagsResponse.setPageRecordCount(context.integerValue("DescribeDBInstanceByTagsResponse.PageRecordCount"));
		describeDBInstanceByTagsResponse.setTotalRecordCount(context.integerValue("DescribeDBInstanceByTagsResponse.TotalRecordCount"));

		List<DBInstanceTag> items = new ArrayList<DBInstanceTag>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceByTagsResponse.Items.Length"); i++) {
			DBInstanceTag dBInstanceTag = new DBInstanceTag();
			dBInstanceTag.setDBInstanceId(context.stringValue("DescribeDBInstanceByTagsResponse.Items["+ i +"].DBInstanceId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstanceByTagsResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(context.stringValue("DescribeDBInstanceByTagsResponse.Items["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(context.stringValue("DescribeDBInstanceByTagsResponse.Items["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			dBInstanceTag.setTags(tags);

			items.add(dBInstanceTag);
		}
		describeDBInstanceByTagsResponse.setItems(items);
	 
	 	return describeDBInstanceByTagsResponse;
	}
}