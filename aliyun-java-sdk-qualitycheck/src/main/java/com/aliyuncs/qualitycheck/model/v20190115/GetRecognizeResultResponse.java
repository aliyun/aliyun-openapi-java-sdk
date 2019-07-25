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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.GetRecognizeResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRecognizeResultResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long taskAsrRequestId;

		private List<Dialogue> dialogues;

		public Long getTaskAsrRequestId() {
			return this.taskAsrRequestId;
		}

		public void setTaskAsrRequestId(Long taskAsrRequestId) {
			this.taskAsrRequestId = taskAsrRequestId;
		}

		public List<Dialogue> getDialogues() {
			return this.dialogues;
		}

		public void setDialogues(List<Dialogue> dialogues) {
			this.dialogues = dialogues;
		}

		public static class Dialogue {

			private Long begin;

			private String beginTime;

			private Integer emotionValue;

			private Long end;

			private String hourMinSec;

			private String identity;

			private String role;

			private Integer silenceDuration;

			private Integer speechRate;

			private String words;

			public Long getBegin() {
				return this.begin;
			}

			public void setBegin(Long begin) {
				this.begin = begin;
			}

			public String getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(String beginTime) {
				this.beginTime = beginTime;
			}

			public Integer getEmotionValue() {
				return this.emotionValue;
			}

			public void setEmotionValue(Integer emotionValue) {
				this.emotionValue = emotionValue;
			}

			public Long getEnd() {
				return this.end;
			}

			public void setEnd(Long end) {
				this.end = end;
			}

			public String getHourMinSec() {
				return this.hourMinSec;
			}

			public void setHourMinSec(String hourMinSec) {
				this.hourMinSec = hourMinSec;
			}

			public String getIdentity() {
				return this.identity;
			}

			public void setIdentity(String identity) {
				this.identity = identity;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public Integer getSilenceDuration() {
				return this.silenceDuration;
			}

			public void setSilenceDuration(Integer silenceDuration) {
				this.silenceDuration = silenceDuration;
			}

			public Integer getSpeechRate() {
				return this.speechRate;
			}

			public void setSpeechRate(Integer speechRate) {
				this.speechRate = speechRate;
			}

			public String getWords() {
				return this.words;
			}

			public void setWords(String words) {
				this.words = words;
			}
		}
	}

	@Override
	public GetRecognizeResultResponse getInstance(UnmarshallerContext context) {
		return	GetRecognizeResultResponseUnmarshaller.unmarshall(this, context);
	}
}
