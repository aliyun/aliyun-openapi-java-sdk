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

import com.aliyuncs.rds.model.v20140815.DescribeImportsForSQLServerResponse;
import com.aliyuncs.rds.model.v20140815.DescribeImportsForSQLServerResponse.SQLServerImport;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImportsForSQLServerResponseUnmarshaller {

	public static DescribeImportsForSQLServerResponse unmarshall(DescribeImportsForSQLServerResponse describeImportsForSQLServerResponse, UnmarshallerContext context) {
		
		describeImportsForSQLServerResponse.setRequestId(context.stringValue("DescribeImportsForSQLServerResponse.RequestId"));
		describeImportsForSQLServerResponse.setTotalRecordCounts(context.integerValue("DescribeImportsForSQLServerResponse.TotalRecordCounts"));
		describeImportsForSQLServerResponse.setPageNumber(context.integerValue("DescribeImportsForSQLServerResponse.PageNumber"));
		describeImportsForSQLServerResponse.setSQLItemsCounts(context.integerValue("DescribeImportsForSQLServerResponse.SQLItemsCounts"));

		List<SQLServerImport> items = new ArrayList<SQLServerImport>();
		for (int i = 0; i < context.lengthValue("DescribeImportsForSQLServerResponse.Items.Length"); i++) {
			SQLServerImport sQLServerImport = new SQLServerImport();
			sQLServerImport.setImportId(context.integerValue("DescribeImportsForSQLServerResponse.Items["+ i +"].ImportId"));
			sQLServerImport.setFileName(context.stringValue("DescribeImportsForSQLServerResponse.Items["+ i +"].FileName"));
			sQLServerImport.setDBName(context.stringValue("DescribeImportsForSQLServerResponse.Items["+ i +"].DBName"));
			sQLServerImport.setImportStatus(context.stringValue("DescribeImportsForSQLServerResponse.Items["+ i +"].ImportStatus"));
			sQLServerImport.setStartTime(context.stringValue("DescribeImportsForSQLServerResponse.Items["+ i +"].StartTime"));

			items.add(sQLServerImport);
		}
		describeImportsForSQLServerResponse.setItems(items);
	 
	 	return describeImportsForSQLServerResponse;
	}
}