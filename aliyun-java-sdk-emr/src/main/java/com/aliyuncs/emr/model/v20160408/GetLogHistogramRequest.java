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

/**
 * @author auto create
 * @version 
 */
public class GetLogHistogramRequest extends RpcAcsRequest<GetLogHistogramResponse> {
	
	public GetLogHistogramRequest() {
		super("Emr", "2016-04-08", "GetLogHistogram", "emr");
	}

	private Long resourceOwnerId;

	private String hostInnerIp;

	private String hostName;

	private String logstoreName;

	private Integer fromTimestamp;

	private Integer toTimestamp;

	private String slsQueryString;

	private String clusterId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	@Override
	public Class<GetLogHistogramResponse> getResponseClass() {
		return GetLogHistogramResponse.class;
	}

}
