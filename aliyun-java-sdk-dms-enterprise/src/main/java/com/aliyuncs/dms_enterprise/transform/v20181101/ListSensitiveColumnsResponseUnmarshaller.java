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

import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitiveColumnsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitiveColumnsResponse.SensitiveColumn;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSensitiveColumnsResponseUnmarshaller {

	public static ListSensitiveColumnsResponse unmarshall(ListSensitiveColumnsResponse listSensitiveColumnsResponse, UnmarshallerContext _ctx) {
		
		listSensitiveColumnsResponse.setRequestId(_ctx.stringValue("ListSensitiveColumnsResponse.RequestId"));
		listSensitiveColumnsResponse.setSuccess(_ctx.booleanValue("ListSensitiveColumnsResponse.Success"));
		listSensitiveColumnsResponse.setErrorMessage(_ctx.stringValue("ListSensitiveColumnsResponse.ErrorMessage"));
		listSensitiveColumnsResponse.setErrorCode(_ctx.stringValue("ListSensitiveColumnsResponse.ErrorCode"));
		listSensitiveColumnsResponse.setTotalCount(_ctx.longValue("ListSensitiveColumnsResponse.TotalCount"));

		List<SensitiveColumn> sensitiveColumnList = new ArrayList<SensitiveColumn>();
		for (int i = 0; i < _ctx.lengthValue("ListSensitiveColumnsResponse.SensitiveColumnList.Length"); i++) {
			SensitiveColumn sensitiveColumn = new SensitiveColumn();
			sensitiveColumn.setSchemaName(_ctx.stringValue("ListSensitiveColumnsResponse.SensitiveColumnList["+ i +"].SchemaName"));
			sensitiveColumn.setTableName(_ctx.stringValue("ListSensitiveColumnsResponse.SensitiveColumnList["+ i +"].TableName"));
			sensitiveColumn.setColumnName(_ctx.stringValue("ListSensitiveColumnsResponse.SensitiveColumnList["+ i +"].ColumnName"));
			sensitiveColumn.setSecurityLevel(_ctx.stringValue("ListSensitiveColumnsResponse.SensitiveColumnList["+ i +"].SecurityLevel"));
			sensitiveColumn.setColumnCount(_ctx.longValue("ListSensitiveColumnsResponse.SensitiveColumnList["+ i +"].ColumnCount"));
			sensitiveColumn.setFunctionType(_ctx.stringValue("ListSensitiveColumnsResponse.SensitiveColumnList["+ i +"].FunctionType"));

			sensitiveColumnList.add(sensitiveColumn);
		}
		listSensitiveColumnsResponse.setSensitiveColumnList(sensitiveColumnList);
	 
	 	return listSensitiveColumnsResponse;
	}
}