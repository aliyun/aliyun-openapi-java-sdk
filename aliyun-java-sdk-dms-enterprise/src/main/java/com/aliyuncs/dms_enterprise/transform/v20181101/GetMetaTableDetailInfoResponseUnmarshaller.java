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

import com.aliyuncs.dms_enterprise.model.v20181101.GetMetaTableDetailInfoResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetMetaTableDetailInfoResponse.DetailInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetMetaTableDetailInfoResponse.DetailInfo.Column;
import com.aliyuncs.dms_enterprise.model.v20181101.GetMetaTableDetailInfoResponse.DetailInfo.Index;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableDetailInfoResponseUnmarshaller {

	public static GetMetaTableDetailInfoResponse unmarshall(GetMetaTableDetailInfoResponse getMetaTableDetailInfoResponse, UnmarshallerContext _ctx) {
		
		getMetaTableDetailInfoResponse.setRequestId(_ctx.stringValue("GetMetaTableDetailInfoResponse.RequestId"));
		getMetaTableDetailInfoResponse.setErrorCode(_ctx.stringValue("GetMetaTableDetailInfoResponse.ErrorCode"));
		getMetaTableDetailInfoResponse.setErrorMessage(_ctx.stringValue("GetMetaTableDetailInfoResponse.ErrorMessage"));
		getMetaTableDetailInfoResponse.setSuccess(_ctx.booleanValue("GetMetaTableDetailInfoResponse.Success"));

		DetailInfo detailInfo = new DetailInfo();

		List<Column> columnList = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTableDetailInfoResponse.DetailInfo.ColumnList.Length"); i++) {
			Column column = new Column();
			column.setColumnId(_ctx.stringValue("GetMetaTableDetailInfoResponse.DetailInfo.ColumnList["+ i +"].ColumnId"));
			column.setColumnName(_ctx.stringValue("GetMetaTableDetailInfoResponse.DetailInfo.ColumnList["+ i +"].ColumnName"));
			column.setColumnType(_ctx.stringValue("GetMetaTableDetailInfoResponse.DetailInfo.ColumnList["+ i +"].ColumnType"));
			column.setDescription(_ctx.stringValue("GetMetaTableDetailInfoResponse.DetailInfo.ColumnList["+ i +"].Description"));
			column.setPosition(_ctx.stringValue("GetMetaTableDetailInfoResponse.DetailInfo.ColumnList["+ i +"].Position"));
			column.setAutoIncrement(_ctx.booleanValue("GetMetaTableDetailInfoResponse.DetailInfo.ColumnList["+ i +"].AutoIncrement"));
			column.setDataLength(_ctx.longValue("GetMetaTableDetailInfoResponse.DetailInfo.ColumnList["+ i +"].DataLength"));
			column.setDataScale(_ctx.integerValue("GetMetaTableDetailInfoResponse.DetailInfo.ColumnList["+ i +"].DataScale"));
			column.setDataPrecision(_ctx.integerValue("GetMetaTableDetailInfoResponse.DetailInfo.ColumnList["+ i +"].DataPrecision"));
			column.setNullable(_ctx.booleanValue("GetMetaTableDetailInfoResponse.DetailInfo.ColumnList["+ i +"].Nullable"));

			columnList.add(column);
		}
		detailInfo.setColumnList(columnList);

		List<Index> indexList = new ArrayList<Index>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTableDetailInfoResponse.DetailInfo.IndexList.Length"); i++) {
			Index index = new Index();
			index.setIndexName(_ctx.stringValue("GetMetaTableDetailInfoResponse.DetailInfo.IndexList["+ i +"].IndexName"));
			index.setIndexId(_ctx.stringValue("GetMetaTableDetailInfoResponse.DetailInfo.IndexList["+ i +"].IndexId"));
			index.setUnique(_ctx.booleanValue("GetMetaTableDetailInfoResponse.DetailInfo.IndexList["+ i +"].Unique"));
			index.setIndexType(_ctx.stringValue("GetMetaTableDetailInfoResponse.DetailInfo.IndexList["+ i +"].IndexType"));

			List<String> indexColumns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetMetaTableDetailInfoResponse.DetailInfo.IndexList["+ i +"].IndexColumns.Length"); j++) {
				indexColumns.add(_ctx.stringValue("GetMetaTableDetailInfoResponse.DetailInfo.IndexList["+ i +"].IndexColumns["+ j +"]"));
			}
			index.setIndexColumns(indexColumns);

			indexList.add(index);
		}
		detailInfo.setIndexList(indexList);
		getMetaTableDetailInfoResponse.setDetailInfo(detailInfo);
	 
	 	return getMetaTableDetailInfoResponse;
	}
}