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
package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeReplicaInitializeProgressResponse;
import com.aliyuncs.dds.model.v20151201.DescribeReplicaInitializeProgressResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicaInitializeProgressResponseUnmarshaller {

	public static DescribeReplicaInitializeProgressResponse unmarshall(DescribeReplicaInitializeProgressResponse describeReplicaInitializeProgressResponse, UnmarshallerContext context) {
		
		describeReplicaInitializeProgressResponse.setRequestId(context.stringValue("DescribeReplicaInitializeProgressResponse.RequestId"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("DescribeReplicaInitializeProgressResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setReplicaId(context.stringValue("DescribeReplicaInitializeProgressResponse.Items["+ i +"].ReplicaId"));
			itemsItem.setStatus(context.stringValue("DescribeReplicaInitializeProgressResponse.Items["+ i +"].Status"));
			itemsItem.setProgress(context.stringValue("DescribeReplicaInitializeProgressResponse.Items["+ i +"].Progress"));
			itemsItem.setFinishTime(context.stringValue("DescribeReplicaInitializeProgressResponse.Items["+ i +"].FinishTime"));
			itemsItem.setCurrentStep(context.stringValue("DescribeReplicaInitializeProgressResponse.Items["+ i +"].CurrentStep"));

			items.add(itemsItem);
		}
		describeReplicaInitializeProgressResponse.setItems(items);
	 
	 	return describeReplicaInitializeProgressResponse;
	}
}