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

import com.aliyuncs.paifeaturestore.model.v20230621.GetDatasourceTableResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.GetDatasourceTableResponse.FieldsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDatasourceTableResponseUnmarshaller {

	public static GetDatasourceTableResponse unmarshall(GetDatasourceTableResponse getDatasourceTableResponse, UnmarshallerContext _ctx) {
		
		getDatasourceTableResponse.setRequestId(_ctx.stringValue("GetDatasourceTableResponse.RequestId"));
		getDatasourceTableResponse.setTableName(_ctx.stringValue("GetDatasourceTableResponse.TableName"));

		List<FieldsItem> fields = new ArrayList<FieldsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDatasourceTableResponse.Fields.Length"); i++) {
			FieldsItem fieldsItem = new FieldsItem();
			fieldsItem.setName(_ctx.stringValue("GetDatasourceTableResponse.Fields["+ i +"].Name"));
			fieldsItem.setType(_ctx.stringValue("GetDatasourceTableResponse.Fields["+ i +"].Type"));

			List<String> attributes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetDatasourceTableResponse.Fields["+ i +"].Attributes.Length"); j++) {
				attributes.add(_ctx.stringValue("GetDatasourceTableResponse.Fields["+ i +"].Attributes["+ j +"]"));
			}
			fieldsItem.setAttributes(attributes);

			fields.add(fieldsItem);
		}
		getDatasourceTableResponse.setFields(fields);
	 
	 	return getDatasourceTableResponse;
	}
}