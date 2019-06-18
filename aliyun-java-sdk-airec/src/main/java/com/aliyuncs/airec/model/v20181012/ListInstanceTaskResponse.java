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

package com.aliyuncs.airec.model.v20181012;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20181012.ListInstanceTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceTaskResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String name;

		private Integer totalProgress;

		private List<SubProgressInfosItem> subProgressInfos;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getTotalProgress() {
			return this.totalProgress;
		}

		public void setTotalProgress(Integer totalProgress) {
			this.totalProgress = totalProgress;
		}

		public List<SubProgressInfosItem> getSubProgressInfos() {
			return this.subProgressInfos;
		}

		public void setSubProgressInfos(List<SubProgressInfosItem> subProgressInfos) {
			this.subProgressInfos = subProgressInfos;
		}

		public static class SubProgressInfosItem {

			private String type;

			private Integer progress;

			private String detail;

			private Integer totalNum;

			private Integer finishedNum;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Integer getProgress() {
				return this.progress;
			}

			public void setProgress(Integer progress) {
				this.progress = progress;
			}

			public String getDetail() {
				return this.detail;
			}

			public void setDetail(String detail) {
				this.detail = detail;
			}

			public Integer getTotalNum() {
				return this.totalNum;
			}

			public void setTotalNum(Integer totalNum) {
				this.totalNum = totalNum;
			}

			public Integer getFinishedNum() {
				return this.finishedNum;
			}

			public void setFinishedNum(Integer finishedNum) {
				this.finishedNum = finishedNum;
			}
		}
	}

	@Override
	public ListInstanceTaskResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
