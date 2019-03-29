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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20190214.OnsTopicStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsTopicStatusResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private Long lastTimeStamp;

		private Integer perm;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getLastTimeStamp() {
			return this.lastTimeStamp;
		}

		public void setLastTimeStamp(Long lastTimeStamp) {
			this.lastTimeStamp = lastTimeStamp;
		}

		public Integer getPerm() {
			return this.perm;
		}

		public void setPerm(Integer perm) {
			this.perm = perm;
		}
	}

	@Override
	public OnsTopicStatusResponse getInstance(UnmarshallerContext context) {
		return	OnsTopicStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
