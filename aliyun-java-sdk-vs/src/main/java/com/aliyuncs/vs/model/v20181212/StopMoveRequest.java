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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StopMoveRequest extends RpcAcsRequest<StopMoveResponse> {
	   

	private Boolean tilt;

	private String subProtocol;

	private String id;

	private Boolean pan;

	private Boolean zoom;

	private Long ownerId;
	public StopMoveRequest() {
		super("vs", "2018-12-12", "StopMove");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getTilt() {
		return this.tilt;
	}

	public void setTilt(Boolean tilt) {
		this.tilt = tilt;
		if(tilt != null){
			putQueryParameter("Tilt", tilt.toString());
		}
	}

	public String getSubProtocol() {
		return this.subProtocol;
	}

	public void setSubProtocol(String subProtocol) {
		this.subProtocol = subProtocol;
		if(subProtocol != null){
			putQueryParameter("SubProtocol", subProtocol);
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

	public Boolean getPan() {
		return this.pan;
	}

	public void setPan(Boolean pan) {
		this.pan = pan;
		if(pan != null){
			putQueryParameter("Pan", pan.toString());
		}
	}

	public Boolean getZoom() {
		return this.zoom;
	}

	public void setZoom(Boolean zoom) {
		this.zoom = zoom;
		if(zoom != null){
			putQueryParameter("Zoom", zoom.toString());
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

	@Override
	public Class<StopMoveResponse> getResponseClass() {
		return StopMoveResponse.class;
	}

}
