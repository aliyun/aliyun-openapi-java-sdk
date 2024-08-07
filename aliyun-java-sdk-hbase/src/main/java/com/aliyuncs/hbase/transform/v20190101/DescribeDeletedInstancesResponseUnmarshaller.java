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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeDeletedInstancesResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeDeletedInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeletedInstancesResponseUnmarshaller {

	public static DescribeDeletedInstancesResponse unmarshall(DescribeDeletedInstancesResponse describeDeletedInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDeletedInstancesResponse.setRequestId(_ctx.stringValue("DescribeDeletedInstancesResponse.RequestId"));
		describeDeletedInstancesResponse.setPageSize(_ctx.integerValue("DescribeDeletedInstancesResponse.PageSize"));
		describeDeletedInstancesResponse.setPageNumber(_ctx.integerValue("DescribeDeletedInstancesResponse.PageNumber"));
		describeDeletedInstancesResponse.setTotalCount(_ctx.longValue("DescribeDeletedInstancesResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeletedInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setStatus(_ctx.stringValue("DescribeDeletedInstancesResponse.Instances["+ i +"].Status"));
			instance.setInstanceId(_ctx.stringValue("DescribeDeletedInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setRegionId(_ctx.stringValue("DescribeDeletedInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setParentId(_ctx.stringValue("DescribeDeletedInstancesResponse.Instances["+ i +"].ParentId"));
			instance.setClusterType(_ctx.stringValue("DescribeDeletedInstancesResponse.Instances["+ i +"].ClusterType"));
			instance.setInstanceName(_ctx.stringValue("DescribeDeletedInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setZoneId(_ctx.stringValue("DescribeDeletedInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setDeleteTime(_ctx.stringValue("DescribeDeletedInstancesResponse.Instances["+ i +"].DeleteTime"));
			instance.setModuleStackVersion(_ctx.stringValue("DescribeDeletedInstancesResponse.Instances["+ i +"].ModuleStackVersion"));
			instance.setMajorVersion(_ctx.stringValue("DescribeDeletedInstancesResponse.Instances["+ i +"].MajorVersion"));
			instance.setEngine(_ctx.stringValue("DescribeDeletedInstancesResponse.Instances["+ i +"].Engine"));
			instance.setCreatedTime(_ctx.stringValue("DescribeDeletedInstancesResponse.Instances["+ i +"].CreatedTime"));

			instances.add(instance);
		}
		describeDeletedInstancesResponse.setInstances(instances);
	 
	 	return describeDeletedInstancesResponse;
	}
}