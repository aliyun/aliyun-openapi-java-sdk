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

import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationDeletableResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationDeletableResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricOrganizationDeletableResponseUnmarshaller {

	public static DescribeFabricOrganizationDeletableResponse unmarshall(DescribeFabricOrganizationDeletableResponse describeFabricOrganizationDeletableResponse, UnmarshallerContext _ctx) {
		
		describeFabricOrganizationDeletableResponse.setRequestId(_ctx.stringValue("DescribeFabricOrganizationDeletableResponse.RequestId"));
		describeFabricOrganizationDeletableResponse.setSuccess(_ctx.booleanValue("DescribeFabricOrganizationDeletableResponse.Success"));
		describeFabricOrganizationDeletableResponse.setErrorCode(_ctx.integerValue("DescribeFabricOrganizationDeletableResponse.ErrorCode"));

		Result result = new Result();
		result.setOrganizationId(_ctx.stringValue("DescribeFabricOrganizationDeletableResponse.Result.OrganizationId"));
		result.setOrganizationName(_ctx.stringValue("DescribeFabricOrganizationDeletableResponse.Result.OrganizationName"));
		result.setRegionId(_ctx.stringValue("DescribeFabricOrganizationDeletableResponse.Result.RegionId"));
		result.setZoneId(_ctx.stringValue("DescribeFabricOrganizationDeletableResponse.Result.ZoneId"));
		result.setCodeName(_ctx.stringValue("DescribeFabricOrganizationDeletableResponse.Result.CodeName"));
		result.setDomain(_ctx.stringValue("DescribeFabricOrganizationDeletableResponse.Result.Domain"));
		result.setOrganizationDescription(_ctx.stringValue("DescribeFabricOrganizationDeletableResponse.Result.OrganizationDescription"));
		result.setState(_ctx.stringValue("DescribeFabricOrganizationDeletableResponse.Result.State"));
		result.setDeletable(_ctx.booleanValue("DescribeFabricOrganizationDeletableResponse.Result.Deletable"));
		describeFabricOrganizationDeletableResponse.setResult(result);
	 
	 	return describeFabricOrganizationDeletableResponse;
	}
}