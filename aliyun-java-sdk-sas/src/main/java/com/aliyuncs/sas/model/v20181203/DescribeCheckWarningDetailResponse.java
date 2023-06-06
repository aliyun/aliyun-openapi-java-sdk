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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeCheckWarningDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCheckWarningDetailResponse extends AcsResponse {

	private String advice;

	private String type;

	private String requestId;

	private String description;

	private String item;

	private Long checkId;

	private String level;

	private String prompt;

	private List<CheckDetailColumn> checkDetailColumns;

	private List<Map<Object,Object>> checkDetailAssetInfo;

	public String getAdvice() {
		return this.advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Long getCheckId() {
		return this.checkId;
	}

	public void setCheckId(Long checkId) {
		this.checkId = checkId;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPrompt() {
		return this.prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public List<CheckDetailColumn> getCheckDetailColumns() {
		return this.checkDetailColumns;
	}

	public void setCheckDetailColumns(List<CheckDetailColumn> checkDetailColumns) {
		this.checkDetailColumns = checkDetailColumns;
	}

	public List<Map<Object,Object>> getCheckDetailAssetInfo() {
		return this.checkDetailAssetInfo;
	}

	public void setCheckDetailAssetInfo(List<Map<Object,Object>> checkDetailAssetInfo) {
		this.checkDetailAssetInfo = checkDetailAssetInfo;
	}

	public static class CheckDetailColumn {

		private String type;

		private String key;

		private String showName;

		private List<Grid> grids;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getShowName() {
			return this.showName;
		}

		public void setShowName(String showName) {
			this.showName = showName;
		}

		public List<Grid> getGrids() {
			return this.grids;
		}

		public void setGrids(List<Grid> grids) {
			this.grids = grids;
		}

		public static class Grid {

			private String type;

			private String key;

			private String showName;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getShowName() {
				return this.showName;
			}

			public void setShowName(String showName) {
				this.showName = showName;
			}
		}
	}

	@Override
	public DescribeCheckWarningDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeCheckWarningDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
