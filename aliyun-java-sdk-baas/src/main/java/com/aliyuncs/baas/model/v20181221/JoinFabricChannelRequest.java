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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class JoinFabricChannelRequest extends RpcAcsRequest<JoinFabricChannelResponse> {
	   

	private String _do;

	private String location;

	private String channelId;
	public JoinFabricChannelRequest() {
		super("Baas", "2018-12-21", "JoinFabricChannel", "baas");
		setMethod(MethodType.PUT);
	}

	public String get_Do() {
		return this._do;
	}

	public void set_Do(String _do) {
		this._do = _do;
		if(_do != null){
			putQueryParameter("Do", _do);
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putBodyParameter("Location", location);
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<JoinFabricChannelResponse> getResponseClass() {
		return JoinFabricChannelResponse.class;
	}

}
