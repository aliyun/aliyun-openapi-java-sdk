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

import com.aliyuncs.ecs.model.v20140526.DescribeElasticityAssuranceInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeElasticityAssuranceInstancesResponse.InstanceIdSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeElasticityAssuranceInstancesResponseUnmarshaller {

	public static DescribeElasticityAssuranceInstancesResponse unmarshall(DescribeElasticityAssuranceInstancesResponse describeElasticityAssuranceInstancesResponse, UnmarshallerContext _ctx) {
		
		describeElasticityAssuranceInstancesResponse.setRequestId(_ctx.stringValue("DescribeElasticityAssuranceInstancesResponse.RequestId"));
		describeElasticityAssuranceInstancesResponse.setNextToken(_ctx.stringValue("DescribeElasticityAssuranceInstancesResponse.NextToken"));
		describeElasticityAssuranceInstancesResponse.setMaxResults(_ctx.integerValue("DescribeElasticityAssuranceInstancesResponse.MaxResults"));
		describeElasticityAssuranceInstancesResponse.setTotalCount(_ctx.integerValue("DescribeElasticityAssuranceInstancesResponse.TotalCount"));

		List<InstanceIdSet> elasticityAssuranceItem = new ArrayList<InstanceIdSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeElasticityAssuranceInstancesResponse.ElasticityAssuranceItem.Length"); i++) {
			InstanceIdSet instanceIdSet = new InstanceIdSet();
			instanceIdSet.setInstanceId(_ctx.stringValue("DescribeElasticityAssuranceInstancesResponse.ElasticityAssuranceItem["+ i +"].InstanceId"));

			elasticityAssuranceItem.add(instanceIdSet);
		}
		describeElasticityAssuranceInstancesResponse.setElasticityAssuranceItem(elasticityAssuranceItem);
	 
	 	return describeElasticityAssuranceInstancesResponse;
	}
}