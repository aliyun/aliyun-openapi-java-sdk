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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcSimpleCancelResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcSimpleCancelResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcSimpleCancelResponseUnmarshaller {

	public static GetOcIcSimpleCancelResponse unmarshall(GetOcIcSimpleCancelResponse getOcIcSimpleCancelResponse, UnmarshallerContext _ctx) {
		
		getOcIcSimpleCancelResponse.setRequestId(_ctx.stringValue("GetOcIcSimpleCancelResponse.RequestId"));
		getOcIcSimpleCancelResponse.setCode(_ctx.stringValue("GetOcIcSimpleCancelResponse.Code"));
		getOcIcSimpleCancelResponse.setSuccess(_ctx.booleanValue("GetOcIcSimpleCancelResponse.Success"));
		getOcIcSimpleCancelResponse.setMessage(_ctx.stringValue("GetOcIcSimpleCancelResponse.Message"));
		getOcIcSimpleCancelResponse.setTotalNum(_ctx.integerValue("GetOcIcSimpleCancelResponse.TotalNum"));
		getOcIcSimpleCancelResponse.setPageIndex(_ctx.integerValue("GetOcIcSimpleCancelResponse.PageIndex"));
		getOcIcSimpleCancelResponse.setPageNum(_ctx.integerValue("GetOcIcSimpleCancelResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcSimpleCancelResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcIcSimpleCancelResponse.Data["+ i +"].EntName"));
			dataItem.setSocialCreditCode(_ctx.stringValue("GetOcIcSimpleCancelResponse.Data["+ i +"].SocialCreditCode"));
			dataItem.setDepartment(_ctx.stringValue("GetOcIcSimpleCancelResponse.Data["+ i +"].Department"));
			dataItem.setNoticePeriod(_ctx.stringValue("GetOcIcSimpleCancelResponse.Data["+ i +"].NoticePeriod"));
			dataItem.setScaProposer(_ctx.stringValue("GetOcIcSimpleCancelResponse.Data["+ i +"].ScaProposer"));
			dataItem.setScaDate(_ctx.stringValue("GetOcIcSimpleCancelResponse.Data["+ i +"].ScaDate"));
			dataItem.setScaContent(_ctx.stringValue("GetOcIcSimpleCancelResponse.Data["+ i +"].ScaContent"));
			dataItem.setScaResult(_ctx.stringValue("GetOcIcSimpleCancelResponse.Data["+ i +"].ScaResult"));
			dataItem.setScaResultDate(_ctx.stringValue("GetOcIcSimpleCancelResponse.Data["+ i +"].ScaResultDate"));

			data.add(dataItem);
		}
		getOcIcSimpleCancelResponse.setData(data);
	 
	 	return getOcIcSimpleCancelResponse;
	}
}