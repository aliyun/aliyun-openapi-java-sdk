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
import com.aliyuncs.rds.model.v20140815.DescribeOptimizeAdviceByDBAResponse;
import com.aliyuncs.rds.model.v20140815.DescribeOptimizeAdviceByDBAResponse.AdviceByDBA;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOptimizeAdviceByDBAResponseUnmarshaller {

	public static DescribeOptimizeAdviceByDBAResponse unmarshall(DescribeOptimizeAdviceByDBAResponse describeOptimizeAdviceByDBAResponse, UnmarshallerContext context) {
		
		describeOptimizeAdviceByDBAResponse.setRequestId(context.stringValue("DescribeOptimizeAdviceByDBAResponse.RequestId"));
		describeOptimizeAdviceByDBAResponse.setTotalRecordsCount(context.integerValue("DescribeOptimizeAdviceByDBAResponse.TotalRecordsCount"));
		describeOptimizeAdviceByDBAResponse.setPageNumber(context.integerValue("DescribeOptimizeAdviceByDBAResponse.PageNumber"));
		describeOptimizeAdviceByDBAResponse.setPageRecordCount(context.integerValue("DescribeOptimizeAdviceByDBAResponse.PageRecordCount"));

		List<AdviceByDBA> items = new ArrayList<AdviceByDBA>();
		for (int i = 0; i < context.lengthValue("DescribeOptimizeAdviceByDBAResponse.Items.Length"); i++) {
			AdviceByDBA  adviceByDBA = new AdviceByDBA();
			adviceByDBA.setOptimizationText(context.stringValue("DescribeOptimizeAdviceByDBAResponse.Items["+ i +"].OptimizationText"));

			items.add(adviceByDBA);
		}
		describeOptimizeAdviceByDBAResponse.setItems(items);
	 
	 	return describeOptimizeAdviceByDBAResponse;
	}
}