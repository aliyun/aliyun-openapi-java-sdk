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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddPolarFsQuotaRequest extends RpcAcsRequest<AddPolarFsQuotaResponse> {
	   

	private List<Quotas> quotass;

	private String dBClusterId;

	private String polarFsInstanceId;
	public AddPolarFsQuotaRequest() {
		super("polardb", "2017-08-01", "AddPolarFsQuota", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Quotas> getQuotass() {
		return this.quotass;
	}

	public void setQuotass(List<Quotas> quotass) {
		this.quotass = quotass;	
		if (quotass != null) {
			for (int depth1 = 0; depth1 < quotass.size(); depth1++) {
				putQueryParameter("Quotas." + (depth1 + 1) + ".Include" , quotass.get(depth1).getInclude());
				putQueryParameter("Quotas." + (depth1 + 1) + ".ChangeTTL" , quotass.get(depth1).getChangeTTL());
				putQueryParameter("Quotas." + (depth1 + 1) + ".SizeLimit" , quotass.get(depth1).getSizeLimit());
				putQueryParameter("Quotas." + (depth1 + 1) + ".AccessTTL" , quotass.get(depth1).getAccessTTL());
				putQueryParameter("Quotas." + (depth1 + 1) + ".Name" , quotass.get(depth1).getName());
				putQueryParameter("Quotas." + (depth1 + 1) + ".Description" , quotass.get(depth1).getDescription());
				putQueryParameter("Quotas." + (depth1 + 1) + ".Exclude" , quotass.get(depth1).getExclude());
				putQueryParameter("Quotas." + (depth1 + 1) + ".Priority" , quotass.get(depth1).getPriority());
				putQueryParameter("Quotas." + (depth1 + 1) + ".Enabled" , quotass.get(depth1).getEnabled());
				putQueryParameter("Quotas." + (depth1 + 1) + ".FileCountLimit" , quotass.get(depth1).getFileCountLimit());
			}
		}	
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getPolarFsInstanceId() {
		return this.polarFsInstanceId;
	}

	public void setPolarFsInstanceId(String polarFsInstanceId) {
		this.polarFsInstanceId = polarFsInstanceId;
		if(polarFsInstanceId != null){
			putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
		}
	}

	public static class Quotas {

		private String include;

		private Long changeTTL;

		private Long sizeLimit;

		private Long accessTTL;

		private String name;

		private String description;

		private String exclude;

		private Integer priority;

		private Boolean enabled;

		private Long fileCountLimit;

		public String getInclude() {
			return this.include;
		}

		public void setInclude(String include) {
			this.include = include;
		}

		public Long getChangeTTL() {
			return this.changeTTL;
		}

		public void setChangeTTL(Long changeTTL) {
			this.changeTTL = changeTTL;
		}

		public Long getSizeLimit() {
			return this.sizeLimit;
		}

		public void setSizeLimit(Long sizeLimit) {
			this.sizeLimit = sizeLimit;
		}

		public Long getAccessTTL() {
			return this.accessTTL;
		}

		public void setAccessTTL(Long accessTTL) {
			this.accessTTL = accessTTL;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExclude() {
			return this.exclude;
		}

		public void setExclude(String exclude) {
			this.exclude = exclude;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public Long getFileCountLimit() {
			return this.fileCountLimit;
		}

		public void setFileCountLimit(Long fileCountLimit) {
			this.fileCountLimit = fileCountLimit;
		}
	}

	@Override
	public Class<AddPolarFsQuotaResponse> getResponseClass() {
		return AddPolarFsQuotaResponse.class;
	}

}
