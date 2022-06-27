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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateIntegrationRequest extends RpcAcsRequest<UpdateIntegrationResponse> {
	   

	private String shortToken;

	private String fieldRedefineRules;

	private String stat;

	private String liveness;

	private Long integrationId;

	private String description;

	private String apiEndpoint;

	private Boolean autoRecover;

	private Long recoverTime;

	private String duplicateKey;

	private String integrationName;

	private Boolean state;

	private String extendedFieldRedefineRules;

	private String integrationProductType;
	public UpdateIntegrationRequest() {
		super("ARMS", "2019-08-08", "UpdateIntegration", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getShortToken() {
		return this.shortToken;
	}

	public void setShortToken(String shortToken) {
		this.shortToken = shortToken;
		if(shortToken != null){
			putBodyParameter("ShortToken", shortToken);
		}
	}

	public String getFieldRedefineRules() {
		return this.fieldRedefineRules;
	}

	public void setFieldRedefineRules(String fieldRedefineRules) {
		this.fieldRedefineRules = fieldRedefineRules;
		if(fieldRedefineRules != null){
			putBodyParameter("FieldRedefineRules", fieldRedefineRules);
		}
	}

	public String getStat() {
		return this.stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
		if(stat != null){
			putBodyParameter("Stat", stat);
		}
	}

	public String getLiveness() {
		return this.liveness;
	}

	public void setLiveness(String liveness) {
		this.liveness = liveness;
		if(liveness != null){
			putBodyParameter("Liveness", liveness);
		}
	}

	public Long getIntegrationId() {
		return this.integrationId;
	}

	public void setIntegrationId(Long integrationId) {
		this.integrationId = integrationId;
		if(integrationId != null){
			putBodyParameter("IntegrationId", integrationId.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getApiEndpoint() {
		return this.apiEndpoint;
	}

	public void setApiEndpoint(String apiEndpoint) {
		this.apiEndpoint = apiEndpoint;
		if(apiEndpoint != null){
			putBodyParameter("ApiEndpoint", apiEndpoint);
		}
	}

	public Boolean getAutoRecover() {
		return this.autoRecover;
	}

	public void setAutoRecover(Boolean autoRecover) {
		this.autoRecover = autoRecover;
		if(autoRecover != null){
			putBodyParameter("AutoRecover", autoRecover.toString());
		}
	}

	public Long getRecoverTime() {
		return this.recoverTime;
	}

	public void setRecoverTime(Long recoverTime) {
		this.recoverTime = recoverTime;
		if(recoverTime != null){
			putBodyParameter("RecoverTime", recoverTime.toString());
		}
	}

	public String getDuplicateKey() {
		return this.duplicateKey;
	}

	public void setDuplicateKey(String duplicateKey) {
		this.duplicateKey = duplicateKey;
		if(duplicateKey != null){
			putBodyParameter("DuplicateKey", duplicateKey);
		}
	}

	public String getIntegrationName() {
		return this.integrationName;
	}

	public void setIntegrationName(String integrationName) {
		this.integrationName = integrationName;
		if(integrationName != null){
			putBodyParameter("IntegrationName", integrationName);
		}
	}

	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
		if(state != null){
			putBodyParameter("State", state.toString());
		}
	}

	public String getExtendedFieldRedefineRules() {
		return this.extendedFieldRedefineRules;
	}

	public void setExtendedFieldRedefineRules(String extendedFieldRedefineRules) {
		this.extendedFieldRedefineRules = extendedFieldRedefineRules;
		if(extendedFieldRedefineRules != null){
			putBodyParameter("ExtendedFieldRedefineRules", extendedFieldRedefineRules);
		}
	}

	public String getIntegrationProductType() {
		return this.integrationProductType;
	}

	public void setIntegrationProductType(String integrationProductType) {
		this.integrationProductType = integrationProductType;
		if(integrationProductType != null){
			putBodyParameter("IntegrationProductType", integrationProductType);
		}
	}

	@Override
	public Class<UpdateIntegrationResponse> getResponseClass() {
		return UpdateIntegrationResponse.class;
	}

}
