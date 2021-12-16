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

import com.aliyuncs.vpc.model.v20160428.DownloadVpnConnectionConfigResponse;
import com.aliyuncs.vpc.model.v20160428.DownloadVpnConnectionConfigResponse.VpnConnectionConfig;
import com.aliyuncs.vpc.model.v20160428.DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig;
import com.aliyuncs.vpc.model.v20160428.DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig;
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
		ipsecConfig.setIpsecLifetime(_ctx.longValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig.IpsecLifetime"));
		ipsecConfig.setIpsecEncAlg(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig.IpsecEncAlg"));
		ipsecConfig.setIpsecPfs(_ctx.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig.IpsecPfs"));
		vpnConnectionConfig.setIpsecConfig(ipsecConfig);
		downloadVpnConnectionConfigResponse.setVpnConnectionConfig(vpnConnectionConfig);
	 
	 	return downloadVpnConnectionConfigResponse;
	}
}