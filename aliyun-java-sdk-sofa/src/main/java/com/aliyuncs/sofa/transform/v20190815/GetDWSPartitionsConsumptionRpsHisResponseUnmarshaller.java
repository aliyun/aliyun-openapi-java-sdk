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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetDWSPartitionsConsumptionRpsHisResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSPartitionsConsumptionRpsHisResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetDWSPartitionsConsumptionRpsHisResponse.Data.DpsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSPartitionsConsumptionRpsHisResponseUnmarshaller {

	public static GetDWSPartitionsConsumptionRpsHisResponse unmarshall(GetDWSPartitionsConsumptionRpsHisResponse getDWSPartitionsConsumptionRpsHisResponse, UnmarshallerContext _ctx) {
		
		getDWSPartitionsConsumptionRpsHisResponse.setRequestId(_ctx.stringValue("GetDWSPartitionsConsumptionRpsHisResponse.RequestId"));
		getDWSPartitionsConsumptionRpsHisResponse.setResultCode(_ctx.stringValue("GetDWSPartitionsConsumptionRpsHisResponse.ResultCode"));
		getDWSPartitionsConsumptionRpsHisResponse.setResultMessage(_ctx.stringValue("GetDWSPartitionsConsumptionRpsHisResponse.ResultMessage"));

		Data data = new Data();
		data.setEnd(_ctx.longValue("GetDWSPartitionsConsumptionRpsHisResponse.Data.End"));
		data.setStart(_ctx.longValue("GetDWSPartitionsConsumptionRpsHisResponse.Data.Start"));

		List<DpsItem> dps = new ArrayList<DpsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSPartitionsConsumptionRpsHisResponse.Data.Dps.Length"); i++) {
			DpsItem dpsItem = new DpsItem();
			dpsItem.setTimestamp(_ctx.longValue("GetDWSPartitionsConsumptionRpsHisResponse.Data.Dps["+ i +"].Timestamp"));
			dpsItem.setValue(_ctx.stringValue("GetDWSPartitionsConsumptionRpsHisResponse.Data.Dps["+ i +"].Value"));

			dps.add(dpsItem);
		}
		data.setDps(dps);
		getDWSPartitionsConsumptionRpsHisResponse.setData(data);
	 
	 	return getDWSPartitionsConsumptionRpsHisResponse;
	}
}