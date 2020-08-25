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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyAppResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyAppResponse.ListItem;
import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyAppResponse.ListItem.AppConfig;
import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyAppResponse.ListItem.AppConfig.Blacklist;
import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyAppResponse.ListItem.AppConfig.Blacklist.InBoundItem;
import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyAppResponse.ListItem.AppConfig.Blacklist.InBoundItem.IpRangeItem;
import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyAppResponse.ListItem.AppConfig.Blacklist.InBoundItem.PortRangeItem;
import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyAppResponse.ListItem.AppConfig.Blacklist.OutBoundItem;
import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyAppResponse.ListItem.AppConfig.Blacklist.OutBoundItem.IpRangeItem3;
import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyAppResponse.ListItem.AppConfig.Blacklist.OutBoundItem.PortRangeItem4;
import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyAppResponse.ListItem.SupportProtocolsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsTransparentProxyAppResponseUnmarshaller {

	public static QueryMsTransparentProxyAppResponse unmarshall(QueryMsTransparentProxyAppResponse queryMsTransparentProxyAppResponse, UnmarshallerContext _ctx) {
		
		queryMsTransparentProxyAppResponse.setRequestId(_ctx.stringValue("QueryMsTransparentProxyAppResponse.RequestId"));
		queryMsTransparentProxyAppResponse.setResultCode(_ctx.stringValue("QueryMsTransparentProxyAppResponse.ResultCode"));
		queryMsTransparentProxyAppResponse.setResultMessage(_ctx.stringValue("QueryMsTransparentProxyAppResponse.ResultMessage"));
		queryMsTransparentProxyAppResponse.setCurrentPage(_ctx.longValue("QueryMsTransparentProxyAppResponse.CurrentPage"));
		queryMsTransparentProxyAppResponse.setPageSize(_ctx.longValue("QueryMsTransparentProxyAppResponse.PageSize"));
		queryMsTransparentProxyAppResponse.setStartIndex(_ctx.longValue("QueryMsTransparentProxyAppResponse.StartIndex"));
		queryMsTransparentProxyAppResponse.setTotalSize(_ctx.longValue("QueryMsTransparentProxyAppResponse.TotalSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsTransparentProxyAppResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setAppName(_ctx.stringValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppName"));
			listItem.setId(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].Id"));
			listItem.setInstanceId(_ctx.stringValue("QueryMsTransparentProxyAppResponse.List["+ i +"].InstanceId"));
			listItem.setNodeNum(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].NodeNum"));
			listItem.setOpenNum(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].OpenNum"));
			listItem.setRunNum(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].RunNum"));

			AppConfig appConfig = new AppConfig();

			Blacklist blacklist = new Blacklist();

			List<InBoundItem> inBound = new ArrayList<InBoundItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.InBound.Length"); j++) {
				InBoundItem inBoundItem = new InBoundItem();

				List<IpRangeItem> ipRange = new ArrayList<IpRangeItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.InBound["+ j +"].IpRange.Length"); k++) {
					IpRangeItem ipRangeItem = new IpRangeItem();
					ipRangeItem.setDefaultValue(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.InBound["+ j +"].IpRange["+ k +"].DefaultValue"));
					ipRangeItem.setEndIp(_ctx.stringValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.InBound["+ j +"].IpRange["+ k +"].EndIp"));
					ipRangeItem.setStartIp(_ctx.stringValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.InBound["+ j +"].IpRange["+ k +"].StartIp"));

					ipRange.add(ipRangeItem);
				}
				inBoundItem.setIpRange(ipRange);

				List<PortRangeItem> portRange = new ArrayList<PortRangeItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.InBound["+ j +"].PortRange.Length"); k++) {
					PortRangeItem portRangeItem = new PortRangeItem();
					portRangeItem.setDefaultValue(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.InBound["+ j +"].PortRange["+ k +"].DefaultValue"));
					portRangeItem.setEndPort(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.InBound["+ j +"].PortRange["+ k +"].EndPort"));
					portRangeItem.setStartPort(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.InBound["+ j +"].PortRange["+ k +"].StartPort"));

					portRange.add(portRangeItem);
				}
				inBoundItem.setPortRange(portRange);

				inBound.add(inBoundItem);
			}
			blacklist.setInBound(inBound);

			List<OutBoundItem> outBound = new ArrayList<OutBoundItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.OutBound.Length"); j++) {
				OutBoundItem outBoundItem = new OutBoundItem();

				List<IpRangeItem3> ipRange1 = new ArrayList<IpRangeItem3>();
				for (int k = 0; k < _ctx.lengthValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.OutBound["+ j +"].IpRange.Length"); k++) {
					IpRangeItem3 ipRangeItem3 = new IpRangeItem3();
					ipRangeItem3.setDefaultValue(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.OutBound["+ j +"].IpRange["+ k +"].DefaultValue"));
					ipRangeItem3.setEndIp(_ctx.stringValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.OutBound["+ j +"].IpRange["+ k +"].EndIp"));
					ipRangeItem3.setStartIp(_ctx.stringValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.OutBound["+ j +"].IpRange["+ k +"].StartIp"));

					ipRange1.add(ipRangeItem3);
				}
				outBoundItem.setIpRange1(ipRange1);

				List<PortRangeItem4> portRange2 = new ArrayList<PortRangeItem4>();
				for (int k = 0; k < _ctx.lengthValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.OutBound["+ j +"].PortRange.Length"); k++) {
					PortRangeItem4 portRangeItem4 = new PortRangeItem4();
					portRangeItem4.setDefaultValue(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.OutBound["+ j +"].PortRange["+ k +"].DefaultValue"));
					portRangeItem4.setEndPort(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.OutBound["+ j +"].PortRange["+ k +"].EndPort"));
					portRangeItem4.setStartPort(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].AppConfig.Blacklist.OutBound["+ j +"].PortRange["+ k +"].StartPort"));

					portRange2.add(portRangeItem4);
				}
				outBoundItem.setPortRange2(portRange2);

				outBound.add(outBoundItem);
			}
			blacklist.setOutBound(outBound);
			appConfig.setBlacklist(blacklist);
			listItem.setAppConfig(appConfig);

			List<SupportProtocolsItem> supportProtocols = new ArrayList<SupportProtocolsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMsTransparentProxyAppResponse.List["+ i +"].SupportProtocols.Length"); j++) {
				SupportProtocolsItem supportProtocolsItem = new SupportProtocolsItem();
				supportProtocolsItem.setMaxReq(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].SupportProtocols["+ j +"].MaxReq"));
				supportProtocolsItem.setPort(_ctx.longValue("QueryMsTransparentProxyAppResponse.List["+ i +"].SupportProtocols["+ j +"].Port"));
				supportProtocolsItem.setBizProtocol(_ctx.stringValue("QueryMsTransparentProxyAppResponse.List["+ i +"].SupportProtocols["+ j +"].Protocol"));

				supportProtocols.add(supportProtocolsItem);
			}
			listItem.setSupportProtocols(supportProtocols);

			list.add(listItem);
		}
		queryMsTransparentProxyAppResponse.setList(list);
	 
	 	return queryMsTransparentProxyAppResponse;
	}
}