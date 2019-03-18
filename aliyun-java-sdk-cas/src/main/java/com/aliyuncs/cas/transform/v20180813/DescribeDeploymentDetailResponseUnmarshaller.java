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

package com.aliyuncs.cas.transform.v20180813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20180813.DescribeDeploymentDetailResponse;
import com.aliyuncs.cas.model.v20180813.DescribeDeploymentDetailResponse.Deployment;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeploymentDetailResponseUnmarshaller {

	public static DescribeDeploymentDetailResponse unmarshall(DescribeDeploymentDetailResponse describeDeploymentDetailResponse, UnmarshallerContext context) {
		
		describeDeploymentDetailResponse.setRequestId(context.stringValue("DescribeDeploymentDetailResponse.RequestId"));

		List<Deployment> deploymentDetail = new ArrayList<Deployment>();
		for (int i = 0; i < context.lengthValue("DescribeDeploymentDetailResponse.DeploymentDetail.Length"); i++) {
			Deployment deployment = new Deployment();
			deployment.setCloudProduct(context.stringValue("DescribeDeploymentDetailResponse.DeploymentDetail["+ i +"].CloudProduct"));
			deployment.setDomain(context.stringValue("DescribeDeploymentDetailResponse.DeploymentDetail["+ i +"].Domain"));
			deployment.setRegion(context.stringValue("DescribeDeploymentDetailResponse.DeploymentDetail["+ i +"].Region"));
			deployment.setDeployTime(context.longValue("DescribeDeploymentDetailResponse.DeploymentDetail["+ i +"].DeployTime"));
			deployment.setId(context.longValue("DescribeDeploymentDetailResponse.DeploymentDetail["+ i +"].Id"));

			deploymentDetail.add(deployment);
		}
		describeDeploymentDetailResponse.setDeploymentDetail(deploymentDetail);
	 
	 	return describeDeploymentDetailResponse;
	}
}