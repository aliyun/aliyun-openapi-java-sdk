/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SaveApRadioConfigRequest extends RpcAcsRequest<SaveApRadioConfigResponse> {
	
	public SaveApRadioConfigRequest() {
		super("cloudwf", "2017-03-28", "SaveApRadioConfig");
	}

	private String requireMode;

	private String htmode;

	private Integer frag;

	private Integer minrate;

	private Integer probereq;

	private Integer channel;

	private Integer shortgi;

	private String hwmode;

	private Integer uapsd;

	private Integer beaconInt;

	private String mac;

	private Integer rts;

	private Integer txpower;

	private Integer noscan;

	private Integer bcastRate;

	private Integer disabled;

	private Integer instantlyEffective;

	private Long id;

	private Integer radioIndex;

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

	public Integer getProbereq() {
		return this.probereq;
	}

	public void setProbereq(Integer probereq) {
		this.probereq = probereq;
		if(probereq != null){
			putQueryParameter("Probereq", probereq.toString());
		}
	}

	public Integer getChannel() {
		return this.channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel.toString());
		}
	}

	public Integer getShortgi() {
		return this.shortgi;
	}

	public void setShortgi(Integer shortgi) {
		this.shortgi = shortgi;
		if(shortgi != null){
			putQueryParameter("Shortgi", shortgi.toString());
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

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
		if(mac != null){
			putQueryParameter("Mac", mac);
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

	public Integer getTxpower() {
		return this.txpower;
	}

	public void setTxpower(Integer txpower) {
		this.txpower = txpower;
		if(txpower != null){
			putQueryParameter("Txpower", txpower.toString());
		}
	}

	public Integer getNoscan() {
		return this.noscan;
	}

	public void setNoscan(Integer noscan) {
		this.noscan = noscan;
		if(noscan != null){
			putQueryParameter("Noscan", noscan.toString());
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

	public Integer getDisabled() {
		return this.disabled;
	}

	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
		if(disabled != null){
			putQueryParameter("Disabled", disabled.toString());
		}
	}

	public Integer getInstantlyEffective() {
		return this.instantlyEffective;
	}

	public void setInstantlyEffective(Integer instantlyEffective) {
		this.instantlyEffective = instantlyEffective;
		if(instantlyEffective != null){
			putQueryParameter("InstantlyEffective", instantlyEffective.toString());
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

	public Integer getRadioIndex() {
		return this.radioIndex;
	}

	public void setRadioIndex(Integer radioIndex) {
		this.radioIndex = radioIndex;
		if(radioIndex != null){
			putQueryParameter("RadioIndex", radioIndex.toString());
		}
	}

	@Override
	public Class<SaveApRadioConfigResponse> getResponseClass() {
		return SaveApRadioConfigResponse.class;
	}

}
