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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppsResponse extends AcsResponse {

	private String requestId;

	private Integer totalNum;

	private Integer totalPage;

	private List<App> appList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public List<App> getAppList() {
		return this.appList;
	}

	public void setAppList(List<App> appList) {
		this.appList = appList;
	}

	public static class App {

		private Integer status;

		private String appId;

		private String appName;

		private String createTime;

		private String appType;

		private String billType;

		private List<String> serviceAreas;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAppType() {
			return this.appType;
		}

		public void setAppType(String appType) {
			this.appType = appType;
		}

		public String getBillType() {
			return this.billType;
		}

		public void setBillType(String billType) {
			this.billType = billType;
		}

		public List<String> getServiceAreas() {
			return this.serviceAreas;
		}

		public void setServiceAreas(List<String> serviceAreas) {
			this.serviceAreas = serviceAreas;
		}
	}

	@Override
	public DescribeAppsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppsResponseUnmarshaller.unmarshall(this, context);
	}
}
