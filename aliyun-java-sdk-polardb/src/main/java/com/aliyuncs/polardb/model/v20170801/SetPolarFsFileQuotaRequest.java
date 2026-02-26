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
public class SetPolarFsFileQuotaRequest extends RpcAcsRequest<SetPolarFsFileQuotaResponse> {
	   

	private String dBClusterId;

	private String polarFsInstanceId;

	private List<FilePathQuotas> filePathQuotass;
	public SetPolarFsFileQuotaRequest() {
		super("polardb", "2017-08-01", "SetPolarFsFileQuota", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<FilePathQuotas> getFilePathQuotass() {
		return this.filePathQuotass;
	}

	public void setFilePathQuotass(List<FilePathQuotas> filePathQuotass) {
		this.filePathQuotass = filePathQuotass;	
		if (filePathQuotass != null) {
			for (int depth1 = 0; depth1 < filePathQuotass.size(); depth1++) {
				putQueryParameter("FilePathQuotas." + (depth1 + 1) + ".FilePathId" , filePathQuotass.get(depth1).getFilePathId());
				putQueryParameter("FilePathQuotas." + (depth1 + 1) + ".QuotaIds" , filePathQuotass.get(depth1).getQuotaIds());
				putQueryParameter("FilePathQuotas." + (depth1 + 1) + ".Strategy" , filePathQuotass.get(depth1).getStrategy());
				putQueryParameter("FilePathQuotas." + (depth1 + 1) + ".MaxDepth" , filePathQuotass.get(depth1).getMaxDepth());
			}
		}	
	}

	public static class FilePathQuotas {

		private String filePathId;

		private String quotaIds;

		private String strategy;

		private Integer maxDepth;

		public String getFilePathId() {
			return this.filePathId;
		}

		public void setFilePathId(String filePathId) {
			this.filePathId = filePathId;
		}

		public String getQuotaIds() {
			return this.quotaIds;
		}

		public void setQuotaIds(String quotaIds) {
			this.quotaIds = quotaIds;
		}

		public String getStrategy() {
			return this.strategy;
		}

		public void setStrategy(String strategy) {
			this.strategy = strategy;
		}

		public Integer getMaxDepth() {
			return this.maxDepth;
		}

		public void setMaxDepth(Integer maxDepth) {
			this.maxDepth = maxDepth;
		}
	}

	@Override
	public Class<SetPolarFsFileQuotaResponse> getResponseClass() {
		return SetPolarFsFileQuotaResponse.class;
	}

}
