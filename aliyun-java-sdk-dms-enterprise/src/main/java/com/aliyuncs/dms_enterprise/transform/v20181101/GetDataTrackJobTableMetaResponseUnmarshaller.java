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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataTrackJobTableMetaResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataTrackJobTableMetaResponse.TableMeta;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataTrackJobTableMetaResponse.TableMeta.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataTrackJobTableMetaResponseUnmarshaller {

	public static GetDataTrackJobTableMetaResponse unmarshall(GetDataTrackJobTableMetaResponse getDataTrackJobTableMetaResponse, UnmarshallerContext _ctx) {
		
		getDataTrackJobTableMetaResponse.setRequestId(_ctx.stringValue("GetDataTrackJobTableMetaResponse.RequestId"));
		getDataTrackJobTableMetaResponse.setSuccess(_ctx.booleanValue("GetDataTrackJobTableMetaResponse.Success"));
		getDataTrackJobTableMetaResponse.setErrorMessage(_ctx.stringValue("GetDataTrackJobTableMetaResponse.ErrorMessage"));
		getDataTrackJobTableMetaResponse.setErrorCode(_ctx.stringValue("GetDataTrackJobTableMetaResponse.ErrorCode"));

		List<TableMeta> tableMetaList = new ArrayList<TableMeta>();
		for (int i = 0; i < _ctx.lengthValue("GetDataTrackJobTableMetaResponse.TableMetaList.Length"); i++) {
			TableMeta tableMeta = new TableMeta();
			tableMeta.setSchemaName(_ctx.stringValue("GetDataTrackJobTableMetaResponse.TableMetaList["+ i +"].SchemaName"));
			tableMeta.setTableName(_ctx.stringValue("GetDataTrackJobTableMetaResponse.TableMetaList["+ i +"].TableName"));

			List<Column> columns = new ArrayList<Column>();
			for (int j = 0; j < _ctx.lengthValue("GetDataTrackJobTableMetaResponse.TableMetaList["+ i +"].Columns.Length"); j++) {
				Column column = new Column();
				column.setColumnName(_ctx.stringValue("GetDataTrackJobTableMetaResponse.TableMetaList["+ i +"].Columns["+ j +"].ColumnName"));
				column.setColumnPosition(_ctx.integerValue("GetDataTrackJobTableMetaResponse.TableMetaList["+ i +"].Columns["+ j +"].ColumnPosition"));
				column.setColumnType(_ctx.stringValue("GetDataTrackJobTableMetaResponse.TableMetaList["+ i +"].Columns["+ j +"].ColumnType"));
				column.setFictive(_ctx.booleanValue("GetDataTrackJobTableMetaResponse.TableMetaList["+ i +"].Columns["+ j +"].Fictive"));
				column.setCharset(_ctx.stringValue("GetDataTrackJobTableMetaResponse.TableMetaList["+ i +"].Columns["+ j +"].Charset"));

				columns.add(column);
			}
			tableMeta.setColumns(columns);

			tableMetaList.add(tableMeta);
		}
		getDataTrackJobTableMetaResponse.setTableMetaList(tableMetaList);
	 
	 	return getDataTrackJobTableMetaResponse;
	}
}