/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescibeImportsFromDatabaseResponse;
import com.aliyuncs.rds.model.v20140815.DescibeImportsFromDatabaseResponse.ImportResultFromDB;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescibeImportsFromDatabaseResponseUnmarshaller {

	public static DescibeImportsFromDatabaseResponse unmarshall(DescibeImportsFromDatabaseResponse descibeImportsFromDatabaseResponse, UnmarshallerContext context) {
		
		descibeImportsFromDatabaseResponse.setRequestId(context.stringValue("DescibeImportsFromDatabaseResponse.RequestId"));
		descibeImportsFromDatabaseResponse.setTotalRecordCount(context.integerValue("DescibeImportsFromDatabaseResponse.TotalRecordCount"));
		descibeImportsFromDatabaseResponse.setPageNumber(context.integerValue("DescibeImportsFromDatabaseResponse.PageNumber"));
		descibeImportsFromDatabaseResponse.setPageRecordCount(context.integerValue("DescibeImportsFromDatabaseResponse.PageRecordCount"));

		List<ImportResultFromDB> items = new ArrayList<ImportResultFromDB>();
		for (int i = 0; i < context.lengthValue("DescibeImportsFromDatabaseResponse.Items.Length"); i++) {
			ImportResultFromDB importResultFromDB = new ImportResultFromDB();
			importResultFromDB.setImportId(context.integerValue("DescibeImportsFromDatabaseResponse.Items["+ i +"].ImportId"));
			importResultFromDB.setImportDataType(context.stringValue("DescibeImportsFromDatabaseResponse.Items["+ i +"].ImportDataType"));
			importResultFromDB.setImportDataStatus(context.stringValue("DescibeImportsFromDatabaseResponse.Items["+ i +"].ImportDataStatus"));
			importResultFromDB.setImportDataStatusDescription(context.stringValue("DescibeImportsFromDatabaseResponse.Items["+ i +"].ImportDataStatusDescription"));
			importResultFromDB.setIncrementalImportingTime(context.stringValue("DescibeImportsFromDatabaseResponse.Items["+ i +"].IncrementalImportingTime"));

			items.add(importResultFromDB);
		}
		descibeImportsFromDatabaseResponse.setItems(items);
	 
	 	return descibeImportsFromDatabaseResponse;
	}
}