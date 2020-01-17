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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.SignEventActionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SignEventActionResponse extends AcsResponse {

	private String requestId;

	private String eventId;

	private String eventRcpt;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventRcpt() {
		return this.eventRcpt;
	}

	public void setEventRcpt(String eventRcpt) {
		this.eventRcpt = eventRcpt;
	}

	@Override
	public SignEventActionResponse getInstance(UnmarshallerContext context) {
		return	SignEventActionResponseUnmarshaller.unmarshall(this, context);
	}
}
