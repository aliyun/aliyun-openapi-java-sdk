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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.CreateAlertTemplateResponse;
import com.aliyuncs.arms.model.v20190808.CreateAlertTemplateResponse.AlertTemplate;
import com.aliyuncs.arms.model.v20190808.CreateAlertTemplateResponse.AlertTemplate.LabelMatchExpressionGrid;
import com.aliyuncs.arms.model.v20190808.CreateAlertTemplateResponse.AlertTemplate.LabelMatchExpressionGrid.LabelMatchExpressionGroup;
import com.aliyuncs.arms.model.v20190808.CreateAlertTemplateResponse.AlertTemplate.LabelMatchExpressionGrid.LabelMatchExpressionGroup.LabelMatchExpression;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAlertTemplateResponseUnmarshaller {

	public static CreateAlertTemplateResponse unmarshall(CreateAlertTemplateResponse createAlertTemplateResponse, UnmarshallerContext _ctx) {
		
		createAlertTemplateResponse.setRequestId(_ctx.stringValue("CreateAlertTemplateResponse.RequestId"));

		AlertTemplate alertTemplate = new AlertTemplate();
		alertTemplate.setId(_ctx.integerValue("CreateAlertTemplateResponse.AlertTemplate.Id"));
		alertTemplate.setParentId(_ctx.integerValue("CreateAlertTemplateResponse.AlertTemplate.ParentId"));
		alertTemplate.setName(_ctx.stringValue("CreateAlertTemplateResponse.AlertTemplate.Name"));
		alertTemplate.setMessage(_ctx.stringValue("CreateAlertTemplateResponse.AlertTemplate.Message"));
		alertTemplate.setAlertProvider(_ctx.stringValue("CreateAlertTemplateResponse.AlertTemplate.AlertProvider"));
		alertTemplate.setTemplateProvider(_ctx.stringValue("CreateAlertTemplateResponse.AlertTemplate.TemplateProvider"));
		alertTemplate.setType(_ctx.stringValue("CreateAlertTemplateResponse.AlertTemplate.Type"));
		alertTemplate.setLabels(_ctx.mapValue("CreateAlertTemplateResponse.AlertTemplate.Labels"));
		alertTemplate.setAnnotations(_ctx.mapValue("CreateAlertTemplateResponse.AlertTemplate.Annotations"));
		alertTemplate.setRule(_ctx.stringValue("CreateAlertTemplateResponse.AlertTemplate.Rule"));
		alertTemplate.setUserId(_ctx.stringValue("CreateAlertTemplateResponse.AlertTemplate.UserId"));
		alertTemplate.setStatus(_ctx.booleanValue("CreateAlertTemplateResponse.AlertTemplate.Status"));
		alertTemplate.set_Public(_ctx.booleanValue("CreateAlertTemplateResponse.AlertTemplate.Public"));

		LabelMatchExpressionGrid labelMatchExpressionGrid = new LabelMatchExpressionGrid();

		List<LabelMatchExpressionGroup> labelMatchExpressionGroups = new ArrayList<LabelMatchExpressionGroup>();
		for (int i = 0; i < _ctx.lengthValue("CreateAlertTemplateResponse.AlertTemplate.LabelMatchExpressionGrid.LabelMatchExpressionGroups.Length"); i++) {
			LabelMatchExpressionGroup labelMatchExpressionGroup = new LabelMatchExpressionGroup();

			List<LabelMatchExpression> labelMatchExpressions = new ArrayList<LabelMatchExpression>();
			for (int j = 0; j < _ctx.lengthValue("CreateAlertTemplateResponse.AlertTemplate.LabelMatchExpressionGrid.LabelMatchExpressionGroups["+ i +"].LabelMatchExpressions.Length"); j++) {
				LabelMatchExpression labelMatchExpression = new LabelMatchExpression();
				labelMatchExpression.setKey(_ctx.stringValue("CreateAlertTemplateResponse.AlertTemplate.LabelMatchExpressionGrid.LabelMatchExpressionGroups["+ i +"].LabelMatchExpressions["+ j +"].Key"));
				labelMatchExpression.setValue(_ctx.stringValue("CreateAlertTemplateResponse.AlertTemplate.LabelMatchExpressionGrid.LabelMatchExpressionGroups["+ i +"].LabelMatchExpressions["+ j +"].Value"));
				labelMatchExpression.setOperator(_ctx.stringValue("CreateAlertTemplateResponse.AlertTemplate.LabelMatchExpressionGrid.LabelMatchExpressionGroups["+ i +"].LabelMatchExpressions["+ j +"].Operator"));

				labelMatchExpressions.add(labelMatchExpression);
			}
			labelMatchExpressionGroup.setLabelMatchExpressions(labelMatchExpressions);

			labelMatchExpressionGroups.add(labelMatchExpressionGroup);
		}
		labelMatchExpressionGrid.setLabelMatchExpressionGroups(labelMatchExpressionGroups);
		alertTemplate.setLabelMatchExpressionGrid(labelMatchExpressionGrid);
		createAlertTemplateResponse.setAlertTemplate(alertTemplate);
	 
	 	return createAlertTemplateResponse;
	}
}