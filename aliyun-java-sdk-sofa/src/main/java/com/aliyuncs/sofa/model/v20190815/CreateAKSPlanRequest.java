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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAKSPlanRequest extends RpcAcsRequest<CreateAKSPlanResponse> {
	   

	private Boolean autoExecution;

	private String workspace;

	private String executorName;

	private String executorId;

	private String title;

	private String opsType;

	private String executor;

	private List<Context> contexts;

	private String aksServiceInfosJsonStr;
	public CreateAKSPlanRequest() {
		super("SOFA", "2019-08-15", "CreateAKSPlan", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAutoExecution() {
		return this.autoExecution;
	}

	public void setAutoExecution(Boolean autoExecution) {
		this.autoExecution = autoExecution;
		if(autoExecution != null){
			putBodyParameter("AutoExecution", autoExecution.toString());
		}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public String getExecutorName() {
		return this.executorName;
	}

	public void setExecutorName(String executorName) {
		this.executorName = executorName;
		if(executorName != null){
			putBodyParameter("ExecutorName", executorName);
		}
	}

	public String getExecutorId() {
		return this.executorId;
	}

	public void setExecutorId(String executorId) {
		this.executorId = executorId;
		if(executorId != null){
			putBodyParameter("ExecutorId", executorId);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putBodyParameter("Title", title);
		}
	}

	public String getOpsType() {
		return this.opsType;
	}

	public void setOpsType(String opsType) {
		this.opsType = opsType;
		if(opsType != null){
			putBodyParameter("OpsType", opsType);
		}
	}

	public String getExecutor() {
		return this.executor;
	}

	public void setExecutor(String executor) {
		this.executor = executor;
		if(executor != null){
			putBodyParameter("Executor", executor);
		}
	}

	public List<Context> getContexts() {
		return this.contexts;
	}

	public void setContexts(List<Context> contexts) {
		this.contexts = contexts;	
		if (contexts != null) {
			for (int depth1 = 0; depth1 < contexts.size(); depth1++) {
				putBodyParameter("Context." + (depth1 + 1) + ".Value" , contexts.get(depth1).getValue());
				putBodyParameter("Context." + (depth1 + 1) + ".Key" , contexts.get(depth1).getKey());
			}
		}	
	}

	public String getAksServiceInfosJsonStr() {
		return this.aksServiceInfosJsonStr;
	}

	public void setAksServiceInfosJsonStr(String aksServiceInfosJsonStr) {
		this.aksServiceInfosJsonStr = aksServiceInfosJsonStr;
		if(aksServiceInfosJsonStr != null){
			putBodyParameter("AksServiceInfosJsonStr", aksServiceInfosJsonStr);
		}
	}

	public static class Context {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateAKSPlanResponse> getResponseClass() {
		return CreateAKSPlanResponse.class;
	}

}
