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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.GetHistogramsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHistogramsResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String errCode;

	private String requestId;

	private String dyCode;

	private String dyMessage;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDyCode() {
		return this.dyCode;
	}

	public void setDyCode(String dyCode) {
		this.dyCode = dyCode;
	}

	public String getDyMessage() {
		return this.dyMessage;
	}

	public void setDyMessage(String dyMessage) {
		this.dyMessage = dyMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String server;

		private Long totalCount;

		private List<Histogram> histograms;

		public String getServer() {
			return this.server;
		}

		public void setServer(String server) {
			this.server = server;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<Histogram> getHistograms() {
			return this.histograms;
		}

		public void setHistograms(List<Histogram> histograms) {
			this.histograms = histograms;
		}

		public static class Histogram {

			private Integer from;

			private Integer to;

			private Long count;

			private Boolean completedOrNot;

			public Integer getFrom() {
				return this.from;
			}

			public void setFrom(Integer from) {
				this.from = from;
			}

			public Integer getTo() {
				return this.to;
			}

			public void setTo(Integer to) {
				this.to = to;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}

			public Boolean getCompletedOrNot() {
				return this.completedOrNot;
			}

			public void setCompletedOrNot(Boolean completedOrNot) {
				this.completedOrNot = completedOrNot;
			}
		}
	}

	@Override
	public GetHistogramsResponse getInstance(UnmarshallerContext context) {
		return	GetHistogramsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
