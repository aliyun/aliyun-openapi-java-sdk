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
package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeVulListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulListResponseUnmarshaller {

	public static DescribeVulListResponse unmarshall(DescribeVulListResponse describeVulListResponse, UnmarshallerContext context) {
		
		describeVulListResponse.setRequestId(context.stringValue("DescribeVulListResponse.RequestId"));
		describeVulListResponse.setCount(context.integerValue("DescribeVulListResponse.Count"));
		describeVulListResponse.setPageSize(context.integerValue("DescribeVulListResponse.PageSize"));
		describeVulListResponse.setCurrentPage(context.integerValue("DescribeVulListResponse.CurrentPage"));
		describeVulListResponse.setTotalCount(context.integerValue("DescribeVulListResponse.TotalCount"));

		List<String> vulRecords = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeVulListResponse.VulRecords.Length"); i++) {
			vulRecords.add(context.stringValue("DescribeVulListResponse.VulRecords["+ i +"]"));
		}
		describeVulListResponse.setVulRecords(vulRecords);
	 
	 	return describeVulListResponse;
	}
}