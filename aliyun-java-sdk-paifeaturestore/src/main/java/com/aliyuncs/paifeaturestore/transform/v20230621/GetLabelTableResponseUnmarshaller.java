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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.GetLabelTableResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.GetLabelTableResponse.Field;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLabelTableResponseUnmarshaller {

	public static GetLabelTableResponse unmarshall(GetLabelTableResponse getLabelTableResponse, UnmarshallerContext _ctx) {
		
		getLabelTableResponse.setRequestId(_ctx.stringValue("GetLabelTableResponse.RequestId"));
		getLabelTableResponse.setProjectId(_ctx.stringValue("GetLabelTableResponse.ProjectId"));
		getLabelTableResponse.setProjectName(_ctx.stringValue("GetLabelTableResponse.ProjectName"));
		getLabelTableResponse.setDatasourceId(_ctx.stringValue("GetLabelTableResponse.DatasourceId"));
		getLabelTableResponse.setName(_ctx.stringValue("GetLabelTableResponse.Name"));
		getLabelTableResponse.setDatasourceName(_ctx.stringValue("GetLabelTableResponse.DatasourceName"));
		getLabelTableResponse.setOwner(_ctx.stringValue("GetLabelTableResponse.Owner"));
		getLabelTableResponse.setGmtCreateTime(_ctx.stringValue("GetLabelTableResponse.GmtCreateTime"));
		getLabelTableResponse.setGmtModifiedTime(_ctx.stringValue("GetLabelTableResponse.GmtModifiedTime"));

		List<Field> fields = new ArrayList<Field>();
		for (int i = 0; i < _ctx.lengthValue("GetLabelTableResponse.Fields.Length"); i++) {
			Field field = new Field();
			field.setName(_ctx.stringValue("GetLabelTableResponse.Fields["+ i +"].Name"));
			field.setType(_ctx.stringValue("GetLabelTableResponse.Fields["+ i +"].Type"));

			List<String> attributes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLabelTableResponse.Fields["+ i +"].Attributes.Length"); j++) {
				attributes.add(_ctx.stringValue("GetLabelTableResponse.Fields["+ i +"].Attributes["+ j +"]"));
			}
			field.setAttributes(attributes);

			fields.add(field);
		}
		getLabelTableResponse.setFields(fields);
	 
	 	return getLabelTableResponse;
	}
}