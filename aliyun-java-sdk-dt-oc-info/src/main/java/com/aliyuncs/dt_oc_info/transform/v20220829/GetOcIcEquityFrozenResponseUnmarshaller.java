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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcEquityFrozenResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcEquityFrozenResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcEquityFrozenResponseUnmarshaller {

	public static GetOcIcEquityFrozenResponse unmarshall(GetOcIcEquityFrozenResponse getOcIcEquityFrozenResponse, UnmarshallerContext _ctx) {
		
		getOcIcEquityFrozenResponse.setRequestId(_ctx.stringValue("GetOcIcEquityFrozenResponse.RequestId"));
		getOcIcEquityFrozenResponse.setCode(_ctx.stringValue("GetOcIcEquityFrozenResponse.Code"));
		getOcIcEquityFrozenResponse.setSuccess(_ctx.booleanValue("GetOcIcEquityFrozenResponse.Success"));
		getOcIcEquityFrozenResponse.setMessage(_ctx.stringValue("GetOcIcEquityFrozenResponse.Message"));
		getOcIcEquityFrozenResponse.setTotalNum(_ctx.integerValue("GetOcIcEquityFrozenResponse.TotalNum"));
		getOcIcEquityFrozenResponse.setPageIndex(_ctx.integerValue("GetOcIcEquityFrozenResponse.PageIndex"));
		getOcIcEquityFrozenResponse.setPageNum(_ctx.integerValue("GetOcIcEquityFrozenResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcEquityFrozenResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatus(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].Status"));
			dataItem.setFreezeExecPerson(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].FreezeExecPerson"));
			dataItem.setFreezeAmount(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].FreezeAmount"));
			dataItem.setFreezeCourt(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].FreezeCourt"));
			dataItem.setFreezeNoticeNum(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].FreezeNoticeNum"));
			dataItem.setFreezePublishDate(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].FreezePublishDate"));
			dataItem.setFreezeCardType(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].FreezeCardType"));
			dataItem.setFreezeCardNum(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].FreezeCardNum"));
			dataItem.setFreezeExecItem(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].FreezeExecItem"));
			dataItem.setFreezeStartDate(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].FreezeStartDate"));
			dataItem.setFreezeEndDate(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].FreezeEndDate"));
			dataItem.setUnfreezeCourt(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].UnfreezeCourt"));
			dataItem.setUnfreezeAdjustNum(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].UnfreezeAdjustNum"));
			dataItem.setUnfreezeReason(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].UnfreezeReason"));
			dataItem.setUnfreezeDate(_ctx.stringValue("GetOcIcEquityFrozenResponse.Data["+ i +"].UnfreezeDate"));

			data.add(dataItem);
		}
		getOcIcEquityFrozenResponse.setData(data);
	 
	 	return getOcIcEquityFrozenResponse;
	}
}