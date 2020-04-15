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

package com.aliyuncs.visionai_poc.transform.v20200408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.visionai_poc.model.v20200408.PredictCategoryResponse;
import com.aliyuncs.visionai_poc.model.v20200408.PredictCategoryResponse.Response;
import com.aliyuncs.visionai_poc.model.v20200408.PredictCategoryResponse.Response.Node;
import com.aliyuncs.visionai_poc.model.v20200408.PredictCategoryResponse.Response.Node.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class PredictCategoryResponseUnmarshaller {

	public static PredictCategoryResponse unmarshall(PredictCategoryResponse predictCategoryResponse, UnmarshallerContext _ctx) {
		
		predictCategoryResponse.setCode(_ctx.integerValue("PredictCategoryResponse.Code"));
		predictCategoryResponse.setMessage(_ctx.stringValue("PredictCategoryResponse.Message"));
		predictCategoryResponse.setSuccess(_ctx.booleanValue("PredictCategoryResponse.Success"));

		Response response = new Response();
		response.setSuccess(_ctx.booleanValue("PredictCategoryResponse.Response.Success"));
		response.setUrl(_ctx.stringValue("PredictCategoryResponse.Response.Url"));
		response.setRequestId(_ctx.stringValue("PredictCategoryResponse.Response.RequestId"));
		response.setErrorCode(_ctx.stringValue("PredictCategoryResponse.Response.ErrorCode"));
		response.setErrorMessage(_ctx.stringValue("PredictCategoryResponse.Response.ErrorMessage"));

		List<Node> data = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("PredictCategoryResponse.Response.Data.Length"); i++) {
			Node node = new Node();
			node.setCateId(_ctx.stringValue("PredictCategoryResponse.Response.Data["+ i +"].CateId"));

			Category category = new Category();
			category.setCateLevelFOURName(_ctx.stringValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateLevelFOURName"));
			category.setCateLevelTwoId(_ctx.integerValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateLevelTwoId"));
			category.setCateLevelOneId(_ctx.integerValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateLevelOneId"));
			category.setCateLevelOneName(_ctx.stringValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateLevelOneName"));
			category.setCateLevelFourId(_ctx.integerValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateLevelFourId"));
			category.setCateLevel(_ctx.integerValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateLevel"));
			category.setCateLevelThreeId(_ctx.integerValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateLevelThreeId"));
			category.setCateLevelFiveId(_ctx.integerValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateLevelFiveId"));
			category.setCateLevelFiveName(_ctx.stringValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateLevelFiveName"));
			category.setCateName(_ctx.stringValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateName"));
			category.setCateLevelTwoName(_ctx.stringValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateLevelTwoName"));
			category.setScore(_ctx.floatValue("PredictCategoryResponse.Response.Data["+ i +"].Category.Score"));
			category.setCateId(_ctx.integerValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateId"));
			category.setCateLevelThreeName(_ctx.stringValue("PredictCategoryResponse.Response.Data["+ i +"].Category.CateLevelThreeName"));
			node.setCategory(category);

			data.add(node);
		}
		response.setData(data);
		predictCategoryResponse.setResponse(response);
	 
	 	return predictCategoryResponse;
	}
}