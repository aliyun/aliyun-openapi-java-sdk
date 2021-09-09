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
import com.aliyuncs.gpdb.transform.v20160503.DescribeDBInstanceSQLPatternsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceSQLPatternsResponse extends AcsResponse {

	private String endTime;

	private String requestId;

	private String startTime;

	private String dBClusterId;

	private List<Pattern> patterns;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<Pattern> getPatterns() {
		return this.patterns;
	}

	public void setPatterns(List<Pattern> patterns) {
		this.patterns = patterns;
	}

	public static class Pattern {

		private String name;

		private Map<Object,Object> values;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Map<Object,Object> getValues() {
			return this.values;
		}

		public void setValues(Map<Object,Object> values) {
			this.values = values;
		}
	}

	@Override
	public DescribeDBInstanceSQLPatternsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceSQLPatternsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
