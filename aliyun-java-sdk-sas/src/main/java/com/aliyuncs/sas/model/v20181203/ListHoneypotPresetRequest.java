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
public class ListHoneypotPresetRequest extends RpcAcsRequest<ListHoneypotPresetResponse> {
	   

	private Integer pageSize;

	private String lang;

	private String nodeId;

	private String presetName;

	private Integer currentPage;

	private String nodeName;

	private String honeypotImageName;
	public ListHoneypotPresetRequest() {
		super("Sas", "2018-12-03", "ListHoneypotPreset");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
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

	public String getPresetName() {
		return this.presetName;
	}

	public void setPresetName(String presetName) {
		this.presetName = presetName;
		if(presetName != null){
			putQueryParameter("PresetName", presetName);
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

	public String getHoneypotImageName() {
		return this.honeypotImageName;
	}

	public void setHoneypotImageName(String honeypotImageName) {
		this.honeypotImageName = honeypotImageName;
		if(honeypotImageName != null){
			putQueryParameter("HoneypotImageName", honeypotImageName);
		}
	}

	@Override
	public Class<ListHoneypotPresetResponse> getResponseClass() {
		return ListHoneypotPresetResponse.class;
	}

}
