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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetSourceTableMetaResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetSourceTableMetaResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetSourceTableMetaResponse.Data.ColumnsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSourceTableMetaResponseUnmarshaller {

	public static GetSourceTableMetaResponse unmarshall(GetSourceTableMetaResponse getSourceTableMetaResponse, UnmarshallerContext _ctx) {
		
		getSourceTableMetaResponse.setRequestId(_ctx.stringValue("GetSourceTableMetaResponse.RequestId"));
		getSourceTableMetaResponse.setMessage(_ctx.stringValue("GetSourceTableMetaResponse.Message"));
		getSourceTableMetaResponse.setHttpStatusCode(_ctx.integerValue("GetSourceTableMetaResponse.HttpStatusCode"));
		getSourceTableMetaResponse.setCode(_ctx.stringValue("GetSourceTableMetaResponse.Code"));
		getSourceTableMetaResponse.setSuccess(_ctx.booleanValue("GetSourceTableMetaResponse.Success"));

		Data data = new Data();
		data.setTableName(_ctx.stringValue("GetSourceTableMetaResponse.Data.TableName"));
		data.setTableComment(_ctx.stringValue("GetSourceTableMetaResponse.Data.TableComment"));
		data.setGuid(_ctx.stringValue("GetSourceTableMetaResponse.Data.Guid"));

		List<ColumnsItem> columns = new ArrayList<ColumnsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSourceTableMetaResponse.Data.Columns.Length"); i++) {
			ColumnsItem columnsItem = new ColumnsItem();
			columnsItem.setComment(_ctx.stringValue("GetSourceTableMetaResponse.Data.Columns["+ i +"].Comment"));
			columnsItem.setPt(_ctx.booleanValue("GetSourceTableMetaResponse.Data.Columns["+ i +"].Pt"));
			columnsItem.setDataType(_ctx.stringValue("GetSourceTableMetaResponse.Data.Columns["+ i +"].DataType"));
			columnsItem.setPk(_ctx.booleanValue("GetSourceTableMetaResponse.Data.Columns["+ i +"].Pk"));
			columnsItem.setSeqNumber(_ctx.integerValue("GetSourceTableMetaResponse.Data.Columns["+ i +"].SeqNumber"));
			columnsItem.setRawDataType(_ctx.stringValue("GetSourceTableMetaResponse.Data.Columns["+ i +"].RawDataType"));
			columnsItem.setName(_ctx.stringValue("GetSourceTableMetaResponse.Data.Columns["+ i +"].Name"));

			columns.add(columnsItem);
		}
		data.setColumns(columns);
		getSourceTableMetaResponse.setData(data);
	 
	 	return getSourceTableMetaResponse;
	}
}