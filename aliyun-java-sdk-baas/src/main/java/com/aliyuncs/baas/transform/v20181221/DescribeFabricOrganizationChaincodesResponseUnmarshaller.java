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

import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationChaincodesResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationChaincodesResponse.OrganizationChaincode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricOrganizationChaincodesResponseUnmarshaller {

	public static DescribeFabricOrganizationChaincodesResponse unmarshall(DescribeFabricOrganizationChaincodesResponse describeFabricOrganizationChaincodesResponse, UnmarshallerContext _ctx) {
		
		describeFabricOrganizationChaincodesResponse.setRequestId(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.RequestId"));
		describeFabricOrganizationChaincodesResponse.setSuccess(_ctx.booleanValue("DescribeFabricOrganizationChaincodesResponse.Success"));
		describeFabricOrganizationChaincodesResponse.setErrorCode(_ctx.integerValue("DescribeFabricOrganizationChaincodesResponse.ErrorCode"));

		List<OrganizationChaincode> result = new ArrayList<OrganizationChaincode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricOrganizationChaincodesResponse.Result.Length"); i++) {
			OrganizationChaincode organizationChaincode = new OrganizationChaincode();
			organizationChaincode.setEndorsePolicy(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].EndorsePolicy"));
			organizationChaincode.setState(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].State"));
			organizationChaincode.setCreateTime(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].CreateTime"));
			organizationChaincode.setChaincodeId(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].ChaincodeId"));
			organizationChaincode.setMessage(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].Message"));
			organizationChaincode.setChaincodeName(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].ChaincodeName"));
			organizationChaincode.setInstalled(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].Installed"));
			organizationChaincode.setCreator(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].Creator"));
			organizationChaincode.setDeployTime(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].DeployTime"));
			organizationChaincode.setChaincodeVersion(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].ChaincodeVersion"));
			organizationChaincode.setConsortiumId(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].ConsortiumId"));
			organizationChaincode.setChannelName(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].ChannelName"));
			organizationChaincode.setChannelId(_ctx.stringValue("DescribeFabricOrganizationChaincodesResponse.Result["+ i +"].ChannelId"));

			result.add(organizationChaincode);
		}
		describeFabricOrganizationChaincodesResponse.setResult(result);
	 
	 	return describeFabricOrganizationChaincodesResponse;
	}
}