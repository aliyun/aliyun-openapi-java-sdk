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

import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationSpecsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationSpecsResponse.ClusterSpec;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricOrganizationSpecsResponseUnmarshaller {

	public static DescribeFabricOrganizationSpecsResponse unmarshall(DescribeFabricOrganizationSpecsResponse describeFabricOrganizationSpecsResponse, UnmarshallerContext _ctx) {
		
		describeFabricOrganizationSpecsResponse.setRequestId(_ctx.stringValue("DescribeFabricOrganizationSpecsResponse.RequestId"));
		describeFabricOrganizationSpecsResponse.setSuccess(_ctx.booleanValue("DescribeFabricOrganizationSpecsResponse.Success"));
		describeFabricOrganizationSpecsResponse.setErrorCode(_ctx.integerValue("DescribeFabricOrganizationSpecsResponse.ErrorCode"));

		List<ClusterSpec> result = new ArrayList<ClusterSpec>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricOrganizationSpecsResponse.Result.Length"); i++) {
			ClusterSpec clusterSpec = new ClusterSpec();
			clusterSpec.setOrganizationSpecsName(_ctx.stringValue("DescribeFabricOrganizationSpecsResponse.Result["+ i +"].OrganizationSpecsName"));
			clusterSpec.setTitle(_ctx.stringValue("DescribeFabricOrganizationSpecsResponse.Result["+ i +"].Title"));
			clusterSpec.setEnable(_ctx.booleanValue("DescribeFabricOrganizationSpecsResponse.Result["+ i +"].Enable"));

			result.add(clusterSpec);
		}
		describeFabricOrganizationSpecsResponse.setResult(result);
	 
	 	return describeFabricOrganizationSpecsResponse;
	}
}