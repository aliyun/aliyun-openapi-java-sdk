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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateNacUserCertStatusRequest extends RpcAcsRequest<UpdateNacUserCertStatusResponse> {
	   

	private List<IdList> idList;

	private String status;
	public UpdateNacUserCertStatusRequest() {
		super("csas", "2023-01-20", "UpdateNacUserCertStatus");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<IdList> getIdList() {
		return this.idList;
	}

	public void setIdList(List<IdList> idList) {
		this.idList = idList;	
		if (idList != null) {
			for (int depth1 = 0; depth1 < idList.size(); depth1++) {
				if (idList.get(depth1) != null) {
					
						putBodyParameter("IdList." + (depth1 + 1) + ".UserId" , idList.get(depth1).getUserId());
						putBodyParameter("IdList." + (depth1 + 1) + ".DevTag" , idList.get(depth1).getDevTag());
				}
			}
		}	
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	public static class IdList {

		private String userId;

		private String devTag;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getDevTag() {
			return this.devTag;
		}

		public void setDevTag(String devTag) {
			this.devTag = devTag;
		}
	}

	@Override
	public Class<UpdateNacUserCertStatusResponse> getResponseClass() {
		return UpdateNacUserCertStatusResponse.class;
	}

}
