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

/**
 * @author auto create
 * @version 
 */
public class MigrateJstDrdsDbAcrossRegionRequest extends RpcAcsRequest<MigrateJstDrdsDbAcrossRegionResponse> {
	
	public MigrateJstDrdsDbAcrossRegionRequest() {
		super("Drds", "2019-01-23", "MigrateJstDrdsDbAcrossRegion");
	}

	private String dbName;

	private String srcDrdsInstanceId;

	private String dstDrdsInstanceId;

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getSrcDrdsInstanceId() {
		return this.srcDrdsInstanceId;
	}

	public void setSrcDrdsInstanceId(String srcDrdsInstanceId) {
		this.srcDrdsInstanceId = srcDrdsInstanceId;
		if(srcDrdsInstanceId != null){
			putQueryParameter("SrcDrdsInstanceId", srcDrdsInstanceId);
		}
	}

	public String getDstDrdsInstanceId() {
		return this.dstDrdsInstanceId;
	}

	public void setDstDrdsInstanceId(String dstDrdsInstanceId) {
		this.dstDrdsInstanceId = dstDrdsInstanceId;
		if(dstDrdsInstanceId != null){
			putQueryParameter("DstDrdsInstanceId", dstDrdsInstanceId);
		}
	}

	@Override
	public Class<MigrateJstDrdsDbAcrossRegionResponse> getResponseClass() {
		return MigrateJstDrdsDbAcrossRegionResponse.class;
	}

}
