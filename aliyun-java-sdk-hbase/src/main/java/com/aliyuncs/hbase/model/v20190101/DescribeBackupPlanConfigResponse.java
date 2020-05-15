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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeBackupPlanConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupPlanConfigResponse extends AcsResponse {

	private String requestId;

	private Integer fullBackupCycle;

	private Integer minHFileBackupCount;

	private String nextFullBackupDate;

	private List<String> tables;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getFullBackupCycle() {
		return this.fullBackupCycle;
	}

	public void setFullBackupCycle(Integer fullBackupCycle) {
		this.fullBackupCycle = fullBackupCycle;
	}

	public Integer getMinHFileBackupCount() {
		return this.minHFileBackupCount;
	}

	public void setMinHFileBackupCount(Integer minHFileBackupCount) {
		this.minHFileBackupCount = minHFileBackupCount;
	}

	public String getNextFullBackupDate() {
		return this.nextFullBackupDate;
	}

	public void setNextFullBackupDate(String nextFullBackupDate) {
		this.nextFullBackupDate = nextFullBackupDate;
	}

	public List<String> getTables() {
		return this.tables;
	}

	public void setTables(List<String> tables) {
		this.tables = tables;
	}

	@Override
	public DescribeBackupPlanConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPlanConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
