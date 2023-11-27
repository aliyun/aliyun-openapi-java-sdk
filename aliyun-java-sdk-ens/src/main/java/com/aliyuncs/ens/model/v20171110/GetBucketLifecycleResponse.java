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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.GetBucketLifecycleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBucketLifecycleResponse extends AcsResponse {

	private String requestId;

	private List<RuleItem> rule;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RuleItem> getRule() {
		return this.rule;
	}

	public void setRule(List<RuleItem> rule) {
		this.rule = rule;
	}

	public static class RuleItem {

		private String iD;

		private String prefix;

		private String status;

		private Expiration expiration;

		public String getID() {
			return this.iD;
		}

		public void setID(String iD) {
			this.iD = iD;
		}

		public String getPrefix() {
			return this.prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Expiration getExpiration() {
			return this.expiration;
		}

		public void setExpiration(Expiration expiration) {
			this.expiration = expiration;
		}

		public static class Expiration {

			private String days;

			private String createdBeforeDate;

			public String getDays() {
				return this.days;
			}

			public void setDays(String days) {
				this.days = days;
			}

			public String getCreatedBeforeDate() {
				return this.createdBeforeDate;
			}

			public void setCreatedBeforeDate(String createdBeforeDate) {
				this.createdBeforeDate = createdBeforeDate;
			}
		}
	}

	@Override
	public GetBucketLifecycleResponse getInstance(UnmarshallerContext context) {
		return	GetBucketLifecycleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
