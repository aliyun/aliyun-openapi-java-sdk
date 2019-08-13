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

	public static ListClusterOperationResponse unmarshall(ListClusterOperationResponse listClusterOperationResponse, UnmarshallerContext _ctx) {
		
		listClusterOperationResponse.setRequestId(_ctx.stringValue("ListClusterOperationResponse.RequestId"));
		listClusterOperationResponse.setTotalCount(_ctx.integerValue("ListClusterOperationResponse.TotalCount"));
		listClusterOperationResponse.setPageNumber(_ctx.integerValue("ListClusterOperationResponse.PageNumber"));
		listClusterOperationResponse.setPageSize(_ctx.integerValue("ListClusterOperationResponse.PageSize"));

		List<ClusterOperation> clusterOperationList = new ArrayList<ClusterOperation>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterOperationResponse.ClusterOperationList.Length"); i++) {
			ClusterOperation clusterOperation = new ClusterOperation();
			clusterOperation.setOperationId(_ctx.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].OperationId"));
			clusterOperation.setOperationName(_ctx.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].OperationName"));
			clusterOperation.setStartTime(_ctx.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].StartTime"));
			clusterOperation.setDuration(_ctx.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].Duration"));
			clusterOperation.setStatus(_ctx.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].Status"));
			clusterOperation.setPercentage(_ctx.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].Percentage"));
			clusterOperation.setComment(_ctx.stringValue("ListClusterOperationResponse.ClusterOperationList["+ i +"].Comment"));

			clusterOperationList.add(clusterOperation);
		}
		listClusterOperationResponse.setClusterOperationList(clusterOperationList);
	 
	 	return listClusterOperationResponse;
	}
}