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

package com.aliyuncs.voicenavigator.model.v20180612;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.voicenavigator.transform.v20180612.DebugAuthorizedResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DebugAuthorizedResponse extends AcsResponse {

	private String requestId;

	private String textResponse;

	private Boolean interruptible;

	private String action;

	private String actionParams;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTextResponse() {
		return this.textResponse;
	}

	public void setTextResponse(String textResponse) {
		this.textResponse = textResponse;
	}

	public Boolean getInterruptible() {
		return this.interruptible;
	}

	public void setInterruptible(Boolean interruptible) {
		this.interruptible = interruptible;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getActionParams() {
		return this.actionParams;
	}

	public void setActionParams(String actionParams) {
		this.actionParams = actionParams;
	}

	@Override
	public DebugAuthorizedResponse getInstance(UnmarshallerContext context) {
		return	DebugAuthorizedResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
