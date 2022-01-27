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
public class GetQueryOptimizeDataTrendRequest extends RpcAcsRequest<GetQueryOptimizeDataTrendResponse> {
	   

	private String start;

	private String tagNames;

	private String consoleContext;

	private String engine;

	private String instanceIds;

	private String end;
	public GetQueryOptimizeDataTrendRequest() {
		super("DAS", "2020-01-16", "GetQueryOptimizeDataTrend", "das");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStart() {
		return this.start;
	}

	public void setStart(String start) {
		this.start = start;
		if(start != null){
			putQueryParameter("Start", start);
		}
	}

	public String getTagNames() {
		return this.tagNames;
	}

	public void setTagNames(String tagNames) {
		this.tagNames = tagNames;
		if(tagNames != null){
			putQueryParameter("TagNames", tagNames);
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

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
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

	public String getEnd() {
		return this.end;
	}

	public void setEnd(String end) {
		this.end = end;
		if(end != null){
			putQueryParameter("End", end);
		}
	}

	@Override
	public Class<GetQueryOptimizeDataTrendResponse> getResponseClass() {
		return GetQueryOptimizeDataTrendResponse.class;
	}

}
