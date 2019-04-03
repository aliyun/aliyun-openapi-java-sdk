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
public class SubmitHotExpandTaskRequest extends RpcAcsRequest<SubmitHotExpandTaskResponse> {
	
	public SubmitHotExpandTaskRequest() {
		super("Drds", "2019-01-23", "SubmitHotExpandTask");
	}

	private List<Mapping> mappings;

	private String taskDesc;

	private String dbName;

	private List<RdsDbMapping> rdsDbMappings;

	private List<SupperAccountMapping> supperAccountMappings;

	private List<ExtendedMapping> extendedMappings;

	private String taskName;

	private String drdsInstanceId;

	public List<Mapping> getMappings() {
		return this.mappings;
	}

	public void setMappings(List<Mapping> mappings) {
		this.mappings = mappings;	
		if (mappings != null) {
			for (int depth1 = 0; depth1 < mappings.size(); depth1++) {
				putQueryParameter("Mapping." + (depth1 + 1) + ".DbShardColumn" , mappings.get(depth1).getDbShardColumn());
				putQueryParameter("Mapping." + (depth1 + 1) + ".TbShardColumn" , mappings.get(depth1).getTbShardColumn());
				putQueryParameter("Mapping." + (depth1 + 1) + ".ShardTbValue" , mappings.get(depth1).getShardTbValue());
				putQueryParameter("Mapping." + (depth1 + 1) + ".HotDbName" , mappings.get(depth1).getHotDbName());
				putQueryParameter("Mapping." + (depth1 + 1) + ".ShardDbValue" , mappings.get(depth1).getShardDbValue());
				putQueryParameter("Mapping." + (depth1 + 1) + ".HotTableName" , mappings.get(depth1).getHotTableName());
				putQueryParameter("Mapping." + (depth1 + 1) + ".LogicTable" , mappings.get(depth1).getLogicTable());
			}
		}	
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
		if(taskDesc != null){
			putQueryParameter("TaskDesc", taskDesc);
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

	public List<RdsDbMapping> getRdsDbMappings() {
		return this.rdsDbMappings;
	}

	public void setRdsDbMappings(List<RdsDbMapping> rdsDbMappings) {
		this.rdsDbMappings = rdsDbMappings;	
		if (rdsDbMappings != null) {
			for (int depth1 = 0; depth1 < rdsDbMappings.size(); depth1++) {
				if (rdsDbMappings.get(depth1).getDbLists() != null) {
					for (int i = 0; i < rdsDbMappings.get(depth1).getDbLists().size(); i++) {
						putQueryParameter("RdsDbMapping." + (depth1 + 1) + ".DbList." + (i + 1) , rdsDbMappings.get(depth1).getDbLists().get(i));
					}
				}
				putQueryParameter("RdsDbMapping." + (depth1 + 1) + ".RdsInstanceName" , rdsDbMappings.get(depth1).getRdsInstanceName());
			}
		}	
	}

	public List<SupperAccountMapping> getSupperAccountMappings() {
		return this.supperAccountMappings;
	}

	public void setSupperAccountMappings(List<SupperAccountMapping> supperAccountMappings) {
		this.supperAccountMappings = supperAccountMappings;	
		if (supperAccountMappings != null) {
			for (int depth1 = 0; depth1 < supperAccountMappings.size(); depth1++) {
				putQueryParameter("SupperAccountMapping." + (depth1 + 1) + ".RdsInstanceName" , supperAccountMappings.get(depth1).getRdsInstanceName());
				putQueryParameter("SupperAccountMapping." + (depth1 + 1) + ".SupperAccount" , supperAccountMappings.get(depth1).getSupperAccount());
				putQueryParameter("SupperAccountMapping." + (depth1 + 1) + ".SupperPassword" , supperAccountMappings.get(depth1).getSupperPassword());
			}
		}	
	}

	public List<ExtendedMapping> getExtendedMappings() {
		return this.extendedMappings;
	}

	public void setExtendedMappings(List<ExtendedMapping> extendedMappings) {
		this.extendedMappings = extendedMappings;	
		if (extendedMappings != null) {
			for (int depth1 = 0; depth1 < extendedMappings.size(); depth1++) {
				putQueryParameter("ExtendedMapping." + (depth1 + 1) + ".SrcRdsInstanceId" , extendedMappings.get(depth1).getSrcRdsInstanceId());
				putQueryParameter("ExtendedMapping." + (depth1 + 1) + ".SrcDb" , extendedMappings.get(depth1).getSrcDb());
			}
		}	
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
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

	public static class Mapping {

		private String dbShardColumn;

		private String tbShardColumn;

		private String shardTbValue;

		private String hotDbName;

		private String shardDbValue;

		private String hotTableName;

		private String logicTable;

		public String getDbShardColumn() {
			return this.dbShardColumn;
		}

		public void setDbShardColumn(String dbShardColumn) {
			this.dbShardColumn = dbShardColumn;
		}

		public String getTbShardColumn() {
			return this.tbShardColumn;
		}

		public void setTbShardColumn(String tbShardColumn) {
			this.tbShardColumn = tbShardColumn;
		}

		public String getShardTbValue() {
			return this.shardTbValue;
		}

		public void setShardTbValue(String shardTbValue) {
			this.shardTbValue = shardTbValue;
		}

		public String getHotDbName() {
			return this.hotDbName;
		}

		public void setHotDbName(String hotDbName) {
			this.hotDbName = hotDbName;
		}

		public String getShardDbValue() {
			return this.shardDbValue;
		}

		public void setShardDbValue(String shardDbValue) {
			this.shardDbValue = shardDbValue;
		}

		public String getHotTableName() {
			return this.hotTableName;
		}

		public void setHotTableName(String hotTableName) {
			this.hotTableName = hotTableName;
		}

		public String getLogicTable() {
			return this.logicTable;
		}

		public void setLogicTable(String logicTable) {
			this.logicTable = logicTable;
		}
	}

	public static class RdsDbMapping {

		private List<String> dbLists;

		private String rdsInstanceName;

		public List<String> getDbLists() {
			return this.dbLists;
		}

		public void setDbLists(List<String> dbLists) {
			this.dbLists = dbLists;
		}

		public String getRdsInstanceName() {
			return this.rdsInstanceName;
		}

		public void setRdsInstanceName(String rdsInstanceName) {
			this.rdsInstanceName = rdsInstanceName;
		}
	}

	public static class SupperAccountMapping {

		private String rdsInstanceName;

		private String supperAccount;

		private String supperPassword;

		public String getRdsInstanceName() {
			return this.rdsInstanceName;
		}

		public void setRdsInstanceName(String rdsInstanceName) {
			this.rdsInstanceName = rdsInstanceName;
		}

		public String getSupperAccount() {
			return this.supperAccount;
		}

		public void setSupperAccount(String supperAccount) {
			this.supperAccount = supperAccount;
		}

		public String getSupperPassword() {
			return this.supperPassword;
		}

		public void setSupperPassword(String supperPassword) {
			this.supperPassword = supperPassword;
		}
	}

	public static class ExtendedMapping {

		private String srcRdsInstanceId;

		private String srcDb;

		public String getSrcRdsInstanceId() {
			return this.srcRdsInstanceId;
		}

		public void setSrcRdsInstanceId(String srcRdsInstanceId) {
			this.srcRdsInstanceId = srcRdsInstanceId;
		}

		public String getSrcDb() {
			return this.srcDb;
		}

		public void setSrcDb(String srcDb) {
			this.srcDb = srcDb;
		}
	}

	@Override
	public Class<SubmitHotExpandTaskResponse> getResponseClass() {
		return SubmitHotExpandTaskResponse.class;
	}

}
