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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsSlsDescribeDetailedDashBoardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsSlsDescribeDetailedDashBoardResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private String success;

	private Long pageSize;

	private Long pageNo;

	private Long total;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String dashboardName;

		private String description;

		private String displayName;

		private String attribute;

		private List<Charts> chartList;

		public String getDashboardName() {
			return this.dashboardName;
		}

		public void setDashboardName(String dashboardName) {
			this.dashboardName = dashboardName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getAttribute() {
			return this.attribute;
		}

		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}

		public List<Charts> getChartList() {
			return this.chartList;
		}

		public void setChartList(List<Charts> chartList) {
			this.chartList = chartList;
		}

		public static class Charts {

			private String title;

			private String logstore;

			private String type;

			private String topic;

			private String query;

			private String start;

			private String end;

			private String displayName;

			private String rawSearchAttr;

			private String rawDisplayAttr;

			private String rawActionAttr;

			private Long xPosition;

			private Long yPosition;

			private Long width;

			private Long height;

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getLogstore() {
				return this.logstore;
			}

			public void setLogstore(String logstore) {
				this.logstore = logstore;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public String getQuery() {
				return this.query;
			}

			public void setQuery(String query) {
				this.query = query;
			}

			public String getStart() {
				return this.start;
			}

			public void setStart(String start) {
				this.start = start;
			}

			public String getEnd() {
				return this.end;
			}

			public void setEnd(String end) {
				this.end = end;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getRawSearchAttr() {
				return this.rawSearchAttr;
			}

			public void setRawSearchAttr(String rawSearchAttr) {
				this.rawSearchAttr = rawSearchAttr;
			}

			public String getRawDisplayAttr() {
				return this.rawDisplayAttr;
			}

			public void setRawDisplayAttr(String rawDisplayAttr) {
				this.rawDisplayAttr = rawDisplayAttr;
			}

			public String getRawActionAttr() {
				return this.rawActionAttr;
			}

			public void setRawActionAttr(String rawActionAttr) {
				this.rawActionAttr = rawActionAttr;
			}

			public Long getXPosition() {
				return this.xPosition;
			}

			public void setXPosition(Long xPosition) {
				this.xPosition = xPosition;
			}

			public Long getYPosition() {
				return this.yPosition;
			}

			public void setYPosition(Long yPosition) {
				this.yPosition = yPosition;
			}

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}
		}
	}

	@Override
	public OpsSlsDescribeDetailedDashBoardResponse getInstance(UnmarshallerContext context) {
		return	OpsSlsDescribeDetailedDashBoardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
