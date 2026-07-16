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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeLimitationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLimitationResponse extends AcsResponse {

	private Integer maxNumberOfScalingInstances;

	private String requestId;

	private Integer maxNumberOfScheduledTasks;

	private Integer maxNumberOfVServerGroups;

	private Integer maxNumberOfLoadBalancers;

	private Integer maxNumberOfAlbServerGroup;

	private Integer maxNumberOfMinSize;

	private Integer maxNumberOfScalingGroups;

	private Integer maxNumberOfNotificationConfigurations;

	private Integer maxNumberOfMaxSize;

	private Integer maxNumberOfDBInstances;

	private Integer maxNumberOfLifecycleHooks;

	private Integer maxNumberOfScalingRules;

	private Integer maxNumberOfNlbServerGroup;

	private Integer maxNumberOfScalingConfigurations;

	public Integer getMaxNumberOfScalingInstances() {
		return this.maxNumberOfScalingInstances;
	}

	public void setMaxNumberOfScalingInstances(Integer maxNumberOfScalingInstances) {
		this.maxNumberOfScalingInstances = maxNumberOfScalingInstances;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxNumberOfScheduledTasks() {
		return this.maxNumberOfScheduledTasks;
	}

	public void setMaxNumberOfScheduledTasks(Integer maxNumberOfScheduledTasks) {
		this.maxNumberOfScheduledTasks = maxNumberOfScheduledTasks;
	}

	public Integer getMaxNumberOfVServerGroups() {
		return this.maxNumberOfVServerGroups;
	}

	public void setMaxNumberOfVServerGroups(Integer maxNumberOfVServerGroups) {
		this.maxNumberOfVServerGroups = maxNumberOfVServerGroups;
	}

	public Integer getMaxNumberOfLoadBalancers() {
		return this.maxNumberOfLoadBalancers;
	}

	public void setMaxNumberOfLoadBalancers(Integer maxNumberOfLoadBalancers) {
		this.maxNumberOfLoadBalancers = maxNumberOfLoadBalancers;
	}

	public Integer getMaxNumberOfAlbServerGroup() {
		return this.maxNumberOfAlbServerGroup;
	}

	public void setMaxNumberOfAlbServerGroup(Integer maxNumberOfAlbServerGroup) {
		this.maxNumberOfAlbServerGroup = maxNumberOfAlbServerGroup;
	}

	public Integer getMaxNumberOfMinSize() {
		return this.maxNumberOfMinSize;
	}

	public void setMaxNumberOfMinSize(Integer maxNumberOfMinSize) {
		this.maxNumberOfMinSize = maxNumberOfMinSize;
	}

	public Integer getMaxNumberOfScalingGroups() {
		return this.maxNumberOfScalingGroups;
	}

	public void setMaxNumberOfScalingGroups(Integer maxNumberOfScalingGroups) {
		this.maxNumberOfScalingGroups = maxNumberOfScalingGroups;
	}

	public Integer getMaxNumberOfNotificationConfigurations() {
		return this.maxNumberOfNotificationConfigurations;
	}

	public void setMaxNumberOfNotificationConfigurations(Integer maxNumberOfNotificationConfigurations) {
		this.maxNumberOfNotificationConfigurations = maxNumberOfNotificationConfigurations;
	}

	public Integer getMaxNumberOfMaxSize() {
		return this.maxNumberOfMaxSize;
	}

	public void setMaxNumberOfMaxSize(Integer maxNumberOfMaxSize) {
		this.maxNumberOfMaxSize = maxNumberOfMaxSize;
	}

	public Integer getMaxNumberOfDBInstances() {
		return this.maxNumberOfDBInstances;
	}

	public void setMaxNumberOfDBInstances(Integer maxNumberOfDBInstances) {
		this.maxNumberOfDBInstances = maxNumberOfDBInstances;
	}

	public Integer getMaxNumberOfLifecycleHooks() {
		return this.maxNumberOfLifecycleHooks;
	}

	public void setMaxNumberOfLifecycleHooks(Integer maxNumberOfLifecycleHooks) {
		this.maxNumberOfLifecycleHooks = maxNumberOfLifecycleHooks;
	}

	public Integer getMaxNumberOfScalingRules() {
		return this.maxNumberOfScalingRules;
	}

	public void setMaxNumberOfScalingRules(Integer maxNumberOfScalingRules) {
		this.maxNumberOfScalingRules = maxNumberOfScalingRules;
	}

	public Integer getMaxNumberOfNlbServerGroup() {
		return this.maxNumberOfNlbServerGroup;
	}

	public void setMaxNumberOfNlbServerGroup(Integer maxNumberOfNlbServerGroup) {
		this.maxNumberOfNlbServerGroup = maxNumberOfNlbServerGroup;
	}

	public Integer getMaxNumberOfScalingConfigurations() {
		return this.maxNumberOfScalingConfigurations;
	}

	public void setMaxNumberOfScalingConfigurations(Integer maxNumberOfScalingConfigurations) {
		this.maxNumberOfScalingConfigurations = maxNumberOfScalingConfigurations;
	}

	@Override
	public DescribeLimitationResponse getInstance(UnmarshallerContext context) {
		return	DescribeLimitationResponseUnmarshaller.unmarshall(this, context);
	}
}
