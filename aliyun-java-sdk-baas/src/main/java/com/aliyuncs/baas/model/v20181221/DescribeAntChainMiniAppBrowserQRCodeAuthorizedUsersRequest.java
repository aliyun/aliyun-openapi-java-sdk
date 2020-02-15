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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest extends RpcAcsRequest<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse> {
	   

	private Integer pageNumber;

	private String antChainId;

	private Integer pageSize;

	private String qRCodeType;
	public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest() {
		super("Baas", "2018-12-21", "DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsers", "baas");
		setMethod(MethodType.PUT);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getAntChainId() {
		return this.antChainId;
	}

	public void setAntChainId(String antChainId) {
		this.antChainId = antChainId;
		if(antChainId != null){
			putBodyParameter("AntChainId", antChainId);
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

	public String getQRCodeType() {
		return this.qRCodeType;
	}

	public void setQRCodeType(String qRCodeType) {
		this.qRCodeType = qRCodeType;
		if(qRCodeType != null){
			putBodyParameter("QRCodeType", qRCodeType);
		}
	}

	@Override
	public Class<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse> getResponseClass() {
		return DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse.class;
	}

}
