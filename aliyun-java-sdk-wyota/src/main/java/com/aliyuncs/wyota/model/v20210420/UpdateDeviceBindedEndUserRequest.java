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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateDeviceBindedEndUserRequest extends RpcAcsRequest<UpdateDeviceBindedEndUserResponse> {
	   

	private List<SourceAdEndUsers> sourceAdEndUserss;

	private String targetEndUserIds;

	private String userType;

	private List<TargetAdEndUsers> targetAdEndUserss;

	private String serialNo;

	private String sourceEndUserIds;
	public UpdateDeviceBindedEndUserRequest() {
		super("wyota", "2021-04-20", "UpdateDeviceBindedEndUser");
		setMethod(MethodType.POST);
	}

	public List<SourceAdEndUsers> getSourceAdEndUserss() {
		return this.sourceAdEndUserss;
	}

	public void setSourceAdEndUserss(List<SourceAdEndUsers> sourceAdEndUserss) {
		this.sourceAdEndUserss = sourceAdEndUserss;	
		if (sourceAdEndUserss != null) {
			for (int depth1 = 0; depth1 < sourceAdEndUserss.size(); depth1++) {
				putBodyParameter("SourceAdEndUsers." + (depth1 + 1) + ".AdDomain" , sourceAdEndUserss.get(depth1).getAdDomain());
				putBodyParameter("SourceAdEndUsers." + (depth1 + 1) + ".EndUserId" , sourceAdEndUserss.get(depth1).getEndUserId());
				putBodyParameter("SourceAdEndUsers." + (depth1 + 1) + ".DirectoryId" , sourceAdEndUserss.get(depth1).getDirectoryId());
			}
		}	
	}

	public String getTargetEndUserIds() {
		return this.targetEndUserIds;
	}

	public void setTargetEndUserIds(String targetEndUserIds) {
		this.targetEndUserIds = targetEndUserIds;
		if(targetEndUserIds != null){
			putBodyParameter("TargetEndUserIds", targetEndUserIds);
		}
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putBodyParameter("UserType", userType);
		}
	}

	public List<TargetAdEndUsers> getTargetAdEndUserss() {
		return this.targetAdEndUserss;
	}

	public void setTargetAdEndUserss(List<TargetAdEndUsers> targetAdEndUserss) {
		this.targetAdEndUserss = targetAdEndUserss;	
		if (targetAdEndUserss != null) {
			for (int depth1 = 0; depth1 < targetAdEndUserss.size(); depth1++) {
				putBodyParameter("TargetAdEndUsers." + (depth1 + 1) + ".AdDomain" , targetAdEndUserss.get(depth1).getAdDomain());
				putBodyParameter("TargetAdEndUsers." + (depth1 + 1) + ".EndUserId" , targetAdEndUserss.get(depth1).getEndUserId());
				putBodyParameter("TargetAdEndUsers." + (depth1 + 1) + ".DirectoryId" , targetAdEndUserss.get(depth1).getDirectoryId());
			}
		}	
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
		if(serialNo != null){
			putBodyParameter("SerialNo", serialNo);
		}
	}

	public String getSourceEndUserIds() {
		return this.sourceEndUserIds;
	}

	public void setSourceEndUserIds(String sourceEndUserIds) {
		this.sourceEndUserIds = sourceEndUserIds;
		if(sourceEndUserIds != null){
			putBodyParameter("SourceEndUserIds", sourceEndUserIds);
		}
	}

	public static class SourceAdEndUsers {

		private String adDomain;

		private String endUserId;

		private String directoryId;

		public String getAdDomain() {
			return this.adDomain;
		}

		public void setAdDomain(String adDomain) {
			this.adDomain = adDomain;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(String directoryId) {
			this.directoryId = directoryId;
		}
	}

	public static class TargetAdEndUsers {

		private String adDomain;

		private String endUserId;

		private String directoryId;

		public String getAdDomain() {
			return this.adDomain;
		}

		public void setAdDomain(String adDomain) {
			this.adDomain = adDomain;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(String directoryId) {
			this.directoryId = directoryId;
		}
	}

	@Override
	public Class<UpdateDeviceBindedEndUserResponse> getResponseClass() {
		return UpdateDeviceBindedEndUserResponse.class;
	}

}
