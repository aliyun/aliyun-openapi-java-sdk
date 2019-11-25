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

package com.aliyuncs.cloudwifi_pop.model.v20191118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveApSsidConfigRequest extends RpcAcsRequest<SaveApSsidConfigResponse> {
	   

	private String nasid;

	private Integer authPort;

	private Integer hidden;

	private Integer dynamicVlan;

	private String authServer;

	private String secondaryAcctServer;

	private String ssid;

	private Long cir;

	private String secondaryAcctSecret;

	private String mac;

	private Integer network;

	private Integer ieee80211w;

	private Integer isolate;

	private String encKey;

	private Integer multicastForward;

	private String appName;

	private String encryption;

	private Integer wmm;

	private Integer authCache;

	private Integer disabled;

	private Integer radioIndex;

	private Integer ignoreWeakProbe;

	private Integer maxassoc;

	private String acctServer;

	private String daeSecret;

	private String daeClient;

	private String secondaryAuthServer;

	private Integer disassocLowAck;

	private Integer secondaryAuthPort;

	private String acctSecret;

	private Integer disassocWeakRssi;

	private Integer secondaryAcctPort;

	private Integer daePort;

	private Integer ssidLb;

	private Integer acctPort;

	private Integer maxInactivity;

	private String appCode;

	private Integer vlanDhcp;

	private Integer shortPreamble;

	private String secondaryAuthSecret;

	private String authSecret;

	private String ownip;
	public SaveApSsidConfigRequest() {
		super("cloudwifi-pop", "2019-11-18", "SaveApSsidConfig", "cloudap");
		setMethod(MethodType.POST);
	}

	public String getNasid() {
		return this.nasid;
	}

	public void setNasid(String nasid) {
		this.nasid = nasid;
		if(nasid != null){
			putQueryParameter("Nasid", nasid);
		}
	}

	public Integer getAuthPort() {
		return this.authPort;
	}

	public void setAuthPort(Integer authPort) {
		this.authPort = authPort;
		if(authPort != null){
			putQueryParameter("AuthPort", authPort.toString());
		}
	}

	public Integer getHidden() {
		return this.hidden;
	}

	public void setHidden(Integer hidden) {
		this.hidden = hidden;
		if(hidden != null){
			putQueryParameter("Hidden", hidden.toString());
		}
	}

	public Integer getDynamicVlan() {
		return this.dynamicVlan;
	}

	public void setDynamicVlan(Integer dynamicVlan) {
		this.dynamicVlan = dynamicVlan;
		if(dynamicVlan != null){
			putQueryParameter("DynamicVlan", dynamicVlan.toString());
		}
	}

	public String getAuthServer() {
		return this.authServer;
	}

	public void setAuthServer(String authServer) {
		this.authServer = authServer;
		if(authServer != null){
			putQueryParameter("AuthServer", authServer);
		}
	}

	public String getSecondaryAcctServer() {
		return this.secondaryAcctServer;
	}

	public void setSecondaryAcctServer(String secondaryAcctServer) {
		this.secondaryAcctServer = secondaryAcctServer;
		if(secondaryAcctServer != null){
			putQueryParameter("SecondaryAcctServer", secondaryAcctServer);
		}
	}

	public String getSsid() {
		return this.ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
		if(ssid != null){
			putQueryParameter("Ssid", ssid);
		}
	}

	public Long getCir() {
		return this.cir;
	}

	public void setCir(Long cir) {
		this.cir = cir;
		if(cir != null){
			putQueryParameter("Cir", cir.toString());
		}
	}

	public String getSecondaryAcctSecret() {
		return this.secondaryAcctSecret;
	}

	public void setSecondaryAcctSecret(String secondaryAcctSecret) {
		this.secondaryAcctSecret = secondaryAcctSecret;
		if(secondaryAcctSecret != null){
			putQueryParameter("SecondaryAcctSecret", secondaryAcctSecret);
		}
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
		if(mac != null){
			putQueryParameter("Mac", mac);
		}
	}

	public Integer getNetwork() {
		return this.network;
	}

	public void setNetwork(Integer network) {
		this.network = network;
		if(network != null){
			putQueryParameter("Network", network.toString());
		}
	}

	public Integer getIeee80211w() {
		return this.ieee80211w;
	}

	public void setIeee80211w(Integer ieee80211w) {
		this.ieee80211w = ieee80211w;
		if(ieee80211w != null){
			putQueryParameter("Ieee80211w", ieee80211w.toString());
		}
	}

	public Integer getIsolate() {
		return this.isolate;
	}

	public void setIsolate(Integer isolate) {
		this.isolate = isolate;
		if(isolate != null){
			putQueryParameter("Isolate", isolate.toString());
		}
	}

	public String getEncKey() {
		return this.encKey;
	}

	public void setEncKey(String encKey) {
		this.encKey = encKey;
		if(encKey != null){
			putQueryParameter("EncKey", encKey);
		}
	}

	public Integer getMulticastForward() {
		return this.multicastForward;
	}

	public void setMulticastForward(Integer multicastForward) {
		this.multicastForward = multicastForward;
		if(multicastForward != null){
			putQueryParameter("MulticastForward", multicastForward.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getEncryption() {
		return this.encryption;
	}

	public void setEncryption(String encryption) {
		this.encryption = encryption;
		if(encryption != null){
			putQueryParameter("Encryption", encryption);
		}
	}

	public Integer getWmm() {
		return this.wmm;
	}

	public void setWmm(Integer wmm) {
		this.wmm = wmm;
		if(wmm != null){
			putQueryParameter("Wmm", wmm.toString());
		}
	}

	public Integer getAuthCache() {
		return this.authCache;
	}

	public void setAuthCache(Integer authCache) {
		this.authCache = authCache;
		if(authCache != null){
			putQueryParameter("AuthCache", authCache.toString());
		}
	}

	public Integer getDisabled() {
		return this.disabled;
	}

	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
		if(disabled != null){
			putQueryParameter("Disabled", disabled.toString());
		}
	}

	public Integer getRadioIndex() {
		return this.radioIndex;
	}

	public void setRadioIndex(Integer radioIndex) {
		this.radioIndex = radioIndex;
		if(radioIndex != null){
			putQueryParameter("RadioIndex", radioIndex.toString());
		}
	}

	public Integer getIgnoreWeakProbe() {
		return this.ignoreWeakProbe;
	}

	public void setIgnoreWeakProbe(Integer ignoreWeakProbe) {
		this.ignoreWeakProbe = ignoreWeakProbe;
		if(ignoreWeakProbe != null){
			putQueryParameter("IgnoreWeakProbe", ignoreWeakProbe.toString());
		}
	}

	public Integer getMaxassoc() {
		return this.maxassoc;
	}

	public void setMaxassoc(Integer maxassoc) {
		this.maxassoc = maxassoc;
		if(maxassoc != null){
			putQueryParameter("Maxassoc", maxassoc.toString());
		}
	}

	public String getAcctServer() {
		return this.acctServer;
	}

	public void setAcctServer(String acctServer) {
		this.acctServer = acctServer;
		if(acctServer != null){
			putQueryParameter("AcctServer", acctServer);
		}
	}

	public String getDaeSecret() {
		return this.daeSecret;
	}

	public void setDaeSecret(String daeSecret) {
		this.daeSecret = daeSecret;
		if(daeSecret != null){
			putQueryParameter("DaeSecret", daeSecret);
		}
	}

	public String getDaeClient() {
		return this.daeClient;
	}

	public void setDaeClient(String daeClient) {
		this.daeClient = daeClient;
		if(daeClient != null){
			putQueryParameter("DaeClient", daeClient);
		}
	}

	public String getSecondaryAuthServer() {
		return this.secondaryAuthServer;
	}

	public void setSecondaryAuthServer(String secondaryAuthServer) {
		this.secondaryAuthServer = secondaryAuthServer;
		if(secondaryAuthServer != null){
			putQueryParameter("SecondaryAuthServer", secondaryAuthServer);
		}
	}

	public Integer getDisassocLowAck() {
		return this.disassocLowAck;
	}

	public void setDisassocLowAck(Integer disassocLowAck) {
		this.disassocLowAck = disassocLowAck;
		if(disassocLowAck != null){
			putQueryParameter("DisassocLowAck", disassocLowAck.toString());
		}
	}

	public Integer getSecondaryAuthPort() {
		return this.secondaryAuthPort;
	}

	public void setSecondaryAuthPort(Integer secondaryAuthPort) {
		this.secondaryAuthPort = secondaryAuthPort;
		if(secondaryAuthPort != null){
			putQueryParameter("SecondaryAuthPort", secondaryAuthPort.toString());
		}
	}

	public String getAcctSecret() {
		return this.acctSecret;
	}

	public void setAcctSecret(String acctSecret) {
		this.acctSecret = acctSecret;
		if(acctSecret != null){
			putQueryParameter("AcctSecret", acctSecret);
		}
	}

	public Integer getDisassocWeakRssi() {
		return this.disassocWeakRssi;
	}

	public void setDisassocWeakRssi(Integer disassocWeakRssi) {
		this.disassocWeakRssi = disassocWeakRssi;
		if(disassocWeakRssi != null){
			putQueryParameter("DisassocWeakRssi", disassocWeakRssi.toString());
		}
	}

	public Integer getSecondaryAcctPort() {
		return this.secondaryAcctPort;
	}

	public void setSecondaryAcctPort(Integer secondaryAcctPort) {
		this.secondaryAcctPort = secondaryAcctPort;
		if(secondaryAcctPort != null){
			putQueryParameter("SecondaryAcctPort", secondaryAcctPort.toString());
		}
	}

	public Integer getDaePort() {
		return this.daePort;
	}

	public void setDaePort(Integer daePort) {
		this.daePort = daePort;
		if(daePort != null){
			putQueryParameter("DaePort", daePort.toString());
		}
	}

	public Integer getSsidLb() {
		return this.ssidLb;
	}

	public void setSsidLb(Integer ssidLb) {
		this.ssidLb = ssidLb;
		if(ssidLb != null){
			putQueryParameter("SsidLb", ssidLb.toString());
		}
	}

	public Integer getAcctPort() {
		return this.acctPort;
	}

	public void setAcctPort(Integer acctPort) {
		this.acctPort = acctPort;
		if(acctPort != null){
			putQueryParameter("AcctPort", acctPort.toString());
		}
	}

	public Integer getMaxInactivity() {
		return this.maxInactivity;
	}

	public void setMaxInactivity(Integer maxInactivity) {
		this.maxInactivity = maxInactivity;
		if(maxInactivity != null){
			putQueryParameter("MaxInactivity", maxInactivity.toString());
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	public Integer getVlanDhcp() {
		return this.vlanDhcp;
	}

	public void setVlanDhcp(Integer vlanDhcp) {
		this.vlanDhcp = vlanDhcp;
		if(vlanDhcp != null){
			putQueryParameter("VlanDhcp", vlanDhcp.toString());
		}
	}

	public Integer getShortPreamble() {
		return this.shortPreamble;
	}

	public void setShortPreamble(Integer shortPreamble) {
		this.shortPreamble = shortPreamble;
		if(shortPreamble != null){
			putQueryParameter("ShortPreamble", shortPreamble.toString());
		}
	}

	public String getSecondaryAuthSecret() {
		return this.secondaryAuthSecret;
	}

	public void setSecondaryAuthSecret(String secondaryAuthSecret) {
		this.secondaryAuthSecret = secondaryAuthSecret;
		if(secondaryAuthSecret != null){
			putQueryParameter("SecondaryAuthSecret", secondaryAuthSecret);
		}
	}

	public String getAuthSecret() {
		return this.authSecret;
	}

	public void setAuthSecret(String authSecret) {
		this.authSecret = authSecret;
		if(authSecret != null){
			putQueryParameter("AuthSecret", authSecret);
		}
	}

	public String getOwnip() {
		return this.ownip;
	}

	public void setOwnip(String ownip) {
		this.ownip = ownip;
		if(ownip != null){
			putQueryParameter("Ownip", ownip);
		}
	}

	@Override
	public Class<SaveApSsidConfigResponse> getResponseClass() {
		return SaveApSsidConfigResponse.class;
	}

}
