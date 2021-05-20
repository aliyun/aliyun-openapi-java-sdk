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

package com.aliyuncs.scsp.model.v20200702;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scsp.transform.v20200702.GetTagListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTagListResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private List<DataItem> data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String scenarioCode;

		private String tagGroupCode;

		private String tagGroupName;

		private List<TagValuesItem> tagValues;

		public String getScenarioCode() {
			return this.scenarioCode;
		}

		public void setScenarioCode(String scenarioCode) {
			this.scenarioCode = scenarioCode;
		}

		public String getTagGroupCode() {
			return this.tagGroupCode;
		}

		public void setTagGroupCode(String tagGroupCode) {
			this.tagGroupCode = tagGroupCode;
		}

		public String getTagGroupName() {
			return this.tagGroupName;
		}

		public void setTagGroupName(String tagGroupName) {
			this.tagGroupName = tagGroupName;
		}

		public List<TagValuesItem> getTagValues() {
			return this.tagValues;
		}

		public void setTagValues(List<TagValuesItem> tagValues) {
			this.tagValues = tagValues;
		}

		public static class TagValuesItem {

			private String status;

			private String description;

			private String tagName;

			private String tagGroupCode;

			private String tagCode;

			private String tagGroupName;

			private String entityRelationNumber;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getTagName() {
				return this.tagName;
			}

			public void setTagName(String tagName) {
				this.tagName = tagName;
			}

			public String getTagGroupCode() {
				return this.tagGroupCode;
			}

			public void setTagGroupCode(String tagGroupCode) {
				this.tagGroupCode = tagGroupCode;
			}

			public String getTagCode() {
				return this.tagCode;
			}

			public void setTagCode(String tagCode) {
				this.tagCode = tagCode;
			}

			public String getTagGroupName() {
				return this.tagGroupName;
			}

			public void setTagGroupName(String tagGroupName) {
				this.tagGroupName = tagGroupName;
			}

			public String getEntityRelationNumber() {
				return this.entityRelationNumber;
			}

			public void setEntityRelationNumber(String entityRelationNumber) {
				this.entityRelationNumber = entityRelationNumber;
			}
		}
	}

	@Override
	public GetTagListResponse getInstance(UnmarshallerContext context) {
		return	GetTagListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
