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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.DeleteCostUnitResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DeleteCostUnitResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCostUnitResponseUnmarshaller {

	public static DeleteCostUnitResponse unmarshall(DeleteCostUnitResponse deleteCostUnitResponse, UnmarshallerContext _ctx) {
		
		deleteCostUnitResponse.setRequestId(_ctx.stringValue("DeleteCostUnitResponse.RequestId"));
		deleteCostUnitResponse.setMessage(_ctx.stringValue("DeleteCostUnitResponse.Message"));
		deleteCostUnitResponse.setCode(_ctx.stringValue("DeleteCostUnitResponse.Code"));
		deleteCostUnitResponse.setSuccess(_ctx.booleanValue("DeleteCostUnitResponse.Success"));

		Data data = new Data();
		data.setIsSuccess(_ctx.booleanValue("DeleteCostUnitResponse.Data.IsSuccess"));
		data.setUnitId(_ctx.longValue("DeleteCostUnitResponse.Data.UnitId"));
		data.setOwnerUid(_ctx.longValue("DeleteCostUnitResponse.Data.OwnerUid"));
		deleteCostUnitResponse.setData(data);
	 
	 	return deleteCostUnitResponse;
	}
}