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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeStreamURLRequest extends RpcAcsRequest<DescribeStreamURLResponse> {
	
	public DescribeStreamURLRequest() {
		super("vs", "2018-12-12", "DescribeStreamURL", "vs");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String authKey;

	private Boolean auth;

	private String type;

	private String id;

	private String outProtocol;

	private Long ownerId;

	private Long expire;

	private String location;

	public String getAuthKey() {
		return this.authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
		if(authKey != null){
			putQueryParameter("AuthKey", authKey);
		}
	}

	public Boolean getAuth() {
		return this.auth;
	}

	public void setAuth(Boolean auth) {
		this.auth = auth;
		if(auth != null){
			putQueryParameter("Auth", auth.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getOutProtocol() {
		return this.outProtocol;
	}

	public void setOutProtocol(String outProtocol) {
		this.outProtocol = outProtocol;
		if(outProtocol != null){
			putQueryParameter("OutProtocol", outProtocol);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Long getExpire() {
		return this.expire;
	}

	public void setExpire(Long expire) {
		this.expire = expire;
		if(expire != null){
			putQueryParameter("Expire", expire.toString());
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putQueryParameter("Location", location);
		}
	}

	@Override
	public Class<DescribeStreamURLResponse> getResponseClass() {
		return DescribeStreamURLResponse.class;
	}

}
