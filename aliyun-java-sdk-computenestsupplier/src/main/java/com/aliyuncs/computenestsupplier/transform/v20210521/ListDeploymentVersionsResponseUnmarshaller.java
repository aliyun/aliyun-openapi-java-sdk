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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ListDeploymentVersionsResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ListDeploymentVersionsResponse.DeploymentVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeploymentVersionsResponseUnmarshaller {

	public static ListDeploymentVersionsResponse unmarshall(ListDeploymentVersionsResponse listDeploymentVersionsResponse, UnmarshallerContext _ctx) {
		
		listDeploymentVersionsResponse.setRequestId(_ctx.stringValue("ListDeploymentVersionsResponse.RequestId"));
		listDeploymentVersionsResponse.setTotalCount(_ctx.integerValue("ListDeploymentVersionsResponse.TotalCount"));
		listDeploymentVersionsResponse.setNextToken(_ctx.stringValue("ListDeploymentVersionsResponse.NextToken"));
		listDeploymentVersionsResponse.setMaxResults(_ctx.integerValue("ListDeploymentVersionsResponse.MaxResults"));

		List<DeploymentVersion> deploymentVersions = new ArrayList<DeploymentVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListDeploymentVersionsResponse.DeploymentVersions.Length"); i++) {
			DeploymentVersion deploymentVersion = new DeploymentVersion();
			deploymentVersion.setDeploymentId(_ctx.stringValue("ListDeploymentVersionsResponse.DeploymentVersions["+ i +"].DeploymentId"));
			deploymentVersion.setVersion(_ctx.stringValue("ListDeploymentVersionsResponse.DeploymentVersions["+ i +"].Version"));
			deploymentVersion.setDeployMetadata(_ctx.stringValue("ListDeploymentVersionsResponse.DeploymentVersions["+ i +"].DeployMetadata"));
			deploymentVersion.setServiceId(_ctx.stringValue("ListDeploymentVersionsResponse.DeploymentVersions["+ i +"].ServiceId"));
			deploymentVersion.setIsDefault(_ctx.booleanValue("ListDeploymentVersionsResponse.DeploymentVersions["+ i +"].IsDefault"));

			deploymentVersions.add(deploymentVersion);
		}
		listDeploymentVersionsResponse.setDeploymentVersions(deploymentVersions);
	 
	 	return listDeploymentVersionsResponse;
	}
}