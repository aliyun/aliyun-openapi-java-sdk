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

package com.aliyuncs.alimt.model.v20181012;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alimt.transform.v20181012.GetDetectLanguageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDetectLanguageResponse extends AcsResponse {

	private String detectedLanguage;

	private String requestId;

	public String getDetectedLanguage() {
		return this.detectedLanguage;
	}

	public void setDetectedLanguage(String detectedLanguage) {
		this.detectedLanguage = detectedLanguage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public GetDetectLanguageResponse getInstance(UnmarshallerContext context) {
		return	GetDetectLanguageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
