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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClusterOperationResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterOperationResponse.ClusterOperation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterOperationResponseUnmarshaller {

	public static ListClusterOperationResponse unmarshall(ListClusterOperationResponse listClusterOperationResponse, UnmarshallerContext context) {
		
		listClusterOperationResponse.setRequestId(context.stringValue("ListClusterOperationResponse.RequestId"));
		listClusterOperationResponse.setTotalCount(context.integerValue("ListClusterOperationResponse.TotalCount"));
		listClusterOperationResponse.setPageNumber(context.integerValue("ListClusterOperationResponse.PageNumber"));
		listClusterOperationResponse.setPageSize(context.integerValue("ListClusterOperationResponse.PageSize"));

		List<ClusterOperation> clusterOperationList = new ArrayList<ClusterOperation>();
		for (int i = 0; i < context.lengthValue("ListClusterOperationResponse.ClusterOperationList.Length"); i++) {
			ClusterOperation clusterOperation = new ClusterOperation();
			clusterOperation.setOperationId(context.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].OperationId"));
			clusterOperation.setOperationName(context.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].OperationName"));
			clusterOperation.setStartTime(context.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].StartTime"));
			clusterOperation.setDuration(context.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].Duration"));
			clusterOperation.setStatus(context.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].Status"));
			clusterOperation.setPercentage(context.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].Percentage"));
			clusterOperation.setComment(context.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].Comment"));

			clusterOperationList.add(clusterOperation);
		}
		listClusterOperationResponse.setClusterOperationList(clusterOperationList);
	 
	 	return listClusterOperationResponse;
	}
}