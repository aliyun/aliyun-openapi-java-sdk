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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeConstraintInvisibleCauseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeConstraintInvisibleCauseResponse extends AcsResponse {

	private String requestId;

	private Boolean visible;

	private List<String> causeList;

	private List<String> passedRuleList;

	private List<String> failedRuleList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getVisible() {
		return this.visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public List<String> getCauseList() {
		return this.causeList;
	}

	public void setCauseList(List<String> causeList) {
		this.causeList = causeList;
	}

	public List<String> getPassedRuleList() {
		return this.passedRuleList;
	}

	public void setPassedRuleList(List<String> passedRuleList) {
		this.passedRuleList = passedRuleList;
	}

	public List<String> getFailedRuleList() {
		return this.failedRuleList;
	}

	public void setFailedRuleList(List<String> failedRuleList) {
		this.failedRuleList = failedRuleList;
	}

	@Override
	public OpsDescribeConstraintInvisibleCauseResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeConstraintInvisibleCauseResponseUnmarshaller.unmarshall(this, context);
	}
}
