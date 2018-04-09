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

import com.aliyuncs.emr.model.v20160408.ListClustersForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClustersForAdminResponse.ClusterInfo;
import com.aliyuncs.emr.model.v20160408.ListClustersForAdminResponse.ClusterInfo.FailReason;
import com.aliyuncs.emr.model.v20160408.ListClustersForAdminResponse.ClusterInfo.OrderTaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClustersForAdminResponseUnmarshaller {

	public static ListClustersForAdminResponse unmarshall(ListClustersForAdminResponse listClustersForAdminResponse, UnmarshallerContext context) {
		
		listClustersForAdminResponse.setRequestId(context.stringValue("ListClustersForAdminResponse.RequestId"));
		listClustersForAdminResponse.setTotalCount(context.integerValue("ListClustersForAdminResponse.TotalCount"));
		listClustersForAdminResponse.setPageNumber(context.integerValue("ListClustersForAdminResponse.PageNumber"));
		listClustersForAdminResponse.setPageSize(context.integerValue("ListClustersForAdminResponse.PageSize"));

		List<ClusterInfo> clusters = new ArrayList<ClusterInfo>();
		for (int i = 0; i < context.lengthValue("ListClustersForAdminResponse.Clusters.Length"); i++) {
			ClusterInfo clusterInfo = new ClusterInfo();
			clusterInfo.setId(context.stringValue("ListClustersForAdminResponse.Clusters["+ i +"].Id"));
			clusterInfo.setName(context.stringValue("ListClustersForAdminResponse.Clusters["+ i +"].Name"));
			clusterInfo.setType(context.stringValue("ListClustersForAdminResponse.Clusters["+ i +"].Type"));
			clusterInfo.setCreateTime(context.longValue("ListClustersForAdminResponse.Clusters["+ i +"].CreateTime"));
			clusterInfo.setRunningTime(context.integerValue("ListClustersForAdminResponse.Clusters["+ i +"].RunningTime"));
			clusterInfo.setStatus(context.stringValue("ListClustersForAdminResponse.Clusters["+ i +"].Status"));
			clusterInfo.setChargeType(context.stringValue("ListClustersForAdminResponse.Clusters["+ i +"].ChargeType"));
			clusterInfo.setExpiredTime(context.longValue("ListClustersForAdminResponse.Clusters["+ i +"].ExpiredTime"));
			clusterInfo.setPeriod(context.integerValue("ListClustersForAdminResponse.Clusters["+ i +"].Period"));
			clusterInfo.setHasUncompletedOrder(context.booleanValue("ListClustersForAdminResponse.Clusters["+ i +"].HasUncompletedOrder"));
			clusterInfo.setOrderList(context.stringValue("ListClustersForAdminResponse.Clusters["+ i +"].OrderList"));
			clusterInfo.setCreateResource(context.stringValue("ListClustersForAdminResponse.Clusters["+ i +"].CreateResource"));

			OrderTaskInfo orderTaskInfo = new OrderTaskInfo();
			orderTaskInfo.setTargetCount(context.integerValue("ListClustersForAdminResponse.Clusters["+ i +"].OrderTaskInfo.TargetCount"));
			orderTaskInfo.setCurrentCount(context.integerValue("ListClustersForAdminResponse.Clusters["+ i +"].OrderTaskInfo.CurrentCount"));
			orderTaskInfo.setOrderIdList(context.stringValue("ListClustersForAdminResponse.Clusters["+ i +"].OrderTaskInfo.OrderIdList"));
			clusterInfo.setOrderTaskInfo(orderTaskInfo);

			FailReason failReason = new FailReason();
			failReason.setErrorCode(context.stringValue("ListClustersForAdminResponse.Clusters["+ i +"].FailReason.ErrorCode"));
			failReason.setErrorMsg(context.stringValue("ListClustersForAdminResponse.Clusters["+ i +"].FailReason.ErrorMsg"));
			failReason.setRequestId(context.stringValue("ListClustersForAdminResponse.Clusters["+ i +"].FailReason.RequestId"));
			clusterInfo.setFailReason(failReason);

			clusters.add(clusterInfo);
		}
		listClustersForAdminResponse.setClusters(clusters);
	 
	 	return listClustersForAdminResponse;
	}
}