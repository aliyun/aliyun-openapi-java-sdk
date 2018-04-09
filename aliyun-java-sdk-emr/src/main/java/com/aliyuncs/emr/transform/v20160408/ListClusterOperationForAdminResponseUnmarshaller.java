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

import com.aliyuncs.emr.model.v20160408.ListClusterOperationForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterOperationForAdminResponse.ClusterOperation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterOperationForAdminResponseUnmarshaller {

	public static ListClusterOperationForAdminResponse unmarshall(ListClusterOperationForAdminResponse listClusterOperationForAdminResponse, UnmarshallerContext context) {
		
		listClusterOperationForAdminResponse.setRequestId(context.stringValue("ListClusterOperationForAdminResponse.RequestId"));
		listClusterOperationForAdminResponse.setTotalCount(context.integerValue("ListClusterOperationForAdminResponse.TotalCount"));
		listClusterOperationForAdminResponse.setPageNumber(context.integerValue("ListClusterOperationForAdminResponse.PageNumber"));
		listClusterOperationForAdminResponse.setPageSize(context.integerValue("ListClusterOperationForAdminResponse.PageSize"));

		List<ClusterOperation> clusterOperationList = new ArrayList<ClusterOperation>();
		for (int i = 0; i < context.lengthValue("ListClusterOperationForAdminResponse.ClusterOperationList.Length"); i++) {
			ClusterOperation clusterOperation = new ClusterOperation();
			clusterOperation.setOperationId(context.stringValue("ListClusterOperationForAdminResponse.ClusterOperationList["+ i +"].OperationId"));
			clusterOperation.setOperationName(context.stringValue("ListClusterOperationForAdminResponse.ClusterOperationList["+ i +"].OperationName"));
			clusterOperation.setStartTime(context.stringValue("ListClusterOperationForAdminResponse.ClusterOperationList["+ i +"].StartTime"));
			clusterOperation.setDuration(context.stringValue("ListClusterOperationForAdminResponse.ClusterOperationList["+ i +"].Duration"));
			clusterOperation.setStatus(context.stringValue("ListClusterOperationForAdminResponse.ClusterOperationList["+ i +"].Status"));
			clusterOperation.setPercentage(context.stringValue("ListClusterOperationForAdminResponse.ClusterOperationList["+ i +"].Percentage"));
			clusterOperation.setComment(context.stringValue("ListClusterOperationForAdminResponse.ClusterOperationList["+ i +"].Comment"));

			clusterOperationList.add(clusterOperation);
		}
		listClusterOperationForAdminResponse.setClusterOperationList(clusterOperationList);
	 
	 	return listClusterOperationForAdminResponse;
	}
}