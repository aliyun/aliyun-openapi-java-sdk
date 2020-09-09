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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveLabelDataSetRequest extends RpcAcsRequest<SaveLabelDataSetResponse> {
	   

	private String accessId;

	private String dsId;

	private List<DatasetLabelList> datasetLabelLists;

	private String cubeName;

	private String tableName;

	private String cubeId;
	public SaveLabelDataSetRequest() {
		super("retailadvqa-public", "2020-05-15", "SaveLabelDataSet");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public String getDsId() {
		return this.dsId;
	}

	public void setDsId(String dsId) {
		this.dsId = dsId;
		if(dsId != null){
			putQueryParameter("DsId", dsId);
		}
	}

	public List<DatasetLabelList> getDatasetLabelLists() {
		return this.datasetLabelLists;
	}

	public void setDatasetLabelLists(List<DatasetLabelList> datasetLabelLists) {
		this.datasetLabelLists = datasetLabelLists;	
		if (datasetLabelLists != null) {
			for (int depth1 = 0; depth1 < datasetLabelLists.size(); depth1++) {
				putQueryParameter("DatasetLabelList." + (depth1 + 1) + ".ColumnComment" , datasetLabelLists.get(depth1).getColumnComment());
				putQueryParameter("DatasetLabelList." + (depth1 + 1) + ".MappingType" , datasetLabelLists.get(depth1).getMappingType());
				putQueryParameter("DatasetLabelList." + (depth1 + 1) + ".UniqueIdentification" , datasetLabelLists.get(depth1).getUniqueIdentification());
				putQueryParameter("DatasetLabelList." + (depth1 + 1) + ".Remark" , datasetLabelLists.get(depth1).getRemark());
				putQueryParameter("DatasetLabelList." + (depth1 + 1) + ".ColumnName" , datasetLabelLists.get(depth1).getColumnName());
				putQueryParameter("DatasetLabelList." + (depth1 + 1) + ".ColumnType" , datasetLabelLists.get(depth1).getColumnType());
			}
		}	
	}

	public String getCubeName() {
		return this.cubeName;
	}

	public void setCubeName(String cubeName) {
		this.cubeName = cubeName;
		if(cubeName != null){
			putQueryParameter("CubeName", cubeName);
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putQueryParameter("TableName", tableName);
		}
	}

	public String getCubeId() {
		return this.cubeId;
	}

	public void setCubeId(String cubeId) {
		this.cubeId = cubeId;
		if(cubeId != null){
			putQueryParameter("CubeId", cubeId);
		}
	}

	public static class DatasetLabelList {

		private String columnComment;

		private String mappingType;

		private String uniqueIdentification;

		private String remark;

		private String columnName;

		private String columnType;

		public String getColumnComment() {
			return this.columnComment;
		}

		public void setColumnComment(String columnComment) {
			this.columnComment = columnComment;
		}

		public String getMappingType() {
			return this.mappingType;
		}

		public void setMappingType(String mappingType) {
			this.mappingType = mappingType;
		}

		public String getUniqueIdentification() {
			return this.uniqueIdentification;
		}

		public void setUniqueIdentification(String uniqueIdentification) {
			this.uniqueIdentification = uniqueIdentification;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}

		public String getColumnType() {
			return this.columnType;
		}

		public void setColumnType(String columnType) {
			this.columnType = columnType;
		}
	}

	@Override
	public Class<SaveLabelDataSetResponse> getResponseClass() {
		return SaveLabelDataSetResponse.class;
	}

}
