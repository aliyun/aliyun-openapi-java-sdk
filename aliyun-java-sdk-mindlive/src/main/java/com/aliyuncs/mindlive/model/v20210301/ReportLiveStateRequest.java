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

package com.aliyuncs.mindlive.model.v20210301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ReportLiveStateRequest extends RpcAcsRequest<ReportLiveStateResponse> {
	   

	private String liveMode;

	private String liveState;

	private String id;

	private Long startTime;

	private String type;

	private String anchorId;
	public ReportLiveStateRequest() {
		super("MindLive", "2021-03-01", "ReportLiveState");
		setMethod(MethodType.POST);
	}

	public String getLiveMode() {
		return this.liveMode;
	}

	public void setLiveMode(String liveMode) {
		this.liveMode = liveMode;
		if(liveMode != null){
			putQueryParameter("LiveMode", liveMode);
		}
	}

	public String getLiveState() {
		return this.liveState;
	}

	public void setLiveState(String liveState) {
		this.liveState = liveState;
		if(liveState != null){
			putQueryParameter("LiveState", liveState);
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

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
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

	public String getAnchorId() {
		return this.anchorId;
	}

	public void setAnchorId(String anchorId) {
		this.anchorId = anchorId;
		if(anchorId != null){
			putQueryParameter("AnchorId", anchorId);
		}
	}

	@Override
	public Class<ReportLiveStateResponse> getResponseClass() {
		return ReportLiveStateResponse.class;
	}

}
