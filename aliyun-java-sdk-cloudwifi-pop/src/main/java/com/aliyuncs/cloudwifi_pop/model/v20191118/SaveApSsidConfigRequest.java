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
import com.aliyuncs.cloudwifi_pop.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveApSsidConfigRequest extends RpcAcsRequest<SaveApSsidConfigResponse> {
	   

	private String nasid;

	private Integer ieee80211r;

	private Integer dynamicVlan;

	private String fourthAuthServer;

	private String secondaryAcctServer;

	private Integer type;

	private String secondaryAcctSecret;

	private String ieee80211w;

	private Integer ftOverDs;

	private Integer multicastForward;

	private Long apAssetId;

	private String appName;

	private String authCache;

	private Long id;

	private Integer ignoreWeakProbe;

	private Integer thirdAuthPort;

	private String acctServer;

	private String thirdAuthSecret;

	private String daeClient;

	private String secondaryAuthServer;

	private Boolean sendConfigToAp;

	private Long cirStep;

	private Integer secondaryAuthPort;

	private Integer ndProxyWork;

	private Boolean liteEffect;

	private String acctSecret;

	private Integer secondaryAcctPort;

	private Integer disassocWeakRssi;

	private Integer daePort;

	private Integer cirType;

	private Integer maxInactivity;

	private String appCode;

	private String shortPreamble;

	private Integer authStatusServerWork;

	private String secondaryAuthSecret;

	private Integer acctStatusServerWork;

	private Integer authPort;

	private String hidden;

	private String authServer;

	private String mobilityDomain;

	private Long cirUl;

	private String ssid;

	private Long cir;

	private String mac;

	private Integer network;

	private Integer arpProxyEnable;

	private String isolate;

	private String encKey;

	private String encryption;

	private String wmm;

	private String disabled;

	private String radioIndex;

	private Integer maxassoc;

	private String daeSecret;

	private String disassocLowAck;

	private String thirdAuthServer;

	private Integer ssidLb;

	private Integer fourthAuthPort;

	private Integer acctPort;

	private String fourthAuthSecret;

	private Integer vlanDhcp;

	private String authSecret;

	private String ownip;
	public SaveApSsidConfigRequest() {
		super("cloudwifi-pop", "2019-11-18", "SaveApSsidConfig", "cloudap");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getIeee80211r() {
		return this.ieee80211r;
	}

	public void setIeee80211r(Integer ieee80211r) {
		this.ieee80211r = ieee80211r;
		if(ieee80211r != null){
			putQueryParameter("Ieee80211r", ieee80211r.toString());
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

	public String getFourthAuthServer() {
		return this.fourthAuthServer;
	}

	public void setFourthAuthServer(String fourthAuthServer) {
		this.fourthAuthServer = fourthAuthServer;
		if(fourthAuthServer != null){
			putQueryParameter("FourthAuthServer", fourthAuthServer);
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

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
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

	public String getIeee80211w() {
		return this.ieee80211w;
	}

	public void setIeee80211w(String ieee80211w) {
		this.ieee80211w = ieee80211w;
		if(ieee80211w != null){
			putQueryParameter("Ieee80211w", ieee80211w);
		}
	}

	public Integer getFtOverDs() {
		return this.ftOverDs;
	}

	public void setFtOverDs(Integer ftOverDs) {
		this.ftOverDs = ftOverDs;
		if(ftOverDs != null){
			putQueryParameter("FtOverDs", ftOverDs.toString());
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

	public Long getApAssetId() {
		return this.apAssetId;
	}

	public void setApAssetId(Long apAssetId) {
		this.apAssetId = apAssetId;
		if(apAssetId != null){
			putQueryParameter("ApAssetId", apAssetId.toString());
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

	public String getAuthCache() {
		return this.authCache;
	}

	public void setAuthCache(String authCache) {
		this.authCache = authCache;
		if(authCache != null){
			putQueryParameter("AuthCache", authCache);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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

	public Integer getThirdAuthPort() {
		return this.thirdAuthPort;
	}

	public void setThirdAuthPort(Integer thirdAuthPort) {
		this.thirdAuthPort = thirdAuthPort;
		if(thirdAuthPort != null){
			putQueryParameter("ThirdAuthPort", thirdAuthPort.toString());
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

	public String getThirdAuthSecret() {
		return this.thirdAuthSecret;
	}

	public void setThirdAuthSecret(String thirdAuthSecret) {
		this.thirdAuthSecret = thirdAuthSecret;
		if(thirdAuthSecret != null){
			putQueryParameter("ThirdAuthSecret", thirdAuthSecret);
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

	public Boolean getSendConfigToAp() {
		return this.sendConfigToAp;
	}

	public void setSendConfigToAp(Boolean sendConfigToAp) {
		this.sendConfigToAp = sendConfigToAp;
		if(sendConfigToAp != null){
			putQueryParameter("SendConfigToAp", sendConfigToAp.toString());
		}
	}

	public Long getCirStep() {
		return this.cirStep;
	}

	public void setCirStep(Long cirStep) {
		this.cirStep = cirStep;
		if(cirStep != null){
			putQueryParameter("CirStep", cirStep.toString());
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

	public Integer getNdProxyWork() {
		return this.ndProxyWork;
	}

	public void setNdProxyWork(Integer ndProxyWork) {
		this.ndProxyWork = ndProxyWork;
		if(ndProxyWork != null){
			putQueryParameter("NdProxyWork", ndProxyWork.toString());
		}
	}

	public Boolean getLiteEffect() {
		return this.liteEffect;
	}

	public void setLiteEffect(Boolean liteEffect) {
		this.liteEffect = liteEffect;
		if(liteEffect != null){
			putQueryParameter("LiteEffect", liteEffect.toString());
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

	public Integer getSecondaryAcctPort() {
		return this.secondaryAcctPort;
	}

	public void setSecondaryAcctPort(Integer secondaryAcctPort) {
		this.secondaryAcctPort = secondaryAcctPort;
		if(secondaryAcctPort != null){
			putQueryParameter("SecondaryAcctPort", secondaryAcctPort.toString());
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

	public Integer getDaePort() {
		return this.daePort;
	}

	public void setDaePort(Integer daePort) {
		this.daePort = daePort;
		if(daePort != null){
			putQueryParameter("DaePort", daePort.toString());
		}
	}

	public Integer getCirType() {
		return this.cirType;
	}

	public void setCirType(Integer cirType) {
		this.cirType = cirType;
		if(cirType != null){
			putQueryParameter("CirType", cirType.toString());
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

	public String getShortPreamble() {
		return this.shortPreamble;
	}

	public void setShortPreamble(String shortPreamble) {
		this.shortPreamble = shortPreamble;
		if(shortPreamble != null){
			putQueryParameter("ShortPreamble", shortPreamble);
		}
	}

	public Integer getAuthStatusServerWork() {
		return this.authStatusServerWork;
	}

	public void setAuthStatusServerWork(Integer authStatusServerWork) {
		this.authStatusServerWork = authStatusServerWork;
		if(authStatusServerWork != null){
			putQueryParameter("AuthStatusServerWork", authStatusServerWork.toString());
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

	public Integer getAcctStatusServerWork() {
		return this.acctStatusServerWork;
	}

	public void setAcctStatusServerWork(Integer acctStatusServerWork) {
		this.acctStatusServerWork = acctStatusServerWork;
		if(acctStatusServerWork != null){
			putQueryParameter("AcctStatusServerWork", acctStatusServerWork.toString());
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

	public String getHidden() {
		return this.hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
		if(hidden != null){
			putQueryParameter("Hidden", hidden);
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

	public String getMobilityDomain() {
		return this.mobilityDomain;
	}

	public void setMobilityDomain(String mobilityDomain) {
		this.mobilityDomain = mobilityDomain;
		if(mobilityDomain != null){
			putQueryParameter("MobilityDomain", mobilityDomain);
		}
	}

	public Long getCirUl() {
		return this.cirUl;
	}

	public void setCirUl(Long cirUl) {
		this.cirUl = cirUl;
		if(cirUl != null){
			putQueryParameter("CirUl", cirUl.toString());
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

	public Integer getArpProxyEnable() {
		return this.arpProxyEnable;
	}

	public void setArpProxyEnable(Integer arpProxyEnable) {
		this.arpProxyEnable = arpProxyEnable;
		if(arpProxyEnable != null){
			putQueryParameter("ArpProxyEnable", arpProxyEnable.toString());
		}
	}

	public String getIsolate() {
		return this.isolate;
	}

	public void setIsolate(String isolate) {
		this.isolate = isolate;
		if(isolate != null){
			putQueryParameter("Isolate", isolate);
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

	public String getEncryption() {
		return this.encryption;
	}

	public void setEncryption(String encryption) {
		this.encryption = encryption;
		if(encryption != null){
			putQueryParameter("Encryption", encryption);
		}
	}

	public String getWmm() {
		return this.wmm;
	}

	public void setWmm(String wmm) {
		this.wmm = wmm;
		if(wmm != null){
			putQueryParameter("Wmm", wmm);
		}
	}

	public String getDisabled() {
		return this.disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
		if(disabled != null){
			putQueryParameter("Disabled", disabled);
		}
	}

	public String getRadioIndex() {
		return this.radioIndex;
	}

	public void setRadioIndex(String radioIndex) {
		this.radioIndex = radioIndex;
		if(radioIndex != null){
			putQueryParameter("RadioIndex", radioIndex);
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

	public String getDaeSecret() {
		return this.daeSecret;
	}

	public void setDaeSecret(String daeSecret) {
		this.daeSecret = daeSecret;
		if(daeSecret != null){
			putQueryParameter("DaeSecret", daeSecret);
		}
	}

	public String getDisassocLowAck() {
		return this.disassocLowAck;
	}

	public void setDisassocLowAck(String disassocLowAck) {
		this.disassocLowAck = disassocLowAck;
		if(disassocLowAck != null){
			putQueryParameter("DisassocLowAck", disassocLowAck);
		}
	}

	public String getThirdAuthServer() {
		return this.thirdAuthServer;
	}

	public void setThirdAuthServer(String thirdAuthServer) {
		this.thirdAuthServer = thirdAuthServer;
		if(thirdAuthServer != null){
			putQueryParameter("ThirdAuthServer", thirdAuthServer);
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

	public Integer getFourthAuthPort() {
		return this.fourthAuthPort;
	}

	public void setFourthAuthPort(Integer fourthAuthPort) {
		this.fourthAuthPort = fourthAuthPort;
		if(fourthAuthPort != null){
			putQueryParameter("FourthAuthPort", fourthAuthPort.toString());
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

	public String getFourthAuthSecret() {
		return this.fourthAuthSecret;
	}

	public void setFourthAuthSecret(String fourthAuthSecret) {
		this.fourthAuthSecret = fourthAuthSecret;
		if(fourthAuthSecret != null){
			putQueryParameter("FourthAuthSecret", fourthAuthSecret);
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
