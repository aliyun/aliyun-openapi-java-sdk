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
public class DescribeResetRecordListRequest extends RpcAcsRequest<DescribeResetRecordListResponse> {
	
	public DescribeResetRecordListRequest() {
		super("jarvis", "2018-02-06", "DescribeResetRecordList", "jarvis");
	}

	private String srcIP;

	private String period;

	private String sourceIp;

	private Integer pageSize;

	private Integer currentPage;

	private String dstIP;

	private String region;

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

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
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

	public String getDstIP() {
		return this.dstIP;
	}

	public void setDstIP(String dstIP) {
		this.dstIP = dstIP;
		if(dstIP != null){
			putQueryParameter("DstIP", dstIP);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
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
	public Class<DescribeResetRecordListResponse> getResponseClass() {
		return DescribeResetRecordListResponse.class;
	}

}
