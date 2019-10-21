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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumSpecsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumSpecsResponse.ClusterSpec;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricConsortiumSpecsResponseUnmarshaller {

	public static DescribeFabricConsortiumSpecsResponse unmarshall(DescribeFabricConsortiumSpecsResponse describeFabricConsortiumSpecsResponse, UnmarshallerContext _ctx) {
		
		describeFabricConsortiumSpecsResponse.setRequestId(_ctx.stringValue("DescribeFabricConsortiumSpecsResponse.RequestId"));
		describeFabricConsortiumSpecsResponse.setSuccess(_ctx.booleanValue("DescribeFabricConsortiumSpecsResponse.Success"));
		describeFabricConsortiumSpecsResponse.setErrorCode(_ctx.integerValue("DescribeFabricConsortiumSpecsResponse.ErrorCode"));

		List<ClusterSpec> result = new ArrayList<ClusterSpec>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricConsortiumSpecsResponse.Result.Length"); i++) {
			ClusterSpec clusterSpec = new ClusterSpec();
			clusterSpec.setSpecName(_ctx.stringValue("DescribeFabricConsortiumSpecsResponse.Result["+ i +"].SpecName"));
			clusterSpec.setSpecTitle(_ctx.stringValue("DescribeFabricConsortiumSpecsResponse.Result["+ i +"].SpecTitle"));
			clusterSpec.setEnable(_ctx.booleanValue("DescribeFabricConsortiumSpecsResponse.Result["+ i +"].Enable"));

			result.add(clusterSpec);
		}
		describeFabricConsortiumSpecsResponse.setResult(result);
	 
	 	return describeFabricConsortiumSpecsResponse;
	}
}