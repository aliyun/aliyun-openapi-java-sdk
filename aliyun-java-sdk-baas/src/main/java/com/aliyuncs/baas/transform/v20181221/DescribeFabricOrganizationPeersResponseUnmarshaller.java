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

import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationPeersResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationPeersResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricOrganizationPeersResponseUnmarshaller {

	public static DescribeFabricOrganizationPeersResponse unmarshall(DescribeFabricOrganizationPeersResponse describeFabricOrganizationPeersResponse, UnmarshallerContext _ctx) {
		
		describeFabricOrganizationPeersResponse.setRequestId(_ctx.stringValue("DescribeFabricOrganizationPeersResponse.RequestId"));
		describeFabricOrganizationPeersResponse.setSuccess(_ctx.booleanValue("DescribeFabricOrganizationPeersResponse.Success"));
		describeFabricOrganizationPeersResponse.setErrorCode(_ctx.integerValue("DescribeFabricOrganizationPeersResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricOrganizationPeersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setOrganizationPeerName(_ctx.stringValue("DescribeFabricOrganizationPeersResponse.Result["+ i +"].OrganizationPeerName"));
			resultItem.setIsAnchor(_ctx.booleanValue("DescribeFabricOrganizationPeersResponse.Result["+ i +"].IsAnchor"));
			resultItem.setIntranetIp(_ctx.stringValue("DescribeFabricOrganizationPeersResponse.Result["+ i +"].IntranetIp"));
			resultItem.setInternetIp(_ctx.stringValue("DescribeFabricOrganizationPeersResponse.Result["+ i +"].InternetIp"));
			resultItem.setDomain(_ctx.stringValue("DescribeFabricOrganizationPeersResponse.Result["+ i +"].Domain"));
			resultItem.setPort(_ctx.integerValue("DescribeFabricOrganizationPeersResponse.Result["+ i +"].Port"));
			resultItem.setInstanceType(_ctx.stringValue("DescribeFabricOrganizationPeersResponse.Result["+ i +"].InstanceType"));
			resultItem.setCreateTime(_ctx.stringValue("DescribeFabricOrganizationPeersResponse.Result["+ i +"].CreateTime"));
			resultItem.setUpdateTime(_ctx.stringValue("DescribeFabricOrganizationPeersResponse.Result["+ i +"].UpdateTime"));

			result.add(resultItem);
		}
		describeFabricOrganizationPeersResponse.setResult(result);
	 
	 	return describeFabricOrganizationPeersResponse;
	}
}