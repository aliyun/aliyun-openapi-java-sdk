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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DescribeOrganizationSpecsResponse;
import com.aliyuncs.baas.model.v20180731.DescribeOrganizationSpecsResponse.ClusterSpec;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrganizationSpecsResponseUnmarshaller {

	public static DescribeOrganizationSpecsResponse unmarshall(DescribeOrganizationSpecsResponse describeOrganizationSpecsResponse, UnmarshallerContext context) {
		
		describeOrganizationSpecsResponse.setRequestId(context.stringValue("DescribeOrganizationSpecsResponse.RequestId"));
		describeOrganizationSpecsResponse.setSuccess(context.booleanValue("DescribeOrganizationSpecsResponse.Success"));
		describeOrganizationSpecsResponse.setErrorCode(context.integerValue("DescribeOrganizationSpecsResponse.ErrorCode"));

		List<ClusterSpec> result = new ArrayList<ClusterSpec>();
		for (int i = 0; i < context.lengthValue("DescribeOrganizationSpecsResponse.Result.Length"); i++) {
			ClusterSpec clusterSpec = new ClusterSpec();
			clusterSpec.setName(context.stringValue("DescribeOrganizationSpecsResponse.Result["+ i +"].Name"));
			clusterSpec.setTitle(context.stringValue("DescribeOrganizationSpecsResponse.Result["+ i +"].Title"));
			clusterSpec.setNumOfNodes(context.integerValue("DescribeOrganizationSpecsResponse.Result["+ i +"].NumOfNodes"));
			clusterSpec.setMasterDescription(context.stringValue("DescribeOrganizationSpecsResponse.Result["+ i +"].MasterDescription"));
			clusterSpec.setWorkerDescription(context.stringValue("DescribeOrganizationSpecsResponse.Result["+ i +"].WorkerDescription"));
			clusterSpec.setEnable(context.booleanValue("DescribeOrganizationSpecsResponse.Result["+ i +"].Enable"));

			result.add(clusterSpec);
		}
		describeOrganizationSpecsResponse.setResult(result);
	 
	 	return describeOrganizationSpecsResponse;
	}
}