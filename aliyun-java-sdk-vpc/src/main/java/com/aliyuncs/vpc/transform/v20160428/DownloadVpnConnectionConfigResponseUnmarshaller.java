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

	public static DownloadVpnConnectionConfigResponse unmarshall(DownloadVpnConnectionConfigResponse downloadVpnConnectionConfigResponse, UnmarshallerContext context) {
		
		downloadVpnConnectionConfigResponse.setRequestId(context.stringValue("DownloadVpnConnectionConfigResponse.RequestId"));

		VpnConnectionConfig vpnConnectionConfig = new VpnConnectionConfig();
		vpnConnectionConfig.setLocalSubnet(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.LocalSubnet"));
		vpnConnectionConfig.setRemoteSubnet(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.RemoteSubnet"));
		vpnConnectionConfig.setLocal(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.Local"));
		vpnConnectionConfig.setRemote(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.Remote"));

		IkeConfig ikeConfig = new IkeConfig();
		ikeConfig.setPsk(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.Psk"));
		ikeConfig.setIkeVersion(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.IkeVersion"));
		ikeConfig.setIkeMode(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.IkeMode"));
		ikeConfig.setIkeEncAlg(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.IkeEncAlg"));
		ikeConfig.setIkeAuthAlg(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.IkeAuthAlg"));
		ikeConfig.setIkePfs(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.IkePfs"));
		ikeConfig.setIkeLifetime(context.longValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.IkeLifetime"));
		ikeConfig.setLocalId(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.LocalId"));
		ikeConfig.setRemoteId(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IkeConfig.RemoteId"));
		vpnConnectionConfig.setIkeConfig(ikeConfig);

		IpsecConfig ipsecConfig = new IpsecConfig();
		ipsecConfig.setIpsecEncAlg(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig.IpsecEncAlg"));
		ipsecConfig.setIpsecAuthAlg(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig.IpsecAuthAlg"));
		ipsecConfig.setIpsecPfs(context.stringValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig.IpsecPfs"));
		ipsecConfig.setIpsecLifetime(context.longValue("DownloadVpnConnectionConfigResponse.VpnConnectionConfig.IpsecConfig.IpsecLifetime"));
		vpnConnectionConfig.setIpsecConfig(ipsecConfig);
		downloadVpnConnectionConfigResponse.setVpnConnectionConfig(vpnConnectionConfig);
	 
	 	return downloadVpnConnectionConfigResponse;
	}
}