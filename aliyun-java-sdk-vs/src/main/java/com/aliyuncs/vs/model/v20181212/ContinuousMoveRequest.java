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
public class ContinuousMoveRequest extends RpcAcsRequest<ContinuousMoveResponse> {
	
	public ContinuousMoveRequest() {
		super("vs", "2018-12-12", "ContinuousMove", "vs");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String tilt;

	private String id;

	private String pan;

	private String zoom;

	private Long ownerId;

	public String getTilt() {
		return this.tilt;
	}

	public void setTilt(String tilt) {
		this.tilt = tilt;
		if(tilt != null){
			putQueryParameter("Tilt", tilt);
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

	public String getPan() {
		return this.pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
		if(pan != null){
			putQueryParameter("Pan", pan);
		}
	}

	public String getZoom() {
		return this.zoom;
	}

	public void setZoom(String zoom) {
		this.zoom = zoom;
		if(zoom != null){
			putQueryParameter("Zoom", zoom);
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
	public Class<ContinuousMoveResponse> getResponseClass() {
		return ContinuousMoveResponse.class;
	}

}
