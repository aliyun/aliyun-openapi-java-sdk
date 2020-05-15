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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PreCheckModifyTableShardingKeyParamRequest extends RpcAcsRequest<PreCheckModifyTableShardingKeyParamResponse> {
	   

	private String tbPartitions;

	private Boolean isShard;

	private String tbShardingFunction;

	private String dbShardingColumnList;

	private String tbComputeLength;

	private String tbRightShiftOffset;

	private String dbComputeLength;

	private String srcTableName;

	private Integer dbRightShiftOffset;

	private String targetTableName;

	private String drdsInstanceId;

	private String dbShardingFunction;

	private String dbName;

	private String tbShardingColumnList;
	public PreCheckModifyTableShardingKeyParamRequest() {
		super("Drds", "2019-01-23", "PreCheckModifyTableShardingKeyParam", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTbPartitions() {
		return this.tbPartitions;
	}

	public void setTbPartitions(String tbPartitions) {
		this.tbPartitions = tbPartitions;
		if(tbPartitions != null){
			putQueryParameter("TbPartitions", tbPartitions);
		}
	}

	public Boolean getIsShard() {
		return this.isShard;
	}

	public void setIsShard(Boolean isShard) {
		this.isShard = isShard;
		if(isShard != null){
			putQueryParameter("IsShard", isShard.toString());
		}
	}

	public String getTbShardingFunction() {
		return this.tbShardingFunction;
	}

	public void setTbShardingFunction(String tbShardingFunction) {
		this.tbShardingFunction = tbShardingFunction;
		if(tbShardingFunction != null){
			putQueryParameter("TbShardingFunction", tbShardingFunction);
		}
	}

	public String getDbShardingColumnList() {
		return this.dbShardingColumnList;
	}

	public void setDbShardingColumnList(String dbShardingColumnList) {
		this.dbShardingColumnList = dbShardingColumnList;
		if(dbShardingColumnList != null){
			putQueryParameter("DbShardingColumnList", dbShardingColumnList);
		}
	}

	public String getTbComputeLength() {
		return this.tbComputeLength;
	}

	public void setTbComputeLength(String tbComputeLength) {
		this.tbComputeLength = tbComputeLength;
		if(tbComputeLength != null){
			putQueryParameter("TbComputeLength", tbComputeLength);
		}
	}

	public String getTbRightShiftOffset() {
		return this.tbRightShiftOffset;
	}

	public void setTbRightShiftOffset(String tbRightShiftOffset) {
		this.tbRightShiftOffset = tbRightShiftOffset;
		if(tbRightShiftOffset != null){
			putQueryParameter("TbRightShiftOffset", tbRightShiftOffset);
		}
	}

	public String getDbComputeLength() {
		return this.dbComputeLength;
	}

	public void setDbComputeLength(String dbComputeLength) {
		this.dbComputeLength = dbComputeLength;
		if(dbComputeLength != null){
			putQueryParameter("DbComputeLength", dbComputeLength);
		}
	}

	public String getSrcTableName() {
		return this.srcTableName;
	}

	public void setSrcTableName(String srcTableName) {
		this.srcTableName = srcTableName;
		if(srcTableName != null){
			putQueryParameter("SrcTableName", srcTableName);
		}
	}

	public Integer getDbRightShiftOffset() {
		return this.dbRightShiftOffset;
	}

	public void setDbRightShiftOffset(Integer dbRightShiftOffset) {
		this.dbRightShiftOffset = dbRightShiftOffset;
		if(dbRightShiftOffset != null){
			putQueryParameter("DbRightShiftOffset", dbRightShiftOffset.toString());
		}
	}

	public String getTargetTableName() {
		return this.targetTableName;
	}

	public void setTargetTableName(String targetTableName) {
		this.targetTableName = targetTableName;
		if(targetTableName != null){
			putQueryParameter("TargetTableName", targetTableName);
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

	public String getDbShardingFunction() {
		return this.dbShardingFunction;
	}

	public void setDbShardingFunction(String dbShardingFunction) {
		this.dbShardingFunction = dbShardingFunction;
		if(dbShardingFunction != null){
			putQueryParameter("DbShardingFunction", dbShardingFunction);
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

	public String getTbShardingColumnList() {
		return this.tbShardingColumnList;
	}

	public void setTbShardingColumnList(String tbShardingColumnList) {
		this.tbShardingColumnList = tbShardingColumnList;
		if(tbShardingColumnList != null){
			putQueryParameter("TbShardingColumnList", tbShardingColumnList);
		}
	}

	@Override
	public Class<PreCheckModifyTableShardingKeyParamResponse> getResponseClass() {
		return PreCheckModifyTableShardingKeyParamResponse.class;
	}

}
