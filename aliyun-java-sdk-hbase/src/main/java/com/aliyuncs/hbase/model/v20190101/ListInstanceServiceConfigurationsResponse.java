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
import com.aliyuncs.hbase.transform.v20190101.ListInstanceServiceConfigurationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceServiceConfigurationsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private Long totalRecordCount;

	private List<Config> configureList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Long getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<Config> getConfigureList() {
		return this.configureList;
	}

	public void setConfigureList(List<Config> configureList) {
		this.configureList = configureList;
	}

	public static class Config {

		private String configureName;

		private String defaultValue;

		private String runningValue;

		private String configureUnit;

		private String valueRange;

		private String needRestart;

		private String description;

		public String getConfigureName() {
			return this.configureName;
		}

		public void setConfigureName(String configureName) {
			this.configureName = configureName;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public String getRunningValue() {
			return this.runningValue;
		}

		public void setRunningValue(String runningValue) {
			this.runningValue = runningValue;
		}

		public String getConfigureUnit() {
			return this.configureUnit;
		}

		public void setConfigureUnit(String configureUnit) {
			this.configureUnit = configureUnit;
		}

		public String getValueRange() {
			return this.valueRange;
		}

		public void setValueRange(String valueRange) {
			this.valueRange = valueRange;
		}

		public String getNeedRestart() {
			return this.needRestart;
		}

		public void setNeedRestart(String needRestart) {
			this.needRestart = needRestart;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public ListInstanceServiceConfigurationsResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceServiceConfigurationsResponseUnmarshaller.unmarshall(this, context);
	}
}
