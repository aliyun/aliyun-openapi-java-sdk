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
public class ListServiceLogRequest extends RpcAcsRequest<ListServiceLogResponse> {
	
	public ListServiceLogRequest() {
		super("Emr", "2016-04-08", "ListServiceLog");
	}

	private Long resourceOwnerId;

	private String hostName;

	private Integer maxKeys;

	private String logstoreName;

	private String marker;

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

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public Integer getMaxKeys() {
		return this.maxKeys;
	}

	public void setMaxKeys(Integer maxKeys) {
		this.maxKeys = maxKeys;
		if(maxKeys != null){
			putQueryParameter("MaxKeys", maxKeys.toString());
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

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
		if(marker != null){
			putQueryParameter("Marker", marker);
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
	public Class<ListServiceLogResponse> getResponseClass() {
		return ListServiceLogResponse.class;
	}

}
