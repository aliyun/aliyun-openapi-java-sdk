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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeNetworkRuleAttributesResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeNetworkRuleAttributesResponse.NetworkRuleAttribute;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeNetworkRuleAttributesResponse.NetworkRuleAttribute.Config;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeNetworkRuleAttributesResponse.NetworkRuleAttribute.Config.Cc;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeNetworkRuleAttributesResponse.NetworkRuleAttribute.Config.Cc.SblackItem;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeNetworkRuleAttributesResponse.NetworkRuleAttribute.Config.PayloadLen;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeNetworkRuleAttributesResponse.NetworkRuleAttribute.Config.Sla;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeNetworkRuleAttributesResponse.NetworkRuleAttribute.Config.Slimit;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkRuleAttributesResponseUnmarshaller {

	public static DescribeNetworkRuleAttributesResponse unmarshall(DescribeNetworkRuleAttributesResponse describeNetworkRuleAttributesResponse, UnmarshallerContext _ctx) {
		
		describeNetworkRuleAttributesResponse.setRequestId(_ctx.stringValue("DescribeNetworkRuleAttributesResponse.RequestId"));

		List<NetworkRuleAttribute> networkRuleAttributes = new ArrayList<NetworkRuleAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes.Length"); i++) {
			NetworkRuleAttribute networkRuleAttribute = new NetworkRuleAttribute();
			networkRuleAttribute.setInstanceId(_ctx.stringValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].InstanceId"));
			networkRuleAttribute.setBizProtocol(_ctx.stringValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Protocol"));
			networkRuleAttribute.setFrontendPort(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].FrontendPort"));

			Config config = new Config();
			config.setPersistenceTimeout(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.PersistenceTimeout"));
			config.setSynproxy(_ctx.stringValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Synproxy"));
			config.setNodataConn(_ctx.stringValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.NodataConn"));

			Sla sla = new Sla();
			sla.setCps(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Sla.Cps"));
			sla.setMaxconn(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Sla.Maxconn"));
			sla.setCpsEnable(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Sla.CpsEnable"));
			sla.setMaxconnEnable(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Sla.MaxconnEnable"));
			config.setSla(sla);

			Slimit slimit = new Slimit();
			slimit.setCps(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Slimit.Cps"));
			slimit.setMaxconn(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Slimit.Maxconn"));
			slimit.setCpsEnable(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Slimit.CpsEnable"));
			slimit.setCpsMode(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Slimit.CpsMode"));
			slimit.setMaxconnEnable(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Slimit.MaxconnEnable"));
			slimit.setBps(_ctx.longValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Slimit.Bps"));
			slimit.setPps(_ctx.longValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Slimit.Pps"));
			config.setSlimit(slimit);

			PayloadLen payloadLen = new PayloadLen();
			payloadLen.setMin(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.PayloadLen.Min"));
			payloadLen.setMax(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.PayloadLen.Max"));
			config.setPayloadLen(payloadLen);

			Cc cc = new Cc();

			List<SblackItem> sblack = new ArrayList<SblackItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Cc.Sblack.Length"); j++) {
				SblackItem sblackItem = new SblackItem();
				sblackItem.setDuring(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Cc.Sblack["+ j +"].During"));
				sblackItem.setExpires(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Cc.Sblack["+ j +"].Expires"));
				sblackItem.setCnt(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Cc.Sblack["+ j +"].Cnt"));
				sblackItem.setType(_ctx.integerValue("DescribeNetworkRuleAttributesResponse.NetworkRuleAttributes["+ i +"].Config.Cc.Sblack["+ j +"].Type"));

				sblack.add(sblackItem);
			}
			cc.setSblack(sblack);
			config.setCc(cc);
			networkRuleAttribute.setConfig(config);

			networkRuleAttributes.add(networkRuleAttribute);
		}
		describeNetworkRuleAttributesResponse.setNetworkRuleAttributes(networkRuleAttributes);
	 
	 	return describeNetworkRuleAttributesResponse;
	}
}