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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcNegativeEnvironmentPunishmentResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcNegativeEnvironmentPunishmentResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcNegativeEnvironmentPunishmentResponseUnmarshaller {

	public static GetOcNegativeEnvironmentPunishmentResponse unmarshall(GetOcNegativeEnvironmentPunishmentResponse getOcNegativeEnvironmentPunishmentResponse, UnmarshallerContext _ctx) {
		
		getOcNegativeEnvironmentPunishmentResponse.setRequestId(_ctx.stringValue("GetOcNegativeEnvironmentPunishmentResponse.RequestId"));
		getOcNegativeEnvironmentPunishmentResponse.setCode(_ctx.stringValue("GetOcNegativeEnvironmentPunishmentResponse.Code"));
		getOcNegativeEnvironmentPunishmentResponse.setSuccess(_ctx.booleanValue("GetOcNegativeEnvironmentPunishmentResponse.Success"));
		getOcNegativeEnvironmentPunishmentResponse.setMessage(_ctx.stringValue("GetOcNegativeEnvironmentPunishmentResponse.Message"));
		getOcNegativeEnvironmentPunishmentResponse.setTotalNum(_ctx.integerValue("GetOcNegativeEnvironmentPunishmentResponse.TotalNum"));
		getOcNegativeEnvironmentPunishmentResponse.setPageIndex(_ctx.integerValue("GetOcNegativeEnvironmentPunishmentResponse.PageIndex"));
		getOcNegativeEnvironmentPunishmentResponse.setPageNum(_ctx.integerValue("GetOcNegativeEnvironmentPunishmentResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcNegativeEnvironmentPunishmentResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcNegativeEnvironmentPunishmentResponse.Data["+ i +"].EntName"));
			dataItem.setPunishNum(_ctx.stringValue("GetOcNegativeEnvironmentPunishmentResponse.Data["+ i +"].PunishNum"));
			dataItem.setPunishLaw(_ctx.stringValue("GetOcNegativeEnvironmentPunishmentResponse.Data["+ i +"].PunishLaw"));
			dataItem.setPunishBasis(_ctx.stringValue("GetOcNegativeEnvironmentPunishmentResponse.Data["+ i +"].PunishBasis"));
			dataItem.setPunishRes(_ctx.stringValue("GetOcNegativeEnvironmentPunishmentResponse.Data["+ i +"].PunishRes"));
			dataItem.setDepartment(_ctx.stringValue("GetOcNegativeEnvironmentPunishmentResponse.Data["+ i +"].Department"));
			dataItem.setPunishDate(_ctx.stringValue("GetOcNegativeEnvironmentPunishmentResponse.Data["+ i +"].PunishDate"));
			dataItem.setExecStatus(_ctx.stringValue("GetOcNegativeEnvironmentPunishmentResponse.Data["+ i +"].ExecStatus"));
			dataItem.setPunishContent(_ctx.stringValue("GetOcNegativeEnvironmentPunishmentResponse.Data["+ i +"].PunishContent"));

			data.add(dataItem);
		}
		getOcNegativeEnvironmentPunishmentResponse.setData(data);
	 
	 	return getOcNegativeEnvironmentPunishmentResponse;
	}
}