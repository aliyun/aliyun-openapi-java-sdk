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

package com.aliyuncs.oam.model.v20170101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddTagMiddleRequest extends RpcAcsRequest<AddTagMiddleResponse> {
	   

	private List<MutexTagMiddle> mutexTagMiddles;

	private String clientToken;
	public AddTagMiddleRequest() {
		super("Oam", "2017-01-01", "AddTagMiddle");
		setMethod(MethodType.POST);
	}

	public List<MutexTagMiddle> getMutexTagMiddles() {
		return this.mutexTagMiddles;
	}

	public void setMutexTagMiddles(List<MutexTagMiddle> mutexTagMiddles) {
		this.mutexTagMiddles = mutexTagMiddles;	
		if (mutexTagMiddles != null) {
			for (int depth1 = 0; depth1 < mutexTagMiddles.size(); depth1++) {
				putQueryParameter("MutexTagMiddle." + (depth1 + 1) + ".TagId" , mutexTagMiddles.get(depth1).getTagId());
				putQueryParameter("MutexTagMiddle." + (depth1 + 1) + ".RoleCellId" , mutexTagMiddles.get(depth1).getRoleCellId());
				putQueryParameter("MutexTagMiddle." + (depth1 + 1) + ".Type" , mutexTagMiddles.get(depth1).getType());
			}
		}	
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public static class MutexTagMiddle {

		private String tagId;

		private String roleCellId;

		private String type;

		public String getTagId() {
			return this.tagId;
		}

		public void setTagId(String tagId) {
			this.tagId = tagId;
		}

		public String getRoleCellId() {
			return this.roleCellId;
		}

		public void setRoleCellId(String roleCellId) {
			this.roleCellId = roleCellId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public Class<AddTagMiddleResponse> getResponseClass() {
		return AddTagMiddleResponse.class;
	}

}
