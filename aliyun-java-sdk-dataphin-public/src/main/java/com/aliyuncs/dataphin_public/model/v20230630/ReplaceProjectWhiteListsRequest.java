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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ReplaceProjectWhiteListsRequest extends RpcAcsRequest<ReplaceProjectWhiteListsResponse> {
	   

	private Long opTenantId;

	@SerializedName("replaceCommand")
	private ReplaceCommand replaceCommand;

	private Long id;
	public ReplaceProjectWhiteListsRequest() {
		super("dataphin-public", "2023-06-30", "ReplaceProjectWhiteLists");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public ReplaceCommand getReplaceCommand() {
		return this.replaceCommand;
	}

	public void setReplaceCommand(ReplaceCommand replaceCommand) {
		this.replaceCommand = replaceCommand;	
		if (replaceCommand != null) {
			putBodyParameter("ReplaceCommand" , new Gson().toJson(replaceCommand));
		}	
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public static class ReplaceCommand {

		@SerializedName("WhiteLists")
		private List<WhiteListsItem> whiteLists;

		public List<WhiteListsItem> getWhiteLists() {
			return this.whiteLists;
		}

		public void setWhiteLists(List<WhiteListsItem> whiteLists) {
			this.whiteLists = whiteLists;
		}

		public static class WhiteListsItem {

			@SerializedName("Port")
			private String port;

			@SerializedName("Ip")
			private String ip;

			@SerializedName("Description")
			private String description;

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public Class<ReplaceProjectWhiteListsResponse> getResponseClass() {
		return ReplaceProjectWhiteListsResponse.class;
	}

}
