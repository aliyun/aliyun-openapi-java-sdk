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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListDataDomainsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataDomainsResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataDomainsResponse.Data.DataDomainInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataDomainsResponseUnmarshaller {

	public static ListDataDomainsResponse unmarshall(ListDataDomainsResponse listDataDomainsResponse, UnmarshallerContext _ctx) {
		
		listDataDomainsResponse.setRequestId(_ctx.stringValue("ListDataDomainsResponse.RequestId"));
		listDataDomainsResponse.setSuccess(_ctx.booleanValue("ListDataDomainsResponse.Success"));
		listDataDomainsResponse.setHttpStatusCode(_ctx.integerValue("ListDataDomainsResponse.HttpStatusCode"));
		listDataDomainsResponse.setCode(_ctx.stringValue("ListDataDomainsResponse.Code"));
		listDataDomainsResponse.setMessage(_ctx.stringValue("ListDataDomainsResponse.Message"));

		Data data = new Data();

		List<DataDomainInfo> dataDomainList = new ArrayList<DataDomainInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDataDomainsResponse.Data.DataDomainList.Length"); i++) {
			DataDomainInfo dataDomainInfo = new DataDomainInfo();
			dataDomainInfo.setId(_ctx.longValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].Id"));
			dataDomainInfo.setBizUnitId(_ctx.longValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].BizUnitId"));
			dataDomainInfo.setName(_ctx.stringValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].Name"));
			dataDomainInfo.setDisplayName(_ctx.stringValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].DisplayName"));
			dataDomainInfo.setAbbreviation(_ctx.stringValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].Abbreviation"));
			dataDomainInfo.setDescription(_ctx.stringValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].Description"));
			dataDomainInfo.setOwnerUserId(_ctx.stringValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].OwnerUserId"));
			dataDomainInfo.setOwnerName(_ctx.stringValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].OwnerName"));
			dataDomainInfo.setGmtCreate(_ctx.stringValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].GmtCreate"));
			dataDomainInfo.setGmtModified(_ctx.stringValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].GmtModified"));
			dataDomainInfo.setLastModifier(_ctx.stringValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].LastModifier"));
			dataDomainInfo.setLastModifierName(_ctx.stringValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].LastModifierName"));
			dataDomainInfo.setParentId(_ctx.longValue("ListDataDomainsResponse.Data.DataDomainList["+ i +"].ParentId"));

			dataDomainList.add(dataDomainInfo);
		}
		data.setDataDomainList(dataDomainList);
		listDataDomainsResponse.setData(data);
	 
	 	return listDataDomainsResponse;
	}
}