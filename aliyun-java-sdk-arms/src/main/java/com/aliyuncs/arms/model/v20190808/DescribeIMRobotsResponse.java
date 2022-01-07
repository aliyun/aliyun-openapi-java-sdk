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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.DescribeIMRobotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIMRobotsResponse extends AcsResponse {

	private String requestId;

	private PageBean pageBean;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageBean getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public static class PageBean {

		private Long total;

		private Long page;

		private Long size;

		private List<IMRobots> alertIMRobots;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public List<IMRobots> getAlertIMRobots() {
			return this.alertIMRobots;
		}

		public void setAlertIMRobots(List<IMRobots> alertIMRobots) {
			this.alertIMRobots = alertIMRobots;
		}

		public static class IMRobots {

			private Float robotId;

			private String type;

			private String robotName;

			private String robotAddr;

			private Boolean dailyNoc;

			private String dailyNocTime;

			public Float getRobotId() {
				return this.robotId;
			}

			public void setRobotId(Float robotId) {
				this.robotId = robotId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getRobotName() {
				return this.robotName;
			}

			public void setRobotName(String robotName) {
				this.robotName = robotName;
			}

			public String getRobotAddr() {
				return this.robotAddr;
			}

			public void setRobotAddr(String robotAddr) {
				this.robotAddr = robotAddr;
			}

			public Boolean getDailyNoc() {
				return this.dailyNoc;
			}

			public void setDailyNoc(Boolean dailyNoc) {
				this.dailyNoc = dailyNoc;
			}

			public String getDailyNocTime() {
				return this.dailyNocTime;
			}

			public void setDailyNocTime(String dailyNocTime) {
				this.dailyNocTime = dailyNocTime;
			}
		}
	}

	@Override
	public DescribeIMRobotsResponse getInstance(UnmarshallerContext context) {
		return	DescribeIMRobotsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
