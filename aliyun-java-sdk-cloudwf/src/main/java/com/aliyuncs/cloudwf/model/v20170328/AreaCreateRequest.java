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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AreaCreateRequest extends RpcAcsRequest<AreaCreateResponse> {
	
	public AreaCreateRequest() {
		super("cloudwf", "2017-03-28", "AreaCreate", "cloudwf");
	}

	private String name;

	private String dids;

	private Long sid;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getDids() {
		return this.dids;
	}

	public void setDids(String dids) {
		this.dids = dids;
		if(dids != null){
			putQueryParameter("Dids", dids);
		}
	}

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
		if(sid != null){
			putQueryParameter("Sid", sid.toString());
		}
	}

	@Override
	public Class<AreaCreateResponse> getResponseClass() {
		return AreaCreateResponse.class;
	}

}
