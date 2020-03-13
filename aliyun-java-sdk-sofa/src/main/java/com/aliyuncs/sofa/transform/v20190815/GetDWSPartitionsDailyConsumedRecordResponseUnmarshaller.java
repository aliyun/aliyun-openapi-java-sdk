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

import com.aliyuncs.sofa.model.v20190815.GetDWSPartitionsDailyConsumedRecordResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSPartitionsDailyConsumedRecordResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetDWSPartitionsDailyConsumedRecordResponse.Data.DpsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSPartitionsDailyConsumedRecordResponseUnmarshaller {

	public static GetDWSPartitionsDailyConsumedRecordResponse unmarshall(GetDWSPartitionsDailyConsumedRecordResponse getDWSPartitionsDailyConsumedRecordResponse, UnmarshallerContext _ctx) {
		
		getDWSPartitionsDailyConsumedRecordResponse.setRequestId(_ctx.stringValue("GetDWSPartitionsDailyConsumedRecordResponse.RequestId"));
		getDWSPartitionsDailyConsumedRecordResponse.setResultCode(_ctx.stringValue("GetDWSPartitionsDailyConsumedRecordResponse.ResultCode"));
		getDWSPartitionsDailyConsumedRecordResponse.setResultMessage(_ctx.stringValue("GetDWSPartitionsDailyConsumedRecordResponse.ResultMessage"));

		Data data = new Data();
		data.setEnd(_ctx.longValue("GetDWSPartitionsDailyConsumedRecordResponse.Data.End"));
		data.setStart(_ctx.longValue("GetDWSPartitionsDailyConsumedRecordResponse.Data.Start"));

		List<DpsItem> dps = new ArrayList<DpsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSPartitionsDailyConsumedRecordResponse.Data.Dps.Length"); i++) {
			DpsItem dpsItem = new DpsItem();
			dpsItem.setTimestamp(_ctx.longValue("GetDWSPartitionsDailyConsumedRecordResponse.Data.Dps["+ i +"].Timestamp"));
			dpsItem.setValue(_ctx.stringValue("GetDWSPartitionsDailyConsumedRecordResponse.Data.Dps["+ i +"].Value"));

			dps.add(dpsItem);
		}
		data.setDps(dps);
		getDWSPartitionsDailyConsumedRecordResponse.setData(data);
	 
	 	return getDWSPartitionsDailyConsumedRecordResponse;
	}
}