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

import com.aliyuncs.ecs.model.v20140526.DeleteSnapshotGroupResponse;
import com.aliyuncs.ecs.model.v20140526.DeleteSnapshotGroupResponse.OperationProgress;
import com.aliyuncs.ecs.model.v20140526.DeleteSnapshotGroupResponse.OperationProgress.RelatedItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSnapshotGroupResponseUnmarshaller {

	public static DeleteSnapshotGroupResponse unmarshall(DeleteSnapshotGroupResponse deleteSnapshotGroupResponse, UnmarshallerContext _ctx) {
		
		deleteSnapshotGroupResponse.setRequestId(_ctx.stringValue("DeleteSnapshotGroupResponse.RequestId"));

		List<OperationProgress> operationProgressSet = new ArrayList<OperationProgress>();
		for (int i = 0; i < _ctx.lengthValue("DeleteSnapshotGroupResponse.OperationProgressSet.Length"); i++) {
			OperationProgress operationProgress = new OperationProgress();
			operationProgress.setOperationStatus(_ctx.stringValue("DeleteSnapshotGroupResponse.OperationProgressSet["+ i +"].OperationStatus"));
			operationProgress.setErrorCode(_ctx.stringValue("DeleteSnapshotGroupResponse.OperationProgressSet["+ i +"].ErrorCode"));
			operationProgress.setErrorMsg(_ctx.stringValue("DeleteSnapshotGroupResponse.OperationProgressSet["+ i +"].ErrorMsg"));

			List<RelatedItem> relatedItemSet = new ArrayList<RelatedItem>();
			for (int j = 0; j < _ctx.lengthValue("DeleteSnapshotGroupResponse.OperationProgressSet["+ i +"].RelatedItemSet.Length"); j++) {
				RelatedItem relatedItem = new RelatedItem();
				relatedItem.setName(_ctx.stringValue("DeleteSnapshotGroupResponse.OperationProgressSet["+ i +"].RelatedItemSet["+ j +"].Name"));
				relatedItem.setValue(_ctx.stringValue("DeleteSnapshotGroupResponse.OperationProgressSet["+ i +"].RelatedItemSet["+ j +"].Value"));

				relatedItemSet.add(relatedItem);
			}
			operationProgress.setRelatedItemSet(relatedItemSet);

			operationProgressSet.add(operationProgress);
		}
		deleteSnapshotGroupResponse.setOperationProgressSet(operationProgressSet);
	 
	 	return deleteSnapshotGroupResponse;
	}
}