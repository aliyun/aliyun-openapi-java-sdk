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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerQueryExplanationResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerQueryExplanationResponse.GeneralQueryConditionModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryExplanationResponseUnmarshaller {

	public static InnerQueryExplanationResponse unmarshall(InnerQueryExplanationResponse innerQueryExplanationResponse, UnmarshallerContext context) {
		
		innerQueryExplanationResponse.setRequestId(context.stringValue("InnerQueryExplanationResponse.RequestId"));
		innerQueryExplanationResponse.setSuccess(context.booleanValue("InnerQueryExplanationResponse.Success"));
		innerQueryExplanationResponse.setCode(context.stringValue("InnerQueryExplanationResponse.Code"));
		innerQueryExplanationResponse.setMessage(context.stringValue("InnerQueryExplanationResponse.Message"));

		List<GeneralQueryConditionModel> generalQueryConditionModels = new ArrayList<GeneralQueryConditionModel>();
		for (int i = 0; i < context.lengthValue("InnerQueryExplanationResponse.GeneralQueryConditionModels.Length"); i++) {
			GeneralQueryConditionModel generalQueryConditionModel = new GeneralQueryConditionModel();
			generalQueryConditionModel.setField(context.stringValue("InnerQueryExplanationResponse.GeneralQueryConditionModels["+ i +"].Field"));
			generalQueryConditionModel.setValue(context.stringValue("InnerQueryExplanationResponse.GeneralQueryConditionModels["+ i +"].Value"));
			generalQueryConditionModel.setOperator(context.stringValue("InnerQueryExplanationResponse.GeneralQueryConditionModels["+ i +"].Operator"));
			generalQueryConditionModel.setAllowNull(context.booleanValue("InnerQueryExplanationResponse.GeneralQueryConditionModels["+ i +"].AllowNull"));

			generalQueryConditionModels.add(generalQueryConditionModel);
		}
		innerQueryExplanationResponse.setGeneralQueryConditionModels(generalQueryConditionModels);
	 
	 	return innerQueryExplanationResponse;
	}
}