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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.SearchPersonByImgResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchPersonByImgResponse extends AcsResponse {

	private Boolean success;

	private String msg;

	private List<PersonSearchResultItem> personSearchResultItems;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<PersonSearchResultItem> getPersonSearchResultItems() {
		return this.personSearchResultItems;
	}

	public void setPersonSearchResultItems(List<PersonSearchResultItem> personSearchResultItems) {
		this.personSearchResultItems = personSearchResultItems;
	}

	public static class PersonSearchResultItem {

		private String faceId;

		private String ukId;

		private Float score;

		public String getFaceId() {
			return this.faceId;
		}

		public void setFaceId(String faceId) {
			this.faceId = faceId;
		}

		public String getUkId() {
			return this.ukId;
		}

		public void setUkId(String ukId) {
			this.ukId = ukId;
		}

		public Float getScore() {
			return this.score;
		}

		public void setScore(Float score) {
			this.score = score;
		}
	}

	@Override
	public SearchPersonByImgResponse getInstance(UnmarshallerContext context) {
		return	SearchPersonByImgResponseUnmarshaller.unmarshall(this, context);
	}
}
