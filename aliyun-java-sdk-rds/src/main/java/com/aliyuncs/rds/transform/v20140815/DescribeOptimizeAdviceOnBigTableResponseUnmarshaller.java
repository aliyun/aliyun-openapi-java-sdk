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

import com.aliyuncs.rds.model.v20140815.DescribeOptimizeAdviceOnBigTableResponse;
import com.aliyuncs.rds.model.v20140815.DescribeOptimizeAdviceOnBigTableResponse.AdviceOnBigTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOptimizeAdviceOnBigTableResponseUnmarshaller {

	public static DescribeOptimizeAdviceOnBigTableResponse unmarshall(DescribeOptimizeAdviceOnBigTableResponse describeOptimizeAdviceOnBigTableResponse, UnmarshallerContext context) {
		
		describeOptimizeAdviceOnBigTableResponse.setRequestId(context.stringValue("DescribeOptimizeAdviceOnBigTableResponse.RequestId"));
		describeOptimizeAdviceOnBigTableResponse.setTotalRecordsCount(context.integerValue("DescribeOptimizeAdviceOnBigTableResponse.TotalRecordsCount"));
		describeOptimizeAdviceOnBigTableResponse.setPageNumber(context.integerValue("DescribeOptimizeAdviceOnBigTableResponse.PageNumber"));
		describeOptimizeAdviceOnBigTableResponse.setPageRecordCount(context.integerValue("DescribeOptimizeAdviceOnBigTableResponse.PageRecordCount"));

		List<AdviceOnBigTable> items = new ArrayList<AdviceOnBigTable>();
		for (int i = 0; i < context.lengthValue("DescribeOptimizeAdviceOnBigTableResponse.Items.Length"); i++) {
			AdviceOnBigTable adviceOnBigTable = new AdviceOnBigTable();
			adviceOnBigTable.setDBName(context.stringValue("DescribeOptimizeAdviceOnBigTableResponse.Items["+ i +"].DBName"));
			adviceOnBigTable.setTableName(context.stringValue("DescribeOptimizeAdviceOnBigTableResponse.Items["+ i +"].TableName"));
			adviceOnBigTable.setTableSize(context.longValue("DescribeOptimizeAdviceOnBigTableResponse.Items["+ i +"].TableSize"));
			adviceOnBigTable.setDataSize(context.longValue("DescribeOptimizeAdviceOnBigTableResponse.Items["+ i +"].DataSize"));
			adviceOnBigTable.setIndexSize(context.longValue("DescribeOptimizeAdviceOnBigTableResponse.Items["+ i +"].IndexSize"));

			items.add(adviceOnBigTable);
		}
		describeOptimizeAdviceOnBigTableResponse.setItems(items);
	 
	 	return describeOptimizeAdviceOnBigTableResponse;
	}
}