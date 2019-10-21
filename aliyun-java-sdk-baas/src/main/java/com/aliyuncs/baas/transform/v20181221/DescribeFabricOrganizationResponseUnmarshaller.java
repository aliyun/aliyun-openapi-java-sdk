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

import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricOrganizationResponseUnmarshaller {

	public static DescribeFabricOrganizationResponse unmarshall(DescribeFabricOrganizationResponse describeFabricOrganizationResponse, UnmarshallerContext _ctx) {
		
		describeFabricOrganizationResponse.setRequestId(_ctx.stringValue("DescribeFabricOrganizationResponse.RequestId"));
		describeFabricOrganizationResponse.setSuccess(_ctx.booleanValue("DescribeFabricOrganizationResponse.Success"));
		describeFabricOrganizationResponse.setErrorCode(_ctx.integerValue("DescribeFabricOrganizationResponse.ErrorCode"));

		Result result = new Result();
		result.setOrganizationId(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.OrganizationId"));
		result.setOrganizationName(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.OrganizationName"));
		result.setRegionId(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.RegionId"));
		result.setZoneId(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.ZoneId"));
		result.setCodeName(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.CodeName"));
		result.setDomain(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.Domain"));
		result.setOrganizationDescription(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.OrganizationDescription"));
		result.setOwnerBid(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.OwnerBid"));
		result.setOwnerUid(_ctx.longValue("DescribeFabricOrganizationResponse.Result.OwnerUid"));
		result.setOwnerName(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.OwnerName"));
		result.setPeerCount(_ctx.integerValue("DescribeFabricOrganizationResponse.Result.PeerCount"));
		result.setUserCount(_ctx.integerValue("DescribeFabricOrganizationResponse.Result.UserCount"));
		result.setConsortiumCount(_ctx.integerValue("DescribeFabricOrganizationResponse.Result.ConsortiumCount"));
		result.setSpecName(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.SpecName"));
		result.setRequestId(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.RequestId"));
		result.setCreateTime(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.CreateTime"));
		result.setState(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.State"));
		result.setCANAME(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.CANAME"));
		result.setCAUrl(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.CAUrl"));
		result.setMSP(_ctx.stringValue("DescribeFabricOrganizationResponse.Result.MSP"));
		describeFabricOrganizationResponse.setResult(result);
	 
	 	return describeFabricOrganizationResponse;
	}
}