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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.GetCdrsMonitorResultResponse;
import com.aliyuncs.cdrs.model.v20201101.GetCdrsMonitorResultResponse.Data;
import com.aliyuncs.cdrs.model.v20201101.GetCdrsMonitorResultResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCdrsMonitorResultResponseUnmarshaller {

	public static GetCdrsMonitorResultResponse unmarshall(GetCdrsMonitorResultResponse getCdrsMonitorResultResponse, UnmarshallerContext _ctx) {
		
		getCdrsMonitorResultResponse.setRequestId(_ctx.stringValue("GetCdrsMonitorResultResponse.RequestId"));
		getCdrsMonitorResultResponse.setCode(_ctx.stringValue("GetCdrsMonitorResultResponse.Code"));
		getCdrsMonitorResultResponse.setMessage(_ctx.stringValue("GetCdrsMonitorResultResponse.Message"));

		Data data = new Data();
		data.setMaxId(_ctx.stringValue("GetCdrsMonitorResultResponse.Data.MaxId"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCdrsMonitorResultResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setRightBottomY(_ctx.stringValue("GetCdrsMonitorResultResponse.Data.Records["+ i +"].RightBottomY"));
			recordsItem.setRightBottomX(_ctx.stringValue("GetCdrsMonitorResultResponse.Data.Records["+ i +"].RightBottomX"));
			recordsItem.setLeftUpY(_ctx.stringValue("GetCdrsMonitorResultResponse.Data.Records["+ i +"].LeftUpY"));
			recordsItem.setLeftUpX(_ctx.stringValue("GetCdrsMonitorResultResponse.Data.Records["+ i +"].LeftUpX"));
			recordsItem.setGbId(_ctx.stringValue("GetCdrsMonitorResultResponse.Data.Records["+ i +"].GbId"));
			recordsItem.setScore(_ctx.stringValue("GetCdrsMonitorResultResponse.Data.Records["+ i +"].Score"));
			recordsItem.setPicUrl(_ctx.stringValue("GetCdrsMonitorResultResponse.Data.Records["+ i +"].PicUrl"));
			recordsItem.setShotTime(_ctx.stringValue("GetCdrsMonitorResultResponse.Data.Records["+ i +"].ShotTime"));
			recordsItem.setMonitorPicUrl(_ctx.stringValue("GetCdrsMonitorResultResponse.Data.Records["+ i +"].MonitorPicUrl"));
			recordsItem.setTargetPicUrl(_ctx.stringValue("GetCdrsMonitorResultResponse.Data.Records["+ i +"].TargetPicUrl"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		getCdrsMonitorResultResponse.setData(data);
	 
	 	return getCdrsMonitorResultResponse;
	}
}