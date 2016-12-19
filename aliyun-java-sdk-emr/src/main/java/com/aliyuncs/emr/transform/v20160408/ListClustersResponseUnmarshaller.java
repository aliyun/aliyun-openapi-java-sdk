/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListClustersResponse;
import com.aliyuncs.emr.model.v20160408.ListClustersResponse.ClusterInfo;
import com.aliyuncs.emr.model.v20160408.ListClustersResponse.ClusterInfo.FailReason;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClustersResponseUnmarshaller {

	public static ListClustersResponse unmarshall(ListClustersResponse listClustersResponse, UnmarshallerContext context) {
		
		listClustersResponse.setRequestId(context.stringValue("ListClustersResponse.RequestId"));
		listClustersResponse.setTotalCount(context.integerValue("ListClustersResponse.TotalCount"));
		listClustersResponse.setPageNumber(context.integerValue("ListClustersResponse.PageNumber"));
		listClustersResponse.setPageSize(context.integerValue("ListClustersResponse.PageSize"));

		List<ClusterInfo> clusters = new ArrayList<ClusterInfo>();
		for (int i = 0; i < context.lengthValue("ListClustersResponse.Clusters.Length"); i++) {
			ClusterInfo clusterInfo = new ClusterInfo();
			clusterInfo.setId(context.stringValue("ListClustersResponse.Clusters["+ i +"].Id"));
			clusterInfo.setName(context.stringValue("ListClustersResponse.Clusters["+ i +"].Name"));
			clusterInfo.setType(context.stringValue("ListClustersResponse.Clusters["+ i +"].Type"));
			clusterInfo.setCreateTime(context.longValue("ListClustersResponse.Clusters["+ i +"].CreateTime"));
			clusterInfo.setRunningTime(context.integerValue("ListClustersResponse.Clusters["+ i +"].RunningTime"));
			clusterInfo.setStatus(context.stringValue("ListClustersResponse.Clusters["+ i +"].Status"));
			clusterInfo.setChargeType(context.stringValue("ListClustersResponse.Clusters["+ i +"].ChargeType"));
			clusterInfo.setExpiredTime(context.longValue("ListClustersResponse.Clusters["+ i +"].ExpiredTime"));
			clusterInfo.setPeriod(context.integerValue("ListClustersResponse.Clusters["+ i +"].Period"));
			clusterInfo.setHasUncompletedOrder(context.booleanValue("ListClustersResponse.Clusters["+ i +"].HasUncompletedOrder"));
			clusterInfo.setOrderList(context.stringValue("ListClustersResponse.Clusters["+ i +"].OrderList"));

			FailReason failReason = new FailReason();
			failReason.setErrorCode(context.stringValue("ListClustersResponse.Clusters["+ i +"].FailReason.ErrorCode"));
			failReason.setErrorMsg(context.stringValue("ListClustersResponse.Clusters["+ i +"].FailReason.ErrorMsg"));
			failReason.setRequestId(context.stringValue("ListClustersResponse.Clusters["+ i +"].FailReason.RequestId"));
			clusterInfo.setFailReason(failReason);

			clusters.add(clusterInfo);
		}
		listClustersResponse.setClusters(clusters);
	 
	 	return listClustersResponse;
	}
}