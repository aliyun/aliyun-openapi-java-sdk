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
import com.aliyuncs.iot.transform.v20180120.QuerySpeechListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySpeechListResponse extends AcsResponse {

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

		private Integer total;

		private Integer pageId;

		private List<Items> list;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageId() {
			return this.pageId;
		}

		public void setPageId(Integer pageId) {
			this.pageId = pageId;
		}

		public List<Items> getList() {
			return this.list;
		}

		public void setList(List<Items> list) {
			this.list = list;
		}

		public static class Items {

			private String voice;

			private String bizCode;

			private String speechCode;

			private String speechType;

			private String text;

			private String audioFormat;

			private List<Items1> speechList;

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

			public String getSpeechCode() {
				return this.speechCode;
			}

			public void setSpeechCode(String speechCode) {
				this.speechCode = speechCode;
			}

			public String getSpeechType() {
				return this.speechType;
			}

			public void setSpeechType(String speechType) {
				this.speechType = speechType;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getAudioFormat() {
				return this.audioFormat;
			}

			public void setAudioFormat(String audioFormat) {
				this.audioFormat = audioFormat;
			}

			public List<Items1> getSpeechList() {
				return this.speechList;
			}

			public void setSpeechList(List<Items1> speechList) {
				this.speechList = speechList;
			}

			public static class Items1 {

				private String text;

				private String voice;

				private String bizCode;

				private String speechCode;

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
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

				public String getSpeechCode() {
					return this.speechCode;
				}

				public void setSpeechCode(String speechCode) {
					this.speechCode = speechCode;
				}
			}
		}
	}

	@Override
	public QuerySpeechListResponse getInstance(UnmarshallerContext context) {
		return	QuerySpeechListResponseUnmarshaller.unmarshall(this, context);
	}
}
