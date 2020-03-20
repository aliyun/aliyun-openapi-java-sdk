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

package com.aliyuncs.ros.model.v20150901;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class WaitConditionsRequest extends RoaAcsRequest<WaitConditionsResponse> {
	   

	private String resource;

	private String signature;

	private String stackid;

	private String expire;

	private String stackname;
	public WaitConditionsRequest() {
		super("ROS", "2015-09-01", "WaitConditions", "ROS");
		setUriPattern("/waitcondition");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResource() {
		return this.resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
		if(resource != null){
			putQueryParameter("resource", resource);
		}
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
		if(signature != null){
			putQueryParameter("signature", signature);
		}
	}

	public String getStackid() {
		return this.stackid;
	}

	public void setStackid(String stackid) {
		this.stackid = stackid;
		if(stackid != null){
			putQueryParameter("stackid", stackid);
		}
	}

	public String getExpire() {
		return this.expire;
	}

	public void setExpire(String expire) {
		this.expire = expire;
		if(expire != null){
			putQueryParameter("expire", expire);
		}
	}

	public String getStackname() {
		return this.stackname;
	}

	public void setStackname(String stackname) {
		this.stackname = stackname;
		if(stackname != null){
			putQueryParameter("stackname", stackname);
		}
	}

	@Override
	public Class<WaitConditionsResponse> getResponseClass() {
		return WaitConditionsResponse.class;
	}

}
