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

package com.aliyuncs.jarvis.model.v20180206;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateCpmcPunishFeedBackRequest extends RpcAcsRequest<CreateCpmcPunishFeedBackResponse> {
	
	public CreateCpmcPunishFeedBackRequest() {
		super("jarvis", "2018-02-06", "CreateCpmcPunishFeedBack", "jarvis");
	}

	private Integer feedBack;

	private String srcIP;

	private String sourceIp;

	private Integer dstPort;

	private String protocolName;

	private Integer srcPort;

	private String punishType;

	private String gmtCreate;

	private String dstIP;

	private String lang;

	private String sourceCode;

	public Integer getFeedBack() {
		return this.feedBack;
	}

	public void setFeedBack(Integer feedBack) {
		this.feedBack = feedBack;
		if(feedBack != null){
			putQueryParameter("FeedBack", feedBack.toString());
		}
	}

	public String getSrcIP() {
		return this.srcIP;
	}

	public void setSrcIP(String srcIP) {
		this.srcIP = srcIP;
		if(srcIP != null){
			putQueryParameter("SrcIP", srcIP);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Integer getDstPort() {
		return this.dstPort;
	}

	public void setDstPort(Integer dstPort) {
		this.dstPort = dstPort;
		if(dstPort != null){
			putQueryParameter("DstPort", dstPort.toString());
		}
	}

	public String getProtocolName() {
		return this.protocolName;
	}

	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
		if(protocolName != null){
			putQueryParameter("ProtocolName", protocolName);
		}
	}

	public Integer getSrcPort() {
		return this.srcPort;
	}

	public void setSrcPort(Integer srcPort) {
		this.srcPort = srcPort;
		if(srcPort != null){
			putQueryParameter("SrcPort", srcPort.toString());
		}
	}

	public String getPunishType() {
		return this.punishType;
	}

	public void setPunishType(String punishType) {
		this.punishType = punishType;
		if(punishType != null){
			putQueryParameter("PunishType", punishType);
		}
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
		if(gmtCreate != null){
			putQueryParameter("GmtCreate", gmtCreate);
		}
	}

	public String getDstIP() {
		return this.dstIP;
	}

	public void setDstIP(String dstIP) {
		this.dstIP = dstIP;
		if(dstIP != null){
			putQueryParameter("DstIP", dstIP);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
		if(sourceCode != null){
			putQueryParameter("SourceCode", sourceCode);
		}
	}

	@Override
	public Class<CreateCpmcPunishFeedBackResponse> getResponseClass() {
		return CreateCpmcPunishFeedBackResponse.class;
	}

}
