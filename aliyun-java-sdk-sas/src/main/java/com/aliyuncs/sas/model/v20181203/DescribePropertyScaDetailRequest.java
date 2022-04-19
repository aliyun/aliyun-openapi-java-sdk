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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePropertyScaDetailRequest extends RpcAcsRequest<DescribePropertyScaDetailResponse> {
	   

	private String searchItemSub;

	private String remark;

	private String pid;

	private String searchItem;

	private String uuid;

	private String biz;

	private Integer pageSize;

	private Long processStartedStart;

	private Long processStartedEnd;

	private String lang;

	private String scaVersion;

	private String searchInfoSub;

	private String searchInfo;

	private Integer currentPage;

	private String bizType;

	private String port;

	private Long name;

	private String scaName;

	private String scaNamePattern;

	private String user;
	public DescribePropertyScaDetailRequest() {
		super("Sas", "2018-12-03", "DescribePropertyScaDetail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSearchItemSub() {
		return this.searchItemSub;
	}

	public void setSearchItemSub(String searchItemSub) {
		this.searchItemSub = searchItemSub;
		if(searchItemSub != null){
			putQueryParameter("SearchItemSub", searchItemSub);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
		if(pid != null){
			putQueryParameter("Pid", pid);
		}
	}

	public String getSearchItem() {
		return this.searchItem;
	}

	public void setSearchItem(String searchItem) {
		this.searchItem = searchItem;
		if(searchItem != null){
			putQueryParameter("SearchItem", searchItem);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getBiz() {
		return this.biz;
	}

	public void setBiz(String biz) {
		this.biz = biz;
		if(biz != null){
			putQueryParameter("Biz", biz);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getProcessStartedStart() {
		return this.processStartedStart;
	}

	public void setProcessStartedStart(Long processStartedStart) {
		this.processStartedStart = processStartedStart;
		if(processStartedStart != null){
			putQueryParameter("ProcessStartedStart", processStartedStart.toString());
		}
	}

	public Long getProcessStartedEnd() {
		return this.processStartedEnd;
	}

	public void setProcessStartedEnd(Long processStartedEnd) {
		this.processStartedEnd = processStartedEnd;
		if(processStartedEnd != null){
			putQueryParameter("ProcessStartedEnd", processStartedEnd.toString());
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

	public String getScaVersion() {
		return this.scaVersion;
	}

	public void setScaVersion(String scaVersion) {
		this.scaVersion = scaVersion;
		if(scaVersion != null){
			putQueryParameter("ScaVersion", scaVersion);
		}
	}

	public String getSearchInfoSub() {
		return this.searchInfoSub;
	}

	public void setSearchInfoSub(String searchInfoSub) {
		this.searchInfoSub = searchInfoSub;
		if(searchInfoSub != null){
			putQueryParameter("SearchInfoSub", searchInfoSub);
		}
	}

	public String getSearchInfo() {
		return this.searchInfo;
	}

	public void setSearchInfo(String searchInfo) {
		this.searchInfo = searchInfo;
		if(searchInfo != null){
			putQueryParameter("SearchInfo", searchInfo);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port);
		}
	}

	public Long getName() {
		return this.name;
	}

	public void setName(Long name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name.toString());
		}
	}

	public String getScaName() {
		return this.scaName;
	}

	public void setScaName(String scaName) {
		this.scaName = scaName;
		if(scaName != null){
			putQueryParameter("ScaName", scaName);
		}
	}

	public String getScaNamePattern() {
		return this.scaNamePattern;
	}

	public void setScaNamePattern(String scaNamePattern) {
		this.scaNamePattern = scaNamePattern;
		if(scaNamePattern != null){
			putQueryParameter("ScaNamePattern", scaNamePattern);
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putQueryParameter("User", user);
		}
	}

	@Override
	public Class<DescribePropertyScaDetailResponse> getResponseClass() {
		return DescribePropertyScaDetailResponse.class;
	}

}
