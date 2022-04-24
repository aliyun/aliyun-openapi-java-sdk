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
public class DescribeForwardTableEntriesRequest extends RpcAcsRequest<DescribeForwardTableEntriesResponse> {
	   

	private String internalIp;

	private String externalIp;

	private String ipProtocol;

	private Integer pageNumber;

	private String forwardEntryId;

	private Integer pageSize;

	private String natGatewayId;

	private String forwardEntryName;
	public DescribeForwardTableEntriesRequest() {
		super("Ens", "2017-11-10", "DescribeForwardTableEntries", "ens");
		setMethod(MethodType.POST);
	}

	public String getInternalIp() {
		return this.internalIp;
	}

	public void setInternalIp(String internalIp) {
		this.internalIp = internalIp;
		if(internalIp != null){
			putQueryParameter("InternalIp", internalIp);
		}
	}

	public String getExternalIp() {
		return this.externalIp;
	}

	public void setExternalIp(String externalIp) {
		this.externalIp = externalIp;
		if(externalIp != null){
			putQueryParameter("ExternalIp", externalIp);
		}
	}

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("IpProtocol", ipProtocol);
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

	public String getForwardEntryId() {
		return this.forwardEntryId;
	}

	public void setForwardEntryId(String forwardEntryId) {
		this.forwardEntryId = forwardEntryId;
		if(forwardEntryId != null){
			putQueryParameter("ForwardEntryId", forwardEntryId);
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

	public String getForwardEntryName() {
		return this.forwardEntryName;
	}

	public void setForwardEntryName(String forwardEntryName) {
		this.forwardEntryName = forwardEntryName;
		if(forwardEntryName != null){
			putQueryParameter("ForwardEntryName", forwardEntryName);
		}
	}

	@Override
	public Class<DescribeForwardTableEntriesResponse> getResponseClass() {
		return DescribeForwardTableEntriesResponse.class;
	}

}
