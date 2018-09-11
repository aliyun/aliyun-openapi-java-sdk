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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeSqlTemplatesConsumeAndScanRowsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSqlTemplatesConsumeAndScanRowsResponse extends AcsResponse {

	private String requestId;

	private Integer dBInstanceID;

	private Integer itemsNumbers;

	private String endTime;

	private String startTime;

	private String dBInstanceName;

	private List<Template> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getDBInstanceID() {
		return this.dBInstanceID;
	}

	public void setDBInstanceID(Integer dBInstanceID) {
		this.dBInstanceID = dBInstanceID;
	}

	public Integer getItemsNumbers() {
		return this.itemsNumbers;
	}

	public void setItemsNumbers(Integer itemsNumbers) {
		this.itemsNumbers = itemsNumbers;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public List<Template> getItems() {
		return this.items;
	}

	public void setItems(List<Template> items) {
		this.items = items;
	}

	public static class Template {

		private Float avgConsume;

		private Float avgScanRows;

		private String sqlType;

		public Float getAvgConsume() {
			return this.avgConsume;
		}

		public void setAvgConsume(Float avgConsume) {
			this.avgConsume = avgConsume;
		}

		public Float getAvgScanRows() {
			return this.avgScanRows;
		}

		public void setAvgScanRows(Float avgScanRows) {
			this.avgScanRows = avgScanRows;
		}

		public String getSqlType() {
			return this.sqlType;
		}

		public void setSqlType(String sqlType) {
			this.sqlType = sqlType;
		}
	}

	@Override
	public DescribeSqlTemplatesConsumeAndScanRowsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSqlTemplatesConsumeAndScanRowsResponseUnmarshaller.unmarshall(this, context);
	}
}
