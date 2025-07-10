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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DownloadVpnConnectionConfigResponse;
import com.aliyuncs.vpc.model.v20160428.DownloadVpnConnectionConfigResponse.VpnConnectionConfig;
import com.aliyuncs.vpc.model.v20160428.DownloadVpnConnectionConfigResponse.VpnConnectionConfig.BgpConfig;
import com.aliyuncs.vpc.model.v20160428.DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig;
import com.aliyuncs.vpc.model.v20160428.DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig;
import com.aliyuncs.vpc.model.v20160428.DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelConfig;
import com.aliyuncs.vpc.model.v20160428.DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelConfig.IkeConfig1;
import com.aliyuncs.vpc.model.v20160428.DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelConfig.IpsecConfig2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadVpnConnectionConfigResponseUnmarshaller {

	public static DownloadVpnConnectionConfigResponse unmarshall(DownloadVpnConnectionConfigResponse downloadVpnConnectionConfigResponse, UnmarshallerContext _ctx) {
		
		downloadVpnConnectionConfigResponse.setRequestId(_ctx.stringValue("DownloadVpnConnectionConfigResponse.RequestId"));

		VpnConnectionConfig vpnConnectionConfig = new VpnConnectionConfig();
		vpnConnectionConfig.setRemote(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.Remote"));
		vpnConnectionConfig.setLocal(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.Local"));
		vpnConnectionConfig.setRemoteSubnet(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.RemoteSubnet"));
		vpnConnectionConfig.setLocalSubnet(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.LocalSubnet"));

		IkeConfig ikeConfig = new IkeConfig();
		ikeConfig.setRemoteId(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.RemoteId"));
		ikeConfig.setIkeLifetime(_ctx.longValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.IkeLifetime"));
		ikeConfig.setIkeEncAlg(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.IkeEncAlg"));
		ikeConfig.setLocalId(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.LocalId"));
		ikeConfig.setIkeMode(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.IkeMode"));
		ikeConfig.setIkeVersion(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.IkeVersion"));
		ikeConfig.setIkePfs(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.IkePfs"));
		ikeConfig.setPsk(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.Psk"));
		ikeConfig.setIkeAuthAlg(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.IkeAuthAlg"));
		vpnConnectionConfig.setIkeConfig(ikeConfig);

		IpsecConfig ipsecConfig = new IpsecConfig();
		ipsecConfig.setIpsecAuthAlg(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig.IpsecAuthAlg"));
		ipsecConfig.setIpsecEncAlg(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig.IpsecEncAlg"));
		ipsecConfig.setIpsecLifetime(_ctx.longValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig.IpsecLifetime"));
		ipsecConfig.setIpsecPfs(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig.IpsecPfs"));
		vpnConnectionConfig.setIpsecConfig(ipsecConfig);

		List<TunnelConfig> tunnelsConfig = new ArrayList<TunnelConfig>();
		for (int i = 0; i < _ctx.lengthValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig.Length"); i++) {
			TunnelConfig tunnelConfig = new TunnelConfig();
			tunnelConfig.setTunnelId(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].TunnelId"));
			tunnelConfig.setLocal(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].Local"));
			tunnelConfig.setRemote(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].Remote"));

			IkeConfig1 ikeConfig1 = new IkeConfig1();
			ikeConfig1.setPsk(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IkeConfig.Psk"));
			ikeConfig1.setIkeVersion(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IkeConfig.IkeVersion"));
			ikeConfig1.setIkeMode(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IkeConfig.IkeMode"));
			ikeConfig1.setIkeEncAlg(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IkeConfig.IkeEncAlg"));
			ikeConfig1.setIkeAuthAlg(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IkeConfig.IkeAuthAlg"));
			ikeConfig1.setIkePfs(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IkeConfig.IkePfs"));
			ikeConfig1.setIkeLifetime(_ctx.longValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IkeConfig.IkeLifetime"));
			ikeConfig1.setLocalId(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IkeConfig.LocalId"));
			ikeConfig1.setRemoteId(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IkeConfig.RemoteId"));
			tunnelConfig.setIkeConfig1(ikeConfig1);

			IpsecConfig2 ipsecConfig2 = new IpsecConfig2();
			ipsecConfig2.setIpsecAuthAlg(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IpsecConfig.IpsecAuthAlg"));
			ipsecConfig2.setIpsecEncAlg(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IpsecConfig.IpsecEncAlg"));
			ipsecConfig2.setIpsecPfs(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IpsecConfig.IpsecPfs"));
			ipsecConfig2.setIpsecLifetime(_ctx.longValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.TunnelsConfig["+ i +"].IpsecConfig.IpsecLifetime"));
			tunnelConfig.setIpsecConfig2(ipsecConfig2);

			tunnelsConfig.add(tunnelConfig);
		}
		vpnConnectionConfig.setTunnelsConfig(tunnelsConfig);

		List<BgpConfig> bgpConfigs = new ArrayList<BgpConfig>();
		for (int i = 0; i < _ctx.lengthValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.BgpConfigs.Length"); i++) {
			BgpConfig bgpConfig = new BgpConfig();
			bgpConfig.setLocalAsn(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.BgpConfigs["+ i +"].LocalAsn"));
			bgpConfig.setLocalBgpIp(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.BgpConfigs["+ i +"].LocalBgpIp"));
			bgpConfig.setPeerAsn(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.BgpConfigs["+ i +"].PeerAsn"));
			bgpConfig.setPeerBgpIp(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.BgpConfigs["+ i +"].PeerBgpIp"));
			bgpConfig.setTunnelCidr(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.BgpConfigs["+ i +"].TunnelCidr"));
			bgpConfig.setTunnelId(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.BgpConfigs["+ i +"].TunnelId"));

			bgpConfigs.add(bgpConfig);
		}
		vpnConnectionConfig.setBgpConfigs(bgpConfigs);
		downloadVpnConnectionConfigResponse.setVpnConnectionConfig(vpnConnectionConfig);
	 
	 	return downloadVpnConnectionConfigResponse;
	}
}