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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetAssetMappingRelationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAssetMappingRelationsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<MappingRelation> mappingRelationList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<MappingRelation> getMappingRelationList() {
		return this.mappingRelationList;
	}

	public void setMappingRelationList(List<MappingRelation> mappingRelationList) {
		this.mappingRelationList = mappingRelationList;
	}

	public static class MappingRelation {

		private String modifyTime;

		private String guid;

		private String name;

		private String assetType;

		private Long standardId;

		private String standardName;

		private String standardCode;

		private Long standardSetId;

		private String standardSetName;

		private String standardSetDirectory;

		private String standardStage;

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getGuid() {
			return this.guid;
		}

		public void setGuid(String guid) {
			this.guid = guid;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAssetType() {
			return this.assetType;
		}

		public void setAssetType(String assetType) {
			this.assetType = assetType;
		}

		public Long getStandardId() {
			return this.standardId;
		}

		public void setStandardId(Long standardId) {
			this.standardId = standardId;
		}

		public String getStandardName() {
			return this.standardName;
		}

		public void setStandardName(String standardName) {
			this.standardName = standardName;
		}

		public String getStandardCode() {
			return this.standardCode;
		}

		public void setStandardCode(String standardCode) {
			this.standardCode = standardCode;
		}

		public Long getStandardSetId() {
			return this.standardSetId;
		}

		public void setStandardSetId(Long standardSetId) {
			this.standardSetId = standardSetId;
		}

		public String getStandardSetName() {
			return this.standardSetName;
		}

		public void setStandardSetName(String standardSetName) {
			this.standardSetName = standardSetName;
		}

		public String getStandardSetDirectory() {
			return this.standardSetDirectory;
		}

		public void setStandardSetDirectory(String standardSetDirectory) {
			this.standardSetDirectory = standardSetDirectory;
		}

		public String getStandardStage() {
			return this.standardStage;
		}

		public void setStandardStage(String standardStage) {
			this.standardStage = standardStage;
		}
	}

	@Override
	public GetAssetMappingRelationsResponse getInstance(UnmarshallerContext context) {
		return	GetAssetMappingRelationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
