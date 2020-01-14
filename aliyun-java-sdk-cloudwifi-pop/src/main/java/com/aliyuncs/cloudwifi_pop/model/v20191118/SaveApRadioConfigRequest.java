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
public class SaveApRadioConfigRequest extends RpcAcsRequest<SaveApRadioConfigResponse> {
	   

	private String requireMode;

	private String htmode;

	private Integer frag;

	private Integer minrate;

	private Integer mcastRate;

	private String probereq;

	private String channel;

	private String shortgi;

	private String hwmode;

	private Integer uapsd;

	private Integer beaconInt;

	private Integer rts;

	private String appName;

	private String txpower;

	private Integer bcastRate;

	private String noscan;

	private String appCode;

	private String disabled;

	private Integer mgmtRate;

	private Long id;
	public SaveApRadioConfigRequest() {
		super("cloudwifi-pop", "2019-11-18", "SaveApRadioConfig", "cloudap");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRequireMode() {
		return this.requireMode;
	}

	public void setRequireMode(String requireMode) {
		this.requireMode = requireMode;
		if(requireMode != null){
			putQueryParameter("RequireMode", requireMode);
		}
	}

	public String getHtmode() {
		return this.htmode;
	}

	public void setHtmode(String htmode) {
		this.htmode = htmode;
		if(htmode != null){
			putQueryParameter("Htmode", htmode);
		}
	}

	public Integer getFrag() {
		return this.frag;
	}

	public void setFrag(Integer frag) {
		this.frag = frag;
		if(frag != null){
			putQueryParameter("Frag", frag.toString());
		}
	}

	public Integer getMinrate() {
		return this.minrate;
	}

	public void setMinrate(Integer minrate) {
		this.minrate = minrate;
		if(minrate != null){
			putQueryParameter("Minrate", minrate.toString());
		}
	}

	public Integer getMcastRate() {
		return this.mcastRate;
	}

	public void setMcastRate(Integer mcastRate) {
		this.mcastRate = mcastRate;
		if(mcastRate != null){
			putQueryParameter("McastRate", mcastRate.toString());
		}
	}

	public String getProbereq() {
		return this.probereq;
	}

	public void setProbereq(String probereq) {
		this.probereq = probereq;
		if(probereq != null){
			putQueryParameter("Probereq", probereq);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getShortgi() {
		return this.shortgi;
	}

	public void setShortgi(String shortgi) {
		this.shortgi = shortgi;
		if(shortgi != null){
			putQueryParameter("Shortgi", shortgi);
		}
	}

	public String getHwmode() {
		return this.hwmode;
	}

	public void setHwmode(String hwmode) {
		this.hwmode = hwmode;
		if(hwmode != null){
			putQueryParameter("Hwmode", hwmode);
		}
	}

	public Integer getUapsd() {
		return this.uapsd;
	}

	public void setUapsd(Integer uapsd) {
		this.uapsd = uapsd;
		if(uapsd != null){
			putQueryParameter("Uapsd", uapsd.toString());
		}
	}

	public Integer getBeaconInt() {
		return this.beaconInt;
	}

	public void setBeaconInt(Integer beaconInt) {
		this.beaconInt = beaconInt;
		if(beaconInt != null){
			putQueryParameter("BeaconInt", beaconInt.toString());
		}
	}

	public Integer getRts() {
		return this.rts;
	}

	public void setRts(Integer rts) {
		this.rts = rts;
		if(rts != null){
			putQueryParameter("Rts", rts.toString());
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

	public String getTxpower() {
		return this.txpower;
	}

	public void setTxpower(String txpower) {
		this.txpower = txpower;
		if(txpower != null){
			putQueryParameter("Txpower", txpower);
		}
	}

	public Integer getBcastRate() {
		return this.bcastRate;
	}

	public void setBcastRate(Integer bcastRate) {
		this.bcastRate = bcastRate;
		if(bcastRate != null){
			putQueryParameter("BcastRate", bcastRate.toString());
		}
	}

	public String getNoscan() {
		return this.noscan;
	}

	public void setNoscan(String noscan) {
		this.noscan = noscan;
		if(noscan != null){
			putQueryParameter("Noscan", noscan);
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

	public String getDisabled() {
		return this.disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
		if(disabled != null){
			putQueryParameter("Disabled", disabled);
		}
	}

	public Integer getMgmtRate() {
		return this.mgmtRate;
	}

	public void setMgmtRate(Integer mgmtRate) {
		this.mgmtRate = mgmtRate;
		if(mgmtRate != null){
			putQueryParameter("MgmtRate", mgmtRate.toString());
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

	@Override
	public Class<SaveApRadioConfigResponse> getResponseClass() {
		return SaveApRadioConfigResponse.class;
	}

}
