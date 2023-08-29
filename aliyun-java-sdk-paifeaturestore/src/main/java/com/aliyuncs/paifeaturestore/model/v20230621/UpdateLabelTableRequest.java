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

package com.aliyuncs.paifeaturestore.model.v20230621;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateLabelTableRequest extends RoaAcsRequest<UpdateLabelTableResponse> {
	   

	private String body;

	private String instanceId;

	private String labelTableId;
	public UpdateLabelTableRequest() {
		super("PaiFeatureStore", "2023-06-21", "UpdateLabelTable");
		setUriPattern("/api/v1/instances/[InstanceId]/labeltables/[LabelTableId]");
		setMethod(MethodType.PUT);
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("InstanceId", instanceId);
		}
	}

	public String getLabelTableId() {
		return this.labelTableId;
	}

	public void setLabelTableId(String labelTableId) {
		this.labelTableId = labelTableId;
		if(labelTableId != null){
			putPathParameter("LabelTableId", labelTableId);
		}
	}

	@Override
	public Class<UpdateLabelTableResponse> getResponseClass() {
		return UpdateLabelTableResponse.class;
	}

}
