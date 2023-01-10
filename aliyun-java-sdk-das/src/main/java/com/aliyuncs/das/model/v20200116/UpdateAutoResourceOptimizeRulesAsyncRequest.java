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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAutoResourceOptimizeRulesAsyncRequest extends RpcAcsRequest<UpdateAutoResourceOptimizeRulesAsyncResponse> {
	   

	private String resultId;

	private String consoleContext;

	private String instanceIds;

	private Double tableSpaceSize;

	private Double tableFragmentationRatio;
	public UpdateAutoResourceOptimizeRulesAsyncRequest() {
		super("DAS", "2020-01-16", "UpdateAutoResourceOptimizeRulesAsync");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResultId() {
		return this.resultId;
	}

	public void setResultId(String resultId) {
		this.resultId = resultId;
		if(resultId != null){
			putQueryParameter("ResultId", resultId);
		}
	}

	public String getConsoleContext() {
		return this.consoleContext;
	}

	public void setConsoleContext(String consoleContext) {
		this.consoleContext = consoleContext;
		if(consoleContext != null){
			putQueryParameter("ConsoleContext", consoleContext);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public Double getTableSpaceSize() {
		return this.tableSpaceSize;
	}

	public void setTableSpaceSize(Double tableSpaceSize) {
		this.tableSpaceSize = tableSpaceSize;
		if(tableSpaceSize != null){
			putQueryParameter("TableSpaceSize", tableSpaceSize.toString());
		}
	}

	public Double getTableFragmentationRatio() {
		return this.tableFragmentationRatio;
	}

	public void setTableFragmentationRatio(Double tableFragmentationRatio) {
		this.tableFragmentationRatio = tableFragmentationRatio;
		if(tableFragmentationRatio != null){
			putQueryParameter("TableFragmentationRatio", tableFragmentationRatio.toString());
		}
	}

	@Override
	public Class<UpdateAutoResourceOptimizeRulesAsyncResponse> getResponseClass() {
		return UpdateAutoResourceOptimizeRulesAsyncResponse.class;
	}

}
