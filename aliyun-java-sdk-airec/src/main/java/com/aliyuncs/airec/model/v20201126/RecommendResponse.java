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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.RecommendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecommendResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<ResultItem> result;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String itemId;

		private String itemType;

		private String matchInfo;

		private Integer position;

		private String traceId;

		private String traceInfo;

		private Float weight;

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getItemType() {
			return this.itemType;
		}

		public void setItemType(String itemType) {
			this.itemType = itemType;
		}

		public String getMatchInfo() {
			return this.matchInfo;
		}

		public void setMatchInfo(String matchInfo) {
			this.matchInfo = matchInfo;
		}

		public Integer getPosition() {
			return this.position;
		}

		public void setPosition(Integer position) {
			this.position = position;
		}

		public String getTraceId() {
			return this.traceId;
		}

		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}

		public String getTraceInfo() {
			return this.traceInfo;
		}

		public void setTraceInfo(String traceInfo) {
			this.traceInfo = traceInfo;
		}

		public Float getWeight() {
			return this.weight;
		}

		public void setWeight(Float weight) {
			this.weight = weight;
		}
	}

	@Override
	public RecommendResponse getInstance(UnmarshallerContext context) {
		return	RecommendResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
