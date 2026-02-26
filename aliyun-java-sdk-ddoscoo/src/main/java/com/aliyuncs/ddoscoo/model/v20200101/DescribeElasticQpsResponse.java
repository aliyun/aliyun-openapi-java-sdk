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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeElasticQpsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeElasticQpsResponse extends AcsResponse {

	private String requestId;

	private List<ElasticQpsItem> elasticQps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ElasticQpsItem> getElasticQps() {
		return this.elasticQps;
	}

	public void setElasticQps(List<ElasticQpsItem> elasticQps) {
		this.elasticQps = elasticQps;
	}

	public static class ElasticQpsItem {

		private Long maxNormalQps;

		private Long index;

		private Long maxQps;

		private Long pv;

		private Long ups;

		private Long status2;

		private Long status3;

		private Long status4;

		private Long status5;

		public Long getMaxNormalQps() {
			return this.maxNormalQps;
		}

		public void setMaxNormalQps(Long maxNormalQps) {
			this.maxNormalQps = maxNormalQps;
		}

		public Long getIndex() {
			return this.index;
		}

		public void setIndex(Long index) {
			this.index = index;
		}

		public Long getMaxQps() {
			return this.maxQps;
		}

		public void setMaxQps(Long maxQps) {
			this.maxQps = maxQps;
		}

		public Long getPv() {
			return this.pv;
		}

		public void setPv(Long pv) {
			this.pv = pv;
		}

		public Long getUps() {
			return this.ups;
		}

		public void setUps(Long ups) {
			this.ups = ups;
		}

		public Long getStatus2() {
			return this.status2;
		}

		public void setStatus2(Long status2) {
			this.status2 = status2;
		}

		public Long getStatus3() {
			return this.status3;
		}

		public void setStatus3(Long status3) {
			this.status3 = status3;
		}

		public Long getStatus4() {
			return this.status4;
		}

		public void setStatus4(Long status4) {
			this.status4 = status4;
		}

		public Long getStatus5() {
			return this.status5;
		}

		public void setStatus5(Long status5) {
			this.status5 = status5;
		}
	}

	@Override
	public DescribeElasticQpsResponse getInstance(UnmarshallerContext context) {
		return	DescribeElasticQpsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
