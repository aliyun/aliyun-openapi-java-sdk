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

import com.aliyuncs.agency.model.v20180328.GetFxCustomerRelationByUidResponse;
import com.aliyuncs.agency.model.v20180328.GetFxCustomerRelationByUidResponse.FxCustomerRelationVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFxCustomerRelationByUidResponseUnmarshaller {

	public static GetFxCustomerRelationByUidResponse unmarshall(GetFxCustomerRelationByUidResponse getFxCustomerRelationByUidResponse, UnmarshallerContext _ctx) {
		
		getFxCustomerRelationByUidResponse.setCode(_ctx.stringValue("GetFxCustomerRelationByUidResponse.Code"));
		getFxCustomerRelationByUidResponse.setMessage(_ctx.stringValue("GetFxCustomerRelationByUidResponse.Message"));
		getFxCustomerRelationByUidResponse.setSuccess(_ctx.booleanValue("GetFxCustomerRelationByUidResponse.Success"));

		FxCustomerRelationVO fxCustomerRelationVO = new FxCustomerRelationVO();
		fxCustomerRelationVO.setParentId(_ctx.longValue("GetFxCustomerRelationByUidResponse.FxCustomerRelationVO.ParentId"));
		fxCustomerRelationVO.setParentId1(_ctx.longValue("GetFxCustomerRelationByUidResponse.FxCustomerRelationVO.ParentId1"));
		fxCustomerRelationVO.setCustomerRebateType(_ctx.integerValue("GetFxCustomerRelationByUidResponse.FxCustomerRelationVO.CustomerRebateType"));
		fxCustomerRelationVO.setIsDistribution(_ctx.integerValue("GetFxCustomerRelationByUidResponse.FxCustomerRelationVO.IsDistribution"));
		fxCustomerRelationVO.setId(_ctx.longValue("GetFxCustomerRelationByUidResponse.FxCustomerRelationVO.Id"));
		fxCustomerRelationVO.setLevel(_ctx.integerValue("GetFxCustomerRelationByUidResponse.FxCustomerRelationVO.Level"));
		fxCustomerRelationVO.setUid(_ctx.longValue("GetFxCustomerRelationByUidResponse.FxCustomerRelationVO.Uid"));
		getFxCustomerRelationByUidResponse.setFxCustomerRelationVO(fxCustomerRelationVO);
	 
	 	return getFxCustomerRelationByUidResponse;
	}
}