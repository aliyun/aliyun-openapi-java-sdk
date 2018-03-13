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
package com.aliyuncs.jaq.model.v20161123;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AfsCheckRequest extends RpcAcsRequest<AfsCheckResponse> {
	
	public AfsCheckRequest() {
		super("jaq", "2016-11-23", "AfsCheck");
	}

	private String callerName;

	private String session;

	private String token;

	private String sig;

	private Integer platform;

	private String scene;

	public String getCallerName() {
		return this.callerName;
	}

	public void setCallerName(String callerName) {
		this.callerName = callerName;
		putQueryParameter("CallerName", callerName);
	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
		putQueryParameter("Session", session);
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		putQueryParameter("Token", token);
	}

	public String getSig() {
		return this.sig;
	}

	public void setSig(String sig) {
		this.sig = sig;
		putQueryParameter("Sig", sig);
	}

	public Integer getPlatform() {
		return this.platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
		putQueryParameter("Platform", platform);
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		putQueryParameter("Scene", scene);
	}

	@Override
	public Class<AfsCheckResponse> getResponseClass() {
		return AfsCheckResponse.class;
	}

}
