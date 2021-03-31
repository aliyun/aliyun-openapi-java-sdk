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

package com.aliyuncs.openanalytics_open.model.v20200928;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.openanalytics_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AlterTableRequest extends RpcAcsRequest<AlterTableResponse> {
	   

	private String newTableName;

	private Array col;

	private String oldTableName;

	private String oldDbName;

	private String newDbName;

	private String parameters;
	public AlterTableRequest() {
		super("openanalytics-open", "2020-09-28", "AlterTable", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNewTableName() {
		return this.newTableName;
	}

	public void setNewTableName(String newTableName) {
		this.newTableName = newTableName;
		if(newTableName != null){
			putQueryParameter("NewTableName", newTableName);
		}
	}

	public Array getCol() {
		return this.col;
	}

	public void setCol(Array col) {
		this.col = col;
		if(col != null){
			putQueryParameter("Col", col.toString());
		}
	}

	public String getOldTableName() {
		return this.oldTableName;
	}

	public void setOldTableName(String oldTableName) {
		this.oldTableName = oldTableName;
		if(oldTableName != null){
			putQueryParameter("OldTableName", oldTableName);
		}
	}

	public String getOldDbName() {
		return this.oldDbName;
	}

	public void setOldDbName(String oldDbName) {
		this.oldDbName = oldDbName;
		if(oldDbName != null){
			putQueryParameter("OldDbName", oldDbName);
		}
	}

	public String getNewDbName() {
		return this.newDbName;
	}

	public void setNewDbName(String newDbName) {
		this.newDbName = newDbName;
		if(newDbName != null){
			putQueryParameter("NewDbName", newDbName);
		}
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putQueryParameter("Parameters", parameters);
		}
	}

	@Override
	public Class<AlterTableResponse> getResponseClass() {
		return AlterTableResponse.class;
	}

}
