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

package com.aliyuncs.ons.model.v20180516;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20180516.OnsEmpowerListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsEmpowerListResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private List<AuthOwnerInfoDo> data;

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

	public List<AuthOwnerInfoDo> getData() {
		return this.data;
	}

	public void setData(List<AuthOwnerInfoDo> data) {
		this.data = data;
	}

	public static class AuthOwnerInfoDo {

		private String topic;

		private Long owner;

		private Integer relation;

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public Long getOwner() {
			return this.owner;
		}

		public void setOwner(Long owner) {
			this.owner = owner;
		}

		public Integer getRelation() {
			return this.relation;
		}

		public void setRelation(Integer relation) {
			this.relation = relation;
		}
	}

	@Override
	public OnsEmpowerListResponse getInstance(UnmarshallerContext context) {
		return	OnsEmpowerListResponseUnmarshaller.unmarshall(this, context);
	}
}
