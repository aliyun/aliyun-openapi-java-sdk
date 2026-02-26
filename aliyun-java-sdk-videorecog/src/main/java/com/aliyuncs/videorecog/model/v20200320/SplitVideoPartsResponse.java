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

package com.aliyuncs.videorecog.model.v20200320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.videorecog.transform.v20200320.SplitVideoPartsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SplitVideoPartsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ElementsItem> elements;

		private List<SplitVideoPartResultsItem> splitVideoPartResults;

		public List<ElementsItem> getElements() {
			return this.elements;
		}

		public void setElements(List<ElementsItem> elements) {
			this.elements = elements;
		}

		public List<SplitVideoPartResultsItem> getSplitVideoPartResults() {
			return this.splitVideoPartResults;
		}

		public void setSplitVideoPartResults(List<SplitVideoPartResultsItem> splitVideoPartResults) {
			this.splitVideoPartResults = splitVideoPartResults;
		}

		public static class ElementsItem {

			private Float beginTime;

			private Float endTime;

			private Long index;

			public Float getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(Float beginTime) {
				this.beginTime = beginTime;
			}

			public Float getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Float endTime) {
				this.endTime = endTime;
			}

			public Long getIndex() {
				return this.index;
			}

			public void setIndex(Long index) {
				this.index = index;
			}
		}

		public static class SplitVideoPartResultsItem {

			private Float beginTime;

			private Float endTime;

			private String theme;

			private String type;

			private String by;

			public Float getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(Float beginTime) {
				this.beginTime = beginTime;
			}

			public Float getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Float endTime) {
				this.endTime = endTime;
			}

			public String getTheme() {
				return this.theme;
			}

			public void setTheme(String theme) {
				this.theme = theme;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getBy() {
				return this.by;
			}

			public void setBy(String by) {
				this.by = by;
			}
		}
	}

	@Override
	public SplitVideoPartsResponse getInstance(UnmarshallerContext context) {
		return	SplitVideoPartsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
