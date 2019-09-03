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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescibeImportsFromDatabaseResponse;
import com.aliyuncs.rds.model.v20140815.DescibeImportsFromDatabaseResponse.ImportResultFromDB;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescibeImportsFromDatabaseResponseUnmarshaller {

	public static DescibeImportsFromDatabaseResponse unmarshall(DescibeImportsFromDatabaseResponse descibeImportsFromDatabaseResponse, UnmarshallerContext _ctx) {
		
		descibeImportsFromDatabaseResponse.setRequestId(_ctx.stringValue("DescibeImportsFromDatabaseResponse.RequestId"));
		descibeImportsFromDatabaseResponse.setTotalRecordCount(_ctx.integerValue("DescibeImportsFromDatabaseResponse.TotalRecordCount"));
		descibeImportsFromDatabaseResponse.setPageNumber(_ctx.integerValue("DescibeImportsFromDatabaseResponse.PageNumber"));
		descibeImportsFromDatabaseResponse.setPageRecordCount(_ctx.integerValue("DescibeImportsFromDatabaseResponse.PageRecordCount"));

		List<ImportResultFromDB> items = new ArrayList<ImportResultFromDB>();
		for (int i = 0; i < _ctx.lengthValue("DescibeImportsFromDatabaseResponse.Items.Length"); i++) {
			ImportResultFromDB importResultFromDB = new ImportResultFromDB();
			importResultFromDB.setImportId(_ctx.integerValue("DescibeImportsFromDatabaseResponse.Items["+ i +"].ImportId"));
			importResultFromDB.setImportDataType(_ctx.stringValue("DescibeImportsFromDatabaseResponse.Items["+ i +"].ImportDataType"));
			importResultFromDB.setImportDataStatus(_ctx.stringValue("DescibeImportsFromDatabaseResponse.Items["+ i +"].ImportDataStatus"));
			importResultFromDB.setImportDataStatusDescription(_ctx.stringValue("DescibeImportsFromDatabaseResponse.Items["+ i +"].ImportDataStatusDescription"));
			importResultFromDB.setIncrementalImportingTime(_ctx.stringValue("DescibeImportsFromDatabaseResponse.Items["+ i +"].IncrementalImportingTime"));

			items.add(importResultFromDB);
		}
		descibeImportsFromDatabaseResponse.setItems(items);
	 
	 	return descibeImportsFromDatabaseResponse;
	}
}