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

package com.aliyuncs.goodstech.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.goodstech.model.v20191230.ClassifyCommodityResponse;
import com.aliyuncs.goodstech.model.v20191230.ClassifyCommodityResponse.Data;
import com.aliyuncs.goodstech.model.v20191230.ClassifyCommodityResponse.Data.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class ClassifyCommodityResponseUnmarshaller {

	public static ClassifyCommodityResponse unmarshall(ClassifyCommodityResponse classifyCommodityResponse, UnmarshallerContext _ctx) {
		
		classifyCommodityResponse.setRequestId(_ctx.stringValue("ClassifyCommodityResponse.RequestId"));

		Data data = new Data();

		List<Category> categories = new ArrayList<Category>();
		for (int i = 0; i < _ctx.lengthValue("ClassifyCommodityResponse.Data.Categories.Length"); i++) {
			Category category = new Category();
			category.setScore(_ctx.floatValue("ClassifyCommodityResponse.Data.Categories["+ i +"].Score"));
			category.setCategoryName(_ctx.stringValue("ClassifyCommodityResponse.Data.Categories["+ i +"].CategoryName"));
			category.setCategoryId(_ctx.stringValue("ClassifyCommodityResponse.Data.Categories["+ i +"].CategoryId"));

			categories.add(category);
		}
		data.setCategories(categories);
		classifyCommodityResponse.setData(data);
	 
	 	return classifyCommodityResponse;
	}
}