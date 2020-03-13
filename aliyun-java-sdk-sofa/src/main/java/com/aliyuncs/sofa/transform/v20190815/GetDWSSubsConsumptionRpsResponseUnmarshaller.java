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

import com.aliyuncs.sofa.model.v20190815.GetDWSSubsConsumptionRpsResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsConsumptionRpsResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsConsumptionRpsResponse.Data.DpsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSSubsConsumptionRpsResponseUnmarshaller {

	public static GetDWSSubsConsumptionRpsResponse unmarshall(GetDWSSubsConsumptionRpsResponse getDWSSubsConsumptionRpsResponse, UnmarshallerContext _ctx) {
		
		getDWSSubsConsumptionRpsResponse.setRequestId(_ctx.stringValue("GetDWSSubsConsumptionRpsResponse.RequestId"));
		getDWSSubsConsumptionRpsResponse.setResultCode(_ctx.stringValue("GetDWSSubsConsumptionRpsResponse.ResultCode"));
		getDWSSubsConsumptionRpsResponse.setResultMessage(_ctx.stringValue("GetDWSSubsConsumptionRpsResponse.ResultMessage"));

		Data data = new Data();
		data.setEnd(_ctx.longValue("GetDWSSubsConsumptionRpsResponse.Data.End"));
		data.setStart(_ctx.longValue("GetDWSSubsConsumptionRpsResponse.Data.Start"));

		List<DpsItem> dps = new ArrayList<DpsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSSubsConsumptionRpsResponse.Data.Dps.Length"); i++) {
			DpsItem dpsItem = new DpsItem();
			dpsItem.setTimestamp(_ctx.longValue("GetDWSSubsConsumptionRpsResponse.Data.Dps["+ i +"].Timestamp"));
			dpsItem.setValue(_ctx.stringValue("GetDWSSubsConsumptionRpsResponse.Data.Dps["+ i +"].Value"));

			dps.add(dpsItem);
		}
		data.setDps(dps);
		getDWSSubsConsumptionRpsResponse.setData(data);
	 
	 	return getDWSSubsConsumptionRpsResponse;
	}
}