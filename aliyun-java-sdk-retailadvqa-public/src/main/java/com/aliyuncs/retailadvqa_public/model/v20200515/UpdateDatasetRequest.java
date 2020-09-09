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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateDatasetRequest extends RpcAcsRequest<UpdateDatasetResponse> {
	   

	private String accessId;

	private String tenantId;

	private String dataSetName;

	private String dataSetId;

	private String type;

	private String dataSet;
	public UpdateDatasetRequest() {
		super("retailadvqa-public", "2020-05-15", "UpdateDataset");
		setMethod(MethodType.POST);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putBodyParameter("AccessId", accessId);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getDataSetName() {
		return this.dataSetName;
	}

	public void setDataSetName(String dataSetName) {
		this.dataSetName = dataSetName;
		if(dataSetName != null){
			putBodyParameter("DataSetName", dataSetName);
		}
	}

	public String getDataSetId() {
		return this.dataSetId;
	}

	public void setDataSetId(String dataSetId) {
		this.dataSetId = dataSetId;
		if(dataSetId != null){
			putBodyParameter("DataSetId", dataSetId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getDataSet() {
		return this.dataSet;
	}

	public void setDataSet(String dataSet) {
		this.dataSet = dataSet;
		if(dataSet != null){
			putBodyParameter("DataSet", dataSet);
		}
	}

	@Override
	public Class<UpdateDatasetResponse> getResponseClass() {
		return UpdateDatasetResponse.class;
	}

}
