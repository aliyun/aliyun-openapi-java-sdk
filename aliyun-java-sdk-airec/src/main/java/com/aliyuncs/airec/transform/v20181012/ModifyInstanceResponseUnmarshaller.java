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

package com.aliyuncs.airec.transform.v20181012;

import com.aliyuncs.airec.model.v20181012.ModifyInstanceResponse;
import com.aliyuncs.airec.model.v20181012.ModifyInstanceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyInstanceResponseUnmarshaller {

	public static ModifyInstanceResponse unmarshall(ModifyInstanceResponse modifyInstanceResponse, UnmarshallerContext _ctx) {
		
		modifyInstanceResponse.setRequestId(_ctx.stringValue("ModifyInstanceResponse.RequestId"));
		modifyInstanceResponse.setCode(_ctx.stringValue("ModifyInstanceResponse.Code"));
		modifyInstanceResponse.setMessage(_ctx.stringValue("ModifyInstanceResponse.Message"));

		Result result = new Result();
		result.setInstanceId(_ctx.stringValue("ModifyInstanceResponse.Result.InstanceId"));
		result.setChargeType(_ctx.stringValue("ModifyInstanceResponse.Result.ChargeType"));
		result.setRegionId(_ctx.stringValue("ModifyInstanceResponse.Result.RegionId"));
		result.setName(_ctx.stringValue("ModifyInstanceResponse.Result.Name"));
		result.setType(_ctx.stringValue("ModifyInstanceResponse.Result.Type"));
		result.setExpiredTime(_ctx.stringValue("ModifyInstanceResponse.Result.ExpiredTime"));
		result.setGmtCreate(_ctx.stringValue("ModifyInstanceResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("ModifyInstanceResponse.Result.GmtModified"));
		result.setStatus(_ctx.stringValue("ModifyInstanceResponse.Result.Status"));
		result.setIndustry(_ctx.stringValue("ModifyInstanceResponse.Result.Industry"));
		result.setScene(_ctx.stringValue("ModifyInstanceResponse.Result.Scene"));
		result.setDataSetVersion(_ctx.stringValue("ModifyInstanceResponse.Result.DataSetVersion"));
		result.setCommodityCode(_ctx.stringValue("ModifyInstanceResponse.Result.CommodityCode"));
		result.setLockMode(_ctx.stringValue("ModifyInstanceResponse.Result.LockMode"));
		modifyInstanceResponse.setResult(result);
	 
	 	return modifyInstanceResponse;
	}
}