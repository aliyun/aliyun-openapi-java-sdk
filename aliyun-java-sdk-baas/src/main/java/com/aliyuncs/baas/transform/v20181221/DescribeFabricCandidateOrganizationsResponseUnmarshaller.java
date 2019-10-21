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

import com.aliyuncs.baas.model.v20181221.DescribeFabricCandidateOrganizationsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricCandidateOrganizationsResponse.DescribeCandidateOrganization;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricCandidateOrganizationsResponseUnmarshaller {

	public static DescribeFabricCandidateOrganizationsResponse unmarshall(DescribeFabricCandidateOrganizationsResponse describeFabricCandidateOrganizationsResponse, UnmarshallerContext _ctx) {
		
		describeFabricCandidateOrganizationsResponse.setRequestId(_ctx.stringValue("DescribeFabricCandidateOrganizationsResponse.RequestId"));
		describeFabricCandidateOrganizationsResponse.setSuccess(_ctx.booleanValue("DescribeFabricCandidateOrganizationsResponse.Success"));
		describeFabricCandidateOrganizationsResponse.setErrorCode(_ctx.integerValue("DescribeFabricCandidateOrganizationsResponse.ErrorCode"));

		List<DescribeCandidateOrganization> result = new ArrayList<DescribeCandidateOrganization>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricCandidateOrganizationsResponse.Result.Length"); i++) {
			DescribeCandidateOrganization describeCandidateOrganization = new DescribeCandidateOrganization();
			describeCandidateOrganization.setOrganizationId(_ctx.stringValue("DescribeFabricCandidateOrganizationsResponse.Result["+ i +"].OrganizationId"));
			describeCandidateOrganization.setOrganizationName(_ctx.stringValue("DescribeFabricCandidateOrganizationsResponse.Result["+ i +"].OrganizationName"));
			describeCandidateOrganization.setClusterState(_ctx.stringValue("DescribeFabricCandidateOrganizationsResponse.Result["+ i +"].ClusterState"));
			describeCandidateOrganization.setServiceState(_ctx.stringValue("DescribeFabricCandidateOrganizationsResponse.Result["+ i +"].ServiceState"));

			result.add(describeCandidateOrganization);
		}
		describeFabricCandidateOrganizationsResponse.setResult(result);
	 
	 	return describeFabricCandidateOrganizationsResponse;
	}
}