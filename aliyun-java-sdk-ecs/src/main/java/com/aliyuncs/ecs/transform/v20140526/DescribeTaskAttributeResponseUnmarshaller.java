/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeResponse.OperationProgress;
import com.aliyuncs.ecs.model.v20140526.DescribeTaskAttributeResponse.OperationProgress.RelatedItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTaskAttributeResponseUnmarshaller {

	public static DescribeTaskAttributeResponse unmarshall(DescribeTaskAttributeResponse describeTaskAttributeResponse, UnmarshallerContext _ctx) {
		
		describeTaskAttributeResponse.setRequestId(_ctx.stringValue("DescribeTaskAttributeResponse.RequestId"));
		describeTaskAttributeResponse.setTaskId(_ctx.stringValue("DescribeTaskAttributeResponse.TaskId"));
		describeTaskAttributeResponse.setRegionId(_ctx.stringValue("DescribeTaskAttributeResponse.RegionId"));
		describeTaskAttributeResponse.setTaskAction(_ctx.stringValue("DescribeTaskAttributeResponse.TaskAction"));
		describeTaskAttributeResponse.setTaskStatus(_ctx.stringValue("DescribeTaskAttributeResponse.TaskStatus"));
		describeTaskAttributeResponse.setTaskProcess(_ctx.stringValue("DescribeTaskAttributeResponse.TaskProcess"));
		describeTaskAttributeResponse.setSupportCancel(_ctx.stringValue("DescribeTaskAttributeResponse.SupportCancel"));
		describeTaskAttributeResponse.setTotalCount(_ctx.integerValue("DescribeTaskAttributeResponse.TotalCount"));
		describeTaskAttributeResponse.setSuccessCount(_ctx.integerValue("DescribeTaskAttributeResponse.SuccessCount"));
		describeTaskAttributeResponse.setFailedCount(_ctx.integerValue("DescribeTaskAttributeResponse.FailedCount"));
		describeTaskAttributeResponse.setCreationTime(_ctx.stringValue("DescribeTaskAttributeResponse.CreationTime"));
		describeTaskAttributeResponse.setFinishedTime(_ctx.stringValue("DescribeTaskAttributeResponse.FinishedTime"));

		List<OperationProgress> operationProgressSet = new ArrayList<OperationProgress>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTaskAttributeResponse.OperationProgressSet.Length"); i++) {
			OperationProgress operationProgress = new OperationProgress();
			operationProgress.setOperationStatus(_ctx.stringValue("DescribeTaskAttributeResponse.OperationProgressSet["+ i +"].OperationStatus"));
			operationProgress.setErrorCode(_ctx.stringValue("DescribeTaskAttributeResponse.OperationProgressSet["+ i +"].ErrorCode"));
			operationProgress.setErrorMsg(_ctx.stringValue("DescribeTaskAttributeResponse.OperationProgressSet["+ i +"].ErrorMsg"));

			List<RelatedItem> relatedItemSet = new ArrayList<RelatedItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTaskAttributeResponse.OperationProgressSet["+ i +"].RelatedItemSet.Length"); j++) {
				RelatedItem relatedItem = new RelatedItem();
				relatedItem.setName(_ctx.stringValue("DescribeTaskAttributeResponse.OperationProgressSet["+ i +"].RelatedItemSet["+ j +"].Name"));
				relatedItem.setValue(_ctx.stringValue("DescribeTaskAttributeResponse.OperationProgressSet["+ i +"].RelatedItemSet["+ j +"].Value"));

				relatedItemSet.add(relatedItem);
			}
			operationProgress.setRelatedItemSet(relatedItemSet);

			operationProgressSet.add(operationProgress);
		}
		describeTaskAttributeResponse.setOperationProgressSet(operationProgressSet);
	 
	 	return describeTaskAttributeResponse;
	}
}