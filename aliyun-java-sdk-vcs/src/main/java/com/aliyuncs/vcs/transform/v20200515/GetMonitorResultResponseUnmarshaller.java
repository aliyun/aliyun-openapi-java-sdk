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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.GetMonitorResultResponse;
import com.aliyuncs.vcs.model.v20200515.GetMonitorResultResponse.Data;
import com.aliyuncs.vcs.model.v20200515.GetMonitorResultResponse.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMonitorResultResponseUnmarshaller {

	public static GetMonitorResultResponse unmarshall(GetMonitorResultResponse getMonitorResultResponse, UnmarshallerContext _ctx) {
		
		getMonitorResultResponse.setRequestId(_ctx.stringValue("GetMonitorResultResponse.RequestId"));
		getMonitorResultResponse.setCode(_ctx.stringValue("GetMonitorResultResponse.Code"));
		getMonitorResultResponse.setMessage(_ctx.stringValue("GetMonitorResultResponse.Message"));
		getMonitorResultResponse.setScore(_ctx.stringValue("GetMonitorResultResponse.Score"));
		getMonitorResultResponse.setLeftTopX(_ctx.stringValue("GetMonitorResultResponse.LeftTopX"));
		getMonitorResultResponse.setLeftTopY(_ctx.stringValue("GetMonitorResultResponse.LeftTopY"));
		getMonitorResultResponse.setRightBottomX(_ctx.stringValue("GetMonitorResultResponse.RightBottomX"));
		getMonitorResultResponse.setRightBottomY(_ctx.stringValue("GetMonitorResultResponse.RightBottomY"));

		Data data = new Data();
		data.setMaxRecordId(_ctx.stringValue("GetMonitorResultResponse.Data.MaxRecordId"));
		getMonitorResultResponse.setData(data);

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMonitorResultResponse.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setGbId(_ctx.stringValue("GetMonitorResultResponse.Records["+ i +"].GbId"));
			recordsItem.setShotTime(_ctx.stringValue("GetMonitorResultResponse.Records["+ i +"].ShotTime"));
			recordsItem.setMonitorPicUrl(_ctx.stringValue("GetMonitorResultResponse.Records["+ i +"].MonitorPicUrl"));
			recordsItem.setShotPicUrl(_ctx.stringValue("GetMonitorResultResponse.Records["+ i +"].ShotPicUrl"));

			records.add(recordsItem);
		}
		getMonitorResultResponse.setRecords(records);
	 
	 	return getMonitorResultResponse;
	}
}