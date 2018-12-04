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

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryBlockRequest extends RpcAcsRequest<QueryBlockResponse> {
	
	public QueryBlockRequest() {
		super("Baas", "2018-07-31", "QueryBlock");
	}

	private String bizid;

	private Long height;

	public String getBizid() {
		return this.bizid;
	}

	public void setBizid(String bizid) {
		this.bizid = bizid;
		if(bizid != null){
			putBodyParameter("Bizid", bizid);
		}
	}

	public Long getHeight() {
		return this.height;
	}

	public void setHeight(Long height) {
		this.height = height;
		if(height != null){
			putBodyParameter("Height", height.toString());
		}
	}

	@Override
	public Class<QueryBlockResponse> getResponseClass() {
		return QueryBlockResponse.class;
	}

}
