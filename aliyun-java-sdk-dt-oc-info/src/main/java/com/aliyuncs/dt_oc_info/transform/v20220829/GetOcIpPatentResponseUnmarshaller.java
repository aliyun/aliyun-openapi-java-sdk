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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpPatentResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpPatentResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIpPatentResponseUnmarshaller {

	public static GetOcIpPatentResponse unmarshall(GetOcIpPatentResponse getOcIpPatentResponse, UnmarshallerContext _ctx) {
		
		getOcIpPatentResponse.setRequestId(_ctx.stringValue("GetOcIpPatentResponse.RequestId"));
		getOcIpPatentResponse.setCode(_ctx.stringValue("GetOcIpPatentResponse.Code"));
		getOcIpPatentResponse.setSuccess(_ctx.booleanValue("GetOcIpPatentResponse.Success"));
		getOcIpPatentResponse.setMessage(_ctx.stringValue("GetOcIpPatentResponse.Message"));
		getOcIpPatentResponse.setTotalNum(_ctx.integerValue("GetOcIpPatentResponse.TotalNum"));
		getOcIpPatentResponse.setPageIndex(_ctx.integerValue("GetOcIpPatentResponse.PageIndex"));
		getOcIpPatentResponse.setPageNum(_ctx.integerValue("GetOcIpPatentResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIpPatentResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].EntName"));
			dataItem.setPatentType(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].PatentType"));
			dataItem.setPatentName(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].PatentName"));
			dataItem.setPatentStatus(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].PatentStatus"));
			dataItem.setRequestNum(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].RequestNum"));
			dataItem.setRequestDate(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].RequestDate"));
			dataItem.setPublicNum(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].PublicNum"));
			dataItem.setPublicDate(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].PublicDate"));
			dataItem.setInventorList(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].InventorList"));
			dataItem.setPatenteeList(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].PatenteeList"));
			dataItem.setCateNum(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].CateNum"));
			dataItem.setPrioNum(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].PrioNum"));
			dataItem.setPrioDate(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].PrioDate"));
			dataItem.setAgency(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].Agency"));
			dataItem.setAgent(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].Agent"));
			dataItem.setBrief(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].Brief"));
			dataItem.setMainClaim(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"].MainClaim"));

			data.add(dataItem);
		}
		getOcIpPatentResponse.setData(data);
	 
	 	return getOcIpPatentResponse;
	}
}