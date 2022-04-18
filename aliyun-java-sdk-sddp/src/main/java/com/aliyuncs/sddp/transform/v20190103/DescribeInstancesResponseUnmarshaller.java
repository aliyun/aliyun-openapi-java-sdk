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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeInstancesResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext _ctx) {
		
		describeInstancesResponse.setRequestId(_ctx.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setCurrentPage(_ctx.integerValue("DescribeInstancesResponse.CurrentPage"));
		describeInstancesResponse.setPageSize(_ctx.integerValue("DescribeInstancesResponse.PageSize"));
		describeInstancesResponse.setTotalCount(_ctx.integerValue("DescribeInstancesResponse.TotalCount"));

		List<Instance> items = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesResponse.Items.Length"); i++) {
			Instance instance = new Instance();
			instance.setCreationTime(_ctx.longValue("DescribeInstancesResponse.Items["+ i +"].CreationTime"));
			instance.setAcl(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].Acl"));
			instance.setLastFinishTime(_ctx.longValue("DescribeInstancesResponse.Items["+ i +"].LastFinishTime"));
			instance.setOwner(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].Owner"));
			instance.setCountDetails(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].CountDetails"));
			instance.setFileCountDetails(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].FileCountDetails"));
			instance.setTenantName(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].TenantName"));
			instance.setProtection(_ctx.booleanValue("DescribeInstancesResponse.Items["+ i +"].Protection"));
			instance.setDepartName(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].DepartName"));
			instance.setLabelsec(_ctx.booleanValue("DescribeInstancesResponse.Items["+ i +"].Labelsec"));
			instance.setRiskScore(_ctx.floatValue("DescribeInstancesResponse.Items["+ i +"].RiskScore"));
			instance.setRiskLevelId(_ctx.longValue("DescribeInstancesResponse.Items["+ i +"].RiskLevelId"));
			instance.setS3Count(_ctx.integerValue("DescribeInstancesResponse.Items["+ i +"].S3Count"));
			instance.setS1Count(_ctx.integerValue("DescribeInstancesResponse.Items["+ i +"].S1Count"));
			instance.setProductId(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].ProductId"));
			instance.setName(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].Name"));
			instance.setS2Count(_ctx.integerValue("DescribeInstancesResponse.Items["+ i +"].S2Count"));
			instance.setEngineType(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].EngineType"));
			instance.setTotalCount(_ctx.integerValue("DescribeInstancesResponse.Items["+ i +"].TotalCount"));
			instance.setInstanceDescription(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].InstanceDescription"));
			instance.setRuleName(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].RuleName"));
			instance.setRegionId(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].RegionId"));
			instance.setSensitive(_ctx.booleanValue("DescribeInstancesResponse.Items["+ i +"].Sensitive"));
			instance.setSensLevelName(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].SensLevelName"));
			instance.setRegionName(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].RegionName"));
			instance.setLastRiskScore(_ctx.floatValue("DescribeInstancesResponse.Items["+ i +"].LastRiskScore"));
			instance.setRiskLevelName(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].RiskLevelName"));
			instance.setOdpsRiskLevelName(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].OdpsRiskLevelName"));
			instance.setSensitiveCount(_ctx.integerValue("DescribeInstancesResponse.Items["+ i +"].SensitiveCount"));
			instance.setId(_ctx.longValue("DescribeInstancesResponse.Items["+ i +"].Id"));
			instance.setProductCode(_ctx.stringValue("DescribeInstancesResponse.Items["+ i +"].ProductCode"));

			items.add(instance);
		}
		describeInstancesResponse.setItems(items);
	 
	 	return describeInstancesResponse;
	}
}