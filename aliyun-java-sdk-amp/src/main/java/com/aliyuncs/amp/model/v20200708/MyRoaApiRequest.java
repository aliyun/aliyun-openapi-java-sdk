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

package com.aliyuncs.amp.model.v20200708;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MyRoaApiRequest extends RoaAcsRequest<MyRoaApiResponse> {
	   

	private String resourceownerid;

	private String resourceowneraccount;

	private String securitytoken;

	private String owneraccount;

	private String name;

	private String accesskeysecret;

	private String id;

	private String ownerid;
	public MyRoaApiRequest() {
		super("amp", "2020-07-08", "MyRoaApi", "jeepproduct001");
		setUriPattern("/my/roa/test");
		setMethod(MethodType.GET);
	}

	public String getResourceownerid() {
		return this.resourceownerid;
	}

	public void setResourceownerid(String resourceownerid) {
		this.resourceownerid = resourceownerid;
		if(resourceownerid != null){
			putQueryParameter("resourceownerid", resourceownerid);
		}
	}

	public String getResourceowneraccount() {
		return this.resourceowneraccount;
	}

	public void setResourceowneraccount(String resourceowneraccount) {
		this.resourceowneraccount = resourceowneraccount;
		if(resourceowneraccount != null){
			putPathParameter("resourceowneraccount", resourceowneraccount);
		}
	}

	public String getSecuritytoken() {
		return this.securitytoken;
	}

	public void setSecuritytoken(String securitytoken) {
		this.securitytoken = securitytoken;
		if(securitytoken != null){
			putQueryParameter("securitytoken", securitytoken);
		}
	}

	public String getOwneraccount() {
		return this.owneraccount;
	}

	public void setOwneraccount(String owneraccount) {
		this.owneraccount = owneraccount;
		if(owneraccount != null){
			putHeaderParameter("owneraccount", owneraccount);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("name", name);
		}
	}

	public String getAccesskeysecret() {
		return this.accesskeysecret;
	}

	public void setAccesskeysecret(String accesskeysecret) {
		this.accesskeysecret = accesskeysecret;
		if(accesskeysecret != null){
			putQueryParameter("accesskeysecret", accesskeysecret);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("id", id);
		}
	}

	public String getOwnerid() {
		return this.ownerid;
	}

	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
		if(ownerid != null){
			putQueryParameter("ownerid", ownerid);
		}
	}

	@Override
	public Class<MyRoaApiResponse> getResponseClass() {
		return MyRoaApiResponse.class;
	}

}
