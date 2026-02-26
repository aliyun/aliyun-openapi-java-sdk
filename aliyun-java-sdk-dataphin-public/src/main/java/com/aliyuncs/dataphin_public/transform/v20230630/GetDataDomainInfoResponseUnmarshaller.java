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

import com.aliyuncs.dataphin_public.model.v20230630.GetDataDomainInfoResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataDomainInfoResponse.DataDomainInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataDomainInfoResponseUnmarshaller {

	public static GetDataDomainInfoResponse unmarshall(GetDataDomainInfoResponse getDataDomainInfoResponse, UnmarshallerContext _ctx) {
		
		getDataDomainInfoResponse.setRequestId(_ctx.stringValue("GetDataDomainInfoResponse.RequestId"));
		getDataDomainInfoResponse.setSuccess(_ctx.booleanValue("GetDataDomainInfoResponse.Success"));
		getDataDomainInfoResponse.setHttpStatusCode(_ctx.integerValue("GetDataDomainInfoResponse.HttpStatusCode"));
		getDataDomainInfoResponse.setCode(_ctx.stringValue("GetDataDomainInfoResponse.Code"));
		getDataDomainInfoResponse.setMessage(_ctx.stringValue("GetDataDomainInfoResponse.Message"));

		DataDomainInfo dataDomainInfo = new DataDomainInfo();
		dataDomainInfo.setId(_ctx.longValue("GetDataDomainInfoResponse.DataDomainInfo.Id"));
		dataDomainInfo.setBizUnitId(_ctx.longValue("GetDataDomainInfoResponse.DataDomainInfo.BizUnitId"));
		dataDomainInfo.setName(_ctx.stringValue("GetDataDomainInfoResponse.DataDomainInfo.Name"));
		dataDomainInfo.setDisplayName(_ctx.stringValue("GetDataDomainInfoResponse.DataDomainInfo.DisplayName"));
		dataDomainInfo.setAbbreviation(_ctx.stringValue("GetDataDomainInfoResponse.DataDomainInfo.Abbreviation"));
		dataDomainInfo.setDescription(_ctx.stringValue("GetDataDomainInfoResponse.DataDomainInfo.Description"));
		dataDomainInfo.setOwnerUserId(_ctx.stringValue("GetDataDomainInfoResponse.DataDomainInfo.OwnerUserId"));
		dataDomainInfo.setOwnerName(_ctx.stringValue("GetDataDomainInfoResponse.DataDomainInfo.OwnerName"));
		dataDomainInfo.setGmtCreate(_ctx.stringValue("GetDataDomainInfoResponse.DataDomainInfo.GmtCreate"));
		dataDomainInfo.setGmtModified(_ctx.stringValue("GetDataDomainInfoResponse.DataDomainInfo.GmtModified"));
		dataDomainInfo.setLastModifier(_ctx.stringValue("GetDataDomainInfoResponse.DataDomainInfo.LastModifier"));
		dataDomainInfo.setLastModifierName(_ctx.stringValue("GetDataDomainInfoResponse.DataDomainInfo.LastModifierName"));
		dataDomainInfo.setParentId(_ctx.longValue("GetDataDomainInfoResponse.DataDomainInfo.ParentId"));
		getDataDomainInfoResponse.setDataDomainInfo(dataDomainInfo);
	 
	 	return getDataDomainInfoResponse;
	}
}