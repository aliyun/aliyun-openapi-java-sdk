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

import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumMemberApprovalResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumMemberApprovalResponse.ConsortiumMemberApproval;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricConsortiumMemberApprovalResponseUnmarshaller {

	public static DescribeFabricConsortiumMemberApprovalResponse unmarshall(DescribeFabricConsortiumMemberApprovalResponse describeFabricConsortiumMemberApprovalResponse, UnmarshallerContext _ctx) {
		
		describeFabricConsortiumMemberApprovalResponse.setRequestId(_ctx.stringValue("DescribeFabricConsortiumMemberApprovalResponse.RequestId"));
		describeFabricConsortiumMemberApprovalResponse.setSuccess(_ctx.booleanValue("DescribeFabricConsortiumMemberApprovalResponse.Success"));
		describeFabricConsortiumMemberApprovalResponse.setErrorCode(_ctx.integerValue("DescribeFabricConsortiumMemberApprovalResponse.ErrorCode"));

		List<ConsortiumMemberApproval> result = new ArrayList<ConsortiumMemberApproval>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricConsortiumMemberApprovalResponse.Result.Length"); i++) {
			ConsortiumMemberApproval consortiumMemberApproval = new ConsortiumMemberApproval();
			consortiumMemberApproval.setConsortiumId(_ctx.stringValue("DescribeFabricConsortiumMemberApprovalResponse.Result["+ i +"].ConsortiumId"));
			consortiumMemberApproval.setConsortiumName(_ctx.stringValue("DescribeFabricConsortiumMemberApprovalResponse.Result["+ i +"].ConsortiumName"));
			consortiumMemberApproval.setChannelCreatePolicy(_ctx.stringValue("DescribeFabricConsortiumMemberApprovalResponse.Result["+ i +"].ChannelCreatePolicy"));
			consortiumMemberApproval.setOrganizationId(_ctx.stringValue("DescribeFabricConsortiumMemberApprovalResponse.Result["+ i +"].OrganizationId"));
			consortiumMemberApproval.setOrganizationName(_ctx.stringValue("DescribeFabricConsortiumMemberApprovalResponse.Result["+ i +"].OrganizationName"));
			consortiumMemberApproval.setDomainName(_ctx.stringValue("DescribeFabricConsortiumMemberApprovalResponse.Result["+ i +"].DomainName"));
			consortiumMemberApproval.setState(_ctx.stringValue("DescribeFabricConsortiumMemberApprovalResponse.Result["+ i +"].State"));
			consortiumMemberApproval.setConfirmTime(_ctx.stringValue("DescribeFabricConsortiumMemberApprovalResponse.Result["+ i +"].ConfirmTime"));

			result.add(consortiumMemberApproval);
		}
		describeFabricConsortiumMemberApprovalResponse.setResult(result);
	 
	 	return describeFabricConsortiumMemberApprovalResponse;
	}
}