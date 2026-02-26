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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployApiTaskResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployApiTaskResponse.DeployedResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeployApiTaskResponseUnmarshaller {

	public static DescribeDeployApiTaskResponse unmarshall(DescribeDeployApiTaskResponse describeDeployApiTaskResponse, UnmarshallerContext _ctx) {
		
		describeDeployApiTaskResponse.setRequestId(_ctx.stringValue("DescribeDeployApiTaskResponse.RequestId"));

		List<DeployedResult> deployedResults = new ArrayList<DeployedResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeployApiTaskResponse.DeployedResults.Length"); i++) {
			DeployedResult deployedResult = new DeployedResult();
			deployedResult.setErrorMsg(_ctx.stringValue("DescribeDeployApiTaskResponse.DeployedResults["+ i +"].ErrorMsg"));
			deployedResult.setStageName(_ctx.stringValue("DescribeDeployApiTaskResponse.DeployedResults["+ i +"].StageName"));
			deployedResult.setGroupId(_ctx.stringValue("DescribeDeployApiTaskResponse.DeployedResults["+ i +"].GroupId"));
			deployedResult.setApiUid(_ctx.stringValue("DescribeDeployApiTaskResponse.DeployedResults["+ i +"].ApiUid"));
			deployedResult.setDeployedStatus(_ctx.stringValue("DescribeDeployApiTaskResponse.DeployedResults["+ i +"].DeployedStatus"));

			deployedResults.add(deployedResult);
		}
		describeDeployApiTaskResponse.setDeployedResults(deployedResults);
	 
	 	return describeDeployApiTaskResponse;
	}
}