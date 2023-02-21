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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcNegativeQualityPunishmentResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcNegativeQualityPunishmentResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcNegativeQualityPunishmentResponseUnmarshaller {

	public static GetOcNegativeQualityPunishmentResponse unmarshall(GetOcNegativeQualityPunishmentResponse getOcNegativeQualityPunishmentResponse, UnmarshallerContext _ctx) {
		
		getOcNegativeQualityPunishmentResponse.setRequestId(_ctx.stringValue("GetOcNegativeQualityPunishmentResponse.RequestId"));
		getOcNegativeQualityPunishmentResponse.setCode(_ctx.stringValue("GetOcNegativeQualityPunishmentResponse.Code"));
		getOcNegativeQualityPunishmentResponse.setSuccess(_ctx.booleanValue("GetOcNegativeQualityPunishmentResponse.Success"));
		getOcNegativeQualityPunishmentResponse.setMessage(_ctx.stringValue("GetOcNegativeQualityPunishmentResponse.Message"));
		getOcNegativeQualityPunishmentResponse.setTotalNum(_ctx.integerValue("GetOcNegativeQualityPunishmentResponse.TotalNum"));
		getOcNegativeQualityPunishmentResponse.setPageIndex(_ctx.integerValue("GetOcNegativeQualityPunishmentResponse.PageIndex"));
		getOcNegativeQualityPunishmentResponse.setPageNum(_ctx.integerValue("GetOcNegativeQualityPunishmentResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcNegativeQualityPunishmentResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcNegativeQualityPunishmentResponse.Data["+ i +"].EntName"));
			dataItem.setTitle(_ctx.stringValue("GetOcNegativeQualityPunishmentResponse.Data["+ i +"].Title"));
			dataItem.setEventDate(_ctx.stringValue("GetOcNegativeQualityPunishmentResponse.Data["+ i +"].EventDate"));
			dataItem.setDepartment(_ctx.stringValue("GetOcNegativeQualityPunishmentResponse.Data["+ i +"].Department"));
			dataItem.setPubDate(_ctx.stringValue("GetOcNegativeQualityPunishmentResponse.Data["+ i +"].PubDate"));
			dataItem.setEventResult(_ctx.stringValue("GetOcNegativeQualityPunishmentResponse.Data["+ i +"].EventResult"));

			data.add(dataItem);
		}
		getOcNegativeQualityPunishmentResponse.setData(data);
	 
	 	return getOcNegativeQualityPunishmentResponse;
	}
}