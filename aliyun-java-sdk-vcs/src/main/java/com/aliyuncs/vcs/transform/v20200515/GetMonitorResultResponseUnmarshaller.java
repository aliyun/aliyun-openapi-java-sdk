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
import com.aliyuncs.vcs.model.v20200515.GetMonitorResultResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMonitorResultResponseUnmarshaller {

	public static GetMonitorResultResponse unmarshall(GetMonitorResultResponse getMonitorResultResponse, UnmarshallerContext _ctx) {
		
		getMonitorResultResponse.setRequestId(_ctx.stringValue("GetMonitorResultResponse.RequestId"));
		getMonitorResultResponse.setCode(_ctx.stringValue("GetMonitorResultResponse.Code"));
		getMonitorResultResponse.setMessage(_ctx.stringValue("GetMonitorResultResponse.Message"));

		Data data = new Data();
		data.setMaxId(_ctx.stringValue("GetMonitorResultResponse.Data.MaxId"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMonitorResultResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setRightBottomY(_ctx.stringValue("GetMonitorResultResponse.Data.Records["+ i +"].RightBottomY"));
			recordsItem.setRightBottomX(_ctx.stringValue("GetMonitorResultResponse.Data.Records["+ i +"].RightBottomX"));
			recordsItem.setLeftUpY(_ctx.stringValue("GetMonitorResultResponse.Data.Records["+ i +"].LeftUpY"));
			recordsItem.setLeftUpX(_ctx.stringValue("GetMonitorResultResponse.Data.Records["+ i +"].LeftUpX"));
			recordsItem.setGbId(_ctx.stringValue("GetMonitorResultResponse.Data.Records["+ i +"].GbId"));
			recordsItem.setScore(_ctx.stringValue("GetMonitorResultResponse.Data.Records["+ i +"].Score"));
			recordsItem.setPicUrl(_ctx.stringValue("GetMonitorResultResponse.Data.Records["+ i +"].PicUrl"));
			recordsItem.setShotTime(_ctx.stringValue("GetMonitorResultResponse.Data.Records["+ i +"].ShotTime"));
			recordsItem.setMonitorPicUrl(_ctx.stringValue("GetMonitorResultResponse.Data.Records["+ i +"].MonitorPicUrl"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		getMonitorResultResponse.setData(data);
	 
	 	return getMonitorResultResponse;
	}
}