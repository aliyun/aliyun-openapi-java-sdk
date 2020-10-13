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

package com.aliyuncs.rtc.model.v20180111;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rtc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMPULayoutRequest extends RpcAcsRequest<CreateMPULayoutResponse> {
	   

	private List<Panes> paness;

	private Long ownerId;

	private String appId;

	private String name;

	private Integer audioMixCount;
	public CreateMPULayoutRequest() {
		super("rtc", "2018-01-11", "CreateMPULayout", "rtc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Panes> getPaness() {
		return this.paness;
	}

	public void setPaness(List<Panes> paness) {
		this.paness = paness;	
		if (paness != null) {
			for (int depth1 = 0; depth1 < paness.size(); depth1++) {
				putQueryParameter("Panes." + (depth1 + 1) + ".PaneId" , paness.get(depth1).getPaneId());
				putQueryParameter("Panes." + (depth1 + 1) + ".MajorPane" , paness.get(depth1).getMajorPane());
				putQueryParameter("Panes." + (depth1 + 1) + ".X" , paness.get(depth1).getX());
				putQueryParameter("Panes." + (depth1 + 1) + ".Y" , paness.get(depth1).getY());
				putQueryParameter("Panes." + (depth1 + 1) + ".Width" , paness.get(depth1).getWidth());
				putQueryParameter("Panes." + (depth1 + 1) + ".Height" , paness.get(depth1).getHeight());
				putQueryParameter("Panes." + (depth1 + 1) + ".ZOrder" , paness.get(depth1).getZOrder());
			}
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getAudioMixCount() {
		return this.audioMixCount;
	}

	public void setAudioMixCount(Integer audioMixCount) {
		this.audioMixCount = audioMixCount;
		if(audioMixCount != null){
			putQueryParameter("AudioMixCount", audioMixCount.toString());
		}
	}

	public static class Panes {

		private Integer paneId;

		private Integer majorPane;

		private Float x;

		private Float y;

		private Float width;

		private Float height;

		private Integer zOrder;

		public Integer getPaneId() {
			return this.paneId;
		}

		public void setPaneId(Integer paneId) {
			this.paneId = paneId;
		}

		public Integer getMajorPane() {
			return this.majorPane;
		}

		public void setMajorPane(Integer majorPane) {
			this.majorPane = majorPane;
		}

		public Float getX() {
			return this.x;
		}

		public void setX(Float x) {
			this.x = x;
		}

		public Float getY() {
			return this.y;
		}

		public void setY(Float y) {
			this.y = y;
		}

		public Float getWidth() {
			return this.width;
		}

		public void setWidth(Float width) {
			this.width = width;
		}

		public Float getHeight() {
			return this.height;
		}

		public void setHeight(Float height) {
			this.height = height;
		}

		public Integer getZOrder() {
			return this.zOrder;
		}

		public void setZOrder(Integer zOrder) {
			this.zOrder = zOrder;
		}
	}

	@Override
	public Class<CreateMPULayoutResponse> getResponseClass() {
		return CreateMPULayoutResponse.class;
	}

}
