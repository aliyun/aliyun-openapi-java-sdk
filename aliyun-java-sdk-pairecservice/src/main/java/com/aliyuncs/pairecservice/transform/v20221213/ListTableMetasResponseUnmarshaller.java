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

import com.aliyuncs.pairecservice.model.v20221213.ListTableMetasResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListTableMetasResponse.TableMetasItem;
import com.aliyuncs.pairecservice.model.v20221213.ListTableMetasResponse.TableMetasItem.FieldsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTableMetasResponseUnmarshaller {

	public static ListTableMetasResponse unmarshall(ListTableMetasResponse listTableMetasResponse, UnmarshallerContext _ctx) {
		
		listTableMetasResponse.setRequestId(_ctx.stringValue("ListTableMetasResponse.RequestId"));
		listTableMetasResponse.setTotalCount(_ctx.longValue("ListTableMetasResponse.TotalCount"));

		List<TableMetasItem> tableMetas = new ArrayList<TableMetasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTableMetasResponse.TableMetas.Length"); i++) {
			TableMetasItem tableMetasItem = new TableMetasItem();
			tableMetasItem.setTableMetaId(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].TableMetaId"));
			tableMetasItem.setName(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].Name"));
			tableMetasItem.setDescription(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].Description"));
			tableMetasItem.setResourceId(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].ResourceId"));
			tableMetasItem.setTableName(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].TableName"));
			tableMetasItem.setType(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].Type"));
			tableMetasItem.setModule(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].Module"));
			tableMetasItem.setCanDelete(_ctx.booleanValue("ListTableMetasResponse.TableMetas["+ i +"].CanDelete"));
			tableMetasItem.setGmtCreateTime(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].GmtCreateTime"));
			tableMetasItem.setGmtModifiedTime(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].GmtModifiedTime"));
			tableMetasItem.setGmtImportedTime(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].GmtImportedTime"));
			tableMetasItem.setUrl(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].Url"));

			List<FieldsItem> fields = new ArrayList<FieldsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListTableMetasResponse.TableMetas["+ i +"].Fields.Length"); j++) {
				FieldsItem fieldsItem = new FieldsItem();
				fieldsItem.setName(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].Fields["+ j +"].Name"));
				fieldsItem.setMeaning(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].Fields["+ j +"].Meaning"));
				fieldsItem.setType(_ctx.stringValue("ListTableMetasResponse.TableMetas["+ i +"].Fields["+ j +"].Type"));
				fieldsItem.setIsDimensionField(_ctx.booleanValue("ListTableMetasResponse.TableMetas["+ i +"].Fields["+ j +"].IsDimensionField"));

				fields.add(fieldsItem);
			}
			tableMetasItem.setFields(fields);

			tableMetas.add(tableMetasItem);
		}
		listTableMetasResponse.setTableMetas(tableMetas);
	 
	 	return listTableMetasResponse;
	}
}