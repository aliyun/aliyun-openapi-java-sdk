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

package com.aliyuncs.ddoscoo.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ddoscoo.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesRequest extends RpcAcsRequest<DescribeInstancesResponse> {
	   

	private Integer edition;

	private String remark;

	private String pageNumber;

	private Integer enabled;

	private String resourceGroupId;

	private String pageSize;

	private List<Tag> tags;

	private Long expireStartTime;

	private Long expireEndTime;

	private String ip;

	private List<String> instanceIdss;

	private List<Integer> statuss;
	public DescribeInstancesRequest() {
		super("ddoscoo", "2020-01-01", "DescribeInstances");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getEdition() {
		return this.edition;
	}

	public void setEdition(Integer edition) {
		this.edition = edition;
		if(edition != null){
			putQueryParameter("Edition", edition.toString());
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber);
		}
	}

	public Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putQueryParameter("Enabled", enabled.toString());
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public Long getExpireStartTime() {
		return this.expireStartTime;
	}

	public void setExpireStartTime(Long expireStartTime) {
		this.expireStartTime = expireStartTime;
		if(expireStartTime != null){
			putQueryParameter("ExpireStartTime", expireStartTime.toString());
		}
	}

	public Long getExpireEndTime() {
		return this.expireEndTime;
	}

	public void setExpireEndTime(Long expireEndTime) {
		this.expireEndTime = expireEndTime;
		if(expireEndTime != null){
			putQueryParameter("ExpireEndTime", expireEndTime.toString());
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	public List<String> getInstanceIdss() {
		return this.instanceIdss;
	}

	public void setInstanceIdss(List<String> instanceIdss) {
		this.instanceIdss = instanceIdss;	
		if (instanceIdss != null) {
			for (int i = 0; i < instanceIdss.size(); i++) {
				putQueryParameter("InstanceIds." + (i + 1) , instanceIdss.get(i));
			}
		}	
	}

	public List<Integer> getStatuss() {
		return this.statuss;
	}

	public void setStatuss(List<Integer> statuss) {
		this.statuss = statuss;	
		if (statuss != null) {
			for (int i = 0; i < statuss.size(); i++) {
				putQueryParameter("Status." + (i + 1) , statuss.get(i));
			}
		}	
	}

	public static class Tag {

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
	public Class<DescribeInstancesResponse> getResponseClass() {
		return DescribeInstancesResponse.class;
	}

}
