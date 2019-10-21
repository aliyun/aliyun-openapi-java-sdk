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

import com.aliyuncs.baas.model.v20181221.DescribeFabricInviterResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricInviterResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricInviterResponseUnmarshaller {

	public static DescribeFabricInviterResponse unmarshall(DescribeFabricInviterResponse describeFabricInviterResponse, UnmarshallerContext _ctx) {
		
		describeFabricInviterResponse.setRequestId(_ctx.stringValue("DescribeFabricInviterResponse.RequestId"));
		describeFabricInviterResponse.setSuccess(_ctx.booleanValue("DescribeFabricInviterResponse.Success"));
		describeFabricInviterResponse.setErrorCode(_ctx.integerValue("DescribeFabricInviterResponse.ErrorCode"));

		Result result = new Result();
		result.setConsortiumId(_ctx.stringValue("DescribeFabricInviterResponse.Result.ConsortiumId"));
		result.setConsortiumName(_ctx.stringValue("DescribeFabricInviterResponse.Result.ConsortiumName"));
		result.setInviterName(_ctx.stringValue("DescribeFabricInviterResponse.Result.InviterName"));
		result.setInviterId(_ctx.longValue("DescribeFabricInviterResponse.Result.InviterId"));
		result.setExpireTime(_ctx.stringValue("DescribeFabricInviterResponse.Result.ExpireTime"));
		describeFabricInviterResponse.setResult(result);
	 
	 	return describeFabricInviterResponse;
	}
}