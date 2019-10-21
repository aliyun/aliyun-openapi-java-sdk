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

import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumDeletableResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumDeletableResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricConsortiumDeletableResponseUnmarshaller {

	public static DescribeFabricConsortiumDeletableResponse unmarshall(DescribeFabricConsortiumDeletableResponse describeFabricConsortiumDeletableResponse, UnmarshallerContext _ctx) {
		
		describeFabricConsortiumDeletableResponse.setRequestId(_ctx.stringValue("DescribeFabricConsortiumDeletableResponse.RequestId"));
		describeFabricConsortiumDeletableResponse.setSuccess(_ctx.booleanValue("DescribeFabricConsortiumDeletableResponse.Success"));
		describeFabricConsortiumDeletableResponse.setErrorCode(_ctx.integerValue("DescribeFabricConsortiumDeletableResponse.ErrorCode"));

		Result result = new Result();
		result.setConsortiumId(_ctx.stringValue("DescribeFabricConsortiumDeletableResponse.Result.ConsortiumId"));
		result.setConsortiumName(_ctx.stringValue("DescribeFabricConsortiumDeletableResponse.Result.ConsortiumName"));
		result.setRegionId(_ctx.stringValue("DescribeFabricConsortiumDeletableResponse.Result.RegionId"));
		result.setZoneId(_ctx.stringValue("DescribeFabricConsortiumDeletableResponse.Result.ZoneId"));
		result.setCodeName(_ctx.stringValue("DescribeFabricConsortiumDeletableResponse.Result.CodeName"));
		result.setDomain(_ctx.stringValue("DescribeFabricConsortiumDeletableResponse.Result.Domain"));
		result.setDescription(_ctx.stringValue("DescribeFabricConsortiumDeletableResponse.Result.Description"));
		result.setState(_ctx.stringValue("DescribeFabricConsortiumDeletableResponse.Result.State"));
		result.setDeletable(_ctx.booleanValue("DescribeFabricConsortiumDeletableResponse.Result.Deletable"));
		describeFabricConsortiumDeletableResponse.setResult(result);
	 
	 	return describeFabricConsortiumDeletableResponse;
	}
}