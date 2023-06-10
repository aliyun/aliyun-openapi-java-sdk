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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListHoneypotAlarmEventsRequest extends RpcAcsRequest<ListHoneypotAlarmEventsResponse> {
	   

	private String srcIp;

	private List<String> riskLevelLists;

	private Integer pageSize;

	private String dstIp;

	private String dealed;

	private Integer currentPage;
	public ListHoneypotAlarmEventsRequest() {
		super("Sas", "2018-12-03", "ListHoneypotAlarmEvents", "sas");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSrcIp() {
		return this.srcIp;
	}

	public void setSrcIp(String srcIp) {
		this.srcIp = srcIp;
		if(srcIp != null){
			putBodyParameter("SrcIp", srcIp);
		}
	}

	public List<String> getRiskLevelLists() {
		return this.riskLevelLists;
	}

	public void setRiskLevelLists(List<String> riskLevelLists) {
		this.riskLevelLists = riskLevelLists;	
		if (riskLevelLists != null) {
			for (int i = 0; i < riskLevelLists.size(); i++) {
				putBodyParameter("RiskLevelList." + (i + 1) , riskLevelLists.get(i));
			}
		}	
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getDstIp() {
		return this.dstIp;
	}

	public void setDstIp(String dstIp) {
		this.dstIp = dstIp;
		if(dstIp != null){
			putBodyParameter("DstIp", dstIp);
		}
	}

	public String getDealed() {
		return this.dealed;
	}

	public void setDealed(String dealed) {
		this.dealed = dealed;
		if(dealed != null){
			putBodyParameter("Dealed", dealed);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	@Override
	public Class<ListHoneypotAlarmEventsResponse> getResponseClass() {
		return ListHoneypotAlarmEventsResponse.class;
	}

}
