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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddTSJobRequest extends RpcAcsRequest<AddTSJobResponse> {
	   

	private Boolean preAutoTrigger;

	private String routeStrategy;

	private String triggerType;

	private String type;

	private String operator;

	private String des;

	private String misfireStrategy;

	private Boolean exclusive;

	private Long shardingCount;

	private String app;

	private String cron;

	private Long tolerateProcessFailedCount;

	private Long groupId;

	private String priority;

	private String zones;

	private String groupName;

	private Long permitsPerSecond;

	private String triggerMode;

	private Long jobItemId;

	private String instanceId;

	private String invokeType;

	private String jobZone;

	private Long countOfActiveZone;

	private String name;

	private String customParams;

	private String status;

	private String secretKey;

	private Boolean enableForward;

	private String timeZone;

	private Long countOfClient;

	private Long timeout;

	private String zoneMode;

	private Long totalZone;

	private String timeoutStrategy;

	private Long maxExecutingChunks;

	private Long maxExecutingChunksPerClient;

	private Long sleepTime;

	private String gmtCreate;

	private String timeUnit;

	private String failHandleStrategy;

	private Long grayRatio;

	private String handlers;
	public AddTSJobRequest() {
		super("SOFA", "2019-08-15", "AddTSJob", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getPreAutoTrigger() {
		return this.preAutoTrigger;
	}

	public void setPreAutoTrigger(Boolean preAutoTrigger) {
		this.preAutoTrigger = preAutoTrigger;
		if(preAutoTrigger != null){
			putBodyParameter("PreAutoTrigger", preAutoTrigger.toString());
		}
	}

	public String getRouteStrategy() {
		return this.routeStrategy;
	}

	public void setRouteStrategy(String routeStrategy) {
		this.routeStrategy = routeStrategy;
		if(routeStrategy != null){
			putBodyParameter("RouteStrategy", routeStrategy);
		}
	}

	public String getTriggerType() {
		return this.triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
		if(triggerType != null){
			putBodyParameter("TriggerType", triggerType);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
		if(des != null){
			putBodyParameter("Des", des);
		}
	}

	public String getMisfireStrategy() {
		return this.misfireStrategy;
	}

	public void setMisfireStrategy(String misfireStrategy) {
		this.misfireStrategy = misfireStrategy;
		if(misfireStrategy != null){
			putBodyParameter("MisfireStrategy", misfireStrategy);
		}
	}

	public Boolean getExclusive() {
		return this.exclusive;
	}

	public void setExclusive(Boolean exclusive) {
		this.exclusive = exclusive;
		if(exclusive != null){
			putBodyParameter("Exclusive", exclusive.toString());
		}
	}

	public Long getShardingCount() {
		return this.shardingCount;
	}

	public void setShardingCount(Long shardingCount) {
		this.shardingCount = shardingCount;
		if(shardingCount != null){
			putBodyParameter("ShardingCount", shardingCount.toString());
		}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putBodyParameter("App", app);
		}
	}

	public String getCron() {
		return this.cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
		if(cron != null){
			putBodyParameter("Cron", cron);
		}
	}

	public Long getTolerateProcessFailedCount() {
		return this.tolerateProcessFailedCount;
	}

	public void setTolerateProcessFailedCount(Long tolerateProcessFailedCount) {
		this.tolerateProcessFailedCount = tolerateProcessFailedCount;
		if(tolerateProcessFailedCount != null){
			putBodyParameter("TolerateProcessFailedCount", tolerateProcessFailedCount.toString());
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId.toString());
		}
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority);
		}
	}

	public String getZones() {
		return this.zones;
	}

	public void setZones(String zones) {
		this.zones = zones;
		if(zones != null){
			putBodyParameter("Zones", zones);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putBodyParameter("GroupName", groupName);
		}
	}

	public Long getPermitsPerSecond() {
		return this.permitsPerSecond;
	}

	public void setPermitsPerSecond(Long permitsPerSecond) {
		this.permitsPerSecond = permitsPerSecond;
		if(permitsPerSecond != null){
			putBodyParameter("PermitsPerSecond", permitsPerSecond.toString());
		}
	}

	public String getTriggerMode() {
		return this.triggerMode;
	}

	public void setTriggerMode(String triggerMode) {
		this.triggerMode = triggerMode;
		if(triggerMode != null){
			putBodyParameter("TriggerMode", triggerMode);
		}
	}

	public Long getJobItemId() {
		return this.jobItemId;
	}

	public void setJobItemId(Long jobItemId) {
		this.jobItemId = jobItemId;
		if(jobItemId != null){
			putBodyParameter("JobItemId", jobItemId.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getInvokeType() {
		return this.invokeType;
	}

	public void setInvokeType(String invokeType) {
		this.invokeType = invokeType;
		if(invokeType != null){
			putBodyParameter("InvokeType", invokeType);
		}
	}

	public String getJobZone() {
		return this.jobZone;
	}

	public void setJobZone(String jobZone) {
		this.jobZone = jobZone;
		if(jobZone != null){
			putBodyParameter("JobZone", jobZone);
		}
	}

	public Long getCountOfActiveZone() {
		return this.countOfActiveZone;
	}

	public void setCountOfActiveZone(Long countOfActiveZone) {
		this.countOfActiveZone = countOfActiveZone;
		if(countOfActiveZone != null){
			putBodyParameter("CountOfActiveZone", countOfActiveZone.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getCustomParams() {
		return this.customParams;
	}

	public void setCustomParams(String customParams) {
		this.customParams = customParams;
		if(customParams != null){
			putBodyParameter("CustomParams", customParams);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	public String getSecretKey() {
		return this.secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
		if(secretKey != null){
			putBodyParameter("SecretKey", secretKey);
		}
	}

	public Boolean getEnableForward() {
		return this.enableForward;
	}

	public void setEnableForward(Boolean enableForward) {
		this.enableForward = enableForward;
		if(enableForward != null){
			putBodyParameter("EnableForward", enableForward.toString());
		}
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		if(timeZone != null){
			putBodyParameter("TimeZone", timeZone);
		}
	}

	public Long getCountOfClient() {
		return this.countOfClient;
	}

	public void setCountOfClient(Long countOfClient) {
		this.countOfClient = countOfClient;
		if(countOfClient != null){
			putBodyParameter("CountOfClient", countOfClient.toString());
		}
	}

	public Long getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putBodyParameter("Timeout", timeout.toString());
		}
	}

	public String getZoneMode() {
		return this.zoneMode;
	}

	public void setZoneMode(String zoneMode) {
		this.zoneMode = zoneMode;
		if(zoneMode != null){
			putBodyParameter("ZoneMode", zoneMode);
		}
	}

	public Long getTotalZone() {
		return this.totalZone;
	}

	public void setTotalZone(Long totalZone) {
		this.totalZone = totalZone;
		if(totalZone != null){
			putBodyParameter("TotalZone", totalZone.toString());
		}
	}

	public String getTimeoutStrategy() {
		return this.timeoutStrategy;
	}

	public void setTimeoutStrategy(String timeoutStrategy) {
		this.timeoutStrategy = timeoutStrategy;
		if(timeoutStrategy != null){
			putBodyParameter("TimeoutStrategy", timeoutStrategy);
		}
	}

	public Long getMaxExecutingChunks() {
		return this.maxExecutingChunks;
	}

	public void setMaxExecutingChunks(Long maxExecutingChunks) {
		this.maxExecutingChunks = maxExecutingChunks;
		if(maxExecutingChunks != null){
			putBodyParameter("MaxExecutingChunks", maxExecutingChunks.toString());
		}
	}

	public Long getMaxExecutingChunksPerClient() {
		return this.maxExecutingChunksPerClient;
	}

	public void setMaxExecutingChunksPerClient(Long maxExecutingChunksPerClient) {
		this.maxExecutingChunksPerClient = maxExecutingChunksPerClient;
		if(maxExecutingChunksPerClient != null){
			putBodyParameter("MaxExecutingChunksPerClient", maxExecutingChunksPerClient.toString());
		}
	}

	public Long getSleepTime() {
		return this.sleepTime;
	}

	public void setSleepTime(Long sleepTime) {
		this.sleepTime = sleepTime;
		if(sleepTime != null){
			putBodyParameter("SleepTime", sleepTime.toString());
		}
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
		if(gmtCreate != null){
			putBodyParameter("GmtCreate", gmtCreate);
		}
	}

	public String getTimeUnit() {
		return this.timeUnit;
	}

	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
		if(timeUnit != null){
			putBodyParameter("TimeUnit", timeUnit);
		}
	}

	public String getFailHandleStrategy() {
		return this.failHandleStrategy;
	}

	public void setFailHandleStrategy(String failHandleStrategy) {
		this.failHandleStrategy = failHandleStrategy;
		if(failHandleStrategy != null){
			putBodyParameter("FailHandleStrategy", failHandleStrategy);
		}
	}

	public Long getGrayRatio() {
		return this.grayRatio;
	}

	public void setGrayRatio(Long grayRatio) {
		this.grayRatio = grayRatio;
		if(grayRatio != null){
			putBodyParameter("GrayRatio", grayRatio.toString());
		}
	}

	public String getHandlers() {
		return this.handlers;
	}

	public void setHandlers(String handlers) {
		this.handlers = handlers;
		if(handlers != null){
			putBodyParameter("Handlers", handlers);
		}
	}

	@Override
	public Class<AddTSJobResponse> getResponseClass() {
		return AddTSJobResponse.class;
	}

}
