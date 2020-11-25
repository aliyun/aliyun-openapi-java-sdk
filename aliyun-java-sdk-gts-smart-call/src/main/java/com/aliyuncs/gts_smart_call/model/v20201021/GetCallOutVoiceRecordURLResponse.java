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

package com.aliyuncs.gts_smart_call.model.v20201021;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gts_smart_call.transform.v20201021.GetCallOutVoiceRecordURLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCallOutVoiceRecordURLResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private String dialogueRecordUrl;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDialogueRecordUrl() {
		return this.dialogueRecordUrl;
	}

	public void setDialogueRecordUrl(String dialogueRecordUrl) {
		this.dialogueRecordUrl = dialogueRecordUrl;
	}

	@Override
	public GetCallOutVoiceRecordURLResponse getInstance(UnmarshallerContext context) {
		return	GetCallOutVoiceRecordURLResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
