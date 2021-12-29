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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dcdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DcdnHttpRequestTestToolRequest extends RpcAcsRequest<DcdnHttpRequestTestToolResponse> {
	   

	private String proxyIp;

	private String scheme;

	private String body;

	private String host;

	private String method;

	private Long ownerId;

	private String uri;

	private String args;

	private String header;
	public DcdnHttpRequestTestToolRequest() {
		super("dcdn", "2018-01-15", "DcdnHttpRequestTestTool");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProxyIp() {
		return this.proxyIp;
	}

	public void setProxyIp(String proxyIp) {
		this.proxyIp = proxyIp;
		if(proxyIp != null){
			putBodyParameter("ProxyIp", proxyIp);
		}
	}

	public String getScheme() {
		return this.scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
		if(scheme != null){
			putBodyParameter("Scheme", scheme);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("Body", body);
		}
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
		if(host != null){
			putBodyParameter("Host", host);
		}
	}

	public String getBizMethod() {
		return this.method;
	}

	public void setBizMethod(String method) {
		this.method = method;
		if(method != null){
			putBodyParameter("Method", method);
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

	public String getUri() {
		return this.uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
		if(uri != null){
			putBodyParameter("Uri", uri);
		}
	}

	public String getArgs() {
		return this.args;
	}

	public void setArgs(String args) {
		this.args = args;
		if(args != null){
			putBodyParameter("Args", args);
		}
	}

	public String getHeader() {
		return this.header;
	}

	public void setHeader(String header) {
		this.header = header;
		if(header != null){
			putBodyParameter("Header", header);
		}
	}

	@Override
	public Class<DcdnHttpRequestTestToolResponse> getResponseClass() {
		return DcdnHttpRequestTestToolResponse.class;
	}

}
