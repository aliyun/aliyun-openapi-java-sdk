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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnCategoryTreeResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnCategoryTreeResponse.Level;
import com.aliyuncs.cloudcallcenter.model.v20170705.DescribeVnCategoryTreeResponse.Level.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVnCategoryTreeResponseUnmarshaller {

	public static DescribeVnCategoryTreeResponse unmarshall(DescribeVnCategoryTreeResponse describeVnCategoryTreeResponse, UnmarshallerContext context) {
		
		describeVnCategoryTreeResponse.setRequestId(context.stringValue("DescribeVnCategoryTreeResponse.RequestId"));

		List<Level> levels = new ArrayList<Level>();
		for (int i = 0; i < context.lengthValue("DescribeVnCategoryTreeResponse.Levels.Length"); i++) {
			Level level = new Level();

			List<Category> categories = new ArrayList<Category>();
			for (int j = 0; j < context.lengthValue("DescribeVnCategoryTreeResponse.Levels["+ i +"].Categories.Length"); j++) {
				Category category = new Category();
				category.setInstanceId(context.stringValue("DescribeVnCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].InstanceId"));
				category.setName(context.stringValue("DescribeVnCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].Name"));
				category.setCategoryId(context.stringValue("DescribeVnCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].CategoryId"));
				category.setLevel(context.longValue("DescribeVnCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].Level"));
				category.setPreviousSiblingId(context.stringValue("DescribeVnCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].PreviousSiblingId"));
				category.setNextSiblingId(context.stringValue("DescribeVnCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].NextSiblingId"));
				category.setParentId(context.stringValue("DescribeVnCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].ParentId"));

				categories.add(category);
			}
			level.setCategories(categories);

			levels.add(level);
		}
		describeVnCategoryTreeResponse.setLevels(levels);
	 
	 	return describeVnCategoryTreeResponse;
	}
}