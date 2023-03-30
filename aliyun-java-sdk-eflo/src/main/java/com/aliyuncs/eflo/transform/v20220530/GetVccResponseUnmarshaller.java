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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.GetVccResponse;
import com.aliyuncs.eflo.model.v20220530.GetVccResponse.Content;
import com.aliyuncs.eflo.model.v20220530.GetVccResponse.Content.AliyunRouterInfoItem;
import com.aliyuncs.eflo.model.v20220530.GetVccResponse.Content.CisRouterInfoItem;
import com.aliyuncs.eflo.model.v20220530.GetVccResponse.Content.CisRouterInfoItem.CcInfo;
import com.aliyuncs.eflo.model.v20220530.GetVccResponse.Content.ErInfo;
import com.aliyuncs.eflo.model.v20220530.GetVccResponse.Content.Tag;
import com.aliyuncs.eflo.model.v20220530.GetVccResponse.Content.VpdBaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVccResponseUnmarshaller {

	public static GetVccResponse unmarshall(GetVccResponse getVccResponse, UnmarshallerContext _ctx) {
		
		getVccResponse.setRequestId(_ctx.stringValue("GetVccResponse.RequestId"));
		getVccResponse.setCode(_ctx.integerValue("GetVccResponse.Code"));
		getVccResponse.setMessage(_ctx.stringValue("GetVccResponse.Message"));

		Content content = new Content();
		content.setTenantId(_ctx.stringValue("GetVccResponse.Content.TenantId"));
		content.setRegionId(_ctx.stringValue("GetVccResponse.Content.RegionId"));
		content.setZoneId(_ctx.stringValue("GetVccResponse.Content.ZoneId"));
		content.setVccId(_ctx.stringValue("GetVccResponse.Content.VccId"));
		content.setVpdId(_ctx.stringValue("GetVccResponse.Content.VpdId"));
		content.setVpcId(_ctx.stringValue("GetVccResponse.Content.VpcId"));
		content.setVSwitchId(_ctx.stringValue("GetVccResponse.Content.VSwitchId"));
		content.setCenId(_ctx.stringValue("GetVccResponse.Content.CenId"));
		content.setVccName(_ctx.stringValue("GetVccResponse.Content.VccName"));
		content.setAccessPointId(_ctx.stringValue("GetVccResponse.Content.AccessPointId"));
		content.setLineOperator(_ctx.stringValue("GetVccResponse.Content.LineOperator"));
		content.setSpec(_ctx.stringValue("GetVccResponse.Content.Spec"));
		content.setPortType(_ctx.stringValue("GetVccResponse.Content.PortType"));
		content.setPricingCycle(_ctx.stringValue("GetVccResponse.Content.PricingCycle"));
		content.setPayType(_ctx.stringValue("GetVccResponse.Content.PayType"));
		content.setDuration(_ctx.stringValue("GetVccResponse.Content.Duration"));
		content.setStatus(_ctx.stringValue("GetVccResponse.Content.Status"));
		content.setCurrentNode(_ctx.stringValue("GetVccResponse.Content.CurrentNode"));
		content.setInternetChargeType(_ctx.stringValue("GetVccResponse.Content.InternetChargeType"));
		content.setBandwidthStr(_ctx.stringValue("GetVccResponse.Content.BandwidthStr"));
		content.setMessage(_ctx.stringValue("GetVccResponse.Content.Message"));
		content.setCreateTime(_ctx.stringValue("GetVccResponse.Content.CreateTime"));
		content.setGmtModified(_ctx.stringValue("GetVccResponse.Content.GmtModified"));
		content.setCommodityCode(_ctx.stringValue("GetVccResponse.Content.CommodityCode"));
		content.setBgpCidr(_ctx.stringValue("GetVccResponse.Content.BgpCidr"));
		content.setExpirationDate(_ctx.stringValue("GetVccResponse.Content.ExpirationDate"));
		content.setAttachErStatus(_ctx.booleanValue("GetVccResponse.Content.AttachErStatus"));
		content.setResourceGroupId(_ctx.stringValue("GetVccResponse.Content.ResourceGroupId"));
		content.setConnectionType(_ctx.stringValue("GetVccResponse.Content.ConnectionType"));

		VpdBaseInfo vpdBaseInfo = new VpdBaseInfo();
		vpdBaseInfo.setVpdId(_ctx.stringValue("GetVccResponse.Content.VpdBaseInfo.VpdId"));
		vpdBaseInfo.setVpdName(_ctx.stringValue("GetVccResponse.Content.VpdBaseInfo.VpdName"));
		vpdBaseInfo.setCidr(_ctx.stringValue("GetVccResponse.Content.VpdBaseInfo.Cidr"));
		vpdBaseInfo.setCreateTime(_ctx.stringValue("GetVccResponse.Content.VpdBaseInfo.CreateTime"));
		content.setVpdBaseInfo(vpdBaseInfo);

		List<ErInfo> erInfos = new ArrayList<ErInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetVccResponse.Content.ErInfos.Length"); i++) {
			ErInfo erInfo = new ErInfo();
			erInfo.setCreateTime(_ctx.stringValue("GetVccResponse.Content.ErInfos["+ i +"].CreateTime"));
			erInfo.setGmtModified(_ctx.stringValue("GetVccResponse.Content.ErInfos["+ i +"].GmtModified"));
			erInfo.setMessage(_ctx.stringValue("GetVccResponse.Content.ErInfos["+ i +"].Message"));
			erInfo.setErId(_ctx.stringValue("GetVccResponse.Content.ErInfos["+ i +"].ErId"));
			erInfo.setRegionId(_ctx.stringValue("GetVccResponse.Content.ErInfos["+ i +"].RegionId"));
			erInfo.setTenantId(_ctx.stringValue("GetVccResponse.Content.ErInfos["+ i +"].TenantId"));
			erInfo.setStatus(_ctx.stringValue("GetVccResponse.Content.ErInfos["+ i +"].Status"));
			erInfo.setErName(_ctx.stringValue("GetVccResponse.Content.ErInfos["+ i +"].ErName"));
			erInfo.setMasterZoneId(_ctx.stringValue("GetVccResponse.Content.ErInfos["+ i +"].MasterZoneId"));
			erInfo.setDescription(_ctx.stringValue("GetVccResponse.Content.ErInfos["+ i +"].Description"));
			erInfo.setConnections(_ctx.longValue("GetVccResponse.Content.ErInfos["+ i +"].Connections"));
			erInfo.setRouteMaps(_ctx.longValue("GetVccResponse.Content.ErInfos["+ i +"].RouteMaps"));

			erInfos.add(erInfo);
		}
		content.setErInfos(erInfos);

		List<AliyunRouterInfoItem> aliyunRouterInfo = new ArrayList<AliyunRouterInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVccResponse.Content.AliyunRouterInfo.Length"); i++) {
			AliyunRouterInfoItem aliyunRouterInfoItem = new AliyunRouterInfoItem();
			aliyunRouterInfoItem.setPcId(_ctx.stringValue("GetVccResponse.Content.AliyunRouterInfo["+ i +"].PcId"));
			aliyunRouterInfoItem.setVbrId(_ctx.stringValue("GetVccResponse.Content.AliyunRouterInfo["+ i +"].VbrId"));
			aliyunRouterInfoItem.setLocalGatewayIp(_ctx.stringValue("GetVccResponse.Content.AliyunRouterInfo["+ i +"].LocalGatewayIp"));
			aliyunRouterInfoItem.setPeerGatewayIp(_ctx.stringValue("GetVccResponse.Content.AliyunRouterInfo["+ i +"].PeerGatewayIp"));
			aliyunRouterInfoItem.setMask(_ctx.stringValue("GetVccResponse.Content.AliyunRouterInfo["+ i +"].Mask"));
			aliyunRouterInfoItem.setVlanId(_ctx.stringValue("GetVccResponse.Content.AliyunRouterInfo["+ i +"].VlanId"));

			aliyunRouterInfo.add(aliyunRouterInfoItem);
		}
		content.setAliyunRouterInfo(aliyunRouterInfo);

		List<CisRouterInfoItem> cisRouterInfo = new ArrayList<CisRouterInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVccResponse.Content.CisRouterInfo.Length"); i++) {
			CisRouterInfoItem cisRouterInfoItem = new CisRouterInfoItem();
			cisRouterInfoItem.setCcrId(_ctx.stringValue("GetVccResponse.Content.CisRouterInfo["+ i +"].CcrId"));

			List<CcInfo> ccInfos = new ArrayList<CcInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetVccResponse.Content.CisRouterInfo["+ i +"].CcInfos.Length"); j++) {
				CcInfo ccInfo = new CcInfo();
				ccInfo.setCcId(_ctx.stringValue("GetVccResponse.Content.CisRouterInfo["+ i +"].CcInfos["+ j +"].CcId"));
				ccInfo.setVlanId(_ctx.stringValue("GetVccResponse.Content.CisRouterInfo["+ i +"].CcInfos["+ j +"].VlanId"));
				ccInfo.setLocalGatewayIp(_ctx.stringValue("GetVccResponse.Content.CisRouterInfo["+ i +"].CcInfos["+ j +"].LocalGatewayIp"));
				ccInfo.setRemoteGatewayIp(_ctx.stringValue("GetVccResponse.Content.CisRouterInfo["+ i +"].CcInfos["+ j +"].RemoteGatewayIp"));
				ccInfo.setSubnetMask(_ctx.stringValue("GetVccResponse.Content.CisRouterInfo["+ i +"].CcInfos["+ j +"].SubnetMask"));
				ccInfo.setStatus(_ctx.stringValue("GetVccResponse.Content.CisRouterInfo["+ i +"].CcInfos["+ j +"].Status"));

				ccInfos.add(ccInfo);
			}
			cisRouterInfoItem.setCcInfos(ccInfos);

			cisRouterInfo.add(cisRouterInfoItem);
		}
		content.setCisRouterInfo(cisRouterInfo);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetVccResponse.Content.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("GetVccResponse.Content.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("GetVccResponse.Content.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		content.setTags(tags);
		getVccResponse.setContent(content);
	 
	 	return getVccResponse;
	}
}