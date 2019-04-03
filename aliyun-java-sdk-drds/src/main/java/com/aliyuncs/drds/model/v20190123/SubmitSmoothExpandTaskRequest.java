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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SubmitSmoothExpandTaskRequest extends RpcAcsRequest<SubmitSmoothExpandTaskResponse> {
	
	public SubmitSmoothExpandTaskRequest() {
		super("Drds", "2019-01-23", "SubmitSmoothExpandTask");
	}

	private List<RdsSuperInstances> rdsSuperInstancess;

	private String dbName;

	private Boolean useCreatingRDS;

	private List<TransferTaskInfos> transferTaskInfoss;

	private String drdsInstanceId;

	public List<RdsSuperInstances> getRdsSuperInstancess() {
		return this.rdsSuperInstancess;
	}

	public void setRdsSuperInstancess(List<RdsSuperInstances> rdsSuperInstancess) {
		this.rdsSuperInstancess = rdsSuperInstancess;	
		if (rdsSuperInstancess != null) {
			for (int depth1 = 0; depth1 < rdsSuperInstancess.size(); depth1++) {
				putQueryParameter("RdsSuperInstances." + (depth1 + 1) + ".Password" , rdsSuperInstancess.get(depth1).getPassword());
				putQueryParameter("RdsSuperInstances." + (depth1 + 1) + ".AccountName" , rdsSuperInstancess.get(depth1).getAccountName());
				putQueryParameter("RdsSuperInstances." + (depth1 + 1) + ".RdsName" , rdsSuperInstancess.get(depth1).getRdsName());
			}
		}	
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public Boolean getUseCreatingRDS() {
		return this.useCreatingRDS;
	}

	public void setUseCreatingRDS(Boolean useCreatingRDS) {
		this.useCreatingRDS = useCreatingRDS;
		if(useCreatingRDS != null){
			putQueryParameter("UseCreatingRDS", useCreatingRDS.toString());
		}
	}

	public List<TransferTaskInfos> getTransferTaskInfoss() {
		return this.transferTaskInfoss;
	}

	public void setTransferTaskInfoss(List<TransferTaskInfos> transferTaskInfoss) {
		this.transferTaskInfoss = transferTaskInfoss;	
		if (transferTaskInfoss != null) {
			for (int depth1 = 0; depth1 < transferTaskInfoss.size(); depth1++) {
				putQueryParameter("TransferTaskInfos." + (depth1 + 1) + ".DbName" , transferTaskInfoss.get(depth1).getDbName());
				putQueryParameter("TransferTaskInfos." + (depth1 + 1) + ".SrcInstanceName" , transferTaskInfoss.get(depth1).getSrcInstanceName());
				putQueryParameter("TransferTaskInfos." + (depth1 + 1) + ".InstanceType" , transferTaskInfoss.get(depth1).getInstanceType());
				putQueryParameter("TransferTaskInfos." + (depth1 + 1) + ".DstInstanceName" , transferTaskInfoss.get(depth1).getDstInstanceName());
			}
		}	
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public static class RdsSuperInstances {

		private String password;

		private String accountName;

		private String rdsName;

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getRdsName() {
			return this.rdsName;
		}

		public void setRdsName(String rdsName) {
			this.rdsName = rdsName;
		}
	}

	public static class TransferTaskInfos {

		private String dbName;

		private String srcInstanceName;

		private String instanceType;

		private String dstInstanceName;

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getSrcInstanceName() {
			return this.srcInstanceName;
		}

		public void setSrcInstanceName(String srcInstanceName) {
			this.srcInstanceName = srcInstanceName;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getDstInstanceName() {
			return this.dstInstanceName;
		}

		public void setDstInstanceName(String dstInstanceName) {
			this.dstInstanceName = dstInstanceName;
		}
	}

	@Override
	public Class<SubmitSmoothExpandTaskResponse> getResponseClass() {
		return SubmitSmoothExpandTaskResponse.class;
	}

}
