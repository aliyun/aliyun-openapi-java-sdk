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

import com.aliyuncs.emr.model.v20160408.ListClustersResponse;
import com.aliyuncs.emr.model.v20160408.ListClustersResponse.ClusterInfo;
import com.aliyuncs.emr.model.v20160408.ListClustersResponse.ClusterInfo.FailReason;
import com.aliyuncs.emr.model.v20160408.ListClustersResponse.ClusterInfo.OrderTaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClustersResponseUnmarshaller {

	public static ListClustersResponse unmarshall(ListClustersResponse listClustersResponse, UnmarshallerContext _ctx) {
		
		listClustersResponse.setRequestId(_ctx.stringValue("ListClustersResponse.RequestId"));
		listClustersResponse.setTotalCount(_ctx.integerValue("ListClustersResponse.TotalCount"));
		listClustersResponse.setPageNumber(_ctx.integerValue("ListClustersResponse.PageNumber"));
		listClustersResponse.setPageSize(_ctx.integerValue("ListClustersResponse.PageSize"));

		List<ClusterInfo> clusters = new ArrayList<ClusterInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListClustersResponse.Clusters.Length"); i++) {
			ClusterInfo clusterInfo = new ClusterInfo();
			clusterInfo.setId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Id"));
			clusterInfo.setName(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Name"));
			clusterInfo.setMachineType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].MachineType"));
			clusterInfo.setType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Type"));
			clusterInfo.setCreateTime(_ctx.longValue("ListClustersResponse.Clusters["+ i +"].CreateTime"));
			clusterInfo.setRunningTime(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].RunningTime"));
			clusterInfo.setStatus(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].Status"));
			clusterInfo.setChargeType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ChargeType"));
			clusterInfo.setExpiredTime(_ctx.longValue("ListClustersResponse.Clusters["+ i +"].ExpiredTime"));
			clusterInfo.setPeriod(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].Period"));
			clusterInfo.setHasUncompletedOrder(_ctx.booleanValue("ListClustersResponse.Clusters["+ i +"].HasUncompletedOrder"));
			clusterInfo.setOrderList(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].OrderList"));
			clusterInfo.setCreateResource(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].CreateResource"));
			clusterInfo.setDepositType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].DepositType"));
			clusterInfo.setMetaStoreType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].MetaStoreType"));

			OrderTaskInfo orderTaskInfo = new OrderTaskInfo();
			orderTaskInfo.setTargetCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].OrderTaskInfo.TargetCount"));
			orderTaskInfo.setCurrentCount(_ctx.integerValue("ListClustersResponse.Clusters["+ i +"].OrderTaskInfo.CurrentCount"));
			orderTaskInfo.setOrderIdList(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].OrderTaskInfo.OrderIdList"));
			clusterInfo.setOrderTaskInfo(orderTaskInfo);

			FailReason failReason = new FailReason();
			failReason.setErrorCode(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].FailReason.ErrorCode"));
			failReason.setErrorMsg(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].FailReason.ErrorMsg"));
			failReason.setRequestId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].FailReason.RequestId"));
			clusterInfo.setFailReason(failReason);

			clusters.add(clusterInfo);
		}
		listClustersResponse.setClusters(clusters);
	 
	 	return listClustersResponse;
	}
}