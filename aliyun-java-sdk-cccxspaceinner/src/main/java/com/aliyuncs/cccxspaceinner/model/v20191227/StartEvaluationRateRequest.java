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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StartEvaluationRateRequest extends RpcAcsRequest<StartEvaluationRateResponse> {
	   

	private Long memberId;

	private Long ticketId;

	private Long sceneId;
	public StartEvaluationRateRequest() {
		super("CCCXSpaceInner", "2019-12-27", "StartEvaluationRate");
		setMethod(MethodType.POST);
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
		if(memberId != null){
			putQueryParameter("MemberId", memberId.toString());
		}
	}

	public Long getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
		if(ticketId != null){
			putQueryParameter("TicketId", ticketId.toString());
		}
	}

	public Long getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId.toString());
		}
	}

	@Override
	public Class<StartEvaluationRateResponse> getResponseClass() {
		return StartEvaluationRateResponse.class;
	}

}
