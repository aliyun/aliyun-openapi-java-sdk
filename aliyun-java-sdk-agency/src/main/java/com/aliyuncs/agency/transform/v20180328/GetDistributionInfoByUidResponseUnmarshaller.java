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

package com.aliyuncs.agency.transform.v20180328;

import com.aliyuncs.agency.model.v20180328.GetDistributionInfoByUidResponse;
import com.aliyuncs.agency.model.v20180328.GetDistributionInfoByUidResponse.FxDistributionInfoVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDistributionInfoByUidResponseUnmarshaller {

	public static GetDistributionInfoByUidResponse unmarshall(GetDistributionInfoByUidResponse getDistributionInfoByUidResponse, UnmarshallerContext _ctx) {
		
		getDistributionInfoByUidResponse.setCode(_ctx.stringValue("GetDistributionInfoByUidResponse.Code"));
		getDistributionInfoByUidResponse.setMessage(_ctx.stringValue("GetDistributionInfoByUidResponse.Message"));
		getDistributionInfoByUidResponse.setSuccess(_ctx.booleanValue("GetDistributionInfoByUidResponse.Success"));

		FxDistributionInfoVO fxDistributionInfoVO = new FxDistributionInfoVO();
		fxDistributionInfoVO.setDistributionRebateType(_ctx.integerValue("GetDistributionInfoByUidResponse.FxDistributionInfoVO.DistributionRebateType"));
		fxDistributionInfoVO.setLevel(_ctx.integerValue("GetDistributionInfoByUidResponse.FxDistributionInfoVO.Level"));
		fxDistributionInfoVO.setUid(_ctx.longValue("GetDistributionInfoByUidResponse.FxDistributionInfoVO.Uid"));
		fxDistributionInfoVO.setBizType(_ctx.integerValue("GetDistributionInfoByUidResponse.FxDistributionInfoVO.BizType"));
		getDistributionInfoByUidResponse.setFxDistributionInfoVO(fxDistributionInfoVO);
	 
	 	return getDistributionInfoByUidResponse;
	}
}