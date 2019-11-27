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

package com.aliyuncs.alikafka.model.v20190916;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20190916.GetConsumerListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConsumerListResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Integer code;

	private String message;

	private List<ConsumerVO> consumerList;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<ConsumerVO> getConsumerList() {
		return this.consumerList;
	}

	public void setConsumerList(List<ConsumerVO> consumerList) {
		this.consumerList = consumerList;
	}

	public static class ConsumerVO {

		private String regionId;

		private String instanceId;

		private String consumerId;

		private List<TagVO> tags;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getConsumerId() {
			return this.consumerId;
		}

		public void setConsumerId(String consumerId) {
			this.consumerId = consumerId;
		}

		public List<TagVO> getTags() {
			return this.tags;
		}

		public void setTags(List<TagVO> tags) {
			this.tags = tags;
		}

		public static class TagVO {

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
	public GetConsumerListResponse getInstance(UnmarshallerContext context) {
		return	GetConsumerListResponseUnmarshaller.unmarshall(this, context);
	}
}
