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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCDeploymentSetsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCDeploymentSetsResponse.DeploymentSet;
import com.aliyuncs.rds.model.v20140815.DescribeRCDeploymentSetsResponse.DeploymentSet.Capacity;
import com.aliyuncs.rds.model.v20140815.DescribeRCDeploymentSetsResponse.DeploymentSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCDeploymentSetsResponseUnmarshaller {

	public static DescribeRCDeploymentSetsResponse unmarshall(DescribeRCDeploymentSetsResponse describeRCDeploymentSetsResponse, UnmarshallerContext _ctx) {
		
		describeRCDeploymentSetsResponse.setRequestId(_ctx.stringValue("DescribeRCDeploymentSetsResponse.RequestId"));
		describeRCDeploymentSetsResponse.setRegionId(_ctx.stringValue("DescribeRCDeploymentSetsResponse.RegionId"));
		describeRCDeploymentSetsResponse.setTotalCount(_ctx.integerValue("DescribeRCDeploymentSetsResponse.TotalCount"));
		describeRCDeploymentSetsResponse.setPageNumber(_ctx.integerValue("DescribeRCDeploymentSetsResponse.PageNumber"));
		describeRCDeploymentSetsResponse.setPageSize(_ctx.integerValue("DescribeRCDeploymentSetsResponse.PageSize"));

		List<DeploymentSet> deploymentSets = new ArrayList<DeploymentSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCDeploymentSetsResponse.DeploymentSets.Length"); i++) {
			DeploymentSet deploymentSet = new DeploymentSet();
			deploymentSet.setCreateTime(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].CreateTime"));
			deploymentSet.setDeploymentSetDescription(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].DeploymentSetDescription"));
			deploymentSet.setDeploymentSetId(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].DeploymentSetId"));
			deploymentSet.setDeploymentSetName(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].DeploymentSetName"));
			deploymentSet.setDeploymentStrategy(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].DeploymentStrategy"));
			deploymentSet.setDomain(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].Domain"));
			deploymentSet.setGranularity(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].Granularity"));
			deploymentSet.setGroupCount(_ctx.integerValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].GroupCount"));
			deploymentSet.setInstanceAmount(_ctx.integerValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].InstanceAmount"));
			deploymentSet.setStrategy(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].Strategy"));

			List<String> instanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].InstanceIds.Length"); j++) {
				instanceIds.add(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].InstanceIds["+ j +"]"));
			}
			deploymentSet.setInstanceIds(instanceIds);

			List<Capacity> capacities = new ArrayList<Capacity>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].Capacities.Length"); j++) {
				Capacity capacity = new Capacity();
				capacity.setAvailableAmount(_ctx.integerValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].Capacities["+ j +"].AvailableAmount"));
				capacity.setUsedAmount(_ctx.integerValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].Capacities["+ j +"].UsedAmount"));
				capacity.setZoneId(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].Capacities["+ j +"].ZoneId"));

				capacities.add(capacity);
			}
			deploymentSet.setCapacities(capacities);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setResourceId(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].Tags["+ j +"].ResourceId"));
				tag.setResourceType(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].Tags["+ j +"].ResourceType"));
				tag.setTagKey(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeRCDeploymentSetsResponse.DeploymentSets["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			deploymentSet.setTags(tags);

			deploymentSets.add(deploymentSet);
		}
		describeRCDeploymentSetsResponse.setDeploymentSets(deploymentSets);
	 
	 	return describeRCDeploymentSetsResponse;
	}
}