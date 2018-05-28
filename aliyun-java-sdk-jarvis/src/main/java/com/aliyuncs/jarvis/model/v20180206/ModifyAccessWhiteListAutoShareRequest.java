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
public class ModifyAccessWhiteListAutoShareRequest extends RpcAcsRequest<ModifyAccessWhiteListAutoShareResponse> {
	
	public ModifyAccessWhiteListAutoShareRequest() {
		super("jarvis", "2018-02-06", "ModifyAccessWhiteListAutoShare");
	}

	private String srcIP;

	private String sourceIp;

	private Integer autoConfig;

	private String productName;

	private Integer whiteListType;

	private String lang;

	private String sourceCode;

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

	public Integer getAutoConfig() {
		return this.autoConfig;
	}

	public void setAutoConfig(Integer autoConfig) {
		this.autoConfig = autoConfig;
		if(autoConfig != null){
			putQueryParameter("AutoConfig", autoConfig.toString());
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public Integer getWhiteListType() {
		return this.whiteListType;
	}

	public void setWhiteListType(Integer whiteListType) {
		this.whiteListType = whiteListType;
		if(whiteListType != null){
			putQueryParameter("WhiteListType", whiteListType.toString());
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
	public Class<ModifyAccessWhiteListAutoShareResponse> getResponseClass() {
		return ModifyAccessWhiteListAutoShareResponse.class;
	}

}
