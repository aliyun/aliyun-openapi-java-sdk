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

package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamTranscodeStreamNumResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamTranscodeStreamNumResponse extends AcsResponse {

	private String requestId;

	private Long total;

	private Long transcodedNumber;

	private Long untranscodeNumber;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getTranscodedNumber() {
		return this.transcodedNumber;
	}

	public void setTranscodedNumber(Long transcodedNumber) {
		this.transcodedNumber = transcodedNumber;
	}

	public Long getUntranscodeNumber() {
		return this.untranscodeNumber;
	}

	public void setUntranscodeNumber(Long untranscodeNumber) {
		this.untranscodeNumber = untranscodeNumber;
	}

	@Override
	public DescribeLiveStreamTranscodeStreamNumResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamTranscodeStreamNumResponseUnmarshaller.unmarshall(this, context);
	}
}
