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

package com.aliyuncs.dt_oc_info.model.v20220829;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetQccSearchCertificationRequest extends RpcAcsRequest<GetQccSearchCertificationResponse> {
	   

	private String certCategory;

	private String entName;

	private Integer pageNo;

	private Integer pageSize;
	public GetQccSearchCertificationRequest() {
		super("dt-oc-info", "2022-08-29", "GetQccSearchCertification");
		setMethod(MethodType.POST);
	}

	public String getCertCategory() {
		return this.certCategory;
	}

	public void setCertCategory(String certCategory) {
		this.certCategory = certCategory;
		if(certCategory != null){
			putBodyParameter("CertCategory", certCategory);
		}
	}

	public String getEntName() {
		return this.entName;
	}

	public void setEntName(String entName) {
		this.entName = entName;
		if(entName != null){
			putBodyParameter("EntName", entName);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putBodyParameter("PageNo", pageNo.toString());
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

	@Override
	public Class<GetQccSearchCertificationResponse> getResponseClass() {
		return GetQccSearchCertificationResponse.class;
	}

}
