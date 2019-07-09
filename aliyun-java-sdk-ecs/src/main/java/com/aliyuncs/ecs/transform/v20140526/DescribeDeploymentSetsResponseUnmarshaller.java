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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDeploymentSetsResponse.DeploymentSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeploymentSetsResponseUnmarshaller {

	public static DescribeDeploymentSetsResponse unmarshall(DescribeDeploymentSetsResponse describeDeploymentSetsResponse, UnmarshallerContext _ctx) {
		
		describeDeploymentSetsResponse.setRequestId(_ctx.stringValue("DescribeDeploymentSetsResponse.RequestId"));
		describeDeploymentSetsResponse.setRegionId(_ctx.stringValue("DescribeDeploymentSetsResponse.RegionId"));
		describeDeploymentSetsResponse.setTotalCount(_ctx.integerValue("DescribeDeploymentSetsResponse.TotalCount"));
		describeDeploymentSetsResponse.setPageNumber(_ctx.integerValue("DescribeDeploymentSetsResponse.PageNumber"));
		describeDeploymentSetsResponse.setPageSize(_ctx.integerValue("DescribeDeploymentSetsResponse.PageSize"));

		List<DeploymentSet> deploymentSets = new ArrayList<DeploymentSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeploymentSetsResponse.DeploymentSets.Length"); i++) {
			DeploymentSet deploymentSet = new DeploymentSet();
			deploymentSet.setDeploymentSetId(_ctx.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].DeploymentSetId"));
			deploymentSet.setDeploymentSetDescription(_ctx.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].DeploymentSetDescription"));
			deploymentSet.setDeploymentSetName(_ctx.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].DeploymentSetName"));
			deploymentSet.setStrategy(_ctx.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].Strategy"));
			deploymentSet.setDeploymentStrategy(_ctx.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].DeploymentStrategy"));
			deploymentSet.setDomain(_ctx.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].Domain"));
			deploymentSet.setGranularity(_ctx.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].Granularity"));
			deploymentSet.setInstanceAmount(_ctx.integerValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].InstanceAmount"));
			deploymentSet.setCreationTime(_ctx.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].CreationTime"));

			List<String> instanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].InstanceIds.Length"); j++) {
				instanceIds.add(_ctx.stringValue("DescribeDeploymentSetsResponse.DeploymentSets["+ i +"].InstanceIds["+ j +"]"));
			}
			deploymentSet.setInstanceIds(instanceIds);

			deploymentSets.add(deploymentSet);
		}
		describeDeploymentSetsResponse.setDeploymentSets(deploymentSets);
	 
	 	return describeDeploymentSetsResponse;
	}
}