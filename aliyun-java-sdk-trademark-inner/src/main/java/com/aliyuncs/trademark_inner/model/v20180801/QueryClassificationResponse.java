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

package com.aliyuncs.trademark_inner.model.v20180801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark_inner.transform.v20180801.QueryClassificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryClassificationResponse extends AcsResponse {

	private String requestId;

	private List<Classification> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Classification> getData() {
		return this.data;
	}

	public void setData(List<Classification> data) {
		this.data = data;
	}

	public static class Classification {

		private String classificationCode;

		private String classificationName;

		private Integer level;

		private String officialCode;

		private String parentCode;

		private Integer id;

		public String getClassificationCode() {
			return this.classificationCode;
		}

		public void setClassificationCode(String classificationCode) {
			this.classificationCode = classificationCode;
		}

		public String getClassificationName() {
			return this.classificationName;
		}

		public void setClassificationName(String classificationName) {
			this.classificationName = classificationName;
		}

		public Integer getLevel() {
			return this.level;
		}

		public void setLevel(Integer level) {
			this.level = level;
		}

		public String getOfficialCode() {
			return this.officialCode;
		}

		public void setOfficialCode(String officialCode) {
			this.officialCode = officialCode;
		}

		public String getParentCode() {
			return this.parentCode;
		}

		public void setParentCode(String parentCode) {
			this.parentCode = parentCode;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
	}

	@Override
	public QueryClassificationResponse getInstance(UnmarshallerContext context) {
		return	QueryClassificationResponseUnmarshaller.unmarshall(this, context);
	}
}
