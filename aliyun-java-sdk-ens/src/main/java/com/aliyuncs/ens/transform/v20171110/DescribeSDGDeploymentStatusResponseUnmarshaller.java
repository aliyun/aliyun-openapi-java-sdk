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

import com.aliyuncs.ens.model.v20171110.DescribeSDGDeploymentStatusResponse;
import com.aliyuncs.ens.model.v20171110.DescribeSDGDeploymentStatusResponse.DeploymentStatusItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSDGDeploymentStatusResponseUnmarshaller {

	public static DescribeSDGDeploymentStatusResponse unmarshall(DescribeSDGDeploymentStatusResponse describeSDGDeploymentStatusResponse, UnmarshallerContext _ctx) {
		
		describeSDGDeploymentStatusResponse.setRequestId(_ctx.stringValue("DescribeSDGDeploymentStatusResponse.RequestId"));
		describeSDGDeploymentStatusResponse.setPageNumber(_ctx.longValue("DescribeSDGDeploymentStatusResponse.PageNumber"));
		describeSDGDeploymentStatusResponse.setPageSize(_ctx.longValue("DescribeSDGDeploymentStatusResponse.PageSize"));
		describeSDGDeploymentStatusResponse.setTotalCount(_ctx.longValue("DescribeSDGDeploymentStatusResponse.TotalCount"));

		List<DeploymentStatusItem> deploymentStatus = new ArrayList<DeploymentStatusItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSDGDeploymentStatusResponse.DeploymentStatus.Length"); i++) {
			DeploymentStatusItem deploymentStatusItem = new DeploymentStatusItem();
			deploymentStatusItem.setInstanceId(_ctx.stringValue("DescribeSDGDeploymentStatusResponse.DeploymentStatus["+ i +"].InstanceId"));
			deploymentStatusItem.setMountType(_ctx.stringValue("DescribeSDGDeploymentStatusResponse.DeploymentStatus["+ i +"].MountType"));
			deploymentStatusItem.setRegionId(_ctx.stringValue("DescribeSDGDeploymentStatusResponse.DeploymentStatus["+ i +"].RegionId"));
			deploymentStatusItem.setStatus(_ctx.stringValue("DescribeSDGDeploymentStatusResponse.DeploymentStatus["+ i +"].Status"));
			deploymentStatusItem.setPhase(_ctx.stringValue("DescribeSDGDeploymentStatusResponse.DeploymentStatus["+ i +"].Phase"));
			deploymentStatusItem.setUpdateTime(_ctx.stringValue("DescribeSDGDeploymentStatusResponse.DeploymentStatus["+ i +"].UpdateTime"));

			deploymentStatus.add(deploymentStatusItem);
		}
		describeSDGDeploymentStatusResponse.setDeploymentStatus(deploymentStatus);
	 
	 	return describeSDGDeploymentStatusResponse;
	}
}