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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchLogRequest extends RpcAcsRequest<SearchLogResponse> {
	   

	private Long resourceOwnerId;

	private Integer line;

	private String hostName;

	private String logstoreName;

	private Integer fromTimestamp;

	private Integer offset;

	private String clusterId;

	private Boolean reverse;

	private String hostInnerIp;

	private Integer toTimestamp;

	private String slsQueryString;
	public SearchLogRequest() {
		super("Emr", "2016-04-08", "SearchLog");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getLine() {
		return this.line;
	}

	public void setLine(Integer line) {
		this.line = line;
		if(line != null){
			putQueryParameter("Line", line.toString());
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public String getLogstoreName() {
		return this.logstoreName;
	}

	public void setLogstoreName(String logstoreName) {
		this.logstoreName = logstoreName;
		if(logstoreName != null){
			putQueryParameter("LogstoreName", logstoreName);
		}
	}

	public Integer getFromTimestamp() {
		return this.fromTimestamp;
	}

	public void setFromTimestamp(Integer fromTimestamp) {
		this.fromTimestamp = fromTimestamp;
		if(fromTimestamp != null){
			putQueryParameter("FromTimestamp", fromTimestamp.toString());
		}
	}

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Boolean getReverse() {
		return this.reverse;
	}

	public void setReverse(Boolean reverse) {
		this.reverse = reverse;
		if(reverse != null){
			putQueryParameter("Reverse", reverse.toString());
		}
	}

	public String getHostInnerIp() {
		return this.hostInnerIp;
	}

	public void setHostInnerIp(String hostInnerIp) {
		this.hostInnerIp = hostInnerIp;
		if(hostInnerIp != null){
			putQueryParameter("HostInnerIp", hostInnerIp);
		}
	}

	public Integer getToTimestamp() {
		return this.toTimestamp;
	}

	public void setToTimestamp(Integer toTimestamp) {
		this.toTimestamp = toTimestamp;
		if(toTimestamp != null){
			putQueryParameter("ToTimestamp", toTimestamp.toString());
		}
	}

	public String getSlsQueryString() {
		return this.slsQueryString;
	}

	public void setSlsQueryString(String slsQueryString) {
		this.slsQueryString = slsQueryString;
		if(slsQueryString != null){
			putQueryParameter("SlsQueryString", slsQueryString);
		}
	}

	@Override
	public Class<SearchLogResponse> getResponseClass() {
		return SearchLogResponse.class;
	}

}
