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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeCourtNoticeResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeCourtNoticeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcJusticeCourtNoticeResponseUnmarshaller {

	public static GetOcJusticeCourtNoticeResponse unmarshall(GetOcJusticeCourtNoticeResponse getOcJusticeCourtNoticeResponse, UnmarshallerContext _ctx) {
		
		getOcJusticeCourtNoticeResponse.setRequestId(_ctx.stringValue("GetOcJusticeCourtNoticeResponse.RequestId"));
		getOcJusticeCourtNoticeResponse.setCode(_ctx.stringValue("GetOcJusticeCourtNoticeResponse.Code"));
		getOcJusticeCourtNoticeResponse.setSuccess(_ctx.booleanValue("GetOcJusticeCourtNoticeResponse.Success"));
		getOcJusticeCourtNoticeResponse.setMessage(_ctx.stringValue("GetOcJusticeCourtNoticeResponse.Message"));
		getOcJusticeCourtNoticeResponse.setTotalNum(_ctx.integerValue("GetOcJusticeCourtNoticeResponse.TotalNum"));
		getOcJusticeCourtNoticeResponse.setPageIndex(_ctx.integerValue("GetOcJusticeCourtNoticeResponse.PageIndex"));
		getOcJusticeCourtNoticeResponse.setPageNum(_ctx.integerValue("GetOcJusticeCourtNoticeResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcJusticeCourtNoticeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setParty(_ctx.stringValue("GetOcJusticeCourtNoticeResponse.Data["+ i +"].Party"));
			dataItem.setType(_ctx.stringValue("GetOcJusticeCourtNoticeResponse.Data["+ i +"].Type"));
			dataItem.setCourt(_ctx.stringValue("GetOcJusticeCourtNoticeResponse.Data["+ i +"].Court"));
			dataItem.setPublicDate(_ctx.stringValue("GetOcJusticeCourtNoticeResponse.Data["+ i +"].PublicDate"));
			dataItem.setContent(_ctx.stringValue("GetOcJusticeCourtNoticeResponse.Data["+ i +"].Content"));

			data.add(dataItem);
		}
		getOcJusticeCourtNoticeResponse.setData(data);
	 
	 	return getOcJusticeCourtNoticeResponse;
	}
}