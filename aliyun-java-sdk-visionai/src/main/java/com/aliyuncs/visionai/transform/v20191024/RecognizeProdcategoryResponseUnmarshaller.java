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

package com.aliyuncs.visionai.transform.v20191024;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.visionai.model.v20191024.RecognizeProdcategoryResponse;
import com.aliyuncs.visionai.model.v20191024.RecognizeProdcategoryResponse.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeProdcategoryResponseUnmarshaller {

	public static RecognizeProdcategoryResponse unmarshall(RecognizeProdcategoryResponse recognizeProdcategoryResponse, UnmarshallerContext _ctx) {
		
		recognizeProdcategoryResponse.setRequestId(_ctx.stringValue("RecognizeProdcategoryResponse.RequestId"));

		List<Category> data = new ArrayList<Category>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeProdcategoryResponse.Data.Length"); i++) {
			Category category = new Category();
			category.setCategoryId(_ctx.longValue("RecognizeProdcategoryResponse.Data["+ i +"].CategoryId"));
			category.setCategoryName(_ctx.stringValue("RecognizeProdcategoryResponse.Data["+ i +"].CategoryName"));
			category.setScore(_ctx.floatValue("RecognizeProdcategoryResponse.Data["+ i +"].Score"));

			data.add(category);
		}
		recognizeProdcategoryResponse.setData(data);
	 
	 	return recognizeProdcategoryResponse;
	}
}