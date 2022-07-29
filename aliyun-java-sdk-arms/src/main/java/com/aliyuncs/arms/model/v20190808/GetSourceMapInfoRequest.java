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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetSourceMapInfoRequest extends RpcAcsRequest<GetSourceMapInfoResponse> {
	   

	private String edition;

	private String iD;

	private String keyword;

	private Boolean ascendingSequence;

	private String orderField;
	public GetSourceMapInfoRequest() {
		super("ARMS", "2019-08-08", "GetSourceMapInfo", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEdition() {
		return this.edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
		if(edition != null){
			putQueryParameter("Edition", edition);
		}
	}

	public String getID() {
		return this.iD;
	}

	public void setID(String iD) {
		this.iD = iD;
		if(iD != null){
			putQueryParameter("ID", iD);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public Boolean getAscendingSequence() {
		return this.ascendingSequence;
	}

	public void setAscendingSequence(Boolean ascendingSequence) {
		this.ascendingSequence = ascendingSequence;
		if(ascendingSequence != null){
			putQueryParameter("AscendingSequence", ascendingSequence.toString());
		}
	}

	public String getOrderField() {
		return this.orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
		if(orderField != null){
			putQueryParameter("OrderField", orderField);
		}
	}

	@Override
	public Class<GetSourceMapInfoResponse> getResponseClass() {
		return GetSourceMapInfoResponse.class;
	}

}
