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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.ModifyCostUnitResponse;
import com.aliyuncs.bssopenapi.model.v20171214.ModifyCostUnitResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyCostUnitResponseUnmarshaller {

	public static ModifyCostUnitResponse unmarshall(ModifyCostUnitResponse modifyCostUnitResponse, UnmarshallerContext _ctx) {
		
		modifyCostUnitResponse.setRequestId(_ctx.stringValue("ModifyCostUnitResponse.RequestId"));
		modifyCostUnitResponse.setMessage(_ctx.stringValue("ModifyCostUnitResponse.Message"));
		modifyCostUnitResponse.setCode(_ctx.stringValue("ModifyCostUnitResponse.Code"));
		modifyCostUnitResponse.setSuccess(_ctx.booleanValue("ModifyCostUnitResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifyCostUnitResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setIsSuccess(_ctx.booleanValue("ModifyCostUnitResponse.Data["+ i +"].IsSuccess"));
			dataItem.setUnitId(_ctx.longValue("ModifyCostUnitResponse.Data["+ i +"].UnitId"));
			dataItem.setOwnerUid(_ctx.longValue("ModifyCostUnitResponse.Data["+ i +"].OwnerUid"));

			data.add(dataItem);
		}
		modifyCostUnitResponse.setData(data);
	 
	 	return modifyCostUnitResponse;
	}
}