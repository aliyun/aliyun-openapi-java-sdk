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

import com.aliyuncs.rds.model.v20140815.DescribeOptimizeAdviceOnExcessIndexResponse;
import com.aliyuncs.rds.model.v20140815.DescribeOptimizeAdviceOnExcessIndexResponse.AdviceOnExcessIndex;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOptimizeAdviceOnExcessIndexResponseUnmarshaller {

	public static DescribeOptimizeAdviceOnExcessIndexResponse unmarshall(DescribeOptimizeAdviceOnExcessIndexResponse describeOptimizeAdviceOnExcessIndexResponse, UnmarshallerContext context) {
		
		describeOptimizeAdviceOnExcessIndexResponse.setRequestId(context.stringValue("DescribeOptimizeAdviceOnExcessIndexResponse.RequestId"));
		describeOptimizeAdviceOnExcessIndexResponse.setTotalRecordsCount(context.integerValue("DescribeOptimizeAdviceOnExcessIndexResponse.TotalRecordsCount"));
		describeOptimizeAdviceOnExcessIndexResponse.setPageNumber(context.integerValue("DescribeOptimizeAdviceOnExcessIndexResponse.PageNumber"));
		describeOptimizeAdviceOnExcessIndexResponse.setPageRecordCount(context.integerValue("DescribeOptimizeAdviceOnExcessIndexResponse.PageRecordCount"));

		List<AdviceOnExcessIndex> items = new ArrayList<AdviceOnExcessIndex>();
		for (int i = 0; i < context.lengthValue("DescribeOptimizeAdviceOnExcessIndexResponse.Items.Length"); i++) {
			AdviceOnExcessIndex adviceOnExcessIndex = new AdviceOnExcessIndex();
			adviceOnExcessIndex.setDBName(context.stringValue("DescribeOptimizeAdviceOnExcessIndexResponse.Items["+ i +"].DBName"));
			adviceOnExcessIndex.setTableName(context.stringValue("DescribeOptimizeAdviceOnExcessIndexResponse.Items["+ i +"].TableName"));
			adviceOnExcessIndex.setIndexCount(context.longValue("DescribeOptimizeAdviceOnExcessIndexResponse.Items["+ i +"].IndexCount"));

			items.add(adviceOnExcessIndex);
		}
		describeOptimizeAdviceOnExcessIndexResponse.setItems(items);
	 
	 	return describeOptimizeAdviceOnExcessIndexResponse;
	}
}