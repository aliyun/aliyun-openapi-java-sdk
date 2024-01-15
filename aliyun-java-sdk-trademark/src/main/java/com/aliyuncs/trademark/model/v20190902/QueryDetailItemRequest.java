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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryDetailItemRequest extends RpcAcsRequest<QueryDetailItemResponse> {
	   

	private String detailType;

	private String detailConvertType;

	private String detailId;

	private Boolean mock;
	public QueryDetailItemRequest() {
		super("Trademark", "2019-09-02", "QueryDetailItem");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDetailType() {
		return this.detailType;
	}

	public void setDetailType(String detailType) {
		this.detailType = detailType;
		if(detailType != null){
			putQueryParameter("DetailType", detailType);
		}
	}

	public String getDetailConvertType() {
		return this.detailConvertType;
	}

	public void setDetailConvertType(String detailConvertType) {
		this.detailConvertType = detailConvertType;
		if(detailConvertType != null){
			putQueryParameter("DetailConvertType", detailConvertType);
		}
	}

	public String getDetailId() {
		return this.detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
		if(detailId != null){
			putQueryParameter("DetailId", detailId);
		}
	}

	public Boolean getMock() {
		return this.mock;
	}

	public void setMock(Boolean mock) {
		this.mock = mock;
		if(mock != null){
			putQueryParameter("Mock", mock.toString());
		}
	}

	@Override
	public Class<QueryDetailItemResponse> getResponseClass() {
		return QueryDetailItemResponse.class;
	}

}
