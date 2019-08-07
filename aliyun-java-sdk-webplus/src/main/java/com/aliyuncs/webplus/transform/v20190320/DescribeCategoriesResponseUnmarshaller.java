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

package com.aliyuncs.webplus.transform.v20190320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.DescribeCategoriesResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeCategoriesResponse.Category;
import com.aliyuncs.webplus.model.v20190320.DescribeCategoriesResponse.Category.DemoProject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCategoriesResponseUnmarshaller {

	public static DescribeCategoriesResponse unmarshall(DescribeCategoriesResponse describeCategoriesResponse, UnmarshallerContext _ctx) {
		
		describeCategoriesResponse.setRequestId(_ctx.stringValue("DescribeCategoriesResponse.RequestId"));
		describeCategoriesResponse.setCode(_ctx.stringValue("DescribeCategoriesResponse.Code"));
		describeCategoriesResponse.setMessage(_ctx.stringValue("DescribeCategoriesResponse.Message"));

		List<Category> categories = new ArrayList<Category>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCategoriesResponse.Categories.Length"); i++) {
			Category category = new Category();
			category.setCategoryId(_ctx.stringValue("DescribeCategoriesResponse.Categories["+ i +"].CategoryId"));
			category.setCategoryName(_ctx.stringValue("DescribeCategoriesResponse.Categories["+ i +"].CategoryName"));
			category.setCategoryLogo(_ctx.stringValue("DescribeCategoriesResponse.Categories["+ i +"].CategoryLogo"));
			category.setCategoryDescription(_ctx.stringValue("DescribeCategoriesResponse.Categories["+ i +"].CategoryDescription"));
			category.setCreateTime(_ctx.stringValue("DescribeCategoriesResponse.Categories["+ i +"].CreateTime"));
			category.setUpdateTime(_ctx.stringValue("DescribeCategoriesResponse.Categories["+ i +"].UpdateTime"));

			List<DemoProject> demoProjects = new ArrayList<DemoProject>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCategoriesResponse.Categories["+ i +"].DemoProjects.Length"); j++) {
				DemoProject demoProject = new DemoProject();
				demoProject.setRegionId(_ctx.stringValue("DescribeCategoriesResponse.Categories["+ i +"].DemoProjects["+ j +"].RegionId"));
				demoProject.setPackageUrl(_ctx.stringValue("DescribeCategoriesResponse.Categories["+ i +"].DemoProjects["+ j +"].PackageUrl"));
				demoProject.setSourceUrl(_ctx.stringValue("DescribeCategoriesResponse.Categories["+ i +"].DemoProjects["+ j +"].SourceUrl"));

				demoProjects.add(demoProject);
			}
			category.setDemoProjects(demoProjects);

			categories.add(category);
		}
		describeCategoriesResponse.setCategories(categories);
	 
	 	return describeCategoriesResponse;
	}
}