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

package com.aliyuncs.drcloud.model.v20190213;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetAnswerRequest extends RpcAcsRequest<GetAnswerResponse> {
	
	public GetAnswerRequest() {
		super("drcloud", "2019-02-13", "GetAnswer");
	}

	private String nodeType;

	private Long docContentStructureId;

	private String queryChannel;

	private String sessionId;

	private Integer needAnswerNum;

	private String userQuestion;

	private String sourceEnum;

	private String sopInstanceKey;

	private String requestId;

	private Long customerId;

	private Long tenantId;

	private String categories;

	private Long nodeId;

	public String getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
		if(nodeType != null){
			putQueryParameter("NodeType", nodeType);
		}
	}

	public Long getDocContentStructureId() {
		return this.docContentStructureId;
	}

	public void setDocContentStructureId(Long docContentStructureId) {
		this.docContentStructureId = docContentStructureId;
		if(docContentStructureId != null){
			putQueryParameter("DocContentStructureId", docContentStructureId.toString());
		}
	}

	public String getQueryChannel() {
		return this.queryChannel;
	}

	public void setQueryChannel(String queryChannel) {
		this.queryChannel = queryChannel;
		if(queryChannel != null){
			putQueryParameter("QueryChannel", queryChannel);
		}
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putQueryParameter("SessionId", sessionId);
		}
	}

	public Integer getNeedAnswerNum() {
		return this.needAnswerNum;
	}

	public void setNeedAnswerNum(Integer needAnswerNum) {
		this.needAnswerNum = needAnswerNum;
		if(needAnswerNum != null){
			putQueryParameter("NeedAnswerNum", needAnswerNum.toString());
		}
	}

	public String getUserQuestion() {
		return this.userQuestion;
	}

	public void setUserQuestion(String userQuestion) {
		this.userQuestion = userQuestion;
		if(userQuestion != null){
			putQueryParameter("UserQuestion", userQuestion);
		}
	}

	public String getSourceEnum() {
		return this.sourceEnum;
	}

	public void setSourceEnum(String sourceEnum) {
		this.sourceEnum = sourceEnum;
		if(sourceEnum != null){
			putQueryParameter("SourceEnum", sourceEnum);
		}
	}

	public String getSopInstanceKey() {
		return this.sopInstanceKey;
	}

	public void setSopInstanceKey(String sopInstanceKey) {
		this.sopInstanceKey = sopInstanceKey;
		if(sopInstanceKey != null){
			putQueryParameter("SopInstanceKey", sopInstanceKey);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
		if(customerId != null){
			putQueryParameter("CustomerId", customerId.toString());
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId.toString());
		}
	}

	public String getCategories() {
		return this.categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
		if(categories != null){
			putQueryParameter("Categories", categories);
		}
	}

	public Long getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putQueryParameter("NodeId", nodeId.toString());
		}
	}

	@Override
	public Class<GetAnswerResponse> getResponseClass() {
		return GetAnswerResponse.class;
	}

}
