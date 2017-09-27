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

import com.aliyuncs.rds.model.v20140815.DescribeInstanceAutoRenewAttributeResponse;
import com.aliyuncs.rds.model.v20140815.DescribeInstanceAutoRenewAttributeResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAutoRenewAttributeResponseUnmarshaller {

	public static DescribeInstanceAutoRenewAttributeResponse unmarshall(DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeResponse, UnmarshallerContext context) {
		
		describeInstanceAutoRenewAttributeResponse.setRequestId(context.stringValue("DescribeInstanceAutoRenewAttributeResponse.RequestId"));
		describeInstanceAutoRenewAttributeResponse.setPageNumber(context.integerValue("DescribeInstanceAutoRenewAttributeResponse.PageNumber"));
		describeInstanceAutoRenewAttributeResponse.setTotalRecordCount(context.integerValue("DescribeInstanceAutoRenewAttributeResponse.TotalRecordCount"));
		describeInstanceAutoRenewAttributeResponse.setPageRecordCount(context.integerValue("DescribeInstanceAutoRenewAttributeResponse.PageRecordCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceAutoRenewAttributeResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setDBInstanceId(context.stringValue("DescribeInstanceAutoRenewAttributeResponse.Items["+ i +"].DBInstanceId"));
			item.setRegionId(context.stringValue("DescribeInstanceAutoRenewAttributeResponse.Items["+ i +"].RegionId"));
			item.setDuration(context.integerValue("DescribeInstanceAutoRenewAttributeResponse.Items["+ i +"].Duration"));
			item.setStatus(context.stringValue("DescribeInstanceAutoRenewAttributeResponse.Items["+ i +"].Status"));
			item.setAutoRenew(context.stringValue("DescribeInstanceAutoRenewAttributeResponse.Items["+ i +"].AutoRenew"));

			items.add(item);
		}
		describeInstanceAutoRenewAttributeResponse.setItems(items);
	 
	 	return describeInstanceAutoRenewAttributeResponse;
	}
}