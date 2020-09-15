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

package com.aliyuncs.cloudauth_console.model.v20190219;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth_console.transform.v20190219.DescribeMnsOauthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMnsOauthResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean mnsServe;

		private Boolean openMnsService;

		private Boolean mnsAuthorized;

		private String topicName;

		private String endPoint;

		private List<String> topicList;

		public Boolean getMnsServe() {
			return this.mnsServe;
		}

		public void setMnsServe(Boolean mnsServe) {
			this.mnsServe = mnsServe;
		}

		public Boolean getOpenMnsService() {
			return this.openMnsService;
		}

		public void setOpenMnsService(Boolean openMnsService) {
			this.openMnsService = openMnsService;
		}

		public Boolean getMnsAuthorized() {
			return this.mnsAuthorized;
		}

		public void setMnsAuthorized(Boolean mnsAuthorized) {
			this.mnsAuthorized = mnsAuthorized;
		}

		public String getTopicName() {
			return this.topicName;
		}

		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}

		public String getEndPoint() {
			return this.endPoint;
		}

		public void setEndPoint(String endPoint) {
			this.endPoint = endPoint;
		}

		public List<String> getTopicList() {
			return this.topicList;
		}

		public void setTopicList(List<String> topicList) {
			this.topicList = topicList;
		}
	}

	@Override
	public DescribeMnsOauthResponse getInstance(UnmarshallerContext context) {
		return	DescribeMnsOauthResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
