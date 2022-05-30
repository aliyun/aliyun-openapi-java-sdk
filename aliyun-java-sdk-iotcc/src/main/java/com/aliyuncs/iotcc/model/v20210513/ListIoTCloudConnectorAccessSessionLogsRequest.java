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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListIoTCloudConnectorAccessSessionLogsRequest extends RpcAcsRequest<ListIoTCloudConnectorAccessSessionLogsResponse> {
	   

	private Long startTime;

	private String nextToken;

	private List<String> destinationss;

	private Long endTime;

	private String ioTCloudConnectorId;

	private List<String> sourceIpss;

	private Integer maxResults;
	public ListIoTCloudConnectorAccessSessionLogsRequest() {
		super("IoTCC", "2021-05-13", "ListIoTCloudConnectorAccessSessionLogs", "IoTCC");
		setMethod(MethodType.POST);
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public List<String> getDestinationss() {
		return this.destinationss;
	}

	public void setDestinationss(List<String> destinationss) {
		this.destinationss = destinationss;	
		if (destinationss != null) {
			for (int i = 0; i < destinationss.size(); i++) {
				putQueryParameter("Destinations." + (i + 1) , destinationss.get(i));
			}
		}	
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getIoTCloudConnectorId() {
		return this.ioTCloudConnectorId;
	}

	public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
		this.ioTCloudConnectorId = ioTCloudConnectorId;
		if(ioTCloudConnectorId != null){
			putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
		}
	}

	public List<String> getSourceIpss() {
		return this.sourceIpss;
	}

	public void setSourceIpss(List<String> sourceIpss) {
		this.sourceIpss = sourceIpss;	
		if (sourceIpss != null) {
			for (int i = 0; i < sourceIpss.size(); i++) {
				putQueryParameter("SourceIps." + (i + 1) , sourceIpss.get(i));
			}
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

	@Override
	public Class<ListIoTCloudConnectorAccessSessionLogsResponse> getResponseClass() {
		return ListIoTCloudConnectorAccessSessionLogsResponse.class;
	}

}
