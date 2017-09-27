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

import com.aliyuncs.rds.model.v20140815.DescribeSQLInjectionInfosResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSQLInjectionInfosResponse.SQLInjectionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLInjectionInfosResponseUnmarshaller {

	public static DescribeSQLInjectionInfosResponse unmarshall(DescribeSQLInjectionInfosResponse describeSQLInjectionInfosResponse, UnmarshallerContext context) {
		
		describeSQLInjectionInfosResponse.setRequestId(context.stringValue("DescribeSQLInjectionInfosResponse.RequestId"));
		describeSQLInjectionInfosResponse.setEngine(context.stringValue("DescribeSQLInjectionInfosResponse.Engine"));
		describeSQLInjectionInfosResponse.setTotalRecordCount(context.integerValue("DescribeSQLInjectionInfosResponse.TotalRecordCount"));
		describeSQLInjectionInfosResponse.setPageNumber(context.integerValue("DescribeSQLInjectionInfosResponse.PageNumber"));
		describeSQLInjectionInfosResponse.setPageRecordCount(context.integerValue("DescribeSQLInjectionInfosResponse.PageRecordCount"));

		List<SQLInjectionInfo> items = new ArrayList<SQLInjectionInfo>();
		for (int i = 0; i < context.lengthValue("DescribeSQLInjectionInfosResponse.Items.Length"); i++) {
			SQLInjectionInfo sQLInjectionInfo = new SQLInjectionInfo();
			sQLInjectionInfo.setDBName(context.stringValue("DescribeSQLInjectionInfosResponse.Items["+ i +"].DBName"));
			sQLInjectionInfo.setSQLText(context.stringValue("DescribeSQLInjectionInfosResponse.Items["+ i +"].SQLText"));
			sQLInjectionInfo.setLatencyTime(context.stringValue("DescribeSQLInjectionInfosResponse.Items["+ i +"].LatencyTime"));
			sQLInjectionInfo.setHostAddress(context.stringValue("DescribeSQLInjectionInfosResponse.Items["+ i +"].HostAddress"));
			sQLInjectionInfo.setExecuteTime(context.stringValue("DescribeSQLInjectionInfosResponse.Items["+ i +"].ExecuteTime"));
			sQLInjectionInfo.setAccountName(context.stringValue("DescribeSQLInjectionInfosResponse.Items["+ i +"].AccountName"));
			sQLInjectionInfo.setEffectRowCount(context.stringValue("DescribeSQLInjectionInfosResponse.Items["+ i +"].EffectRowCount"));

			items.add(sQLInjectionInfo);
		}
		describeSQLInjectionInfosResponse.setItems(items);
	 
	 	return describeSQLInjectionInfosResponse;
	}
}