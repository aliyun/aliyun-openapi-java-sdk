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

package com.aliyuncs.ddi.model.v20200617;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddi.transform.v20200617.DescribeFlowJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFlowJobResponse extends AcsResponse {

	private String adhoc;

	private String alertConf;

	private String categoryId;

	private String customVariables;

	private String description;

	private String editLockDetail;

	private String envConf;

	private String failAct;

	private Long gmtCreate;

	private Long gmtModified;

	private String id;

	private String lastInstanceId;

	private Integer maxRetry;

	private Long maxRunningTimeSec;

	private String monitorConf;

	private String name;

	private String paramConf;

	private String params;

	private String requestId;

	private Long retryInterval;

	private String retryPolicy;

	private String runConf;

	private String type;

	private String mode;

	private List<Resource> resourceList;

	public String getAdhoc() {
		return this.adhoc;
	}

	public void setAdhoc(String adhoc) {
		this.adhoc = adhoc;
	}

	public String getAlertConf() {
		return this.alertConf;
	}

	public void setAlertConf(String alertConf) {
		this.alertConf = alertConf;
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCustomVariables() {
		return this.customVariables;
	}

	public void setCustomVariables(String customVariables) {
		this.customVariables = customVariables;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEditLockDetail() {
		return this.editLockDetail;
	}

	public void setEditLockDetail(String editLockDetail) {
		this.editLockDetail = editLockDetail;
	}

	public String getEnvConf() {
		return this.envConf;
	}

	public void setEnvConf(String envConf) {
		this.envConf = envConf;
	}

	public String getFailAct() {
		return this.failAct;
	}

	public void setFailAct(String failAct) {
		this.failAct = failAct;
	}

	public Long getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(Long gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastInstanceId() {
		return this.lastInstanceId;
	}

	public void setLastInstanceId(String lastInstanceId) {
		this.lastInstanceId = lastInstanceId;
	}

	public Integer getMaxRetry() {
		return this.maxRetry;
	}

	public void setMaxRetry(Integer maxRetry) {
		this.maxRetry = maxRetry;
	}

	public Long getMaxRunningTimeSec() {
		return this.maxRunningTimeSec;
	}

	public void setMaxRunningTimeSec(Long maxRunningTimeSec) {
		this.maxRunningTimeSec = maxRunningTimeSec;
	}

	public String getMonitorConf() {
		return this.monitorConf;
	}

	public void setMonitorConf(String monitorConf) {
		this.monitorConf = monitorConf;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParamConf() {
		return this.paramConf;
	}

	public void setParamConf(String paramConf) {
		this.paramConf = paramConf;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getRetryInterval() {
		return this.retryInterval;
	}

	public void setRetryInterval(Long retryInterval) {
		this.retryInterval = retryInterval;
	}

	public String getRetryPolicy() {
		return this.retryPolicy;
	}

	public void setRetryPolicy(String retryPolicy) {
		this.retryPolicy = retryPolicy;
	}

	public String getRunConf() {
		return this.runConf;
	}

	public void setRunConf(String runConf) {
		this.runConf = runConf;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public List<Resource> getResourceList() {
		return this.resourceList;
	}

	public void setResourceList(List<Resource> resourceList) {
		this.resourceList = resourceList;
	}

	public static class Resource {

		private String alias;

		private String path;

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}
	}

	@Override
	public DescribeFlowJobResponse getInstance(UnmarshallerContext context) {
		return	DescribeFlowJobResponseUnmarshaller.unmarshall(this, context);
	}
}
