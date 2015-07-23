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
import com.aliyuncs.rds.model.v20140815.DescribeOptimizeAdviceOnMissIndexResponse;
import com.aliyuncs.rds.model.v20140815.DescribeOptimizeAdviceOnMissIndexResponse.AdviceOnMissIndex;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOptimizeAdviceOnMissIndexResponseUnmarshaller {

	public static DescribeOptimizeAdviceOnMissIndexResponse unmarshall(DescribeOptimizeAdviceOnMissIndexResponse describeOptimizeAdviceOnMissIndexResponse, UnmarshallerContext context) {
		
		describeOptimizeAdviceOnMissIndexResponse.setRequestId(context.stringValue("DescribeOptimizeAdviceOnMissIndexResponse.RequestId"));
		describeOptimizeAdviceOnMissIndexResponse.setDBInstanceId(context.stringValue("DescribeOptimizeAdviceOnMissIndexResponse.DBInstanceId"));
		describeOptimizeAdviceOnMissIndexResponse.setTotalRecordsCount(context.integerValue("DescribeOptimizeAdviceOnMissIndexResponse.TotalRecordsCount"));
		describeOptimizeAdviceOnMissIndexResponse.setPageNumber(context.integerValue("DescribeOptimizeAdviceOnMissIndexResponse.PageNumber"));
		describeOptimizeAdviceOnMissIndexResponse.setPageRecordCount(context.integerValue("DescribeOptimizeAdviceOnMissIndexResponse.PageRecordCount"));

		List<AdviceOnMissIndex> items = new ArrayList<AdviceOnMissIndex>();
		for (int i = 0; i < context.lengthValue("DescribeOptimizeAdviceOnMissIndexResponse.Items.Length"); i++) {
			AdviceOnMissIndex  adviceOnMissIndex = new AdviceOnMissIndex();
			adviceOnMissIndex.setDBName(context.stringValue("DescribeOptimizeAdviceOnMissIndexResponse.Items["+ i +"].DBName"));
			adviceOnMissIndex.setTableName(context.stringValue("DescribeOptimizeAdviceOnMissIndexResponse.Items["+ i +"].TableName"));
			adviceOnMissIndex.setQueryColumn(context.stringValue("DescribeOptimizeAdviceOnMissIndexResponse.Items["+ i +"].QueryColumn"));
			adviceOnMissIndex.setSQLText(context.stringValue("DescribeOptimizeAdviceOnMissIndexResponse.Items["+ i +"].SQLText"));

			items.add(adviceOnMissIndex);
		}
		describeOptimizeAdviceOnMissIndexResponse.setItems(items);
	 
	 	return describeOptimizeAdviceOnMissIndexResponse;
	}
}