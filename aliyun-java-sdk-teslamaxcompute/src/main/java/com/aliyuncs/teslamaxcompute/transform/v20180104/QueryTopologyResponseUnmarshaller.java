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
package com.aliyuncs.teslamaxcompute.transform.v20180104;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslamaxcompute.model.v20180104.QueryTopologyResponse;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryTopologyResponse.ResultItem;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryTopologyResponse.ResultItem.RegionItem;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryTopologyResponse.ResultItem.RegionItem.ClusterItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTopologyResponseUnmarshaller {

	public static QueryTopologyResponse unmarshall(QueryTopologyResponse queryTopologyResponse, UnmarshallerContext context) {
		
		queryTopologyResponse.setRequestId(context.stringValue("QueryTopologyResponse.RequestId"));
		queryTopologyResponse.setCode(context.integerValue("QueryTopologyResponse.Code"));
		queryTopologyResponse.setMessage(context.stringValue("QueryTopologyResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("QueryTopologyResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setLastUpdate(context.stringValue("QueryTopologyResponse.Result["+ i +"].LastUpdate"));

			List<RegionItem> regions = new ArrayList<RegionItem>();
			for (int j = 0; j < context.lengthValue("QueryTopologyResponse.Result["+ i +"].Regions.Length"); j++) {
				RegionItem regionItem = new RegionItem();
				regionItem.setRegion(context.stringValue("QueryTopologyResponse.Result["+ i +"].Regions["+ j +"].Region"));
				regionItem.setRegionEnName(context.stringValue("QueryTopologyResponse.Result["+ i +"].Regions["+ j +"].RegionEnName"));
				regionItem.setRegionCnName(context.stringValue("QueryTopologyResponse.Result["+ i +"].Regions["+ j +"].RegionCnName"));

				List<ClusterItem> clusters = new ArrayList<ClusterItem>();
				for (int k = 0; k < context.lengthValue("QueryTopologyResponse.Result["+ i +"].Regions["+ j +"].Clusters.Length"); k++) {
					ClusterItem clusterItem = new ClusterItem();
					clusterItem.setCluster(context.stringValue("QueryTopologyResponse.Result["+ i +"].Regions["+ j +"].Clusters["+ k +"].Cluster"));
					clusterItem.setProductLine(context.stringValue("QueryTopologyResponse.Result["+ i +"].Regions["+ j +"].Clusters["+ k +"].ProductLine"));
					clusterItem.setProductClass(context.stringValue("QueryTopologyResponse.Result["+ i +"].Regions["+ j +"].Clusters["+ k +"].ProductClass"));
					clusterItem.setNetCode(context.stringValue("QueryTopologyResponse.Result["+ i +"].Regions["+ j +"].Clusters["+ k +"].NetCode"));
					clusterItem.setBusiness(context.stringValue("QueryTopologyResponse.Result["+ i +"].Regions["+ j +"].Clusters["+ k +"].Business"));
					clusterItem.setMachineRoom(context.stringValue("QueryTopologyResponse.Result["+ i +"].Regions["+ j +"].Clusters["+ k +"].MachineRoom"));
					clusterItem.setNetArch(context.stringValue("QueryTopologyResponse.Result["+ i +"].Regions["+ j +"].Clusters["+ k +"].NetArch"));

					clusters.add(clusterItem);
				}
				regionItem.setClusters(clusters);

				regions.add(regionItem);
			}
			resultItem.setRegions(regions);

			result.add(resultItem);
		}
		queryTopologyResponse.setResult(result);
	 
	 	return queryTopologyResponse;
	}
}