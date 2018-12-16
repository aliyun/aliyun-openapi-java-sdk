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

	public static ModifyInstanceResponse unmarshall(ModifyInstanceResponse modifyInstanceResponse, UnmarshallerContext context) {
		
		modifyInstanceResponse.setRequestId(context.stringValue("ModifyInstanceResponse.RequestId"));
		modifyInstanceResponse.setCode(context.stringValue("ModifyInstanceResponse.Code"));
		modifyInstanceResponse.setMessage(context.stringValue("ModifyInstanceResponse.Message"));

		Result result = new Result();
		result.setInstanceId(context.stringValue("ModifyInstanceResponse.Result.InstanceId"));
		result.setChargeType(context.stringValue("ModifyInstanceResponse.Result.ChargeType"));
		result.setRegionId(context.stringValue("ModifyInstanceResponse.Result.RegionId"));
		result.setName(context.stringValue("ModifyInstanceResponse.Result.Name"));
		result.setType(context.stringValue("ModifyInstanceResponse.Result.Type"));
		result.setExpiredTime(context.stringValue("ModifyInstanceResponse.Result.ExpiredTime"));
		result.setGmtCreate(context.stringValue("ModifyInstanceResponse.Result.GmtCreate"));
		result.setGmtModified(context.stringValue("ModifyInstanceResponse.Result.GmtModified"));
		result.setStatus(context.stringValue("ModifyInstanceResponse.Result.Status"));
		result.setIndustry(context.stringValue("ModifyInstanceResponse.Result.Industry"));
		result.setScene(context.stringValue("ModifyInstanceResponse.Result.Scene"));
		result.setDataSetVersion(context.stringValue("ModifyInstanceResponse.Result.DataSetVersion"));
		result.setCommodityCode(context.stringValue("ModifyInstanceResponse.Result.CommodityCode"));
		result.setLockMode(context.stringValue("ModifyInstanceResponse.Result.LockMode"));
		modifyInstanceResponse.setResult(result);
	 
	 	return modifyInstanceResponse;
	}
}