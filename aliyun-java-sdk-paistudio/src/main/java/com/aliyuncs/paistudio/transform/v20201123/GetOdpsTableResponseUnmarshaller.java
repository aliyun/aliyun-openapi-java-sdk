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

package com.aliyuncs.paistudio.transform.v20201123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paistudio.model.v20201123.GetOdpsTableResponse;
import com.aliyuncs.paistudio.model.v20201123.GetOdpsTableResponse.Data;
import com.aliyuncs.paistudio.model.v20201123.GetOdpsTableResponse.Data.ColumnsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOdpsTableResponseUnmarshaller {

	public static GetOdpsTableResponse unmarshall(GetOdpsTableResponse getOdpsTableResponse, UnmarshallerContext _ctx) {
		
		getOdpsTableResponse.setRequestId(_ctx.stringValue("GetOdpsTableResponse.RequestId"));
		getOdpsTableResponse.setCode(_ctx.stringValue("GetOdpsTableResponse.Code"));
		getOdpsTableResponse.setMessage(_ctx.stringValue("GetOdpsTableResponse.Message"));

		Data data = new Data();

		List<String> partitionColumns = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOdpsTableResponse.Data.PartitionColumns.Length"); i++) {
			partitionColumns.add(_ctx.stringValue("GetOdpsTableResponse.Data.PartitionColumns["+ i +"]"));
		}
		data.setPartitionColumns(partitionColumns);

		List<ColumnsItem> columns = new ArrayList<ColumnsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOdpsTableResponse.Data.Columns.Length"); i++) {
			ColumnsItem columnsItem = new ColumnsItem();
			columnsItem.setName(_ctx.stringValue("GetOdpsTableResponse.Data.Columns["+ i +"].Name"));
			columnsItem.setType(_ctx.stringValue("GetOdpsTableResponse.Data.Columns["+ i +"].Type"));

			List<String> preview = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetOdpsTableResponse.Data.Columns["+ i +"].Preview.Length"); j++) {
				preview.add(_ctx.stringValue("GetOdpsTableResponse.Data.Columns["+ i +"].Preview["+ j +"]"));
			}
			columnsItem.setPreview(preview);

			columns.add(columnsItem);
		}
		data.setColumns(columns);
		getOdpsTableResponse.setData(data);
	 
	 	return getOdpsTableResponse;
	}
}