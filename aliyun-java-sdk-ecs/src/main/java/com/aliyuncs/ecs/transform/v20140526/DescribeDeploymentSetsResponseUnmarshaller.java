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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetsResponse.DeploymentSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeploymentSetsResponseUnmarshaller {

	public static DescribeDeploymentSetsResponse unmarshall(DescribeDeploymentSetsResponse describeDeploymentSetsResponse, UnmarshallerContext context) {
		
		describeDeploymentSetsResponse.setRequestId(context.stringValue("DescribeDeploymentSetsResponse.RequestId"));
		describeDeploymentSetsResponse.setRegionId(context.stringValue("DescribeDeploymentSetsResponse.RegionId"));
		describeDeploymentSetsResponse.setTotalCount(context.integerValue("DescribeDeploymentSetsResponse.TotalCount"));
		describeDeploymentSetsResponse.setPageNumber(context.integerValue("DescribeDeploymentSetsResponse.PageNumber"));
		describeDeploymentSetsResponse.setPageSize(context.integerValue("DescribeDeploymentSetsResponse.PageSize"));

		List<DeploymentSet> deploymentSets = new ArrayList<DeploymentSet>();
		for (int i = 0; i < context.lengthValue("DescribeDeploymentSetsResponse.DeploymentSets.Length"); i++) {
			DeploymentSet deploymentSet = new DeploymentSet();
			deploymentSet.setDeploymentSetId(context.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].DeploymentSetId"));
			deploymentSet.setDeploymentSetDescription(context.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].DeploymentSetDescription"));
			deploymentSet.setDeploymentSetName(context.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].DeploymentSetName"));
			deploymentSet.setStrategy(context.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].Strategy"));
			deploymentSet.setDomain(context.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].Domain"));
			deploymentSet.setGranularity(context.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].Granularity"));
			deploymentSet.setInstanceAmount(context.integerValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].InstanceAmount"));
			deploymentSet.setCreationTime(context.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].CreationTime"));

			deploymentSets.add(deploymentSet);
		}
		describeDeploymentSetsResponse.setDeploymentSets(deploymentSets);
	 
	 	return describeDeploymentSetsResponse;
	}
}