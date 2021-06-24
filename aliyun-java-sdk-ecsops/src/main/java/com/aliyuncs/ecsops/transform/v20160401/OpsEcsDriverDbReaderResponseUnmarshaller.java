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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsEcsDriverDbReaderResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsEcsDriverDbReaderResponse.Row;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsEcsDriverDbReaderResponseUnmarshaller {

	public static OpsEcsDriverDbReaderResponse unmarshall(OpsEcsDriverDbReaderResponse opsEcsDriverDbReaderResponse, UnmarshallerContext _ctx) {
		
		opsEcsDriverDbReaderResponse.setRequestId(_ctx.stringValue("OpsEcsDriverDbReaderResponse.RequestId"));
		opsEcsDriverDbReaderResponse.setTotalCount(_ctx.integerValue("OpsEcsDriverDbReaderResponse.TotalCount"));
		opsEcsDriverDbReaderResponse.setPageSize(_ctx.integerValue("OpsEcsDriverDbReaderResponse.PageSize"));
		opsEcsDriverDbReaderResponse.setPageNumber(_ctx.integerValue("OpsEcsDriverDbReaderResponse.PageNumber"));

		List<Row> rows = new ArrayList<Row>();
		for (int i = 0; i < _ctx.lengthValue("OpsEcsDriverDbReaderResponse.Rows.Length"); i++) {
			Row row = new Row();
			row.setRowJsonStr(_ctx.stringValue("OpsEcsDriverDbReaderResponse.Rows["+ i +"].RowJsonStr"));

			rows.add(row);
		}
		opsEcsDriverDbReaderResponse.setRows(rows);
	 
	 	return opsEcsDriverDbReaderResponse;
	}
}