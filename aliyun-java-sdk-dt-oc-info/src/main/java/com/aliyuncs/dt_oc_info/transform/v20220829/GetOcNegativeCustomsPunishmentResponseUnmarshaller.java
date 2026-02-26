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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcNegativeCustomsPunishmentResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcNegativeCustomsPunishmentResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcNegativeCustomsPunishmentResponseUnmarshaller {

	public static GetOcNegativeCustomsPunishmentResponse unmarshall(GetOcNegativeCustomsPunishmentResponse getOcNegativeCustomsPunishmentResponse, UnmarshallerContext _ctx) {
		
		getOcNegativeCustomsPunishmentResponse.setRequestId(_ctx.stringValue("GetOcNegativeCustomsPunishmentResponse.RequestId"));
		getOcNegativeCustomsPunishmentResponse.setCode(_ctx.stringValue("GetOcNegativeCustomsPunishmentResponse.Code"));
		getOcNegativeCustomsPunishmentResponse.setSuccess(_ctx.booleanValue("GetOcNegativeCustomsPunishmentResponse.Success"));
		getOcNegativeCustomsPunishmentResponse.setMessage(_ctx.stringValue("GetOcNegativeCustomsPunishmentResponse.Message"));
		getOcNegativeCustomsPunishmentResponse.setTotalNum(_ctx.integerValue("GetOcNegativeCustomsPunishmentResponse.TotalNum"));
		getOcNegativeCustomsPunishmentResponse.setPageIndex(_ctx.integerValue("GetOcNegativeCustomsPunishmentResponse.PageIndex"));
		getOcNegativeCustomsPunishmentResponse.setPageNum(_ctx.integerValue("GetOcNegativeCustomsPunishmentResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcNegativeCustomsPunishmentResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBasis(_ctx.stringValue("GetOcNegativeCustomsPunishmentResponse.Data["+ i +"].Basis"));
			dataItem.setTitle(_ctx.stringValue("GetOcNegativeCustomsPunishmentResponse.Data["+ i +"].Title"));
			dataItem.setPunishType(_ctx.stringValue("GetOcNegativeCustomsPunishmentResponse.Data["+ i +"].PunishType"));
			dataItem.setLegalName(_ctx.stringValue("GetOcNegativeCustomsPunishmentResponse.Data["+ i +"].LegalName"));
			dataItem.setCustoms(_ctx.stringValue("GetOcNegativeCustomsPunishmentResponse.Data["+ i +"].Customs"));
			dataItem.setPunishDate(_ctx.stringValue("GetOcNegativeCustomsPunishmentResponse.Data["+ i +"].PunishDate"));
			dataItem.setCustomsNo(_ctx.stringValue("GetOcNegativeCustomsPunishmentResponse.Data["+ i +"].CustomsNo"));
			dataItem.setCaseNo(_ctx.stringValue("GetOcNegativeCustomsPunishmentResponse.Data["+ i +"].CaseNo"));

			data.add(dataItem);
		}
		getOcNegativeCustomsPunishmentResponse.setData(data);
	 
	 	return getOcNegativeCustomsPunishmentResponse;
	}
}