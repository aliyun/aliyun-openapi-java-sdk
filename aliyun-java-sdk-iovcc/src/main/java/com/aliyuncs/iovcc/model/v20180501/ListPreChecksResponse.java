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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.ListPreChecksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPreChecksResponse extends AcsResponse {

	private String requestId;

	private List<Result> preChecks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Result> getPreChecks() {
		return this.preChecks;
	}

	public void setPreChecks(List<Result> preChecks) {
		this.preChecks = preChecks;
	}

	public static class Result {

		private String key;

		private String link;

		private String price;

		private String state;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getLink() {
			return this.link;
		}

		public void setLink(String link) {
			this.link = link;
		}

		public String getPrice() {
			return this.price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}
	}

	@Override
	public ListPreChecksResponse getInstance(UnmarshallerContext context) {
		return	ListPreChecksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
