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

import com.aliyuncs.emr.model.v20160408.ListFlowClusterAllResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowClusterAllResponse.ClusterInfo;
import com.aliyuncs.emr.model.v20160408.ListFlowClusterAllResponse.ClusterInfo.FailReason;
import com.aliyuncs.emr.model.v20160408.ListFlowClusterAllResponse.ClusterInfo.OrderTaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowClusterAllResponseUnmarshaller {

	public static ListFlowClusterAllResponse unmarshall(ListFlowClusterAllResponse listFlowClusterAllResponse, UnmarshallerContext _ctx) {
		
		listFlowClusterAllResponse.setRequestId(_ctx.stringValue("ListFlowClusterAllResponse.RequestId"));
		listFlowClusterAllResponse.setTotalCount(_ctx.integerValue("ListFlowClusterAllResponse.TotalCount"));
		listFlowClusterAllResponse.setPageNumber(_ctx.integerValue("ListFlowClusterAllResponse.PageNumber"));
		listFlowClusterAllResponse.setPageSize(_ctx.integerValue("ListFlowClusterAllResponse.PageSize"));

		List<ClusterInfo> clusters = new ArrayList<ClusterInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowClusterAllResponse.Clusters.Length"); i++) {
			ClusterInfo clusterInfo = new ClusterInfo();
			clusterInfo.setId(_ctx.stringValue("ListFlowClusterAllResponse.Clusters["+ i +"].Id"));
			clusterInfo.setName(_ctx.stringValue("ListFlowClusterAllResponse.Clusters["+ i +"].Name"));
			clusterInfo.setType(_ctx.stringValue("ListFlowClusterAllResponse.Clusters["+ i +"].Type"));
			clusterInfo.setCreateTime(_ctx.longValue("ListFlowClusterAllResponse.Clusters["+ i +"].CreateTime"));
			clusterInfo.setRunningTime(_ctx.integerValue("ListFlowClusterAllResponse.Clusters["+ i +"].RunningTime"));
			clusterInfo.setStatus(_ctx.stringValue("ListFlowClusterAllResponse.Clusters["+ i +"].Status"));
			clusterInfo.setChargeType(_ctx.stringValue("ListFlowClusterAllResponse.Clusters["+ i +"].ChargeType"));
			clusterInfo.setExpiredTime(_ctx.longValue("ListFlowClusterAllResponse.Clusters["+ i +"].ExpiredTime"));
			clusterInfo.setPeriod(_ctx.integerValue("ListFlowClusterAllResponse.Clusters["+ i +"].Period"));
			clusterInfo.setHasUncompletedOrder(_ctx.booleanValue("ListFlowClusterAllResponse.Clusters["+ i +"].HasUncompletedOrder"));
			clusterInfo.setOrderList(_ctx.stringValue("ListFlowClusterAllResponse.Clusters["+ i +"].OrderList"));
			clusterInfo.setCreateResource(_ctx.stringValue("ListFlowClusterAllResponse.Clusters["+ i +"].CreateResource"));

			OrderTaskInfo orderTaskInfo = new OrderTaskInfo();
			orderTaskInfo.setTargetCount(_ctx.integerValue("ListFlowClusterAllResponse.Clusters["+ i +"].OrderTaskInfo.TargetCount"));
			orderTaskInfo.setCurrentCount(_ctx.integerValue("ListFlowClusterAllResponse.Clusters["+ i +"].OrderTaskInfo.CurrentCount"));
			orderTaskInfo.setOrderIdList(_ctx.stringValue("ListFlowClusterAllResponse.Clusters["+ i +"].OrderTaskInfo.OrderIdList"));
			clusterInfo.setOrderTaskInfo(orderTaskInfo);

			FailReason failReason = new FailReason();
			failReason.setErrorCode(_ctx.stringValue("ListFlowClusterAllResponse.Clusters["+ i +"].FailReason.ErrorCode"));
			failReason.setErrorMsg(_ctx.stringValue("ListFlowClusterAllResponse.Clusters["+ i +"].FailReason.ErrorMsg"));
			failReason.setRequestId(_ctx.stringValue("ListFlowClusterAllResponse.Clusters["+ i +"].FailReason.RequestId"));
			clusterInfo.setFailReason(failReason);

			clusters.add(clusterInfo);
		}
		listFlowClusterAllResponse.setClusters(clusters);
	 
	 	return listFlowClusterAllResponse;
	}
}