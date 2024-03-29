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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcTaxPunishmentResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcTaxPunishmentResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcTaxPunishmentResponseUnmarshaller {

	public static GetOcTaxPunishmentResponse unmarshall(GetOcTaxPunishmentResponse getOcTaxPunishmentResponse, UnmarshallerContext _ctx) {
		
		getOcTaxPunishmentResponse.setRequestId(_ctx.stringValue("GetOcTaxPunishmentResponse.RequestId"));
		getOcTaxPunishmentResponse.setCode(_ctx.stringValue("GetOcTaxPunishmentResponse.Code"));
		getOcTaxPunishmentResponse.setSuccess(_ctx.booleanValue("GetOcTaxPunishmentResponse.Success"));
		getOcTaxPunishmentResponse.setMessage(_ctx.stringValue("GetOcTaxPunishmentResponse.Message"));
		getOcTaxPunishmentResponse.setTotalNum(_ctx.integerValue("GetOcTaxPunishmentResponse.TotalNum"));
		getOcTaxPunishmentResponse.setPageIndex(_ctx.integerValue("GetOcTaxPunishmentResponse.PageIndex"));
		getOcTaxPunishmentResponse.setPageNum(_ctx.integerValue("GetOcTaxPunishmentResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcTaxPunishmentResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEventType(_ctx.stringValue("GetOcTaxPunishmentResponse.Data["+ i +"].EventType"));
			dataItem.setLegalName(_ctx.stringValue("GetOcTaxPunishmentResponse.Data["+ i +"].LegalName"));
			dataItem.setPunishDate(_ctx.stringValue("GetOcTaxPunishmentResponse.Data["+ i +"].PunishDate"));
			dataItem.setTaxpayerNum(_ctx.stringValue("GetOcTaxPunishmentResponse.Data["+ i +"].TaxpayerNum"));
			dataItem.setDepartment(_ctx.stringValue("GetOcTaxPunishmentResponse.Data["+ i +"].Department"));
			dataItem.setTitle(_ctx.stringValue("GetOcTaxPunishmentResponse.Data["+ i +"].Title"));
			dataItem.setEventName(_ctx.stringValue("GetOcTaxPunishmentResponse.Data["+ i +"].EventName"));
			dataItem.setEntName(_ctx.stringValue("GetOcTaxPunishmentResponse.Data["+ i +"].EntName"));

			data.add(dataItem);
		}
		getOcTaxPunishmentResponse.setData(data);
	 
	 	return getOcTaxPunishmentResponse;
	}
}