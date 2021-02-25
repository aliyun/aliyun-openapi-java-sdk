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

package com.aliyuncs.imagerecog.model.v20190930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imagerecog.transform.v20190930.RecognizeFoodResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeFoodResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<TopFivesItem> topFives;

		public List<TopFivesItem> getTopFives() {
			return this.topFives;
		}

		public void setTopFives(List<TopFivesItem> topFives) {
			this.topFives = topFives;
		}

		public static class TopFivesItem {

			private String calorie;

			private Float score;

			private String category;

			public String getCalorie() {
				return this.calorie;
			}

			public void setCalorie(String calorie) {
				this.calorie = calorie;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}
		}
	}

	@Override
	public RecognizeFoodResponse getInstance(UnmarshallerContext context) {
		return	RecognizeFoodResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
