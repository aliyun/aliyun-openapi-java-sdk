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
import com.aliyuncs.voicenavigator.transform.v20180612.DescribeAsrVadConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAsrVadConfigResponse extends AcsResponse {

	private String speechNoiseThreshold;

	private String requestId;

	public String getSpeechNoiseThreshold() {
		return this.speechNoiseThreshold;
	}

	public void setSpeechNoiseThreshold(String speechNoiseThreshold) {
		this.speechNoiseThreshold = speechNoiseThreshold;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public DescribeAsrVadConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeAsrVadConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
