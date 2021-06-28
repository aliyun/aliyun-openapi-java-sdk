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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeInvocationsRequest extends RpcAcsRequest<DescribeInvocationsResponse> {
	   

	private String invokeId;

	private String invokeStatus;

	private Boolean includeOutput;

	private String commandType;

	private String nextToken;

	private String contentEncoding;

	private Integer maxResults;

	private String desktopId;
	public DescribeInvocationsRequest() {
		super("ecd", "2020-09-30", "DescribeInvocations", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInvokeId() {
		return this.invokeId;
	}

	public void setInvokeId(String invokeId) {
		this.invokeId = invokeId;
		if(invokeId != null){
			putQueryParameter("InvokeId", invokeId);
		}
	}

	public String getInvokeStatus() {
		return this.invokeStatus;
	}

	public void setInvokeStatus(String invokeStatus) {
		this.invokeStatus = invokeStatus;
		if(invokeStatus != null){
			putQueryParameter("InvokeStatus", invokeStatus);
		}
	}

	public Boolean getIncludeOutput() {
		return this.includeOutput;
	}

	public void setIncludeOutput(Boolean includeOutput) {
		this.includeOutput = includeOutput;
		if(includeOutput != null){
			putQueryParameter("IncludeOutput", includeOutput.toString());
		}
	}

	public String getCommandType() {
		return this.commandType;
	}

	public void setCommandType(String commandType) {
		this.commandType = commandType;
		if(commandType != null){
			putQueryParameter("CommandType", commandType);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getContentEncoding() {
		return this.contentEncoding;
	}

	public void setContentEncoding(String contentEncoding) {
		this.contentEncoding = contentEncoding;
		if(contentEncoding != null){
			putQueryParameter("ContentEncoding", contentEncoding);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getDesktopId() {
		return this.desktopId;
	}

	public void setDesktopId(String desktopId) {
		this.desktopId = desktopId;
		if(desktopId != null){
			putQueryParameter("DesktopId", desktopId);
		}
	}

	@Override
	public Class<DescribeInvocationsResponse> getResponseClass() {
		return DescribeInvocationsResponse.class;
	}

}
