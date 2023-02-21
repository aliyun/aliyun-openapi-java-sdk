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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpDomainResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpDomainResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIpDomainResponseUnmarshaller {

	public static GetOcIpDomainResponse unmarshall(GetOcIpDomainResponse getOcIpDomainResponse, UnmarshallerContext _ctx) {
		
		getOcIpDomainResponse.setRequestId(_ctx.stringValue("GetOcIpDomainResponse.RequestId"));
		getOcIpDomainResponse.setCode(_ctx.stringValue("GetOcIpDomainResponse.Code"));
		getOcIpDomainResponse.setSuccess(_ctx.booleanValue("GetOcIpDomainResponse.Success"));
		getOcIpDomainResponse.setMessage(_ctx.stringValue("GetOcIpDomainResponse.Message"));
		getOcIpDomainResponse.setTotalNum(_ctx.integerValue("GetOcIpDomainResponse.TotalNum"));
		getOcIpDomainResponse.setPageIndex(_ctx.integerValue("GetOcIpDomainResponse.PageIndex"));
		getOcIpDomainResponse.setPageNum(_ctx.integerValue("GetOcIpDomainResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIpDomainResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcIpDomainResponse.Data["+ i +"].EntName"));
			dataItem.setNumber(_ctx.stringValue("GetOcIpDomainResponse.Data["+ i +"].Number"));
			dataItem.setDomain(_ctx.stringValue("GetOcIpDomainResponse.Data["+ i +"].Domain"));
			dataItem.setSiteName(_ctx.stringValue("GetOcIpDomainResponse.Data["+ i +"].SiteName"));
			dataItem.setHomeUrl(_ctx.stringValue("GetOcIpDomainResponse.Data["+ i +"].HomeUrl"));
			dataItem.setCheckDate(_ctx.stringValue("GetOcIpDomainResponse.Data["+ i +"].CheckDate"));

			data.add(dataItem);
		}
		getOcIpDomainResponse.setData(data);
	 
	 	return getOcIpDomainResponse;
	}
}