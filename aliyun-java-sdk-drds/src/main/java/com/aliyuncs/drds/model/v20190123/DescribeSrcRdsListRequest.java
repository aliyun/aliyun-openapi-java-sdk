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
public class DescribeSrcRdsListRequest extends RpcAcsRequest<DescribeSrcRdsListResponse> {
	
	public DescribeSrcRdsListRequest() {
		super("Drds", "2019-01-23", "DescribeSrcRdsList");
	}

	private String dbName;

	private List<PartitionMapping> partitionMappings;

	private String drdsInstanceId;

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public List<PartitionMapping> getPartitionMappings() {
		return this.partitionMappings;
	}

	public void setPartitionMappings(List<PartitionMapping> partitionMappings) {
		this.partitionMappings = partitionMappings;	
		if (partitionMappings != null) {
			for (int depth1 = 0; depth1 < partitionMappings.size(); depth1++) {
				putQueryParameter("PartitionMapping." + (depth1 + 1) + ".DbShardValue" , partitionMappings.get(depth1).getDbShardValue());
				putQueryParameter("PartitionMapping." + (depth1 + 1) + ".HotDbName" , partitionMappings.get(depth1).getHotDbName());
				putQueryParameter("PartitionMapping." + (depth1 + 1) + ".HotTableName" , partitionMappings.get(depth1).getHotTableName());
				putQueryParameter("PartitionMapping." + (depth1 + 1) + ".TbShardValue" , partitionMappings.get(depth1).getTbShardValue());
				putQueryParameter("PartitionMapping." + (depth1 + 1) + ".LogicTable" , partitionMappings.get(depth1).getLogicTable());
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

	public static class PartitionMapping {

		private String dbShardValue;

		private String hotDbName;

		private String hotTableName;

		private String tbShardValue;

		private String logicTable;

		public String getDbShardValue() {
			return this.dbShardValue;
		}

		public void setDbShardValue(String dbShardValue) {
			this.dbShardValue = dbShardValue;
		}

		public String getHotDbName() {
			return this.hotDbName;
		}

		public void setHotDbName(String hotDbName) {
			this.hotDbName = hotDbName;
		}

		public String getHotTableName() {
			return this.hotTableName;
		}

		public void setHotTableName(String hotTableName) {
			this.hotTableName = hotTableName;
		}

		public String getTbShardValue() {
			return this.tbShardValue;
		}

		public void setTbShardValue(String tbShardValue) {
			this.tbShardValue = tbShardValue;
		}

		public String getLogicTable() {
			return this.logicTable;
		}

		public void setLogicTable(String logicTable) {
			this.logicTable = logicTable;
		}
	}

	@Override
	public Class<DescribeSrcRdsListResponse> getResponseClass() {
		return DescribeSrcRdsListResponse.class;
	}

}
