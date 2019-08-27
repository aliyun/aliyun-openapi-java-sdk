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
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ContextQueryLogRequest extends RpcAcsRequest<ContextQueryLogResponse> {
	
	public ContextQueryLogRequest() {
		super("Emr", "2016-04-08", "ContextQueryLog", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String packId;

	private Long resourceOwnerId;

	private Integer totalOffset;

	private Integer size;

	private String packMeta;

	private Integer from;

	private String clusterId;

	private Integer to;

	private Boolean reverse;

	private String logStore;

	public String getPackId() {
		return this.packId;
	}

	public void setPackId(String packId) {
		this.packId = packId;
		if(packId != null){
			putQueryParameter("PackId", packId);
		}
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

	public Integer getTotalOffset() {
		return this.totalOffset;
	}

	public void setTotalOffset(Integer totalOffset) {
		this.totalOffset = totalOffset;
		if(totalOffset != null){
			putQueryParameter("TotalOffset", totalOffset.toString());
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public String getPackMeta() {
		return this.packMeta;
	}

	public void setPackMeta(String packMeta) {
		this.packMeta = packMeta;
		if(packMeta != null){
			putQueryParameter("PackMeta", packMeta);
		}
	}

	public Integer getFrom() {
		return this.from;
	}

	public void setFrom(Integer from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from.toString());
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

	public Integer getTo() {
		return this.to;
	}

	public void setTo(Integer to) {
		this.to = to;
		if(to != null){
			putQueryParameter("To", to.toString());
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

	public String getLogStore() {
		return this.logStore;
	}

	public void setLogStore(String logStore) {
		this.logStore = logStore;
		if(logStore != null){
			putQueryParameter("LogStore", logStore);
		}
	}

	@Override
	public Class<ContextQueryLogResponse> getResponseClass() {
		return ContextQueryLogResponse.class;
	}

}
