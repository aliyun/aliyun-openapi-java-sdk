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

import com.aliyuncs.ecs.model.v20140526.DescribeElasticityAssurancesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeElasticityAssurancesResponse.ElasticityAssuranceItem;
import com.aliyuncs.ecs.model.v20140526.DescribeElasticityAssurancesResponse.ElasticityAssuranceItem.AllocatedResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeElasticityAssurancesResponseUnmarshaller {

	public static DescribeElasticityAssurancesResponse unmarshall(DescribeElasticityAssurancesResponse describeElasticityAssurancesResponse, UnmarshallerContext _ctx) {
		
		describeElasticityAssurancesResponse.setRequestId(_ctx.stringValue("DescribeElasticityAssurancesResponse.RequestId"));
		describeElasticityAssurancesResponse.setNextToken(_ctx.stringValue("DescribeElasticityAssurancesResponse.NextToken"));
		describeElasticityAssurancesResponse.setMaxResults(_ctx.integerValue("DescribeElasticityAssurancesResponse.MaxResults"));
		describeElasticityAssurancesResponse.setTotalCount(_ctx.integerValue("DescribeElasticityAssurancesResponse.TotalCount"));

		List<ElasticityAssuranceItem> elasticityAssuranceSet = new ArrayList<ElasticityAssuranceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet.Length"); i++) {
			ElasticityAssuranceItem elasticityAssuranceItem = new ElasticityAssuranceItem();
			elasticityAssuranceItem.setPrivatePoolOptionsId(_ctx.stringValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].PrivatePoolOptionsId"));
			elasticityAssuranceItem.setPrivatePoolOptionsName(_ctx.stringValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].PrivatePoolOptionsName"));
			elasticityAssuranceItem.setDescription(_ctx.stringValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].Description"));
			elasticityAssuranceItem.setRegionId(_ctx.stringValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].RegionId"));
			elasticityAssuranceItem.setPrivatePoolOptionsMatchCriteria(_ctx.stringValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].PrivatePoolOptionsMatchCriteria"));
			elasticityAssuranceItem.setUsedAssuranceTimes(_ctx.integerValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].UsedAssuranceTimes"));
			elasticityAssuranceItem.setTotalAssuranceTimes(_ctx.stringValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].TotalAssuranceTimes"));
			elasticityAssuranceItem.setStatus(_ctx.stringValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].Status"));
			elasticityAssuranceItem.setStartTime(_ctx.stringValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].StartTime"));
			elasticityAssuranceItem.setEndTime(_ctx.stringValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].EndTime"));
			elasticityAssuranceItem.setLatestStartTime(_ctx.stringValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].LatestStartTime"));

			List<AllocatedResource> allocatedResources = new ArrayList<AllocatedResource>();
			for (int j = 0; j < _ctx.lengthValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].AllocatedResources.Length"); j++) {
				AllocatedResource allocatedResource = new AllocatedResource();
				allocatedResource.setZoneId(_ctx.stringValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].AllocatedResources["+ j +"].zoneId"));
				allocatedResource.setInstanceType(_ctx.stringValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].AllocatedResources["+ j +"].InstanceType"));
				allocatedResource.setTotalAmount(_ctx.integerValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].AllocatedResources["+ j +"].TotalAmount"));
				allocatedResource.setUsedAmount(_ctx.integerValue("DescribeElasticityAssurancesResponse.ElasticityAssuranceSet["+ i +"].AllocatedResources["+ j +"].UsedAmount"));

				allocatedResources.add(allocatedResource);
			}
			elasticityAssuranceItem.setAllocatedResources(allocatedResources);

			elasticityAssuranceSet.add(elasticityAssuranceItem);
		}
		describeElasticityAssurancesResponse.setElasticityAssuranceSet(elasticityAssuranceSet);
	 
	 	return describeElasticityAssurancesResponse;
	}
}