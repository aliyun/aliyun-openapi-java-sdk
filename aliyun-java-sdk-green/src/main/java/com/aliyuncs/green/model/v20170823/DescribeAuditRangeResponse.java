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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeAuditRangeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAuditRangeResponse extends AcsResponse {

	private String requestId;

	private AuditRange auditRange;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AuditRange getAuditRange() {
		return this.auditRange;
	}

	public void setAuditRange(AuditRange auditRange) {
		this.auditRange = auditRange;
	}

	public static class AuditRange {

		private Boolean block;

		private Boolean review;

		private Boolean pass;

		public Boolean getBlock() {
			return this.block;
		}

		public void setBlock(Boolean block) {
			this.block = block;
		}

		public Boolean getReview() {
			return this.review;
		}

		public void setReview(Boolean review) {
			this.review = review;
		}

		public Boolean getPass() {
			return this.pass;
		}

		public void setPass(Boolean pass) {
			this.pass = pass;
		}
	}

	@Override
	public DescribeAuditRangeResponse getInstance(UnmarshallerContext context) {
		return	DescribeAuditRangeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
