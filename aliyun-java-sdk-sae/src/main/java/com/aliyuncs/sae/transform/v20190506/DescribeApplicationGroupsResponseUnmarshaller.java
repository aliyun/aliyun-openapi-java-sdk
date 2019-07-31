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

import com.aliyuncs.sae.model.v20190506.DescribeApplicationGroupsResponse;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationGroupsResponse.ApplicationGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationGroupsResponseUnmarshaller {

	public static DescribeApplicationGroupsResponse unmarshall(DescribeApplicationGroupsResponse describeApplicationGroupsResponse, UnmarshallerContext _ctx) {
		
		describeApplicationGroupsResponse.setRequestId(_ctx.stringValue("DescribeApplicationGroupsResponse.RequestId"));
		describeApplicationGroupsResponse.setCode(_ctx.stringValue("DescribeApplicationGroupsResponse.Code"));
		describeApplicationGroupsResponse.setMessage(_ctx.stringValue("DescribeApplicationGroupsResponse.Message"));
		describeApplicationGroupsResponse.setTraceId(_ctx.stringValue("DescribeApplicationGroupsResponse.TraceId"));
		describeApplicationGroupsResponse.setSuccess(_ctx.booleanValue("DescribeApplicationGroupsResponse.Success"));
		describeApplicationGroupsResponse.setErrorCode(_ctx.stringValue("DescribeApplicationGroupsResponse.ErrorCode"));

		List<ApplicationGroup> data = new ArrayList<ApplicationGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationGroupsResponse.Data.Length"); i++) {
			ApplicationGroup applicationGroup = new ApplicationGroup();
			applicationGroup.setGroupId(_ctx.stringValue("DescribeApplicationGroupsResponse.Data["+ i +"].GroupId"));
			applicationGroup.setGroupName(_ctx.stringValue("DescribeApplicationGroupsResponse.Data["+ i +"].GroupName"));
			applicationGroup.setGroupType(_ctx.integerValue("DescribeApplicationGroupsResponse.Data["+ i +"].GroupType"));
			applicationGroup.setPackageType(_ctx.stringValue("DescribeApplicationGroupsResponse.Data["+ i +"].PackageType"));
			applicationGroup.setPackageVersion(_ctx.stringValue("DescribeApplicationGroupsResponse.Data["+ i +"].PackageVersion"));
			applicationGroup.setImageUrl(_ctx.stringValue("DescribeApplicationGroupsResponse.Data["+ i +"].ImageUrl"));
			applicationGroup.setPackageUrl(_ctx.stringValue("DescribeApplicationGroupsResponse.Data["+ i +"].PackageUrl"));
			applicationGroup.setJdk(_ctx.stringValue("DescribeApplicationGroupsResponse.Data["+ i +"].Jdk"));
			applicationGroup.setWebContainer(_ctx.stringValue("DescribeApplicationGroupsResponse.Data["+ i +"].WebContainer"));
			applicationGroup.setEdasContainerVersion(_ctx.stringValue("DescribeApplicationGroupsResponse.Data["+ i +"].EdasContainerVersion"));
			applicationGroup.setReplicas(_ctx.integerValue("DescribeApplicationGroupsResponse.Data["+ i +"].Replicas"));
			applicationGroup.setRunningInstances(_ctx.integerValue("DescribeApplicationGroupsResponse.Data["+ i +"].RunningInstances"));

			data.add(applicationGroup);
		}
		describeApplicationGroupsResponse.setData(data);
	 
	 	return describeApplicationGroupsResponse;
	}
}