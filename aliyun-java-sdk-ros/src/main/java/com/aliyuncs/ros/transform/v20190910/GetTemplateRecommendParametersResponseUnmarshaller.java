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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.GetTemplateRecommendParametersResponse;
import com.aliyuncs.ros.model.v20190910.GetTemplateRecommendParametersResponse.RecommendParameterValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateRecommendParametersResponseUnmarshaller {

	public static GetTemplateRecommendParametersResponse unmarshall(GetTemplateRecommendParametersResponse getTemplateRecommendParametersResponse, UnmarshallerContext _ctx) {
		
		getTemplateRecommendParametersResponse.setRequestId(_ctx.stringValue("GetTemplateRecommendParametersResponse.RequestId"));

		List<RecommendParameterValue> recommendParameterValues = new ArrayList<RecommendParameterValue>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateRecommendParametersResponse.RecommendParameterValues.Length"); i++) {
			RecommendParameterValue recommendParameterValue = new RecommendParameterValue();
			recommendParameterValue.setParameterKey(_ctx.stringValue("GetTemplateRecommendParametersResponse.RecommendParameterValues["+ i +"].ParameterKey"));
			recommendParameterValue.setRecommendValue(_ctx.stringValue("GetTemplateRecommendParametersResponse.RecommendParameterValues["+ i +"].RecommendValue"));

			recommendParameterValues.add(recommendParameterValue);
		}
		getTemplateRecommendParametersResponse.setRecommendParameterValues(recommendParameterValues);
	 
	 	return getTemplateRecommendParametersResponse;
	}
}