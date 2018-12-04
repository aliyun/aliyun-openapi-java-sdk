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

import com.aliyuncs.baas.model.v20180731.DescribeConsortiumSpecsResponse;
import com.aliyuncs.baas.model.v20180731.DescribeConsortiumSpecsResponse.ClusterSpec;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsortiumSpecsResponseUnmarshaller {

	public static DescribeConsortiumSpecsResponse unmarshall(DescribeConsortiumSpecsResponse describeConsortiumSpecsResponse, UnmarshallerContext context) {
		
		describeConsortiumSpecsResponse.setRequestId(context.stringValue("DescribeConsortiumSpecsResponse.RequestId"));
		describeConsortiumSpecsResponse.setSuccess(context.booleanValue("DescribeConsortiumSpecsResponse.Success"));
		describeConsortiumSpecsResponse.setErrorCode(context.integerValue("DescribeConsortiumSpecsResponse.ErrorCode"));

		List<ClusterSpec> result = new ArrayList<ClusterSpec>();
		for (int i = 0; i < context.lengthValue("DescribeConsortiumSpecsResponse.Result.Length"); i++) {
			ClusterSpec clusterSpec = new ClusterSpec();
			clusterSpec.setName(context.stringValue("DescribeConsortiumSpecsResponse.Result["+ i +"].Name"));
			clusterSpec.setTitle(context.stringValue("DescribeConsortiumSpecsResponse.Result["+ i +"].Title"));
			clusterSpec.setNumOfNodes(context.integerValue("DescribeConsortiumSpecsResponse.Result["+ i +"].NumOfNodes"));
			clusterSpec.setMasterDescription(context.stringValue("DescribeConsortiumSpecsResponse.Result["+ i +"].MasterDescription"));
			clusterSpec.setWorkerDescription(context.stringValue("DescribeConsortiumSpecsResponse.Result["+ i +"].WorkerDescription"));
			clusterSpec.setEnable(context.booleanValue("DescribeConsortiumSpecsResponse.Result["+ i +"].Enable"));

			result.add(clusterSpec);
		}
		describeConsortiumSpecsResponse.setResult(result);
	 
	 	return describeConsortiumSpecsResponse;
	}
}