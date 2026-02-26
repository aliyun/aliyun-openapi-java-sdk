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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcNegativeFoodDrugPunishmentResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcNegativeFoodDrugPunishmentResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcNegativeFoodDrugPunishmentResponseUnmarshaller {

	public static GetOcNegativeFoodDrugPunishmentResponse unmarshall(GetOcNegativeFoodDrugPunishmentResponse getOcNegativeFoodDrugPunishmentResponse, UnmarshallerContext _ctx) {
		
		getOcNegativeFoodDrugPunishmentResponse.setRequestId(_ctx.stringValue("GetOcNegativeFoodDrugPunishmentResponse.RequestId"));
		getOcNegativeFoodDrugPunishmentResponse.setCode(_ctx.stringValue("GetOcNegativeFoodDrugPunishmentResponse.Code"));
		getOcNegativeFoodDrugPunishmentResponse.setSuccess(_ctx.booleanValue("GetOcNegativeFoodDrugPunishmentResponse.Success"));
		getOcNegativeFoodDrugPunishmentResponse.setMessage(_ctx.stringValue("GetOcNegativeFoodDrugPunishmentResponse.Message"));
		getOcNegativeFoodDrugPunishmentResponse.setTotalNum(_ctx.integerValue("GetOcNegativeFoodDrugPunishmentResponse.TotalNum"));
		getOcNegativeFoodDrugPunishmentResponse.setPageIndex(_ctx.integerValue("GetOcNegativeFoodDrugPunishmentResponse.PageIndex"));
		getOcNegativeFoodDrugPunishmentResponse.setPageNum(_ctx.integerValue("GetOcNegativeFoodDrugPunishmentResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcNegativeFoodDrugPunishmentResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcNegativeFoodDrugPunishmentResponse.Data["+ i +"].EntName"));
			dataItem.setPunishNum(_ctx.stringValue("GetOcNegativeFoodDrugPunishmentResponse.Data["+ i +"].PunishNum"));
			dataItem.setIllegalType(_ctx.stringValue("GetOcNegativeFoodDrugPunishmentResponse.Data["+ i +"].IllegalType"));
			dataItem.setPunishResult(_ctx.stringValue("GetOcNegativeFoodDrugPunishmentResponse.Data["+ i +"].PunishResult"));
			dataItem.setDepartment(_ctx.stringValue("GetOcNegativeFoodDrugPunishmentResponse.Data["+ i +"].Department"));
			dataItem.setPunishDate(_ctx.stringValue("GetOcNegativeFoodDrugPunishmentResponse.Data["+ i +"].PunishDate"));
			dataItem.setLawBasis(_ctx.stringValue("GetOcNegativeFoodDrugPunishmentResponse.Data["+ i +"].LawBasis"));
			dataItem.setPublicDate(_ctx.stringValue("GetOcNegativeFoodDrugPunishmentResponse.Data["+ i +"].PublicDate"));

			data.add(dataItem);
		}
		getOcNegativeFoodDrugPunishmentResponse.setData(data);
	 
	 	return getOcNegativeFoodDrugPunishmentResponse;
	}
}