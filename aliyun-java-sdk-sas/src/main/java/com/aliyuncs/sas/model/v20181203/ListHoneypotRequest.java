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
public class ListHoneypotRequest extends RpcAcsRequest<ListHoneypotResponse> {
	   

	private String honeypotName;

	private Integer pageSize;

	private String nodeId;

	private Integer currentPage;

	private String nodeName;

	private List<String> honeypotIdss;
	public ListHoneypotRequest() {
		super("Sas", "2018-12-03", "ListHoneypot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHoneypotName() {
		return this.honeypotName;
	}

	public void setHoneypotName(String honeypotName) {
		this.honeypotName = honeypotName;
		if(honeypotName != null){
			putQueryParameter("HoneypotName", honeypotName);
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

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putQueryParameter("NodeId", nodeId);
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

	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
		if(nodeName != null){
			putQueryParameter("NodeName", nodeName);
		}
	}

	public List<String> getHoneypotIdss() {
		return this.honeypotIdss;
	}

	public void setHoneypotIdss(List<String> honeypotIdss) {
		this.honeypotIdss = honeypotIdss;	
		if (honeypotIdss != null) {
			for (int i = 0; i < honeypotIdss.size(); i++) {
				putQueryParameter("HoneypotIds." + (i + 1) , honeypotIdss.get(i));
			}
		}	
	}

	@Override
	public Class<ListHoneypotResponse> getResponseClass() {
		return ListHoneypotResponse.class;
	}

}
