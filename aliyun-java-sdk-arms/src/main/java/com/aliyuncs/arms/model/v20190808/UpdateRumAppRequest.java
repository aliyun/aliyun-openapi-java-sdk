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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRumAppRequest extends RpcAcsRequest<UpdateRumAppResponse> {
	   

	private Boolean restart;

	private Boolean autoRestart;

	private String description;

	private String pid;

	private String realRegionId;

	private Boolean stop;

	private String backendServiceTraceRegion;

	private String nickname;

	private String serviceDomainOperationJson;

	private Boolean isSubscribe;

	private String bonreeSDKConfigJson;
	public UpdateRumAppRequest() {
		super("ARMS", "2019-08-08", "UpdateRumApp", "arms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getRestart() {
		return this.restart;
	}

	public void setRestart(Boolean restart) {
		this.restart = restart;
		if(restart != null){
			putQueryParameter("Restart", restart.toString());
		}
	}

	public Boolean getAutoRestart() {
		return this.autoRestart;
	}

	public void setAutoRestart(Boolean autoRestart) {
		this.autoRestart = autoRestart;
		if(autoRestart != null){
			putQueryParameter("AutoRestart", autoRestart.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
		if(pid != null){
			putQueryParameter("Pid", pid);
		}
	}

	public String getRealRegionId() {
		return this.realRegionId;
	}

	public void setRealRegionId(String realRegionId) {
		this.realRegionId = realRegionId;
		if(realRegionId != null){
			putQueryParameter("RealRegionId", realRegionId);
		}
	}

	public Boolean getStop() {
		return this.stop;
	}

	public void setStop(Boolean stop) {
		this.stop = stop;
		if(stop != null){
			putQueryParameter("Stop", stop.toString());
		}
	}

	public String getBackendServiceTraceRegion() {
		return this.backendServiceTraceRegion;
	}

	public void setBackendServiceTraceRegion(String backendServiceTraceRegion) {
		this.backendServiceTraceRegion = backendServiceTraceRegion;
		if(backendServiceTraceRegion != null){
			putQueryParameter("BackendServiceTraceRegion", backendServiceTraceRegion);
		}
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
		if(nickname != null){
			putQueryParameter("Nickname", nickname);
		}
	}

	public String getServiceDomainOperationJson() {
		return this.serviceDomainOperationJson;
	}

	public void setServiceDomainOperationJson(String serviceDomainOperationJson) {
		this.serviceDomainOperationJson = serviceDomainOperationJson;
		if(serviceDomainOperationJson != null){
			putQueryParameter("ServiceDomainOperationJson", serviceDomainOperationJson);
		}
	}

	public Boolean getIsSubscribe() {
		return this.isSubscribe;
	}

	public void setIsSubscribe(Boolean isSubscribe) {
		this.isSubscribe = isSubscribe;
		if(isSubscribe != null){
			putQueryParameter("IsSubscribe", isSubscribe.toString());
		}
	}

	public String getBonreeSDKConfigJson() {
		return this.bonreeSDKConfigJson;
	}

	public void setBonreeSDKConfigJson(String bonreeSDKConfigJson) {
		this.bonreeSDKConfigJson = bonreeSDKConfigJson;
		if(bonreeSDKConfigJson != null){
			putQueryParameter("BonreeSDKConfigJson", bonreeSDKConfigJson);
		}
	}

	@Override
	public Class<UpdateRumAppResponse> getResponseClass() {
		return UpdateRumAppResponse.class;
	}

}
