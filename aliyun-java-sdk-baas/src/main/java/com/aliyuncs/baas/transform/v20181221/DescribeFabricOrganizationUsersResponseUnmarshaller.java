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

import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationUsersResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationUsersResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricOrganizationUsersResponseUnmarshaller {

	public static DescribeFabricOrganizationUsersResponse unmarshall(DescribeFabricOrganizationUsersResponse describeFabricOrganizationUsersResponse, UnmarshallerContext _ctx) {
		
		describeFabricOrganizationUsersResponse.setRequestId(_ctx.stringValue("DescribeFabricOrganizationUsersResponse.RequestId"));
		describeFabricOrganizationUsersResponse.setSuccess(_ctx.booleanValue("DescribeFabricOrganizationUsersResponse.Success"));
		describeFabricOrganizationUsersResponse.setErrorCode(_ctx.integerValue("DescribeFabricOrganizationUsersResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricOrganizationUsersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCallerBid(_ctx.stringValue("DescribeFabricOrganizationUsersResponse.Result["+ i +"].CallerBid"));
			resultItem.setCallerUid(_ctx.longValue("DescribeFabricOrganizationUsersResponse.Result["+ i +"].CallerUid"));
			resultItem.setRegionId(_ctx.stringValue("DescribeFabricOrganizationUsersResponse.Result["+ i +"].RegionId"));
			resultItem.setOrganizationId(_ctx.stringValue("DescribeFabricOrganizationUsersResponse.Result["+ i +"].OrganizationId"));
			resultItem.setUsername(_ctx.stringValue("DescribeFabricOrganizationUsersResponse.Result["+ i +"].Username"));
			resultItem.setFullName(_ctx.stringValue("DescribeFabricOrganizationUsersResponse.Result["+ i +"].FullName"));
			resultItem.setCreateTime(_ctx.stringValue("DescribeFabricOrganizationUsersResponse.Result["+ i +"].CreateTime"));
			resultItem.setExpireTime(_ctx.stringValue("DescribeFabricOrganizationUsersResponse.Result["+ i +"].ExpireTime"));
			resultItem.setAttrs(_ctx.stringValue("DescribeFabricOrganizationUsersResponse.Result["+ i +"].Attrs"));

			result.add(resultItem);
		}
		describeFabricOrganizationUsersResponse.setResult(result);
	 
	 	return describeFabricOrganizationUsersResponse;
	}
}