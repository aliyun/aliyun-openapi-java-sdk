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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListServerLockRequest extends RpcAcsRequest<ListServerLockResponse> {
	
	public ListServerLockRequest() {
		super("Domain", "2018-01-29", "ListServerLock");
	}

	private String lockProductId;

	private Long endStartDate;

	private Integer serverLockStatus;

	private Long startExpireDate;

	private String domainName;

	private Integer pageSize;

	private String userClientIp;

	private Long endExpireDate;

	private Integer pageNum;

	private String lang;

	private Long beginStartDate;

	public String getLockProductId() {
		return this.lockProductId;
	}

	public void setLockProductId(String lockProductId) {
		this.lockProductId = lockProductId;
		if(lockProductId != null){
			putQueryParameter("LockProductId", lockProductId);
		}
	}

	public Long getEndStartDate() {
		return this.endStartDate;
	}

	public void setEndStartDate(Long endStartDate) {
		this.endStartDate = endStartDate;
		if(endStartDate != null){
			putQueryParameter("EndStartDate", endStartDate.toString());
		}
	}

	public Integer getServerLockStatus() {
		return this.serverLockStatus;
	}

	public void setServerLockStatus(Integer serverLockStatus) {
		this.serverLockStatus = serverLockStatus;
		if(serverLockStatus != null){
			putQueryParameter("ServerLockStatus", serverLockStatus.toString());
		}
	}

	public Long getStartExpireDate() {
		return this.startExpireDate;
	}

	public void setStartExpireDate(Long startExpireDate) {
		this.startExpireDate = startExpireDate;
		if(startExpireDate != null){
			putQueryParameter("StartExpireDate", startExpireDate.toString());
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
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

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public Long getEndExpireDate() {
		return this.endExpireDate;
	}

	public void setEndExpireDate(Long endExpireDate) {
		this.endExpireDate = endExpireDate;
		if(endExpireDate != null){
			putQueryParameter("EndExpireDate", endExpireDate.toString());
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
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

	public Long getBeginStartDate() {
		return this.beginStartDate;
	}

	public void setBeginStartDate(Long beginStartDate) {
		this.beginStartDate = beginStartDate;
		if(beginStartDate != null){
			putQueryParameter("BeginStartDate", beginStartDate.toString());
		}
	}

	@Override
	public Class<ListServerLockResponse> getResponseClass() {
		return ListServerLockResponse.class;
	}

}
