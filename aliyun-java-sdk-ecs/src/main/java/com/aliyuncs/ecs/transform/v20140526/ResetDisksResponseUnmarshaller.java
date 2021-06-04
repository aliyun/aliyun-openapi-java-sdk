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

import com.aliyuncs.ecs.model.v20140526.ResetDisksResponse;
import com.aliyuncs.ecs.model.v20140526.ResetDisksResponse.OperationProgress;
import com.aliyuncs.ecs.model.v20140526.ResetDisksResponse.OperationProgress.RelatedItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetDisksResponseUnmarshaller {

	public static ResetDisksResponse unmarshall(ResetDisksResponse resetDisksResponse, UnmarshallerContext _ctx) {
		
		resetDisksResponse.setRequestId(_ctx.stringValue("ResetDisksResponse.RequestId"));

		List<OperationProgress> operationProgressSet = new ArrayList<OperationProgress>();
		for (int i = 0; i < _ctx.lengthValue("ResetDisksResponse.OperationProgressSet.Length"); i++) {
			OperationProgress operationProgress = new OperationProgress();
			operationProgress.setErrorMsg(_ctx.stringValue("ResetDisksResponse.OperationProgressSet["+ i +"].ErrorMsg"));
			operationProgress.setErrorCode(_ctx.stringValue("ResetDisksResponse.OperationProgressSet["+ i +"].ErrorCode"));
			operationProgress.setOperationStatus(_ctx.stringValue("ResetDisksResponse.OperationProgressSet["+ i +"].OperationStatus"));

			List<RelatedItem> relatedItemSet = new ArrayList<RelatedItem>();
			for (int j = 0; j < _ctx.lengthValue("ResetDisksResponse.OperationProgressSet["+ i +"].RelatedItemSet.Length"); j++) {
				RelatedItem relatedItem = new RelatedItem();
				relatedItem.setName(_ctx.stringValue("ResetDisksResponse.OperationProgressSet["+ i +"].RelatedItemSet["+ j +"].Name"));
				relatedItem.setValue(_ctx.stringValue("ResetDisksResponse.OperationProgressSet["+ i +"].RelatedItemSet["+ j +"].Value"));

				relatedItemSet.add(relatedItem);
			}
			operationProgress.setRelatedItemSet(relatedItemSet);

			operationProgressSet.add(operationProgress);
		}
		resetDisksResponse.setOperationProgressSet(operationProgressSet);
	 
	 	return resetDisksResponse;
	}
}