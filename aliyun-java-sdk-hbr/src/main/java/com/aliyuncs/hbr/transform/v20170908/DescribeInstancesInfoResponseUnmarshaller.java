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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeInstancesInfoResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeInstancesInfoResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesInfoResponseUnmarshaller {

	public static DescribeInstancesInfoResponse unmarshall(DescribeInstancesInfoResponse describeInstancesInfoResponse, UnmarshallerContext _ctx) {
		
		describeInstancesInfoResponse.setRequestId(_ctx.stringValue("DescribeInstancesInfoResponse.RequestId"));
		describeInstancesInfoResponse.setSuccess(_ctx.booleanValue("DescribeInstancesInfoResponse.Success"));
		describeInstancesInfoResponse.setCode(_ctx.stringValue("DescribeInstancesInfoResponse.Code"));
		describeInstancesInfoResponse.setMessage(_ctx.stringValue("DescribeInstancesInfoResponse.Message"));
		describeInstancesInfoResponse.setTotalCount(_ctx.integerValue("DescribeInstancesInfoResponse.TotalCount"));
		describeInstancesInfoResponse.setPageSize(_ctx.integerValue("DescribeInstancesInfoResponse.PageSize"));
		describeInstancesInfoResponse.setPageNumber(_ctx.integerValue("DescribeInstancesInfoResponse.PageNumber"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesInfoResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("DescribeInstancesInfoResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(_ctx.stringValue("DescribeInstancesInfoResponse.Instances["+ i +"].InstanceName"));
			instance.setNetworkType(_ctx.stringValue("DescribeInstancesInfoResponse.Instances["+ i +"].NetworkType"));
			instance.setCloudAssistantStatus(_ctx.booleanValue("DescribeInstancesInfoResponse.Instances["+ i +"].CloudAssistantStatus"));
			instance.setClientStatus(_ctx.stringValue("DescribeInstancesInfoResponse.Instances["+ i +"].ClientStatus"));
			instance.setClientVersion(_ctx.stringValue("DescribeInstancesInfoResponse.Instances["+ i +"].ClientVersion"));
			instance.setVaultId(_ctx.stringValue("DescribeInstancesInfoResponse.Instances["+ i +"].VaultId"));
			instance.setInstanceStatus(_ctx.stringValue("DescribeInstancesInfoResponse.Instances["+ i +"].InstanceStatus"));
			instance.setClusterId(_ctx.stringValue("DescribeInstancesInfoResponse.Instances["+ i +"].ClusterId"));
			instance.setOsType(_ctx.stringValue("DescribeInstancesInfoResponse.Instances["+ i +"].OsType"));

			List<String> sourceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesInfoResponse.Instances["+ i +"].SourceTypes.Length"); j++) {
				sourceTypes.add(_ctx.stringValue("DescribeInstancesInfoResponse.Instances["+ i +"].SourceTypes["+ j +"]"));
			}
			instance.setSourceTypes(sourceTypes);

			instances.add(instance);
		}
		describeInstancesInfoResponse.setInstances(instances);
	 
	 	return describeInstancesInfoResponse;
	}
}