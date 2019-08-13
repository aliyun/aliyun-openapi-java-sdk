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

import com.aliyuncs.emr.model.v20160408.ListFlowClusterResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowClusterResponse.ClusterInfo;
import com.aliyuncs.emr.model.v20160408.ListFlowClusterResponse.ClusterInfo.FailReason;
import com.aliyuncs.emr.model.v20160408.ListFlowClusterResponse.ClusterInfo.OrderTaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowClusterResponseUnmarshaller {

	public static ListFlowClusterResponse unmarshall(ListFlowClusterResponse listFlowClusterResponse, UnmarshallerContext _ctx) {
		
		listFlowClusterResponse.setRequestId(_ctx.stringValue("ListFlowClusterResponse.RequestId"));
		listFlowClusterResponse.setTotalCount(_ctx.integerValue("ListFlowClusterResponse.TotalCount"));
		listFlowClusterResponse.setPageNumber(_ctx.integerValue("ListFlowClusterResponse.PageNumber"));
		listFlowClusterResponse.setPageSize(_ctx.integerValue("ListFlowClusterResponse.PageSize"));

		List<ClusterInfo> clusters = new ArrayList<ClusterInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowClusterResponse.Clusters.Length"); i++) {
			ClusterInfo clusterInfo = new ClusterInfo();
			clusterInfo.setId(_ctx.stringValue("ListFlowClusterResponse.Clusters["+ i +"].Id"));
			clusterInfo.setName(_ctx.stringValue("ListFlowClusterResponse.Clusters["+ i +"].Name"));
			clusterInfo.setType(_ctx.stringValue("ListFlowClusterResponse.Clusters["+ i +"].Type"));
			clusterInfo.setCreateTime(_ctx.longValue("ListFlowClusterResponse.Clusters["+ i +"].CreateTime"));
			clusterInfo.setRunningTime(_ctx.integerValue("ListFlowClusterResponse.Clusters["+ i +"].RunningTime"));
			clusterInfo.setStatus(_ctx.stringValue("ListFlowClusterResponse.Clusters["+ i +"].Status"));
			clusterInfo.setChargeType(_ctx.stringValue("ListFlowClusterResponse.Clusters["+ i +"].ChargeType"));
			clusterInfo.setExpiredTime(_ctx.longValue("ListFlowClusterResponse.Clusters["+ i +"].ExpiredTime"));
			clusterInfo.setPeriod(_ctx.integerValue("ListFlowClusterResponse.Clusters["+ i +"].Period"));
			clusterInfo.setHasUncompletedOrder(_ctx.booleanValue("ListFlowClusterResponse.Clusters["+ i +"].HasUncompletedOrder"));
			clusterInfo.setOrderList(_ctx.stringValue("ListFlowClusterResponse.Clusters["+ i +"].OrderList"));
			clusterInfo.setCreateResource(_ctx.stringValue("ListFlowClusterResponse.Clusters["+ i +"].CreateResource"));

			OrderTaskInfo orderTaskInfo = new OrderTaskInfo();
			orderTaskInfo.setTargetCount(_ctx.integerValue("ListFlowClusterResponse.Clusters["+ i +"].OrderTaskInfo.TargetCount"));
			orderTaskInfo.setCurrentCount(_ctx.integerValue("ListFlowClusterResponse.Clusters["+ i +"].OrderTaskInfo.CurrentCount"));
			orderTaskInfo.setOrderIdList(_ctx.stringValue("ListFlowClusterResponse.Clusters["+ i +"].OrderTaskInfo.OrderIdList"));
			clusterInfo.setOrderTaskInfo(orderTaskInfo);

			FailReason failReason = new FailReason();
			failReason.setErrorCode(_ctx.stringValue("ListFlowClusterResponse.Clusters["+ i +"].FailReason.ErrorCode"));
			failReason.setErrorMsg(_ctx.stringValue("ListFlowClusterResponse.Clusters["+ i +"].FailReason.ErrorMsg"));
			failReason.setRequestId(_ctx.stringValue("ListFlowClusterResponse.Clusters["+ i +"].FailReason.RequestId"));
			clusterInfo.setFailReason(failReason);

			clusters.add(clusterInfo);
		}
		listFlowClusterResponse.setClusters(clusters);
	 
	 	return listFlowClusterResponse;
	}
}