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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitInfoRequest extends RpcAcsRequest<SubmitInfoResponse> {
	   

	private String requestId;

	private Long mainUserId;

	private List<EcsDescList> ecsDescLists;

	private Long callerUid;
	public SubmitInfoRequest() {
		super("retailcloud", "2018-03-13", "SubmitInfo", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public Long getMainUserId() {
		return this.mainUserId;
	}

	public void setMainUserId(Long mainUserId) {
		this.mainUserId = mainUserId;
		if(mainUserId != null){
			putQueryParameter("MainUserId", mainUserId.toString());
		}
	}

	public List<EcsDescList> getEcsDescLists() {
		return this.ecsDescLists;
	}

	public void setEcsDescLists(List<EcsDescList> ecsDescLists) {
		this.ecsDescLists = ecsDescLists;	
		if (ecsDescLists != null) {
			for (int depth1 = 0; depth1 < ecsDescLists.size(); depth1++) {
				putBodyParameter("EcsDescList." + (depth1 + 1) + ".ResourceId" , ecsDescLists.get(depth1).getResourceId());
				putBodyParameter("EcsDescList." + (depth1 + 1) + ".BussinessDesc" , ecsDescLists.get(depth1).getBussinessDesc());
				putBodyParameter("EcsDescList." + (depth1 + 1) + ".MiddleWareDesc" , ecsDescLists.get(depth1).getMiddleWareDesc());
				putBodyParameter("EcsDescList." + (depth1 + 1) + ".OtherMiddleWareDesc" , ecsDescLists.get(depth1).getOtherMiddleWareDesc());
				putBodyParameter("EcsDescList." + (depth1 + 1) + ".BussinessType" , ecsDescLists.get(depth1).getBussinessType());
				putBodyParameter("EcsDescList." + (depth1 + 1) + ".AppType" , ecsDescLists.get(depth1).getAppType());
				putBodyParameter("EcsDescList." + (depth1 + 1) + ".EnvType" , ecsDescLists.get(depth1).getEnvType());
				putBodyParameter("EcsDescList." + (depth1 + 1) + ".UserId" , ecsDescLists.get(depth1).getUserId());
			}
		}	
	}

	public Long getCallerUid() {
		return this.callerUid;
	}

	public void setCallerUid(Long callerUid) {
		this.callerUid = callerUid;
		if(callerUid != null){
			putQueryParameter("CallerUid", callerUid.toString());
		}
	}

	public static class EcsDescList {

		private String resourceId;

		private String bussinessDesc;

		private String middleWareDesc;

		private String otherMiddleWareDesc;

		private String bussinessType;

		private String appType;

		private String envType;

		private String userId;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getBussinessDesc() {
			return this.bussinessDesc;
		}

		public void setBussinessDesc(String bussinessDesc) {
			this.bussinessDesc = bussinessDesc;
		}

		public String getMiddleWareDesc() {
			return this.middleWareDesc;
		}

		public void setMiddleWareDesc(String middleWareDesc) {
			this.middleWareDesc = middleWareDesc;
		}

		public String getOtherMiddleWareDesc() {
			return this.otherMiddleWareDesc;
		}

		public void setOtherMiddleWareDesc(String otherMiddleWareDesc) {
			this.otherMiddleWareDesc = otherMiddleWareDesc;
		}

		public String getBussinessType() {
			return this.bussinessType;
		}

		public void setBussinessType(String bussinessType) {
			this.bussinessType = bussinessType;
		}

		public String getAppType() {
			return this.appType;
		}

		public void setAppType(String appType) {
			this.appType = appType;
		}

		public String getEnvType() {
			return this.envType;
		}

		public void setEnvType(String envType) {
			this.envType = envType;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
	}

	@Override
	public Class<SubmitInfoResponse> getResponseClass() {
		return SubmitInfoResponse.class;
	}

}
