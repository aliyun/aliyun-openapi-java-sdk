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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DumpMetaDataSourceForOuterRequest extends RpcAcsRequest<DumpMetaDataSourceForOuterResponse> {
	   

	private Long resourceOwnerId;

	private Boolean dumpAllDatabase;

	private Integer dumpLimit;

	private String clusterId;

	private Boolean dumpAllTable;

	private List<String> partitionValuess;

	private String tableId;

	private String databaseId;

	private Boolean dumpAllPartition;
	public DumpMetaDataSourceForOuterRequest() {
		super("Emr", "2016-04-08", "DumpMetaDataSourceForOuter");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Boolean getDumpAllDatabase() {
		return this.dumpAllDatabase;
	}

	public void setDumpAllDatabase(Boolean dumpAllDatabase) {
		this.dumpAllDatabase = dumpAllDatabase;
		if(dumpAllDatabase != null){
			putQueryParameter("DumpAllDatabase", dumpAllDatabase.toString());
		}
	}

	public Integer getDumpLimit() {
		return this.dumpLimit;
	}

	public void setDumpLimit(Integer dumpLimit) {
		this.dumpLimit = dumpLimit;
		if(dumpLimit != null){
			putQueryParameter("DumpLimit", dumpLimit.toString());
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

	public Boolean getDumpAllTable() {
		return this.dumpAllTable;
	}

	public void setDumpAllTable(Boolean dumpAllTable) {
		this.dumpAllTable = dumpAllTable;
		if(dumpAllTable != null){
			putQueryParameter("DumpAllTable", dumpAllTable.toString());
		}
	}

	public List<String> getPartitionValuess() {
		return this.partitionValuess;
	}

	public void setPartitionValuess(List<String> partitionValuess) {
		this.partitionValuess = partitionValuess;	
		if (partitionValuess != null) {
			for (int i = 0; i < partitionValuess.size(); i++) {
				putQueryParameter("PartitionValues." + (i + 1) , partitionValuess.get(i));
			}
		}	
	}

	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
		if(tableId != null){
			putQueryParameter("TableId", tableId);
		}
	}

	public String getDatabaseId() {
		return this.databaseId;
	}

	public void setDatabaseId(String databaseId) {
		this.databaseId = databaseId;
		if(databaseId != null){
			putQueryParameter("DatabaseId", databaseId);
		}
	}

	public Boolean getDumpAllPartition() {
		return this.dumpAllPartition;
	}

	public void setDumpAllPartition(Boolean dumpAllPartition) {
		this.dumpAllPartition = dumpAllPartition;
		if(dumpAllPartition != null){
			putQueryParameter("DumpAllPartition", dumpAllPartition.toString());
		}
	}

	@Override
	public Class<DumpMetaDataSourceForOuterResponse> getResponseClass() {
		return DumpMetaDataSourceForOuterResponse.class;
	}

}
