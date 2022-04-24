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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeSnatTableEntriesRequest extends RpcAcsRequest<DescribeSnatTableEntriesResponse> {
	   

	private String snatIp;

	private String snatEntryId;

	private String sourceCIDR;

	private Integer pageNumber;

	private Integer pageSize;

	private String natGatewayId;

	private String snatEntryName;
	public DescribeSnatTableEntriesRequest() {
		super("Ens", "2017-11-10", "DescribeSnatTableEntries", "ens");
		setMethod(MethodType.GET);
	}

	public String getSnatIp() {
		return this.snatIp;
	}

	public void setSnatIp(String snatIp) {
		this.snatIp = snatIp;
		if(snatIp != null){
			putQueryParameter("SnatIp", snatIp);
		}
	}

	public String getSnatEntryId() {
		return this.snatEntryId;
	}

	public void setSnatEntryId(String snatEntryId) {
		this.snatEntryId = snatEntryId;
		if(snatEntryId != null){
			putQueryParameter("SnatEntryId", snatEntryId);
		}
	}

	public String getSourceCIDR() {
		return this.sourceCIDR;
	}

	public void setSourceCIDR(String sourceCIDR) {
		this.sourceCIDR = sourceCIDR;
		if(sourceCIDR != null){
			putQueryParameter("SourceCIDR", sourceCIDR);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public String getNatGatewayId() {
		return this.natGatewayId;
	}

	public void setNatGatewayId(String natGatewayId) {
		this.natGatewayId = natGatewayId;
		if(natGatewayId != null){
			putQueryParameter("NatGatewayId", natGatewayId);
		}
	}

	public String getSnatEntryName() {
		return this.snatEntryName;
	}

	public void setSnatEntryName(String snatEntryName) {
		this.snatEntryName = snatEntryName;
		if(snatEntryName != null){
			putQueryParameter("SnatEntryName", snatEntryName);
		}
	}

	@Override
	public Class<DescribeSnatTableEntriesResponse> getResponseClass() {
		return DescribeSnatTableEntriesResponse.class;
	}

}
