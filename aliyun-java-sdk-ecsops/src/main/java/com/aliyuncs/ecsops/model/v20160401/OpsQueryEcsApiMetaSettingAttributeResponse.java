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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryEcsApiMetaSettingAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryEcsApiMetaSettingAttributeResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<AttributesItem> attributes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AttributesItem> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(List<AttributesItem> attributes) {
		this.attributes = attributes;
	}

	public static class AttributesItem {

		private String attributeKey;

		private String defaultValue;

		private String comment;

		private String type;

		public String getAttributeKey() {
			return this.attributeKey;
		}

		public void setAttributeKey(String attributeKey) {
			this.attributeKey = attributeKey;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public OpsQueryEcsApiMetaSettingAttributeResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryEcsApiMetaSettingAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
