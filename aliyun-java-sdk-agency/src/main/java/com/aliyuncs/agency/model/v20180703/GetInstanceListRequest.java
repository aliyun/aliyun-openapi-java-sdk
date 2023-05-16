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

package com.aliyuncs.agency.model.v20180703;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceListRequest extends RpcAcsRequest<GetInstanceListResponse> {
	   

	private String publicIpAddresse;

	private Integer currentPage;

	private String ak;

	private Long aliyunPk;

	private String instanceId;

	private Integer pageSize;

	private String sk;

	private Integer tag;
	public GetInstanceListRequest() {
		super("Agency", "2018-07-03", "GetInstanceList", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPublicIpAddresse() {
		return this.publicIpAddresse;
	}

	public void setPublicIpAddresse(String publicIpAddresse) {
		this.publicIpAddresse = publicIpAddresse;
		if(publicIpAddresse != null){
			putQueryParameter("PublicIpAddresse", publicIpAddresse);
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

	public String getAk() {
		return this.ak;
	}

	public void setAk(String ak) {
		this.ak = ak;
		if(ak != null){
			putQueryParameter("Ak", ak);
		}
	}

	public Long getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(Long aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putQueryParameter("AliyunPk", aliyunPk.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	public String getSk() {
		return this.sk;
	}

	public void setSk(String sk) {
		this.sk = sk;
		if(sk != null){
			putQueryParameter("Sk", sk);
		}
	}

	public Integer getTag() {
		return this.tag;
	}

	public void setTag(Integer tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag.toString());
		}
	}

	@Override
	public Class<GetInstanceListResponse> getResponseClass() {
		return GetInstanceListResponse.class;
	}

}
