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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryEcsResourceDisplayInfoDTOsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryEcsResourceDisplayInfoDTOsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private List<EcsResourceDisplayInfoDTO> ecsResourceDisplayInfoDTOs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<EcsResourceDisplayInfoDTO> getEcsResourceDisplayInfoDTOs() {
		return this.ecsResourceDisplayInfoDTOs;
	}

	public void setEcsResourceDisplayInfoDTOs(List<EcsResourceDisplayInfoDTO> ecsResourceDisplayInfoDTOs) {
		this.ecsResourceDisplayInfoDTOs = ecsResourceDisplayInfoDTOs;
	}

	public static class EcsResourceDisplayInfoDTO {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private String scope;

		private String type;

		private String level;

		private Long parentId;

		private String value;

		private String subIds;

		private List<String> tags;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getSubIds() {
			return this.subIds;
		}

		public void setSubIds(String subIds) {
			this.subIds = subIds;
		}

		public List<String> getTags() {
			return this.tags;
		}

		public void setTags(List<String> tags) {
			this.tags = tags;
		}
	}

	@Override
	public OpsQueryEcsResourceDisplayInfoDTOsResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryEcsResourceDisplayInfoDTOsResponseUnmarshaller.unmarshall(this, context);
	}
}
