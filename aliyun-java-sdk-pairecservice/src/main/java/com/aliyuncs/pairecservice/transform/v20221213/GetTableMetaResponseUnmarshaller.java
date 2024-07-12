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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.GetTableMetaResponse;
import com.aliyuncs.pairecservice.model.v20221213.GetTableMetaResponse.FieldsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTableMetaResponseUnmarshaller {

	public static GetTableMetaResponse unmarshall(GetTableMetaResponse getTableMetaResponse, UnmarshallerContext _ctx) {
		
		getTableMetaResponse.setRequestId(_ctx.stringValue("GetTableMetaResponse.RequestId"));
		getTableMetaResponse.setName(_ctx.stringValue("GetTableMetaResponse.Name"));
		getTableMetaResponse.setDescription(_ctx.stringValue("GetTableMetaResponse.Description"));
		getTableMetaResponse.setResourceId(_ctx.stringValue("GetTableMetaResponse.ResourceId"));
		getTableMetaResponse.setTableName(_ctx.stringValue("GetTableMetaResponse.TableName"));
		getTableMetaResponse.setType(_ctx.stringValue("GetTableMetaResponse.Type"));
		getTableMetaResponse.setModule(_ctx.stringValue("GetTableMetaResponse.Module"));
		getTableMetaResponse.setCanDelete(_ctx.booleanValue("GetTableMetaResponse.CanDelete"));
		getTableMetaResponse.setGmtCreateTime(_ctx.stringValue("GetTableMetaResponse.GmtCreateTime"));
		getTableMetaResponse.setGmtModifiedTime(_ctx.stringValue("GetTableMetaResponse.GmtModifiedTime"));
		getTableMetaResponse.setUrl(_ctx.stringValue("GetTableMetaResponse.Url"));
		getTableMetaResponse.setTableMetaId(_ctx.stringValue("GetTableMetaResponse.TableMetaId"));
		getTableMetaResponse.setGmtImportedTime(_ctx.stringValue("GetTableMetaResponse.GmtImportedTime"));
		getTableMetaResponse.setConfig(_ctx.stringValue("GetTableMetaResponse.Config"));

		List<FieldsItem> fields = new ArrayList<FieldsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTableMetaResponse.Fields.Length"); i++) {
			FieldsItem fieldsItem = new FieldsItem();
			fieldsItem.setName(_ctx.stringValue("GetTableMetaResponse.Fields["+ i +"].Name"));
			fieldsItem.setMeaning(_ctx.stringValue("GetTableMetaResponse.Fields["+ i +"].Meaning"));
			fieldsItem.setType(_ctx.stringValue("GetTableMetaResponse.Fields["+ i +"].Type"));
			fieldsItem.setIsDimensionField(_ctx.booleanValue("GetTableMetaResponse.Fields["+ i +"].IsDimensionField"));

			fields.add(fieldsItem);
		}
		getTableMetaResponse.setFields(fields);
	 
	 	return getTableMetaResponse;
	}
}