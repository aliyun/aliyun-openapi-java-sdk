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

package com.aliyuncs.ubsms.model.v20150623;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetUserBusinessStatusRequest extends RpcAcsRequest<SetUserBusinessStatusResponse> {
	
	public SetUserBusinessStatusRequest() {
		super("Ubsms", "2015-06-23", "SetUserBusinessStatus", "ubsms");
	}

	private String uid;

	private String statusValue;

	private String service;

	private String statusKey;

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
		}
	}

	public String getStatusValue() {
		return this.statusValue;
	}

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
		if(statusValue != null){
			putQueryParameter("StatusValue", statusValue);
		}
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
		if(service != null){
			putQueryParameter("Service", service);
		}
	}

	public String getStatusKey() {
		return this.statusKey;
	}

	public void setStatusKey(String statusKey) {
		this.statusKey = statusKey;
		if(statusKey != null){
			putQueryParameter("StatusKey", statusKey);
		}
	}

	@Override
	public Class<SetUserBusinessStatusResponse> getResponseClass() {
		return SetUserBusinessStatusResponse.class;
	}

}
