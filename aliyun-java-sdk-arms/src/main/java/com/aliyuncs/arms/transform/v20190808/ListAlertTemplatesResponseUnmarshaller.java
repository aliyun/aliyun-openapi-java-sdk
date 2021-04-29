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

import com.aliyuncs.arms.model.v20190808.ListAlertTemplatesResponse;
import com.aliyuncs.arms.model.v20190808.ListAlertTemplatesResponse.AlertTemplate;
import com.aliyuncs.arms.model.v20190808.ListAlertTemplatesResponse.AlertTemplate.LabelMatchExpressionGrid;
import com.aliyuncs.arms.model.v20190808.ListAlertTemplatesResponse.AlertTemplate.LabelMatchExpressionGrid.LabelMatchExpressionGroup;
import com.aliyuncs.arms.model.v20190808.ListAlertTemplatesResponse.AlertTemplate.LabelMatchExpressionGrid.LabelMatchExpressionGroup.LabelMatchExpression;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlertTemplatesResponseUnmarshaller {

	public static ListAlertTemplatesResponse unmarshall(ListAlertTemplatesResponse listAlertTemplatesResponse, UnmarshallerContext _ctx) {
		
		listAlertTemplatesResponse.setRequestId(_ctx.stringValue("ListAlertTemplatesResponse.RequestId"));

		List<AlertTemplate> alertTemplates = new ArrayList<AlertTemplate>();
		for (int i = 0; i < _ctx.lengthValue("ListAlertTemplatesResponse.AlertTemplates.Length"); i++) {
			AlertTemplate alertTemplate = new AlertTemplate();
			alertTemplate.setId(_ctx.integerValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].Id"));
			alertTemplate.setParentId(_ctx.integerValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].ParentId"));
			alertTemplate.setName(_ctx.stringValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].Name"));
			alertTemplate.setMessage(_ctx.stringValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].Message"));
			alertTemplate.setAlertProvider(_ctx.stringValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].AlertProvider"));
			alertTemplate.setTemplateProvider(_ctx.stringValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].TemplateProvider"));
			alertTemplate.setType(_ctx.stringValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].Type"));
			alertTemplate.setLabels(_ctx.mapValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].Labels"));
			alertTemplate.setAnnotations(_ctx.mapValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].Annotations"));
			alertTemplate.setRule(_ctx.stringValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].Rule"));
			alertTemplate.setUserId(_ctx.stringValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].UserId"));
			alertTemplate.setStatus(_ctx.booleanValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].Status"));
			alertTemplate.set_Public(_ctx.booleanValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].Public"));

			LabelMatchExpressionGrid labelMatchExpressionGrid = new LabelMatchExpressionGrid();

			List<LabelMatchExpressionGroup> labelMatchExpressionGroups = new ArrayList<LabelMatchExpressionGroup>();
			for (int j = 0; j < _ctx.lengthValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].LabelMatchExpressionGrid.LabelMatchExpressionGroups.Length"); j++) {
				LabelMatchExpressionGroup labelMatchExpressionGroup = new LabelMatchExpressionGroup();

				List<LabelMatchExpression> labelMatchExpressions = new ArrayList<LabelMatchExpression>();
				for (int k = 0; k < _ctx.lengthValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].LabelMatchExpressionGrid.LabelMatchExpressionGroups["+ j +"].LabelMatchExpressions.Length"); k++) {
					LabelMatchExpression labelMatchExpression = new LabelMatchExpression();
					labelMatchExpression.setKey(_ctx.stringValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].LabelMatchExpressionGrid.LabelMatchExpressionGroups["+ j +"].LabelMatchExpressions["+ k +"].Key"));
					labelMatchExpression.setValue(_ctx.stringValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].LabelMatchExpressionGrid.LabelMatchExpressionGroups["+ j +"].LabelMatchExpressions["+ k +"].Value"));
					labelMatchExpression.setOperator(_ctx.stringValue("ListAlertTemplatesResponse.AlertTemplates["+ i +"].LabelMatchExpressionGrid.LabelMatchExpressionGroups["+ j +"].LabelMatchExpressions["+ k +"].Operator"));

					labelMatchExpressions.add(labelMatchExpression);
				}
				labelMatchExpressionGroup.setLabelMatchExpressions(labelMatchExpressions);

				labelMatchExpressionGroups.add(labelMatchExpressionGroup);
			}
			labelMatchExpressionGrid.setLabelMatchExpressionGroups(labelMatchExpressionGroups);
			alertTemplate.setLabelMatchExpressionGrid(labelMatchExpressionGrid);

			alertTemplates.add(alertTemplate);
		}
		listAlertTemplatesResponse.setAlertTemplates(alertTemplates);
	 
	 	return listAlertTemplatesResponse;
	}
}