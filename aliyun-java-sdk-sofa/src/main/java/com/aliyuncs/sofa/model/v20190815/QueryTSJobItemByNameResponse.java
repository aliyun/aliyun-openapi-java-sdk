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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryTSJobItemByNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTSJobItemByNameResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String app;

		private String cron;

		private String des;

		private String failHandleStrategy;

		private String id;

		private String instanceId;

		private String invokeType;

		private Long jobItemId;

		private String misfireStrategy;

		private String name;

		private String routeStrategy;

		private String sofarouterGroup;

		private String timeout;

		private String timeUnit;

		private String timeZone;

		private String triggerMode;

		private String triggerType;

		private String type;

		private String zone;

		private List<String> handlers;

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getCron() {
			return this.cron;
		}

		public void setCron(String cron) {
			this.cron = cron;
		}

		public String getDes() {
			return this.des;
		}

		public void setDes(String des) {
			this.des = des;
		}

		public String getFailHandleStrategy() {
			return this.failHandleStrategy;
		}

		public void setFailHandleStrategy(String failHandleStrategy) {
			this.failHandleStrategy = failHandleStrategy;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInvokeType() {
			return this.invokeType;
		}

		public void setInvokeType(String invokeType) {
			this.invokeType = invokeType;
		}

		public Long getJobItemId() {
			return this.jobItemId;
		}

		public void setJobItemId(Long jobItemId) {
			this.jobItemId = jobItemId;
		}

		public String getMisfireStrategy() {
			return this.misfireStrategy;
		}

		public void setMisfireStrategy(String misfireStrategy) {
			this.misfireStrategy = misfireStrategy;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRouteStrategy() {
			return this.routeStrategy;
		}

		public void setRouteStrategy(String routeStrategy) {
			this.routeStrategy = routeStrategy;
		}

		public String getSofarouterGroup() {
			return this.sofarouterGroup;
		}

		public void setSofarouterGroup(String sofarouterGroup) {
			this.sofarouterGroup = sofarouterGroup;
		}

		public String getTimeout() {
			return this.timeout;
		}

		public void setTimeout(String timeout) {
			this.timeout = timeout;
		}

		public String getTimeUnit() {
			return this.timeUnit;
		}

		public void setTimeUnit(String timeUnit) {
			this.timeUnit = timeUnit;
		}

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public String getTriggerMode() {
			return this.triggerMode;
		}

		public void setTriggerMode(String triggerMode) {
			this.triggerMode = triggerMode;
		}

		public String getTriggerType() {
			return this.triggerType;
		}

		public void setTriggerType(String triggerType) {
			this.triggerType = triggerType;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}

		public List<String> getHandlers() {
			return this.handlers;
		}

		public void setHandlers(List<String> handlers) {
			this.handlers = handlers;
		}
	}

	@Override
	public QueryTSJobItemByNameResponse getInstance(UnmarshallerContext context) {
		return	QueryTSJobItemByNameResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
