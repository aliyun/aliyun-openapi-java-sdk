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
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MetastoreUpdateTableRequest extends RpcAcsRequest<MetastoreUpdateTableResponse> {
	
	public MetastoreUpdateTableRequest() {
		super("Emr", "2016-04-08", "MetastoreUpdateTable", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private List<AddColumn> addColumns;

	private List<AddPartition> addPartitions;

	private List<String> deleteColumnNames;

	private String tableId;

	private List<String> deletePartitionNames;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<AddColumn> getAddColumns() {
		return this.addColumns;
	}

	public void setAddColumns(List<AddColumn> addColumns) {
		this.addColumns = addColumns;	
		if (addColumns != null) {
			for (int depth1 = 0; depth1 < addColumns.size(); depth1++) {
				putQueryParameter("AddColumn." + (depth1 + 1) + ".Name" , addColumns.get(depth1).getName());
				putQueryParameter("AddColumn." + (depth1 + 1) + ".Comment" , addColumns.get(depth1).getComment());
				putQueryParameter("AddColumn." + (depth1 + 1) + ".Type" , addColumns.get(depth1).getType());
			}
		}	
	}

	public List<AddPartition> getAddPartitions() {
		return this.addPartitions;
	}

	public void setAddPartitions(List<AddPartition> addPartitions) {
		this.addPartitions = addPartitions;	
		if (addPartitions != null) {
			for (int depth1 = 0; depth1 < addPartitions.size(); depth1++) {
				putQueryParameter("AddPartition." + (depth1 + 1) + ".Name" , addPartitions.get(depth1).getName());
				putQueryParameter("AddPartition." + (depth1 + 1) + ".Comment" , addPartitions.get(depth1).getComment());
				putQueryParameter("AddPartition." + (depth1 + 1) + ".Type" , addPartitions.get(depth1).getType());
			}
		}	
	}

	public List<String> getDeleteColumnNames() {
		return this.deleteColumnNames;
	}

	public void setDeleteColumnNames(List<String> deleteColumnNames) {
		this.deleteColumnNames = deleteColumnNames;	
		if (deleteColumnNames != null) {
			for (int i = 0; i < deleteColumnNames.size(); i++) {
				putQueryParameter("DeleteColumnName." + (i + 1) , deleteColumnNames.get(i));
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

	public List<String> getDeletePartitionNames() {
		return this.deletePartitionNames;
	}

	public void setDeletePartitionNames(List<String> deletePartitionNames) {
		this.deletePartitionNames = deletePartitionNames;	
		if (deletePartitionNames != null) {
			for (int i = 0; i < deletePartitionNames.size(); i++) {
				putQueryParameter("DeletePartitionName." + (i + 1) , deletePartitionNames.get(i));
			}
		}	
	}

	public static class AddColumn {

		private String name;

		private String comment;

		private String type;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class AddPartition {

		private String name;

		private String comment;

		private String type;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public Class<MetastoreUpdateTableResponse> getResponseClass() {
		return MetastoreUpdateTableResponse.class;
	}

}
