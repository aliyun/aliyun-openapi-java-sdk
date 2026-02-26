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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeInstanceSDGStatusResponse;
import com.aliyuncs.ens.model.v20171110.DescribeInstanceSDGStatusResponse.DeploymentStatusItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceSDGStatusResponseUnmarshaller {

	public static DescribeInstanceSDGStatusResponse unmarshall(DescribeInstanceSDGStatusResponse describeInstanceSDGStatusResponse, UnmarshallerContext _ctx) {
		
		describeInstanceSDGStatusResponse.setRequestId(_ctx.stringValue("DescribeInstanceSDGStatusResponse.RequestId"));
		describeInstanceSDGStatusResponse.setPageNumber(_ctx.longValue("DescribeInstanceSDGStatusResponse.PageNumber"));
		describeInstanceSDGStatusResponse.setPageSize(_ctx.stringValue("DescribeInstanceSDGStatusResponse.PageSize"));
		describeInstanceSDGStatusResponse.setTotalCount(_ctx.stringValue("DescribeInstanceSDGStatusResponse.TotalCount"));

		List<DeploymentStatusItem> deploymentStatus = new ArrayList<DeploymentStatusItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceSDGStatusResponse.DeploymentStatus.Length"); i++) {
			DeploymentStatusItem deploymentStatusItem = new DeploymentStatusItem();
			deploymentStatusItem.setInstanceId(_ctx.stringValue("DescribeInstanceSDGStatusResponse.DeploymentStatus["+ i +"].InstanceId"));
			deploymentStatusItem.setSDGId(_ctx.stringValue("DescribeInstanceSDGStatusResponse.DeploymentStatus["+ i +"].SDGId"));
			deploymentStatusItem.setMountType(_ctx.stringValue("DescribeInstanceSDGStatusResponse.DeploymentStatus["+ i +"].MountType"));
			deploymentStatusItem.setEnsRegionId(_ctx.stringValue("DescribeInstanceSDGStatusResponse.DeploymentStatus["+ i +"].EnsRegionId"));
			deploymentStatusItem.setStatus(_ctx.stringValue("DescribeInstanceSDGStatusResponse.DeploymentStatus["+ i +"].Status"));
			deploymentStatusItem.setPhase(_ctx.stringValue("DescribeInstanceSDGStatusResponse.DeploymentStatus["+ i +"].Phase"));
			deploymentStatusItem.setUpdateTime(_ctx.stringValue("DescribeInstanceSDGStatusResponse.DeploymentStatus["+ i +"].UpdateTime"));

			deploymentStatus.add(deploymentStatusItem);
		}
		describeInstanceSDGStatusResponse.setDeploymentStatus(deploymentStatus);
	 
	 	return describeInstanceSDGStatusResponse;
	}
}