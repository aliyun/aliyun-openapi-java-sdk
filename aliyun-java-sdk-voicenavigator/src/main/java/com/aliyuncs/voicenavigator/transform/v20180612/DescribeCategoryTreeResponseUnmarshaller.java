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

package com.aliyuncs.voicenavigator.transform.v20180612;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.DescribeCategoryTreeResponse;
import com.aliyuncs.voicenavigator.model.v20180612.DescribeCategoryTreeResponse.Level;
import com.aliyuncs.voicenavigator.model.v20180612.DescribeCategoryTreeResponse.Level.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCategoryTreeResponseUnmarshaller {

	public static DescribeCategoryTreeResponse unmarshall(DescribeCategoryTreeResponse describeCategoryTreeResponse, UnmarshallerContext _ctx) {
		
		describeCategoryTreeResponse.setRequestId(_ctx.stringValue("DescribeCategoryTreeResponse.RequestId"));

		List<Level> levels = new ArrayList<Level>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCategoryTreeResponse.Levels.Length"); i++) {
			Level level = new Level();

			List<Category> categories = new ArrayList<Category>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCategoryTreeResponse.Levels["+ i +"].Categories.Length"); j++) {
				Category category = new Category();
				category.setInstanceId(_ctx.stringValue("DescribeCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].InstanceId"));
				category.setName(_ctx.stringValue("DescribeCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].Name"));
				category.setCategoryId(_ctx.stringValue("DescribeCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].CategoryId"));
				category.setLevel(_ctx.longValue("DescribeCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].Level"));
				category.setPreviousSiblingId(_ctx.stringValue("DescribeCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].PreviousSiblingId"));
				category.setNextSiblingId(_ctx.stringValue("DescribeCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].NextSiblingId"));
				category.setParentId(_ctx.stringValue("DescribeCategoryTreeResponse.Levels["+ i +"].Categories["+ j +"].ParentId"));

				categories.add(category);
			}
			level.setCategories(categories);

			levels.add(level);
		}
		describeCategoryTreeResponse.setLevels(levels);
	 
	 	return describeCategoryTreeResponse;
	}
}