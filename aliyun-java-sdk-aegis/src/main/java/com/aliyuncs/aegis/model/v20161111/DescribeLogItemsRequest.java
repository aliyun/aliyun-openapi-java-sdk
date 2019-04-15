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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogItemsRequest extends RpcAcsRequest<DescribeLogItemsResponse> {
	
	public DescribeLogItemsRequest() {
		super("aegis", "2016-11-11", "DescribeLogItems", "vipaegis");
	}

	private Integer loginOffset;

	private Integer processSnapshotOffset;

	private Integer portSnapshotOffset;

	private String query;

	private String endTime;

	private String currentPage;

	private Integer networkOffset;

	private String startTime;

	private Integer accountSnapshotOffset;

	private Integer processOffset;

	private String sourceIp;

	private Integer crackOffset;

	private String pageSize;

	public Integer getLoginOffset() {
		return this.loginOffset;
	}

	public void setLoginOffset(Integer loginOffset) {
		this.loginOffset = loginOffset;
		if(loginOffset != null){
			putQueryParameter("LoginOffset", loginOffset.toString());
		}
	}

	public Integer getProcessSnapshotOffset() {
		return this.processSnapshotOffset;
	}

	public void setProcessSnapshotOffset(Integer processSnapshotOffset) {
		this.processSnapshotOffset = processSnapshotOffset;
		if(processSnapshotOffset != null){
			putQueryParameter("ProcessSnapshotOffset", processSnapshotOffset.toString());
		}
	}

	public Integer getPortSnapshotOffset() {
		return this.portSnapshotOffset;
	}

	public void setPortSnapshotOffset(Integer portSnapshotOffset) {
		this.portSnapshotOffset = portSnapshotOffset;
		if(portSnapshotOffset != null){
			putQueryParameter("PortSnapshotOffset", portSnapshotOffset.toString());
		}
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putQueryParameter("Query", query);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage);
		}
	}

	public Integer getNetworkOffset() {
		return this.networkOffset;
	}

	public void setNetworkOffset(Integer networkOffset) {
		this.networkOffset = networkOffset;
		if(networkOffset != null){
			putQueryParameter("NetworkOffset", networkOffset.toString());
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Integer getAccountSnapshotOffset() {
		return this.accountSnapshotOffset;
	}

	public void setAccountSnapshotOffset(Integer accountSnapshotOffset) {
		this.accountSnapshotOffset = accountSnapshotOffset;
		if(accountSnapshotOffset != null){
			putQueryParameter("AccountSnapshotOffset", accountSnapshotOffset.toString());
		}
	}

	public Integer getProcessOffset() {
		return this.processOffset;
	}

	public void setProcessOffset(Integer processOffset) {
		this.processOffset = processOffset;
		if(processOffset != null){
			putQueryParameter("ProcessOffset", processOffset.toString());
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

	public Integer getCrackOffset() {
		return this.crackOffset;
	}

	public void setCrackOffset(Integer crackOffset) {
		this.crackOffset = crackOffset;
		if(crackOffset != null){
			putQueryParameter("CrackOffset", crackOffset.toString());
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	@Override
	public Class<DescribeLogItemsResponse> getResponseClass() {
		return DescribeLogItemsResponse.class;
	}

}
