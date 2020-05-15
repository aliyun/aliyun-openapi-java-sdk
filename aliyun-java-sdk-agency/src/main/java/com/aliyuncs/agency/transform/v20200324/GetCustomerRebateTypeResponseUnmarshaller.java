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

package com.aliyuncs.agency.transform.v20200324;

import com.aliyuncs.agency.model.v20200324.GetCustomerRebateTypeResponse;
import com.aliyuncs.agency.model.v20200324.GetCustomerRebateTypeResponse.FxUserInfoExt;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomerRebateTypeResponseUnmarshaller {

	public static GetCustomerRebateTypeResponse unmarshall(GetCustomerRebateTypeResponse getCustomerRebateTypeResponse, UnmarshallerContext _ctx) {
		
		getCustomerRebateTypeResponse.setRequestId(_ctx.stringValue("GetCustomerRebateTypeResponse.RequestId"));
		getCustomerRebateTypeResponse.setCode(_ctx.stringValue("GetCustomerRebateTypeResponse.Code"));
		getCustomerRebateTypeResponse.setSuccess(_ctx.booleanValue("GetCustomerRebateTypeResponse.Success"));

		FxUserInfoExt fxUserInfoExt = new FxUserInfoExt();
		fxUserInfoExt.setKpId(_ctx.longValue("GetCustomerRebateTypeResponse.FxUserInfoExt.KpId"));
		fxUserInfoExt.setIsSub(_ctx.integerValue("GetCustomerRebateTypeResponse.FxUserInfoExt.IsSub"));
		fxUserInfoExt.setParentUid(_ctx.longValue("GetCustomerRebateTypeResponse.FxUserInfoExt.ParentUid"));
		fxUserInfoExt.setLevel(_ctx.integerValue("GetCustomerRebateTypeResponse.FxUserInfoExt.Level"));
		fxUserInfoExt.setCustomerRebateType(_ctx.integerValue("GetCustomerRebateTypeResponse.FxUserInfoExt.CustomerRebateType"));
		fxUserInfoExt.setDistributionRebateType(_ctx.integerValue("GetCustomerRebateTypeResponse.FxUserInfoExt.DistributionRebateType"));
		fxUserInfoExt.setSubUserCount(_ctx.integerValue("GetCustomerRebateTypeResponse.FxUserInfoExt.SubUserCount"));
		getCustomerRebateTypeResponse.setFxUserInfoExt(fxUserInfoExt);
	 
	 	return getCustomerRebateTypeResponse;
	}
}