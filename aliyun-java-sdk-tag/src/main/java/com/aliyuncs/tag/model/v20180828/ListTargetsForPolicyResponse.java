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

package com.aliyuncs.tag.model.v20180828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.tag.transform.v20180828.ListTargetsForPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTargetsForPolicyResponse extends AcsResponse {

	private String requestId;

	private Boolean isRd;

	private String rdId;

	private String nextToken;

	private List<Target> targets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsRd() {
		return this.isRd;
	}

	public void setIsRd(Boolean isRd) {
		this.isRd = isRd;
	}

	public String getRdId() {
		return this.rdId;
	}

	public void setRdId(String rdId) {
		this.rdId = rdId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Target> getTargets() {
		return this.targets;
	}

	public void setTargets(List<Target> targets) {
		this.targets = targets;
	}

	public static class Target {

		private String targetId;

		private Integer targetType;

		public String getTargetId() {
			return this.targetId;
		}

		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}

		public Integer getTargetType() {
			return this.targetType;
		}

		public void setTargetType(Integer targetType) {
			this.targetType = targetType;
		}
	}

	@Override
	public ListTargetsForPolicyResponse getInstance(UnmarshallerContext context) {
		return	ListTargetsForPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
