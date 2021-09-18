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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ValidateTemplateResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ValidateTemplateResponse.OutputsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateTemplateResponseUnmarshaller {

	public static ValidateTemplateResponse unmarshall(ValidateTemplateResponse validateTemplateResponse, UnmarshallerContext _ctx) {
		
		validateTemplateResponse.setRequestId(_ctx.stringValue("ValidateTemplateResponse.RequestId"));
		validateTemplateResponse.setDescription(_ctx.stringValue("ValidateTemplateResponse.Description"));

		List<Map<Object, Object>> parameters = _ctx.listMapValue("ValidateTemplateResponse.Parameters");
		validateTemplateResponse.setParameters(parameters);

		List<OutputsItem> outputs = new ArrayList<OutputsItem>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.Outputs.Length"); i++) {
			OutputsItem outputsItem = new OutputsItem();
			outputsItem.setOutputKey(_ctx.stringValue("ValidateTemplateResponse.Outputs["+ i +"].OutputKey"));
			outputsItem.setDescription(_ctx.stringValue("ValidateTemplateResponse.Outputs["+ i +"].Description"));

			outputs.add(outputsItem);
		}
		validateTemplateResponse.setOutputs(outputs);
	 
	 	return validateTemplateResponse;
	}
}