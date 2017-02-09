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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeResponse.OperationProgress;
import com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeResponse.OperationProgress.RelatedItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTaskAttributeResponseUnmarshaller {

	public static DescribeTaskAttributeResponse unmarshall(DescribeTaskAttributeResponse describeTaskAttributeResponse, UnmarshallerContext context) {
		
		describeTaskAttributeResponse.setRequestId(context.stringValue("DescribeTaskAttributeResponse.RequestId"));
		describeTaskAttributeResponse.setTaskId(context.stringValue("DescribeTaskAttributeResponse.TaskId"));
		describeTaskAttributeResponse.setRegionId(context.stringValue("DescribeTaskAttributeResponse.RegionId"));
		describeTaskAttributeResponse.setTaskAction(context.stringValue("DescribeTaskAttributeResponse.TaskAction"));
		describeTaskAttributeResponse.setTaskStatus(context.stringValue("DescribeTaskAttributeResponse.TaskStatus"));
		describeTaskAttributeResponse.setTaskProcess(context.stringValue("DescribeTaskAttributeResponse.TaskProcess"));
		describeTaskAttributeResponse.setSupportCancel(context.stringValue("DescribeTaskAttributeResponse.SupportCancel"));
		describeTaskAttributeResponse.setTotalCount(context.integerValue("DescribeTaskAttributeResponse.TotalCount"));
		describeTaskAttributeResponse.setSuccessCount(context.integerValue("DescribeTaskAttributeResponse.SuccessCount"));
		describeTaskAttributeResponse.setFailedCount(context.integerValue("DescribeTaskAttributeResponse.FailedCount"));
		describeTaskAttributeResponse.setCreationTime(context.stringValue("DescribeTaskAttributeResponse.CreationTime"));
		describeTaskAttributeResponse.setFinishedTime(context.stringValue("DescribeTaskAttributeResponse.FinishedTime"));

		List<OperationProgress> operationProgressSet = new ArrayList<OperationProgress>();
		for (int i = 0; i < context.lengthValue("DescribeTaskAttributeResponse.OperationProgressSet.Length"); i++) {
			OperationProgress operationProgress = new OperationProgress();
			operationProgress.setOperationStatus(context.stringValue("DescribeTaskAttributeResponse.OperationProgressSet["+ i +"].OperationStatus"));
			operationProgress.setErrorCode(context.stringValue("DescribeTaskAttributeResponse.OperationProgressSet["+ i +"].ErrorCode"));
			operationProgress.setErrorMsg(context.stringValue("DescribeTaskAttributeResponse.OperationProgressSet["+ i +"].ErrorMsg"));

			List<RelatedItem> relatedItemSet = new ArrayList<RelatedItem>();
			for (int j = 0; j < context.lengthValue("DescribeTaskAttributeResponse.OperationProgressSet["+ i +"].RelatedItemSet.Length"); j++) {
				RelatedItem relatedItem = new RelatedItem();
				relatedItem.setName(context.stringValue("DescribeTaskAttributeResponse.OperationProgressSet["+ i +"].RelatedItemSet["+ j +"].Name"));
				relatedItem.setValue(context.stringValue("DescribeTaskAttributeResponse.OperationProgressSet["+ i +"].RelatedItemSet["+ j +"].Value"));

				relatedItemSet.add(relatedItem);
			}
			operationProgress.setRelatedItemSet(relatedItemSet);

			operationProgressSet.add(operationProgress);
		}
		describeTaskAttributeResponse.setOperationProgressSet(operationProgressSet);
	 
	 	return describeTaskAttributeResponse;
	}
}