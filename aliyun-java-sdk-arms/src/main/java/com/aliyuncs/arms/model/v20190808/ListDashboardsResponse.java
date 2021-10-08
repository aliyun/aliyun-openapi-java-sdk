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
import com.aliyuncs.arms.transform.v20190808.ListDashboardsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDashboardsResponse extends AcsResponse {

	private String requestId;

	private List<DashboardVosItem> dashboardVos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DashboardVosItem> getDashboardVos() {
		return this.dashboardVos;
	}

	public void setDashboardVos(List<DashboardVosItem> dashboardVos) {
		this.dashboardVos = dashboardVos;
	}

	public static class DashboardVosItem {

		private String type;

		private String time;

		private Boolean needUpdate;

		private String kind;

		private String url;

		private String httpsUrl;

		private String dashboardType;

		private String exporter;

		private String version;

		private Boolean isArmsExporter;

		private String httpUrl;

		private String title;

		private String name;

		private String id;

		private String uid;

		private List<String> tags;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Boolean getNeedUpdate() {
			return this.needUpdate;
		}

		public void setNeedUpdate(Boolean needUpdate) {
			this.needUpdate = needUpdate;
		}

		public String getKind() {
			return this.kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getHttpsUrl() {
			return this.httpsUrl;
		}

		public void setHttpsUrl(String httpsUrl) {
			this.httpsUrl = httpsUrl;
		}

		public String getDashboardType() {
			return this.dashboardType;
		}

		public void setDashboardType(String dashboardType) {
			this.dashboardType = dashboardType;
		}

		public String getExporter() {
			return this.exporter;
		}

		public void setExporter(String exporter) {
			this.exporter = exporter;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Boolean getIsArmsExporter() {
			return this.isArmsExporter;
		}

		public void setIsArmsExporter(Boolean isArmsExporter) {
			this.isArmsExporter = isArmsExporter;
		}

		public String getHttpUrl() {
			return this.httpUrl;
		}

		public void setHttpUrl(String httpUrl) {
			this.httpUrl = httpUrl;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public List<String> getTags() {
			return this.tags;
		}

		public void setTags(List<String> tags) {
			this.tags = tags;
		}
	}

	@Override
	public ListDashboardsResponse getInstance(UnmarshallerContext context) {
		return	ListDashboardsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
