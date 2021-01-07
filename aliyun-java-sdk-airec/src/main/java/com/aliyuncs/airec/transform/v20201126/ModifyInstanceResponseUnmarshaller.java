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

package com.aliyuncs.airec.transform.v20201126;

import com.aliyuncs.airec.model.v20201126.ModifyInstanceResponse;
import com.aliyuncs.airec.model.v20201126.ModifyInstanceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyInstanceResponseUnmarshaller {

	public static ModifyInstanceResponse unmarshall(ModifyInstanceResponse modifyInstanceResponse, UnmarshallerContext _ctx) {
		
		modifyInstanceResponse.setCode(_ctx.stringValue("ModifyInstanceResponse.code"));
		modifyInstanceResponse.setMessage(_ctx.stringValue("ModifyInstanceResponse.message"));
		modifyInstanceResponse.setRequestId(_ctx.stringValue("ModifyInstanceResponse.requestId"));

		Result result = new Result();
		result.setChargeType(_ctx.stringValue("ModifyInstanceResponse.result.chargeType"));
		result.setCommodityCode(_ctx.stringValue("ModifyInstanceResponse.result.commodityCode"));
		result.setDataSetVersion(_ctx.stringValue("ModifyInstanceResponse.result.dataSetVersion"));
		result.setExpiredTime(_ctx.stringValue("ModifyInstanceResponse.result.expiredTime"));
		result.setGmtCreate(_ctx.stringValue("ModifyInstanceResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("ModifyInstanceResponse.result.gmtModified"));
		result.setIndustry(_ctx.stringValue("ModifyInstanceResponse.result.industry"));
		result.setInstanceId(_ctx.stringValue("ModifyInstanceResponse.result.instanceId"));
		result.setLockMode(_ctx.stringValue("ModifyInstanceResponse.result.lockMode"));
		result.setName(_ctx.stringValue("ModifyInstanceResponse.result.name"));
		result.setRegionId(_ctx.stringValue("ModifyInstanceResponse.result.regionId"));
		result.setStatus(_ctx.stringValue("ModifyInstanceResponse.result.status"));
		result.setType(_ctx.stringValue("ModifyInstanceResponse.result.type"));
		modifyInstanceResponse.setResult(result);
	 
	 	return modifyInstanceResponse;
	}
}