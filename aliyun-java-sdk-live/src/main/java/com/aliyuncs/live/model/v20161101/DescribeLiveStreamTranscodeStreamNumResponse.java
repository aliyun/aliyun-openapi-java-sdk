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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamTranscodeStreamNumResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamTranscodeStreamNumResponse extends AcsResponse {

	private Long untranscodeNumber;

	private Long lazyTranscodedNumber;

	private Long transcodedNumber;

	private String requestId;

	private Long total;

	private List<Transcode_details> transcodeStreamCountDetails;

	public Long getUntranscodeNumber() {
		return this.untranscodeNumber;
	}

	public void setUntranscodeNumber(Long untranscodeNumber) {
		this.untranscodeNumber = untranscodeNumber;
	}

	public Long getLazyTranscodedNumber() {
		return this.lazyTranscodedNumber;
	}

	public void setLazyTranscodedNumber(Long lazyTranscodedNumber) {
		this.lazyTranscodedNumber = lazyTranscodedNumber;
	}

	public Long getTranscodedNumber() {
		return this.transcodedNumber;
	}

	public void setTranscodedNumber(Long transcodedNumber) {
		this.transcodedNumber = transcodedNumber;
	}

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

	public List<Transcode_details> getTranscodeStreamCountDetails() {
		return this.transcodeStreamCountDetails;
	}

	public void setTranscodeStreamCountDetails(List<Transcode_details> transcodeStreamCountDetails) {
		this.transcodeStreamCountDetails = transcodeStreamCountDetails;
	}

	public static class Transcode_details {

		private String template;

		private Integer count;

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeLiveStreamTranscodeStreamNumResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamTranscodeStreamNumResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
