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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryAppResValueRequest extends RpcAcsRequest<QueryAppResValueResponse> {
	   

	private String resType;

	private String resSubType;

	private String valueKeyword;

	private Integer size;

	private Integer index;

	private String appTaskId;

	private String resName;

	private String keyword;

	private String resCode;
	public QueryAppResValueRequest() {
		super("scsp", "2020-07-02", "QueryAppResValue");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResType() {
		return this.resType;
	}

	public void setResType(String resType) {
		this.resType = resType;
		if(resType != null){
			putQueryParameter("ResType", resType);
		}
	}

	public String getResSubType() {
		return this.resSubType;
	}

	public void setResSubType(String resSubType) {
		this.resSubType = resSubType;
		if(resSubType != null){
			putQueryParameter("ResSubType", resSubType);
		}
	}

	public String getValueKeyword() {
		return this.valueKeyword;
	}

	public void setValueKeyword(String valueKeyword) {
		this.valueKeyword = valueKeyword;
		if(valueKeyword != null){
			putQueryParameter("ValueKeyword", valueKeyword);
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public Integer getIndex() {
		return this.index;
	}

	public void setIndex(Integer index) {
		this.index = index;
		if(index != null){
			putQueryParameter("Index", index.toString());
		}
	}

	public String getAppTaskId() {
		return this.appTaskId;
	}

	public void setAppTaskId(String appTaskId) {
		this.appTaskId = appTaskId;
		if(appTaskId != null){
			putQueryParameter("AppTaskId", appTaskId);
		}
	}

	public String getResName() {
		return this.resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
		if(resName != null){
			putQueryParameter("ResName", resName);
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

	public String getResCode() {
		return this.resCode;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
		if(resCode != null){
			putQueryParameter("ResCode", resCode);
		}
	}

	@Override
	public Class<QueryAppResValueResponse> getResponseClass() {
		return QueryAppResValueResponse.class;
	}

}
