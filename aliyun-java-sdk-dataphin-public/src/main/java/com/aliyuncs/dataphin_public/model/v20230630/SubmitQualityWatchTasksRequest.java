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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SubmitQualityWatchTasksRequest extends RpcAcsRequest<SubmitQualityWatchTasksResponse> {
	   

	private Long opTenantId;

	@SerializedName("submitCommand")
	private SubmitCommand submitCommand;
	public SubmitQualityWatchTasksRequest() {
		super("dataphin-public", "2023-06-30", "SubmitQualityWatchTasks");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public SubmitCommand getSubmitCommand() {
		return this.submitCommand;
	}

	public void setSubmitCommand(SubmitCommand submitCommand) {
		this.submitCommand = submitCommand;	
		if (submitCommand != null) {
			putBodyParameter("SubmitCommand" , new Gson().toJson(submitCommand));
		}	
	}

	public static class SubmitCommand {

		@SerializedName("PartitionExpression")
		private String partitionExpression;

		@SerializedName("BizDate")
		private String bizDate;

		@SerializedName("WatchIdList")
		private List<Long> watchIdList;

		public String getPartitionExpression() {
			return this.partitionExpression;
		}

		public void setPartitionExpression(String partitionExpression) {
			this.partitionExpression = partitionExpression;
		}

		public String getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(String bizDate) {
			this.bizDate = bizDate;
		}

		public List<Long> getWatchIdList() {
			return this.watchIdList;
		}

		public void setWatchIdList(List<Long> watchIdList) {
			this.watchIdList = watchIdList;
		}
	}

	@Override
	public Class<SubmitQualityWatchTasksResponse> getResponseClass() {
		return SubmitQualityWatchTasksResponse.class;
	}

}
