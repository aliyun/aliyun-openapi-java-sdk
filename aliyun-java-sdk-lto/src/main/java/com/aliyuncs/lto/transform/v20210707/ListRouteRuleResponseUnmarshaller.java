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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.ListRouteRuleResponse;
import com.aliyuncs.lto.model.v20210707.ListRouteRuleResponse.Data;
import com.aliyuncs.lto.model.v20210707.ListRouteRuleResponse.Data.RouteRuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRouteRuleResponseUnmarshaller {

	public static ListRouteRuleResponse unmarshall(ListRouteRuleResponse listRouteRuleResponse, UnmarshallerContext _ctx) {
		
		listRouteRuleResponse.setRequestId(_ctx.stringValue("ListRouteRuleResponse.RequestId"));
		listRouteRuleResponse.setCode(_ctx.stringValue("ListRouteRuleResponse.Code"));
		listRouteRuleResponse.setHttpStatusCode(_ctx.integerValue("ListRouteRuleResponse.HttpStatusCode"));
		listRouteRuleResponse.setMessage(_ctx.stringValue("ListRouteRuleResponse.Message"));
		listRouteRuleResponse.setSuccess(_ctx.booleanValue("ListRouteRuleResponse.Success"));

		Data data = new Data();
		data.setNum(_ctx.integerValue("ListRouteRuleResponse.Data.Num"));
		data.setTotal(_ctx.integerValue("ListRouteRuleResponse.Data.Total"));
		data.setSize(_ctx.integerValue("ListRouteRuleResponse.Data.Size"));

		List<RouteRuleInfo> pageData = new ArrayList<RouteRuleInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListRouteRuleResponse.Data.PageData.Length"); i++) {
			RouteRuleInfo routeRuleInfo = new RouteRuleInfo();
			routeRuleInfo.setContractName(_ctx.stringValue("ListRouteRuleResponse.Data.PageData["+ i +"].ContractName"));
			routeRuleInfo.setDeviceGroupId(_ctx.stringValue("ListRouteRuleResponse.Data.PageData["+ i +"].DeviceGroupId"));
			routeRuleInfo.setRemark(_ctx.stringValue("ListRouteRuleResponse.Data.PageData["+ i +"].Remark"));
			routeRuleInfo.setDeviceGroupName(_ctx.stringValue("ListRouteRuleResponse.Data.PageData["+ i +"].DeviceGroupName"));
			routeRuleInfo.setPrivacyRuleId(_ctx.stringValue("ListRouteRuleResponse.Data.PageData["+ i +"].PrivacyRuleId"));
			routeRuleInfo.setBizChainId(_ctx.longValue("ListRouteRuleResponse.Data.PageData["+ i +"].BizChainId"));
			routeRuleInfo.setPrivacyRuleName(_ctx.stringValue("ListRouteRuleResponse.Data.PageData["+ i +"].PrivacyRuleName"));
			routeRuleInfo.setInvokeType(_ctx.stringValue("ListRouteRuleResponse.Data.PageData["+ i +"].InvokeType"));
			routeRuleInfo.setRouteRuleId(_ctx.stringValue("ListRouteRuleResponse.Data.PageData["+ i +"].RouteRuleId"));
			routeRuleInfo.setBizChainName(_ctx.stringValue("ListRouteRuleResponse.Data.PageData["+ i +"].BizChainName"));
			routeRuleInfo.setContractTemplateId(_ctx.stringValue("ListRouteRuleResponse.Data.PageData["+ i +"].ContractTemplateId"));
			routeRuleInfo.setBlockChainType(_ctx.stringValue("ListRouteRuleResponse.Data.PageData["+ i +"].BlockChainType"));
			routeRuleInfo.setChainUpMode(_ctx.stringValue("ListRouteRuleResponse.Data.PageData["+ i +"].ChainUpMode"));

			pageData.add(routeRuleInfo);
		}
		data.setPageData(pageData);
		listRouteRuleResponse.setData(data);
	 
	 	return listRouteRuleResponse;
	}
}