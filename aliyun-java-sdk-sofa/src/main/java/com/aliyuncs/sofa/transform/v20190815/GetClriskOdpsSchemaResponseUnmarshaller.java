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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetClriskOdpsSchemaResponse;
import com.aliyuncs.sofa.model.v20190815.GetClriskOdpsSchemaResponse.ColumnsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClriskOdpsSchemaResponseUnmarshaller {

	public static GetClriskOdpsSchemaResponse unmarshall(GetClriskOdpsSchemaResponse getClriskOdpsSchemaResponse, UnmarshallerContext _ctx) {
		
		getClriskOdpsSchemaResponse.setRequestId(_ctx.stringValue("GetClriskOdpsSchemaResponse.RequestId"));
		getClriskOdpsSchemaResponse.setResultCode(_ctx.stringValue("GetClriskOdpsSchemaResponse.ResultCode"));
		getClriskOdpsSchemaResponse.setResultMessage(_ctx.stringValue("GetClriskOdpsSchemaResponse.ResultMessage"));

		List<ColumnsItem> columns = new ArrayList<ColumnsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClriskOdpsSchemaResponse.Columns.Length"); i++) {
			ColumnsItem columnsItem = new ColumnsItem();
			columnsItem.setName(_ctx.stringValue("GetClriskOdpsSchemaResponse.Columns["+ i +"].Name"));

			List<String> value = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetClriskOdpsSchemaResponse.Columns["+ i +"].Value.Length"); j++) {
				value.add(_ctx.stringValue("GetClriskOdpsSchemaResponse.Columns["+ i +"].Value["+ j +"]"));
			}
			columnsItem.setValue(value);

			columns.add(columnsItem);
		}
		getClriskOdpsSchemaResponse.setColumns(columns);
	 
	 	return getClriskOdpsSchemaResponse;
	}
}