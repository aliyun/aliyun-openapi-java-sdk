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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeInvocationsRequest extends RpcAcsRequest<DescribeInvocationsResponse> {
	   

	private String invokeStatus;

	private List<String> desktopIdss;

	private Boolean includeOutput;

	private String nextToken;

	private String contentEncoding;

	private String endUserId;

	private String desktopId;

	private String invokeId;

	private String commandType;

	private Integer maxResults;

	private Boolean includeInvokeDesktops;
	public DescribeInvocationsRequest() {
		super("ecd", "2020-09-30", "DescribeInvocations", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getDesktopIdss() {
		return this.desktopIdss;
	}

	public void setDesktopIdss(List<String> desktopIdss) {
		this.desktopIdss = desktopIdss;	
		if (desktopIdss != null) {
			for (int i = 0; i < desktopIdss.size(); i++) {
				putQueryParameter("DesktopIds." + (i + 1) , desktopIdss.get(i));
			}
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

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putQueryParameter("EndUserId", endUserId);
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

	public String getInvokeId() {
		return this.invokeId;
	}

	public void setInvokeId(String invokeId) {
		this.invokeId = invokeId;
		if(invokeId != null){
			putQueryParameter("InvokeId", invokeId);
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public Boolean getIncludeInvokeDesktops() {
		return this.includeInvokeDesktops;
	}

	public void setIncludeInvokeDesktops(Boolean includeInvokeDesktops) {
		this.includeInvokeDesktops = includeInvokeDesktops;
		if(includeInvokeDesktops != null){
			putQueryParameter("IncludeInvokeDesktops", includeInvokeDesktops.toString());
		}
	}

	@Override
	public Class<DescribeInvocationsResponse> getResponseClass() {
		return DescribeInvocationsResponse.class;
	}

}
