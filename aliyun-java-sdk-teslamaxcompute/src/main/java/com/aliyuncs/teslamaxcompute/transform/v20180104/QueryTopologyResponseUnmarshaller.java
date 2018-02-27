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

import com.aliyuncs.teslamaxcompute.model.v20180104.QueryTopologyResponse;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryTopologyResponse.Result;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryTopologyResponse.Result.Regions;
import com.aliyuncs.teslamaxcompute.model.v20180104.QueryTopologyResponse.Result.Regions.Clusters;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTopologyResponseUnmarshaller {

	public static QueryTopologyResponse unmarshall(QueryTopologyResponse queryTopologyResponse, UnmarshallerContext context) {
		
		queryTopologyResponse.setRequestId(context.stringValue("QueryTopologyResponse.RequestId"));
		queryTopologyResponse.setCode(context.integerValue("QueryTopologyResponse.Code"));
		queryTopologyResponse.setMessage(context.stringValue("QueryTopologyResponse.Message"));

		Result result = new Result();
		result.setLastUpdate(context.stringValue("QueryTopologyResponse.Result.LastUpdate"));

		Regions regions = new Regions();
		regions.setRegion(context.stringValue("QueryTopologyResponse.Result.Regions.Region"));
		regions.setRegionEnName(context.stringValue("QueryTopologyResponse.Result.Regions.RegionEnName"));
		regions.setRegionCnName(context.stringValue("QueryTopologyResponse.Result.Regions.RegionCnName"));

		Clusters clusters = new Clusters();
		clusters.setCluster(context.stringValue("QueryTopologyResponse.Result.Regions.Clusters.Cluster"));
		clusters.setProductLine(context.stringValue("QueryTopologyResponse.Result.Regions.Clusters.ProductLine"));
		clusters.setProductClass(context.stringValue("QueryTopologyResponse.Result.Regions.Clusters.ProductClass"));
		clusters.setNetCode(context.stringValue("QueryTopologyResponse.Result.Regions.Clusters.NetCode"));
		clusters.setBusiness(context.stringValue("QueryTopologyResponse.Result.Regions.Clusters.Business"));
		clusters.setMachineRoom(context.stringValue("QueryTopologyResponse.Result.Regions.Clusters.MachineRoom"));
		clusters.setNetArch(context.stringValue("QueryTopologyResponse.Result.Regions.Clusters.NetArch"));
		regions.setClusters(clusters);
		result.setRegions(regions);
		queryTopologyResponse.setResult(result);
	 
	 	return queryTopologyResponse;
	}
}