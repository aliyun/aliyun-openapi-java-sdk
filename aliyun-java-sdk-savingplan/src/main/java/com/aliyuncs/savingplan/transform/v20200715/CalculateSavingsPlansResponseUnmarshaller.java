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

package com.aliyuncs.savingplan.transform.v20200715;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.savingplan.model.v20200715.CalculateSavingsPlansResponse;
import com.aliyuncs.savingplan.model.v20200715.CalculateSavingsPlansResponse.SpnInstanceDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class CalculateSavingsPlansResponseUnmarshaller {

	public static CalculateSavingsPlansResponse unmarshall(CalculateSavingsPlansResponse calculateSavingsPlansResponse, UnmarshallerContext _ctx) {
		
		calculateSavingsPlansResponse.setRequestId(_ctx.stringValue("CalculateSavingsPlansResponse.RequestId"));
		calculateSavingsPlansResponse.setCode(_ctx.stringValue("CalculateSavingsPlansResponse.Code"));
		calculateSavingsPlansResponse.setMessage(_ctx.stringValue("CalculateSavingsPlansResponse.Message"));
		calculateSavingsPlansResponse.setSuccess(_ctx.booleanValue("CalculateSavingsPlansResponse.Success"));

		List<SpnInstanceDTO> data = new ArrayList<SpnInstanceDTO>();
		for (int i = 0; i < _ctx.lengthValue("CalculateSavingsPlansResponse.Data.Length"); i++) {
			SpnInstanceDTO spnInstanceDTO = new SpnInstanceDTO();
			spnInstanceDTO.setCommodityCode(_ctx.stringValue("CalculateSavingsPlansResponse.Data["+ i +"].CommodityCode"));
			spnInstanceDTO.setInstanceFamily(_ctx.stringValue("CalculateSavingsPlansResponse.Data["+ i +"].InstanceFamily"));
			spnInstanceDTO.setRegion(_ctx.stringValue("CalculateSavingsPlansResponse.Data["+ i +"].Region"));
			spnInstanceDTO.setCycle(_ctx.stringValue("CalculateSavingsPlansResponse.Data["+ i +"].Cycle"));
			spnInstanceDTO.setUserId(_ctx.longValue("CalculateSavingsPlansResponse.Data["+ i +"].UserId"));
			spnInstanceDTO.setSpnType(_ctx.stringValue("CalculateSavingsPlansResponse.Data["+ i +"].SpnType"));
			spnInstanceDTO.setPoolValue(_ctx.floatValue("CalculateSavingsPlansResponse.Data["+ i +"].PoolValue"));
			spnInstanceDTO.setCurrency(_ctx.stringValue("CalculateSavingsPlansResponse.Data["+ i +"].Currency"));
			spnInstanceDTO.setPayMode(_ctx.stringValue("CalculateSavingsPlansResponse.Data["+ i +"].PayMode"));

			data.add(spnInstanceDTO);
		}
		calculateSavingsPlansResponse.setData(data);
	 
	 	return calculateSavingsPlansResponse;
	}
}