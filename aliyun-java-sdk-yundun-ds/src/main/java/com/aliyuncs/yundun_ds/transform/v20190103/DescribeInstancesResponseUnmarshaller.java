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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeInstancesResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext context) {
		
		describeInstancesResponse.setRequestId(context.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setPageSize(context.integerValue("DescribeInstancesResponse.PageSize"));
		describeInstancesResponse.setCurrentPage(context.integerValue("DescribeInstancesResponse.CurrentPage"));
		describeInstancesResponse.setTotalCount(context.integerValue("DescribeInstancesResponse.TotalCount"));

		List<Instance> items = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("DescribeInstancesResponse.Items.Length"); i++) {
			Instance instance = new Instance();
			instance.setId(context.longValue("DescribeInstancesResponse.Items["+ i +"].Id"));
			instance.setName(context.stringValue("DescribeInstancesResponse.Items["+ i +"].Name"));
			instance.setOwner(context.stringValue("DescribeInstancesResponse.Items["+ i +"].Owner"));
			instance.setCreationTime(context.longValue("DescribeInstancesResponse.Items["+ i +"].CreationTime"));
			instance.setProductId(context.stringValue("DescribeInstancesResponse.Items["+ i +"].ProductId"));
			instance.setProductCode(context.stringValue("DescribeInstancesResponse.Items["+ i +"].ProductCode"));
			instance.setProtection(context.booleanValue("DescribeInstancesResponse.Items["+ i +"].Protection"));
			instance.setLabelsec(context.integerValue("DescribeInstancesResponse.Items["+ i +"].Labelsec"));
			instance.setOdpsRiskLevelName(context.stringValue("DescribeInstancesResponse.Items["+ i +"].OdpsRiskLevelName"));
			instance.setSensitive(context.booleanValue("DescribeInstancesResponse.Items["+ i +"].Sensitive"));
			instance.setRiskLevelId(context.longValue("DescribeInstancesResponse.Items["+ i +"].RiskLevelId"));
			instance.setRiskLevelName(context.stringValue("DescribeInstancesResponse.Items["+ i +"].RiskLevelName"));
			instance.setRuleName(context.stringValue("DescribeInstancesResponse.Items["+ i +"].RuleName"));
			instance.setDepartName(context.stringValue("DescribeInstancesResponse.Items["+ i +"].DepartName"));
			instance.setTotalCount(context.integerValue("DescribeInstancesResponse.Items["+ i +"].TotalCount"));
			instance.setSensitiveCount(context.integerValue("DescribeInstancesResponse.Items["+ i +"].SensitiveCount"));
			instance.setAcl(context.stringValue("DescribeInstancesResponse.Items["+ i +"].Acl"));

			items.add(instance);
		}
		describeInstancesResponse.setItems(items);
	 
	 	return describeInstancesResponse;
	}
}