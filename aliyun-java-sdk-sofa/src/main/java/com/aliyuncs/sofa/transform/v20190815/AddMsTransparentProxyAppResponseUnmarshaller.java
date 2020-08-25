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

import com.aliyuncs.sofa.model.v20190815.AddMsTransparentProxyAppResponse;
import com.aliyuncs.sofa.model.v20190815.AddMsTransparentProxyAppResponse.Data;
import com.aliyuncs.sofa.model.v20190815.AddMsTransparentProxyAppResponse.Data.AppConfig;
import com.aliyuncs.sofa.model.v20190815.AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist;
import com.aliyuncs.sofa.model.v20190815.AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.InBoundItem;
import com.aliyuncs.sofa.model.v20190815.AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.InBoundItem.IpRangeItem;
import com.aliyuncs.sofa.model.v20190815.AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.InBoundItem.PortRangeItem;
import com.aliyuncs.sofa.model.v20190815.AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.OutBoundItem;
import com.aliyuncs.sofa.model.v20190815.AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.OutBoundItem.IpRangeItem3;
import com.aliyuncs.sofa.model.v20190815.AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.OutBoundItem.PortRangeItem4;
import com.aliyuncs.sofa.model.v20190815.AddMsTransparentProxyAppResponse.Data.SupportProtocolsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMsTransparentProxyAppResponseUnmarshaller {

	public static AddMsTransparentProxyAppResponse unmarshall(AddMsTransparentProxyAppResponse addMsTransparentProxyAppResponse, UnmarshallerContext _ctx) {
		
		addMsTransparentProxyAppResponse.setRequestId(_ctx.stringValue("AddMsTransparentProxyAppResponse.RequestId"));
		addMsTransparentProxyAppResponse.setResultCode(_ctx.stringValue("AddMsTransparentProxyAppResponse.ResultCode"));
		addMsTransparentProxyAppResponse.setResultMessage(_ctx.stringValue("AddMsTransparentProxyAppResponse.ResultMessage"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("AddMsTransparentProxyAppResponse.Data.AppName"));
		data.setId(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.Id"));
		data.setInstanceId(_ctx.stringValue("AddMsTransparentProxyAppResponse.Data.InstanceId"));
		data.setNodeNum(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.NodeNum"));
		data.setOpenNum(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.OpenNum"));
		data.setRunNum(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.RunNum"));

		AppConfig appConfig = new AppConfig();

		Blacklist blacklist = new Blacklist();

		List<InBoundItem> inBound = new ArrayList<InBoundItem>();
		for (int i = 0; i < _ctx.lengthValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.InBound.Length"); i++) {
			InBoundItem inBoundItem = new InBoundItem();

			List<IpRangeItem> ipRange = new ArrayList<IpRangeItem>();
			for (int j = 0; j < _ctx.lengthValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.InBound["+ i +"].IpRange.Length"); j++) {
				IpRangeItem ipRangeItem = new IpRangeItem();
				ipRangeItem.setDefaultValue(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.InBound["+ i +"].IpRange["+ j +"].DefaultValue"));
				ipRangeItem.setEndIp(_ctx.stringValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.InBound["+ i +"].IpRange["+ j +"].EndIp"));
				ipRangeItem.setStartIp(_ctx.stringValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.InBound["+ i +"].IpRange["+ j +"].StartIp"));

				ipRange.add(ipRangeItem);
			}
			inBoundItem.setIpRange(ipRange);

			List<PortRangeItem> portRange = new ArrayList<PortRangeItem>();
			for (int j = 0; j < _ctx.lengthValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.InBound["+ i +"].PortRange.Length"); j++) {
				PortRangeItem portRangeItem = new PortRangeItem();
				portRangeItem.setDefaultValue(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.InBound["+ i +"].PortRange["+ j +"].DefaultValue"));
				portRangeItem.setEndPort(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.InBound["+ i +"].PortRange["+ j +"].EndPort"));
				portRangeItem.setStartPort(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.InBound["+ i +"].PortRange["+ j +"].StartPort"));

				portRange.add(portRangeItem);
			}
			inBoundItem.setPortRange(portRange);

			inBound.add(inBoundItem);
		}
		blacklist.setInBound(inBound);

		List<OutBoundItem> outBound = new ArrayList<OutBoundItem>();
		for (int i = 0; i < _ctx.lengthValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.OutBound.Length"); i++) {
			OutBoundItem outBoundItem = new OutBoundItem();

			List<IpRangeItem3> ipRange1 = new ArrayList<IpRangeItem3>();
			for (int j = 0; j < _ctx.lengthValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.OutBound["+ i +"].IpRange.Length"); j++) {
				IpRangeItem3 ipRangeItem3 = new IpRangeItem3();
				ipRangeItem3.setDefaultValue(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.OutBound["+ i +"].IpRange["+ j +"].DefaultValue"));
				ipRangeItem3.setEndIp(_ctx.stringValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.OutBound["+ i +"].IpRange["+ j +"].EndIp"));
				ipRangeItem3.setStartIp(_ctx.stringValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.OutBound["+ i +"].IpRange["+ j +"].StartIp"));

				ipRange1.add(ipRangeItem3);
			}
			outBoundItem.setIpRange1(ipRange1);

			List<PortRangeItem4> portRange2 = new ArrayList<PortRangeItem4>();
			for (int j = 0; j < _ctx.lengthValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.OutBound["+ i +"].PortRange.Length"); j++) {
				PortRangeItem4 portRangeItem4 = new PortRangeItem4();
				portRangeItem4.setDefaultValue(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.OutBound["+ i +"].PortRange["+ j +"].DefaultValue"));
				portRangeItem4.setEndPort(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.OutBound["+ i +"].PortRange["+ j +"].EndPort"));
				portRangeItem4.setStartPort(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.AppConfig.Blacklist.OutBound["+ i +"].PortRange["+ j +"].StartPort"));

				portRange2.add(portRangeItem4);
			}
			outBoundItem.setPortRange2(portRange2);

			outBound.add(outBoundItem);
		}
		blacklist.setOutBound(outBound);
		appConfig.setBlacklist(blacklist);
		data.setAppConfig(appConfig);

		List<SupportProtocolsItem> supportProtocols = new ArrayList<SupportProtocolsItem>();
		for (int i = 0; i < _ctx.lengthValue("AddMsTransparentProxyAppResponse.Data.SupportProtocols.Length"); i++) {
			SupportProtocolsItem supportProtocolsItem = new SupportProtocolsItem();
			supportProtocolsItem.setMaxReq(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.SupportProtocols["+ i +"].MaxReq"));
			supportProtocolsItem.setPort(_ctx.longValue("AddMsTransparentProxyAppResponse.Data.SupportProtocols["+ i +"].Port"));
			supportProtocolsItem.setBizProtocol(_ctx.stringValue("AddMsTransparentProxyAppResponse.Data.SupportProtocols["+ i +"].Protocol"));

			supportProtocols.add(supportProtocolsItem);
		}
		data.setSupportProtocols(supportProtocols);
		addMsTransparentProxyAppResponse.setData(data);
	 
	 	return addMsTransparentProxyAppResponse;
	}
}