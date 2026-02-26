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
public class CreateStandardLookupTableRequest extends RpcAcsRequest<CreateStandardLookupTableResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateStandardLookupTableRequest() {
		super("dataphin-public", "2023-06-30", "CreateStandardLookupTable");
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

	public CreateCommand getCreateCommand() {
		return this.createCommand;
	}

	public void setCreateCommand(CreateCommand createCommand) {
		this.createCommand = createCommand;	
		if (createCommand != null) {
			putBodyParameter("CreateCommand" , new Gson().toJson(createCommand));
		}	
	}

	public static class CreateCommand {

		@SerializedName("Owner")
		private String owner;

		@SerializedName("Code")
		private String code;

		@SerializedName("Name")
		private String name;

		@SerializedName("Description")
		private String description;

		@SerializedName("LookupTableValueList")
		private List<LookupTableValueListItem> lookupTableValueList;

		@SerializedName("DirectoryReference")
		private DirectoryReference directoryReference;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<LookupTableValueListItem> getLookupTableValueList() {
			return this.lookupTableValueList;
		}

		public void setLookupTableValueList(List<LookupTableValueListItem> lookupTableValueList) {
			this.lookupTableValueList = lookupTableValueList;
		}

		public DirectoryReference getDirectoryReference() {
			return this.directoryReference;
		}

		public void setDirectoryReference(DirectoryReference directoryReference) {
			this.directoryReference = directoryReference;
		}

		public static class LookupTableValueListItem {

			@SerializedName("EnglishName")
			private String englishName;

			@SerializedName("Name")
			private String name;

			@SerializedName("Description")
			private String description;

			@SerializedName("Value")
			private String value;

			public String getEnglishName() {
				return this.englishName;
			}

			public void setEnglishName(String englishName) {
				this.englishName = englishName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class DirectoryReference {

			@SerializedName("Directory")
			private String directory;

			public String getDirectory() {
				return this.directory;
			}

			public void setDirectory(String directory) {
				this.directory = directory;
			}
		}
	}

	@Override
	public Class<CreateStandardLookupTableResponse> getResponseClass() {
		return CreateStandardLookupTableResponse.class;
	}

}
