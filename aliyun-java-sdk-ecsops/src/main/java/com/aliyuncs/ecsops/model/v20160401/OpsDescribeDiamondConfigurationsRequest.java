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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeDiamondConfigurationsRequest extends RpcAcsRequest<OpsDescribeDiamondConfigurationsResponse> {
	   

	private String groupId;

	private String dataId;

	private String unitName;
	public OpsDescribeDiamondConfigurationsRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeDiamondConfigurations", "ecsops");
		setMethod(MethodType.GET);
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
		if(dataId != null){
			putQueryParameter("DataId", dataId);
		}
	}

	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
		if(unitName != null){
			putQueryParameter("UnitName", unitName);
		}
	}

	@Override
	public Class<OpsDescribeDiamondConfigurationsResponse> getResponseClass() {
		return OpsDescribeDiamondConfigurationsResponse.class;
	}

}
