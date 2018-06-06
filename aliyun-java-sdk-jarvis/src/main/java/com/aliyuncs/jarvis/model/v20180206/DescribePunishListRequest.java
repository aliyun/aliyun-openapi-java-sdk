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
public class DescribePunishListRequest extends RpcAcsRequest<DescribePunishListResponse> {
	
	public DescribePunishListRequest() {
		super("jarvis", "2018-02-06", "DescribePunishList");
	}

	private String srcIP;

	private String sourceIp;

	private Integer pageSize;

	private Integer currentPage;

	private String punishStatus;

	private String lang;

	private Long srcUid;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("currentPage", currentPage.toString());
		}
	}

	public String getPunishStatus() {
		return this.punishStatus;
	}

	public void setPunishStatus(String punishStatus) {
		this.punishStatus = punishStatus;
		if(punishStatus != null){
			putQueryParameter("PunishStatus", punishStatus);
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

	public Long getSrcUid() {
		return this.srcUid;
	}

	public void setSrcUid(Long srcUid) {
		this.srcUid = srcUid;
		if(srcUid != null){
			putQueryParameter("srcUid", srcUid.toString());
		}
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
		if(sourceCode != null){
			putQueryParameter("sourceCode", sourceCode);
		}
	}

	@Override
	public Class<DescribePunishListResponse> getResponseClass() {
		return DescribePunishListResponse.class;
	}

}
