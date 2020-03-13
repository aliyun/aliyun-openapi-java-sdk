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

import com.aliyuncs.sofa.model.v20190815.GetDWSSubsDailyConsumedRecordResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsDailyConsumedRecordResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsDailyConsumedRecordResponse.Data.DpsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSSubsDailyConsumedRecordResponseUnmarshaller {

	public static GetDWSSubsDailyConsumedRecordResponse unmarshall(GetDWSSubsDailyConsumedRecordResponse getDWSSubsDailyConsumedRecordResponse, UnmarshallerContext _ctx) {
		
		getDWSSubsDailyConsumedRecordResponse.setRequestId(_ctx.stringValue("GetDWSSubsDailyConsumedRecordResponse.RequestId"));
		getDWSSubsDailyConsumedRecordResponse.setResultCode(_ctx.stringValue("GetDWSSubsDailyConsumedRecordResponse.ResultCode"));
		getDWSSubsDailyConsumedRecordResponse.setResultMessage(_ctx.stringValue("GetDWSSubsDailyConsumedRecordResponse.ResultMessage"));

		Data data = new Data();
		data.setEnd(_ctx.longValue("GetDWSSubsDailyConsumedRecordResponse.Data.End"));
		data.setStart(_ctx.longValue("GetDWSSubsDailyConsumedRecordResponse.Data.Start"));

		List<DpsItem> dps = new ArrayList<DpsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSSubsDailyConsumedRecordResponse.Data.Dps.Length"); i++) {
			DpsItem dpsItem = new DpsItem();
			dpsItem.setTimestamp(_ctx.longValue("GetDWSSubsDailyConsumedRecordResponse.Data.Dps["+ i +"].Timestamp"));
			dpsItem.setValue(_ctx.stringValue("GetDWSSubsDailyConsumedRecordResponse.Data.Dps["+ i +"].Value"));

			dps.add(dpsItem);
		}
		data.setDps(dps);
		getDWSSubsDailyConsumedRecordResponse.setData(data);
	 
	 	return getDWSSubsDailyConsumedRecordResponse;
	}
}