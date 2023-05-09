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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.PageQuerySharedSpeechOpenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PageQuerySharedSpeechOpenResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageSize;

		private Integer pageId;

		private Integer total;

		private List<Data1> resultData;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageId() {
			return this.pageId;
		}

		public void setPageId(Integer pageId) {
			this.pageId = pageId;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<Data1> getResultData() {
			return this.resultData;
		}

		public void setResultData(List<Data1> resultData) {
			this.resultData = resultData;
		}

		public static class Data1 {

			private Integer status;

			private String voice;

			private String bizCode;

			private String code;

			private String text;

			private Integer speechRate;

			private Integer volume;

			private String audioFormat;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getVoice() {
				return this.voice;
			}

			public void setVoice(String voice) {
				this.voice = voice;
			}

			public String getBizCode() {
				return this.bizCode;
			}

			public void setBizCode(String bizCode) {
				this.bizCode = bizCode;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getSpeechRate() {
				return this.speechRate;
			}

			public void setSpeechRate(Integer speechRate) {
				this.speechRate = speechRate;
			}

			public Integer getVolume() {
				return this.volume;
			}

			public void setVolume(Integer volume) {
				this.volume = volume;
			}

			public String getAudioFormat() {
				return this.audioFormat;
			}

			public void setAudioFormat(String audioFormat) {
				this.audioFormat = audioFormat;
			}
		}
	}

	@Override
	public PageQuerySharedSpeechOpenResponse getInstance(UnmarshallerContext context) {
		return	PageQuerySharedSpeechOpenResponseUnmarshaller.unmarshall(this, context);
	}
}
