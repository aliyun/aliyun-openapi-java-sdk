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

	private String status;

	private String message;

	private String requestId;

	private Integer total;

	private List<Match> matches;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private Double score;

		private Map<Object,Object> metadataV2;

		private Map<Object,Object> metadata;

		private String id;

		private List<Double> values;

		private SparseValues sparseValues;

		public Double getScore() {
			return this.score;
		}

		public void setScore(Double score) {
			this.score = score;
		}

		public Map<Object,Object> getMetadataV2() {
			return this.metadataV2;
		}

		public void setMetadataV2(Map<Object,Object> metadataV2) {
			this.metadataV2 = metadataV2;
		}

		public Map<Object,Object> getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Map<Object,Object> metadata) {
			this.metadata = metadata;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<Double> getValues() {
			return this.values;
		}

		public void setValues(List<Double> values) {
			this.values = values;
		}

		public SparseValues getSparseValues() {
			return this.sparseValues;
		}

		public void setSparseValues(SparseValues sparseValues) {
			this.sparseValues = sparseValues;
		}

		public static class SparseValues {

			private List<Float> values1;

			private List<Integer> indices;

			public List<Float> getValues1() {
				return this.values1;
			}

			public void setValues1(List<Float> values1) {
				this.values1 = values1;
			}

			public List<Integer> getIndices() {
				return this.indices;
			}

			public void setIndices(List<Integer> indices) {
				this.indices = indices;
			}
		}
	}

	@Override
	public QueryCollectionDataResponse getInstance(UnmarshallerContext context) {
		return	QueryCollectionDataResponseUnmarshaller.unmarshall(this, context);
	}
}
