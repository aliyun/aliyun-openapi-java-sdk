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

package com.aliyuncs.idrsservice.model.v20200630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.idrsservice.transform.v20200630.GetDetectEvaluationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDetectEvaluationResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String day;

		private List<EvaluationItemListItem> evaluationItemList;

		public String getDay() {
			return this.day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public List<EvaluationItemListItem> getEvaluationItemList() {
			return this.evaluationItemList;
		}

		public void setEvaluationItemList(List<EvaluationItemListItem> evaluationItemList) {
			this.evaluationItemList = evaluationItemList;
		}

		public static class EvaluationItemListItem {

			private String name;

			private Integer handleCount;

			private Integer successCount;

			private String successRate;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getHandleCount() {
				return this.handleCount;
			}

			public void setHandleCount(Integer handleCount) {
				this.handleCount = handleCount;
			}

			public Integer getSuccessCount() {
				return this.successCount;
			}

			public void setSuccessCount(Integer successCount) {
				this.successCount = successCount;
			}

			public String getSuccessRate() {
				return this.successRate;
			}

			public void setSuccessRate(String successRate) {
				this.successRate = successRate;
			}
		}
	}

	@Override
	public GetDetectEvaluationResponse getInstance(UnmarshallerContext context) {
		return	GetDetectEvaluationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
