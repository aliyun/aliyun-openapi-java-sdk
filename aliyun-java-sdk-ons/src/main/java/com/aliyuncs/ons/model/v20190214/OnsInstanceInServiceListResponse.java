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

package com.aliyuncs.ons.model.v20190214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20190214.OnsInstanceInServiceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsInstanceInServiceListResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private List<InstanceVO> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public List<InstanceVO> getData() {
		return this.data;
	}

	public void setData(List<InstanceVO> data) {
		this.data = data;
	}

	public static class InstanceVO {

		private Boolean independentNaming;

		private String instanceName;

		private Long releaseTime;

		private Integer instanceStatus;

		private String instanceId;

		private Integer instanceType;

		private List<Tag> tags;

		public Boolean getIndependentNaming() {
			return this.independentNaming;
		}

		public void setIndependentNaming(Boolean independentNaming) {
			this.independentNaming = independentNaming;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(Long releaseTime) {
			this.releaseTime = releaseTime;
		}

		public Integer getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(Integer instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(Integer instanceType) {
			this.instanceType = instanceType;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public OnsInstanceInServiceListResponse getInstance(UnmarshallerContext context) {
		return	OnsInstanceInServiceListResponseUnmarshaller.unmarshall(this, context);
	}
}
