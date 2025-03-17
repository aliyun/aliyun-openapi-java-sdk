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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DataSetBloodRequest extends RpcAcsRequest<DataSetBloodResponse> {
	   

	private String userId;

	private String dataSetIds;

	private String worksType;
	public DataSetBloodRequest() {
		super("quickbi-public", "2022-01-01", "DataSetBlood", "2.2.0");
		setMethod(MethodType.POST);
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getDataSetIds() {
		return this.dataSetIds;
	}

	public void setDataSetIds(String dataSetIds) {
		this.dataSetIds = dataSetIds;
		if(dataSetIds != null){
			putQueryParameter("DataSetIds", dataSetIds);
		}
	}

	public String getWorksType() {
		return this.worksType;
	}

	public void setWorksType(String worksType) {
		this.worksType = worksType;
		if(worksType != null){
			putQueryParameter("WorksType", worksType);
		}
	}

	@Override
	public Class<DataSetBloodResponse> getResponseClass() {
		return DataSetBloodResponse.class;
	}

}
