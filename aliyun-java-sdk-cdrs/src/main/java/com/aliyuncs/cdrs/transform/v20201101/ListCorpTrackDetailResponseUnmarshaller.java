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

import com.aliyuncs.cdrs.model.v20201101.ListCorpTrackDetailResponse;
import com.aliyuncs.cdrs.model.v20201101.ListCorpTrackDetailResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCorpTrackDetailResponseUnmarshaller {

	public static ListCorpTrackDetailResponse unmarshall(ListCorpTrackDetailResponse listCorpTrackDetailResponse, UnmarshallerContext _ctx) {
		
		listCorpTrackDetailResponse.setRequestId(_ctx.stringValue("ListCorpTrackDetailResponse.RequestId"));
		listCorpTrackDetailResponse.setCode(_ctx.stringValue("ListCorpTrackDetailResponse.Code"));
		listCorpTrackDetailResponse.setMessage(_ctx.stringValue("ListCorpTrackDetailResponse.Message"));
		listCorpTrackDetailResponse.setSuccess(_ctx.stringValue("ListCorpTrackDetailResponse.Success"));
		listCorpTrackDetailResponse.setTotalCount(_ctx.integerValue("ListCorpTrackDetailResponse.TotalCount"));
		listCorpTrackDetailResponse.setPageSize(_ctx.integerValue("ListCorpTrackDetailResponse.PageSize"));
		listCorpTrackDetailResponse.setPageNumber(_ctx.integerValue("ListCorpTrackDetailResponse.PageNumber"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCorpTrackDetailResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDate(_ctx.stringValue("ListCorpTrackDetailResponse.Data["+ i +"].Date"));
			dataItem.setLastTime(_ctx.stringValue("ListCorpTrackDetailResponse.Data["+ i +"].LastTime"));
			dataItem.setStartTime(_ctx.stringValue("ListCorpTrackDetailResponse.Data["+ i +"].StartTime"));
			dataItem.setEndSourceImage(_ctx.stringValue("ListCorpTrackDetailResponse.Data["+ i +"].EndSourceImage"));
			dataItem.setDeviceId(_ctx.stringValue("ListCorpTrackDetailResponse.Data["+ i +"].DeviceId"));
			dataItem.setStartTargetImage(_ctx.stringValue("ListCorpTrackDetailResponse.Data["+ i +"].StartTargetImage"));
			dataItem.setGroupId(_ctx.stringValue("ListCorpTrackDetailResponse.Data["+ i +"].GroupId"));
			dataItem.setPersonId(_ctx.stringValue("ListCorpTrackDetailResponse.Data["+ i +"].PersonId"));
			dataItem.setStartSourceImage(_ctx.stringValue("ListCorpTrackDetailResponse.Data["+ i +"].StartSourceImage"));
			dataItem.setCorpId(_ctx.stringValue("ListCorpTrackDetailResponse.Data["+ i +"].CorpId"));
			dataItem.setEndTargetImage(_ctx.stringValue("ListCorpTrackDetailResponse.Data["+ i +"].EndTargetImage"));

			data.add(dataItem);
		}
		listCorpTrackDetailResponse.setData(data);
	 
	 	return listCorpTrackDetailResponse;
	}
}