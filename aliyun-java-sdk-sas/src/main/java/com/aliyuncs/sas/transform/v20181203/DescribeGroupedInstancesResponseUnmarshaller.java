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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeGroupedInstancesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeGroupedInstancesResponse.Instance;
import com.aliyuncs.sas.model.v20181203.DescribeGroupedInstancesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupedInstancesResponseUnmarshaller {

	public static DescribeGroupedInstancesResponse unmarshall(DescribeGroupedInstancesResponse describeGroupedInstancesResponse, UnmarshallerContext _ctx) {
		
		describeGroupedInstancesResponse.setRequestId(_ctx.stringValue("DescribeGroupedInstancesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeGroupedInstancesResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeGroupedInstancesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeGroupedInstancesResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeGroupedInstancesResponse.PageInfo.CurrentPage"));
		describeGroupedInstancesResponse.setPageInfo(pageInfo);

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupedInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setUnProtectedInstanceCount(_ctx.stringValue("DescribeGroupedInstancesResponse.Instances["+ i +"].UnProtectedInstanceCount"));
			instance.setFieldAliasName(_ctx.stringValue("DescribeGroupedInstancesResponse.Instances["+ i +"].FieldAliasName"));
			instance.setGroupFlag(_ctx.integerValue("DescribeGroupedInstancesResponse.Instances["+ i +"].GroupFlag"));
			instance.setFieldId(_ctx.longValue("DescribeGroupedInstancesResponse.Instances["+ i +"].FieldId"));
			instance.setRiskInstanceCount(_ctx.stringValue("DescribeGroupedInstancesResponse.Instances["+ i +"].RiskInstanceCount"));
			instance.setInstanceCount(_ctx.stringValue("DescribeGroupedInstancesResponse.Instances["+ i +"].InstanceCount"));
			instance.setAsapVulInstanceCount(_ctx.longValue("DescribeGroupedInstancesResponse.Instances["+ i +"].AsapVulInstanceCount"));

			List<String> groupPath = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGroupedInstancesResponse.Instances["+ i +"].GroupPath.Length"); j++) {
				groupPath.add(_ctx.stringValue("DescribeGroupedInstancesResponse.Instances["+ i +"].GroupPath["+ j +"]"));
			}
			instance.setGroupPath(groupPath);

			instances.add(instance);
		}
		describeGroupedInstancesResponse.setInstances(instances);
	 
	 	return describeGroupedInstancesResponse;
	}
}