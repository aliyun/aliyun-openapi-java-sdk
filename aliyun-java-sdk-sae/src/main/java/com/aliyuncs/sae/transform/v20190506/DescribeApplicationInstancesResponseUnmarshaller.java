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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeApplicationInstancesResponse;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationInstancesResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationInstancesResponse.Data.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationInstancesResponseUnmarshaller {

	public static DescribeApplicationInstancesResponse unmarshall(DescribeApplicationInstancesResponse describeApplicationInstancesResponse, UnmarshallerContext _ctx) {
		
		describeApplicationInstancesResponse.setRequestId(_ctx.stringValue("DescribeApplicationInstancesResponse.RequestId"));
		describeApplicationInstancesResponse.setMessage(_ctx.stringValue("DescribeApplicationInstancesResponse.Message"));
		describeApplicationInstancesResponse.setTraceId(_ctx.stringValue("DescribeApplicationInstancesResponse.TraceId"));
		describeApplicationInstancesResponse.setErrorCode(_ctx.stringValue("DescribeApplicationInstancesResponse.ErrorCode"));
		describeApplicationInstancesResponse.setCode(_ctx.stringValue("DescribeApplicationInstancesResponse.Code"));
		describeApplicationInstancesResponse.setSuccess(_ctx.booleanValue("DescribeApplicationInstancesResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("DescribeApplicationInstancesResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("DescribeApplicationInstancesResponse.Data.CurrentPage"));
		data.setTotalSize(_ctx.integerValue("DescribeApplicationInstancesResponse.Data.TotalSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationInstancesResponse.Data.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceContainerIp(_ctx.stringValue("DescribeApplicationInstancesResponse.Data.Instances["+ i +"].InstanceContainerIp"));
			instance.setInstanceHealthStatus(_ctx.stringValue("DescribeApplicationInstancesResponse.Data.Instances["+ i +"].InstanceHealthStatus"));
			instance.setInstanceId(_ctx.stringValue("DescribeApplicationInstancesResponse.Data.Instances["+ i +"].InstanceId"));
			instance.setVSwitchId(_ctx.stringValue("DescribeApplicationInstancesResponse.Data.Instances["+ i +"].VSwitchId"));
			instance.setImageUrl(_ctx.stringValue("DescribeApplicationInstancesResponse.Data.Instances["+ i +"].ImageUrl"));
			instance.setInstanceContainerRestarts(_ctx.longValue("DescribeApplicationInstancesResponse.Data.Instances["+ i +"].InstanceContainerRestarts"));
			instance.setPackageVersion(_ctx.stringValue("DescribeApplicationInstancesResponse.Data.Instances["+ i +"].PackageVersion"));
			instance.setInstanceContainerStatus(_ctx.stringValue("DescribeApplicationInstancesResponse.Data.Instances["+ i +"].InstanceContainerStatus"));
			instance.setCreateTimeStamp(_ctx.longValue("DescribeApplicationInstancesResponse.Data.Instances["+ i +"].CreateTimeStamp"));
			instance.setGroupId(_ctx.stringValue("DescribeApplicationInstancesResponse.Data.Instances["+ i +"].GroupId"));

			instances.add(instance);
		}
		data.setInstances(instances);
		describeApplicationInstancesResponse.setData(data);
	 
	 	return describeApplicationInstancesResponse;
	}
}