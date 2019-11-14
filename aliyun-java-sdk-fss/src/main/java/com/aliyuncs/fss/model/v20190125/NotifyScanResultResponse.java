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

package com.aliyuncs.fss.model.v20190125;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.fss.transform.v20190125.NotifyScanResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class NotifyScanResultResponse extends AcsResponse {

	private String requestId;

	private Integer fssCode;

	private String fssMessage;

	private String fssRequestId;

	private String fssData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getFssCode() {
		return this.fssCode;
	}

	public void setFssCode(Integer fssCode) {
		this.fssCode = fssCode;
	}

	public String getFssMessage() {
		return this.fssMessage;
	}

	public void setFssMessage(String fssMessage) {
		this.fssMessage = fssMessage;
	}

	public String getFssRequestId() {
		return this.fssRequestId;
	}

	public void setFssRequestId(String fssRequestId) {
		this.fssRequestId = fssRequestId;
	}

	public String getFssData() {
		return this.fssData;
	}

	public void setFssData(String fssData) {
		this.fssData = fssData;
	}

	@Override
	public NotifyScanResultResponse getInstance(UnmarshallerContext context) {
		return	NotifyScanResultResponseUnmarshaller.unmarshall(this, context);
	}
}
