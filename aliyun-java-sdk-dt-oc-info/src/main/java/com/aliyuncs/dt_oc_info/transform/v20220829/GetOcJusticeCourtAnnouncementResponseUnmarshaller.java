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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeCourtAnnouncementResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeCourtAnnouncementResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcJusticeCourtAnnouncementResponseUnmarshaller {

	public static GetOcJusticeCourtAnnouncementResponse unmarshall(GetOcJusticeCourtAnnouncementResponse getOcJusticeCourtAnnouncementResponse, UnmarshallerContext _ctx) {
		
		getOcJusticeCourtAnnouncementResponse.setRequestId(_ctx.stringValue("GetOcJusticeCourtAnnouncementResponse.RequestId"));
		getOcJusticeCourtAnnouncementResponse.setCode(_ctx.stringValue("GetOcJusticeCourtAnnouncementResponse.Code"));
		getOcJusticeCourtAnnouncementResponse.setSuccess(_ctx.booleanValue("GetOcJusticeCourtAnnouncementResponse.Success"));
		getOcJusticeCourtAnnouncementResponse.setMessage(_ctx.stringValue("GetOcJusticeCourtAnnouncementResponse.Message"));
		getOcJusticeCourtAnnouncementResponse.setTotalNum(_ctx.integerValue("GetOcJusticeCourtAnnouncementResponse.TotalNum"));
		getOcJusticeCourtAnnouncementResponse.setPageIndex(_ctx.integerValue("GetOcJusticeCourtAnnouncementResponse.PageIndex"));
		getOcJusticeCourtAnnouncementResponse.setPageNum(_ctx.integerValue("GetOcJusticeCourtAnnouncementResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcJusticeCourtAnnouncementResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCauseAction(_ctx.stringValue("GetOcJusticeCourtAnnouncementResponse.Data["+ i +"].CauseAction"));
			dataItem.setCaseNum(_ctx.stringValue("GetOcJusticeCourtAnnouncementResponse.Data["+ i +"].CaseNum"));
			dataItem.setHearingDate(_ctx.stringValue("GetOcJusticeCourtAnnouncementResponse.Data["+ i +"].HearingDate"));
			dataItem.setDepartment(_ctx.stringValue("GetOcJusticeCourtAnnouncementResponse.Data["+ i +"].Department"));
			dataItem.setCourt(_ctx.stringValue("GetOcJusticeCourtAnnouncementResponse.Data["+ i +"].Court"));
			dataItem.setTribunal(_ctx.stringValue("GetOcJusticeCourtAnnouncementResponse.Data["+ i +"].Tribunal"));
			dataItem.setJudge(_ctx.stringValue("GetOcJusticeCourtAnnouncementResponse.Data["+ i +"].Judge"));
			dataItem.setTitle(_ctx.stringValue("GetOcJusticeCourtAnnouncementResponse.Data["+ i +"].Title"));
			dataItem.setParty(_ctx.stringValue("GetOcJusticeCourtAnnouncementResponse.Data["+ i +"].Party"));

			data.add(dataItem);
		}
		getOcJusticeCourtAnnouncementResponse.setData(data);
	 
	 	return getOcJusticeCourtAnnouncementResponse;
	}
}