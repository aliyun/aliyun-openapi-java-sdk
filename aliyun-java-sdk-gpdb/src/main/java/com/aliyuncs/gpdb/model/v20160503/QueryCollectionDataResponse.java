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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.QueryCollectionDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCollectionDataResponse extends AcsResponse {

	private String requestId;

	private String status;

	private String message;

	private Integer total;

	private List<Match> matches;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Match> getMatches() {
		return this.matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	public static class Match {

		private String id;

		private Map<Object,Object> metadata;

		private Double score;

		private List<Double> values;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Map<Object,Object> getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Map<Object,Object> metadata) {
			this.metadata = metadata;
		}

		public Double getScore() {
			return this.score;
		}

		public void setScore(Double score) {
			this.score = score;
		}

		public List<Double> getValues() {
			return this.values;
		}

		public void setValues(List<Double> values) {
			this.values = values;
		}
	}

	@Override
	public QueryCollectionDataResponse getInstance(UnmarshallerContext context) {
		return	QueryCollectionDataResponseUnmarshaller.unmarshall(this, context);
	}
}
