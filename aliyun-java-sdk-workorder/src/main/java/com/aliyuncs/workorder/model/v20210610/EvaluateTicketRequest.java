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

package com.aliyuncs.workorder.model.v20210610;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.workorder.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EvaluateTicketRequest extends RpcAcsRequest<EvaluateTicketResponse> {
	   

	private Boolean solved;

	private String content;

	private String score;

	private String ticketId;
	public EvaluateTicketRequest() {
		super("Workorder", "2021-06-10", "EvaluateTicket");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getSolved() {
		return this.solved;
	}

	public void setSolved(Boolean solved) {
		this.solved = solved;
		if(solved != null){
			putBodyParameter("Solved", solved.toString());
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
		if(score != null){
			putBodyParameter("Score", score);
		}
	}

	public String getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
		if(ticketId != null){
			putBodyParameter("TicketId", ticketId);
		}
	}

	@Override
	public Class<EvaluateTicketResponse> getResponseClass() {
		return EvaluateTicketResponse.class;
	}

}
