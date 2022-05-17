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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteSolutionRequest extends RpcAcsRequest<DeleteSolutionResponse> {
	   

	private Long knowledgeId;

	@SerializedName("solutionIds")
	private List<Long> solutionIds;

	private String operatorId;

	private String robotCode;

	private String operatorName;
	public DeleteSolutionRequest() {
		super("RetailBot", "2021-02-24", "DeleteSolution");
		setMethod(MethodType.POST);
	}

	public Long getKnowledgeId() {
		return this.knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
		if(knowledgeId != null){
			putBodyParameter("KnowledgeId", knowledgeId.toString());
		}
	}

	public List<Long> getSolutionIds() {
		return this.solutionIds;
	}

	public void setSolutionIds(List<Long> solutionIds) {
		this.solutionIds = solutionIds;	
		if (solutionIds != null) {
			putBodyParameter("SolutionIds" , new Gson().toJson(solutionIds));
		}	
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
		if(operatorId != null){
			putBodyParameter("OperatorId", operatorId);
		}
	}

	public String getRobotCode() {
		return this.robotCode;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
		if(robotCode != null){
			putBodyParameter("RobotCode", robotCode);
		}
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
		if(operatorName != null){
			putBodyParameter("OperatorName", operatorName);
		}
	}

	@Override
	public Class<DeleteSolutionResponse> getResponseClass() {
		return DeleteSolutionResponse.class;
	}

}
