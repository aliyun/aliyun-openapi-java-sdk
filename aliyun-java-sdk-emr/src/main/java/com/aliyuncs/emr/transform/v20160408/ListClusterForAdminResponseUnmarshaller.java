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

import com.aliyuncs.emr.model.v20160408.ListClusterForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterForAdminResponse.Cluster;
import com.aliyuncs.emr.model.v20160408.ListClusterForAdminResponse.Cluster.FailReason;
import com.aliyuncs.emr.model.v20160408.ListClusterForAdminResponse.Cluster.OrderTaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterForAdminResponseUnmarshaller {

	public static ListClusterForAdminResponse unmarshall(ListClusterForAdminResponse listClusterForAdminResponse, UnmarshallerContext context) {
		
		listClusterForAdminResponse.setRequestId(context.stringValue("ListClusterForAdminResponse.RequestId"));
		listClusterForAdminResponse.setTotalCount(context.integerValue("ListClusterForAdminResponse.TotalCount"));
		listClusterForAdminResponse.setPageNumber(context.integerValue("ListClusterForAdminResponse.PageNumber"));
		listClusterForAdminResponse.setPageSize(context.integerValue("ListClusterForAdminResponse.PageSize"));

		List<Cluster> clusterList = new ArrayList<Cluster>();
		for (int i = 0; i < context.lengthValue("ListClusterForAdminResponse.ClusterList.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setId(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].Id"));
			cluster.setName(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].Name"));
			cluster.setBizId(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].BizId"));
			cluster.setLusterType(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].lusterType"));
			cluster.setCreateTime(context.longValue("ListClusterForAdminResponse.ClusterList["+ i +"].CreateTime"));
			cluster.setRunningTime(context.longValue("ListClusterForAdminResponse.ClusterList["+ i +"].RunningTime"));
			cluster.setStatus(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].Status"));
			cluster.setPayType(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].PayType"));
			cluster.setRegionId(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].RegionId"));
			cluster.setEasEnable(context.booleanValue("ListClusterForAdminResponse.ClusterList["+ i +"].EasEnable"));
			cluster.setDepositType(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].DepositType"));
			cluster.setUseLocalMetadb(context.booleanValue("ListClusterForAdminResponse.ClusterList["+ i +"].UseLocalMetadb"));
			cluster.setHighAvailabilityEnable(context.booleanValue("ListClusterForAdminResponse.ClusterList["+ i +"].HighAvailabilityEnable"));
			cluster.setNodeCount(context.integerValue("ListClusterForAdminResponse.ClusterList["+ i +"].NodeCount"));
			cluster.setExpiredTime(context.longValue("ListClusterForAdminResponse.ClusterList["+ i +"].ExpiredTime"));
			cluster.setNetType(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].NetType"));
			cluster.setHasUncompletedOrder(context.booleanValue("ListClusterForAdminResponse.ClusterList["+ i +"].HasUncompletedOrder"));
			cluster.setOrderList(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].OrderList"));
			cluster.setCreateResource(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].CreateResource"));
			cluster.setUserId(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].UserId"));
			cluster.setEcmClusterId(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].EcmClusterId"));
			cluster.setEmrVersion(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].EmrVersion"));
			cluster.setVpcId(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].VpcId"));
			cluster.setVSwitchId(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].VSwitchId"));

			OrderTaskInfo orderTaskInfo = new OrderTaskInfo();
			orderTaskInfo.setTargetCount(context.integerValue("ListClusterForAdminResponse.ClusterList["+ i +"].OrderTaskInfo.TargetCount"));
			orderTaskInfo.setCurrentCount(context.integerValue("ListClusterForAdminResponse.ClusterList["+ i +"].OrderTaskInfo.CurrentCount"));
			orderTaskInfo.setOrderIdList(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].OrderTaskInfo.OrderIdList"));
			cluster.setOrderTaskInfo(orderTaskInfo);

			FailReason failReason = new FailReason();
			failReason.setErrorCode(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].FailReason.ErrorCode"));
			failReason.setErrorMsg(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].FailReason.ErrorMsg"));
			failReason.setRequestId(context.stringValue("ListClusterForAdminResponse.ClusterList["+ i +"].FailReason.RequestId"));
			cluster.setFailReason(failReason);

			clusterList.add(cluster);
		}
		listClusterForAdminResponse.setClusterList(clusterList);
	 
	 	return listClusterForAdminResponse;
	}
}